.class public final Lcom/canhub/cropper/CropImageView;
.super Landroid/widget/FrameLayout;
.source "CropImageView.kt"

# interfaces
.implements Lcom/canhub/cropper/CropOverlayView$CropWindowChangeListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/canhub/cropper/CropImageView$Companion;,
        Lcom/canhub/cropper/CropImageView$CropCornerShape;,
        Lcom/canhub/cropper/CropImageView$CropResult;,
        Lcom/canhub/cropper/CropImageView$CropShape;,
        Lcom/canhub/cropper/CropImageView$Guidelines;,
        Lcom/canhub/cropper/CropImageView$OnCropImageCompleteListener;,
        Lcom/canhub/cropper/CropImageView$OnSetCropOverlayMovedListener;,
        Lcom/canhub/cropper/CropImageView$OnSetCropOverlayReleasedListener;,
        Lcom/canhub/cropper/CropImageView$OnSetCropWindowChangeListener;,
        Lcom/canhub/cropper/CropImageView$OnSetImageUriCompleteListener;,
        Lcom/canhub/cropper/CropImageView$RequestSizeOptions;,
        Lcom/canhub/cropper/CropImageView$ScaleType;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCropImageView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CropImageView.kt\ncom/canhub/cropper/CropImageView\n+ 2 ParcelableUtils.kt\ncom/canhub/cropper/ParcelableUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Pair.kt\nandroidx/core/util/PairKt\n*L\n1#1,1896:1\n7#2,5:1897\n7#2,5:1905\n7#2,5:1910\n7#2,5:1915\n7#2,5:1920\n7#2,5:1925\n1#3:1902\n66#4:1903\n78#4:1904\n*S KotlinDebug\n*F\n+ 1 CropImageView.kt\ncom/canhub/cropper/CropImageView\n*L\n1809#1:1897,5\n1134#1:1905,5\n1159#1:1910,5\n1165#1:1915,5\n1171#1:1920,5\n1187#1:1925,5\n1047#1:1903\n1047#1:1904\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00a0\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u0002\n\u0002\u0008 \n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u001f\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008*\u0018\u0000 \u0097\u00022\u00020\u00012\u00020\u0002:\u0018\u008c\u0002\u008d\u0002\u008e\u0002\u008f\u0002\u0090\u0002\u0091\u0002\u0092\u0002\u0093\u0002\u0094\u0002\u0095\u0002\u0096\u0002\u0097\u0002B\u001d\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000e\u0010d\u001a\u00020e2\u0006\u0010f\u001a\u00020\u001dJ\u000e\u0010g\u001a\u00020e2\u0006\u0010h\u001a\u00020\u001dJ\u0016\u0010n\u001a\u00020e2\u0006\u0010o\u001a\u00020\u001a2\u0006\u0010p\u001a\u00020\u001aJ\u0016\u0010q\u001a\u00020e2\u0006\u0010r\u001a\u00020\u001a2\u0006\u0010s\u001a\u00020\u001aJ\u000e\u0010y\u001a\u00020e2\u0006\u0010z\u001a\u00020\u001dJ\u0019\u0010\u008f\u0001\u001a\u00020e2\u0007\u0010\u0090\u0001\u001a\u00020\u001a2\u0007\u0010\u0091\u0001\u001a\u00020\u001aJ\u0011\u0010\u0092\u0001\u001a\u00020e2\u0008\u0010\u0093\u0001\u001a\u00030\u0094\u0001J\u0007\u0010\u0095\u0001\u001a\u00020eJ\u0010\u0010\u0096\u0001\u001a\u00020e2\u0007\u0010\u0097\u0001\u001a\u00020/J\n\u0010\u00bc\u0001\u001a\u0005\u0018\u00010\u00bd\u0001J\u0007\u0010\u00c4\u0001\u001a\u00020eJ-\u0010\u00c9\u0001\u001a\u0004\u0018\u00010\u00182\t\u0008\u0002\u0010\u00ca\u0001\u001a\u00020\u001a2\t\u0008\u0002\u0010\u00cb\u0001\u001a\u00020\u001a2\n\u0008\u0002\u0010\u0093\u0001\u001a\u00030\u00cc\u0001H\u0007JL\u0010\u00cd\u0001\u001a\u00020e2\n\u0008\u0002\u0010\u00ce\u0001\u001a\u00030\u00cf\u00012\t\u0008\u0002\u0010\u00d0\u0001\u001a\u00020\u001a2\t\u0008\u0002\u0010\u00ca\u0001\u001a\u00020\u001a2\t\u0008\u0002\u0010\u00cb\u0001\u001a\u00020\u001a2\n\u0008\u0002\u0010\u0093\u0001\u001a\u00030\u00cc\u00012\n\u0008\u0002\u0010~\u001a\u0004\u0018\u00010?J\u0012\u0010\u00d1\u0001\u001a\u00020e2\t\u0010\u00d2\u0001\u001a\u0004\u0018\u000105J\u0012\u0010\u00d3\u0001\u001a\u00020e2\t\u0010\u00d2\u0001\u001a\u0004\u0018\u000107J\u0012\u0010\u00d4\u0001\u001a\u00020e2\t\u0010\u00d2\u0001\u001a\u0004\u0018\u000109J\u0012\u0010\u00d5\u0001\u001a\u00020e2\t\u0010\u00d2\u0001\u001a\u0004\u0018\u00010;J\u0012\u0010\u00d6\u0001\u001a\u00020e2\t\u0010\u00d2\u0001\u001a\u0004\u0018\u00010=J\u0012\u0010\u00d7\u0001\u001a\u00020e2\t\u0010\u00d8\u0001\u001a\u0004\u0018\u00010\u0018J\u001e\u0010\u00d7\u0001\u001a\u00020e2\t\u0010\u00d8\u0001\u001a\u0004\u0018\u00010\u00182\n\u0010\u00d9\u0001\u001a\u0005\u0018\u00010\u00da\u0001J\u0012\u0010\u00db\u0001\u001a\u00020e2\t\u0010\u00dc\u0001\u001a\u0004\u0018\u00010?J\u0007\u0010\u00dd\u0001\u001a\u00020eJ\u000f\u0010\u00de\u0001\u001a\u00020e2\u0006\u0010t\u001a\u00020\u001aJ\u0007\u0010\u00df\u0001\u001a\u00020eJ\u0007\u0010\u00e0\u0001\u001a\u00020eJ\u0019\u0010\u00e1\u0001\u001a\u00020e2\u0008\u0010\u00e2\u0001\u001a\u00030\u00e3\u0001H\u0000\u00a2\u0006\u0003\u0008\u00e4\u0001J\u0019\u0010\u00e5\u0001\u001a\u00020e2\u0008\u0010\u00e2\u0001\u001a\u00030\u00e6\u0001H\u0000\u00a2\u0006\u0003\u0008\u00e7\u0001J9\u0010\u00e8\u0001\u001a\u00020e2\t\u0010\u00d8\u0001\u001a\u0004\u0018\u00010\u00182\u0007\u0010\u00b0\u0001\u001a\u00020\u001a2\u0008\u0010@\u001a\u0004\u0018\u00010?2\u0007\u0010\u00e9\u0001\u001a\u00020\u001a2\u0007\u0010\u00ea\u0001\u001a\u00020\u001aH\u0002J\t\u0010\u00eb\u0001\u001a\u00020eH\u0002J@\u0010\u00ec\u0001\u001a\u00020e2\u0007\u0010\u00ca\u0001\u001a\u00020\u001a2\u0007\u0010\u00cb\u0001\u001a\u00020\u001a2\u0008\u0010\u0093\u0001\u001a\u00030\u00cc\u00012\u0008\u0010\u00ce\u0001\u001a\u00030\u00cf\u00012\u0007\u0010\u00d0\u0001\u001a\u00020\u001a2\u0008\u0010~\u001a\u0004\u0018\u00010?J\u000c\u0010\u00ed\u0001\u001a\u0005\u0018\u00010\u00ee\u0001H\u0016J\u0013\u0010\u00ef\u0001\u001a\u00020e2\u0008\u0010\u00f0\u0001\u001a\u00030\u00ee\u0001H\u0016J\u001b\u0010\u00f1\u0001\u001a\u00020e2\u0007\u0010\u00f2\u0001\u001a\u00020\u001a2\u0007\u0010\u00f3\u0001\u001a\u00020\u001aH\u0014J6\u0010\u00f4\u0001\u001a\u00020e2\u0007\u0010\u00f5\u0001\u001a\u00020\u001d2\u0007\u0010\u00f6\u0001\u001a\u00020\u001a2\u0007\u0010\u00f7\u0001\u001a\u00020\u001a2\u0007\u0010\u00f8\u0001\u001a\u00020\u001a2\u0007\u0010\u00f9\u0001\u001a\u00020\u001aH\u0014J-\u0010\u00fa\u0001\u001a\u00020e2\u0007\u0010\u00fb\u0001\u001a\u00020\u001a2\u0007\u0010\u00fc\u0001\u001a\u00020\u001a2\u0007\u0010\u00fd\u0001\u001a\u00020\u001a2\u0007\u0010\u00fe\u0001\u001a\u00020\u001aH\u0014J\u001b\u0010\u00ff\u0001\u001a\u00020e2\u0007\u0010\u0080\u0002\u001a\u00020\u001d2\u0007\u0010\u0081\u0002\u001a\u00020\u001dH\u0002J-\u0010\u0082\u0002\u001a\u00020e2\u0007\u0010\u0083\u0002\u001a\u00020/2\u0007\u0010\u0084\u0002\u001a\u00020/2\u0007\u0010\u0085\u0002\u001a\u00020\u001d2\u0007\u0010\u0081\u0002\u001a\u00020\u001dH\u0002J\t\u0010\u0086\u0002\u001a\u00020eH\u0002J\t\u0010\u0087\u0002\u001a\u00020eH\u0002J\t\u0010\u0088\u0002\u001a\u00020eH\u0002J\u0012\u0010\u0089\u0002\u001a\u00020e2\u0007\u0010\u008a\u0002\u001a\u00020\u001dH\u0002J\u0012\u0010\u008b\u0002\u001a\u00020e2\u0007\u0010\u0080\u0002\u001a\u00020\u001dH\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\u0008%\u0010&\u001a\u0004\u0008$\u0010\'\"\u0004\u0008(\u0010)R\u000e\u0010*\u001a\u00020\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020/X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u00104\u001a\u0004\u0018\u000105X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u00106\u001a\u0004\u0018\u000107X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u00108\u001a\u0004\u0018\u000109X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010:\u001a\u0004\u0018\u00010;X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010<\u001a\u0004\u0018\u00010=X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\"\u0010@\u001a\u0004\u0018\u00010?2\u0008\u0010>\u001a\u0004\u0018\u00010?@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008A\u0010BR\u000e\u0010C\u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020/X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020/X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020/X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010G\u001a\u0004\u0018\u00010HX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010K\u001a\n\u0012\u0004\u0012\u00020M\u0018\u00010LX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010N\u001a\n\u0012\u0004\u0012\u00020O\u0018\u00010LX\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010P\u001a\u00020#2\u0006\u0010P\u001a\u00020#8F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008Q\u0010R\"\u0004\u0008S\u0010TR(\u0010U\u001a\u0004\u0018\u00010V2\u0008\u0010U\u001a\u0004\u0018\u00010V8F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008W\u0010X\"\u0004\u0008Y\u0010ZR(\u0010[\u001a\u0004\u0018\u00010\\2\u0008\u0010[\u001a\u0004\u0018\u00010\\8F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008]\u0010^\"\u0004\u0008_\u0010`R$\u0010b\u001a\u00020\u001d2\u0006\u0010a\u001a\u00020\u001d8F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008b\u0010\'\"\u0004\u0008c\u0010)R$\u0010i\u001a\u00020\u001a2\u0006\u0010i\u001a\u00020\u001a8F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008j\u0010k\"\u0004\u0008l\u0010mR$\u0010u\u001a\u00020\u001a2\u0006\u0010t\u001a\u00020\u001a8F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008v\u0010k\"\u0004\u0008w\u0010mR\u0011\u0010x\u001a\u00020\u001d8F\u00a2\u0006\u0006\u001a\u0004\u0008x\u0010\'R$\u0010|\u001a\u00020\u001d2\u0006\u0010{\u001a\u00020\u001d8F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008|\u0010\'\"\u0004\u0008}\u0010)R\u001e\u0010~\u001a\u0004\u0018\u00010?X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0004\u0008\u007f\u0010B\"\u0006\u0008\u0080\u0001\u0010\u0081\u0001R(\u0010\u0083\u0001\u001a\u00020\u001d2\u0007\u0010\u0082\u0001\u001a\u00020\u001d8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\u0008\u0083\u0001\u0010\'\"\u0005\u0008\u0084\u0001\u0010)R0\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0086\u00012\n\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0086\u00018F@FX\u0086\u000e\u00a2\u0006\u0010\u001a\u0006\u0008\u0087\u0001\u0010\u0088\u0001\"\u0006\u0008\u0089\u0001\u0010\u008a\u0001R!\u0010\u008b\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a0\u008c\u00018F\u00a2\u0006\u0008\u001a\u0006\u0008\u008d\u0001\u0010\u008e\u0001R(\u0010\u0099\u0001\u001a\u00020\u001d2\u0007\u0010\u0098\u0001\u001a\u00020\u001d8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\u0008\u0099\u0001\u0010\'\"\u0005\u0008\u009a\u0001\u0010)R(\u0010\u009c\u0001\u001a\u00020\u001d2\u0007\u0010\u009b\u0001\u001a\u00020\u001d8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\u0008\u009c\u0001\u0010\'\"\u0005\u0008\u009d\u0001\u0010)R(\u0010\u009f\u0001\u001a\u00020\u001d2\u0007\u0010\u009e\u0001\u001a\u00020\u001d8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\u0008\u009f\u0001\u0010\'\"\u0005\u0008\u00a0\u0001\u0010)R*\u0010\u00a1\u0001\u001a\u00020-2\u0007\u0010\u00a1\u0001\u001a\u00020-8F@FX\u0086\u000e\u00a2\u0006\u0010\u001a\u0006\u0008\u00a2\u0001\u0010\u00a3\u0001\"\u0006\u0008\u00a4\u0001\u0010\u00a5\u0001R*\u0010\u00a7\u0001\u001a\u00020/2\u0007\u0010\u00a6\u0001\u001a\u00020/8F@FX\u0086\u000e\u00a2\u0006\u0010\u001a\u0006\u0008\u00a8\u0001\u0010\u00a9\u0001\"\u0006\u0008\u00aa\u0001\u0010\u00ab\u0001R(\u0010\u00ac\u0001\u001a\u00020\u001a2\u0007\u0010\u00ac\u0001\u001a\u00020\u001a8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\u0008\u00ad\u0001\u0010k\"\u0005\u0008\u00ae\u0001\u0010mR(\u0010\u00b0\u0001\u001a\u00020\u001a2\u0007\u0010\u00af\u0001\u001a\u00020\u001a8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\u0008\u00b1\u0001\u0010k\"\u0005\u0008\u00b2\u0001\u0010mR\u0017\u0010\u00b3\u0001\u001a\u0005\u0018\u00010\u00b4\u00018F\u00a2\u0006\u0008\u001a\u0006\u0008\u00b5\u0001\u0010\u00b6\u0001R0\u0010\u00b8\u0001\u001a\u0005\u0018\u00010\u00b4\u00012\n\u0010\u00b7\u0001\u001a\u0005\u0018\u00010\u00b4\u00018F@FX\u0086\u000e\u00a2\u0006\u0010\u001a\u0006\u0008\u00b9\u0001\u0010\u00b6\u0001\"\u0006\u0008\u00ba\u0001\u0010\u00bb\u0001R\u0016\u0010\u00be\u0001\u001a\u0004\u0018\u00010H8F\u00a2\u0006\u0008\u001a\u0006\u0008\u00bf\u0001\u0010\u00c0\u0001R\u0014\u0010\u00c1\u0001\u001a\u00020\u00138F\u00a2\u0006\u0008\u001a\u0006\u0008\u00c2\u0001\u0010\u00c3\u0001R \u0010\u00c5\u0001\u001a\u0004\u0018\u00010\u00188GX\u0087\u0004\u00a2\u0006\u000f\u0012\u0005\u0008\u00c6\u0001\u0010&\u001a\u0006\u0008\u00c7\u0001\u0010\u00c8\u0001\u00a8\u0006\u0098\u0002"
    }
    d2 = {
        "Lcom/canhub/cropper/CropImageView;",
        "Landroid/widget/FrameLayout;",
        "Lcom/canhub/cropper/CropOverlayView$CropWindowChangeListener;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "imageView",
        "Landroid/widget/ImageView;",
        "mCropOverlayView",
        "Lcom/canhub/cropper/CropOverlayView;",
        "mImageMatrix",
        "Landroid/graphics/Matrix;",
        "mImageInverseMatrix",
        "mProgressBar",
        "Landroid/widget/ProgressBar;",
        "mImagePoints",
        "",
        "mScaleImagePoints",
        "mAnimation",
        "Lcom/canhub/cropper/CropImageAnimation;",
        "originalBitmap",
        "Landroid/graphics/Bitmap;",
        "mInitialDegreesRotated",
        "",
        "mDegreesRotated",
        "mFlipHorizontally",
        "",
        "mFlipVertically",
        "mLayoutWidth",
        "mLayoutHeight",
        "mImageResource",
        "mScaleType",
        "Lcom/canhub/cropper/CropImageView$ScaleType;",
        "isSaveBitmapToInstanceState",
        "isSaveBitmapToInstanceState$annotations",
        "()V",
        "()Z",
        "setSaveBitmapToInstanceState",
        "(Z)V",
        "mShowCropOverlay",
        "mShowCropLabel",
        "mCropTextLabel",
        "",
        "mCropLabelTextSize",
        "",
        "mCropLabelTextColor",
        "mShowProgressBar",
        "mAutoZoomEnabled",
        "mMaxZoom",
        "mOnCropOverlayReleasedListener",
        "Lcom/canhub/cropper/CropImageView$OnSetCropOverlayReleasedListener;",
        "mOnSetCropOverlayMovedListener",
        "Lcom/canhub/cropper/CropImageView$OnSetCropOverlayMovedListener;",
        "mOnSetCropWindowChangeListener",
        "Lcom/canhub/cropper/CropImageView$OnSetCropWindowChangeListener;",
        "mOnSetImageUriCompleteListener",
        "Lcom/canhub/cropper/CropImageView$OnSetImageUriCompleteListener;",
        "mOnCropImageCompleteListener",
        "Lcom/canhub/cropper/CropImageView$OnCropImageCompleteListener;",
        "value",
        "Landroid/net/Uri;",
        "imageUri",
        "getImageUri",
        "()Landroid/net/Uri;",
        "loadedSampleSize",
        "mZoom",
        "mZoomOffsetX",
        "mZoomOffsetY",
        "mRestoreCropWindowRect",
        "Landroid/graphics/RectF;",
        "mRestoreDegreesRotated",
        "mSizeChanged",
        "bitmapLoadingWorkerJob",
        "Ljava/lang/ref/WeakReference;",
        "Lcom/canhub/cropper/BitmapLoadingWorkerJob;",
        "bitmapCroppingWorkerJob",
        "Lcom/canhub/cropper/BitmapCroppingWorkerJob;",
        "scaleType",
        "getScaleType",
        "()Lcom/canhub/cropper/CropImageView$ScaleType;",
        "setScaleType",
        "(Lcom/canhub/cropper/CropImageView$ScaleType;)V",
        "cropShape",
        "Lcom/canhub/cropper/CropImageView$CropShape;",
        "getCropShape",
        "()Lcom/canhub/cropper/CropImageView$CropShape;",
        "setCropShape",
        "(Lcom/canhub/cropper/CropImageView$CropShape;)V",
        "cornerShape",
        "Lcom/canhub/cropper/CropImageView$CropCornerShape;",
        "getCornerShape",
        "()Lcom/canhub/cropper/CropImageView$CropCornerShape;",
        "setCornerShape",
        "(Lcom/canhub/cropper/CropImageView$CropCornerShape;)V",
        "autoZoomEnabled",
        "isAutoZoomEnabled",
        "setAutoZoomEnabled",
        "setMultiTouchEnabled",
        "",
        "multiTouchEnabled",
        "setCenterMoveEnabled",
        "centerMoveEnabled",
        "maxZoom",
        "getMaxZoom",
        "()I",
        "setMaxZoom",
        "(I)V",
        "setMinCropResultSize",
        "minCropResultWidth",
        "minCropResultHeight",
        "setMaxCropResultSize",
        "maxCropResultWidth",
        "maxCropResultHeight",
        "degrees",
        "rotatedDegrees",
        "getRotatedDegrees",
        "setRotatedDegrees",
        "isFixAspectRatio",
        "setFixedAspectRatio",
        "fixAspectRatio",
        "flipHorizontally",
        "isFlippedHorizontally",
        "setFlippedHorizontally",
        "customOutputUri",
        "getCustomOutputUri",
        "setCustomOutputUri",
        "(Landroid/net/Uri;)V",
        "flipVertically",
        "isFlippedVertically",
        "setFlippedVertically",
        "guidelines",
        "Lcom/canhub/cropper/CropImageView$Guidelines;",
        "getGuidelines",
        "()Lcom/canhub/cropper/CropImageView$Guidelines;",
        "setGuidelines",
        "(Lcom/canhub/cropper/CropImageView$Guidelines;)V",
        "aspectRatio",
        "Landroid/util/Pair;",
        "getAspectRatio",
        "()Landroid/util/Pair;",
        "setAspectRatio",
        "aspectRatioX",
        "aspectRatioY",
        "setImageCropOptions",
        "options",
        "Lcom/canhub/cropper/CropImageOptions;",
        "clearAspectRatio",
        "setSnapRadius",
        "snapRadius",
        "showProgressBar",
        "isShowProgressBar",
        "setShowProgressBar",
        "showCropOverlay",
        "isShowCropOverlay",
        "setShowCropOverlay",
        "showCropLabel",
        "isShowCropLabel",
        "setShowCropLabel",
        "cropLabelText",
        "getCropLabelText",
        "()Ljava/lang/String;",
        "setCropLabelText",
        "(Ljava/lang/String;)V",
        "textSize",
        "cropLabelTextSize",
        "getCropLabelTextSize",
        "()F",
        "setCropLabelTextSize",
        "(F)V",
        "cropLabelTextColor",
        "getCropLabelTextColor",
        "setCropLabelTextColor",
        "resId",
        "imageResource",
        "getImageResource",
        "setImageResource",
        "wholeImageRect",
        "Landroid/graphics/Rect;",
        "getWholeImageRect",
        "()Landroid/graphics/Rect;",
        "rect",
        "cropRect",
        "getCropRect",
        "setCropRect",
        "(Landroid/graphics/Rect;)V",
        "expectedImageSize",
        "Landroid/util/Size;",
        "cropWindowRect",
        "getCropWindowRect",
        "()Landroid/graphics/RectF;",
        "cropPoints",
        "getCropPoints",
        "()[F",
        "resetCropRect",
        "croppedImage",
        "-croppedImage$annotations",
        "-croppedImage",
        "()Landroid/graphics/Bitmap;",
        "getCroppedImage",
        "reqWidth",
        "reqHeight",
        "Lcom/canhub/cropper/CropImageView$RequestSizeOptions;",
        "croppedImageAsync",
        "saveCompressFormat",
        "Landroid/graphics/Bitmap$CompressFormat;",
        "saveCompressQuality",
        "setOnSetCropOverlayReleasedListener",
        "listener",
        "setOnSetCropOverlayMovedListener",
        "setOnCropWindowChangedListener",
        "setOnSetImageUriCompleteListener",
        "setOnCropImageCompleteListener",
        "setImageBitmap",
        "bitmap",
        "exif",
        "Landroidx/exifinterface/media/ExifInterface;",
        "setImageUriAsync",
        "uri",
        "clearImage",
        "rotateImage",
        "flipImageHorizontally",
        "flipImageVertically",
        "onSetImageUriAsyncComplete",
        "result",
        "Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;",
        "onSetImageUriAsyncComplete$cropper_release",
        "onImageCroppingAsyncComplete",
        "Lcom/canhub/cropper/BitmapCroppingWorkerJob$Result;",
        "onImageCroppingAsyncComplete$cropper_release",
        "setBitmap",
        "loadSampleSize",
        "degreesRotated",
        "clearImageInt",
        "startCropWorkerTask",
        "onSaveInstanceState",
        "Landroid/os/Parcelable;",
        "onRestoreInstanceState",
        "state",
        "onMeasure",
        "widthMeasureSpec",
        "heightMeasureSpec",
        "onLayout",
        "changed",
        "l",
        "t",
        "r",
        "b",
        "onSizeChanged",
        "w",
        "h",
        "oldw",
        "oldh",
        "handleCropWindowChanged",
        "inProgress",
        "animate",
        "applyImageMatrix",
        "width",
        "height",
        "center",
        "mapImagePointsByImageMatrix",
        "setCropOverlayVisibility",
        "setProgressBarVisibility",
        "updateImageBounds",
        "clear",
        "onCropWindowChanged",
        "CropShape",
        "CropCornerShape",
        "ScaleType",
        "Guidelines",
        "RequestSizeOptions",
        "OnSetCropOverlayReleasedListener",
        "OnSetCropOverlayMovedListener",
        "OnSetCropWindowChangeListener",
        "OnSetImageUriCompleteListener",
        "OnCropImageCompleteListener",
        "CropResult",
        "Companion",
        "cropper_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lcom/canhub/cropper/CropImageView$Companion;


# instance fields
.field private bitmapCroppingWorkerJob:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/canhub/cropper/BitmapCroppingWorkerJob;",
            ">;"
        }
    .end annotation
.end field

.field private bitmapLoadingWorkerJob:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/canhub/cropper/BitmapLoadingWorkerJob;",
            ">;"
        }
    .end annotation
.end field

.field private customOutputUri:Landroid/net/Uri;

.field private imageUri:Landroid/net/Uri;

.field private final imageView:Landroid/widget/ImageView;

.field private isSaveBitmapToInstanceState:Z

.field private loadedSampleSize:I

.field private mAnimation:Lcom/canhub/cropper/CropImageAnimation;

.field private mAutoZoomEnabled:Z

.field private mCropLabelTextColor:I

.field private mCropLabelTextSize:F

.field private final mCropOverlayView:Lcom/canhub/cropper/CropOverlayView;

.field private mCropTextLabel:Ljava/lang/String;

.field private mDegreesRotated:I

.field private mFlipHorizontally:Z

.field private mFlipVertically:Z

.field private final mImageInverseMatrix:Landroid/graphics/Matrix;

.field private final mImageMatrix:Landroid/graphics/Matrix;

.field private final mImagePoints:[F

.field private mImageResource:I

.field private mInitialDegreesRotated:I

.field private mLayoutHeight:I

.field private mLayoutWidth:I

.field private mMaxZoom:I

.field private mOnCropImageCompleteListener:Lcom/canhub/cropper/CropImageView$OnCropImageCompleteListener;

.field private mOnCropOverlayReleasedListener:Lcom/canhub/cropper/CropImageView$OnSetCropOverlayReleasedListener;

.field private mOnSetCropOverlayMovedListener:Lcom/canhub/cropper/CropImageView$OnSetCropOverlayMovedListener;

.field private mOnSetCropWindowChangeListener:Lcom/canhub/cropper/CropImageView$OnSetCropWindowChangeListener;

.field private mOnSetImageUriCompleteListener:Lcom/canhub/cropper/CropImageView$OnSetImageUriCompleteListener;

.field private final mProgressBar:Landroid/widget/ProgressBar;

.field private mRestoreCropWindowRect:Landroid/graphics/RectF;

.field private mRestoreDegreesRotated:I

.field private final mScaleImagePoints:[F

.field private mScaleType:Lcom/canhub/cropper/CropImageView$ScaleType;

.field private mShowCropLabel:Z

.field private mShowCropOverlay:Z

.field private mShowProgressBar:Z

.field private mSizeChanged:Z

.field private mZoom:F

.field private mZoomOffsetX:F

.field private mZoomOffsetY:F

.field private originalBitmap:Landroid/graphics/Bitmap;


# direct methods
.method public static synthetic -croppedImage$annotations()V
    .locals 0
    .annotation runtime Lkotlin/Deprecated;
        message = "Please use getCroppedImage"
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "getCroppedImage()"
            imports = {}
        .end subannotation
    .end annotation

    return-void
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/canhub/cropper/CropImageView$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/canhub/cropper/CropImageView$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/canhub/cropper/CropImageView;->Companion:Lcom/canhub/cropper/CropImageView$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-direct {p0, p1, v0, v1, v0}, Lcom/canhub/cropper/CropImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 83

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    const-string v3, "context"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    invoke-direct/range {p0 .. p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 52
    new-instance v3, Landroid/graphics/Matrix;

    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    iput-object v3, v1, Lcom/canhub/cropper/CropImageView;->mImageMatrix:Landroid/graphics/Matrix;

    .line 55
    new-instance v3, Landroid/graphics/Matrix;

    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    iput-object v3, v1, Lcom/canhub/cropper/CropImageView;->mImageInverseMatrix:Landroid/graphics/Matrix;

    const/16 v3, 0x8

    .line 61
    new-array v4, v3, [F

    iput-object v4, v1, Lcom/canhub/cropper/CropImageView;->mImagePoints:[F

    .line 64
    new-array v3, v3, [F

    iput-object v3, v1, Lcom/canhub/cropper/CropImageView;->mScaleImagePoints:[F

    const/4 v3, 0x1

    .line 102
    iput-boolean v3, v1, Lcom/canhub/cropper/CropImageView;->mShowCropOverlay:Z

    .line 113
    const-string v4, ""

    iput-object v4, v1, Lcom/canhub/cropper/CropImageView;->mCropTextLabel:Ljava/lang/String;

    const/high16 v4, 0x41a00000    # 20.0f

    .line 119
    iput v4, v1, Lcom/canhub/cropper/CropImageView;->mCropLabelTextSize:F

    const/4 v4, -0x1

    .line 125
    iput v4, v1, Lcom/canhub/cropper/CropImageView;->mCropLabelTextColor:I

    .line 131
    iput-boolean v3, v1, Lcom/canhub/cropper/CropImageView;->mShowProgressBar:Z

    .line 137
    iput-boolean v3, v1, Lcom/canhub/cropper/CropImageView;->mAutoZoomEnabled:Z

    .line 162
    iput v3, v1, Lcom/canhub/cropper/CropImageView;->loadedSampleSize:I

    const/high16 v4, 0x3f800000    # 1.0f

    .line 165
    iput v4, v1, Lcom/canhub/cropper/CropImageView;->mZoom:F

    .line 1809
    instance-of v4, v0, Landroid/app/Activity;

    const/4 v5, 0x0

    if-eqz v4, :cond_0

    move-object v4, v0

    check-cast v4, Landroid/app/Activity;

    goto :goto_0

    :cond_0
    move-object v4, v5

    :goto_0
    if-eqz v4, :cond_2

    invoke-virtual {v4}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    if-eqz v4, :cond_2

    const-string v6, "CROP_IMAGE_EXTRA_BUNDLE"

    invoke-virtual {v4, v6}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v4

    if-eqz v4, :cond_2

    const-string v6, "CROP_IMAGE_EXTRA_OPTIONS"

    .line 1900
    invoke-virtual {v4, v6}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v4

    instance-of v6, v4, Lcom/canhub/cropper/CropImageOptions;

    if-nez v6, :cond_1

    goto :goto_1

    :cond_1
    move-object v5, v4

    :goto_1
    check-cast v5, Lcom/canhub/cropper/CropImageOptions;

    check-cast v5, Landroid/os/Parcelable;

    .line 1809
    check-cast v5, Lcom/canhub/cropper/CropImageOptions;

    if-nez v5, :cond_6

    :cond_2
    if-eqz v2, :cond_5

    .line 1811
    sget-object v4, Lcom/canhub/cropper/R$styleable;->CropImageView:[I

    const/4 v5, 0x0

    invoke-virtual {v0, v2, v4, v5, v5}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v2

    const-string v4, "obtainStyledAttributes(...)"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1812
    new-instance v6, Lcom/canhub/cropper/CropImageOptions;

    const/16 v79, 0x3f

    const/16 v80, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    const/16 v58, 0x0

    const/16 v59, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    const/16 v62, 0x0

    const/16 v63, 0x0

    const/16 v64, 0x0

    const/16 v65, 0x0

    const/16 v66, 0x0

    const/16 v67, 0x0

    const/16 v68, 0x0

    const/16 v69, 0x0

    const/16 v70, 0x0

    const/16 v71, 0x0

    const/16 v72, 0x0

    const/16 v73, 0x0

    const/16 v74, 0x0

    const/16 v75, 0x0

    const/16 v76, 0x0

    const/16 v77, -0x1

    const/16 v78, -0x1

    invoke-direct/range {v6 .. v80}, Lcom/canhub/cropper/CropImageOptions;-><init>(ZZLcom/canhub/cropper/CropImageView$CropShape;Lcom/canhub/cropper/CropImageView$CropCornerShape;FFFLcom/canhub/cropper/CropImageView$Guidelines;Lcom/canhub/cropper/CropImageView$ScaleType;ZZZIZZZZIFZIIFIFFFIIFIIIIIIIILjava/lang/CharSequence;ILjava/lang/Integer;Landroid/net/Uri;Landroid/graphics/Bitmap$CompressFormat;IIILcom/canhub/cropper/CropImageView$RequestSizeOptions;ZLandroid/graphics/Rect;IZZZIZZLjava/lang/CharSequence;IZZLjava/lang/String;Ljava/util/List;FILjava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 1815
    :try_start_0
    sget v4, Lcom/canhub/cropper/R$styleable;->CropImageView_cropSaveBitmapToInstanceState:I

    iget-boolean v7, v1, Lcom/canhub/cropper/CropImageView;->isSaveBitmapToInstanceState:Z

    invoke-virtual {v2, v4, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v4

    iput-boolean v4, v1, Lcom/canhub/cropper/CropImageView;->isSaveBitmapToInstanceState:Z

    .line 1818
    invoke-static {}, Lcom/canhub/cropper/CropImageView$ScaleType;->values()[Lcom/canhub/cropper/CropImageView$ScaleType;

    move-result-object v4

    sget v7, Lcom/canhub/cropper/R$styleable;->CropImageView_cropScaleType:I

    iget-object v8, v6, Lcom/canhub/cropper/CropImageOptions;->scaleType:Lcom/canhub/cropper/CropImageView$ScaleType;

    invoke-virtual {v8}, Lcom/canhub/cropper/CropImageView$ScaleType;->ordinal()I

    move-result v8

    invoke-virtual {v2, v7, v8}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    aget-object v17, v4, v7

    .line 1819
    invoke-static {}, Lcom/canhub/cropper/CropImageView$CropShape;->values()[Lcom/canhub/cropper/CropImageView$CropShape;

    move-result-object v4

    sget v7, Lcom/canhub/cropper/R$styleable;->CropImageView_cropShape:I

    iget-object v8, v6, Lcom/canhub/cropper/CropImageOptions;->cropShape:Lcom/canhub/cropper/CropImageView$CropShape;

    invoke-virtual {v8}, Lcom/canhub/cropper/CropImageView$CropShape;->ordinal()I

    move-result v8

    invoke-virtual {v2, v7, v8}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    aget-object v11, v4, v7

    .line 1820
    invoke-static {}, Lcom/canhub/cropper/CropImageView$CropCornerShape;->values()[Lcom/canhub/cropper/CropImageView$CropCornerShape;

    move-result-object v4

    sget v7, Lcom/canhub/cropper/R$styleable;->CropImageView_cornerShape:I

    iget-object v8, v6, Lcom/canhub/cropper/CropImageOptions;->cornerShape:Lcom/canhub/cropper/CropImageView$CropCornerShape;

    invoke-virtual {v8}, Lcom/canhub/cropper/CropImageView$CropCornerShape;->ordinal()I

    move-result v8

    invoke-virtual {v2, v7, v8}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    aget-object v12, v4, v7

    .line 1821
    invoke-static {}, Lcom/canhub/cropper/CropImageView$Guidelines;->values()[Lcom/canhub/cropper/CropImageView$Guidelines;

    move-result-object v4

    sget v7, Lcom/canhub/cropper/R$styleable;->CropImageView_cropGuidelines:I

    iget-object v8, v6, Lcom/canhub/cropper/CropImageOptions;->guidelines:Lcom/canhub/cropper/CropImageView$Guidelines;

    invoke-virtual {v8}, Lcom/canhub/cropper/CropImageView$Guidelines;->ordinal()I

    move-result v8

    invoke-virtual {v2, v7, v8}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    aget-object v16, v4, v7

    .line 1822
    sget v4, Lcom/canhub/cropper/R$styleable;->CropImageView_cropAspectRatioX:I

    iget v7, v6, Lcom/canhub/cropper/CropImageOptions;->aspectRatioX:I

    invoke-virtual {v2, v4, v7}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v29

    .line 1823
    sget v4, Lcom/canhub/cropper/R$styleable;->CropImageView_cropAspectRatioY:I

    iget v7, v6, Lcom/canhub/cropper/CropImageOptions;->aspectRatioY:I

    invoke-virtual {v2, v4, v7}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v30

    .line 1824
    sget v4, Lcom/canhub/cropper/R$styleable;->CropImageView_cropAutoZoomEnabled:I

    iget-boolean v7, v6, Lcom/canhub/cropper/CropImageOptions;->autoZoomEnabled:Z

    invoke-virtual {v2, v4, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v22

    .line 1825
    sget v4, Lcom/canhub/cropper/R$styleable;->CropImageView_cropMultiTouchEnabled:I

    iget-boolean v7, v6, Lcom/canhub/cropper/CropImageOptions;->multiTouchEnabled:Z

    invoke-virtual {v2, v4, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v23

    .line 1826
    sget v4, Lcom/canhub/cropper/R$styleable;->CropImageView_cropCenterMoveEnabled:I

    iget-boolean v7, v6, Lcom/canhub/cropper/CropImageOptions;->centerMoveEnabled:Z

    invoke-virtual {v2, v4, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v24

    .line 1827
    sget v4, Lcom/canhub/cropper/R$styleable;->CropImageView_cropCornerRadius:I

    iget v7, v6, Lcom/canhub/cropper/CropImageOptions;->cropCornerRadius:F

    invoke-virtual {v2, v4, v7}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v13

    .line 1828
    sget v4, Lcom/canhub/cropper/R$styleable;->CropImageView_cropSnapRadius:I

    iget v7, v6, Lcom/canhub/cropper/CropImageOptions;->snapRadius:F

    invoke-virtual {v2, v4, v7}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v14

    .line 1829
    sget v4, Lcom/canhub/cropper/R$styleable;->CropImageView_cropTouchRadius:I

    iget v7, v6, Lcom/canhub/cropper/CropImageOptions;->touchRadius:F

    invoke-virtual {v2, v4, v7}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v15

    .line 1830
    sget v4, Lcom/canhub/cropper/R$styleable;->CropImageView_cropInitialCropWindowPaddingRatio:I

    iget v7, v6, Lcom/canhub/cropper/CropImageOptions;->initialCropWindowPaddingRatio:F

    invoke-virtual {v2, v4, v7}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v27

    .line 1831
    sget v4, Lcom/canhub/cropper/R$styleable;->CropImageView_cropCornerCircleFillColor:I

    iget v7, v6, Lcom/canhub/cropper/CropImageOptions;->circleCornerFillColorHexValue:I

    invoke-virtual {v2, v4, v7}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v37

    .line 1832
    sget v4, Lcom/canhub/cropper/R$styleable;->CropImageView_cropBorderLineThickness:I

    iget v7, v6, Lcom/canhub/cropper/CropImageOptions;->borderLineThickness:F

    invoke-virtual {v2, v4, v7}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v31

    .line 1833
    sget v4, Lcom/canhub/cropper/R$styleable;->CropImageView_cropBorderLineColor:I

    iget v7, v6, Lcom/canhub/cropper/CropImageOptions;->borderLineColor:I

    invoke-virtual {v2, v4, v7}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v32

    .line 1834
    sget v4, Lcom/canhub/cropper/R$styleable;->CropImageView_cropBorderCornerThickness:I

    iget v7, v6, Lcom/canhub/cropper/CropImageOptions;->borderCornerThickness:F

    invoke-virtual {v2, v4, v7}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v33

    .line 1835
    sget v4, Lcom/canhub/cropper/R$styleable;->CropImageView_cropBorderCornerOffset:I

    iget v7, v6, Lcom/canhub/cropper/CropImageOptions;->borderCornerOffset:F

    invoke-virtual {v2, v4, v7}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v34

    .line 1836
    sget v4, Lcom/canhub/cropper/R$styleable;->CropImageView_cropBorderCornerLength:I

    iget v7, v6, Lcom/canhub/cropper/CropImageOptions;->borderCornerLength:F

    invoke-virtual {v2, v4, v7}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v35

    .line 1837
    sget v4, Lcom/canhub/cropper/R$styleable;->CropImageView_cropBorderCornerColor:I

    iget v7, v6, Lcom/canhub/cropper/CropImageOptions;->borderCornerColor:I

    invoke-virtual {v2, v4, v7}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v36

    .line 1838
    sget v4, Lcom/canhub/cropper/R$styleable;->CropImageView_cropGuidelinesThickness:I

    iget v7, v6, Lcom/canhub/cropper/CropImageOptions;->guidelinesThickness:F

    invoke-virtual {v2, v4, v7}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v38

    .line 1839
    sget v4, Lcom/canhub/cropper/R$styleable;->CropImageView_cropGuidelinesColor:I

    iget v7, v6, Lcom/canhub/cropper/CropImageOptions;->guidelinesColor:I

    invoke-virtual {v2, v4, v7}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v39

    .line 1840
    sget v4, Lcom/canhub/cropper/R$styleable;->CropImageView_cropBackgroundColor:I

    iget v7, v6, Lcom/canhub/cropper/CropImageOptions;->backgroundColor:I

    invoke-virtual {v2, v4, v7}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v40

    .line 1841
    sget v4, Lcom/canhub/cropper/R$styleable;->CropImageView_cropMinCropWindowWidth:I

    iget v7, v6, Lcom/canhub/cropper/CropImageOptions;->minCropWindowWidth:I

    int-to-float v7, v7

    invoke-virtual {v2, v4, v7}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v4

    float-to-int v4, v4

    .line 1842
    sget v7, Lcom/canhub/cropper/R$styleable;->CropImageView_cropMinCropWindowHeight:I

    iget v8, v6, Lcom/canhub/cropper/CropImageOptions;->minCropWindowHeight:I

    int-to-float v8, v8

    invoke-virtual {v2, v7, v8}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v7

    float-to-int v7, v7

    .line 1843
    sget v8, Lcom/canhub/cropper/R$styleable;->CropImageView_cropMinCropResultWidthPX:I

    iget v9, v6, Lcom/canhub/cropper/CropImageOptions;->minCropResultWidth:I

    int-to-float v9, v9

    invoke-virtual {v2, v8, v9}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v8

    float-to-int v8, v8

    .line 1844
    sget v9, Lcom/canhub/cropper/R$styleable;->CropImageView_cropMinCropResultHeightPX:I

    iget v10, v6, Lcom/canhub/cropper/CropImageOptions;->minCropResultHeight:I

    int-to-float v10, v10

    invoke-virtual {v2, v9, v10}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v9

    float-to-int v9, v9

    .line 1845
    sget v10, Lcom/canhub/cropper/R$styleable;->CropImageView_cropMaxCropResultWidthPX:I

    iget v5, v6, Lcom/canhub/cropper/CropImageOptions;->maxCropResultWidth:I

    int-to-float v5, v5

    invoke-virtual {v2, v10, v5}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v5

    float-to-int v5, v5

    .line 1846
    sget v10, Lcom/canhub/cropper/R$styleable;->CropImageView_cropMaxCropResultHeightPX:I

    iget v3, v6, Lcom/canhub/cropper/CropImageOptions;->maxCropResultHeight:I

    int-to-float v3, v3

    invoke-virtual {v2, v10, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    float-to-int v3, v3

    .line 1847
    sget v10, Lcom/canhub/cropper/R$styleable;->CropImageView_cropFlipHorizontally:I

    iget-boolean v0, v6, Lcom/canhub/cropper/CropImageOptions;->flipHorizontally:Z

    invoke-virtual {v2, v10, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v63

    .line 1848
    sget v0, Lcom/canhub/cropper/R$styleable;->CropImageView_cropFlipHorizontally:I

    iget-boolean v10, v6, Lcom/canhub/cropper/CropImageOptions;->flipVertically:Z

    invoke-virtual {v2, v0, v10}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v64

    .line 1849
    sget v0, Lcom/canhub/cropper/R$styleable;->CropImageView_cropperLabelTextSize:I

    iget v10, v6, Lcom/canhub/cropper/CropImageOptions;->cropperLabelTextSize:F

    invoke-virtual {v2, v0, v10}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v71

    .line 1850
    sget v0, Lcom/canhub/cropper/R$styleable;->CropImageView_cropperLabelTextColor:I

    iget v10, v6, Lcom/canhub/cropper/CropImageOptions;->cropperLabelTextColor:I

    invoke-virtual {v2, v0, v10}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v72

    .line 1851
    sget v0, Lcom/canhub/cropper/R$styleable;->CropImageView_cropShowLabel:I

    iget-boolean v10, v6, Lcom/canhub/cropper/CropImageOptions;->showCropLabel:Z

    invoke-virtual {v2, v0, v10}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v19

    .line 1852
    sget v0, Lcom/canhub/cropper/R$styleable;->CropImageView_cropMaxZoom:I

    iget v10, v6, Lcom/canhub/cropper/CropImageOptions;->maxZoom:I

    invoke-virtual {v2, v0, v10}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v26

    .line 1853
    sget v0, Lcom/canhub/cropper/R$styleable;->CropImageView_cropShowCropOverlay:I

    iget-boolean v10, v6, Lcom/canhub/cropper/CropImageOptions;->showCropOverlay:Z

    invoke-virtual {v2, v0, v10}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    .line 1854
    sget v10, Lcom/canhub/cropper/R$styleable;->CropImageView_cropShowProgressBar:I

    move/from16 p2, v0

    iget-boolean v0, v6, Lcom/canhub/cropper/CropImageOptions;->showProgressBar:Z

    invoke-virtual {v2, v10, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v20

    .line 1855
    sget v0, Lcom/canhub/cropper/R$styleable;->CropImageView_cropperLabelText:I

    invoke-virtual {v2, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v73

    .line 1856
    sget v0, Lcom/canhub/cropper/R$styleable;->CropImageView_cropFixAspectRatio:I

    iget-boolean v6, v6, Lcom/canhub/cropper/CropImageOptions;->fixAspectRatio:Z

    invoke-virtual {v2, v0, v6}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    if-nez v0, :cond_4

    sget v0, Lcom/canhub/cropper/R$styleable;->CropImageView_cropAspectRatioX:I

    invoke-virtual {v2, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_3

    sget v0, Lcom/canhub/cropper/R$styleable;->CropImageView_cropAspectRatioX:I

    invoke-virtual {v2, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_2

    :cond_3
    const/16 v28, 0x0

    goto :goto_3

    :cond_4
    :goto_2
    const/16 v28, 0x1

    :goto_3
    move/from16 v43, v8

    .line 1817
    new-instance v8, Lcom/canhub/cropper/CropImageOptions;

    const/16 v81, 0x3e

    const/16 v82, 0x0

    move/from16 v44, v9

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v21, 0x0

    const/16 v25, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    const/16 v58, 0x0

    const/16 v59, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    const/16 v62, 0x0

    const/16 v65, 0x0

    const/16 v66, 0x0

    const/16 v67, 0x0

    const/16 v68, 0x0

    const/16 v69, 0x0

    const/16 v70, 0x0

    const/16 v74, 0x0

    const/16 v75, 0x0

    const/16 v76, 0x0

    const/16 v77, 0x0

    const/16 v78, 0x0

    const v79, 0x11003

    const v80, 0x3f3fffc0    # 0.7499962f

    move/from16 v18, p2

    move/from16 v46, v3

    move/from16 v41, v4

    move/from16 v45, v5

    move/from16 v42, v7

    invoke-direct/range {v8 .. v82}, Lcom/canhub/cropper/CropImageOptions;-><init>(ZZLcom/canhub/cropper/CropImageView$CropShape;Lcom/canhub/cropper/CropImageView$CropCornerShape;FFFLcom/canhub/cropper/CropImageView$Guidelines;Lcom/canhub/cropper/CropImageView$ScaleType;ZZZIZZZZIFZIIFIFFFIIFIIIIIIIILjava/lang/CharSequence;ILjava/lang/Integer;Landroid/net/Uri;Landroid/graphics/Bitmap$CompressFormat;IIILcom/canhub/cropper/CropImageView$RequestSizeOptions;ZLandroid/graphics/Rect;IZZZIZZLjava/lang/CharSequence;IZZLjava/lang/String;Ljava/util/List;FILjava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1859
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    move-object v5, v8

    goto/16 :goto_4

    :catchall_0
    move-exception v0

    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    throw v0

    .line 1862
    :cond_5
    new-instance v3, Lcom/canhub/cropper/CropImageOptions;

    const/16 v76, 0x3f

    const/16 v77, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    const/16 v58, 0x0

    const/16 v59, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    const/16 v62, 0x0

    const/16 v63, 0x0

    const/16 v64, 0x0

    const/16 v65, 0x0

    const/16 v66, 0x0

    const/16 v67, 0x0

    const/16 v68, 0x0

    const/16 v69, 0x0

    const/16 v70, 0x0

    const/16 v71, 0x0

    const/16 v72, 0x0

    const/16 v73, 0x0

    const/16 v74, -0x1

    const/16 v75, -0x1

    invoke-direct/range {v3 .. v77}, Lcom/canhub/cropper/CropImageOptions;-><init>(ZZLcom/canhub/cropper/CropImageView$CropShape;Lcom/canhub/cropper/CropImageView$CropCornerShape;FFFLcom/canhub/cropper/CropImageView$Guidelines;Lcom/canhub/cropper/CropImageView$ScaleType;ZZZIZZZZIFZIIFIFFFIIFIIIIIIIILjava/lang/CharSequence;ILjava/lang/Integer;Landroid/net/Uri;Landroid/graphics/Bitmap$CompressFormat;IIILcom/canhub/cropper/CropImageView$RequestSizeOptions;ZLandroid/graphics/Rect;IZZZIZZLjava/lang/CharSequence;IZZLjava/lang/String;Ljava/util/List;FILjava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v5, v3

    .line 1865
    :cond_6
    :goto_4
    iget-object v0, v5, Lcom/canhub/cropper/CropImageOptions;->scaleType:Lcom/canhub/cropper/CropImageView$ScaleType;

    iput-object v0, v1, Lcom/canhub/cropper/CropImageView;->mScaleType:Lcom/canhub/cropper/CropImageView$ScaleType;

    .line 1866
    iget-boolean v0, v5, Lcom/canhub/cropper/CropImageOptions;->autoZoomEnabled:Z

    iput-boolean v0, v1, Lcom/canhub/cropper/CropImageView;->mAutoZoomEnabled:Z

    .line 1867
    iget v0, v5, Lcom/canhub/cropper/CropImageOptions;->maxZoom:I

    iput v0, v1, Lcom/canhub/cropper/CropImageView;->mMaxZoom:I

    .line 1868
    iget v0, v5, Lcom/canhub/cropper/CropImageOptions;->cropperLabelTextSize:F

    iput v0, v1, Lcom/canhub/cropper/CropImageView;->mCropLabelTextSize:F

    .line 1869
    iget-boolean v0, v5, Lcom/canhub/cropper/CropImageOptions;->showCropLabel:Z

    iput-boolean v0, v1, Lcom/canhub/cropper/CropImageView;->mShowCropLabel:Z

    .line 1870
    iget-boolean v0, v5, Lcom/canhub/cropper/CropImageOptions;->showCropOverlay:Z

    iput-boolean v0, v1, Lcom/canhub/cropper/CropImageView;->mShowCropOverlay:Z

    .line 1871
    iget-boolean v0, v5, Lcom/canhub/cropper/CropImageOptions;->showProgressBar:Z

    iput-boolean v0, v1, Lcom/canhub/cropper/CropImageView;->mShowProgressBar:Z

    .line 1872
    iget-boolean v0, v5, Lcom/canhub/cropper/CropImageOptions;->flipHorizontally:Z

    iput-boolean v0, v1, Lcom/canhub/cropper/CropImageView;->mFlipHorizontally:Z

    .line 1873
    iget-boolean v0, v5, Lcom/canhub/cropper/CropImageOptions;->flipVertically:Z

    iput-boolean v0, v1, Lcom/canhub/cropper/CropImageView;->mFlipVertically:Z

    .line 1874
    invoke-static/range {p1 .. p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 1875
    sget v2, Lcom/canhub/cropper/R$layout;->crop_image_view:I

    move-object v3, v1

    check-cast v3, Landroid/view/ViewGroup;

    const/4 v4, 0x1

    invoke-virtual {v0, v2, v3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    .line 1876
    sget v2, Lcom/canhub/cropper/R$id;->ImageView_image:I

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    iput-object v2, v1, Lcom/canhub/cropper/CropImageView;->imageView:Landroid/widget/ImageView;

    .line 1877
    sget-object v3, Landroid/widget/ImageView$ScaleType;->MATRIX:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 1878
    sget v2, Lcom/canhub/cropper/R$id;->CropOverlayView:I

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/canhub/cropper/CropOverlayView;

    iput-object v2, v1, Lcom/canhub/cropper/CropImageView;->mCropOverlayView:Lcom/canhub/cropper/CropOverlayView;

    .line 1879
    move-object v3, v1

    check-cast v3, Lcom/canhub/cropper/CropOverlayView$CropWindowChangeListener;

    invoke-virtual {v2, v3}, Lcom/canhub/cropper/CropOverlayView;->setCropWindowChangeListener(Lcom/canhub/cropper/CropOverlayView$CropWindowChangeListener;)V

    .line 1880
    invoke-virtual {v2, v5}, Lcom/canhub/cropper/CropOverlayView;->setInitialAttributeValues(Lcom/canhub/cropper/CropImageOptions;)V

    .line 1881
    sget v2, Lcom/canhub/cropper/R$id;->CropProgressBar:I

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, v1, Lcom/canhub/cropper/CropImageView;->mProgressBar:Landroid/widget/ProgressBar;

    .line 1882
    iget v2, v5, Lcom/canhub/cropper/CropImageOptions;->progressBarColor:I

    invoke-static {v2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/ProgressBar;->setIndeterminateTintList(Landroid/content/res/ColorStateList;)V

    .line 1883
    invoke-direct {v1}, Lcom/canhub/cropper/CropImageView;->setProgressBarVisibility()V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 39
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/canhub/cropper/CropImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method private final applyImageMatrix(FFZZ)V
    .locals 9

    .line 1366
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->originalBitmap:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_c

    const/4 v1, 0x0

    cmpl-float v2, p1, v1

    if-lez v2, :cond_c

    cmpl-float v2, p2, v1

    if-lez v2, :cond_c

    .line 1368
    iget-object v2, p0, Lcom/canhub/cropper/CropImageView;->mImageMatrix:Landroid/graphics/Matrix;

    iget-object v3, p0, Lcom/canhub/cropper/CropImageView;->mImageInverseMatrix:Landroid/graphics/Matrix;

    invoke-virtual {v2, v3}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    .line 1369
    iget-object v2, p0, Lcom/canhub/cropper/CropImageView;->mCropOverlayView:Lcom/canhub/cropper/CropOverlayView;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lcom/canhub/cropper/CropOverlayView;->getCropWindowRect()Landroid/graphics/RectF;

    move-result-object v2

    .line 1370
    iget-object v3, p0, Lcom/canhub/cropper/CropImageView;->mImageInverseMatrix:Landroid/graphics/Matrix;

    invoke-virtual {v3, v2}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 1371
    iget-object v3, p0, Lcom/canhub/cropper/CropImageView;->mImageMatrix:Landroid/graphics/Matrix;

    invoke-virtual {v3}, Landroid/graphics/Matrix;->reset()V

    .line 1373
    iget-object v3, p0, Lcom/canhub/cropper/CropImageView;->mImageMatrix:Landroid/graphics/Matrix;

    .line 1374
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    int-to-float v4, v4

    sub-float v4, p1, v4

    const/4 v5, 0x2

    int-to-float v5, v5

    div-float/2addr v4, v5

    .line 1375
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    int-to-float v0, v0

    sub-float v0, p2, v0

    div-float/2addr v0, v5

    .line 1373
    invoke-virtual {v3, v4, v0}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 1377
    invoke-direct {p0}, Lcom/canhub/cropper/CropImageView;->mapImagePointsByImageMatrix()V

    .line 1379
    iget v0, p0, Lcom/canhub/cropper/CropImageView;->mDegreesRotated:I

    if-lez v0, :cond_0

    .line 1380
    iget-object v3, p0, Lcom/canhub/cropper/CropImageView;->mImageMatrix:Landroid/graphics/Matrix;

    int-to-float v0, v0

    .line 1382
    sget-object v4, Lcom/canhub/cropper/BitmapUtils;->INSTANCE:Lcom/canhub/cropper/BitmapUtils;

    iget-object v6, p0, Lcom/canhub/cropper/CropImageView;->mImagePoints:[F

    invoke-virtual {v4, v6}, Lcom/canhub/cropper/BitmapUtils;->getRectCenterX([F)F

    move-result v4

    .line 1383
    sget-object v6, Lcom/canhub/cropper/BitmapUtils;->INSTANCE:Lcom/canhub/cropper/BitmapUtils;

    iget-object v7, p0, Lcom/canhub/cropper/CropImageView;->mImagePoints:[F

    invoke-virtual {v6, v7}, Lcom/canhub/cropper/BitmapUtils;->getRectCenterY([F)F

    move-result v6

    .line 1380
    invoke-virtual {v3, v0, v4, v6}, Landroid/graphics/Matrix;->postRotate(FFF)Z

    .line 1385
    invoke-direct {p0}, Lcom/canhub/cropper/CropImageView;->mapImagePointsByImageMatrix()V

    .line 1389
    :cond_0
    sget-object v0, Lcom/canhub/cropper/BitmapUtils;->INSTANCE:Lcom/canhub/cropper/BitmapUtils;

    iget-object v3, p0, Lcom/canhub/cropper/CropImageView;->mImagePoints:[F

    invoke-virtual {v0, v3}, Lcom/canhub/cropper/BitmapUtils;->getRectWidth([F)F

    move-result v0

    div-float v0, p1, v0

    .line 1390
    sget-object v3, Lcom/canhub/cropper/BitmapUtils;->INSTANCE:Lcom/canhub/cropper/BitmapUtils;

    iget-object v4, p0, Lcom/canhub/cropper/CropImageView;->mImagePoints:[F

    invoke-virtual {v3, v4}, Lcom/canhub/cropper/BitmapUtils;->getRectHeight([F)F

    move-result v3

    div-float v3, p2, v3

    invoke-static {v0, v3}, Ljava/lang/Math;->min(FF)F

    move-result v0

    .line 1392
    iget-object v3, p0, Lcom/canhub/cropper/CropImageView;->mScaleType:Lcom/canhub/cropper/CropImageView$ScaleType;

    sget-object v4, Lcom/canhub/cropper/CropImageView$ScaleType;->FIT_CENTER:Lcom/canhub/cropper/CropImageView$ScaleType;

    if-eq v3, v4, :cond_3

    iget-object v3, p0, Lcom/canhub/cropper/CropImageView;->mScaleType:Lcom/canhub/cropper/CropImageView$ScaleType;

    sget-object v4, Lcom/canhub/cropper/CropImageView$ScaleType;->CENTER_INSIDE:Lcom/canhub/cropper/CropImageView$ScaleType;

    const/high16 v6, 0x3f800000    # 1.0f

    if-ne v3, v4, :cond_1

    cmpg-float v3, v0, v6

    if-ltz v3, :cond_3

    :cond_1
    cmpl-float v3, v0, v6

    if-lez v3, :cond_2

    .line 1393
    iget-boolean v3, p0, Lcom/canhub/cropper/CropImageView;->mAutoZoomEnabled:Z

    if-eqz v3, :cond_2

    goto :goto_0

    .line 1402
    :cond_2
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->mScaleType:Lcom/canhub/cropper/CropImageView$ScaleType;

    sget-object v3, Lcom/canhub/cropper/CropImageView$ScaleType;->CENTER_CROP:Lcom/canhub/cropper/CropImageView$ScaleType;

    if-ne v0, v3, :cond_4

    .line 1404
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView;->getWidth()I

    move-result v0

    int-to-float v0, v0

    sget-object v3, Lcom/canhub/cropper/BitmapUtils;->INSTANCE:Lcom/canhub/cropper/BitmapUtils;

    iget-object v4, p0, Lcom/canhub/cropper/CropImageView;->mImagePoints:[F

    invoke-virtual {v3, v4}, Lcom/canhub/cropper/BitmapUtils;->getRectWidth([F)F

    move-result v3

    div-float/2addr v0, v3

    .line 1405
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView;->getHeight()I

    move-result v3

    int-to-float v3, v3

    sget-object v4, Lcom/canhub/cropper/BitmapUtils;->INSTANCE:Lcom/canhub/cropper/BitmapUtils;

    iget-object v6, p0, Lcom/canhub/cropper/CropImageView;->mImagePoints:[F

    invoke-virtual {v4, v6}, Lcom/canhub/cropper/BitmapUtils;->getRectHeight([F)F

    move-result v4

    div-float/2addr v3, v4

    invoke-static {v0, v3}, Ljava/lang/Math;->max(FF)F

    move-result v0

    .line 1403
    iput v0, p0, Lcom/canhub/cropper/CropImageView;->mZoom:F

    goto :goto_1

    .line 1395
    :cond_3
    :goto_0
    iget-object v3, p0, Lcom/canhub/cropper/CropImageView;->mImageMatrix:Landroid/graphics/Matrix;

    .line 1398
    sget-object v4, Lcom/canhub/cropper/BitmapUtils;->INSTANCE:Lcom/canhub/cropper/BitmapUtils;

    iget-object v6, p0, Lcom/canhub/cropper/CropImageView;->mImagePoints:[F

    invoke-virtual {v4, v6}, Lcom/canhub/cropper/BitmapUtils;->getRectCenterX([F)F

    move-result v4

    .line 1399
    sget-object v6, Lcom/canhub/cropper/BitmapUtils;->INSTANCE:Lcom/canhub/cropper/BitmapUtils;

    iget-object v7, p0, Lcom/canhub/cropper/CropImageView;->mImagePoints:[F

    invoke-virtual {v6, v7}, Lcom/canhub/cropper/BitmapUtils;->getRectCenterY([F)F

    move-result v6

    .line 1395
    invoke-virtual {v3, v0, v0, v4, v6}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 1401
    invoke-direct {p0}, Lcom/canhub/cropper/CropImageView;->mapImagePointsByImageMatrix()V

    .line 1409
    :cond_4
    :goto_1
    iget-boolean v0, p0, Lcom/canhub/cropper/CropImageView;->mFlipHorizontally:Z

    if-eqz v0, :cond_5

    iget v0, p0, Lcom/canhub/cropper/CropImageView;->mZoom:F

    neg-float v0, v0

    goto :goto_2

    :cond_5
    iget v0, p0, Lcom/canhub/cropper/CropImageView;->mZoom:F

    .line 1410
    :goto_2
    iget-boolean v3, p0, Lcom/canhub/cropper/CropImageView;->mFlipVertically:Z

    if-eqz v3, :cond_6

    iget v3, p0, Lcom/canhub/cropper/CropImageView;->mZoom:F

    neg-float v3, v3

    goto :goto_3

    :cond_6
    iget v3, p0, Lcom/canhub/cropper/CropImageView;->mZoom:F

    .line 1411
    :goto_3
    iget-object v4, p0, Lcom/canhub/cropper/CropImageView;->mImageMatrix:Landroid/graphics/Matrix;

    .line 1414
    sget-object v6, Lcom/canhub/cropper/BitmapUtils;->INSTANCE:Lcom/canhub/cropper/BitmapUtils;

    iget-object v7, p0, Lcom/canhub/cropper/CropImageView;->mImagePoints:[F

    invoke-virtual {v6, v7}, Lcom/canhub/cropper/BitmapUtils;->getRectCenterX([F)F

    move-result v6

    .line 1415
    sget-object v7, Lcom/canhub/cropper/BitmapUtils;->INSTANCE:Lcom/canhub/cropper/BitmapUtils;

    iget-object v8, p0, Lcom/canhub/cropper/CropImageView;->mImagePoints:[F

    invoke-virtual {v7, v8}, Lcom/canhub/cropper/BitmapUtils;->getRectCenterY([F)F

    move-result v7

    .line 1411
    invoke-virtual {v4, v0, v3, v6, v7}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 1417
    invoke-direct {p0}, Lcom/canhub/cropper/CropImageView;->mapImagePointsByImageMatrix()V

    .line 1418
    iget-object v4, p0, Lcom/canhub/cropper/CropImageView;->mImageMatrix:Landroid/graphics/Matrix;

    invoke-virtual {v4, v2}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 1420
    iget-object v4, p0, Lcom/canhub/cropper/CropImageView;->mScaleType:Lcom/canhub/cropper/CropImageView$ScaleType;

    sget-object v6, Lcom/canhub/cropper/CropImageView$ScaleType;->CENTER_CROP:Lcom/canhub/cropper/CropImageView$ScaleType;

    if-ne v4, v6, :cond_7

    if-eqz p3, :cond_7

    if-nez p4, :cond_7

    .line 1421
    iput v1, p0, Lcom/canhub/cropper/CropImageView;->mZoomOffsetX:F

    .line 1422
    iput v1, p0, Lcom/canhub/cropper/CropImageView;->mZoomOffsetY:F

    goto/16 :goto_6

    :cond_7
    if-eqz p3, :cond_a

    .line 1426
    sget-object p3, Lcom/canhub/cropper/BitmapUtils;->INSTANCE:Lcom/canhub/cropper/BitmapUtils;

    iget-object v4, p0, Lcom/canhub/cropper/CropImageView;->mImagePoints:[F

    invoke-virtual {p3, v4}, Lcom/canhub/cropper/BitmapUtils;->getRectWidth([F)F

    move-result p3

    cmpl-float p3, p1, p3

    if-lez p3, :cond_8

    move p1, v1

    goto :goto_4

    :cond_8
    div-float/2addr p1, v5

    .line 1431
    invoke-virtual {v2}, Landroid/graphics/RectF;->centerX()F

    move-result p3

    sub-float/2addr p1, p3

    .line 1432
    sget-object p3, Lcom/canhub/cropper/BitmapUtils;->INSTANCE:Lcom/canhub/cropper/BitmapUtils;

    iget-object v4, p0, Lcom/canhub/cropper/CropImageView;->mImagePoints:[F

    invoke-virtual {p3, v4}, Lcom/canhub/cropper/BitmapUtils;->getRectLeft([F)F

    move-result p3

    neg-float p3, p3

    invoke-static {p1, p3}, Ljava/lang/Math;->min(FF)F

    move-result p1

    .line 1434
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView;->getWidth()I

    move-result p3

    int-to-float p3, p3

    sget-object v4, Lcom/canhub/cropper/BitmapUtils;->INSTANCE:Lcom/canhub/cropper/BitmapUtils;

    iget-object v6, p0, Lcom/canhub/cropper/CropImageView;->mImagePoints:[F

    invoke-virtual {v4, v6}, Lcom/canhub/cropper/BitmapUtils;->getRectRight([F)F

    move-result v4

    sub-float/2addr p3, v4

    invoke-static {p1, p3}, Ljava/lang/Math;->max(FF)F

    move-result p1

    div-float/2addr p1, v0

    .line 1425
    :goto_4
    iput p1, p0, Lcom/canhub/cropper/CropImageView;->mZoomOffsetX:F

    .line 1439
    sget-object p1, Lcom/canhub/cropper/BitmapUtils;->INSTANCE:Lcom/canhub/cropper/BitmapUtils;

    iget-object p3, p0, Lcom/canhub/cropper/CropImageView;->mImagePoints:[F

    invoke-virtual {p1, p3}, Lcom/canhub/cropper/BitmapUtils;->getRectHeight([F)F

    move-result p1

    cmpl-float p1, p2, p1

    if-lez p1, :cond_9

    goto :goto_5

    :cond_9
    div-float/2addr p2, v5

    .line 1444
    invoke-virtual {v2}, Landroid/graphics/RectF;->centerY()F

    move-result p1

    sub-float/2addr p2, p1

    .line 1445
    sget-object p1, Lcom/canhub/cropper/BitmapUtils;->INSTANCE:Lcom/canhub/cropper/BitmapUtils;

    iget-object p3, p0, Lcom/canhub/cropper/CropImageView;->mImagePoints:[F

    invoke-virtual {p1, p3}, Lcom/canhub/cropper/BitmapUtils;->getRectTop([F)F

    move-result p1

    neg-float p1, p1

    invoke-static {p2, p1}, Ljava/lang/Math;->min(FF)F

    move-result p1

    .line 1447
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView;->getHeight()I

    move-result p2

    int-to-float p2, p2

    sget-object p3, Lcom/canhub/cropper/BitmapUtils;->INSTANCE:Lcom/canhub/cropper/BitmapUtils;

    iget-object v1, p0, Lcom/canhub/cropper/CropImageView;->mImagePoints:[F

    invoke-virtual {p3, v1}, Lcom/canhub/cropper/BitmapUtils;->getRectBottom([F)F

    move-result p3

    sub-float/2addr p2, p3

    invoke-static {p1, p2}, Ljava/lang/Math;->max(FF)F

    move-result p1

    div-float v1, p1, v3

    .line 1438
    :goto_5
    iput v1, p0, Lcom/canhub/cropper/CropImageView;->mZoomOffsetY:F

    goto :goto_6

    .line 1455
    :cond_a
    iget p3, p0, Lcom/canhub/cropper/CropImageView;->mZoomOffsetX:F

    mul-float/2addr p3, v0

    iget v1, v2, Landroid/graphics/RectF;->left:F

    neg-float v1, v1

    invoke-static {p3, v1}, Ljava/lang/Math;->max(FF)F

    move-result p3

    .line 1456
    iget v1, v2, Landroid/graphics/RectF;->right:F

    neg-float v1, v1

    add-float/2addr v1, p1

    invoke-static {p3, v1}, Ljava/lang/Math;->min(FF)F

    move-result p1

    div-float/2addr p1, v0

    .line 1453
    iput p1, p0, Lcom/canhub/cropper/CropImageView;->mZoomOffsetX:F

    .line 1462
    iget p1, p0, Lcom/canhub/cropper/CropImageView;->mZoomOffsetY:F

    mul-float/2addr p1, v3

    iget p3, v2, Landroid/graphics/RectF;->top:F

    neg-float p3, p3

    invoke-static {p1, p3}, Ljava/lang/Math;->max(FF)F

    move-result p1

    .line 1463
    iget p3, v2, Landroid/graphics/RectF;->bottom:F

    neg-float p3, p3

    add-float/2addr p3, p2

    invoke-static {p1, p3}, Ljava/lang/Math;->min(FF)F

    move-result p1

    div-float/2addr p1, v3

    .line 1460
    iput p1, p0, Lcom/canhub/cropper/CropImageView;->mZoomOffsetY:F

    .line 1468
    :goto_6
    iget-object p1, p0, Lcom/canhub/cropper/CropImageView;->mImageMatrix:Landroid/graphics/Matrix;

    iget p2, p0, Lcom/canhub/cropper/CropImageView;->mZoomOffsetX:F

    mul-float/2addr p2, v0

    iget p3, p0, Lcom/canhub/cropper/CropImageView;->mZoomOffsetY:F

    mul-float/2addr p3, v3

    invoke-virtual {p1, p2, p3}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 1469
    iget p1, p0, Lcom/canhub/cropper/CropImageView;->mZoomOffsetX:F

    mul-float/2addr p1, v0

    iget p2, p0, Lcom/canhub/cropper/CropImageView;->mZoomOffsetY:F

    mul-float/2addr p2, v3

    invoke-virtual {v2, p1, p2}, Landroid/graphics/RectF;->offset(FF)V

    .line 1470
    iget-object p1, p0, Lcom/canhub/cropper/CropImageView;->mCropOverlayView:Lcom/canhub/cropper/CropOverlayView;

    invoke-virtual {p1, v2}, Lcom/canhub/cropper/CropOverlayView;->setCropWindowRect(Landroid/graphics/RectF;)V

    .line 1471
    invoke-direct {p0}, Lcom/canhub/cropper/CropImageView;->mapImagePointsByImageMatrix()V

    .line 1472
    iget-object p1, p0, Lcom/canhub/cropper/CropImageView;->mCropOverlayView:Lcom/canhub/cropper/CropOverlayView;

    invoke-virtual {p1}, Lcom/canhub/cropper/CropOverlayView;->invalidate()V

    if-eqz p4, :cond_b

    .line 1476
    iget-object p1, p0, Lcom/canhub/cropper/CropImageView;->mAnimation:Lcom/canhub/cropper/CropImageAnimation;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object p2, p0, Lcom/canhub/cropper/CropImageView;->mImagePoints:[F

    iget-object p3, p0, Lcom/canhub/cropper/CropImageView;->mImageMatrix:Landroid/graphics/Matrix;

    invoke-virtual {p1, p2, p3}, Lcom/canhub/cropper/CropImageAnimation;->setEndState([FLandroid/graphics/Matrix;)V

    .line 1477
    iget-object p1, p0, Lcom/canhub/cropper/CropImageView;->imageView:Landroid/widget/ImageView;

    iget-object p2, p0, Lcom/canhub/cropper/CropImageView;->mAnimation:Lcom/canhub/cropper/CropImageAnimation;

    check-cast p2, Landroid/view/animation/Animation;

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    goto :goto_7

    .line 1479
    :cond_b
    iget-object p1, p0, Lcom/canhub/cropper/CropImageView;->imageView:Landroid/widget/ImageView;

    iget-object p2, p0, Lcom/canhub/cropper/CropImageView;->mImageMatrix:Landroid/graphics/Matrix;

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageMatrix(Landroid/graphics/Matrix;)V

    :goto_7
    const/4 p1, 0x0

    .line 1482
    invoke-direct {p0, p1}, Lcom/canhub/cropper/CropImageView;->updateImageBounds(Z)V

    :cond_c
    return-void
.end method

.method private final clearImageInt()V
    .locals 3

    .line 999
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->originalBitmap:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_1

    iget v1, p0, Lcom/canhub/cropper/CropImageView;->mImageResource:I

    if-gtz v1, :cond_0

    iget-object v1, p0, Lcom/canhub/cropper/CropImageView;->imageUri:Landroid/net/Uri;

    if-eqz v1, :cond_1

    .line 1000
    :cond_0
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    :cond_1
    const/4 v0, 0x0

    .line 1002
    iput-object v0, p0, Lcom/canhub/cropper/CropImageView;->originalBitmap:Landroid/graphics/Bitmap;

    const/4 v1, 0x0

    .line 1004
    iput v1, p0, Lcom/canhub/cropper/CropImageView;->mImageResource:I

    .line 1005
    iput-object v0, p0, Lcom/canhub/cropper/CropImageView;->imageUri:Landroid/net/Uri;

    const/4 v2, 0x1

    .line 1006
    iput v2, p0, Lcom/canhub/cropper/CropImageView;->loadedSampleSize:I

    .line 1007
    iput v1, p0, Lcom/canhub/cropper/CropImageView;->mDegreesRotated:I

    const/high16 v2, 0x3f800000    # 1.0f

    .line 1008
    iput v2, p0, Lcom/canhub/cropper/CropImageView;->mZoom:F

    const/4 v2, 0x0

    .line 1009
    iput v2, p0, Lcom/canhub/cropper/CropImageView;->mZoomOffsetX:F

    .line 1010
    iput v2, p0, Lcom/canhub/cropper/CropImageView;->mZoomOffsetY:F

    .line 1011
    iget-object v2, p0, Lcom/canhub/cropper/CropImageView;->mImageMatrix:Landroid/graphics/Matrix;

    invoke-virtual {v2}, Landroid/graphics/Matrix;->reset()V

    .line 1012
    iput-object v0, p0, Lcom/canhub/cropper/CropImageView;->mRestoreCropWindowRect:Landroid/graphics/RectF;

    .line 1013
    iput v1, p0, Lcom/canhub/cropper/CropImageView;->mRestoreDegreesRotated:I

    .line 1014
    iget-object v1, p0, Lcom/canhub/cropper/CropImageView;->imageView:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 1015
    invoke-direct {p0}, Lcom/canhub/cropper/CropImageView;->setCropOverlayVisibility()V

    return-void
.end method

.method public static synthetic croppedImageAsync$default(Lcom/canhub/cropper/CropImageView;Landroid/graphics/Bitmap$CompressFormat;IIILcom/canhub/cropper/CropImageView$RequestSizeOptions;Landroid/net/Uri;ILjava/lang/Object;)V
    .locals 1

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    .line 673
    sget-object p1, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    const/16 p2, 0x5a

    :cond_1
    and-int/lit8 p8, p7, 0x4

    const/4 v0, 0x0

    if-eqz p8, :cond_2

    move p3, v0

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    move p4, v0

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    .line 677
    sget-object p5, Lcom/canhub/cropper/CropImageView$RequestSizeOptions;->RESIZE_INSIDE:Lcom/canhub/cropper/CropImageView$RequestSizeOptions;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    const/4 p6, 0x0

    :cond_5
    move-object p7, p5

    move-object p8, p6

    move p5, p3

    move p6, p4

    move-object p3, p1

    move p4, p2

    move-object p2, p0

    .line 672
    invoke-virtual/range {p2 .. p8}, Lcom/canhub/cropper/CropImageView;->croppedImageAsync(Landroid/graphics/Bitmap$CompressFormat;IIILcom/canhub/cropper/CropImageView$RequestSizeOptions;Landroid/net/Uri;)V

    return-void
.end method

.method public static synthetic getCroppedImage$default(Lcom/canhub/cropper/CropImageView;IILcom/canhub/cropper/CropImageView$RequestSizeOptions;ILjava/lang/Object;)Landroid/graphics/Bitmap;
    .locals 1

    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    .line 617
    sget-object p3, Lcom/canhub/cropper/CropImageView$RequestSizeOptions;->RESIZE_INSIDE:Lcom/canhub/cropper/CropImageView$RequestSizeOptions;

    .line 613
    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/canhub/cropper/CropImageView;->getCroppedImage(IILcom/canhub/cropper/CropImageView$RequestSizeOptions;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method private final handleCropWindowChanged(ZZ)V
    .locals 11

    .line 1304
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView;->getWidth()I

    move-result v0

    .line 1305
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView;->getHeight()I

    move-result v1

    .line 1306
    iget-object v2, p0, Lcom/canhub/cropper/CropImageView;->originalBitmap:Landroid/graphics/Bitmap;

    if-eqz v2, :cond_b

    if-lez v0, :cond_b

    if-lez v1, :cond_b

    .line 1307
    iget-object v2, p0, Lcom/canhub/cropper/CropImageView;->mCropOverlayView:Lcom/canhub/cropper/CropOverlayView;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lcom/canhub/cropper/CropOverlayView;->getCropWindowRect()Landroid/graphics/RectF;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz p1, :cond_1

    .line 1309
    iget p2, v2, Landroid/graphics/RectF;->left:F

    cmpg-float p2, p2, v3

    if-ltz p2, :cond_0

    iget p2, v2, Landroid/graphics/RectF;->top:F

    cmpg-float p2, p2, v3

    if-ltz p2, :cond_0

    iget p2, v2, Landroid/graphics/RectF;->right:F

    int-to-float v3, v0

    cmpl-float p2, p2, v3

    if-gtz p2, :cond_0

    iget p2, v2, Landroid/graphics/RectF;->bottom:F

    int-to-float v2, v1

    cmpl-float p2, p2, v2

    if-lez p2, :cond_a

    :cond_0
    int-to-float p2, v0

    int-to-float v0, v1

    const/4 v1, 0x0

    .line 1310
    invoke-direct {p0, p2, v0, v1, v1}, Lcom/canhub/cropper/CropImageView;->applyImageMatrix(FFZZ)V

    goto/16 :goto_2

    .line 1317
    :cond_1
    iget-boolean v4, p0, Lcom/canhub/cropper/CropImageView;->mAutoZoomEnabled:Z

    const/high16 v5, 0x3f800000    # 1.0f

    if-nez v4, :cond_2

    iget v4, p0, Lcom/canhub/cropper/CropImageView;->mZoom:F

    cmpl-float v4, v4, v5

    if-lez v4, :cond_a

    .line 1320
    :cond_2
    iget v4, p0, Lcom/canhub/cropper/CropImageView;->mZoom:F

    iget v6, p0, Lcom/canhub/cropper/CropImageView;->mMaxZoom:I

    int-to-float v6, v6

    cmpg-float v4, v4, v6

    if-gez v4, :cond_3

    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    move-result v4

    int-to-float v6, v0

    const/high16 v7, 0x3f000000    # 0.5f

    mul-float v8, v6, v7

    cmpg-float v4, v4, v8

    if-gez v4, :cond_3

    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    move-result v4

    int-to-float v8, v1

    mul-float/2addr v7, v8

    cmpg-float v4, v4, v7

    if-gez v4, :cond_3

    .line 1322
    iget v4, p0, Lcom/canhub/cropper/CropImageView;->mMaxZoom:I

    int-to-float v4, v4

    .line 1324
    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    move-result v7

    iget v9, p0, Lcom/canhub/cropper/CropImageView;->mZoom:F

    div-float/2addr v7, v9

    const v9, 0x3f23d70a    # 0.64f

    div-float/2addr v7, v9

    div-float/2addr v6, v7

    .line 1325
    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    move-result v7

    iget v10, p0, Lcom/canhub/cropper/CropImageView;->mZoom:F

    div-float/2addr v7, v10

    div-float/2addr v7, v9

    div-float/2addr v8, v7

    invoke-static {v6, v8}, Ljava/lang/Math;->min(FF)F

    move-result v6

    invoke-static {v4, v6}, Ljava/lang/Math;->min(FF)F

    move-result v4

    goto :goto_0

    :cond_3
    move v4, v3

    .line 1329
    :goto_0
    iget v6, p0, Lcom/canhub/cropper/CropImageView;->mZoom:F

    cmpl-float v6, v6, v5

    if-lez v6, :cond_5

    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    move-result v6

    int-to-float v7, v0

    const v8, 0x3f266666    # 0.65f

    mul-float v9, v7, v8

    cmpl-float v6, v6, v9

    if-gtz v6, :cond_4

    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    move-result v6

    int-to-float v9, v1

    mul-float/2addr v9, v8

    cmpl-float v6, v6, v9

    if-lez v6, :cond_5

    .line 1333
    :cond_4
    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    move-result v4

    iget v6, p0, Lcom/canhub/cropper/CropImageView;->mZoom:F

    div-float/2addr v4, v6

    const v6, 0x3f028f5c    # 0.51f

    div-float/2addr v4, v6

    div-float/2addr v7, v4

    int-to-float v4, v1

    .line 1334
    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    move-result v2

    iget v8, p0, Lcom/canhub/cropper/CropImageView;->mZoom:F

    div-float/2addr v2, v8

    div-float/2addr v2, v6

    div-float/2addr v4, v2

    invoke-static {v7, v4}, Ljava/lang/Math;->min(FF)F

    move-result v2

    invoke-static {v5, v2}, Ljava/lang/Math;->max(FF)F

    move-result v4

    .line 1338
    :cond_5
    iget-boolean v2, p0, Lcom/canhub/cropper/CropImageView;->mAutoZoomEnabled:Z

    if-nez v2, :cond_6

    goto :goto_1

    :cond_6
    move v5, v4

    :goto_1
    cmpl-float v2, v5, v3

    if-lez v2, :cond_a

    .line 1340
    iget v2, p0, Lcom/canhub/cropper/CropImageView;->mZoom:F

    cmpg-float v2, v5, v2

    if-nez v2, :cond_7

    goto :goto_2

    :cond_7
    if-eqz p2, :cond_9

    .line 1342
    iget-object v2, p0, Lcom/canhub/cropper/CropImageView;->mAnimation:Lcom/canhub/cropper/CropImageAnimation;

    if-nez v2, :cond_8

    .line 1344
    new-instance v2, Lcom/canhub/cropper/CropImageAnimation;

    iget-object v3, p0, Lcom/canhub/cropper/CropImageView;->imageView:Landroid/widget/ImageView;

    iget-object v4, p0, Lcom/canhub/cropper/CropImageView;->mCropOverlayView:Lcom/canhub/cropper/CropOverlayView;

    invoke-direct {v2, v3, v4}, Lcom/canhub/cropper/CropImageAnimation;-><init>(Landroid/widget/ImageView;Lcom/canhub/cropper/CropOverlayView;)V

    iput-object v2, p0, Lcom/canhub/cropper/CropImageView;->mAnimation:Lcom/canhub/cropper/CropImageAnimation;

    .line 1347
    :cond_8
    iget-object v2, p0, Lcom/canhub/cropper/CropImageView;->mAnimation:Lcom/canhub/cropper/CropImageAnimation;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v3, p0, Lcom/canhub/cropper/CropImageView;->mImagePoints:[F

    iget-object v4, p0, Lcom/canhub/cropper/CropImageView;->mImageMatrix:Landroid/graphics/Matrix;

    invoke-virtual {v2, v3, v4}, Lcom/canhub/cropper/CropImageAnimation;->setStartState([FLandroid/graphics/Matrix;)V

    .line 1349
    :cond_9
    iput v5, p0, Lcom/canhub/cropper/CropImageView;->mZoom:F

    int-to-float v0, v0

    int-to-float v1, v1

    const/4 v2, 0x1

    .line 1350
    invoke-direct {p0, v0, v1, v2, p2}, Lcom/canhub/cropper/CropImageView;->applyImageMatrix(FFZZ)V

    .line 1353
    :cond_a
    :goto_2
    iget-object p2, p0, Lcom/canhub/cropper/CropImageView;->mOnSetCropWindowChangeListener:Lcom/canhub/cropper/CropImageView$OnSetCropWindowChangeListener;

    if-eqz p2, :cond_b

    if-nez p1, :cond_b

    .line 1354
    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {p2}, Lcom/canhub/cropper/CropImageView$OnSetCropWindowChangeListener;->onCropWindowChanged()V

    :cond_b
    return-void
.end method

.method public static synthetic isSaveBitmapToInstanceState$annotations()V
    .locals 0
    .annotation runtime Lkotlin/Deprecated;
        message = "This functionality is deprecated, please remove it altogether or create an issue and explain WHY you need this."
    .end annotation

    return-void
.end method

.method private final mapImagePointsByImageMatrix()V
    .locals 11

    .line 1492
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->mImagePoints:[F

    const/4 v1, 0x0

    const/4 v2, 0x0

    aput v2, v0, v1

    const/4 v3, 0x1

    .line 1493
    aput v2, v0, v3

    .line 1494
    iget-object v4, p0, Lcom/canhub/cropper/CropImageView;->originalBitmap:Landroid/graphics/Bitmap;

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    int-to-float v4, v4

    const/4 v5, 0x2

    aput v4, v0, v5

    .line 1495
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->mImagePoints:[F

    const/4 v4, 0x3

    aput v2, v0, v4

    .line 1496
    iget-object v6, p0, Lcom/canhub/cropper/CropImageView;->originalBitmap:Landroid/graphics/Bitmap;

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v6

    int-to-float v6, v6

    const/4 v7, 0x4

    aput v6, v0, v7

    .line 1497
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->mImagePoints:[F

    iget-object v6, p0, Lcom/canhub/cropper/CropImageView;->originalBitmap:Landroid/graphics/Bitmap;

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v6

    int-to-float v6, v6

    const/4 v8, 0x5

    aput v6, v0, v8

    .line 1498
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->mImagePoints:[F

    const/4 v6, 0x6

    aput v2, v0, v6

    .line 1499
    iget-object v9, p0, Lcom/canhub/cropper/CropImageView;->originalBitmap:Landroid/graphics/Bitmap;

    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v9}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v9

    int-to-float v9, v9

    const/4 v10, 0x7

    aput v9, v0, v10

    .line 1500
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->mImageMatrix:Landroid/graphics/Matrix;

    iget-object v9, p0, Lcom/canhub/cropper/CropImageView;->mImagePoints:[F

    invoke-virtual {v0, v9}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 1501
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->mScaleImagePoints:[F

    aput v2, v0, v1

    .line 1502
    aput v2, v0, v3

    const/high16 v1, 0x42c80000    # 100.0f

    .line 1503
    aput v1, v0, v5

    .line 1504
    aput v2, v0, v4

    .line 1505
    aput v1, v0, v7

    .line 1506
    aput v1, v0, v8

    .line 1507
    aput v2, v0, v6

    .line 1508
    aput v1, v0, v10

    .line 1509
    iget-object v1, p0, Lcom/canhub/cropper/CropImageView;->mImageMatrix:Landroid/graphics/Matrix;

    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->mapPoints([F)V

    return-void
.end method

.method private final setBitmap(Landroid/graphics/Bitmap;ILandroid/net/Uri;II)V
    .locals 1

    .line 971
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->originalBitmap:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 972
    :cond_0
    invoke-direct {p0}, Lcom/canhub/cropper/CropImageView;->clearImageInt()V

    .line 973
    iput-object p1, p0, Lcom/canhub/cropper/CropImageView;->originalBitmap:Landroid/graphics/Bitmap;

    .line 974
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->imageView:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 975
    iput-object p3, p0, Lcom/canhub/cropper/CropImageView;->imageUri:Landroid/net/Uri;

    .line 976
    iput p2, p0, Lcom/canhub/cropper/CropImageView;->mImageResource:I

    .line 977
    iput p4, p0, Lcom/canhub/cropper/CropImageView;->loadedSampleSize:I

    .line 978
    iput p5, p0, Lcom/canhub/cropper/CropImageView;->mDegreesRotated:I

    .line 980
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView;->getWidth()I

    move-result p1

    int-to-float p1, p1

    .line 981
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView;->getHeight()I

    move-result p2

    int-to-float p2, p2

    const/4 p3, 0x1

    const/4 p4, 0x0

    .line 979
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/canhub/cropper/CropImageView;->applyImageMatrix(FFZZ)V

    .line 985
    iget-object p1, p0, Lcom/canhub/cropper/CropImageView;->mCropOverlayView:Lcom/canhub/cropper/CropOverlayView;

    if-eqz p1, :cond_1

    .line 986
    invoke-virtual {p1}, Lcom/canhub/cropper/CropOverlayView;->resetCropOverlayView()V

    .line 987
    invoke-direct {p0}, Lcom/canhub/cropper/CropImageView;->setCropOverlayVisibility()V

    :cond_1
    return-void
.end method

.method private final setCropOverlayVisibility()V
    .locals 2

    .line 1516
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->mCropOverlayView:Lcom/canhub/cropper/CropOverlayView;

    if-eqz v0, :cond_1

    .line 1518
    iget-boolean v1, p0, Lcom/canhub/cropper/CropImageView;->mShowCropOverlay:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/canhub/cropper/CropImageView;->originalBitmap:Landroid/graphics/Bitmap;

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/4 v1, 0x4

    .line 1517
    :goto_0
    invoke-virtual {v0, v1}, Lcom/canhub/cropper/CropOverlayView;->setVisibility(I)V

    :cond_1
    return-void
.end method

.method private final setProgressBarVisibility()V
    .locals 3

    .line 1527
    iget-boolean v0, p0, Lcom/canhub/cropper/CropImageView;->mShowProgressBar:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 1529
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->originalBitmap:Landroid/graphics/Bitmap;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->bitmapLoadingWorkerJob:Ljava/lang/ref/WeakReference;

    if-nez v0, :cond_1

    .line 1530
    :cond_0
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->bitmapCroppingWorkerJob:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    move v0, v1

    .line 1533
    :goto_0
    iget-object v2, p0, Lcom/canhub/cropper/CropImageView;->mProgressBar:Landroid/widget/ProgressBar;

    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    const/4 v1, 0x4

    :goto_1
    invoke-virtual {v2, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    return-void
.end method

.method private final updateImageBounds(Z)V
    .locals 5

    .line 1539
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->originalBitmap:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    if-nez p1, :cond_0

    .line 1543
    iget v0, p0, Lcom/canhub/cropper/CropImageView;->loadedSampleSize:I

    int-to-float v0, v0

    const/high16 v1, 0x42c80000    # 100.0f

    mul-float/2addr v0, v1

    sget-object v2, Lcom/canhub/cropper/BitmapUtils;->INSTANCE:Lcom/canhub/cropper/BitmapUtils;

    iget-object v3, p0, Lcom/canhub/cropper/CropImageView;->mScaleImagePoints:[F

    invoke-virtual {v2, v3}, Lcom/canhub/cropper/BitmapUtils;->getRectWidth([F)F

    move-result v2

    div-float/2addr v0, v2

    .line 1545
    iget v2, p0, Lcom/canhub/cropper/CropImageView;->loadedSampleSize:I

    int-to-float v2, v2

    mul-float/2addr v2, v1

    sget-object v1, Lcom/canhub/cropper/BitmapUtils;->INSTANCE:Lcom/canhub/cropper/BitmapUtils;

    iget-object v3, p0, Lcom/canhub/cropper/CropImageView;->mScaleImagePoints:[F

    invoke-virtual {v1, v3}, Lcom/canhub/cropper/BitmapUtils;->getRectHeight([F)F

    move-result v1

    div-float/2addr v2, v1

    .line 1546
    iget-object v1, p0, Lcom/canhub/cropper/CropImageView;->mCropOverlayView:Lcom/canhub/cropper/CropOverlayView;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1547
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView;->getWidth()I

    move-result v3

    int-to-float v3, v3

    .line 1548
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView;->getHeight()I

    move-result v4

    int-to-float v4, v4

    .line 1546
    invoke-virtual {v1, v3, v4, v0, v2}, Lcom/canhub/cropper/CropOverlayView;->setCropWindowLimits(FFFF)V

    .line 1554
    :cond_0
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->mCropOverlayView:Lcom/canhub/cropper/CropOverlayView;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/canhub/cropper/CropImageView;->mImagePoints:[F

    :goto_0
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView;->getWidth()I

    move-result v1

    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView;->getHeight()I

    move-result v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/canhub/cropper/CropOverlayView;->setBounds([FII)V

    return-void
.end method


# virtual methods
.method public final -croppedImage()Landroid/graphics/Bitmap;
    .locals 2

    const/4 v0, 0x0

    .line 603
    sget-object v1, Lcom/canhub/cropper/CropImageView$RequestSizeOptions;->NONE:Lcom/canhub/cropper/CropImageView$RequestSizeOptions;

    invoke-virtual {p0, v0, v0, v1}, Lcom/canhub/cropper/CropImageView;->getCroppedImage(IILcom/canhub/cropper/CropImageView$RequestSizeOptions;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method public final clearAspectRatio()V
    .locals 2

    .line 389
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->mCropOverlayView:Lcom/canhub/cropper/CropOverlayView;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/canhub/cropper/CropOverlayView;->setAspectRatioX(I)V

    .line 390
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->mCropOverlayView:Lcom/canhub/cropper/CropOverlayView;

    invoke-virtual {v0, v1}, Lcom/canhub/cropper/CropOverlayView;->setAspectRatioY(I)V

    const/4 v0, 0x0

    .line 391
    invoke-virtual {p0, v0}, Lcom/canhub/cropper/CropImageView;->setFixedAspectRatio(Z)V

    return-void
.end method

.method public final clearImage()V
    .locals 2

    .line 791
    invoke-direct {p0}, Lcom/canhub/cropper/CropImageView;->clearImageInt()V

    .line 792
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->mCropOverlayView:Lcom/canhub/cropper/CropOverlayView;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/canhub/cropper/CropOverlayView;->setInitialCropWindowRect(Landroid/graphics/Rect;)V

    :cond_0
    return-void
.end method

.method public final croppedImageAsync(Landroid/graphics/Bitmap$CompressFormat;IIILcom/canhub/cropper/CropImageView$RequestSizeOptions;Landroid/net/Uri;)V
    .locals 8

    const-string/jumbo v0, "saveCompressFormat"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "options"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 680
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->mOnCropImageCompleteListener:Lcom/canhub/cropper/CropImageView$OnCropImageCompleteListener;

    if-eqz v0, :cond_0

    move-object v1, p0

    move-object v5, p1

    move v6, p2

    move v2, p3

    move v3, p4

    move-object v4, p5

    move-object v7, p6

    .line 681
    invoke-virtual/range {v1 .. v7}, Lcom/canhub/cropper/CropImageView;->startCropWorkerTask(IILcom/canhub/cropper/CropImageView$RequestSizeOptions;Landroid/graphics/Bitmap$CompressFormat;ILandroid/net/Uri;)V

    return-void

    .line 680
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "mOnCropImageCompleteListener is not set"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final expectedImageSize()Landroid/util/Size;
    .locals 3

    .line 530
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView;->getCropRect()Landroid/graphics/Rect;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 532
    :cond_0
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView;->getRotatedDegrees()I

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView;->getRotatedDegrees()I

    move-result v1

    const/16 v2, 0xb4

    if-ne v1, v2, :cond_1

    goto :goto_0

    .line 535
    :cond_1
    new-instance v1, Landroid/util/Size;

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v2

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v0

    invoke-direct {v1, v2, v0}, Landroid/util/Size;-><init>(II)V

    return-object v1

    .line 533
    :cond_2
    :goto_0
    new-instance v1, Landroid/util/Size;

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v2

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    invoke-direct {v1, v2, v0}, Landroid/util/Size;-><init>(II)V

    return-object v1
.end method

.method public final flipImageHorizontally()V
    .locals 4

    .line 884
    iget-boolean v0, p0, Lcom/canhub/cropper/CropImageView;->mFlipHorizontally:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    iput-boolean v0, p0, Lcom/canhub/cropper/CropImageView;->mFlipHorizontally:Z

    .line 886
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView;->getWidth()I

    move-result v0

    int-to-float v0, v0

    .line 887
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView;->getHeight()I

    move-result v2

    int-to-float v2, v2

    const/4 v3, 0x0

    .line 885
    invoke-direct {p0, v0, v2, v1, v3}, Lcom/canhub/cropper/CropImageView;->applyImageMatrix(FFZZ)V

    return-void
.end method

.method public final flipImageVertically()V
    .locals 4

    .line 895
    iget-boolean v0, p0, Lcom/canhub/cropper/CropImageView;->mFlipVertically:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    iput-boolean v0, p0, Lcom/canhub/cropper/CropImageView;->mFlipVertically:Z

    .line 897
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView;->getWidth()I

    move-result v0

    int-to-float v0, v0

    .line 898
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView;->getHeight()I

    move-result v2

    int-to-float v2, v2

    const/4 v3, 0x0

    .line 896
    invoke-direct {p0, v0, v2, v1, v3}, Lcom/canhub/cropper/CropImageView;->applyImageMatrix(FFZZ)V

    return-void
.end method

.method public final getAspectRatio()Landroid/util/Pair;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/util/Pair<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 354
    new-instance v0, Landroid/util/Pair;

    iget-object v1, p0, Lcom/canhub/cropper/CropImageView;->mCropOverlayView:Lcom/canhub/cropper/CropOverlayView;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lcom/canhub/cropper/CropOverlayView;->getAspectRatioX()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, p0, Lcom/canhub/cropper/CropImageView;->mCropOverlayView:Lcom/canhub/cropper/CropOverlayView;

    invoke-virtual {v2}, Lcom/canhub/cropper/CropOverlayView;->getAspectRatioY()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public final getCornerShape()Lcom/canhub/cropper/CropImageView$CropCornerShape;
    .locals 1

    .line 224
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->mCropOverlayView:Lcom/canhub/cropper/CropOverlayView;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/canhub/cropper/CropOverlayView;->getCornerShape()Lcom/canhub/cropper/CropImageView$CropCornerShape;

    move-result-object v0

    return-object v0
.end method

.method public final getCropLabelText()Ljava/lang/String;
    .locals 1

    .line 442
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->mCropTextLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getCropLabelTextColor()I
    .locals 1

    .line 454
    iget v0, p0, Lcom/canhub/cropper/CropImageView;->mCropLabelTextColor:I

    return v0
.end method

.method public final getCropLabelTextSize()F
    .locals 1

    .line 448
    iget v0, p0, Lcom/canhub/cropper/CropImageView;->mCropLabelTextSize:F

    return v0
.end method

.method public final getCropPoints()[F
    .locals 11

    .line 558
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->mCropOverlayView:Lcom/canhub/cropper/CropOverlayView;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/canhub/cropper/CropOverlayView;->getCropWindowRect()Landroid/graphics/RectF;

    move-result-object v0

    .line 560
    iget v1, v0, Landroid/graphics/RectF;->left:F

    .line 561
    iget v2, v0, Landroid/graphics/RectF;->top:F

    .line 562
    iget v3, v0, Landroid/graphics/RectF;->right:F

    .line 563
    iget v4, v0, Landroid/graphics/RectF;->top:F

    .line 564
    iget v5, v0, Landroid/graphics/RectF;->right:F

    .line 565
    iget v6, v0, Landroid/graphics/RectF;->bottom:F

    .line 566
    iget v7, v0, Landroid/graphics/RectF;->left:F

    .line 567
    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    const/16 v8, 0x8

    new-array v9, v8, [F

    const/4 v10, 0x0

    aput v1, v9, v10

    const/4 v1, 0x1

    aput v2, v9, v1

    const/4 v1, 0x2

    aput v3, v9, v1

    const/4 v1, 0x3

    aput v4, v9, v1

    const/4 v1, 0x4

    aput v5, v9, v1

    const/4 v1, 0x5

    aput v6, v9, v1

    const/4 v1, 0x6

    aput v7, v9, v1

    const/4 v1, 0x7

    aput v0, v9, v1

    .line 569
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->mImageMatrix:Landroid/graphics/Matrix;

    iget-object v1, p0, Lcom/canhub/cropper/CropImageView;->mImageInverseMatrix:Landroid/graphics/Matrix;

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    .line 570
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->mImageInverseMatrix:Landroid/graphics/Matrix;

    invoke-virtual {v0, v9}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 571
    new-array v0, v8, [F

    :goto_0
    if-ge v10, v8, :cond_0

    .line 573
    aget v1, v9, v10

    iget v2, p0, Lcom/canhub/cropper/CropImageView;->loadedSampleSize:I

    int-to-float v2, v2

    mul-float/2addr v1, v2

    aput v1, v0, v10

    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public final getCropRect()Landroid/graphics/Rect;
    .locals 8

    .line 508
    iget v0, p0, Lcom/canhub/cropper/CropImageView;->loadedSampleSize:I

    .line 509
    iget-object v1, p0, Lcom/canhub/cropper/CropImageView;->originalBitmap:Landroid/graphics/Bitmap;

    if-nez v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 511
    :cond_0
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView;->getCropPoints()[F

    move-result-object v2

    .line 512
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    mul-int/2addr v3, v0

    .line 513
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    mul-int v4, v1, v0

    .line 515
    sget-object v1, Lcom/canhub/cropper/BitmapUtils;->INSTANCE:Lcom/canhub/cropper/BitmapUtils;

    .line 519
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->mCropOverlayView:Lcom/canhub/cropper/CropOverlayView;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/canhub/cropper/CropOverlayView;->isFixAspectRatio()Z

    move-result v5

    .line 520
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->mCropOverlayView:Lcom/canhub/cropper/CropOverlayView;

    invoke-virtual {v0}, Lcom/canhub/cropper/CropOverlayView;->getAspectRatioX()I

    move-result v6

    .line 521
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->mCropOverlayView:Lcom/canhub/cropper/CropOverlayView;

    invoke-virtual {v0}, Lcom/canhub/cropper/CropOverlayView;->getAspectRatioY()I

    move-result v7

    .line 515
    invoke-virtual/range {v1 .. v7}, Lcom/canhub/cropper/BitmapUtils;->getRectFromPoints([FIIZII)Landroid/graphics/Rect;

    move-result-object v0

    return-object v0
.end method

.method public final getCropShape()Lcom/canhub/cropper/CropImageView$CropShape;
    .locals 1

    .line 215
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->mCropOverlayView:Lcom/canhub/cropper/CropOverlayView;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/canhub/cropper/CropOverlayView;->getCropShape()Lcom/canhub/cropper/CropImageView$CropShape;

    move-result-object v0

    return-object v0
.end method

.method public final getCropWindowRect()Landroid/graphics/RectF;
    .locals 1

    .line 545
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->mCropOverlayView:Lcom/canhub/cropper/CropOverlayView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/canhub/cropper/CropOverlayView;->getCropWindowRect()Landroid/graphics/RectF;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getCroppedImage()Landroid/graphics/Bitmap;
    .locals 6

    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lcom/canhub/cropper/CropImageView;->getCroppedImage$default(Lcom/canhub/cropper/CropImageView;IILcom/canhub/cropper/CropImageView$RequestSizeOptions;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v1

    return-object v1
.end method

.method public final getCroppedImage(I)Landroid/graphics/Bitmap;
    .locals 6

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move v1, p1

    invoke-static/range {v0 .. v5}, Lcom/canhub/cropper/CropImageView;->getCroppedImage$default(Lcom/canhub/cropper/CropImageView;IILcom/canhub/cropper/CropImageView$RequestSizeOptions;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1
.end method

.method public final getCroppedImage(II)Landroid/graphics/Bitmap;
    .locals 6

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move v1, p1

    move v2, p2

    invoke-static/range {v0 .. v5}, Lcom/canhub/cropper/CropImageView;->getCroppedImage$default(Lcom/canhub/cropper/CropImageView;IILcom/canhub/cropper/CropImageView$RequestSizeOptions;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1
.end method

.method public final getCroppedImage(IILcom/canhub/cropper/CropImageView$RequestSizeOptions;)Landroid/graphics/Bitmap;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    const-string v2, "options"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 619
    iget-object v2, v0, Lcom/canhub/cropper/CropImageView;->originalBitmap:Landroid/graphics/Bitmap;

    if-eqz v2, :cond_4

    .line 620
    sget-object v2, Lcom/canhub/cropper/CropImageView$RequestSizeOptions;->NONE:Lcom/canhub/cropper/CropImageView$RequestSizeOptions;

    const/4 v3, 0x0

    if-eq v1, v2, :cond_0

    move/from16 v14, p1

    goto :goto_0

    :cond_0
    move v14, v3

    .line 621
    :goto_0
    sget-object v2, Lcom/canhub/cropper/CropImageView$RequestSizeOptions;->NONE:Lcom/canhub/cropper/CropImageView$RequestSizeOptions;

    if-eq v1, v2, :cond_1

    move/from16 v15, p2

    goto :goto_1

    :cond_1
    move v15, v3

    .line 622
    :goto_1
    iget-object v2, v0, Lcom/canhub/cropper/CropImageView;->imageUri:Landroid/net/Uri;

    if-eqz v2, :cond_3

    iget v2, v0, Lcom/canhub/cropper/CropImageView;->loadedSampleSize:I

    const/4 v3, 0x1

    if-gt v2, v3, :cond_2

    sget-object v2, Lcom/canhub/cropper/CropImageView$RequestSizeOptions;->SAMPLING:Lcom/canhub/cropper/CropImageView$RequestSizeOptions;

    if-ne v1, v2, :cond_3

    .line 623
    :cond_2
    sget-object v4, Lcom/canhub/cropper/BitmapUtils;->INSTANCE:Lcom/canhub/cropper/BitmapUtils;

    .line 624
    invoke-virtual {v0}, Lcom/canhub/cropper/CropImageView;->getContext()Landroid/content/Context;

    move-result-object v5

    const-string v2, "getContext(...)"

    invoke-static {v5, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 625
    iget-object v6, v0, Lcom/canhub/cropper/CropImageView;->imageUri:Landroid/net/Uri;

    .line 626
    invoke-virtual {v0}, Lcom/canhub/cropper/CropImageView;->getCropPoints()[F

    move-result-object v7

    .line 627
    iget v8, v0, Lcom/canhub/cropper/CropImageView;->mDegreesRotated:I

    .line 628
    iget-object v2, v0, Lcom/canhub/cropper/CropImageView;->originalBitmap:Landroid/graphics/Bitmap;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    iget v3, v0, Lcom/canhub/cropper/CropImageView;->loadedSampleSize:I

    mul-int v9, v2, v3

    .line 629
    iget-object v2, v0, Lcom/canhub/cropper/CropImageView;->originalBitmap:Landroid/graphics/Bitmap;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    iget v3, v0, Lcom/canhub/cropper/CropImageView;->loadedSampleSize:I

    mul-int v10, v2, v3

    .line 630
    iget-object v2, v0, Lcom/canhub/cropper/CropImageView;->mCropOverlayView:Lcom/canhub/cropper/CropOverlayView;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lcom/canhub/cropper/CropOverlayView;->isFixAspectRatio()Z

    move-result v11

    .line 631
    iget-object v2, v0, Lcom/canhub/cropper/CropImageView;->mCropOverlayView:Lcom/canhub/cropper/CropOverlayView;

    invoke-virtual {v2}, Lcom/canhub/cropper/CropOverlayView;->getAspectRatioX()I

    move-result v12

    .line 632
    iget-object v2, v0, Lcom/canhub/cropper/CropImageView;->mCropOverlayView:Lcom/canhub/cropper/CropOverlayView;

    invoke-virtual {v2}, Lcom/canhub/cropper/CropOverlayView;->getAspectRatioY()I

    move-result v13

    .line 635
    iget-boolean v2, v0, Lcom/canhub/cropper/CropImageView;->mFlipHorizontally:Z

    .line 636
    iget-boolean v3, v0, Lcom/canhub/cropper/CropImageView;->mFlipVertically:Z

    move/from16 v16, v2

    move/from16 v17, v3

    .line 623
    invoke-virtual/range {v4 .. v17}, Lcom/canhub/cropper/BitmapUtils;->cropBitmap(Landroid/content/Context;Landroid/net/Uri;[FIIIZIIIIZZ)Lcom/canhub/cropper/BitmapUtils$BitmapSampled;

    move-result-object v2

    .line 637
    invoke-virtual {v2}, Lcom/canhub/cropper/BitmapUtils$BitmapSampled;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v2

    goto :goto_2

    .line 639
    :cond_3
    sget-object v3, Lcom/canhub/cropper/BitmapUtils;->INSTANCE:Lcom/canhub/cropper/BitmapUtils;

    .line 640
    iget-object v4, v0, Lcom/canhub/cropper/CropImageView;->originalBitmap:Landroid/graphics/Bitmap;

    .line 641
    invoke-virtual {v0}, Lcom/canhub/cropper/CropImageView;->getCropPoints()[F

    move-result-object v5

    .line 642
    iget v6, v0, Lcom/canhub/cropper/CropImageView;->mDegreesRotated:I

    .line 643
    iget-object v2, v0, Lcom/canhub/cropper/CropImageView;->mCropOverlayView:Lcom/canhub/cropper/CropOverlayView;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lcom/canhub/cropper/CropOverlayView;->isFixAspectRatio()Z

    move-result v7

    .line 644
    iget-object v2, v0, Lcom/canhub/cropper/CropImageView;->mCropOverlayView:Lcom/canhub/cropper/CropOverlayView;

    invoke-virtual {v2}, Lcom/canhub/cropper/CropOverlayView;->getAspectRatioX()I

    move-result v8

    .line 645
    iget-object v2, v0, Lcom/canhub/cropper/CropImageView;->mCropOverlayView:Lcom/canhub/cropper/CropOverlayView;

    invoke-virtual {v2}, Lcom/canhub/cropper/CropOverlayView;->getAspectRatioY()I

    move-result v9

    .line 646
    iget-boolean v10, v0, Lcom/canhub/cropper/CropImageView;->mFlipHorizontally:Z

    .line 647
    iget-boolean v11, v0, Lcom/canhub/cropper/CropImageView;->mFlipVertically:Z

    .line 639
    invoke-virtual/range {v3 .. v11}, Lcom/canhub/cropper/BitmapUtils;->cropBitmapObjectHandleOOM(Landroid/graphics/Bitmap;[FIZIIZZ)Lcom/canhub/cropper/BitmapUtils$BitmapSampled;

    move-result-object v2

    .line 648
    invoke-virtual {v2}, Lcom/canhub/cropper/BitmapUtils$BitmapSampled;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v2

    .line 651
    :goto_2
    sget-object v3, Lcom/canhub/cropper/BitmapUtils;->INSTANCE:Lcom/canhub/cropper/BitmapUtils;

    invoke-virtual {v3, v2, v14, v15, v1}, Lcom/canhub/cropper/BitmapUtils;->resizeBitmap(Landroid/graphics/Bitmap;IILcom/canhub/cropper/CropImageView$RequestSizeOptions;)Landroid/graphics/Bitmap;

    move-result-object v1

    return-object v1

    :cond_4
    const/4 v1, 0x0

    return-object v1
.end method

.method public final getCustomOutputUri()Landroid/net/Uri;
    .locals 1

    .line 325
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->customOutputUri:Landroid/net/Uri;

    return-object v0
.end method

.method public final getGuidelines()Lcom/canhub/cropper/CropImageView$Guidelines;
    .locals 1

    .line 347
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->mCropOverlayView:Lcom/canhub/cropper/CropOverlayView;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/canhub/cropper/CropOverlayView;->getGuidelines()Lcom/canhub/cropper/CropImageView$Guidelines;

    move-result-object v0

    return-object v0
.end method

.method public final getImageResource()I
    .locals 1

    .line 466
    iget v0, p0, Lcom/canhub/cropper/CropImageView;->mImageResource:I

    return v0
.end method

.method public final getImageUri()Landroid/net/Uri;
    .locals 1

    .line 158
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->imageUri:Landroid/net/Uri;

    return-object v0
.end method

.method public final getMaxZoom()I
    .locals 1

    .line 258
    iget v0, p0, Lcom/canhub/cropper/CropImageView;->mMaxZoom:I

    return v0
.end method

.method public final getRotatedDegrees()I
    .locals 1

    .line 287
    iget v0, p0, Lcom/canhub/cropper/CropImageView;->mDegreesRotated:I

    return v0
.end method

.method public final getScaleType()Lcom/canhub/cropper/CropImageView$ScaleType;
    .locals 1

    .line 190
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->mScaleType:Lcom/canhub/cropper/CropImageView$ScaleType;

    return-object v0
.end method

.method public final getWholeImageRect()Landroid/graphics/Rect;
    .locals 4

    .line 488
    iget v0, p0, Lcom/canhub/cropper/CropImageView;->loadedSampleSize:I

    .line 489
    iget-object v1, p0, Lcom/canhub/cropper/CropImageView;->originalBitmap:Landroid/graphics/Bitmap;

    if-nez v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 490
    :cond_0
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    mul-int/2addr v2, v0

    .line 491
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    mul-int/2addr v1, v0

    .line 492
    new-instance v0, Landroid/graphics/Rect;

    const/4 v3, 0x0

    invoke-direct {v0, v3, v3, v2, v1}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object v0
.end method

.method public final isAutoZoomEnabled()Z
    .locals 1

    .line 231
    iget-boolean v0, p0, Lcom/canhub/cropper/CropImageView;->mAutoZoomEnabled:Z

    return v0
.end method

.method public final isFixAspectRatio()Z
    .locals 1

    .line 299
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->mCropOverlayView:Lcom/canhub/cropper/CropOverlayView;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/canhub/cropper/CropOverlayView;->isFixAspectRatio()Z

    move-result v0

    return v0
.end method

.method public final isFlippedHorizontally()Z
    .locals 1

    .line 311
    iget-boolean v0, p0, Lcom/canhub/cropper/CropImageView;->mFlipHorizontally:Z

    return v0
.end method

.method public final isFlippedVertically()Z
    .locals 1

    .line 329
    iget-boolean v0, p0, Lcom/canhub/cropper/CropImageView;->mFlipVertically:Z

    return v0
.end method

.method public final isSaveBitmapToInstanceState()Z
    .locals 1

    .line 94
    iget-boolean v0, p0, Lcom/canhub/cropper/CropImageView;->isSaveBitmapToInstanceState:Z

    return v0
.end method

.method public final isShowCropLabel()Z
    .locals 1

    .line 434
    iget-boolean v0, p0, Lcom/canhub/cropper/CropImageView;->mShowCropLabel:Z

    return v0
.end method

.method public final isShowCropOverlay()Z
    .locals 1

    .line 422
    iget-boolean v0, p0, Lcom/canhub/cropper/CropImageView;->mShowCropOverlay:Z

    return v0
.end method

.method public final isShowProgressBar()Z
    .locals 1

    .line 408
    iget-boolean v0, p0, Lcom/canhub/cropper/CropImageView;->mShowProgressBar:Z

    return v0
.end method

.method public onCropWindowChanged(Z)V
    .locals 1

    const/4 v0, 0x1

    .line 1887
    invoke-direct {p0, p1, v0}, Lcom/canhub/cropper/CropImageView;->handleCropWindowChanged(ZZ)V

    if-eqz p1, :cond_0

    .line 1890
    iget-object p1, p0, Lcom/canhub/cropper/CropImageView;->mOnSetCropOverlayMovedListener:Lcom/canhub/cropper/CropImageView$OnSetCropOverlayMovedListener;

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView;->getCropRect()Landroid/graphics/Rect;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/canhub/cropper/CropImageView$OnSetCropOverlayMovedListener;->onCropOverlayMoved(Landroid/graphics/Rect;)V

    return-void

    .line 1892
    :cond_0
    iget-object p1, p0, Lcom/canhub/cropper/CropImageView;->mOnCropOverlayReleasedListener:Lcom/canhub/cropper/CropImageView$OnSetCropOverlayReleasedListener;

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView;->getCropRect()Landroid/graphics/Rect;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/canhub/cropper/CropImageView$OnSetCropOverlayReleasedListener;->onCropOverlayReleased(Landroid/graphics/Rect;)V

    :cond_1
    return-void
.end method

.method public final onImageCroppingAsyncComplete$cropper_release(Lcom/canhub/cropper/BitmapCroppingWorkerJob$Result;)V
    .locals 12

    const-string/jumbo v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 939
    iput-object v0, p0, Lcom/canhub/cropper/CropImageView;->bitmapCroppingWorkerJob:Ljava/lang/ref/WeakReference;

    .line 940
    invoke-direct {p0}, Lcom/canhub/cropper/CropImageView;->setProgressBarVisibility()V

    .line 941
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->mOnCropImageCompleteListener:Lcom/canhub/cropper/CropImageView$OnCropImageCompleteListener;

    if-eqz v0, :cond_0

    .line 943
    new-instance v1, Lcom/canhub/cropper/CropImageView$CropResult;

    .line 944
    iget-object v2, p0, Lcom/canhub/cropper/CropImageView;->originalBitmap:Landroid/graphics/Bitmap;

    .line 945
    iget-object v3, p0, Lcom/canhub/cropper/CropImageView;->imageUri:Landroid/net/Uri;

    .line 946
    invoke-virtual {p1}, Lcom/canhub/cropper/BitmapCroppingWorkerJob$Result;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v4

    .line 947
    invoke-virtual {p1}, Lcom/canhub/cropper/BitmapCroppingWorkerJob$Result;->getUri()Landroid/net/Uri;

    move-result-object v5

    .line 948
    invoke-virtual {p1}, Lcom/canhub/cropper/BitmapCroppingWorkerJob$Result;->getError()Ljava/lang/Exception;

    move-result-object v6

    .line 949
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView;->getCropPoints()[F

    move-result-object v7

    .line 950
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView;->getCropRect()Landroid/graphics/Rect;

    move-result-object v8

    .line 951
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView;->getWholeImageRect()Landroid/graphics/Rect;

    move-result-object v9

    .line 952
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView;->getRotatedDegrees()I

    move-result v10

    .line 953
    invoke-virtual {p1}, Lcom/canhub/cropper/BitmapCroppingWorkerJob$Result;->getSampleSize()I

    move-result v11

    .line 943
    invoke-direct/range {v1 .. v11}, Lcom/canhub/cropper/CropImageView$CropResult;-><init>(Landroid/graphics/Bitmap;Landroid/net/Uri;Landroid/graphics/Bitmap;Landroid/net/Uri;Ljava/lang/Exception;[FLandroid/graphics/Rect;Landroid/graphics/Rect;II)V

    .line 955
    invoke-interface {v0, p0, v1}, Lcom/canhub/cropper/CropImageView$OnCropImageCompleteListener;->onCropImageComplete(Lcom/canhub/cropper/CropImageView;Lcom/canhub/cropper/CropImageView$CropResult;)V

    :cond_0
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 3

    .line 1242
    invoke-super/range {p0 .. p5}, Landroid/widget/FrameLayout;->onLayout(ZIIII)V

    move-object p1, p0

    .line 1243
    iget v0, p1, Lcom/canhub/cropper/CropImageView;->mLayoutWidth:I

    const/4 v1, 0x1

    if-lez v0, :cond_6

    iget v0, p1, Lcom/canhub/cropper/CropImageView;->mLayoutHeight:I

    if-lez v0, :cond_6

    .line 1245
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 1246
    iget v2, p1, Lcom/canhub/cropper/CropImageView;->mLayoutWidth:I

    iput v2, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 1247
    iget v2, p1, Lcom/canhub/cropper/CropImageView;->mLayoutHeight:I

    iput v2, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 1248
    invoke-virtual {p0, v0}, Lcom/canhub/cropper/CropImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1249
    iget-object v0, p1, Lcom/canhub/cropper/CropImageView;->originalBitmap:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_5

    sub-int/2addr p4, p2

    int-to-float p2, p4

    sub-int/2addr p5, p3

    int-to-float p3, p5

    const/4 p4, 0x0

    .line 1250
    invoke-direct {p0, p2, p3, v1, p4}, Lcom/canhub/cropper/CropImageView;->applyImageMatrix(FFZZ)V

    .line 1258
    iget-object p5, p1, Lcom/canhub/cropper/CropImageView;->mRestoreCropWindowRect:Landroid/graphics/RectF;

    if-eqz p5, :cond_3

    .line 1260
    iget v0, p1, Lcom/canhub/cropper/CropImageView;->mRestoreDegreesRotated:I

    iget v2, p1, Lcom/canhub/cropper/CropImageView;->mInitialDegreesRotated:I

    if-eq v0, v2, :cond_0

    .line 1261
    iput v0, p1, Lcom/canhub/cropper/CropImageView;->mDegreesRotated:I

    .line 1262
    invoke-direct {p0, p2, p3, v1, p4}, Lcom/canhub/cropper/CropImageView;->applyImageMatrix(FFZZ)V

    .line 1268
    iput p4, p1, Lcom/canhub/cropper/CropImageView;->mRestoreDegreesRotated:I

    .line 1270
    :cond_0
    iget-object p2, p1, Lcom/canhub/cropper/CropImageView;->mImageMatrix:Landroid/graphics/Matrix;

    iget-object p3, p1, Lcom/canhub/cropper/CropImageView;->mRestoreCropWindowRect:Landroid/graphics/RectF;

    invoke-virtual {p2, p3}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 1271
    iget-object p2, p1, Lcom/canhub/cropper/CropImageView;->mCropOverlayView:Lcom/canhub/cropper/CropOverlayView;

    if-eqz p2, :cond_1

    invoke-virtual {p2, p5}, Lcom/canhub/cropper/CropOverlayView;->setCropWindowRect(Landroid/graphics/RectF;)V

    .line 1272
    :cond_1
    invoke-direct {p0, p4, p4}, Lcom/canhub/cropper/CropImageView;->handleCropWindowChanged(ZZ)V

    .line 1273
    iget-object p2, p1, Lcom/canhub/cropper/CropImageView;->mCropOverlayView:Lcom/canhub/cropper/CropOverlayView;

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Lcom/canhub/cropper/CropOverlayView;->fixCurrentCropWindowRect()V

    :cond_2
    const/4 p2, 0x0

    .line 1274
    iput-object p2, p1, Lcom/canhub/cropper/CropImageView;->mRestoreCropWindowRect:Landroid/graphics/RectF;

    return-void

    .line 1275
    :cond_3
    iget-boolean p2, p1, Lcom/canhub/cropper/CropImageView;->mSizeChanged:Z

    if-eqz p2, :cond_4

    .line 1276
    iput-boolean p4, p1, Lcom/canhub/cropper/CropImageView;->mSizeChanged:Z

    .line 1277
    invoke-direct {p0, p4, p4}, Lcom/canhub/cropper/CropImageView;->handleCropWindowChanged(ZZ)V

    :cond_4
    return-void

    .line 1280
    :cond_5
    invoke-direct {p0, v1}, Lcom/canhub/cropper/CropImageView;->updateImageBounds(Z)V

    return-void

    .line 1283
    :cond_6
    invoke-direct {p0, v1}, Lcom/canhub/cropper/CropImageView;->updateImageBounds(Z)V

    return-void
.end method

.method protected onMeasure(II)V
    .locals 12

    .line 1194
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    .line 1195
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    .line 1196
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    .line 1197
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v1

    .line 1198
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    .line 1199
    iget-object v2, p0, Lcom/canhub/cropper/CropImageView;->originalBitmap:Landroid/graphics/Bitmap;

    if-eqz v2, :cond_5

    if-nez p2, :cond_0

    .line 1202
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p2

    .line 1208
    :cond_0
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    const-wide/high16 v4, 0x7ff0000000000000L    # Double.POSITIVE_INFINITY

    if-ge p1, v3, :cond_1

    int-to-double v6, p1

    .line 1209
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    int-to-double v8, v3

    div-double/2addr v6, v8

    goto :goto_0

    :cond_1
    move-wide v6, v4

    .line 1211
    :goto_0
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    if-ge p2, v3, :cond_2

    int-to-double v8, p2

    .line 1212
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    int-to-double v10, v3

    div-double/2addr v8, v10

    goto :goto_1

    :cond_2
    move-wide v8, v4

    :goto_1
    cmpg-double v3, v6, v4

    if-nez v3, :cond_3

    cmpg-double v3, v8, v4

    if-nez v3, :cond_3

    .line 1228
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    .line 1229
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    goto :goto_2

    :cond_3
    cmpg-double v3, v6, v8

    if-gtz v3, :cond_4

    .line 1220
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    int-to-double v2, v2

    mul-double/2addr v2, v6

    double-to-int v2, v2

    move v3, p1

    goto :goto_2

    .line 1223
    :cond_4
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    int-to-double v2, v2

    mul-double/2addr v2, v8

    double-to-int v3, v2

    move v2, p2

    .line 1231
    :goto_2
    sget-object v4, Lcom/canhub/cropper/CropImageView;->Companion:Lcom/canhub/cropper/CropImageView$Companion;

    invoke-virtual {v4, v0, p1, v3}, Lcom/canhub/cropper/CropImageView$Companion;->getOnMeasureSpec$cropper_release(III)I

    move-result p1

    .line 1232
    invoke-virtual {v4, v1, p2, v2}, Lcom/canhub/cropper/CropImageView$Companion;->getOnMeasureSpec$cropper_release(III)I

    move-result p2

    .line 1233
    iput p1, p0, Lcom/canhub/cropper/CropImageView;->mLayoutWidth:I

    .line 1234
    iput p2, p0, Lcom/canhub/cropper/CropImageView;->mLayoutHeight:I

    .line 1235
    invoke-virtual {p0, p1, p2}, Lcom/canhub/cropper/CropImageView;->setMeasuredDimension(II)V

    return-void

    .line 1237
    :cond_5
    invoke-virtual {p0, p1, p2}, Lcom/canhub/cropper/CropImageView;->setMeasuredDimension(II)V

    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 10

    const-string/jumbo v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1131
    instance-of v0, p1, Landroid/os/Bundle;

    if-eqz v0, :cond_10

    .line 1133
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->bitmapLoadingWorkerJob:Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    if-nez v0, :cond_e

    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->imageUri:Landroid/net/Uri;

    if-nez v0, :cond_e

    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->originalBitmap:Landroid/graphics/Bitmap;

    if-nez v0, :cond_e

    iget v0, p0, Lcom/canhub/cropper/CropImageView;->mImageResource:I

    if-nez v0, :cond_e

    .line 1134
    move-object v0, p1

    check-cast v0, Landroid/os/Bundle;

    const-string v2, "LOADED_IMAGE_URI"

    .line 1908
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v2

    instance-of v3, v2, Landroid/net/Uri;

    if-nez v3, :cond_0

    move-object v2, v1

    :cond_0
    check-cast v2, Landroid/net/Uri;

    check-cast v2, Landroid/os/Parcelable;

    if-eqz v2, :cond_4

    .line 1136
    const-string v3, "LOADED_IMAGE_STATE_BITMAP_KEY"

    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_3

    .line 1138
    sget-object v4, Lcom/canhub/cropper/BitmapUtils;->INSTANCE:Lcom/canhub/cropper/BitmapUtils;

    invoke-virtual {v4}, Lcom/canhub/cropper/BitmapUtils;->getMStateBitmap()Landroid/util/Pair;

    move-result-object v4

    if-eqz v4, :cond_2

    .line 1139
    iget-object v5, v4, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-static {v5, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    iget-object v3, v4, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v3, Ljava/lang/ref/WeakReference;

    invoke-virtual {v3}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/graphics/Bitmap;

    goto :goto_0

    :cond_1
    move-object v3, v1

    :goto_0
    move-object v5, v3

    goto :goto_1

    :cond_2
    move-object v5, v1

    .line 1141
    :goto_1
    sget-object v3, Lcom/canhub/cropper/BitmapUtils;->INSTANCE:Lcom/canhub/cropper/BitmapUtils;

    invoke-virtual {v3, v1}, Lcom/canhub/cropper/BitmapUtils;->setMStateBitmap(Landroid/util/Pair;)V

    if-eqz v5, :cond_3

    .line 1142
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v3

    if-nez v3, :cond_3

    .line 1146
    move-object v7, v2

    check-cast v7, Landroid/net/Uri;

    .line 1147
    const-string v3, "LOADED_SAMPLE_SIZE"

    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v8

    const/4 v9, 0x0

    const/4 v6, 0x0

    move-object v4, p0

    .line 1143
    invoke-direct/range {v4 .. v9}, Lcom/canhub/cropper/CropImageView;->setBitmap(Landroid/graphics/Bitmap;ILandroid/net/Uri;II)V

    goto :goto_2

    :cond_3
    move-object v4, p0

    .line 1152
    :goto_2
    iget-object v3, v4, Lcom/canhub/cropper/CropImageView;->imageUri:Landroid/net/Uri;

    if-nez v3, :cond_7

    check-cast v2, Landroid/net/Uri;

    invoke-virtual {p0, v2}, Lcom/canhub/cropper/CropImageView;->setImageUriAsync(Landroid/net/Uri;)V

    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_3

    :cond_4
    move-object v4, p0

    .line 1154
    const-string v2, "LOADED_IMAGE_RESOURCE"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v2

    if-lez v2, :cond_5

    .line 1157
    invoke-virtual {p0, v2}, Lcom/canhub/cropper/CropImageView;->setImageResource(I)V

    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_3

    .line 1159
    :cond_5
    const-string v2, "LOADING_IMAGE_URI"

    .line 1913
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v2

    instance-of v3, v2, Landroid/net/Uri;

    if-nez v3, :cond_6

    move-object v2, v1

    :cond_6
    check-cast v2, Landroid/net/Uri;

    check-cast v2, Landroid/os/Parcelable;

    .line 1160
    check-cast v2, Landroid/net/Uri;

    if-eqz v2, :cond_7

    invoke-virtual {p0, v2}, Lcom/canhub/cropper/CropImageView;->setImageUriAsync(Landroid/net/Uri;)V

    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 1163
    :cond_7
    :goto_3
    const-string v2, "DEGREES_ROTATED"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v2

    iput v2, v4, Lcom/canhub/cropper/CropImageView;->mRestoreDegreesRotated:I

    .line 1164
    iput v2, v4, Lcom/canhub/cropper/CropImageView;->mDegreesRotated:I

    .line 1165
    const-string v2, "INITIAL_CROP_RECT"

    .line 1918
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v2

    instance-of v3, v2, Landroid/graphics/Rect;

    if-nez v3, :cond_8

    move-object v2, v1

    :cond_8
    check-cast v2, Landroid/graphics/Rect;

    check-cast v2, Landroid/os/Parcelable;

    .line 1165
    check-cast v2, Landroid/graphics/Rect;

    if-eqz v2, :cond_a

    .line 1167
    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    move-result v3

    if-gtz v3, :cond_9

    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    move-result v3

    if-lez v3, :cond_a

    .line 1169
    :cond_9
    iget-object v3, v4, Lcom/canhub/cropper/CropImageView;->mCropOverlayView:Lcom/canhub/cropper/CropOverlayView;

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v3, v2}, Lcom/canhub/cropper/CropOverlayView;->setInitialCropWindowRect(Landroid/graphics/Rect;)V

    .line 1171
    :cond_a
    const-string v2, "CROP_WINDOW_RECT"

    .line 1923
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v2

    instance-of v3, v2, Landroid/graphics/RectF;

    if-nez v3, :cond_b

    move-object v2, v1

    :cond_b
    check-cast v2, Landroid/graphics/RectF;

    check-cast v2, Landroid/os/Parcelable;

    .line 1171
    check-cast v2, Landroid/graphics/RectF;

    if-eqz v2, :cond_d

    .line 1172
    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    move-result v3

    const/4 v5, 0x0

    cmpl-float v3, v3, v5

    if-gtz v3, :cond_c

    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    move-result v3

    cmpl-float v3, v3, v5

    if-lez v3, :cond_d

    .line 1173
    :cond_c
    iput-object v2, v4, Lcom/canhub/cropper/CropImageView;->mRestoreCropWindowRect:Landroid/graphics/RectF;

    .line 1175
    :cond_d
    iget-object v2, v4, Lcom/canhub/cropper/CropImageView;->mCropOverlayView:Lcom/canhub/cropper/CropOverlayView;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1177
    const-string v3, "CROP_SHAPE"

    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1176
    invoke-static {v3}, Lcom/canhub/cropper/CropImageView$CropShape;->valueOf(Ljava/lang/String;)Lcom/canhub/cropper/CropImageView$CropShape;

    move-result-object v3

    .line 1175
    invoke-virtual {v2, v3}, Lcom/canhub/cropper/CropOverlayView;->setCropShape(Lcom/canhub/cropper/CropImageView$CropShape;)V

    .line 1180
    const-string v2, "CROP_AUTO_ZOOM_ENABLED"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v2

    iput-boolean v2, v4, Lcom/canhub/cropper/CropImageView;->mAutoZoomEnabled:Z

    .line 1181
    const-string v2, "CROP_MAX_ZOOM"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v2

    iput v2, v4, Lcom/canhub/cropper/CropImageView;->mMaxZoom:I

    .line 1182
    const-string v2, "CROP_FLIP_HORIZONTALLY"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v2

    iput-boolean v2, v4, Lcom/canhub/cropper/CropImageView;->mFlipHorizontally:Z

    .line 1183
    const-string v2, "CROP_FLIP_VERTICALLY"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v2

    iput-boolean v2, v4, Lcom/canhub/cropper/CropImageView;->mFlipVertically:Z

    .line 1184
    const-string v2, "SHOW_CROP_LABEL"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, v4, Lcom/canhub/cropper/CropImageView;->mShowCropLabel:Z

    .line 1185
    iget-object v2, v4, Lcom/canhub/cropper/CropImageView;->mCropOverlayView:Lcom/canhub/cropper/CropOverlayView;

    invoke-virtual {v2, v0}, Lcom/canhub/cropper/CropOverlayView;->setCropperTextLabelVisibility(Z)V

    goto :goto_4

    :cond_e
    move-object v4, p0

    .line 1187
    :goto_4
    check-cast p1, Landroid/os/Bundle;

    const-string v0, "instanceState"

    .line 1928
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    instance-of v0, p1, Landroid/os/Parcelable;

    if-nez v0, :cond_f

    goto :goto_5

    :cond_f
    move-object v1, p1

    .line 1187
    :goto_5
    invoke-super {p0, v1}, Landroid/widget/FrameLayout;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void

    :cond_10
    move-object v4, p0

    .line 1189
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 7

    .line 1084
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->imageUri:Landroid/net/Uri;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->originalBitmap:Landroid/graphics/Bitmap;

    if-nez v0, :cond_0

    iget v0, p0, Lcom/canhub/cropper/CropImageView;->mImageResource:I

    if-ge v0, v1, :cond_0

    .line 1085
    invoke-super {p0}, Landroid/widget/FrameLayout;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    return-object v0

    .line 1088
    :cond_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 1090
    iget-boolean v2, p0, Lcom/canhub/cropper/CropImageView;->isSaveBitmapToInstanceState:Z

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/canhub/cropper/CropImageView;->imageUri:Landroid/net/Uri;

    if-nez v2, :cond_1

    iget v2, p0, Lcom/canhub/cropper/CropImageView;->mImageResource:I

    if-ge v2, v1, :cond_1

    .line 1091
    sget-object v1, Lcom/canhub/cropper/BitmapUtils;->INSTANCE:Lcom/canhub/cropper/BitmapUtils;

    .line 1092
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "getContext(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1093
    iget-object v3, p0, Lcom/canhub/cropper/CropImageView;->originalBitmap:Landroid/graphics/Bitmap;

    .line 1094
    iget-object v4, p0, Lcom/canhub/cropper/CropImageView;->customOutputUri:Landroid/net/Uri;

    .line 1091
    invoke-virtual {v1, v2, v3, v4}, Lcom/canhub/cropper/BitmapUtils;->writeTempStateStoreBitmap(Landroid/content/Context;Landroid/graphics/Bitmap;Landroid/net/Uri;)Landroid/net/Uri;

    move-result-object v1

    goto :goto_0

    .line 1097
    :cond_1
    iget-object v1, p0, Lcom/canhub/cropper/CropImageView;->imageUri:Landroid/net/Uri;

    :goto_0
    if-eqz v1, :cond_2

    .line 1100
    iget-object v2, p0, Lcom/canhub/cropper/CropImageView;->originalBitmap:Landroid/graphics/Bitmap;

    if-eqz v2, :cond_2

    .line 1101
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    const-string/jumbo v3, "toString(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1102
    sget-object v3, Lcom/canhub/cropper/BitmapUtils;->INSTANCE:Lcom/canhub/cropper/BitmapUtils;

    new-instance v4, Landroid/util/Pair;

    new-instance v5, Ljava/lang/ref/WeakReference;

    iget-object v6, p0, Lcom/canhub/cropper/CropImageView;->originalBitmap:Landroid/graphics/Bitmap;

    invoke-direct {v5, v6}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-direct {v4, v2, v5}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v3, v4}, Lcom/canhub/cropper/BitmapUtils;->setMStateBitmap(Landroid/util/Pair;)V

    .line 1103
    const-string v3, "LOADED_IMAGE_STATE_BITMAP_KEY"

    invoke-virtual {v0, v3, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1106
    :cond_2
    iget-object v2, p0, Lcom/canhub/cropper/CropImageView;->bitmapLoadingWorkerJob:Ljava/lang/ref/WeakReference;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/canhub/cropper/BitmapLoadingWorkerJob;

    goto :goto_1

    :cond_3
    const/4 v2, 0x0

    :goto_1
    if-eqz v2, :cond_4

    .line 1108
    invoke-virtual {v2}, Lcom/canhub/cropper/BitmapLoadingWorkerJob;->getUri$cropper_release()Landroid/net/Uri;

    move-result-object v2

    check-cast v2, Landroid/os/Parcelable;

    const-string v3, "LOADING_IMAGE_URI"

    invoke-virtual {v0, v3, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 1111
    :cond_4
    const-string v2, "instanceState"

    invoke-super {p0}, Landroid/widget/FrameLayout;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 1112
    const-string v2, "LOADED_IMAGE_URI"

    check-cast v1, Landroid/os/Parcelable;

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 1113
    const-string v1, "LOADED_IMAGE_RESOURCE"

    iget v2, p0, Lcom/canhub/cropper/CropImageView;->mImageResource:I

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1114
    const-string v1, "LOADED_SAMPLE_SIZE"

    iget v2, p0, Lcom/canhub/cropper/CropImageView;->loadedSampleSize:I

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1115
    const-string v1, "DEGREES_ROTATED"

    iget v2, p0, Lcom/canhub/cropper/CropImageView;->mDegreesRotated:I

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1116
    iget-object v1, p0, Lcom/canhub/cropper/CropImageView;->mCropOverlayView:Lcom/canhub/cropper/CropOverlayView;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lcom/canhub/cropper/CropOverlayView;->getInitialCropWindowRect()Landroid/graphics/Rect;

    move-result-object v1

    check-cast v1, Landroid/os/Parcelable;

    const-string v2, "INITIAL_CROP_RECT"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 1117
    sget-object v1, Lcom/canhub/cropper/BitmapUtils;->INSTANCE:Lcom/canhub/cropper/BitmapUtils;

    invoke-virtual {v1}, Lcom/canhub/cropper/BitmapUtils;->getRECT()Landroid/graphics/RectF;

    move-result-object v1

    iget-object v2, p0, Lcom/canhub/cropper/CropImageView;->mCropOverlayView:Lcom/canhub/cropper/CropOverlayView;

    invoke-virtual {v2}, Lcom/canhub/cropper/CropOverlayView;->getCropWindowRect()Landroid/graphics/RectF;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 1118
    iget-object v1, p0, Lcom/canhub/cropper/CropImageView;->mImageMatrix:Landroid/graphics/Matrix;

    iget-object v2, p0, Lcom/canhub/cropper/CropImageView;->mImageInverseMatrix:Landroid/graphics/Matrix;

    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    .line 1119
    iget-object v1, p0, Lcom/canhub/cropper/CropImageView;->mImageInverseMatrix:Landroid/graphics/Matrix;

    sget-object v2, Lcom/canhub/cropper/BitmapUtils;->INSTANCE:Lcom/canhub/cropper/BitmapUtils;

    invoke-virtual {v2}, Lcom/canhub/cropper/BitmapUtils;->getRECT()Landroid/graphics/RectF;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 1120
    sget-object v1, Lcom/canhub/cropper/BitmapUtils;->INSTANCE:Lcom/canhub/cropper/BitmapUtils;

    invoke-virtual {v1}, Lcom/canhub/cropper/BitmapUtils;->getRECT()Landroid/graphics/RectF;

    move-result-object v1

    check-cast v1, Landroid/os/Parcelable;

    const-string v2, "CROP_WINDOW_RECT"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 1121
    iget-object v1, p0, Lcom/canhub/cropper/CropImageView;->mCropOverlayView:Lcom/canhub/cropper/CropOverlayView;

    invoke-virtual {v1}, Lcom/canhub/cropper/CropOverlayView;->getCropShape()Lcom/canhub/cropper/CropImageView$CropShape;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lcom/canhub/cropper/CropImageView$CropShape;->name()Ljava/lang/String;

    move-result-object v1

    const-string v2, "CROP_SHAPE"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1122
    const-string v1, "CROP_AUTO_ZOOM_ENABLED"

    iget-boolean v2, p0, Lcom/canhub/cropper/CropImageView;->mAutoZoomEnabled:Z

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 1123
    const-string v1, "CROP_MAX_ZOOM"

    iget v2, p0, Lcom/canhub/cropper/CropImageView;->mMaxZoom:I

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1124
    const-string v1, "CROP_FLIP_HORIZONTALLY"

    iget-boolean v2, p0, Lcom/canhub/cropper/CropImageView;->mFlipHorizontally:Z

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 1125
    const-string v1, "CROP_FLIP_VERTICALLY"

    iget-boolean v2, p0, Lcom/canhub/cropper/CropImageView;->mFlipVertically:Z

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 1126
    const-string v1, "SHOW_CROP_LABEL"

    iget-boolean v2, p0, Lcom/canhub/cropper/CropImageView;->mShowCropLabel:Z

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 1127
    check-cast v0, Landroid/os/Parcelable;

    return-object v0
.end method

.method public final onSetImageUriAsyncComplete$cropper_release(Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;)V
    .locals 7

    const-string/jumbo v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 911
    iput-object v0, p0, Lcom/canhub/cropper/CropImageView;->bitmapLoadingWorkerJob:Ljava/lang/ref/WeakReference;

    .line 912
    invoke-direct {p0}, Lcom/canhub/cropper/CropImageView;->setProgressBarVisibility()V

    .line 913
    invoke-virtual {p1}, Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;->getError()Ljava/lang/Exception;

    move-result-object v0

    if-nez v0, :cond_0

    .line 914
    invoke-virtual {p1}, Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;->getDegreesRotated()I

    move-result v0

    iput v0, p0, Lcom/canhub/cropper/CropImageView;->mInitialDegreesRotated:I

    .line 915
    invoke-virtual {p1}, Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;->getFlipHorizontally()Z

    move-result v0

    iput-boolean v0, p0, Lcom/canhub/cropper/CropImageView;->mFlipHorizontally:Z

    .line 916
    invoke-virtual {p1}, Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;->getFlipVertically()Z

    move-result v0

    iput-boolean v0, p0, Lcom/canhub/cropper/CropImageView;->mFlipVertically:Z

    .line 918
    invoke-virtual {p1}, Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v2

    .line 920
    invoke-virtual {p1}, Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;->getUri()Landroid/net/Uri;

    move-result-object v4

    .line 921
    invoke-virtual {p1}, Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;->getLoadSampleSize()I

    move-result v5

    .line 922
    invoke-virtual {p1}, Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;->getDegreesRotated()I

    move-result v6

    const/4 v3, 0x0

    move-object v1, p0

    .line 917
    invoke-direct/range {v1 .. v6}, Lcom/canhub/cropper/CropImageView;->setBitmap(Landroid/graphics/Bitmap;ILandroid/net/Uri;II)V

    goto :goto_0

    :cond_0
    move-object v1, p0

    .line 925
    :goto_0
    iget-object v0, v1, Lcom/canhub/cropper/CropImageView;->mOnSetImageUriCompleteListener:Lcom/canhub/cropper/CropImageView$OnSetImageUriCompleteListener;

    if-eqz v0, :cond_1

    .line 927
    invoke-virtual {p1}, Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;->getUri()Landroid/net/Uri;

    move-result-object v2

    .line 928
    invoke-virtual {p1}, Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;->getError()Ljava/lang/Exception;

    move-result-object p1

    .line 925
    invoke-interface {v0, p0, v2, p1}, Lcom/canhub/cropper/CropImageView$OnSetImageUriCompleteListener;->onSetImageUriComplete(Lcom/canhub/cropper/CropImageView;Landroid/net/Uri;Ljava/lang/Exception;)V

    :cond_1
    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 0

    .line 1289
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/FrameLayout;->onSizeChanged(IIII)V

    if-lez p3, :cond_0

    if-lez p4, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 1290
    :goto_0
    iput-boolean p1, p0, Lcom/canhub/cropper/CropImageView;->mSizeChanged:Z

    return-void
.end method

.method public final resetCropRect()V
    .locals 3

    const/high16 v0, 0x3f800000    # 1.0f

    .line 580
    iput v0, p0, Lcom/canhub/cropper/CropImageView;->mZoom:F

    const/4 v0, 0x0

    .line 581
    iput v0, p0, Lcom/canhub/cropper/CropImageView;->mZoomOffsetX:F

    .line 582
    iput v0, p0, Lcom/canhub/cropper/CropImageView;->mZoomOffsetY:F

    .line 583
    iget v0, p0, Lcom/canhub/cropper/CropImageView;->mInitialDegreesRotated:I

    iput v0, p0, Lcom/canhub/cropper/CropImageView;->mDegreesRotated:I

    const/4 v0, 0x0

    .line 584
    iput-boolean v0, p0, Lcom/canhub/cropper/CropImageView;->mFlipHorizontally:Z

    .line 585
    iput-boolean v0, p0, Lcom/canhub/cropper/CropImageView;->mFlipVertically:Z

    .line 587
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView;->getWidth()I

    move-result v1

    int-to-float v1, v1

    .line 588
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView;->getHeight()I

    move-result v2

    int-to-float v2, v2

    .line 586
    invoke-direct {p0, v1, v2, v0, v0}, Lcom/canhub/cropper/CropImageView;->applyImageMatrix(FFZZ)V

    .line 592
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->mCropOverlayView:Lcom/canhub/cropper/CropOverlayView;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/canhub/cropper/CropOverlayView;->resetCropWindowRect()V

    return-void
.end method

.method public final rotateImage(I)V
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p1

    .line 802
    iget-object v2, v0, Lcom/canhub/cropper/CropImageView;->originalBitmap:Landroid/graphics/Bitmap;

    if-eqz v2, :cond_6

    if-gez v1, :cond_0

    .line 806
    rem-int/lit16 v1, v1, 0x168

    add-int/lit16 v1, v1, 0x168

    goto :goto_0

    .line 808
    :cond_0
    rem-int/lit16 v1, v1, 0x168

    .line 811
    :goto_0
    iget-object v2, v0, Lcom/canhub/cropper/CropImageView;->mCropOverlayView:Lcom/canhub/cropper/CropOverlayView;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lcom/canhub/cropper/CropOverlayView;->isFixAspectRatio()Z

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-nez v2, :cond_2

    const/16 v2, 0x2e

    if-gt v2, v1, :cond_1

    const/16 v2, 0x87

    if-ge v1, v2, :cond_1

    goto :goto_1

    :cond_1
    const/16 v2, 0xd8

    if-gt v2, v1, :cond_2

    const/16 v2, 0x131

    if-ge v1, v2, :cond_2

    :goto_1
    move v2, v3

    goto :goto_2

    :cond_2
    move v2, v4

    .line 815
    :goto_2
    sget-object v5, Lcom/canhub/cropper/BitmapUtils;->INSTANCE:Lcom/canhub/cropper/BitmapUtils;

    invoke-virtual {v5}, Lcom/canhub/cropper/BitmapUtils;->getRECT()Landroid/graphics/RectF;

    move-result-object v5

    iget-object v6, v0, Lcom/canhub/cropper/CropImageView;->mCropOverlayView:Lcom/canhub/cropper/CropOverlayView;

    invoke-virtual {v6}, Lcom/canhub/cropper/CropOverlayView;->getCropWindowRect()Landroid/graphics/RectF;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 817
    sget-object v5, Lcom/canhub/cropper/BitmapUtils;->INSTANCE:Lcom/canhub/cropper/BitmapUtils;

    invoke-virtual {v5}, Lcom/canhub/cropper/BitmapUtils;->getRECT()Landroid/graphics/RectF;

    move-result-object v5

    if-eqz v2, :cond_3

    invoke-virtual {v5}, Landroid/graphics/RectF;->height()F

    move-result v5

    goto :goto_3

    :cond_3
    invoke-virtual {v5}, Landroid/graphics/RectF;->width()F

    move-result v5

    :goto_3
    const/high16 v6, 0x40000000    # 2.0f

    div-float/2addr v5, v6

    .line 819
    sget-object v7, Lcom/canhub/cropper/BitmapUtils;->INSTANCE:Lcom/canhub/cropper/BitmapUtils;

    invoke-virtual {v7}, Lcom/canhub/cropper/BitmapUtils;->getRECT()Landroid/graphics/RectF;

    move-result-object v7

    if-eqz v2, :cond_4

    invoke-virtual {v7}, Landroid/graphics/RectF;->width()F

    move-result v7

    goto :goto_4

    :cond_4
    invoke-virtual {v7}, Landroid/graphics/RectF;->height()F

    move-result v7

    :goto_4
    div-float/2addr v7, v6

    if-eqz v2, :cond_5

    .line 822
    iget-boolean v2, v0, Lcom/canhub/cropper/CropImageView;->mFlipHorizontally:Z

    .line 823
    iget-boolean v6, v0, Lcom/canhub/cropper/CropImageView;->mFlipVertically:Z

    iput-boolean v6, v0, Lcom/canhub/cropper/CropImageView;->mFlipHorizontally:Z

    .line 824
    iput-boolean v2, v0, Lcom/canhub/cropper/CropImageView;->mFlipVertically:Z

    .line 826
    :cond_5
    iget-object v2, v0, Lcom/canhub/cropper/CropImageView;->mImageMatrix:Landroid/graphics/Matrix;

    iget-object v6, v0, Lcom/canhub/cropper/CropImageView;->mImageInverseMatrix:Landroid/graphics/Matrix;

    invoke-virtual {v2, v6}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    .line 827
    sget-object v2, Lcom/canhub/cropper/BitmapUtils;->INSTANCE:Lcom/canhub/cropper/BitmapUtils;

    invoke-virtual {v2}, Lcom/canhub/cropper/BitmapUtils;->getPOINTS()[F

    move-result-object v2

    sget-object v6, Lcom/canhub/cropper/BitmapUtils;->INSTANCE:Lcom/canhub/cropper/BitmapUtils;

    invoke-virtual {v6}, Lcom/canhub/cropper/BitmapUtils;->getRECT()Landroid/graphics/RectF;

    move-result-object v6

    invoke-virtual {v6}, Landroid/graphics/RectF;->centerX()F

    move-result v6

    aput v6, v2, v4

    .line 828
    sget-object v2, Lcom/canhub/cropper/BitmapUtils;->INSTANCE:Lcom/canhub/cropper/BitmapUtils;

    invoke-virtual {v2}, Lcom/canhub/cropper/BitmapUtils;->getPOINTS()[F

    move-result-object v2

    sget-object v6, Lcom/canhub/cropper/BitmapUtils;->INSTANCE:Lcom/canhub/cropper/BitmapUtils;

    invoke-virtual {v6}, Lcom/canhub/cropper/BitmapUtils;->getRECT()Landroid/graphics/RectF;

    move-result-object v6

    invoke-virtual {v6}, Landroid/graphics/RectF;->centerY()F

    move-result v6

    aput v6, v2, v3

    .line 829
    sget-object v2, Lcom/canhub/cropper/BitmapUtils;->INSTANCE:Lcom/canhub/cropper/BitmapUtils;

    invoke-virtual {v2}, Lcom/canhub/cropper/BitmapUtils;->getPOINTS()[F

    move-result-object v2

    const/4 v6, 0x2

    const/4 v8, 0x0

    aput v8, v2, v6

    .line 830
    sget-object v2, Lcom/canhub/cropper/BitmapUtils;->INSTANCE:Lcom/canhub/cropper/BitmapUtils;

    invoke-virtual {v2}, Lcom/canhub/cropper/BitmapUtils;->getPOINTS()[F

    move-result-object v2

    const/4 v9, 0x3

    aput v8, v2, v9

    .line 831
    sget-object v2, Lcom/canhub/cropper/BitmapUtils;->INSTANCE:Lcom/canhub/cropper/BitmapUtils;

    invoke-virtual {v2}, Lcom/canhub/cropper/BitmapUtils;->getPOINTS()[F

    move-result-object v2

    const/4 v10, 0x4

    const/high16 v11, 0x3f800000    # 1.0f

    aput v11, v2, v10

    .line 832
    sget-object v2, Lcom/canhub/cropper/BitmapUtils;->INSTANCE:Lcom/canhub/cropper/BitmapUtils;

    invoke-virtual {v2}, Lcom/canhub/cropper/BitmapUtils;->getPOINTS()[F

    move-result-object v2

    const/4 v12, 0x5

    aput v8, v2, v12

    .line 833
    iget-object v2, v0, Lcom/canhub/cropper/CropImageView;->mImageInverseMatrix:Landroid/graphics/Matrix;

    sget-object v8, Lcom/canhub/cropper/BitmapUtils;->INSTANCE:Lcom/canhub/cropper/BitmapUtils;

    invoke-virtual {v8}, Lcom/canhub/cropper/BitmapUtils;->getPOINTS()[F

    move-result-object v8

    invoke-virtual {v2, v8}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 835
    iget v2, v0, Lcom/canhub/cropper/CropImageView;->mDegreesRotated:I

    add-int/2addr v2, v1

    rem-int/lit16 v2, v2, 0x168

    iput v2, v0, Lcom/canhub/cropper/CropImageView;->mDegreesRotated:I

    .line 837
    invoke-virtual {v0}, Lcom/canhub/cropper/CropImageView;->getWidth()I

    move-result v1

    int-to-float v1, v1

    .line 838
    invoke-virtual {v0}, Lcom/canhub/cropper/CropImageView;->getHeight()I

    move-result v2

    int-to-float v2, v2

    .line 836
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/canhub/cropper/CropImageView;->applyImageMatrix(FFZZ)V

    .line 843
    iget-object v1, v0, Lcom/canhub/cropper/CropImageView;->mImageMatrix:Landroid/graphics/Matrix;

    sget-object v2, Lcom/canhub/cropper/BitmapUtils;->INSTANCE:Lcom/canhub/cropper/BitmapUtils;

    invoke-virtual {v2}, Lcom/canhub/cropper/BitmapUtils;->getPOINTS2()[F

    move-result-object v2

    sget-object v8, Lcom/canhub/cropper/BitmapUtils;->INSTANCE:Lcom/canhub/cropper/BitmapUtils;

    invoke-virtual {v8}, Lcom/canhub/cropper/BitmapUtils;->getPOINTS()[F

    move-result-object v8

    invoke-virtual {v1, v2, v8}, Landroid/graphics/Matrix;->mapPoints([F[F)V

    .line 844
    iget v1, v0, Lcom/canhub/cropper/CropImageView;->mZoom:F

    .line 845
    sget-object v2, Lcom/canhub/cropper/BitmapUtils;->INSTANCE:Lcom/canhub/cropper/BitmapUtils;

    invoke-virtual {v2}, Lcom/canhub/cropper/BitmapUtils;->getPOINTS2()[F

    move-result-object v2

    aget v2, v2, v10

    sget-object v8, Lcom/canhub/cropper/BitmapUtils;->INSTANCE:Lcom/canhub/cropper/BitmapUtils;

    invoke-virtual {v8}, Lcom/canhub/cropper/BitmapUtils;->getPOINTS2()[F

    move-result-object v8

    aget v8, v8, v6

    sub-float/2addr v2, v8

    float-to-double v13, v2

    move v2, v6

    move/from16 p1, v7

    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    invoke-static {v13, v14, v6, v7}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v13

    .line 846
    sget-object v8, Lcom/canhub/cropper/BitmapUtils;->INSTANCE:Lcom/canhub/cropper/BitmapUtils;

    invoke-virtual {v8}, Lcom/canhub/cropper/BitmapUtils;->getPOINTS2()[F

    move-result-object v8

    aget v8, v8, v12

    sget-object v15, Lcom/canhub/cropper/BitmapUtils;->INSTANCE:Lcom/canhub/cropper/BitmapUtils;

    invoke-virtual {v15}, Lcom/canhub/cropper/BitmapUtils;->getPOINTS2()[F

    move-result-object v15

    aget v15, v15, v9

    sub-float/2addr v8, v15

    move v15, v9

    move/from16 v16, v10

    float-to-double v9, v8

    invoke-static {v9, v10, v6, v7}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v8

    add-double/2addr v13, v8

    .line 845
    invoke-static {v13, v14}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v8

    double-to-float v8, v8

    div-float/2addr v1, v8

    .line 844
    iput v1, v0, Lcom/canhub/cropper/CropImageView;->mZoom:F

    .line 848
    invoke-static {v1, v11}, Ljava/lang/Math;->max(FF)F

    move-result v1

    iput v1, v0, Lcom/canhub/cropper/CropImageView;->mZoom:F

    .line 850
    invoke-virtual {v0}, Lcom/canhub/cropper/CropImageView;->getWidth()I

    move-result v1

    int-to-float v1, v1

    .line 851
    invoke-virtual {v0}, Lcom/canhub/cropper/CropImageView;->getHeight()I

    move-result v8

    int-to-float v8, v8

    .line 849
    invoke-direct {v0, v1, v8, v3, v4}, Lcom/canhub/cropper/CropImageView;->applyImageMatrix(FFZZ)V

    .line 855
    iget-object v1, v0, Lcom/canhub/cropper/CropImageView;->mImageMatrix:Landroid/graphics/Matrix;

    sget-object v8, Lcom/canhub/cropper/BitmapUtils;->INSTANCE:Lcom/canhub/cropper/BitmapUtils;

    invoke-virtual {v8}, Lcom/canhub/cropper/BitmapUtils;->getPOINTS2()[F

    move-result-object v8

    sget-object v9, Lcom/canhub/cropper/BitmapUtils;->INSTANCE:Lcom/canhub/cropper/BitmapUtils;

    invoke-virtual {v9}, Lcom/canhub/cropper/BitmapUtils;->getPOINTS()[F

    move-result-object v9

    invoke-virtual {v1, v8, v9}, Landroid/graphics/Matrix;->mapPoints([F[F)V

    .line 858
    sget-object v1, Lcom/canhub/cropper/BitmapUtils;->INSTANCE:Lcom/canhub/cropper/BitmapUtils;

    invoke-virtual {v1}, Lcom/canhub/cropper/BitmapUtils;->getPOINTS2()[F

    move-result-object v1

    aget v1, v1, v16

    sget-object v8, Lcom/canhub/cropper/BitmapUtils;->INSTANCE:Lcom/canhub/cropper/BitmapUtils;

    invoke-virtual {v8}, Lcom/canhub/cropper/BitmapUtils;->getPOINTS2()[F

    move-result-object v8

    aget v2, v8, v2

    sub-float/2addr v1, v2

    float-to-double v1, v1

    invoke-static {v1, v2, v6, v7}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v1

    .line 859
    sget-object v8, Lcom/canhub/cropper/BitmapUtils;->INSTANCE:Lcom/canhub/cropper/BitmapUtils;

    invoke-virtual {v8}, Lcom/canhub/cropper/BitmapUtils;->getPOINTS2()[F

    move-result-object v8

    aget v8, v8, v12

    sget-object v9, Lcom/canhub/cropper/BitmapUtils;->INSTANCE:Lcom/canhub/cropper/BitmapUtils;

    invoke-virtual {v9}, Lcom/canhub/cropper/BitmapUtils;->getPOINTS2()[F

    move-result-object v9

    aget v9, v9, v15

    sub-float/2addr v8, v9

    float-to-double v8, v8

    invoke-static {v8, v9, v6, v7}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v6

    add-double/2addr v1, v6

    .line 858
    invoke-static {v1, v2}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v1

    double-to-float v1, v1

    mul-float/2addr v5, v1

    mul-float v7, p1, v1

    .line 865
    sget-object v1, Lcom/canhub/cropper/BitmapUtils;->INSTANCE:Lcom/canhub/cropper/BitmapUtils;

    invoke-virtual {v1}, Lcom/canhub/cropper/BitmapUtils;->getRECT()Landroid/graphics/RectF;

    move-result-object v1

    sget-object v2, Lcom/canhub/cropper/BitmapUtils;->INSTANCE:Lcom/canhub/cropper/BitmapUtils;

    invoke-virtual {v2}, Lcom/canhub/cropper/BitmapUtils;->getPOINTS2()[F

    move-result-object v2

    aget v2, v2, v4

    sub-float/2addr v2, v5

    sget-object v6, Lcom/canhub/cropper/BitmapUtils;->INSTANCE:Lcom/canhub/cropper/BitmapUtils;

    invoke-virtual {v6}, Lcom/canhub/cropper/BitmapUtils;->getPOINTS2()[F

    move-result-object v6

    aget v6, v6, v3

    sub-float/2addr v6, v7

    sget-object v8, Lcom/canhub/cropper/BitmapUtils;->INSTANCE:Lcom/canhub/cropper/BitmapUtils;

    invoke-virtual {v8}, Lcom/canhub/cropper/BitmapUtils;->getPOINTS2()[F

    move-result-object v8

    aget v8, v8, v4

    add-float/2addr v8, v5

    .line 866
    sget-object v5, Lcom/canhub/cropper/BitmapUtils;->INSTANCE:Lcom/canhub/cropper/BitmapUtils;

    invoke-virtual {v5}, Lcom/canhub/cropper/BitmapUtils;->getPOINTS2()[F

    move-result-object v5

    aget v5, v5, v3

    add-float/2addr v5, v7

    .line 865
    invoke-virtual {v1, v2, v6, v8, v5}, Landroid/graphics/RectF;->set(FFFF)V

    .line 867
    iget-object v1, v0, Lcom/canhub/cropper/CropImageView;->mCropOverlayView:Lcom/canhub/cropper/CropOverlayView;

    invoke-virtual {v1}, Lcom/canhub/cropper/CropOverlayView;->resetCropOverlayView()V

    .line 868
    iget-object v1, v0, Lcom/canhub/cropper/CropImageView;->mCropOverlayView:Lcom/canhub/cropper/CropOverlayView;

    sget-object v2, Lcom/canhub/cropper/BitmapUtils;->INSTANCE:Lcom/canhub/cropper/BitmapUtils;

    invoke-virtual {v2}, Lcom/canhub/cropper/BitmapUtils;->getRECT()Landroid/graphics/RectF;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/canhub/cropper/CropOverlayView;->setCropWindowRect(Landroid/graphics/RectF;)V

    .line 870
    invoke-virtual {v0}, Lcom/canhub/cropper/CropImageView;->getWidth()I

    move-result v1

    int-to-float v1, v1

    .line 871
    invoke-virtual {v0}, Lcom/canhub/cropper/CropImageView;->getHeight()I

    move-result v2

    int-to-float v2, v2

    .line 869
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/canhub/cropper/CropImageView;->applyImageMatrix(FFZZ)V

    .line 875
    invoke-direct {v0, v4, v4}, Lcom/canhub/cropper/CropImageView;->handleCropWindowChanged(ZZ)V

    .line 878
    iget-object v1, v0, Lcom/canhub/cropper/CropImageView;->mCropOverlayView:Lcom/canhub/cropper/CropOverlayView;

    invoke-virtual {v1}, Lcom/canhub/cropper/CropOverlayView;->fixCurrentCropWindowRect()V

    :cond_6
    return-void
.end method

.method public final setAspectRatio(II)V
    .locals 1

    .line 364
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->mCropOverlayView:Lcom/canhub/cropper/CropOverlayView;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Lcom/canhub/cropper/CropOverlayView;->setAspectRatioX(I)V

    .line 365
    iget-object p1, p0, Lcom/canhub/cropper/CropImageView;->mCropOverlayView:Lcom/canhub/cropper/CropOverlayView;

    invoke-virtual {p1, p2}, Lcom/canhub/cropper/CropOverlayView;->setAspectRatioY(I)V

    .line 366
    iget-object p1, p0, Lcom/canhub/cropper/CropImageView;->mCropOverlayView:Lcom/canhub/cropper/CropOverlayView;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lcom/canhub/cropper/CropOverlayView;->setFixedAspectRatio(Z)V

    return-void
.end method

.method public final setAutoZoomEnabled(Z)V
    .locals 1

    .line 233
    iget-boolean v0, p0, Lcom/canhub/cropper/CropImageView;->mAutoZoomEnabled:Z

    if-eq v0, p1, :cond_0

    .line 234
    iput-boolean p1, p0, Lcom/canhub/cropper/CropImageView;->mAutoZoomEnabled:Z

    const/4 p1, 0x0

    .line 235
    invoke-direct {p0, p1, p1}, Lcom/canhub/cropper/CropImageView;->handleCropWindowChanged(ZZ)V

    .line 236
    iget-object p1, p0, Lcom/canhub/cropper/CropImageView;->mCropOverlayView:Lcom/canhub/cropper/CropOverlayView;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/canhub/cropper/CropOverlayView;->invalidate()V

    :cond_0
    return-void
.end method

.method public final setCenterMoveEnabled(Z)V
    .locals 1

    .line 250
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->mCropOverlayView:Lcom/canhub/cropper/CropOverlayView;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Lcom/canhub/cropper/CropOverlayView;->setCenterMoveEnabled(Z)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    .line 251
    invoke-direct {p0, p1, p1}, Lcom/canhub/cropper/CropImageView;->handleCropWindowChanged(ZZ)V

    .line 252
    iget-object p1, p0, Lcom/canhub/cropper/CropImageView;->mCropOverlayView:Lcom/canhub/cropper/CropOverlayView;

    invoke-virtual {p1}, Lcom/canhub/cropper/CropOverlayView;->invalidate()V

    :cond_0
    return-void
.end method

.method public final setCornerShape(Lcom/canhub/cropper/CropImageView$CropCornerShape;)V
    .locals 1

    .line 226
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->mCropOverlayView:Lcom/canhub/cropper/CropOverlayView;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Lcom/canhub/cropper/CropOverlayView;->setCropCornerShape(Lcom/canhub/cropper/CropImageView$CropCornerShape;)V

    return-void
.end method

.method public final setCropLabelText(Ljava/lang/String;)V
    .locals 1

    const-string v0, "cropLabelText"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 444
    iput-object p1, p0, Lcom/canhub/cropper/CropImageView;->mCropTextLabel:Ljava/lang/String;

    .line 445
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->mCropOverlayView:Lcom/canhub/cropper/CropOverlayView;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/canhub/cropper/CropOverlayView;->setCropLabelText(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final setCropLabelTextColor(I)V
    .locals 1

    .line 456
    iput p1, p0, Lcom/canhub/cropper/CropImageView;->mCropLabelTextColor:I

    .line 457
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->mCropOverlayView:Lcom/canhub/cropper/CropOverlayView;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/canhub/cropper/CropOverlayView;->setCropLabelTextColor(I)V

    :cond_0
    return-void
.end method

.method public final setCropLabelTextSize(F)V
    .locals 1

    .line 450
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView;->getCropLabelTextSize()F

    move-result v0

    iput v0, p0, Lcom/canhub/cropper/CropImageView;->mCropLabelTextSize:F

    .line 451
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->mCropOverlayView:Lcom/canhub/cropper/CropOverlayView;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/canhub/cropper/CropOverlayView;->setCropLabelTextSize(F)V

    :cond_0
    return-void
.end method

.method public final setCropRect(Landroid/graphics/Rect;)V
    .locals 1

    .line 525
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->mCropOverlayView:Lcom/canhub/cropper/CropOverlayView;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Lcom/canhub/cropper/CropOverlayView;->setInitialCropWindowRect(Landroid/graphics/Rect;)V

    return-void
.end method

.method public final setCropShape(Lcom/canhub/cropper/CropImageView$CropShape;)V
    .locals 1

    .line 217
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->mCropOverlayView:Lcom/canhub/cropper/CropOverlayView;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Lcom/canhub/cropper/CropOverlayView;->setCropShape(Lcom/canhub/cropper/CropImageView$CropShape;)V

    return-void
.end method

.method public final setCustomOutputUri(Landroid/net/Uri;)V
    .locals 0

    .line 325
    iput-object p1, p0, Lcom/canhub/cropper/CropImageView;->customOutputUri:Landroid/net/Uri;

    return-void
.end method

.method public final setFixedAspectRatio(Z)V
    .locals 1

    .line 306
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->mCropOverlayView:Lcom/canhub/cropper/CropOverlayView;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Lcom/canhub/cropper/CropOverlayView;->setFixedAspectRatio(Z)V

    return-void
.end method

.method public final setFlippedHorizontally(Z)V
    .locals 3

    .line 313
    iget-boolean v0, p0, Lcom/canhub/cropper/CropImageView;->mFlipHorizontally:Z

    if-eq v0, p1, :cond_0

    .line 314
    iput-boolean p1, p0, Lcom/canhub/cropper/CropImageView;->mFlipHorizontally:Z

    .line 316
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView;->getWidth()I

    move-result p1

    int-to-float p1, p1

    .line 317
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView;->getHeight()I

    move-result v0

    int-to-float v0, v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 315
    invoke-direct {p0, p1, v0, v1, v2}, Lcom/canhub/cropper/CropImageView;->applyImageMatrix(FFZZ)V

    :cond_0
    return-void
.end method

.method public final setFlippedVertically(Z)V
    .locals 3

    .line 331
    iget-boolean v0, p0, Lcom/canhub/cropper/CropImageView;->mFlipVertically:Z

    if-eq v0, p1, :cond_0

    .line 332
    iput-boolean p1, p0, Lcom/canhub/cropper/CropImageView;->mFlipVertically:Z

    .line 334
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView;->getWidth()I

    move-result p1

    int-to-float p1, p1

    .line 335
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView;->getHeight()I

    move-result v0

    int-to-float v0, v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 333
    invoke-direct {p0, p1, v0, v1, v2}, Lcom/canhub/cropper/CropImageView;->applyImageMatrix(FFZZ)V

    :cond_0
    return-void
.end method

.method public final setGuidelines(Lcom/canhub/cropper/CropImageView$Guidelines;)V
    .locals 1

    .line 349
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->mCropOverlayView:Lcom/canhub/cropper/CropOverlayView;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Lcom/canhub/cropper/CropOverlayView;->setGuidelines(Lcom/canhub/cropper/CropImageView$Guidelines;)V

    return-void
.end method

.method public final setImageBitmap(Landroid/graphics/Bitmap;)V
    .locals 8

    .line 728
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->mCropOverlayView:Lcom/canhub/cropper/CropOverlayView;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/canhub/cropper/CropOverlayView;->setInitialCropWindowRect(Landroid/graphics/Rect;)V

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, p0

    move-object v3, p1

    .line 729
    invoke-direct/range {v2 .. v7}, Lcom/canhub/cropper/CropImageView;->setBitmap(Landroid/graphics/Bitmap;ILandroid/net/Uri;II)V

    return-void
.end method

.method public final setImageBitmap(Landroid/graphics/Bitmap;Landroidx/exifinterface/media/ExifInterface;)V
    .locals 7

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    .line 751
    sget-object v0, Lcom/canhub/cropper/BitmapUtils;->INSTANCE:Lcom/canhub/cropper/BitmapUtils;

    invoke-virtual {v0, p1, p2}, Lcom/canhub/cropper/BitmapUtils;->orientateBitmapByExif(Landroid/graphics/Bitmap;Landroidx/exifinterface/media/ExifInterface;)Lcom/canhub/cropper/BitmapUtils$RotateBitmapResult;

    move-result-object p1

    .line 752
    invoke-virtual {p1}, Lcom/canhub/cropper/BitmapUtils$RotateBitmapResult;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object p2

    .line 753
    invoke-virtual {p1}, Lcom/canhub/cropper/BitmapUtils$RotateBitmapResult;->getDegrees()I

    move-result v0

    .line 754
    invoke-virtual {p1}, Lcom/canhub/cropper/BitmapUtils$RotateBitmapResult;->getFlipHorizontally()Z

    move-result v1

    iput-boolean v1, p0, Lcom/canhub/cropper/CropImageView;->mFlipHorizontally:Z

    .line 755
    invoke-virtual {p1}, Lcom/canhub/cropper/BitmapUtils$RotateBitmapResult;->getFlipVertically()Z

    move-result v1

    iput-boolean v1, p0, Lcom/canhub/cropper/CropImageView;->mFlipVertically:Z

    .line 756
    invoke-virtual {p1}, Lcom/canhub/cropper/BitmapUtils$RotateBitmapResult;->getDegrees()I

    move-result p1

    iput p1, p0, Lcom/canhub/cropper/CropImageView;->mInitialDegreesRotated:I

    move-object v2, p2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    move-object v2, p1

    :goto_0
    move v6, v0

    .line 761
    iget-object p1, p0, Lcom/canhub/cropper/CropImageView;->mCropOverlayView:Lcom/canhub/cropper/CropOverlayView;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/canhub/cropper/CropOverlayView;->setInitialCropWindowRect(Landroid/graphics/Rect;)V

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v3, 0x0

    move-object v1, p0

    .line 762
    invoke-direct/range {v1 .. v6}, Lcom/canhub/cropper/CropImageView;->setBitmap(Landroid/graphics/Bitmap;ILandroid/net/Uri;II)V

    return-void
.end method

.method public final setImageCropOptions(Lcom/canhub/cropper/CropImageOptions;)V
    .locals 1

    const-string v0, "options"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 370
    iget-object v0, p1, Lcom/canhub/cropper/CropImageOptions;->scaleType:Lcom/canhub/cropper/CropImageView$ScaleType;

    invoke-virtual {p0, v0}, Lcom/canhub/cropper/CropImageView;->setScaleType(Lcom/canhub/cropper/CropImageView$ScaleType;)V

    .line 371
    iget-object v0, p1, Lcom/canhub/cropper/CropImageOptions;->customOutputUri:Landroid/net/Uri;

    iput-object v0, p0, Lcom/canhub/cropper/CropImageView;->customOutputUri:Landroid/net/Uri;

    .line 372
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->mCropOverlayView:Lcom/canhub/cropper/CropOverlayView;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/canhub/cropper/CropOverlayView;->setInitialAttributeValues(Lcom/canhub/cropper/CropImageOptions;)V

    .line 373
    :cond_0
    iget-boolean v0, p1, Lcom/canhub/cropper/CropImageOptions;->multiTouchEnabled:Z

    invoke-virtual {p0, v0}, Lcom/canhub/cropper/CropImageView;->setMultiTouchEnabled(Z)V

    .line 374
    iget-boolean v0, p1, Lcom/canhub/cropper/CropImageOptions;->centerMoveEnabled:Z

    invoke-virtual {p0, v0}, Lcom/canhub/cropper/CropImageView;->setCenterMoveEnabled(Z)V

    .line 375
    iget-boolean v0, p1, Lcom/canhub/cropper/CropImageOptions;->showCropOverlay:Z

    invoke-virtual {p0, v0}, Lcom/canhub/cropper/CropImageView;->setShowCropOverlay(Z)V

    .line 376
    iget-boolean v0, p1, Lcom/canhub/cropper/CropImageOptions;->showProgressBar:Z

    invoke-virtual {p0, v0}, Lcom/canhub/cropper/CropImageView;->setShowProgressBar(Z)V

    .line 377
    iget-boolean v0, p1, Lcom/canhub/cropper/CropImageOptions;->autoZoomEnabled:Z

    invoke-virtual {p0, v0}, Lcom/canhub/cropper/CropImageView;->setAutoZoomEnabled(Z)V

    .line 378
    iget v0, p1, Lcom/canhub/cropper/CropImageOptions;->maxZoom:I

    invoke-virtual {p0, v0}, Lcom/canhub/cropper/CropImageView;->setMaxZoom(I)V

    .line 379
    iget-boolean v0, p1, Lcom/canhub/cropper/CropImageOptions;->flipHorizontally:Z

    invoke-virtual {p0, v0}, Lcom/canhub/cropper/CropImageView;->setFlippedHorizontally(Z)V

    .line 380
    iget-boolean v0, p1, Lcom/canhub/cropper/CropImageOptions;->flipVertically:Z

    invoke-virtual {p0, v0}, Lcom/canhub/cropper/CropImageView;->setFlippedVertically(Z)V

    .line 381
    iget-boolean v0, p1, Lcom/canhub/cropper/CropImageOptions;->autoZoomEnabled:Z

    iput-boolean v0, p0, Lcom/canhub/cropper/CropImageView;->mAutoZoomEnabled:Z

    .line 382
    iget-boolean v0, p1, Lcom/canhub/cropper/CropImageOptions;->showCropOverlay:Z

    iput-boolean v0, p0, Lcom/canhub/cropper/CropImageView;->mShowCropOverlay:Z

    .line 383
    iget-boolean v0, p1, Lcom/canhub/cropper/CropImageOptions;->showProgressBar:Z

    iput-boolean v0, p0, Lcom/canhub/cropper/CropImageView;->mShowProgressBar:Z

    .line 384
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->mProgressBar:Landroid/widget/ProgressBar;

    iget p1, p1, Lcom/canhub/cropper/CropImageOptions;->progressBarColor:I

    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setIndeterminateTintList(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public final setImageResource(I)V
    .locals 7

    if-eqz p1, :cond_0

    .line 469
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->mCropOverlayView:Lcom/canhub/cropper/CropOverlayView;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/canhub/cropper/CropOverlayView;->setInitialCropWindowRect(Landroid/graphics/Rect;)V

    .line 470
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-static {v0, p1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v2

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move v3, p1

    .line 471
    invoke-direct/range {v1 .. v6}, Lcom/canhub/cropper/CropImageView;->setBitmap(Landroid/graphics/Bitmap;ILandroid/net/Uri;II)V

    :cond_0
    return-void
.end method

.method public final setImageUriAsync(Landroid/net/Uri;)V
    .locals 4

    if-eqz p1, :cond_2

    .line 780
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->bitmapLoadingWorkerJob:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/canhub/cropper/BitmapLoadingWorkerJob;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/canhub/cropper/BitmapLoadingWorkerJob;->cancel()V

    .line 781
    :cond_0
    invoke-direct {p0}, Lcom/canhub/cropper/CropImageView;->clearImageInt()V

    .line 782
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->mCropOverlayView:Lcom/canhub/cropper/CropOverlayView;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/canhub/cropper/CropOverlayView;->setInitialCropWindowRect(Landroid/graphics/Rect;)V

    .line 783
    new-instance v0, Ljava/lang/ref/WeakReference;

    new-instance v1, Lcom/canhub/cropper/BitmapLoadingWorkerJob;

    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "getContext(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, v2, p0, p1}, Lcom/canhub/cropper/BitmapLoadingWorkerJob;-><init>(Landroid/content/Context;Lcom/canhub/cropper/CropImageView;Landroid/net/Uri;)V

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/canhub/cropper/CropImageView;->bitmapLoadingWorkerJob:Ljava/lang/ref/WeakReference;

    .line 784
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/canhub/cropper/BitmapLoadingWorkerJob;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/canhub/cropper/BitmapLoadingWorkerJob;->start()V

    .line 785
    :cond_1
    invoke-direct {p0}, Lcom/canhub/cropper/CropImageView;->setProgressBarVisibility()V

    :cond_2
    return-void
.end method

.method public final setMaxCropResultSize(II)V
    .locals 1

    .line 280
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->mCropOverlayView:Lcom/canhub/cropper/CropOverlayView;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0, p1, p2}, Lcom/canhub/cropper/CropOverlayView;->setMaxCropResultSize(II)V

    return-void
.end method

.method public final setMaxZoom(I)V
    .locals 1

    .line 260
    iget v0, p0, Lcom/canhub/cropper/CropImageView;->mMaxZoom:I

    if-eq v0, p1, :cond_0

    if-lez p1, :cond_0

    .line 261
    iput p1, p0, Lcom/canhub/cropper/CropImageView;->mMaxZoom:I

    const/4 p1, 0x0

    .line 262
    invoke-direct {p0, p1, p1}, Lcom/canhub/cropper/CropImageView;->handleCropWindowChanged(ZZ)V

    .line 263
    iget-object p1, p0, Lcom/canhub/cropper/CropImageView;->mCropOverlayView:Lcom/canhub/cropper/CropOverlayView;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/canhub/cropper/CropOverlayView;->invalidate()V

    :cond_0
    return-void
.end method

.method public final setMinCropResultSize(II)V
    .locals 1

    .line 272
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->mCropOverlayView:Lcom/canhub/cropper/CropOverlayView;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0, p1, p2}, Lcom/canhub/cropper/CropOverlayView;->setMinCropResultSize(II)V

    return-void
.end method

.method public final setMultiTouchEnabled(Z)V
    .locals 1

    .line 242
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->mCropOverlayView:Lcom/canhub/cropper/CropOverlayView;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Lcom/canhub/cropper/CropOverlayView;->setMultiTouchEnabled(Z)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    .line 243
    invoke-direct {p0, p1, p1}, Lcom/canhub/cropper/CropImageView;->handleCropWindowChanged(ZZ)V

    .line 244
    iget-object p1, p0, Lcom/canhub/cropper/CropImageView;->mCropOverlayView:Lcom/canhub/cropper/CropOverlayView;

    invoke-virtual {p1}, Lcom/canhub/cropper/CropOverlayView;->invalidate()V

    :cond_0
    return-void
.end method

.method public final setOnCropImageCompleteListener(Lcom/canhub/cropper/CropImageView$OnCropImageCompleteListener;)V
    .locals 0

    .line 719
    iput-object p1, p0, Lcom/canhub/cropper/CropImageView;->mOnCropImageCompleteListener:Lcom/canhub/cropper/CropImageView$OnCropImageCompleteListener;

    return-void
.end method

.method public final setOnCropWindowChangedListener(Lcom/canhub/cropper/CropImageView$OnSetCropWindowChangeListener;)V
    .locals 0

    .line 703
    iput-object p1, p0, Lcom/canhub/cropper/CropImageView;->mOnSetCropWindowChangeListener:Lcom/canhub/cropper/CropImageView$OnSetCropWindowChangeListener;

    return-void
.end method

.method public final setOnSetCropOverlayMovedListener(Lcom/canhub/cropper/CropImageView$OnSetCropOverlayMovedListener;)V
    .locals 0

    .line 698
    iput-object p1, p0, Lcom/canhub/cropper/CropImageView;->mOnSetCropOverlayMovedListener:Lcom/canhub/cropper/CropImageView$OnSetCropOverlayMovedListener;

    return-void
.end method

.method public final setOnSetCropOverlayReleasedListener(Lcom/canhub/cropper/CropImageView$OnSetCropOverlayReleasedListener;)V
    .locals 0

    .line 693
    iput-object p1, p0, Lcom/canhub/cropper/CropImageView;->mOnCropOverlayReleasedListener:Lcom/canhub/cropper/CropImageView$OnSetCropOverlayReleasedListener;

    return-void
.end method

.method public final setOnSetImageUriCompleteListener(Lcom/canhub/cropper/CropImageView$OnSetImageUriCompleteListener;)V
    .locals 0

    .line 711
    iput-object p1, p0, Lcom/canhub/cropper/CropImageView;->mOnSetImageUriCompleteListener:Lcom/canhub/cropper/CropImageView$OnSetImageUriCompleteListener;

    return-void
.end method

.method public final setRotatedDegrees(I)V
    .locals 1

    .line 289
    iget v0, p0, Lcom/canhub/cropper/CropImageView;->mDegreesRotated:I

    if-eq v0, p1, :cond_0

    sub-int/2addr p1, v0

    .line 290
    invoke-virtual {p0, p1}, Lcom/canhub/cropper/CropImageView;->rotateImage(I)V

    :cond_0
    return-void
.end method

.method public final setSaveBitmapToInstanceState(Z)V
    .locals 0

    .line 94
    iput-boolean p1, p0, Lcom/canhub/cropper/CropImageView;->isSaveBitmapToInstanceState:Z

    return-void
.end method

.method public final setScaleType(Lcom/canhub/cropper/CropImageView$ScaleType;)V
    .locals 1

    const-string/jumbo v0, "scaleType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 192
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->mScaleType:Lcom/canhub/cropper/CropImageView$ScaleType;

    if-eq p1, v0, :cond_1

    .line 193
    iput-object p1, p0, Lcom/canhub/cropper/CropImageView;->mScaleType:Lcom/canhub/cropper/CropImageView$ScaleType;

    const/high16 p1, 0x3f800000    # 1.0f

    .line 194
    iput p1, p0, Lcom/canhub/cropper/CropImageView;->mZoom:F

    const/4 p1, 0x0

    .line 195
    iput p1, p0, Lcom/canhub/cropper/CropImageView;->mZoomOffsetY:F

    .line 196
    iput p1, p0, Lcom/canhub/cropper/CropImageView;->mZoomOffsetX:F

    .line 197
    iget-object p1, p0, Lcom/canhub/cropper/CropImageView;->mCropOverlayView:Lcom/canhub/cropper/CropOverlayView;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/canhub/cropper/CropOverlayView;->resetCropOverlayView()V

    .line 198
    :cond_0
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView;->requestLayout()V

    :cond_1
    return-void
.end method

.method public final setShowCropLabel(Z)V
    .locals 1

    .line 436
    iget-boolean v0, p0, Lcom/canhub/cropper/CropImageView;->mShowCropLabel:Z

    if-eq v0, p1, :cond_0

    .line 437
    iput-boolean p1, p0, Lcom/canhub/cropper/CropImageView;->mShowCropLabel:Z

    .line 438
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->mCropOverlayView:Lcom/canhub/cropper/CropOverlayView;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/canhub/cropper/CropOverlayView;->setCropperTextLabelVisibility(Z)V

    :cond_0
    return-void
.end method

.method public final setShowCropOverlay(Z)V
    .locals 1

    .line 424
    iget-boolean v0, p0, Lcom/canhub/cropper/CropImageView;->mShowCropOverlay:Z

    if-eq v0, p1, :cond_0

    .line 425
    iput-boolean p1, p0, Lcom/canhub/cropper/CropImageView;->mShowCropOverlay:Z

    .line 426
    invoke-direct {p0}, Lcom/canhub/cropper/CropImageView;->setCropOverlayVisibility()V

    :cond_0
    return-void
.end method

.method public final setShowProgressBar(Z)V
    .locals 1

    .line 410
    iget-boolean v0, p0, Lcom/canhub/cropper/CropImageView;->mShowProgressBar:Z

    if-eq v0, p1, :cond_0

    .line 411
    iput-boolean p1, p0, Lcom/canhub/cropper/CropImageView;->mShowProgressBar:Z

    .line 412
    invoke-direct {p0}, Lcom/canhub/cropper/CropImageView;->setProgressBarVisibility()V

    :cond_0
    return-void
.end method

.method public final setSnapRadius(F)V
    .locals 1

    const/4 v0, 0x0

    cmpl-float v0, p1, v0

    if-ltz v0, :cond_0

    .line 400
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->mCropOverlayView:Lcom/canhub/cropper/CropOverlayView;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Lcom/canhub/cropper/CropOverlayView;->setSnapRadius(F)V

    :cond_0
    return-void
.end method

.method public final startCropWorkerTask(IILcom/canhub/cropper/CropImageView$RequestSizeOptions;Landroid/graphics/Bitmap$CompressFormat;ILandroid/net/Uri;)V
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    const-string v2, "options"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v2, "saveCompressFormat"

    move-object/from16 v3, p4

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1041
    iget-object v5, v0, Lcom/canhub/cropper/CropImageView;->originalBitmap:Landroid/graphics/Bitmap;

    if-eqz v5, :cond_7

    .line 1044
    iget-object v2, v0, Lcom/canhub/cropper/CropImageView;->bitmapCroppingWorkerJob:Ljava/lang/ref/WeakReference;

    if-eqz v2, :cond_0

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/canhub/cropper/BitmapCroppingWorkerJob;

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_1

    .line 1045
    invoke-virtual {v2}, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->cancel()V

    .line 1048
    :cond_1
    iget v2, v0, Lcom/canhub/cropper/CropImageView;->loadedSampleSize:I

    const/4 v4, 0x1

    const/4 v6, 0x0

    if-gt v2, v4, :cond_3

    sget-object v2, Lcom/canhub/cropper/CropImageView$RequestSizeOptions;->SAMPLING:Lcom/canhub/cropper/CropImageView$RequestSizeOptions;

    if-ne v1, v2, :cond_2

    goto :goto_1

    .line 1051
    :cond_2
    new-instance v2, Landroid/util/Pair;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-direct {v2, v4, v7}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_2

    .line 1049
    :cond_3
    :goto_1
    new-instance v2, Landroid/util/Pair;

    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    iget v7, v0, Lcom/canhub/cropper/CropImageView;->loadedSampleSize:I

    mul-int/2addr v4, v7

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v7

    iget v8, v0, Lcom/canhub/cropper/CropImageView;->loadedSampleSize:I

    mul-int/2addr v7, v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-direct {v2, v4, v7}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1903
    :goto_2
    iget-object v4, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 1047
    check-cast v4, Ljava/lang/Integer;

    .line 1904
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 1047
    check-cast v2, Ljava/lang/Integer;

    .line 1054
    new-instance v7, Ljava/lang/ref/WeakReference;

    .line 1055
    new-instance v8, Lcom/canhub/cropper/BitmapCroppingWorkerJob;

    move-object v9, v2

    .line 1056
    invoke-virtual {v0}, Lcom/canhub/cropper/CropImageView;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v10, "getContext(...)"

    invoke-static {v2, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1057
    new-instance v3, Ljava/lang/ref/WeakReference;

    invoke-direct {v3, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    move-object v10, v4

    .line 1058
    iget-object v4, v0, Lcom/canhub/cropper/CropImageView;->imageUri:Landroid/net/Uri;

    move v11, v6

    .line 1060
    invoke-virtual {v0}, Lcom/canhub/cropper/CropImageView;->getCropPoints()[F

    move-result-object v6

    move-object v12, v7

    .line 1061
    iget v7, v0, Lcom/canhub/cropper/CropImageView;->mDegreesRotated:I

    .line 1062
    invoke-static {v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v10

    .line 1063
    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    .line 1064
    iget-object v13, v0, Lcom/canhub/cropper/CropImageView;->mCropOverlayView:Lcom/canhub/cropper/CropOverlayView;

    invoke-static {v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v13}, Lcom/canhub/cropper/CropOverlayView;->isFixAspectRatio()Z

    move-result v13

    .line 1065
    iget-object v14, v0, Lcom/canhub/cropper/CropImageView;->mCropOverlayView:Lcom/canhub/cropper/CropOverlayView;

    invoke-virtual {v14}, Lcom/canhub/cropper/CropOverlayView;->getAspectRatioX()I

    move-result v14

    .line 1066
    iget-object v15, v0, Lcom/canhub/cropper/CropImageView;->mCropOverlayView:Lcom/canhub/cropper/CropOverlayView;

    invoke-virtual {v15}, Lcom/canhub/cropper/CropOverlayView;->getAspectRatioY()I

    move-result v15

    .line 1067
    sget-object v11, Lcom/canhub/cropper/CropImageView$RequestSizeOptions;->NONE:Lcom/canhub/cropper/CropImageView$RequestSizeOptions;

    if-eq v1, v11, :cond_4

    move-object v11, v8

    move v8, v10

    move v10, v13

    move/from16 v13, p1

    goto :goto_3

    :cond_4
    move-object v11, v8

    move v8, v10

    move v10, v13

    const/4 v13, 0x0

    :goto_3
    move-object/from16 v17, v2

    .line 1068
    sget-object v2, Lcom/canhub/cropper/CropImageView$RequestSizeOptions;->NONE:Lcom/canhub/cropper/CropImageView$RequestSizeOptions;

    if-eq v1, v2, :cond_5

    move/from16 v16, p2

    goto :goto_4

    :cond_5
    const/16 v16, 0x0

    :goto_4
    move-object v2, v12

    move v12, v15

    .line 1069
    iget-boolean v15, v0, Lcom/canhub/cropper/CropImageView;->mFlipHorizontally:Z

    .line 1070
    iget-boolean v1, v0, Lcom/canhub/cropper/CropImageView;->mFlipVertically:Z

    if-nez p6, :cond_6

    move/from16 v18, v1

    .line 1074
    iget-object v1, v0, Lcom/canhub/cropper/CropImageView;->customOutputUri:Landroid/net/Uri;

    move-object/from16 v20, v1

    move-object v1, v11

    move v11, v14

    move/from16 v14, v16

    move/from16 v16, v18

    move/from16 v19, p5

    move-object v0, v2

    move-object/from16 v2, v17

    move-object/from16 v17, p3

    move-object/from16 v18, p4

    goto :goto_5

    :cond_6
    move/from16 v0, v16

    move/from16 v16, v1

    move-object v1, v11

    move v11, v14

    move v14, v0

    move-object/from16 v20, p6

    move-object/from16 v18, p4

    move/from16 v19, p5

    move-object v0, v2

    move-object/from16 v2, v17

    move-object/from16 v17, p3

    .line 1055
    :goto_5
    invoke-direct/range {v1 .. v20}, Lcom/canhub/cropper/BitmapCroppingWorkerJob;-><init>(Landroid/content/Context;Ljava/lang/ref/WeakReference;Landroid/net/Uri;Landroid/graphics/Bitmap;[FIIIZIIIIZZLcom/canhub/cropper/CropImageView$RequestSizeOptions;Landroid/graphics/Bitmap$CompressFormat;ILandroid/net/Uri;)V

    move-object v11, v1

    .line 1054
    invoke-direct {v0, v11}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/canhub/cropper/CropImageView;->bitmapCroppingWorkerJob:Ljava/lang/ref/WeakReference;

    .line 1078
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;

    invoke-virtual {v0}, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->start()V

    .line 1079
    invoke-direct {v1}, Lcom/canhub/cropper/CropImageView;->setProgressBarVisibility()V

    return-void

    :cond_7
    move-object v1, v0

    return-void
.end method
