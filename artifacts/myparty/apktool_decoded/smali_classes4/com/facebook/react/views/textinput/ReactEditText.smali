.class public Lcom/facebook/react/views/textinput/ReactEditText;
.super Landroidx/appcompat/widget/AppCompatEditText;
.source "ReactEditText.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/views/textinput/ReactEditText$Companion;,
        Lcom/facebook/react/views/textinput/ReactEditText$InternalKeyListener;,
        Lcom/facebook/react/views/textinput/ReactEditText$TextWatcherDelegator;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nReactEditText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactEditText.kt\ncom/facebook/react/views/textinput/ReactEditText\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1272:1\n1761#2,3:1273\n*S KotlinDebug\n*F\n+ 1 ReactEditText.kt\ncom/facebook/react/views/textinput/ReactEditText\n*L\n1170#1:1273,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00f2\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010 \n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0010\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0019\n\u0002\u0018\u0002\n\u0002\u0008\u0016\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0007\n\u0002\u0008\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0016\u0018\u0000 \u00f4\u00012\u00020\u0001:\u0006\u00f2\u0001\u00f3\u0001\u00f4\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0008\u0010e\u001a\u00020fH\u0005J\u0008\u0010g\u001a\u00020\u000bH\u0016J0\u0010h\u001a\u00020f2\u0006\u0010i\u001a\u00020\u000b2\u0006\u0010j\u001a\u00020\u00102\u0006\u0010k\u001a\u00020\u00102\u0006\u0010l\u001a\u00020\u00102\u0006\u0010m\u001a\u00020\u0010H\u0014J\u0010\u0010n\u001a\u00020\u000b2\u0006\u0010o\u001a\u00020pH\u0016J\u0018\u0010q\u001a\u00020\u000b2\u0006\u0010r\u001a\u00020\u00102\u0006\u0010s\u001a\u00020tH\u0016J\u0010\u0010u\u001a\u00020f2\u0006\u0010v\u001a\u00020\u0010H\u0016J(\u0010w\u001a\u00020f2\u0006\u0010x\u001a\u00020\u00102\u0006\u0010y\u001a\u00020\u00102\u0006\u0010z\u001a\u00020\u00102\u0006\u0010{\u001a\u00020\u0010H\u0014J\u0012\u0010|\u001a\u0004\u0018\u00010}2\u0006\u0010~\u001a\u00020\u007fH\u0016J\u0012\u0010\u0080\u0001\u001a\u00020\u000b2\u0007\u0010\u0081\u0001\u001a\u00020\u0010H\u0016J\u000f\u0010\u0082\u0001\u001a\u00020fH\u0000\u00a2\u0006\u0003\u0008\u0083\u0001J\u000f\u0010\u0084\u0001\u001a\u00020fH\u0000\u00a2\u0006\u0003\u0008\u0085\u0001J\t\u0010\u0086\u0001\u001a\u00020\u000bH\u0002J\u0012\u0010\u0087\u0001\u001a\u00020f2\u0007\u0010\u0088\u0001\u001a\u00020\u0019H\u0016J\u0012\u0010\u0089\u0001\u001a\u00020f2\u0007\u0010\u0088\u0001\u001a\u00020\u0019H\u0016J\u0011\u0010\u008a\u0001\u001a\u00020f2\u0008\u0010.\u001a\u0004\u0018\u00010/J\u0011\u0010\u008b\u0001\u001a\u00020f2\u0008\u00100\u001a\u0004\u0018\u000101J\"\u0010\u008c\u0001\u001a\u00020f2\u0007\u0010\u008d\u0001\u001a\u00020\u00102\u0007\u0010\u008e\u0001\u001a\u00020\u00102\u0007\u0010\u008f\u0001\u001a\u00020\u0010J\u001b\u0010\u008c\u0001\u001a\u00020f2\u0007\u0010\u008e\u0001\u001a\u00020\u00102\u0007\u0010\u008f\u0001\u001a\u00020\u0010H\u0002J\u0011\u0010\u0090\u0001\u001a\u00020\u00102\u0006\u0010[\u001a\u00020\u0010H\u0002J\u001b\u0010\u0091\u0001\u001a\u00020f2\u0007\u0010\u008e\u0001\u001a\u00020\u00102\u0007\u0010\u008f\u0001\u001a\u00020\u0010H\u0016J\u001b\u0010\u0092\u0001\u001a\u00020f2\u0007\u0010\u0093\u0001\u001a\u00020\u00102\u0007\u0010\u0094\u0001\u001a\u00020\u0010H\u0014J\'\u0010\u0095\u0001\u001a\u00020f2\u0007\u0010\u0096\u0001\u001a\u00020\u000b2\u0007\u0010\u0097\u0001\u001a\u00020\u00102\n\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0099\u0001H\u0014J\u0019\u0010\u009a\u0001\u001a\u00020f2\u0008\u0010,\u001a\u0004\u0018\u00010-H\u0000\u00a2\u0006\u0003\u0008\u009b\u0001J\u000f\u0010\u009c\u0001\u001a\u00020f2\u0006\u00106\u001a\u00020\u000bJ\u0007\u0010\u009d\u0001\u001a\u00020\u000bJ\u0007\u0010\u009e\u0001\u001a\u00020\u000bJ\u000f\u0010\u009f\u0001\u001a\u00020fH\u0000\u00a2\u0006\u0003\u0008\u00a0\u0001J\u0012\u0010\u00a1\u0001\u001a\u00020f2\u0007\u0010\u00a2\u0001\u001a\u00020\u0010H\u0016J\u0011\u0010\u00a3\u0001\u001a\u00020f2\u0008\u0010A\u001a\u0004\u0018\u00010\tJ\u0011\u0010\u00a4\u0001\u001a\u00020f2\u0008\u0010:\u001a\u0004\u0018\u00010\tJ\u0012\u0010\u00a5\u0001\u001a\u00020f2\t\u0010\u00a6\u0001\u001a\u0004\u0018\u00010\tJ\u0012\u0010\u00a7\u0001\u001a\u00020f2\t\u0010\u00a8\u0001\u001a\u0004\u0018\u00010\tJ\u0014\u0010\u00a9\u0001\u001a\u00020f2\t\u0010\u00aa\u0001\u001a\u0004\u0018\u00010\tH\u0016J\u0007\u0010\u00ab\u0001\u001a\u00020fJ\u0007\u0010\u00ac\u0001\u001a\u00020fJ\u0007\u0010\u00ad\u0001\u001a\u00020\u0010J\u0011\u0010\u00ae\u0001\u001a\u00020f2\u0008\u0010\u00af\u0001\u001a\u00030\u00b0\u0001J\u0011\u0010\u00b1\u0001\u001a\u00020f2\u0008\u0010\u00af\u0001\u001a\u00030\u00b0\u0001J\u0010\u0010\u00b2\u0001\u001a\u00020\u000b2\u0007\u0010\u008d\u0001\u001a\u00020\u0010J\u0013\u0010\u00b3\u0001\u001a\u00020f2\u0008\u0010\u00af\u0001\u001a\u00030\u00b0\u0001H\u0002J\u0013\u0010\u00b4\u0001\u001a\u00020f2\u0008\u0010\u00b5\u0001\u001a\u00030\u00b6\u0001H\u0002J\u0013\u0010\u00b7\u0001\u001a\u00020f2\u0008\u0010\u00b8\u0001\u001a\u00030\u00b6\u0001H\u0002J<\u0010\u00b9\u0001\u001a\u00020f\"\u0005\u0008\u0000\u0010\u00ba\u00012\u0008\u0010\u00b8\u0001\u001a\u00030\u00b6\u00012\u000f\u0010\u00bb\u0001\u001a\n\u0012\u0005\u0012\u0003H\u00ba\u00010\u00bc\u00012\u000f\u0010\u00bd\u0001\u001a\n\u0012\u0005\u0012\u0003H\u00ba\u00010\u00be\u0001H\u0002J\u0013\u0010\u00bf\u0001\u001a\u00020f2\u0008\u0010\u00c0\u0001\u001a\u00030\u00b6\u0001H\u0002J\t\u0010\u00c1\u0001\u001a\u00020\u000bH\u0004J\t\u0010\u00c2\u0001\u001a\u00020fH\u0004J\t\u0010\u00c3\u0001\u001a\u00020fH\u0002J\t\u0010\u00c4\u0001\u001a\u00020fH\u0002J\t\u0010\u00c5\u0001\u001a\u00020fH\u0002J\u0013\u0010\u00c6\u0001\u001a\u00020\u000b2\u0008\u0010\u00c7\u0001\u001a\u00030\u00c8\u0001H\u0014J\u0013\u0010\u00c9\u0001\u001a\u00020f2\u0008\u0010\u00c7\u0001\u001a\u00030\u00c8\u0001H\u0016J\t\u0010\u00ca\u0001\u001a\u00020fH\u0016J\t\u0010\u00cb\u0001\u001a\u00020fH\u0016J\u0013\u0010\u00cc\u0001\u001a\u00020f2\u0008\u0010\u00cd\u0001\u001a\u00030\u00ce\u0001H\u0016J\t\u0010\u00cf\u0001\u001a\u00020fH\u0016J\t\u0010\u00d0\u0001\u001a\u00020fH\u0016J\u0012\u0010\u00d1\u0001\u001a\u00020f2\u0007\u0010\u00d2\u0001\u001a\u00020\u0010H\u0016J\u001a\u0010\u00d3\u0001\u001a\u00020f2\u0007\u0010\u00d4\u0001\u001a\u00020\u00102\u0008\u0010\u00d5\u0001\u001a\u00030\u00d6\u0001J!\u0010\u00d7\u0001\u001a\u00020f2\u0007\u0010\u00d4\u0001\u001a\u00020\u00102\t\u0010\u00d2\u0001\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0003\u0010\u00d8\u0001J\u0010\u0010\u00d9\u0001\u001a\u00020\u00102\u0007\u0010\u00d4\u0001\u001a\u00020\u0010J\u0011\u0010\u00da\u0001\u001a\u00020f2\u0008\u0010\u00db\u0001\u001a\u00030\u00d6\u0001J\u001a\u0010\u00da\u0001\u001a\u00020f2\u0008\u0010\u00db\u0001\u001a\u00030\u00d6\u00012\u0007\u0010\u00d4\u0001\u001a\u00020\u0010J\u0012\u0010\u00dc\u0001\u001a\u00020f2\t\u0010\u00dd\u0001\u001a\u0004\u0018\u00010\tJ\u0011\u0010\u00de\u0001\u001a\u00020f2\u0008\u0010\u00df\u0001\u001a\u00030\u00d6\u0001J\u0010\u0010\u00e0\u0001\u001a\u00020f2\u0007\u0010\u00e1\u0001\u001a\u00020\u000bJ\u0011\u0010\u00e2\u0001\u001a\u00020f2\u0008\u0010\u00e3\u0001\u001a\u00030\u00d6\u0001J\u0011\u0010\u00e4\u0001\u001a\u00020f2\u0008\u0010\u00e5\u0001\u001a\u00030\u00d6\u0001J\u000f\u0010\u00e6\u0001\u001a\u00020f2\u0006\u0010=\u001a\u00020\u000bJ\u000f\u0010\u00e7\u0001\u001a\u00020f2\u0006\u0010@\u001a\u00020\u000bJ\u000f\u0010\u00e8\u0001\u001a\u00020f2\u0006\u0010>\u001a\u00020\u000bJ\t\u0010\u00e9\u0001\u001a\u00020fH\u0004J\t\u0010\u00ea\u0001\u001a\u00020fH\u0002J\u0011\u0010\u00eb\u0001\u001a\u00020f2\u0008\u0010O\u001a\u0004\u0018\u00010PJ\u0011\u0010\u00ec\u0001\u001a\u00020f2\u0008\u0010B\u001a\u0004\u0018\u00010\tJ\u0013\u0010\u00ed\u0001\u001a\u00020f2\u0008\u0010\u00ee\u0001\u001a\u00030\u00ef\u0001H\u0016J\u0012\u0010\u00f0\u0001\u001a\u00020\u000b2\u0007\u0010s\u001a\u00030\u00f1\u0001H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\n\u0010\u000c\"\u0004\u0008\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0010X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014\"\u0004\u0008\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001b\u0010\u0014\"\u0004\u0008\u001c\u0010\u0016R\u001a\u0010\u001d\u001a\u00020\u000bX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001e\u0010\u000c\"\u0004\u0008\u001f\u0010\u000eR\u001c\u0010 \u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008!\u0010\"\"\u0004\u0008#\u0010$R\"\u0010%\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010&X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\'\u0010(\"\u0004\u0008)\u0010*R\u000e\u0010+\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010-X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010.\u001a\u0004\u0018\u00010/X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u00100\u001a\u0004\u0018\u000101X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u00102\u001a\u0004\u0018\u000103X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u00084R\u000e\u00105\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00107\u001a\u000208X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010:\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010A\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020CX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010D\u001a\u0004\u0018\u00010EX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008F\u0010G\"\u0004\u0008H\u0010IR\u001a\u0010J\u001a\u00020\u000bX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008K\u0010\u000c\"\u0004\u0008L\u0010\u000eR\u001a\u0010M\u001a\u00020\u000bX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008M\u0010\u000c\"\u0004\u0008N\u0010\u000eR\u0010\u0010O\u001a\u0004\u0018\u00010PX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010Q\u001a\u0008\u0018\u00010RR\u00020\u00008BX\u0082\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008S\u0010TR\u0014\u0010U\u001a\u00020\u000b8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008V\u0010\u000cR\u0014\u0010W\u001a\u00020\u000b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008W\u0010\u000cR$\u0010X\u001a\u00020\u000b2\u0006\u0010X\u001a\u00020\u000b8F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008Y\u0010\u000c\"\u0004\u0008Z\u0010\u000eR(\u0010\\\u001a\u0004\u0018\u00010\t2\u0008\u0010[\u001a\u0004\u0018\u00010\t@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008]\u0010\"\"\u0004\u0008^\u0010$R$\u0010_\u001a\u00020\u00102\u0006\u0010[\u001a\u00020\u00108@@@X\u0080\u000e\u00a2\u0006\u000c\u001a\u0004\u0008`\u0010\u0014\"\u0004\u0008a\u0010\u0016R$\u0010b\u001a\u00020\u00102\u0006\u0010[\u001a\u00020\u00108@@@X\u0080\u000e\u00a2\u0006\u000c\u001a\u0004\u0008c\u0010\u0014\"\u0004\u0008d\u0010\u0016\u00a8\u0006\u00f5\u0001"
    }
    d2 = {
        "Lcom/facebook/react/views/textinput/ReactEditText;",
        "Landroidx/appcompat/widget/AppCompatEditText;",
        "context",
        "Landroid/content/Context;",
        "<init>",
        "(Landroid/content/Context;)V",
        "inputMethodManager",
        "Landroid/view/inputmethod/InputMethodManager;",
        "TAG",
        "",
        "isSettingTextFromJS",
        "",
        "()Z",
        "setSettingTextFromJS",
        "(Z)V",
        "defaultGravityHorizontal",
        "",
        "defaultGravityVertical",
        "nativeEventCount",
        "getNativeEventCount",
        "()I",
        "setNativeEventCount",
        "(I)V",
        "listeners",
        "Ljava/util/concurrent/CopyOnWriteArrayList;",
        "Landroid/text/TextWatcher;",
        "stagedInputType",
        "getStagedInputType",
        "setStagedInputType",
        "containsImages",
        "getContainsImages",
        "setContainsImages",
        "submitBehavior",
        "getSubmitBehavior",
        "()Ljava/lang/String;",
        "setSubmitBehavior",
        "(Ljava/lang/String;)V",
        "dragAndDropFilter",
        "",
        "getDragAndDropFilter",
        "()Ljava/util/List;",
        "setDragAndDropFilter",
        "(Ljava/util/List;)V",
        "disableFullscreen",
        "selectionWatcher",
        "Lcom/facebook/react/views/textinput/SelectionWatcher;",
        "contentSizeWatcher",
        "Lcom/facebook/react/views/textinput/ContentSizeWatcher;",
        "scrollWatcher",
        "Lcom/facebook/react/views/textinput/ScrollWatcher;",
        "keyListener",
        "Lcom/facebook/react/views/textinput/ReactEditText$InternalKeyListener;",
        "keyListener$1",
        "detectScrollMovement",
        "onKeyPress",
        "textAttributes",
        "Lcom/facebook/react/views/text/TextAttributes;",
        "typefaceDirty",
        "fontFamily",
        "fontWeight",
        "fontStyle",
        "autoFocus",
        "contextMenuHidden",
        "didAttachToWindow",
        "selectTextOnFocus",
        "placeholder",
        "overflow",
        "Lcom/facebook/react/uimanager/style/Overflow;",
        "stateWrapper",
        "Lcom/facebook/react/uimanager/StateWrapper;",
        "getStateWrapper",
        "()Lcom/facebook/react/uimanager/StateWrapper;",
        "setStateWrapper",
        "(Lcom/facebook/react/uimanager/StateWrapper;)V",
        "disableTextDiffing",
        "getDisableTextDiffing$ReactAndroid_release",
        "setDisableTextDiffing$ReactAndroid_release",
        "isSettingTextFromState",
        "setSettingTextFromState",
        "eventDispatcher",
        "Lcom/facebook/react/uimanager/events/EventDispatcher;",
        "textWatcherDelegator",
        "Lcom/facebook/react/views/textinput/ReactEditText$TextWatcherDelegator;",
        "getTextWatcherDelegator",
        "()Lcom/facebook/react/views/textinput/ReactEditText$TextWatcherDelegator;",
        "isMultiline",
        "isMultiline$ReactAndroid_release",
        "isSecureText",
        "disableFullscreenUI",
        "getDisableFullscreenUI",
        "setDisableFullscreenUI",
        "value",
        "returnKeyType",
        "getReturnKeyType",
        "setReturnKeyType",
        "gravityHorizontal",
        "getGravityHorizontal$ReactAndroid_release",
        "setGravityHorizontal$ReactAndroid_release",
        "gravityVertical",
        "getGravityVertical$ReactAndroid_release",
        "setGravityVertical$ReactAndroid_release",
        "finalize",
        "",
        "isLayoutRequested",
        "onLayout",
        "changed",
        "left",
        "top",
        "right",
        "bottom",
        "onTouchEvent",
        "ev",
        "Landroid/view/MotionEvent;",
        "onKeyUp",
        "keyCode",
        "event",
        "Landroid/view/KeyEvent;",
        "setLineHeight",
        "lineHeight",
        "onScrollChanged",
        "horiz",
        "vert",
        "oldHoriz",
        "oldVert",
        "onCreateInputConnection",
        "Landroid/view/inputmethod/InputConnection;",
        "outAttrs",
        "Landroid/view/inputmethod/EditorInfo;",
        "onTextContextMenuItem",
        "id",
        "clearFocusAndMaybeRefocus",
        "clearFocusAndMaybeRefocus$ReactAndroid_release",
        "clearFocusFromJS",
        "clearFocusFromJS$ReactAndroid_release",
        "requestFocusProgrammatically",
        "addTextChangedListener",
        "watcher",
        "removeTextChangedListener",
        "setContentSizeWatcher",
        "setScrollWatcher",
        "maybeSetSelection",
        "eventCounter",
        "start",
        "end",
        "clampToTextLength",
        "setSelection",
        "onSelectionChanged",
        "selStart",
        "selEnd",
        "onFocusChanged",
        "focused",
        "direction",
        "previouslyFocusedRect",
        "Landroid/graphics/Rect;",
        "setSelectionWatcher",
        "setSelectionWatcher$ReactAndroid_release",
        "setOnKeyPress",
        "shouldBlurOnReturn",
        "shouldSubmitOnReturn",
        "commitStagedInputType",
        "commitStagedInputType$ReactAndroid_release",
        "setInputType",
        "type",
        "setPlaceholder",
        "setFontFamily",
        "setFontWeight",
        "fontWeightString",
        "setFontStyle",
        "fontStyleString",
        "setFontFeatureSettings",
        "fontFeatureSettings",
        "maybeUpdateTypeface",
        "requestFocusFromJS",
        "incrementAndGetEventCounter",
        "maybeSetTextFromJS",
        "reactTextUpdate",
        "Lcom/facebook/react/views/text/ReactTextUpdate;",
        "maybeSetTextFromState",
        "canUpdateWithEventCount",
        "maybeSetText",
        "manageSpans",
        "spannableStringBuilder",
        "Landroid/text/SpannableStringBuilder;",
        "stripStyleEquivalentSpans",
        "sb",
        "stripSpansOfKind",
        "T",
        "clazz",
        "Ljava/lang/Class;",
        "shouldStrip",
        "Landroidx/core/util/Predicate;",
        "addSpansFromStyleAttributes",
        "workingText",
        "showSoftKeyboard",
        "hideSoftKeyboard",
        "onContentSizeChange",
        "setIntrinsicContentSize",
        "updateImeOptions",
        "verifyDrawable",
        "drawable",
        "Landroid/graphics/drawable/Drawable;",
        "invalidateDrawable",
        "onDetachedFromWindow",
        "onStartTemporaryDetach",
        "onConfigurationChanged",
        "newConfig",
        "Landroid/content/res/Configuration;",
        "onAttachedToWindow",
        "onFinishTemporaryDetach",
        "setBackgroundColor",
        "color",
        "setBorderWidth",
        "position",
        "width",
        "",
        "setBorderColor",
        "(ILjava/lang/Integer;)V",
        "getBorderColor",
        "setBorderRadius",
        "borderRadius",
        "setBorderStyle",
        "style",
        "setLetterSpacingPt",
        "letterSpacingPt",
        "setAllowFontScaling",
        "allowFontScaling",
        "setFontSize",
        "fontSize",
        "setMaxFontSizeMultiplier",
        "maxFontSizeMultiplier",
        "setAutoFocus",
        "setSelectTextOnFocus",
        "setContextMenuHidden",
        "applyTextAttributes",
        "updateCachedSpannable",
        "setEventDispatcher",
        "setOverflow",
        "onDraw",
        "canvas",
        "Landroid/graphics/Canvas;",
        "onDragEvent",
        "Landroid/view/DragEvent;",
        "TextWatcherDelegator",
        "InternalKeyListener",
        "Companion",
        "ReactAndroid_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lcom/facebook/react/views/textinput/ReactEditText$Companion;

.field private static final DEBUG_MODE:Z

.field private static final keyListener:Landroid/text/method/KeyListener;


# instance fields
.field private final TAG:Ljava/lang/String;

.field private autoFocus:Z

.field private containsImages:Z

.field private contentSizeWatcher:Lcom/facebook/react/views/textinput/ContentSizeWatcher;

.field private contextMenuHidden:Z

.field private final defaultGravityHorizontal:I

.field private final defaultGravityVertical:I

.field private detectScrollMovement:Z

.field private didAttachToWindow:Z

.field private disableFullscreen:Z

.field private disableTextDiffing:Z

.field private dragAndDropFilter:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private eventDispatcher:Lcom/facebook/react/uimanager/events/EventDispatcher;

.field private fontFamily:Ljava/lang/String;

.field private fontStyle:I

.field private fontWeight:I

.field private final inputMethodManager:Landroid/view/inputmethod/InputMethodManager;

.field private isSettingTextFromJS:Z

.field private isSettingTextFromState:Z

.field private keyListener$1:Lcom/facebook/react/views/textinput/ReactEditText$InternalKeyListener;

.field private listeners:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Landroid/text/TextWatcher;",
            ">;"
        }
    .end annotation
.end field

.field private nativeEventCount:I

.field private onKeyPress:Z

.field private overflow:Lcom/facebook/react/uimanager/style/Overflow;

.field private placeholder:Ljava/lang/String;

.field private returnKeyType:Ljava/lang/String;

.field private scrollWatcher:Lcom/facebook/react/views/textinput/ScrollWatcher;

.field private selectTextOnFocus:Z

.field private selectionWatcher:Lcom/facebook/react/views/textinput/SelectionWatcher;

.field private stagedInputType:I

.field private stateWrapper:Lcom/facebook/react/uimanager/StateWrapper;

.field private submitBehavior:Ljava/lang/String;

.field private final textAttributes:Lcom/facebook/react/views/text/TextAttributes;

.field private textWatcherDelegator:Lcom/facebook/react/views/textinput/ReactEditText$TextWatcherDelegator;

.field private typefaceDirty:Z


# direct methods
.method public static synthetic $r8$lambda$90K_qPcQ52roOMU4UkSdpca2zsQ(Lcom/facebook/react/views/textinput/ReactEditText;Lcom/facebook/react/views/text/internal/span/ReactForegroundColorSpan;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/facebook/react/views/textinput/ReactEditText;->stripStyleEquivalentSpans$lambda$3(Lcom/facebook/react/views/textinput/ReactEditText;Lcom/facebook/react/views/text/internal/span/ReactForegroundColorSpan;)Z

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$99pmCO7e1l9blWeEDp8XnRoi6MQ(Lcom/facebook/react/views/textinput/ReactEditText;Lcom/facebook/react/views/text/internal/span/ReactBackgroundColorSpan;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/facebook/react/views/textinput/ReactEditText;->stripStyleEquivalentSpans$lambda$2(Lcom/facebook/react/views/textinput/ReactEditText;Lcom/facebook/react/views/text/internal/span/ReactBackgroundColorSpan;)Z

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$Dp7etAdPeKb8qng5V0lP8UV2ADM(Lcom/facebook/react/views/textinput/ReactEditText;Lcom/facebook/react/views/text/internal/span/CustomStyleSpan;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/facebook/react/views/textinput/ReactEditText;->stripStyleEquivalentSpans$lambda$7(Lcom/facebook/react/views/textinput/ReactEditText;Lcom/facebook/react/views/text/internal/span/CustomStyleSpan;)Z

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$JdAJuFRX_am86Y6d3xCP-koQyrw(Lcom/facebook/react/views/textinput/ReactEditText;Lcom/facebook/react/views/text/internal/span/ReactStrikethroughSpan;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/facebook/react/views/textinput/ReactEditText;->stripStyleEquivalentSpans$lambda$4(Lcom/facebook/react/views/textinput/ReactEditText;Lcom/facebook/react/views/text/internal/span/ReactStrikethroughSpan;)Z

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$UPf1kw__gVMwx0w3gjve_ZcJf7g(Lcom/facebook/react/views/textinput/ReactEditText;Lcom/facebook/react/views/text/internal/span/ReactAbsoluteSizeSpan;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/facebook/react/views/textinput/ReactEditText;->stripStyleEquivalentSpans$lambda$1(Lcom/facebook/react/views/textinput/ReactEditText;Lcom/facebook/react/views/text/internal/span/ReactAbsoluteSizeSpan;)Z

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$ZPKxtGXk4tDQzMttDY-nynyKjLg(Lcom/facebook/react/views/textinput/ReactEditText;Lcom/facebook/react/views/text/internal/span/ReactUnderlineSpan;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/facebook/react/views/textinput/ReactEditText;->stripStyleEquivalentSpans$lambda$5(Lcom/facebook/react/views/textinput/ReactEditText;Lcom/facebook/react/views/text/internal/span/ReactUnderlineSpan;)Z

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$nBWT099XwqtiM9Q06p44IpUMPNo(Lcom/facebook/react/views/textinput/ReactEditText;Lcom/facebook/react/views/text/internal/span/CustomLetterSpacingSpan;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/facebook/react/views/textinput/ReactEditText;->stripStyleEquivalentSpans$lambda$6(Lcom/facebook/react/views/textinput/ReactEditText;Lcom/facebook/react/views/text/internal/span/CustomLetterSpacingSpan;)Z

    move-result p0

    return p0
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/facebook/react/views/textinput/ReactEditText$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/react/views/textinput/ReactEditText$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/facebook/react/views/textinput/ReactEditText;->Companion:Lcom/facebook/react/views/textinput/ReactEditText$Companion;

    .line 1250
    sget-boolean v0, Lcom/facebook/react/common/build/ReactBuildConfig;->DEBUG:Z

    const/4 v0, 0x0

    sput-boolean v0, Lcom/facebook/react/views/textinput/ReactEditText;->DEBUG_MODE:Z

    .line 1252
    invoke-static {}, Landroid/text/method/QwertyKeyListener;->getInstanceForFullKeyboard()Landroid/text/method/QwertyKeyListener;

    move-result-object v0

    const-string v1, "getInstanceForFullKeyboard(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/text/method/KeyListener;

    sput-object v0, Lcom/facebook/react/views/textinput/ReactEditText;->keyListener:Landroid/text/method/KeyListener;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 106
    invoke-direct {p0, p1}, Landroidx/appcompat/widget/AppCompatEditText;-><init>(Landroid/content/Context;)V

    .line 108
    const-string v0, "getSimpleName(...)"

    const-string v1, "ReactEditText"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/facebook/react/views/textinput/ReactEditText;->TAG:Ljava/lang/String;

    const/4 v0, -0x1

    .line 137
    iput v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->fontWeight:I

    .line 138
    iput v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->fontStyle:I

    .line 144
    sget-object v0, Lcom/facebook/react/uimanager/style/Overflow;->VISIBLE:Lcom/facebook/react/uimanager/style/Overflow;

    iput-object v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->overflow:Lcom/facebook/react/uimanager/style/Overflow;

    .line 202
    const-string v0, "input_method"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/view/inputmethod/InputMethodManager;

    .line 201
    iput-object p1, p0, Lcom/facebook/react/views/textinput/ReactEditText;->inputMethodManager:Landroid/view/inputmethod/InputMethodManager;

    .line 204
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->getGravity()I

    move-result p1

    const v0, 0x800007

    and-int/2addr p1, v0

    .line 203
    iput p1, p0, Lcom/facebook/react/views/textinput/ReactEditText;->defaultGravityHorizontal:I

    .line 205
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->getGravity()I

    move-result p1

    and-int/lit8 p1, p1, 0x70

    iput p1, p0, Lcom/facebook/react/views/textinput/ReactEditText;->defaultGravityVertical:I

    const/4 p1, 0x0

    .line 206
    iput p1, p0, Lcom/facebook/react/views/textinput/ReactEditText;->nativeEventCount:I

    .line 207
    iput-boolean p1, p0, Lcom/facebook/react/views/textinput/ReactEditText;->isSettingTextFromJS:Z

    .line 208
    iput-boolean p1, p0, Lcom/facebook/react/views/textinput/ReactEditText;->disableFullscreen:Z

    const/4 p1, 0x0

    .line 209
    iput-object p1, p0, Lcom/facebook/react/views/textinput/ReactEditText;->listeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 210
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->getInputType()I

    move-result v0

    iput v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->stagedInputType:I

    .line 211
    iget-object v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->keyListener$1:Lcom/facebook/react/views/textinput/ReactEditText$InternalKeyListener;

    if-nez v0, :cond_0

    .line 212
    new-instance v0, Lcom/facebook/react/views/textinput/ReactEditText$InternalKeyListener;

    invoke-direct {v0}, Lcom/facebook/react/views/textinput/ReactEditText$InternalKeyListener;-><init>()V

    iput-object v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->keyListener$1:Lcom/facebook/react/views/textinput/ReactEditText$InternalKeyListener;

    .line 214
    :cond_0
    iput-object p1, p0, Lcom/facebook/react/views/textinput/ReactEditText;->scrollWatcher:Lcom/facebook/react/views/textinput/ScrollWatcher;

    .line 215
    new-instance v0, Lcom/facebook/react/views/text/TextAttributes;

    invoke-direct {v0}, Lcom/facebook/react/views/text/TextAttributes;-><init>()V

    iput-object v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->textAttributes:Lcom/facebook/react/views/text/TextAttributes;

    .line 217
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->applyTextAttributes()V

    .line 221
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_1

    .line 222
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1b

    if-gt v0, v1, :cond_1

    const/4 v0, 0x1

    .line 223
    invoke-virtual {p0, v0, p1}, Lcom/facebook/react/views/textinput/ReactEditText;->setLayerType(ILandroid/graphics/Paint;)V

    .line 228
    :cond_1
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->isFocusable()Z

    move-result p1

    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->getImportantForAccessibility()I

    move-result v0

    .line 227
    new-instance v1, Lcom/facebook/react/views/textinput/ReactEditText$editTextAccessibilityDelegate$1;

    invoke-direct {v1, p0, p1, v0}, Lcom/facebook/react/views/textinput/ReactEditText$editTextAccessibilityDelegate$1;-><init>(Lcom/facebook/react/views/textinput/ReactEditText;ZI)V

    check-cast v1, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate;

    .line 244
    move-object p1, p0

    check-cast p1, Landroid/view/View;

    check-cast v1, Landroidx/core/view/AccessibilityDelegateCompat;

    invoke-static {p1, v1}, Landroidx/core/view/ViewCompat;->setAccessibilityDelegate(Landroid/view/View;Landroidx/core/view/AccessibilityDelegateCompat;)V

    .line 246
    new-instance p1, Lcom/facebook/react/views/textinput/ReactEditText$customActionModeCallback$1;

    invoke-direct {p1, p0}, Lcom/facebook/react/views/textinput/ReactEditText$customActionModeCallback$1;-><init>(Lcom/facebook/react/views/textinput/ReactEditText;)V

    check-cast p1, Landroid/view/ActionMode$Callback;

    .line 265
    invoke-virtual {p0, p1}, Lcom/facebook/react/views/textinput/ReactEditText;->setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V

    .line 266
    invoke-virtual {p0, p1}, Lcom/facebook/react/views/textinput/ReactEditText;->setCustomInsertionActionModeCallback(Landroid/view/ActionMode$Callback;)V

    return-void
.end method

.method public static final synthetic access$getContextMenuHidden$p(Lcom/facebook/react/views/textinput/ReactEditText;)Z
    .locals 0

    .line 106
    iget-boolean p0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->contextMenuHidden:Z

    return p0
.end method

.method public static final synthetic access$getDEBUG_MODE$cp()Z
    .locals 1

    .line 106
    sget-boolean v0, Lcom/facebook/react/views/textinput/ReactEditText;->DEBUG_MODE:Z

    return v0
.end method

.method public static final synthetic access$getKeyListener$cp()Landroid/text/method/KeyListener;
    .locals 1

    .line 106
    sget-object v0, Lcom/facebook/react/views/textinput/ReactEditText;->keyListener:Landroid/text/method/KeyListener;

    return-object v0
.end method

.method public static final synthetic access$getListeners$p(Lcom/facebook/react/views/textinput/ReactEditText;)Ljava/util/concurrent/CopyOnWriteArrayList;
    .locals 0

    .line 106
    iget-object p0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->listeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    return-object p0
.end method

.method public static final synthetic access$getTAG$p(Lcom/facebook/react/views/textinput/ReactEditText;)Ljava/lang/String;
    .locals 0

    .line 106
    iget-object p0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->TAG:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$onContentSizeChange(Lcom/facebook/react/views/textinput/ReactEditText;)V
    .locals 0

    .line 106
    invoke-direct {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->onContentSizeChange()V

    return-void
.end method

.method public static final synthetic access$requestFocusProgrammatically(Lcom/facebook/react/views/textinput/ReactEditText;)Z
    .locals 0

    .line 106
    invoke-direct {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->requestFocusProgrammatically()Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$updateCachedSpannable(Lcom/facebook/react/views/textinput/ReactEditText;)V
    .locals 0

    .line 106
    invoke-direct {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->updateCachedSpannable()V

    return-void
.end method

.method private final addSpansFromStyleAttributes(Landroid/text/SpannableStringBuilder;)V
    .locals 10

    .line 786
    new-instance v0, Lcom/facebook/react/views/text/internal/span/ReactAbsoluteSizeSpan;

    iget-object v1, p0, Lcom/facebook/react/views/textinput/ReactEditText;->textAttributes:Lcom/facebook/react/views/text/TextAttributes;

    invoke-virtual {v1}, Lcom/facebook/react/views/text/TextAttributes;->getEffectiveFontSize()I

    move-result v1

    invoke-direct {v0, v1}, Lcom/facebook/react/views/text/internal/span/ReactAbsoluteSizeSpan;-><init>(I)V

    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v1

    const/4 v2, 0x0

    const v3, 0xff0012

    .line 785
    invoke-virtual {p1, v0, v2, v1, v3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 789
    new-instance v0, Lcom/facebook/react/views/text/internal/span/ReactForegroundColorSpan;

    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->getCurrentTextColor()I

    move-result v1

    invoke-direct {v0, v1}, Lcom/facebook/react/views/text/internal/span/ReactForegroundColorSpan;-><init>(I)V

    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v1

    .line 788
    invoke-virtual {p1, v0, v2, v1, v3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 791
    move-object v0, p0

    check-cast v0, Landroid/view/View;

    invoke-static {v0}, Lcom/facebook/react/uimanager/BackgroundStyleApplicator;->getBackgroundColor(Landroid/view/View;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 792
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-eqz v1, :cond_0

    .line 794
    new-instance v1, Lcom/facebook/react/views/text/internal/span/ReactBackgroundColorSpan;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {v1, v0}, Lcom/facebook/react/views/text/internal/span/ReactBackgroundColorSpan;-><init>(I)V

    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v0

    .line 793
    invoke-virtual {p1, v1, v2, v0, v3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 797
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->getPaintFlags()I

    move-result v0

    and-int/lit8 v0, v0, 0x10

    if-eqz v0, :cond_1

    .line 798
    new-instance v0, Lcom/facebook/react/views/text/internal/span/ReactStrikethroughSpan;

    invoke-direct {v0}, Lcom/facebook/react/views/text/internal/span/ReactStrikethroughSpan;-><init>()V

    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v1

    invoke-virtual {p1, v0, v2, v1, v3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 801
    :cond_1
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->getPaintFlags()I

    move-result v0

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_2

    .line 802
    new-instance v0, Lcom/facebook/react/views/text/internal/span/ReactUnderlineSpan;

    invoke-direct {v0}, Lcom/facebook/react/views/text/internal/span/ReactUnderlineSpan;-><init>()V

    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v1

    invoke-virtual {p1, v0, v2, v1, v3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 805
    :cond_2
    iget-object v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->textAttributes:Lcom/facebook/react/views/text/TextAttributes;

    invoke-virtual {v0}, Lcom/facebook/react/views/text/TextAttributes;->getEffectiveLetterSpacing()F

    move-result v0

    .line 806
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-nez v1, :cond_3

    .line 808
    new-instance v1, Lcom/facebook/react/views/text/internal/span/CustomLetterSpacingSpan;

    invoke-direct {v1, v0}, Lcom/facebook/react/views/text/internal/span/CustomLetterSpacingSpan;-><init>(F)V

    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v0

    .line 807
    invoke-virtual {p1, v1, v2, v0, v3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 811
    :cond_3
    iget v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->fontStyle:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_4

    .line 812
    iget v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->fontWeight:I

    if-ne v0, v1, :cond_4

    .line 813
    iget-object v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->fontFamily:Ljava/lang/String;

    if-nez v0, :cond_4

    .line 814
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->getFontFeatureSettings()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 816
    :cond_4
    new-instance v4, Lcom/facebook/react/views/text/internal/span/CustomStyleSpan;

    iget v5, p0, Lcom/facebook/react/views/textinput/ReactEditText;->fontStyle:I

    iget v6, p0, Lcom/facebook/react/views/textinput/ReactEditText;->fontWeight:I

    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->getFontFeatureSettings()Ljava/lang/String;

    move-result-object v7

    iget-object v8, p0, Lcom/facebook/react/views/textinput/ReactEditText;->fontFamily:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v9

    const-string v0, "getAssets(...)"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {v4 .. v9}, Lcom/facebook/react/views/text/internal/span/CustomStyleSpan;-><init>(IILjava/lang/String;Ljava/lang/String;Landroid/content/res/AssetManager;)V

    .line 818
    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v0

    .line 815
    invoke-virtual {p1, v4, v2, v0, v3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 822
    :cond_5
    iget-object v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->textAttributes:Lcom/facebook/react/views/text/TextAttributes;

    invoke-virtual {v0}, Lcom/facebook/react/views/text/TextAttributes;->getEffectiveLineHeight()F

    move-result v0

    .line 823
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-nez v1, :cond_6

    .line 824
    new-instance v1, Lcom/facebook/react/views/text/internal/span/CustomLineHeightSpan;

    invoke-direct {v1, v0}, Lcom/facebook/react/views/text/internal/span/CustomLineHeightSpan;-><init>(F)V

    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v0

    invoke-virtual {p1, v1, v2, v0, v3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    :cond_6
    return-void
.end method

.method private final clampToTextLength(I)I
    .locals 5

    .line 453
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Landroid/text/Editable;->length()I

    move-result v0

    :goto_0
    int-to-double v1, p1

    int-to-double v3, v0

    .line 454
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->min(DD)D

    move-result-wide v0

    const-wide/16 v2, 0x0

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(DD)D

    move-result-wide v0

    double-to-int p1, v0

    return p1

    .line 453
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Required value was null."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final getTextWatcherDelegator()Lcom/facebook/react/views/textinput/ReactEditText$TextWatcherDelegator;
    .locals 1

    .line 154
    iget-object v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->textWatcherDelegator:Lcom/facebook/react/views/textinput/ReactEditText$TextWatcherDelegator;

    if-nez v0, :cond_0

    .line 155
    new-instance v0, Lcom/facebook/react/views/textinput/ReactEditText$TextWatcherDelegator;

    invoke-direct {v0, p0}, Lcom/facebook/react/views/textinput/ReactEditText$TextWatcherDelegator;-><init>(Lcom/facebook/react/views/textinput/ReactEditText;)V

    iput-object v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->textWatcherDelegator:Lcom/facebook/react/views/textinput/ReactEditText$TextWatcherDelegator;

    .line 157
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->textWatcherDelegator:Lcom/facebook/react/views/textinput/ReactEditText$TextWatcherDelegator;

    return-object v0
.end method

.method private final isSecureText()Z
    .locals 1

    .line 165
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->getInputType()I

    move-result v0

    and-int/lit16 v0, v0, 0x90

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private final manageSpans(Landroid/text/SpannableStringBuilder;)V
    .locals 10

    .line 692
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 693
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->length()I

    move-result v1

    const-class v2, Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-interface {v0, v3, v1, v2}, Landroid/text/Editable;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v1

    .line 694
    array-length v2, v1

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_4

    .line 695
    aget-object v5, v1, v4

    .line 696
    invoke-interface {v0, v5}, Landroid/text/Editable;->getSpanFlags(Ljava/lang/Object;)I

    move-result v6

    and-int/lit8 v7, v6, 0x21

    const/16 v8, 0x21

    if-ne v7, v8, :cond_0

    const/4 v7, 0x1

    goto :goto_1

    :cond_0
    move v7, v3

    .line 701
    :goto_1
    instance-of v8, v5, Lcom/facebook/react/views/text/internal/span/ReactSpan;

    if-eqz v8, :cond_1

    .line 702
    invoke-interface {v0, v5}, Landroid/text/Editable;->removeSpan(Ljava/lang/Object;)V

    :cond_1
    if-nez v7, :cond_2

    goto :goto_2

    .line 710
    :cond_2
    invoke-interface {v0, v5}, Landroid/text/Editable;->getSpanStart(Ljava/lang/Object;)I

    move-result v7

    .line 711
    invoke-interface {v0, v5}, Landroid/text/Editable;->getSpanEnd(Ljava/lang/Object;)I

    move-result v8

    .line 715
    invoke-interface {v0, v5}, Landroid/text/Editable;->removeSpan(Ljava/lang/Object;)V

    .line 716
    sget-object v9, Lcom/facebook/react/views/textinput/ReactEditText;->Companion:Lcom/facebook/react/views/textinput/ReactEditText$Companion;

    invoke-static {v9, v0, p1, v7, v8}, Lcom/facebook/react/views/textinput/ReactEditText$Companion;->access$sameTextForSpan(Lcom/facebook/react/views/textinput/ReactEditText$Companion;Landroid/text/Editable;Landroid/text/SpannableStringBuilder;II)Z

    move-result v9

    if-eqz v9, :cond_3

    .line 717
    invoke-virtual {p1, v5, v7, v8, v6}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    :cond_3
    :goto_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_4
    return-void

    .line 692
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Required value was null."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final maybeSetSelection(II)V
    .locals 1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    if-eq p2, v0, :cond_0

    .line 445
    invoke-direct {p0, p1}, Lcom/facebook/react/views/textinput/ReactEditText;->clampToTextLength(I)I

    move-result p1

    .line 446
    invoke-direct {p0, p2}, Lcom/facebook/react/views/textinput/ReactEditText;->clampToTextLength(I)I

    move-result p2

    .line 448
    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/views/textinput/ReactEditText;->setSelection(II)V

    :cond_0
    return-void
.end method

.method private final maybeSetText(Lcom/facebook/react/views/text/ReactTextUpdate;)V
    .locals 6

    .line 634
    invoke-direct {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->isSecureText()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {p1}, Lcom/facebook/react/views/text/ReactTextUpdate;->getText()Landroid/text/Spannable;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 639
    :cond_0
    invoke-virtual {p1}, Lcom/facebook/react/views/text/ReactTextUpdate;->getJsEventCounter()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/facebook/react/views/textinput/ReactEditText;->canUpdateWithEventCount(I)Z

    move-result v0

    if-nez v0, :cond_1

    :goto_0
    return-void

    .line 643
    :cond_1
    sget-boolean v0, Lcom/facebook/react/views/textinput/ReactEditText;->DEBUG_MODE:Z

    if-eqz v0, :cond_2

    .line 645
    iget-object v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->TAG:Ljava/lang/String;

    .line 646
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->getId()I

    move-result v1

    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {p1}, Lcom/facebook/react/views/text/ReactTextUpdate;->getText()Landroid/text/Spannable;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "maybeSetText["

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v4, "]: current text: "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " update: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 644
    invoke-static {v0, v1}, Lcom/facebook/common/logging/FLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 653
    :cond_2
    new-instance v0, Landroid/text/SpannableStringBuilder;

    invoke-virtual {p1}, Lcom/facebook/react/views/text/ReactTextUpdate;->getText()Landroid/text/Spannable;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-direct {v0, v1}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 655
    invoke-direct {p0, v0}, Lcom/facebook/react/views/textinput/ReactEditText;->manageSpans(Landroid/text/SpannableStringBuilder;)V

    .line 656
    invoke-direct {p0, v0}, Lcom/facebook/react/views/textinput/ReactEditText;->stripStyleEquivalentSpans(Landroid/text/SpannableStringBuilder;)V

    .line 659
    invoke-virtual {p1}, Lcom/facebook/react/views/text/ReactTextUpdate;->containsImages()Z

    move-result v1

    iput-boolean v1, p0, Lcom/facebook/react/views/textinput/ReactEditText;->containsImages:Z

    const/4 v1, 0x1

    .line 664
    iput-boolean v1, p0, Lcom/facebook/react/views/textinput/ReactEditText;->disableTextDiffing:Z

    .line 668
    invoke-virtual {p1}, Lcom/facebook/react/views/text/ReactTextUpdate;->getText()Landroid/text/Spannable;

    move-result-object v1

    invoke-interface {v1}, Landroid/text/Spannable;->length()I

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_3

    const/4 v0, 0x0

    .line 669
    invoke-virtual {p0, v0}, Lcom/facebook/react/views/textinput/ReactEditText;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 674
    :cond_3
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->getText()Landroid/text/Editable;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->length()I

    move-result v3

    check-cast v0, Ljava/lang/CharSequence;

    invoke-interface {v1, v2, v3, v0}, Landroid/text/Editable;->replace(IILjava/lang/CharSequence;)Landroid/text/Editable;

    .line 676
    :goto_1
    iput-boolean v2, p0, Lcom/facebook/react/views/textinput/ReactEditText;->disableTextDiffing:Z

    .line 678
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->getBreakStrategy()I

    move-result v0

    invoke-virtual {p1}, Lcom/facebook/react/views/text/ReactTextUpdate;->getTextBreakStrategy()I

    move-result v1

    if-eq v0, v1, :cond_4

    .line 679
    invoke-virtual {p1}, Lcom/facebook/react/views/text/ReactTextUpdate;->getTextBreakStrategy()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/facebook/react/views/textinput/ReactEditText;->setBreakStrategy(I)V

    .line 683
    :cond_4
    invoke-direct {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->updateCachedSpannable()V

    return-void

    .line 674
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Required value was null."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final onContentSizeChange()V
    .locals 1

    .line 835
    iget-object v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->contentSizeWatcher:Lcom/facebook/react/views/textinput/ContentSizeWatcher;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/facebook/react/views/textinput/ContentSizeWatcher;->onLayout()V

    .line 837
    :cond_0
    invoke-direct {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->setIntrinsicContentSize()V

    return-void
.end method

.method private final requestFocusProgrammatically()Z
    .locals 2

    const/16 v0, 0x82

    const/4 v1, 0x0

    .line 389
    invoke-super {p0, v0, v1}, Landroidx/appcompat/widget/AppCompatEditText;->requestFocus(ILandroid/graphics/Rect;)Z

    move-result v0

    .line 390
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->isInTouchMode()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->getShowSoftInputOnFocus()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 391
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->showSoftKeyboard()Z

    :cond_0
    return v0
.end method

.method private final setIntrinsicContentSize()V
    .locals 3

    .line 847
    move-object v0, p0

    check-cast v0, Landroid/view/View;

    invoke-static {v0}, Lcom/facebook/react/uimanager/UIManagerHelper;->getReactContext(Landroid/view/View;)Lcom/facebook/react/bridge/ReactContext;

    move-result-object v0

    .line 849
    sget-boolean v1, Lcom/facebook/react/common/build/ReactBuildConfig;->UNSTABLE_ENABLE_MINIFY_LEGACY_ARCHITECTURE:Z

    if-nez v1, :cond_0

    .line 851
    iget-object v1, p0, Lcom/facebook/react/views/textinput/ReactEditText;->stateWrapper:Lcom/facebook/react/uimanager/StateWrapper;

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lcom/facebook/react/bridge/ReactContext;->isBridgeless()Z

    move-result v1

    if-nez v1, :cond_0

    .line 852
    new-instance v1, Lcom/facebook/react/views/textinput/ReactTextInputLocalData;

    move-object v2, p0

    check-cast v2, Landroid/widget/EditText;

    invoke-direct {v1, v2}, Lcom/facebook/react/views/textinput/ReactTextInputLocalData;-><init>(Landroid/widget/EditText;)V

    .line 853
    const-class v2, Lcom/facebook/react/uimanager/UIManagerModule;

    invoke-virtual {v0, v2}, Lcom/facebook/react/bridge/ReactContext;->getNativeModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/uimanager/UIManagerModule;

    if-eqz v0, :cond_0

    .line 854
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->getId()I

    move-result v2

    invoke-virtual {v0, v2, v1}, Lcom/facebook/react/uimanager/UIManagerModule;->setViewLocalData(ILjava/lang/Object;)V

    :cond_0
    return-void
.end method

.method private final stripSpansOfKind(Landroid/text/SpannableStringBuilder;Ljava/lang/Class;Landroidx/core/util/Predicate;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroid/text/SpannableStringBuilder;",
            "Ljava/lang/Class<",
            "TT;>;",
            "Landroidx/core/util/Predicate<",
            "TT;>;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 765
    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v1

    invoke-virtual {p1, v0, v1, p2}, Landroid/text/SpannableStringBuilder;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object p2

    .line 767
    invoke-static {p2}, Lkotlin/jvm/internal/ArrayIteratorKt;->iterator([Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 768
    invoke-interface {p3, v0}, Landroidx/core/util/Predicate;->test(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 769
    invoke-virtual {p1, v0}, Landroid/text/SpannableStringBuilder;->removeSpan(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method private final stripStyleEquivalentSpans(Landroid/text/SpannableStringBuilder;)V
    .locals 2

    .line 728
    const-class v0, Lcom/facebook/react/views/text/internal/span/ReactAbsoluteSizeSpan;

    new-instance v1, Lcom/facebook/react/views/textinput/ReactEditText$$ExternalSyntheticLambda0;

    invoke-direct {v1, p0}, Lcom/facebook/react/views/textinput/ReactEditText$$ExternalSyntheticLambda0;-><init>(Lcom/facebook/react/views/textinput/ReactEditText;)V

    invoke-direct {p0, p1, v0, v1}, Lcom/facebook/react/views/textinput/ReactEditText;->stripSpansOfKind(Landroid/text/SpannableStringBuilder;Ljava/lang/Class;Landroidx/core/util/Predicate;)V

    .line 732
    const-class v0, Lcom/facebook/react/views/text/internal/span/ReactBackgroundColorSpan;

    new-instance v1, Lcom/facebook/react/views/textinput/ReactEditText$$ExternalSyntheticLambda1;

    invoke-direct {v1, p0}, Lcom/facebook/react/views/textinput/ReactEditText$$ExternalSyntheticLambda1;-><init>(Lcom/facebook/react/views/textinput/ReactEditText;)V

    invoke-direct {p0, p1, v0, v1}, Lcom/facebook/react/views/textinput/ReactEditText;->stripSpansOfKind(Landroid/text/SpannableStringBuilder;Ljava/lang/Class;Landroidx/core/util/Predicate;)V

    .line 736
    const-class v0, Lcom/facebook/react/views/text/internal/span/ReactForegroundColorSpan;

    new-instance v1, Lcom/facebook/react/views/textinput/ReactEditText$$ExternalSyntheticLambda2;

    invoke-direct {v1, p0}, Lcom/facebook/react/views/textinput/ReactEditText$$ExternalSyntheticLambda2;-><init>(Lcom/facebook/react/views/textinput/ReactEditText;)V

    invoke-direct {p0, p1, v0, v1}, Lcom/facebook/react/views/textinput/ReactEditText;->stripSpansOfKind(Landroid/text/SpannableStringBuilder;Ljava/lang/Class;Landroidx/core/util/Predicate;)V

    .line 740
    const-class v0, Lcom/facebook/react/views/text/internal/span/ReactStrikethroughSpan;

    new-instance v1, Lcom/facebook/react/views/textinput/ReactEditText$$ExternalSyntheticLambda3;

    invoke-direct {v1, p0}, Lcom/facebook/react/views/textinput/ReactEditText$$ExternalSyntheticLambda3;-><init>(Lcom/facebook/react/views/textinput/ReactEditText;)V

    invoke-direct {p0, p1, v0, v1}, Lcom/facebook/react/views/textinput/ReactEditText;->stripSpansOfKind(Landroid/text/SpannableStringBuilder;Ljava/lang/Class;Landroidx/core/util/Predicate;)V

    .line 744
    const-class v0, Lcom/facebook/react/views/text/internal/span/ReactUnderlineSpan;

    new-instance v1, Lcom/facebook/react/views/textinput/ReactEditText$$ExternalSyntheticLambda4;

    invoke-direct {v1, p0}, Lcom/facebook/react/views/textinput/ReactEditText$$ExternalSyntheticLambda4;-><init>(Lcom/facebook/react/views/textinput/ReactEditText;)V

    invoke-direct {p0, p1, v0, v1}, Lcom/facebook/react/views/textinput/ReactEditText;->stripSpansOfKind(Landroid/text/SpannableStringBuilder;Ljava/lang/Class;Landroidx/core/util/Predicate;)V

    .line 748
    const-class v0, Lcom/facebook/react/views/text/internal/span/CustomLetterSpacingSpan;

    new-instance v1, Lcom/facebook/react/views/textinput/ReactEditText$$ExternalSyntheticLambda5;

    invoke-direct {v1, p0}, Lcom/facebook/react/views/textinput/ReactEditText$$ExternalSyntheticLambda5;-><init>(Lcom/facebook/react/views/textinput/ReactEditText;)V

    invoke-direct {p0, p1, v0, v1}, Lcom/facebook/react/views/textinput/ReactEditText;->stripSpansOfKind(Landroid/text/SpannableStringBuilder;Ljava/lang/Class;Landroidx/core/util/Predicate;)V

    .line 752
    const-class v0, Lcom/facebook/react/views/text/internal/span/CustomStyleSpan;

    new-instance v1, Lcom/facebook/react/views/textinput/ReactEditText$$ExternalSyntheticLambda6;

    invoke-direct {v1, p0}, Lcom/facebook/react/views/textinput/ReactEditText$$ExternalSyntheticLambda6;-><init>(Lcom/facebook/react/views/textinput/ReactEditText;)V

    invoke-direct {p0, p1, v0, v1}, Lcom/facebook/react/views/textinput/ReactEditText;->stripSpansOfKind(Landroid/text/SpannableStringBuilder;Ljava/lang/Class;Landroidx/core/util/Predicate;)V

    return-void
.end method

.method private static final stripStyleEquivalentSpans$lambda$1(Lcom/facebook/react/views/textinput/ReactEditText;Lcom/facebook/react/views/text/internal/span/ReactAbsoluteSizeSpan;)Z
    .locals 1

    const-string/jumbo v0, "span"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 729
    invoke-virtual {p1}, Lcom/facebook/react/views/text/internal/span/ReactAbsoluteSizeSpan;->getSize()I

    move-result p1

    iget-object p0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->textAttributes:Lcom/facebook/react/views/text/TextAttributes;

    invoke-virtual {p0}, Lcom/facebook/react/views/text/TextAttributes;->getEffectiveFontSize()I

    move-result p0

    if-ne p1, p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static final stripStyleEquivalentSpans$lambda$2(Lcom/facebook/react/views/textinput/ReactEditText;Lcom/facebook/react/views/text/internal/span/ReactBackgroundColorSpan;)Z
    .locals 1

    const-string/jumbo v0, "span"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 733
    invoke-virtual {p1}, Lcom/facebook/react/views/text/internal/span/ReactBackgroundColorSpan;->getBackgroundColor()I

    move-result p1

    check-cast p0, Landroid/view/View;

    invoke-static {p0}, Lcom/facebook/react/uimanager/BackgroundStyleApplicator;->getBackgroundColor(Landroid/view/View;)Ljava/lang/Integer;

    move-result-object p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    if-ne p1, p0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method private static final stripStyleEquivalentSpans$lambda$3(Lcom/facebook/react/views/textinput/ReactEditText;Lcom/facebook/react/views/text/internal/span/ReactForegroundColorSpan;)Z
    .locals 1

    const-string/jumbo v0, "span"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 737
    invoke-virtual {p1}, Lcom/facebook/react/views/text/internal/span/ReactForegroundColorSpan;->getForegroundColor()I

    move-result p1

    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->getCurrentTextColor()I

    move-result p0

    if-ne p1, p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static final stripStyleEquivalentSpans$lambda$4(Lcom/facebook/react/views/textinput/ReactEditText;Lcom/facebook/react/views/text/internal/span/ReactStrikethroughSpan;)Z
    .locals 0

    .line 741
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->getPaintFlags()I

    move-result p0

    and-int/lit8 p0, p0, 0x10

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static final stripStyleEquivalentSpans$lambda$5(Lcom/facebook/react/views/textinput/ReactEditText;Lcom/facebook/react/views/text/internal/span/ReactUnderlineSpan;)Z
    .locals 0

    .line 745
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->getPaintFlags()I

    move-result p0

    and-int/lit8 p0, p0, 0x8

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static final stripStyleEquivalentSpans$lambda$6(Lcom/facebook/react/views/textinput/ReactEditText;Lcom/facebook/react/views/text/internal/span/CustomLetterSpacingSpan;)Z
    .locals 1

    const-string/jumbo v0, "span"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 749
    invoke-virtual {p1}, Lcom/facebook/react/views/text/internal/span/CustomLetterSpacingSpan;->getSpacing()F

    move-result p1

    iget-object p0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->textAttributes:Lcom/facebook/react/views/text/TextAttributes;

    invoke-virtual {p0}, Lcom/facebook/react/views/text/TextAttributes;->getEffectiveLetterSpacing()F

    move-result p0

    cmpg-float p0, p1, p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static final stripStyleEquivalentSpans$lambda$7(Lcom/facebook/react/views/textinput/ReactEditText;Lcom/facebook/react/views/text/internal/span/CustomStyleSpan;)Z
    .locals 2

    const-string/jumbo v0, "span"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 753
    invoke-virtual {p1}, Lcom/facebook/react/views/text/internal/span/CustomStyleSpan;->getStyle()I

    move-result v0

    iget v1, p0, Lcom/facebook/react/views/textinput/ReactEditText;->fontStyle:I

    if-ne v0, v1, :cond_0

    .line 754
    invoke-virtual {p1}, Lcom/facebook/react/views/text/internal/span/CustomStyleSpan;->getFontFamily()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/react/views/textinput/ReactEditText;->fontFamily:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 755
    invoke-virtual {p1}, Lcom/facebook/react/views/text/internal/span/CustomStyleSpan;->getWeight()I

    move-result v0

    iget v1, p0, Lcom/facebook/react/views/textinput/ReactEditText;->fontWeight:I

    if-ne v0, v1, :cond_0

    .line 756
    invoke-virtual {p1}, Lcom/facebook/react/views/text/internal/span/CustomStyleSpan;->getFontFeatureSettings()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->getFontFeatureSettings()Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private final updateCachedSpannable()V
    .locals 5

    .line 1068
    iget-object v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->stateWrapper:Lcom/facebook/react/uimanager/StateWrapper;

    if-nez v0, :cond_0

    goto :goto_0

    .line 1072
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->getId()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    :goto_0
    return-void

    .line 1076
    :cond_1
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    .line 1077
    move-object v1, v0

    check-cast v1, Ljava/lang/CharSequence;

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    move v1, v2

    goto :goto_2

    :cond_3
    :goto_1
    const/4 v1, 0x1

    .line 1079
    :goto_2
    new-instance v3, Landroid/text/SpannableStringBuilder;

    invoke-direct {v3}, Landroid/text/SpannableStringBuilder;-><init>()V

    if-eqz v0, :cond_4

    if-nez v1, :cond_4

    .line 1117
    :try_start_0
    invoke-interface {v0}, Landroid/text/Editable;->length()I

    move-result v4

    invoke-interface {v0, v2, v4}, Landroid/text/Editable;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception v0

    .line 1119
    iget-object v4, p0, Lcom/facebook/react/views/textinput/ReactEditText;->TAG:Ljava/lang/String;

    check-cast v0, Ljava/lang/Throwable;

    invoke-static {v4, v0}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    :goto_3
    if-eqz v1, :cond_6

    .line 1127
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->getHint()Ljava/lang/CharSequence;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->getHint()Ljava/lang/CharSequence;

    move-result-object v0

    const-string v1, "getHint(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_5

    .line 1128
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->getHint()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    goto :goto_4

    .line 1129
    :cond_5
    move-object v0, p0

    check-cast v0, Landroid/view/View;

    invoke-static {v0}, Lcom/facebook/react/uimanager/common/ViewUtil;->getUIManagerType(Landroid/view/View;)I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_6

    .line 1131
    const-string v0, "I"

    check-cast v0, Ljava/lang/CharSequence;

    invoke-virtual {v3, v0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 1135
    :cond_6
    :goto_4
    invoke-direct {p0, v3}, Lcom/facebook/react/views/textinput/ReactEditText;->addSpansFromStyleAttributes(Landroid/text/SpannableStringBuilder;)V

    .line 1137
    new-instance v0, Lcom/facebook/react/views/text/internal/span/ReactTextPaintHolderSpan;

    new-instance v1, Landroid/text/TextPaint;

    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->getPaint()Landroid/text/TextPaint;

    move-result-object v4

    check-cast v4, Landroid/graphics/Paint;

    invoke-direct {v1, v4}, Landroid/text/TextPaint;-><init>(Landroid/graphics/Paint;)V

    invoke-direct {v0, v1}, Lcom/facebook/react/views/text/internal/span/ReactTextPaintHolderSpan;-><init>(Landroid/text/TextPaint;)V

    .line 1139
    invoke-virtual {v3}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v1

    const/16 v4, 0x12

    .line 1136
    invoke-virtual {v3, v0, v2, v1, v4}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 1141
    sget-object v0, Lcom/facebook/react/views/text/TextLayoutManager;->INSTANCE:Lcom/facebook/react/views/text/TextLayoutManager;

    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->getId()I

    move-result v1

    check-cast v3, Landroid/text/Spannable;

    invoke-virtual {v0, v1, v3}, Lcom/facebook/react/views/text/TextLayoutManager;->setCachedSpannableForTag(ILandroid/text/Spannable;)V

    return-void
.end method

.method private final updateImeOptions()V
    .locals 3

    .line 862
    iget-object v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->returnKeyType:Ljava/lang/String;

    const/4 v1, 0x6

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v2

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v2, "send"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x4

    goto :goto_0

    :sswitch_1
    const-string v2, "none"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x1

    goto :goto_0

    :sswitch_2
    const-string v2, "next"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x5

    goto :goto_0

    :sswitch_3
    const-string v2, "done"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :sswitch_4
    const-string v2, "go"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v1, 0x2

    goto :goto_0

    :sswitch_5
    const-string v2, "search"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    const/4 v1, 0x3

    goto :goto_0

    :sswitch_6
    const-string v2, "previous"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_0

    :cond_5
    const/4 v1, 0x7

    .line 873
    :cond_6
    :goto_0
    iget-boolean v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->disableFullscreen:Z

    if-eqz v0, :cond_7

    const/high16 v0, 0x2000000

    or-int/2addr v1, v0

    .line 872
    :cond_7
    invoke-virtual {p0, v1}, Lcom/facebook/react/views/textinput/ReactEditText;->setImeOptions(I)V

    return-void

    :sswitch_data_0
    .sparse-switch
        -0x4bec4509 -> :sswitch_6
        -0x36059a58 -> :sswitch_5
        0xce8 -> :sswitch_4
        0x2f2382 -> :sswitch_3
        0x338af3 -> :sswitch_2
        0x33af38 -> :sswitch_1
        0x35cf88 -> :sswitch_0
    .end sparse-switch
.end method


# virtual methods
.method public addTextChangedListener(Landroid/text/TextWatcher;)V
    .locals 1

    const-string/jumbo v0, "watcher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 398
    iget-object v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->listeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    if-nez v0, :cond_0

    .line 399
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->listeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 400
    invoke-direct {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->getTextWatcherDelegator()Lcom/facebook/react/views/textinput/ReactEditText$TextWatcherDelegator;

    move-result-object v0

    check-cast v0, Landroid/text/TextWatcher;

    invoke-super {p0, v0}, Landroidx/appcompat/widget/AppCompatEditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 402
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->listeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    return-void
.end method

.method protected final applyTextAttributes()V
    .locals 2

    .line 1052
    iget-object v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->textAttributes:Lcom/facebook/react/views/text/TextAttributes;

    invoke-virtual {v0}, Lcom/facebook/react/views/text/TextAttributes;->getEffectiveFontSize()I

    move-result v0

    int-to-float v0, v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Lcom/facebook/react/views/textinput/ReactEditText;->setTextSize(IF)V

    .line 1054
    iget-object v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->textAttributes:Lcom/facebook/react/views/text/TextAttributes;

    invoke-virtual {v0}, Lcom/facebook/react/views/text/TextAttributes;->getEffectiveLetterSpacing()F

    move-result v0

    .line 1055
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-nez v1, :cond_0

    .line 1056
    invoke-virtual {p0, v0}, Lcom/facebook/react/views/textinput/ReactEditText;->setLetterSpacing(F)V

    :cond_0
    return-void
.end method

.method public final canUpdateWithEventCount(I)Z
    .locals 1

    .line 631
    iget v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->nativeEventCount:I

    if-lt p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final clearFocusAndMaybeRefocus$ReactAndroid_release()V
    .locals 3

    .line 364
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-gt v0, v1, :cond_1

    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->isInTouchMode()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 370
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->getRootView()Landroid/view/View;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.view.ViewGroup"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/view/ViewGroup;

    .line 371
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getDescendantFocusability()I

    move-result v1

    const/high16 v2, 0x60000

    .line 372
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->setDescendantFocusability(I)V

    .line 373
    invoke-super {p0}, Landroidx/appcompat/widget/AppCompatEditText;->clearFocus()V

    .line 374
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setDescendantFocusability(I)V

    goto :goto_1

    .line 365
    :cond_1
    :goto_0
    invoke-super {p0}, Landroidx/appcompat/widget/AppCompatEditText;->clearFocus()V

    .line 376
    :goto_1
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->hideSoftKeyboard()V

    return-void
.end method

.method public final clearFocusFromJS$ReactAndroid_release()V
    .locals 0

    .line 380
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->clearFocusAndMaybeRefocus$ReactAndroid_release()V

    return-void
.end method

.method public final commitStagedInputType$ReactAndroid_release()V
    .locals 3

    .line 519
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->getInputType()I

    move-result v0

    iget v1, p0, Lcom/facebook/react/views/textinput/ReactEditText;->stagedInputType:I

    if-eq v0, v1, :cond_0

    .line 520
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->getSelectionStart()I

    move-result v0

    .line 521
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->getSelectionEnd()I

    move-result v1

    .line 522
    iget v2, p0, Lcom/facebook/react/views/textinput/ReactEditText;->stagedInputType:I

    invoke-virtual {p0, v2}, Lcom/facebook/react/views/textinput/ReactEditText;->setInputType(I)V

    .line 524
    invoke-direct {p0, v0, v1}, Lcom/facebook/react/views/textinput/ReactEditText;->maybeSetSelection(II)V

    :cond_0
    return-void
.end method

.method protected final finalize()V
    .locals 4

    .line 271
    sget-boolean v0, Lcom/facebook/react/views/textinput/ReactEditText;->DEBUG_MODE:Z

    if-eqz v0, :cond_0

    .line 272
    iget-object v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->TAG:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->getId()I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "finalize["

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "] delete cached spannable"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/common/logging/FLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 274
    :cond_0
    sget-object v0, Lcom/facebook/react/views/text/TextLayoutManager;->INSTANCE:Lcom/facebook/react/views/text/TextLayoutManager;

    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->getId()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/facebook/react/views/text/TextLayoutManager;->deleteCachedSpannableForTag(I)V

    return-void
.end method

.method public final getBorderColor(I)I
    .locals 2

    .line 990
    move-object v0, p0

    check-cast v0, Landroid/view/View;

    invoke-static {}, Lcom/facebook/react/uimanager/style/LogicalEdge;->getEntries()Lkotlin/enums/EnumEntries;

    move-result-object v1

    invoke-interface {v1, p1}, Lkotlin/enums/EnumEntries;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/facebook/react/uimanager/style/LogicalEdge;

    invoke-static {v0, p1}, Lcom/facebook/react/uimanager/BackgroundStyleApplicator;->getBorderColor(Landroid/view/View;Lcom/facebook/react/uimanager/style/LogicalEdge;)Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method protected final getContainsImages()Z
    .locals 1

    .line 123
    iget-boolean v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->containsImages:Z

    return v0
.end method

.method public final getDisableFullscreenUI()Z
    .locals 1

    .line 170
    iget-boolean v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->disableFullscreen:Z

    return v0
.end method

.method public final getDisableTextDiffing$ReactAndroid_release()Z
    .locals 1

    .line 147
    iget-boolean v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->disableTextDiffing:Z

    return v0
.end method

.method public final getDragAndDropFilter()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 125
    iget-object v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->dragAndDropFilter:Ljava/util/List;

    return-object v0
.end method

.method public final getGravityHorizontal$ReactAndroid_release()I
    .locals 2

    .line 184
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->getGravity()I

    move-result v0

    const v1, 0x800007

    and-int/2addr v0, v1

    return v0
.end method

.method public final getGravityVertical$ReactAndroid_release()I
    .locals 1

    .line 194
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->getGravity()I

    move-result v0

    and-int/lit8 v0, v0, 0x70

    return v0
.end method

.method protected final getNativeEventCount()I
    .locals 1

    .line 118
    iget v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->nativeEventCount:I

    return v0
.end method

.method public final getReturnKeyType()Ljava/lang/String;
    .locals 1

    .line 176
    iget-object v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->returnKeyType:Ljava/lang/String;

    return-object v0
.end method

.method public final getStagedInputType()I
    .locals 1

    .line 122
    iget v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->stagedInputType:I

    return v0
.end method

.method public final getStateWrapper()Lcom/facebook/react/uimanager/StateWrapper;
    .locals 1

    .line 146
    iget-object v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->stateWrapper:Lcom/facebook/react/uimanager/StateWrapper;

    return-object v0
.end method

.method public final getSubmitBehavior()Ljava/lang/String;
    .locals 1

    .line 124
    iget-object v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->submitBehavior:Ljava/lang/String;

    return-object v0
.end method

.method protected final hideSoftKeyboard()V
    .locals 3

    .line 831
    iget-object v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->inputMethodManager:Landroid/view/inputmethod/InputMethodManager;

    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    return-void
.end method

.method public final incrementAndGetEventCounter()I
    .locals 1

    .line 617
    iget v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->nativeEventCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->nativeEventCount:I

    return v0
.end method

.method public invalidateDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 4

    const-string v0, "drawable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 894
    iget-boolean v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->containsImages:Z

    if-eqz v0, :cond_2

    .line 895
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    check-cast v0, Landroid/text/Spanned;

    if-eqz v0, :cond_1

    .line 896
    invoke-interface {v0}, Landroid/text/Spanned;->length()I

    move-result v1

    const-class v2, Lcom/facebook/react/views/text/internal/span/TextInlineImageSpan;

    const/4 v3, 0x0

    invoke-interface {v0, v3, v1, v2}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/react/views/text/internal/span/TextInlineImageSpan;

    .line 897
    invoke-static {v0}, Lkotlin/jvm/internal/ArrayIteratorKt;->iterator([Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/react/views/text/internal/span/TextInlineImageSpan;

    .line 898
    invoke-virtual {v1}, Lcom/facebook/react/views/text/internal/span/TextInlineImageSpan;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-ne v1, p1, :cond_0

    .line 899
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->invalidate()V

    goto :goto_0

    .line 896
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Required value was null."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 903
    :cond_2
    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatEditText;->invalidateDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public isLayoutRequested()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final isMultiline$ReactAndroid_release()Z
    .locals 2

    .line 161
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->getInputType()I

    move-result v0

    const/high16 v1, 0x20000

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method protected final isSettingTextFromJS()Z
    .locals 1

    .line 113
    iget-boolean v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->isSettingTextFromJS:Z

    return v0
.end method

.method protected final isSettingTextFromState()Z
    .locals 1

    .line 148
    iget-boolean v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->isSettingTextFromState:Z

    return v0
.end method

.method public final maybeSetSelection(III)V
    .locals 0

    .line 433
    invoke-virtual {p0, p1}, Lcom/facebook/react/views/textinput/ReactEditText;->canUpdateWithEventCount(I)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    .line 437
    :cond_0
    invoke-direct {p0, p2, p3}, Lcom/facebook/react/views/textinput/ReactEditText;->maybeSetSelection(II)V

    return-void
.end method

.method public final maybeSetTextFromJS(Lcom/facebook/react/views/text/ReactTextUpdate;)V
    .locals 1

    const-string v0, "reactTextUpdate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 620
    iput-boolean v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->isSettingTextFromJS:Z

    .line 621
    invoke-direct {p0, p1}, Lcom/facebook/react/views/textinput/ReactEditText;->maybeSetText(Lcom/facebook/react/views/text/ReactTextUpdate;)V

    const/4 p1, 0x0

    .line 622
    iput-boolean p1, p0, Lcom/facebook/react/views/textinput/ReactEditText;->isSettingTextFromJS:Z

    return-void
.end method

.method public final maybeSetTextFromState(Lcom/facebook/react/views/text/ReactTextUpdate;)V
    .locals 1

    const-string v0, "reactTextUpdate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 626
    iput-boolean v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->isSettingTextFromState:Z

    .line 627
    invoke-direct {p0, p1}, Lcom/facebook/react/views/textinput/ReactEditText;->maybeSetText(Lcom/facebook/react/views/text/ReactTextUpdate;)V

    const/4 p1, 0x0

    .line 628
    iput-boolean p1, p0, Lcom/facebook/react/views/textinput/ReactEditText;->isSettingTextFromState:Z

    return-void
.end method

.method public final maybeUpdateTypeface()V
    .locals 6

    .line 591
    iget-boolean v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->typefaceDirty:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 595
    iput-boolean v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->typefaceDirty:Z

    .line 597
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v0

    iget v1, p0, Lcom/facebook/react/views/textinput/ReactEditText;->fontStyle:I

    iget v2, p0, Lcom/facebook/react/views/textinput/ReactEditText;->fontWeight:I

    iget-object v3, p0, Lcom/facebook/react/views/textinput/ReactEditText;->fontFamily:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v4

    const-string v5, "getAssets(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v1, v2, v3, v4}, Lcom/facebook/react/views/text/ReactTypefaceUtils;->applyStyles(Landroid/graphics/Typeface;IILjava/lang/String;Landroid/content/res/AssetManager;)Landroid/graphics/Typeface;

    move-result-object v0

    .line 598
    invoke-virtual {p0, v0}, Lcom/facebook/react/views/textinput/ReactEditText;->setTypeface(Landroid/graphics/Typeface;)V

    .line 603
    iget v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->fontStyle:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_2

    .line 604
    iget v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->fontWeight:I

    if-ne v0, v1, :cond_2

    .line 605
    iget-object v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->fontFamily:Ljava/lang/String;

    if-nez v0, :cond_2

    .line 606
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->getFontFeatureSettings()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 609
    :cond_1
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->getPaintFlags()I

    move-result v0

    and-int/lit16 v0, v0, -0x81

    goto :goto_1

    .line 607
    :cond_2
    :goto_0
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->getPaintFlags()I

    move-result v0

    or-int/lit16 v0, v0, 0x80

    .line 602
    :goto_1
    invoke-virtual {p0, v0}, Lcom/facebook/react/views/textinput/ReactEditText;->setPaintFlags(I)V

    return-void
.end method

.method public onAttachedToWindow()V
    .locals 5

    .line 938
    invoke-super {p0}, Landroidx/appcompat/widget/AppCompatEditText;->onAttachedToWindow()V

    .line 940
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->getSelectionStart()I

    move-result v0

    .line 941
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->getSelectionEnd()I

    move-result v1

    const/4 v2, 0x1

    .line 946
    invoke-super {p0, v2}, Landroidx/appcompat/widget/AppCompatEditText;->setTextIsSelectable(Z)V

    .line 949
    invoke-direct {p0, v0, v1}, Lcom/facebook/react/views/textinput/ReactEditText;->maybeSetSelection(II)V

    .line 951
    iget-boolean v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->containsImages:Z

    if-eqz v0, :cond_1

    .line 952
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    check-cast v0, Landroid/text/Spanned;

    if-eqz v0, :cond_0

    .line 953
    invoke-interface {v0}, Landroid/text/Spanned;->length()I

    move-result v1

    const-class v3, Lcom/facebook/react/views/text/internal/span/TextInlineImageSpan;

    const/4 v4, 0x0

    invoke-interface {v0, v4, v1, v3}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/react/views/text/internal/span/TextInlineImageSpan;

    .line 954
    invoke-static {v0}, Lkotlin/jvm/internal/ArrayIteratorKt;->iterator([Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/react/views/text/internal/span/TextInlineImageSpan;

    .line 955
    invoke-virtual {v1}, Lcom/facebook/react/views/text/internal/span/TextInlineImageSpan;->onAttachedToWindow()V

    goto :goto_0

    .line 953
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required value was null."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 959
    :cond_1
    iget-boolean v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->autoFocus:Z

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->didAttachToWindow:Z

    if-nez v0, :cond_2

    .line 960
    invoke-direct {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->requestFocusProgrammatically()Z

    .line 963
    :cond_2
    iput-boolean v2, p0, Lcom/facebook/react/views/textinput/ReactEditText;->didAttachToWindow:Z

    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    const-string v0, "newConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 929
    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatEditText;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 931
    invoke-static {}, Lcom/facebook/react/internal/featureflags/ReactNativeNewArchitectureFeatureFlags;->enableBridgelessArchitecture()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 932
    invoke-static {}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->enableFontScaleChangesUpdatingLayout()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 933
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->applyTextAttributes()V

    :cond_0
    return-void
.end method

.method public onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 4

    const-string v0, "outAttrs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 340
    move-object v0, p0

    check-cast v0, Landroid/view/View;

    invoke-static {v0}, Lcom/facebook/react/uimanager/UIManagerHelper;->getReactContext(Landroid/view/View;)Lcom/facebook/react/bridge/ReactContext;

    move-result-object v0

    .line 341
    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatEditText;->onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 342
    iget-boolean v2, p0, Lcom/facebook/react/views/textinput/ReactEditText;->onKeyPress:Z

    if-eqz v2, :cond_1

    .line 344
    new-instance v2, Lcom/facebook/react/views/textinput/ReactEditTextInputConnectionWrapper;

    .line 345
    iget-object v3, p0, Lcom/facebook/react/views/textinput/ReactEditText;->eventDispatcher:Lcom/facebook/react/uimanager/events/EventDispatcher;

    if-eqz v3, :cond_0

    .line 344
    invoke-direct {v2, v1, v0, p0, v3}, Lcom/facebook/react/views/textinput/ReactEditTextInputConnectionWrapper;-><init>(Landroid/view/inputmethod/InputConnection;Lcom/facebook/react/bridge/ReactContext;Lcom/facebook/react/views/textinput/ReactEditText;Lcom/facebook/react/uimanager/events/EventDispatcher;)V

    move-object v1, v2

    check-cast v1, Landroid/view/inputmethod/InputConnection;

    goto :goto_0

    .line 345
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Required value was null."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 348
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->isMultiline$ReactAndroid_release()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->shouldBlurOnReturn()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->shouldSubmitOnReturn()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 350
    :cond_2
    iget v0, p1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    const v2, -0x40000001    # -1.9999999f

    and-int/2addr v0, v2

    iput v0, p1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    :cond_3
    return-object v1
.end method

.method public onDetachedFromWindow()V
    .locals 4

    .line 907
    invoke-super {p0}, Landroidx/appcompat/widget/AppCompatEditText;->onDetachedFromWindow()V

    .line 908
    iget-boolean v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->containsImages:Z

    if-eqz v0, :cond_1

    .line 909
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    check-cast v0, Landroid/text/Spanned;

    if-eqz v0, :cond_0

    .line 910
    invoke-interface {v0}, Landroid/text/Spanned;->length()I

    move-result v1

    const-class v2, Lcom/facebook/react/views/text/internal/span/TextInlineImageSpan;

    const/4 v3, 0x0

    invoke-interface {v0, v3, v1, v2}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/react/views/text/internal/span/TextInlineImageSpan;

    .line 911
    invoke-static {v0}, Lkotlin/jvm/internal/ArrayIteratorKt;->iterator([Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/react/views/text/internal/span/TextInlineImageSpan;

    .line 912
    invoke-virtual {v1}, Lcom/facebook/react/views/text/internal/span/TextInlineImageSpan;->onDetachedFromWindow()V

    goto :goto_0

    .line 910
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required value was null."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    return-void
.end method

.method public onDragEvent(Landroid/view/DragEvent;)Z
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1168
    iget-object v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->dragAndDropFilter:Ljava/util/List;

    if-eqz v0, :cond_3

    .line 1169
    invoke-virtual {p1}, Landroid/view/DragEvent;->getAction()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_3

    .line 1170
    check-cast v0, Ljava/lang/Iterable;

    .line 1273
    instance-of v1, v0, Ljava/util/Collection;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 1274
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 1170
    invoke-virtual {p1}, Landroid/view/DragEvent;->getClipDescription()Landroid/content/ClipDescription;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/content/ClipDescription;->hasMimeType(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1

    .line 1175
    :cond_3
    :goto_1
    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatEditText;->onDragEvent(Landroid/view/DragEvent;)Z

    move-result p1

    return p1
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 2

    const-string v0, "canvas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1160
    iget-object v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->overflow:Lcom/facebook/react/uimanager/style/Overflow;

    sget-object v1, Lcom/facebook/react/uimanager/style/Overflow;->VISIBLE:Lcom/facebook/react/uimanager/style/Overflow;

    if-eq v0, v1, :cond_0

    .line 1161
    move-object v0, p0

    check-cast v0, Landroid/view/View;

    invoke-static {v0, p1}, Lcom/facebook/react/uimanager/BackgroundStyleApplicator;->clipToPaddingBox(Landroid/view/View;Landroid/graphics/Canvas;)V

    .line 1164
    :cond_0
    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatEditText;->onDraw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public onFinishTemporaryDetach()V
    .locals 4

    .line 967
    invoke-super {p0}, Landroidx/appcompat/widget/AppCompatEditText;->onFinishTemporaryDetach()V

    .line 968
    iget-boolean v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->containsImages:Z

    if-eqz v0, :cond_1

    .line 969
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    check-cast v0, Landroid/text/Spanned;

    if-eqz v0, :cond_0

    .line 970
    invoke-interface {v0}, Landroid/text/Spanned;->length()I

    move-result v1

    const-class v2, Lcom/facebook/react/views/text/internal/span/TextInlineImageSpan;

    const/4 v3, 0x0

    invoke-interface {v0, v3, v1, v2}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/react/views/text/internal/span/TextInlineImageSpan;

    .line 971
    invoke-static {v0}, Lkotlin/jvm/internal/ArrayIteratorKt;->iterator([Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/react/views/text/internal/span/TextInlineImageSpan;

    .line 972
    invoke-virtual {v1}, Lcom/facebook/react/views/text/internal/span/TextInlineImageSpan;->onFinishTemporaryDetach()V

    goto :goto_0

    .line 970
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required value was null."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    return-void
.end method

.method protected onFocusChanged(ZILandroid/graphics/Rect;)V
    .locals 0

    .line 476
    invoke-super {p0, p1, p2, p3}, Landroidx/appcompat/widget/AppCompatEditText;->onFocusChanged(ZILandroid/graphics/Rect;)V

    if-eqz p1, :cond_0

    .line 477
    iget-object p1, p0, Lcom/facebook/react/views/textinput/ReactEditText;->selectionWatcher:Lcom/facebook/react/views/textinput/SelectionWatcher;

    if-eqz p1, :cond_0

    if-eqz p1, :cond_0

    .line 478
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->getSelectionStart()I

    move-result p2

    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->getSelectionEnd()I

    move-result p3

    invoke-interface {p1, p2, p3}, Lcom/facebook/react/views/textinput/SelectionWatcher;->onSelectionChanged(II)V

    :cond_0
    return-void
.end method

.method public onKeyUp(ILandroid/view/KeyEvent;)Z
    .locals 1

    const-string v0, "event"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x42

    if-ne p1, v0, :cond_0

    .line 322
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->isMultiline$ReactAndroid_release()Z

    move-result v0

    if-nez v0, :cond_0

    .line 323
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->hideSoftKeyboard()V

    const/4 p1, 0x1

    return p1

    .line 326
    :cond_0
    invoke-super {p0, p1, p2}, Landroidx/appcompat/widget/AppCompatEditText;->onKeyUp(ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method protected onLayout(ZIIII)V
    .locals 0

    .line 286
    invoke-direct {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->onContentSizeChange()V

    .line 287
    iget-boolean p1, p0, Lcom/facebook/react/views/textinput/ReactEditText;->selectTextOnFocus:Z

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->isFocused()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 289
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->selectAll()V

    const/4 p1, 0x0

    .line 291
    iput-boolean p1, p0, Lcom/facebook/react/views/textinput/ReactEditText;->selectTextOnFocus:Z

    :cond_0
    return-void
.end method

.method protected onScrollChanged(IIII)V
    .locals 1

    .line 335
    invoke-super {p0, p1, p2, p3, p4}, Landroidx/appcompat/widget/AppCompatEditText;->onScrollChanged(IIII)V

    .line 336
    iget-object v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->scrollWatcher:Lcom/facebook/react/views/textinput/ScrollWatcher;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/facebook/react/views/textinput/ScrollWatcher;->onScrollChanged(IIII)V

    :cond_0
    return-void
.end method

.method protected onSelectionChanged(II)V
    .locals 4

    .line 465
    sget-boolean v0, Lcom/facebook/react/views/textinput/ReactEditText;->DEBUG_MODE:Z

    if-eqz v0, :cond_0

    .line 466
    iget-object v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->TAG:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->getId()I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "onSelectionChanged["

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "]: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/common/logging/FLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 469
    :cond_0
    invoke-super {p0, p1, p2}, Landroidx/appcompat/widget/AppCompatEditText;->onSelectionChanged(II)V

    .line 470
    iget-object v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->selectionWatcher:Lcom/facebook/react/views/textinput/SelectionWatcher;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->hasFocus()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 471
    iget-object v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->selectionWatcher:Lcom/facebook/react/views/textinput/SelectionWatcher;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1, p2}, Lcom/facebook/react/views/textinput/SelectionWatcher;->onSelectionChanged(II)V

    :cond_1
    return-void
.end method

.method public onStartTemporaryDetach()V
    .locals 4

    .line 918
    invoke-super {p0}, Landroidx/appcompat/widget/AppCompatEditText;->onStartTemporaryDetach()V

    .line 919
    iget-boolean v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->containsImages:Z

    if-eqz v0, :cond_1

    .line 920
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    check-cast v0, Landroid/text/Spanned;

    if-eqz v0, :cond_0

    .line 921
    invoke-interface {v0}, Landroid/text/Spanned;->length()I

    move-result v1

    const-class v2, Lcom/facebook/react/views/text/internal/span/TextInlineImageSpan;

    const/4 v3, 0x0

    invoke-interface {v0, v3, v1, v2}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/react/views/text/internal/span/TextInlineImageSpan;

    .line 922
    invoke-static {v0}, Lkotlin/jvm/internal/ArrayIteratorKt;->iterator([Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/react/views/text/internal/span/TextInlineImageSpan;

    .line 923
    invoke-virtual {v1}, Lcom/facebook/react/views/text/internal/span/TextInlineImageSpan;->onStartTemporaryDetach()V

    goto :goto_0

    .line 921
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required value was null."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    return-void
.end method

.method public onTextContextMenuItem(I)Z
    .locals 1

    const v0, 0x1020022

    if-ne p1, v0, :cond_0

    const p1, 0x1020031

    .line 360
    :cond_0
    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatEditText;->onTextContextMenuItem(I)Z

    move-result p1

    return p1
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    const-string v0, "ev"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 296
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    const/4 v2, 0x2

    if-eq v0, v2, :cond_0

    goto :goto_0

    .line 305
    :cond_0
    iget-boolean v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->detectScrollMovement:Z

    if-eqz v0, :cond_3

    const/4 v0, -0x1

    .line 306
    invoke-virtual {p0, v0}, Lcom/facebook/react/views/textinput/ReactEditText;->canScrollVertically(I)Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_1

    .line 307
    invoke-virtual {p0, v1}, Lcom/facebook/react/views/textinput/ReactEditText;->canScrollVertically(I)Z

    move-result v2

    if-nez v2, :cond_1

    .line 308
    invoke-virtual {p0, v0}, Lcom/facebook/react/views/textinput/ReactEditText;->canScrollHorizontally(I)Z

    move-result v0

    if-nez v0, :cond_1

    .line 309
    invoke-virtual {p0, v1}, Lcom/facebook/react/views/textinput/ReactEditText;->canScrollHorizontally(I)Z

    move-result v0

    if-nez v0, :cond_1

    .line 311
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    invoke-interface {v0, v3}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 313
    :cond_1
    iput-boolean v3, p0, Lcom/facebook/react/views/textinput/ReactEditText;->detectScrollMovement:Z

    goto :goto_0

    .line 298
    :cond_2
    iput-boolean v1, p0, Lcom/facebook/react/views/textinput/ReactEditText;->detectScrollMovement:Z

    .line 301
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    invoke-interface {v0, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 316
    :cond_3
    :goto_0
    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatEditText;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public removeTextChangedListener(Landroid/text/TextWatcher;)V
    .locals 1

    const-string/jumbo v0, "watcher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 406
    iget-object v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->listeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    if-eqz v0, :cond_0

    .line 407
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 409
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    .line 410
    iput-object p1, p0, Lcom/facebook/react/views/textinput/ReactEditText;->listeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 411
    invoke-direct {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->getTextWatcherDelegator()Lcom/facebook/react/views/textinput/ReactEditText$TextWatcherDelegator;

    move-result-object p1

    check-cast p1, Landroid/text/TextWatcher;

    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatEditText;->removeTextChangedListener(Landroid/text/TextWatcher;)V

    :cond_0
    return-void
.end method

.method public final requestFocusFromJS()V
    .locals 0

    .line 614
    invoke-direct {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->requestFocusProgrammatically()Z

    return-void
.end method

.method public final setAllowFontScaling(Z)V
    .locals 1

    .line 1016
    iget-object v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->textAttributes:Lcom/facebook/react/views/text/TextAttributes;

    invoke-virtual {v0}, Lcom/facebook/react/views/text/TextAttributes;->getAllowFontScaling()Z

    move-result v0

    if-eq v0, p1, :cond_0

    .line 1017
    iget-object v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->textAttributes:Lcom/facebook/react/views/text/TextAttributes;

    invoke-virtual {v0, p1}, Lcom/facebook/react/views/text/TextAttributes;->setAllowFontScaling(Z)V

    .line 1018
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->applyTextAttributes()V

    :cond_0
    return-void
.end method

.method public final setAutoFocus(Z)V
    .locals 0

    .line 1035
    iput-boolean p1, p0, Lcom/facebook/react/views/textinput/ReactEditText;->autoFocus:Z

    return-void
.end method

.method public setBackgroundColor(I)V
    .locals 1

    .line 978
    move-object v0, p0

    check-cast v0, Landroid/view/View;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/facebook/react/uimanager/BackgroundStyleApplicator;->setBackgroundColor(Landroid/view/View;Ljava/lang/Integer;)V

    return-void
.end method

.method public final setBorderColor(ILjava/lang/Integer;)V
    .locals 2

    .line 986
    move-object v0, p0

    check-cast v0, Landroid/view/View;

    invoke-static {}, Lcom/facebook/react/uimanager/style/LogicalEdge;->getEntries()Lkotlin/enums/EnumEntries;

    move-result-object v1

    invoke-interface {v1, p1}, Lkotlin/enums/EnumEntries;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/facebook/react/uimanager/style/LogicalEdge;

    invoke-static {v0, p1, p2}, Lcom/facebook/react/uimanager/BackgroundStyleApplicator;->setBorderColor(Landroid/view/View;Lcom/facebook/react/uimanager/style/LogicalEdge;Ljava/lang/Integer;)V

    return-void
.end method

.method public final setBorderRadius(F)V
    .locals 1

    .line 993
    sget-object v0, Lcom/facebook/react/uimanager/style/BorderRadiusProp;->BORDER_RADIUS:Lcom/facebook/react/uimanager/style/BorderRadiusProp;

    invoke-virtual {v0}, Lcom/facebook/react/uimanager/style/BorderRadiusProp;->ordinal()I

    move-result v0

    invoke-virtual {p0, p1, v0}, Lcom/facebook/react/views/textinput/ReactEditText;->setBorderRadius(FI)V

    return-void
.end method

.method public final setBorderRadius(FI)V
    .locals 2

    .line 998
    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 1001
    :cond_0
    new-instance v0, Lcom/facebook/react/uimanager/LengthPercentage;

    invoke-static {p1}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    move-result p1

    sget-object v1, Lcom/facebook/react/uimanager/LengthPercentageType;->POINT:Lcom/facebook/react/uimanager/LengthPercentageType;

    invoke-direct {v0, p1, v1}, Lcom/facebook/react/uimanager/LengthPercentage;-><init>(FLcom/facebook/react/uimanager/LengthPercentageType;)V

    move-object p1, v0

    .line 1003
    :goto_0
    move-object v0, p0

    check-cast v0, Landroid/view/View;

    invoke-static {}, Lcom/facebook/react/uimanager/style/BorderRadiusProp;->getEntries()Lkotlin/enums/EnumEntries;

    move-result-object v1

    invoke-interface {v1, p2}, Lkotlin/enums/EnumEntries;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/facebook/react/uimanager/style/BorderRadiusProp;

    invoke-static {v0, p2, p1}, Lcom/facebook/react/uimanager/BackgroundStyleApplicator;->setBorderRadius(Landroid/view/View;Lcom/facebook/react/uimanager/style/BorderRadiusProp;Lcom/facebook/react/uimanager/LengthPercentage;)V

    return-void
.end method

.method public final setBorderStyle(Ljava/lang/String;)V
    .locals 2

    .line 1007
    move-object v0, p0

    check-cast v0, Landroid/view/View;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    sget-object v1, Lcom/facebook/react/uimanager/style/BorderStyle;->Companion:Lcom/facebook/react/uimanager/style/BorderStyle$Companion;

    invoke-virtual {v1, p1}, Lcom/facebook/react/uimanager/style/BorderStyle$Companion;->fromString(Ljava/lang/String;)Lcom/facebook/react/uimanager/style/BorderStyle;

    move-result-object p1

    :goto_0
    invoke-static {v0, p1}, Lcom/facebook/react/uimanager/BackgroundStyleApplicator;->setBorderStyle(Landroid/view/View;Lcom/facebook/react/uimanager/style/BorderStyle;)V

    return-void
.end method

.method public final setBorderWidth(IF)V
    .locals 2

    .line 982
    move-object v0, p0

    check-cast v0, Landroid/view/View;

    invoke-static {}, Lcom/facebook/react/uimanager/style/LogicalEdge;->getEntries()Lkotlin/enums/EnumEntries;

    move-result-object v1

    invoke-interface {v1, p1}, Lkotlin/enums/EnumEntries;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/facebook/react/uimanager/style/LogicalEdge;

    invoke-static {p2}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    move-result p2

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    invoke-static {v0, p1, p2}, Lcom/facebook/react/uimanager/BackgroundStyleApplicator;->setBorderWidth(Landroid/view/View;Lcom/facebook/react/uimanager/style/LogicalEdge;Ljava/lang/Float;)V

    return-void
.end method

.method protected final setContainsImages(Z)V
    .locals 0

    .line 123
    iput-boolean p1, p0, Lcom/facebook/react/views/textinput/ReactEditText;->containsImages:Z

    return-void
.end method

.method public final setContentSizeWatcher(Lcom/facebook/react/views/textinput/ContentSizeWatcher;)V
    .locals 0

    .line 417
    iput-object p1, p0, Lcom/facebook/react/views/textinput/ReactEditText;->contentSizeWatcher:Lcom/facebook/react/views/textinput/ContentSizeWatcher;

    return-void
.end method

.method public final setContextMenuHidden(Z)V
    .locals 0

    .line 1044
    iput-boolean p1, p0, Lcom/facebook/react/views/textinput/ReactEditText;->contextMenuHidden:Z

    return-void
.end method

.method public final setDisableFullscreenUI(Z)V
    .locals 0

    .line 172
    iput-boolean p1, p0, Lcom/facebook/react/views/textinput/ReactEditText;->disableFullscreen:Z

    .line 173
    invoke-direct {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->updateImeOptions()V

    return-void
.end method

.method public final setDisableTextDiffing$ReactAndroid_release(Z)V
    .locals 0

    .line 147
    iput-boolean p1, p0, Lcom/facebook/react/views/textinput/ReactEditText;->disableTextDiffing:Z

    return-void
.end method

.method public final setDragAndDropFilter(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 125
    iput-object p1, p0, Lcom/facebook/react/views/textinput/ReactEditText;->dragAndDropFilter:Ljava/util/List;

    return-void
.end method

.method public final setEventDispatcher(Lcom/facebook/react/uimanager/events/EventDispatcher;)V
    .locals 0

    .line 1145
    iput-object p1, p0, Lcom/facebook/react/views/textinput/ReactEditText;->eventDispatcher:Lcom/facebook/react/uimanager/events/EventDispatcher;

    return-void
.end method

.method public final setFontFamily(Ljava/lang/String;)V
    .locals 0

    .line 563
    iput-object p1, p0, Lcom/facebook/react/views/textinput/ReactEditText;->fontFamily:Ljava/lang/String;

    const/4 p1, 0x1

    .line 564
    iput-boolean p1, p0, Lcom/facebook/react/views/textinput/ReactEditText;->typefaceDirty:Z

    return-void
.end method

.method public setFontFeatureSettings(Ljava/lang/String;)V
    .locals 1

    .line 584
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->getFontFeatureSettings()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 585
    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatEditText;->setFontFeatureSettings(Ljava/lang/String;)V

    const/4 p1, 0x1

    .line 586
    iput-boolean p1, p0, Lcom/facebook/react/views/textinput/ReactEditText;->typefaceDirty:Z

    :cond_0
    return-void
.end method

.method public final setFontSize(F)V
    .locals 1

    .line 1023
    iget-object v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->textAttributes:Lcom/facebook/react/views/text/TextAttributes;

    invoke-virtual {v0, p1}, Lcom/facebook/react/views/text/TextAttributes;->setFontSize(F)V

    .line 1024
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->applyTextAttributes()V

    return-void
.end method

.method public final setFontStyle(Ljava/lang/String;)V
    .locals 1

    .line 576
    invoke-static {p1}, Lcom/facebook/react/views/text/ReactTypefaceUtils;->parseFontStyle(Ljava/lang/String;)I

    move-result p1

    .line 577
    iget v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->fontStyle:I

    if-eq p1, v0, :cond_0

    .line 578
    iput p1, p0, Lcom/facebook/react/views/textinput/ReactEditText;->fontStyle:I

    const/4 p1, 0x1

    .line 579
    iput-boolean p1, p0, Lcom/facebook/react/views/textinput/ReactEditText;->typefaceDirty:Z

    :cond_0
    return-void
.end method

.method public final setFontWeight(Ljava/lang/String;)V
    .locals 1

    .line 568
    invoke-static {p1}, Lcom/facebook/react/views/text/ReactTypefaceUtils;->parseFontWeight(Ljava/lang/String;)I

    move-result p1

    .line 569
    iget v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->fontWeight:I

    if-eq p1, v0, :cond_0

    .line 570
    iput p1, p0, Lcom/facebook/react/views/textinput/ReactEditText;->fontWeight:I

    const/4 p1, 0x1

    .line 571
    iput-boolean p1, p0, Lcom/facebook/react/views/textinput/ReactEditText;->typefaceDirty:Z

    :cond_0
    return-void
.end method

.method public final setGravityHorizontal$ReactAndroid_release(I)V
    .locals 2

    if-nez p1, :cond_0

    .line 186
    iget p1, p0, Lcom/facebook/react/views/textinput/ReactEditText;->defaultGravityHorizontal:I

    .line 188
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->getGravity()I

    move-result v0

    const v1, -0x800008

    and-int/2addr v0, v1

    or-int/2addr p1, v0

    .line 187
    invoke-virtual {p0, p1}, Lcom/facebook/react/views/textinput/ReactEditText;->setGravity(I)V

    return-void
.end method

.method public final setGravityVertical$ReactAndroid_release(I)V
    .locals 1

    if-nez p1, :cond_0

    .line 196
    iget p1, p0, Lcom/facebook/react/views/textinput/ReactEditText;->defaultGravityVertical:I

    .line 197
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->getGravity()I

    move-result v0

    and-int/lit8 v0, v0, -0x71

    or-int/2addr p1, v0

    invoke-virtual {p0, p1}, Lcom/facebook/react/views/textinput/ReactEditText;->setGravity(I)V

    return-void
.end method

.method public setInputType(I)V
    .locals 1

    .line 529
    invoke-super {p0}, Landroidx/appcompat/widget/AppCompatEditText;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v0

    .line 530
    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatEditText;->setInputType(I)V

    .line 531
    iput p1, p0, Lcom/facebook/react/views/textinput/ReactEditText;->stagedInputType:I

    .line 533
    invoke-super {p0, v0}, Landroidx/appcompat/widget/AppCompatEditText;->setTypeface(Landroid/graphics/Typeface;)V

    .line 541
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->isMultiline$ReactAndroid_release()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 542
    invoke-virtual {p0, v0}, Lcom/facebook/react/views/textinput/ReactEditText;->setSingleLine(Z)V

    .line 548
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->keyListener$1:Lcom/facebook/react/views/textinput/ReactEditText$InternalKeyListener;

    if-nez v0, :cond_1

    .line 549
    new-instance v0, Lcom/facebook/react/views/textinput/ReactEditText$InternalKeyListener;

    invoke-direct {v0}, Lcom/facebook/react/views/textinput/ReactEditText$InternalKeyListener;-><init>()V

    iput-object v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->keyListener$1:Lcom/facebook/react/views/textinput/ReactEditText$InternalKeyListener;

    .line 551
    :cond_1
    iget-object v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->keyListener$1:Lcom/facebook/react/views/textinput/ReactEditText$InternalKeyListener;

    if-eqz v0, :cond_2

    invoke-virtual {v0, p1}, Lcom/facebook/react/views/textinput/ReactEditText$InternalKeyListener;->setInputType(I)V

    .line 552
    :cond_2
    iget-object p1, p0, Lcom/facebook/react/views/textinput/ReactEditText;->keyListener$1:Lcom/facebook/react/views/textinput/ReactEditText$InternalKeyListener;

    check-cast p1, Landroid/text/method/KeyListener;

    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatEditText;->setKeyListener(Landroid/text/method/KeyListener;)V

    return-void
.end method

.method public final setLetterSpacingPt(F)V
    .locals 1

    .line 1011
    iget-object v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->textAttributes:Lcom/facebook/react/views/text/TextAttributes;

    invoke-virtual {v0, p1}, Lcom/facebook/react/views/text/TextAttributes;->setLetterSpacing(F)V

    .line 1012
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->applyTextAttributes()V

    return-void
.end method

.method public setLineHeight(I)V
    .locals 1

    .line 330
    iget-object v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->textAttributes:Lcom/facebook/react/views/text/TextAttributes;

    int-to-float p1, p1

    invoke-virtual {v0, p1}, Lcom/facebook/react/views/text/TextAttributes;->setLineHeight(F)V

    return-void
.end method

.method public final setMaxFontSizeMultiplier(F)V
    .locals 1

    .line 1028
    iget-object v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->textAttributes:Lcom/facebook/react/views/text/TextAttributes;

    invoke-virtual {v0}, Lcom/facebook/react/views/text/TextAttributes;->getMaxFontSizeMultiplier()F

    move-result v0

    cmpg-float v0, p1, v0

    if-nez v0, :cond_0

    return-void

    .line 1029
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->textAttributes:Lcom/facebook/react/views/text/TextAttributes;

    invoke-virtual {v0, p1}, Lcom/facebook/react/views/text/TextAttributes;->setMaxFontSizeMultiplier(F)V

    .line 1030
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->applyTextAttributes()V

    return-void
.end method

.method protected final setNativeEventCount(I)V
    .locals 0

    .line 118
    iput p1, p0, Lcom/facebook/react/views/textinput/ReactEditText;->nativeEventCount:I

    return-void
.end method

.method public final setOnKeyPress(Z)V
    .locals 0

    .line 487
    iput-boolean p1, p0, Lcom/facebook/react/views/textinput/ReactEditText;->onKeyPress:Z

    return-void
.end method

.method public final setOverflow(Ljava/lang/String;)V
    .locals 1

    if-nez p1, :cond_0

    .line 1150
    sget-object p1, Lcom/facebook/react/uimanager/style/Overflow;->VISIBLE:Lcom/facebook/react/uimanager/style/Overflow;

    iput-object p1, p0, Lcom/facebook/react/views/textinput/ReactEditText;->overflow:Lcom/facebook/react/uimanager/style/Overflow;

    goto :goto_0

    .line 1152
    :cond_0
    sget-object v0, Lcom/facebook/react/uimanager/style/Overflow;->Companion:Lcom/facebook/react/uimanager/style/Overflow$Companion;

    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/style/Overflow$Companion;->fromString(Ljava/lang/String;)Lcom/facebook/react/uimanager/style/Overflow;

    move-result-object p1

    if-nez p1, :cond_1

    .line 1153
    sget-object p1, Lcom/facebook/react/uimanager/style/Overflow;->VISIBLE:Lcom/facebook/react/uimanager/style/Overflow;

    :cond_1
    iput-object p1, p0, Lcom/facebook/react/views/textinput/ReactEditText;->overflow:Lcom/facebook/react/uimanager/style/Overflow;

    .line 1156
    :goto_0
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->invalidate()V

    return-void
.end method

.method public final setPlaceholder(Ljava/lang/String;)V
    .locals 1

    .line 556
    iget-object v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->placeholder:Ljava/lang/String;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 557
    iput-object p1, p0, Lcom/facebook/react/views/textinput/ReactEditText;->placeholder:Ljava/lang/String;

    .line 558
    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {p0, p1}, Lcom/facebook/react/views/textinput/ReactEditText;->setHint(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public final setReturnKeyType(Ljava/lang/String;)V
    .locals 0

    .line 178
    iput-object p1, p0, Lcom/facebook/react/views/textinput/ReactEditText;->returnKeyType:Ljava/lang/String;

    .line 179
    invoke-direct {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->updateImeOptions()V

    return-void
.end method

.method public final setScrollWatcher(Lcom/facebook/react/views/textinput/ScrollWatcher;)V
    .locals 0

    .line 421
    iput-object p1, p0, Lcom/facebook/react/views/textinput/ReactEditText;->scrollWatcher:Lcom/facebook/react/views/textinput/ScrollWatcher;

    return-void
.end method

.method public final setSelectTextOnFocus(Z)V
    .locals 0

    .line 1039
    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatEditText;->setSelectAllOnFocus(Z)V

    .line 1040
    iput-boolean p1, p0, Lcom/facebook/react/views/textinput/ReactEditText;->selectTextOnFocus:Z

    return-void
.end method

.method public setSelection(II)V
    .locals 4

    .line 458
    sget-boolean v0, Lcom/facebook/react/views/textinput/ReactEditText;->DEBUG_MODE:Z

    if-eqz v0, :cond_0

    .line 459
    iget-object v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->TAG:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->getId()I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string/jumbo v3, "setSelection["

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "]: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/common/logging/FLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 461
    :cond_0
    invoke-super {p0, p1, p2}, Landroidx/appcompat/widget/AppCompatEditText;->setSelection(II)V

    return-void
.end method

.method public final setSelectionWatcher$ReactAndroid_release(Lcom/facebook/react/views/textinput/SelectionWatcher;)V
    .locals 0

    .line 483
    iput-object p1, p0, Lcom/facebook/react/views/textinput/ReactEditText;->selectionWatcher:Lcom/facebook/react/views/textinput/SelectionWatcher;

    return-void
.end method

.method protected final setSettingTextFromJS(Z)V
    .locals 0

    .line 113
    iput-boolean p1, p0, Lcom/facebook/react/views/textinput/ReactEditText;->isSettingTextFromJS:Z

    return-void
.end method

.method protected final setSettingTextFromState(Z)V
    .locals 0

    .line 148
    iput-boolean p1, p0, Lcom/facebook/react/views/textinput/ReactEditText;->isSettingTextFromState:Z

    return-void
.end method

.method public final setStagedInputType(I)V
    .locals 0

    .line 122
    iput p1, p0, Lcom/facebook/react/views/textinput/ReactEditText;->stagedInputType:I

    return-void
.end method

.method public final setStateWrapper(Lcom/facebook/react/uimanager/StateWrapper;)V
    .locals 0

    .line 146
    iput-object p1, p0, Lcom/facebook/react/views/textinput/ReactEditText;->stateWrapper:Lcom/facebook/react/uimanager/StateWrapper;

    return-void
.end method

.method public final setSubmitBehavior(Ljava/lang/String;)V
    .locals 0

    .line 124
    iput-object p1, p0, Lcom/facebook/react/views/textinput/ReactEditText;->submitBehavior:Ljava/lang/String;

    return-void
.end method

.method public final shouldBlurOnReturn()Z
    .locals 2

    .line 491
    iget-object v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->submitBehavior:Ljava/lang/String;

    if-nez v0, :cond_1

    .line 496
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->isMultiline$ReactAndroid_release()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0

    .line 498
    :cond_1
    const-string v1, "blurAndSubmit"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final shouldSubmitOnReturn()Z
    .locals 4

    .line 505
    iget-object v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->submitBehavior:Ljava/lang/String;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_1

    .line 510
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->isMultiline$ReactAndroid_release()Z

    move-result v0

    if-nez v0, :cond_0

    return v2

    :cond_0
    return v1

    .line 512
    :cond_1
    const-string/jumbo v3, "submit"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    const-string v3, "blurAndSubmit"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    return v1

    :cond_3
    :goto_0
    return v2
.end method

.method protected final showSoftKeyboard()Z
    .locals 3

    .line 828
    iget-object v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->inputMethodManager:Landroid/view/inputmethod/InputMethodManager;

    move-object v1, p0

    check-cast v1, Landroid/view/View;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    move-result v0

    return v0
.end method

.method protected verifyDrawable(Landroid/graphics/drawable/Drawable;)Z
    .locals 4

    const-string v0, "drawable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 881
    iget-boolean v0, p0, Lcom/facebook/react/views/textinput/ReactEditText;->containsImages:Z

    if-eqz v0, :cond_2

    .line 882
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    check-cast v0, Landroid/text/Spanned;

    if-eqz v0, :cond_1

    .line 883
    invoke-interface {v0}, Landroid/text/Spanned;->length()I

    move-result v1

    const-class v2, Lcom/facebook/react/views/text/internal/span/TextInlineImageSpan;

    const/4 v3, 0x0

    invoke-interface {v0, v3, v1, v2}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/react/views/text/internal/span/TextInlineImageSpan;

    .line 884
    invoke-static {v0}, Lkotlin/jvm/internal/ArrayIteratorKt;->iterator([Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/react/views/text/internal/span/TextInlineImageSpan;

    .line 885
    invoke-virtual {v1}, Lcom/facebook/react/views/text/internal/span/TextInlineImageSpan;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-ne v1, p1, :cond_0

    const/4 p1, 0x1

    return p1

    .line 883
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Required value was null."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 890
    :cond_2
    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatEditText;->verifyDrawable(Landroid/graphics/drawable/Drawable;)Z

    move-result p1

    return p1
.end method
