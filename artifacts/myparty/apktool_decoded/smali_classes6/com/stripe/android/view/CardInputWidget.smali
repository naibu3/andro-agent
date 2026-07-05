.class public final Lcom/stripe/android/view/CardInputWidget;
.super Landroid/widget/LinearLayout;
.source "CardInputWidget.kt"

# interfaces
.implements Lcom/stripe/android/view/CardWidget;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/view/CardInputWidget$AnimationEndListener;,
        Lcom/stripe/android/view/CardInputWidget$CardFieldAnimation;,
        Lcom/stripe/android/view/CardInputWidget$CardNumberSlideEndAnimation;,
        Lcom/stripe/android/view/CardInputWidget$CardNumberSlideStartAnimation;,
        Lcom/stripe/android/view/CardInputWidget$Companion;,
        Lcom/stripe/android/view/CardInputWidget$CvcSlideEndAnimation;,
        Lcom/stripe/android/view/CardInputWidget$CvcSlideStartAnimation;,
        Lcom/stripe/android/view/CardInputWidget$DefaultLayoutWidthCalculator;,
        Lcom/stripe/android/view/CardInputWidget$ExpiryDateSlideEndAnimation;,
        Lcom/stripe/android/view/CardInputWidget$ExpiryDateSlideStartAnimation;,
        Lcom/stripe/android/view/CardInputWidget$Field;,
        Lcom/stripe/android/view/CardInputWidget$LayoutWidthCalculator;,
        Lcom/stripe/android/view/CardInputWidget$PostalCodeSlideEndAnimation;,
        Lcom/stripe/android/view/CardInputWidget$PostalCodeSlideStartAnimation;,
        Lcom/stripe/android/view/CardInputWidget$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCardInputWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardInputWidget.kt\ncom/stripe/android/view/CardInputWidget\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 View.kt\nandroidx/core/view/ViewKt\n+ 6 Context.kt\nandroidx/core/content/ContextKt\n+ 7 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 8 CardWidgetViewModel.kt\ncom/stripe/android/view/CardWidgetViewModelKt\n*L\n1#1,1312:1\n33#2,3:1313\n33#2,3:1316\n33#2,3:1319\n1#3:1322\n774#4:1323\n865#4,2:1324\n1863#4,2:1326\n1863#4,2:1328\n1863#4,2:1330\n1755#4,3:1332\n1863#4,2:1335\n1863#4,2:1337\n1734#4,3:1339\n1863#4,2:1352\n1863#4:1354\n1864#4:1381\n1863#4,2:1391\n81#5:1342\n52#6,9:1343\n52#6,9:1382\n58#7,23:1355\n93#7,3:1378\n118#8,13:1393\n*S KotlinDebug\n*F\n+ 1 CardInputWidget.kt\ncom/stripe/android/view/CardInputWidget\n*L\n296#1:1313,3\n328#1:1316,3\n340#1:1319,3\n243#1:1323\n243#1:1324,2\n244#1:1326,2\n442#1:1328,2\n446#1:1330,2\n527#1:1332,3\n531#1:1335,2\n540#1:1337,2\n579#1:1339,3\n736#1:1352,2\n820#1:1354\n820#1:1381\n1021#1:1391,2\n681#1:1342\n717#1:1343,9\n888#1:1382,9\n821#1:1355,23\n821#1:1378,3\n424#1:1393,13\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00ab\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0008\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0017\n\u0002\u0010\u0002\n\u0002\u0008\u001d\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0018\u0002\n\u0002\u0008\u001a*\u00011\u0008\u0007\u0018\u0000 \u00f7\u00012\u00020\u00012\u00020\u0002:\u001c\u00ea\u0001\u00eb\u0001\u00ec\u0001\u00ed\u0001\u00ee\u0001\u00ef\u0001\u00f0\u0001\u00f1\u0001\u00f2\u0001\u00f3\u0001\u00f4\u0001\u00f5\u0001\u00f6\u0001\u00f7\u0001B\'\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\t\u0010\nJ\n\u0010\u0096\u0001\u001a\u00030\u0097\u0001H\u0002J\t\u0010\u0098\u0001\u001a\u000209H\u0002J\n\u0010\u009b\u0001\u001a\u00030\u0097\u0001H\u0014J\n\u0010\u009c\u0001\u001a\u00030\u0097\u0001H\u0014J\n\u0010\u009d\u0001\u001a\u00030\u0097\u0001H\u0014J\u0015\u0010\u009e\u0001\u001a\u00030\u0097\u00012\t\u0010\u009f\u0001\u001a\u0004\u0018\u00010/H\u0016J\u0015\u0010\u00a0\u0001\u001a\u00030\u0097\u00012\t\u0010\u00a1\u0001\u001a\u0004\u0018\u00010-H\u0016J\u0015\u0010\u00a2\u0001\u001a\u00030\u0097\u00012\t\u0010\u00a3\u0001\u001a\u0004\u0018\u00010\u000cH\u0016J\u0013\u0010\u00a4\u0001\u001a\u00030\u0097\u00012\u0007\u0010\u00a5\u0001\u001a\u00020\u000cH\u0016J \u0010\u00a6\u0001\u001a\u00030\u0097\u00012\t\u0008\u0001\u0010\u00a7\u0001\u001a\u00020\u00082\t\u0008\u0001\u0010\u00a8\u0001\u001a\u00020\u0008H\u0016J\u0015\u0010\u00a9\u0001\u001a\u00030\u0097\u00012\t\u0010\u00aa\u0001\u001a\u0004\u0018\u00010\u000cH\u0016J\u001b\u0010\u00ab\u0001\u001a\u00030\u0097\u00012\t\u0010\u00ac\u0001\u001a\u0004\u0018\u00010\u000cH\u0000\u00a2\u0006\u0003\u0008\u00ad\u0001J\u0017\u0010\u00ae\u0001\u001a\u00030\u0097\u00012\r\u0010\u00af\u0001\u001a\u0008\u0012\u0004\u0012\u00020W0aJ\n\u0010\u00b0\u0001\u001a\u00030\u0097\u0001H\u0016J\u0013\u0010\u00b1\u0001\u001a\u00030\u0097\u00012\u0007\u0010\u00b2\u0001\u001a\u000209H\u0016J\u0016\u0010\u00b3\u0001\u001a\u00030\u0097\u00012\n\u0010\u00b4\u0001\u001a\u0005\u0018\u00010\u00b5\u0001H\u0016J\u0016\u0010\u00b6\u0001\u001a\u00030\u0097\u00012\n\u0010\u00b7\u0001\u001a\u0005\u0018\u00010\u00b5\u0001H\u0016J\u0016\u0010\u00b8\u0001\u001a\u00030\u0097\u00012\n\u0010\u00b9\u0001\u001a\u0005\u0018\u00010\u00b5\u0001H\u0016J\u0016\u0010\u00ba\u0001\u001a\u00030\u0097\u00012\n\u0010\u00bb\u0001\u001a\u0005\u0018\u00010\u00b5\u0001H\u0016J\t\u0010\u00b2\u0001\u001a\u000209H\u0016J\u0013\u0010\u00bc\u0001\u001a\u0002092\u0008\u0010\u00bd\u0001\u001a\u00030\u00be\u0001H\u0016J\n\u0010\u00bf\u0001\u001a\u00030\u00c0\u0001H\u0014J\u0014\u0010\u00c1\u0001\u001a\u00030\u0097\u00012\u0008\u0010\u00c2\u0001\u001a\u00030\u00c0\u0001H\u0014J\u001e\u0010\u00c3\u0001\u001a\u0005\u0018\u00010\u00c4\u00012\u0007\u0010\u00c5\u0001\u001a\u00020\u00082\u0007\u0010\u0099\u0001\u001a\u00020\u0008H\u0002J-\u0010\u00c6\u0001\u001a\u00030\u0097\u00012\u0006\u0010A\u001a\u0002092\u0008\u0008\u0002\u0010{\u001a\u00020\u00082\t\u0008\u0002\u0010\u0099\u0001\u001a\u00020\u0008H\u0001\u00a2\u0006\u0003\u0008\u00c7\u0001J&\u0010\u00c8\u0001\u001a\u00030\u0097\u00012\u0008\u0010\u00c9\u0001\u001a\u00030\u00ca\u00012\u0007\u0010\u00cb\u0001\u001a\u00020\u00082\u0007\u0010\u00cc\u0001\u001a\u00020\u0008H\u0002J\u001b\u0010\u00cd\u0001\u001a\u00020\u00082\u0007\u0010\u00ce\u0001\u001a\u00020\u000c2\u0007\u0010\u00cf\u0001\u001a\u00020\\H\u0002J\u0014\u0010\u00d0\u0001\u001a\u00030\u0097\u00012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\u0013\u0010\u00d1\u0001\u001a\u00030\u0097\u00012\t\u0010\u00d2\u0001\u001a\u0004\u0018\u00010\u000cJ\u0012\u0010\u00d3\u0001\u001a\u00030\u0097\u00012\u0006\u0010V\u001a\u00020WH\u0002J\u0019\u0010\u00d4\u0001\u001a\u00030\u0097\u00012\r\u0010\u00d5\u0001\u001a\u0008\u0012\u0004\u0012\u00020W0aH\u0002J\u0018\u0010\u00d6\u0001\u001a\u00020\u000c2\u0007\u0010\u00d7\u0001\u001a\u00020\u0008H\u0001\u00a2\u0006\u0003\u0008\u00d8\u0001J\u0014\u0010\u00d9\u0001\u001a\u00030\u0097\u00012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\n\u0010\u00da\u0001\u001a\u00030\u0097\u0001H\u0002J\n\u0010\u00db\u0001\u001a\u00030\u0097\u0001H\u0002J\u001a\u0010\u00dc\u0001\u001a\u00030\u0097\u00012\u000e\u0010\u00dd\u0001\u001a\t\u0012\u0005\u0012\u00030\u00de\u00010aH\u0002J7\u0010\u00df\u0001\u001a\u00030\u0097\u00012\u0007\u0010\u00e0\u0001\u001a\u0002092\u0007\u0010\u00e1\u0001\u001a\u00020\u00082\u0007\u0010\u00e2\u0001\u001a\u00020\u00082\u0007\u0010\u00e3\u0001\u001a\u00020\u00082\u0007\u0010\u00e4\u0001\u001a\u00020\u0008H\u0014R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u0012X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\u00020\u001bX\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001fX\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010!R\u0014\u0010\"\u001a\u00020#X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010%R\u0014\u0010&\u001a\u00020\'X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010)R\u000e\u0010*\u001a\u00020+X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010-X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010.\u001a\u0004\u0018\u00010/X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u00100\u001a\u000201X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u00102R\u001a\u00103\u001a\u0008\u0012\u0004\u0012\u000205048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u00086\u00107R,\u0010:\u001a\u0002092\u0006\u00108\u001a\u0002098\u0000@BX\u0081\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\u0008;\u0010<\u001a\u0004\u0008=\u0010>\"\u0004\u0008?\u0010@R\u001a\u0010A\u001a\u000209X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008B\u0010>\"\u0004\u0008C\u0010@R\u000e\u0010D\u001a\u000209X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010E\u001a\u00020FX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008G\u0010H\"\u0004\u0008I\u0010JR\u0014\u0010K\u001a\u00020LX\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008M\u0010NR\u0016\u0010O\u001a\u0004\u0018\u00010\u000c8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008P\u0010QR\u0016\u0010R\u001a\u0004\u0018\u00010S8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008T\u0010UR\u0011\u0010V\u001a\u00020W8F\u00a2\u0006\u0006\u001a\u0004\u0008X\u0010YR\"\u0010Z\u001a\u0008\u0012\u0004\u0012\u00020\\0[8\u0000X\u0081\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008]\u0010<\u001a\u0004\u0008^\u00107R\u0014\u0010_\u001a\u0008\u0012\u0004\u0012\u00020\\04X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010`\u001a\u0008\u0012\u0004\u0012\u00020\\0a8@X\u0081\u0004\u00a2\u0006\u000c\u0012\u0004\u0008b\u0010<\u001a\u0004\u0008c\u0010dR\u001c\u0010e\u001a\u0004\u0018\u00010fX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008g\u0010h\"\u0004\u0008i\u0010jR\u0016\u0010k\u001a\u0004\u0018\u00010l8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008m\u0010nR\u0016\u0010o\u001a\u0004\u0018\u00010p8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008q\u0010rR\u0016\u0010s\u001a\u0004\u0018\u00010t8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008u\u0010vR\u0016\u0010w\u001a\u0004\u0018\u00010x8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008y\u0010zR\u0014\u0010{\u001a\u00020\u00088BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008|\u0010}R$\u0010~\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u007fX\u0080\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\u0008\u0080\u0001\u0010\u0081\u0001\"\u0006\u0008\u0082\u0001\u0010\u0083\u0001R1\u0010\u0085\u0001\u001a\u0002092\u0007\u0010\u0084\u0001\u001a\u0002098F@FX\u0086\u008e\u0002\u00a2\u0006\u0016\n\u0006\u0008\u0088\u0001\u0010\u0089\u0001\u001a\u0005\u0008\u0086\u0001\u0010>\"\u0005\u0008\u0087\u0001\u0010@R1\u0010\u008a\u0001\u001a\u0002092\u0007\u0010\u0084\u0001\u001a\u0002098F@FX\u0086\u008e\u0002\u00a2\u0006\u0016\n\u0006\u0008\u008d\u0001\u0010\u0089\u0001\u001a\u0005\u0008\u008b\u0001\u0010>\"\u0005\u0008\u008c\u0001\u0010@R1\u0010\u008e\u0001\u001a\u0002092\u0007\u0010\u0084\u0001\u001a\u0002098F@FX\u0086\u008e\u0002\u00a2\u0006\u0016\n\u0006\u0008\u0091\u0001\u0010\u0089\u0001\u001a\u0005\u0008\u008f\u0001\u0010>\"\u0005\u0008\u0090\u0001\u0010@R,\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u000c2\u0008\u00108\u001a\u0004\u0018\u00010\u000c@FX\u0086\u000e\u00a2\u0006\u0011\n\u0000\u001a\u0005\u0008\u0093\u0001\u0010Q\"\u0006\u0008\u0094\u0001\u0010\u0095\u0001R\u0016\u0010\u0099\u0001\u001a\u00020\u00088BX\u0082\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u009a\u0001\u0010}R\u000f\u0010\u00e5\u0001\u001a\u00020\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u00e6\u0001\u001a\u00020\u000c8BX\u0082\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00e7\u0001\u0010QR\u0016\u0010\u00e8\u0001\u001a\u00020\u000c8BX\u0082\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00e9\u0001\u0010Q\u00a8\u0006\u00f8\u0001"
    }
    d2 = {
        "Lcom/stripe/android/view/CardInputWidget;",
        "Landroid/widget/LinearLayout;",
        "Lcom/stripe/android/view/CardWidget;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyleAttr",
        "",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "customCvcLabel",
        "",
        "viewBinding",
        "Lcom/stripe/android/databinding/StripeCardInputWidgetBinding;",
        "containerLayout",
        "Landroid/widget/FrameLayout;",
        "cardBrandView",
        "Lcom/stripe/android/view/CardBrandView;",
        "getCardBrandView$payments_core_release",
        "()Lcom/stripe/android/view/CardBrandView;",
        "cardNumberTextInputLayout",
        "Lcom/google/android/material/textfield/TextInputLayout;",
        "expiryDateTextInputLayout",
        "cvcNumberTextInputLayout",
        "postalCodeTextInputLayout",
        "cardNumberEditText",
        "Lcom/stripe/android/view/CardNumberEditText;",
        "getCardNumberEditText$payments_core_release",
        "()Lcom/stripe/android/view/CardNumberEditText;",
        "expiryDateEditText",
        "Lcom/stripe/android/view/ExpiryDateEditText;",
        "getExpiryDateEditText$payments_core_release",
        "()Lcom/stripe/android/view/ExpiryDateEditText;",
        "cvcEditText",
        "Lcom/stripe/android/view/CvcEditText;",
        "getCvcEditText$payments_core_release",
        "()Lcom/stripe/android/view/CvcEditText;",
        "postalCodeEditText",
        "Lcom/stripe/android/view/PostalCodeEditText;",
        "getPostalCodeEditText$payments_core_release",
        "()Lcom/stripe/android/view/PostalCodeEditText;",
        "lifecycleDelegate",
        "Lcom/stripe/android/view/LifecycleOwnerDelegate;",
        "cardInputListener",
        "Lcom/stripe/android/view/CardInputListener;",
        "cardValidCallback",
        "Lcom/stripe/android/view/CardValidCallback;",
        "cardValidTextWatcher",
        "com/stripe/android/view/CardInputWidget$cardValidTextWatcher$1",
        "Lcom/stripe/android/view/CardInputWidget$cardValidTextWatcher$1;",
        "invalidFields",
        "",
        "Lcom/stripe/android/view/CardValidCallback$Fields;",
        "getInvalidFields",
        "()Ljava/util/Set;",
        "value",
        "",
        "shouldShowErrorIcon",
        "getShouldShowErrorIcon$payments_core_release$annotations",
        "()V",
        "getShouldShowErrorIcon$payments_core_release",
        "()Z",
        "setShouldShowErrorIcon",
        "(Z)V",
        "isShowingFullCard",
        "isShowingFullCard$payments_core_release",
        "setShowingFullCard$payments_core_release",
        "isViewInitialized",
        "layoutWidthCalculator",
        "Lcom/stripe/android/view/CardInputWidget$LayoutWidthCalculator;",
        "getLayoutWidthCalculator$payments_core_release",
        "()Lcom/stripe/android/view/CardInputWidget$LayoutWidthCalculator;",
        "setLayoutWidthCalculator$payments_core_release",
        "(Lcom/stripe/android/view/CardInputWidget$LayoutWidthCalculator;)V",
        "placement",
        "Lcom/stripe/android/view/CardInputWidgetPlacement;",
        "getPlacement$payments_core_release",
        "()Lcom/stripe/android/view/CardInputWidgetPlacement;",
        "postalCodeValue",
        "getPostalCodeValue",
        "()Ljava/lang/String;",
        "cvc",
        "Lcom/stripe/android/cards/Cvc$Validated;",
        "getCvc",
        "()Lcom/stripe/android/cards/Cvc$Validated;",
        "brand",
        "Lcom/stripe/android/model/CardBrand;",
        "getBrand",
        "()Lcom/stripe/android/model/CardBrand;",
        "requiredFields",
        "",
        "Lcom/stripe/android/view/StripeEditText;",
        "getRequiredFields$payments_core_release$annotations",
        "getRequiredFields$payments_core_release",
        "allFields",
        "currentFields",
        "",
        "getCurrentFields$payments_core_release$annotations",
        "getCurrentFields$payments_core_release",
        "()Ljava/util/List;",
        "viewModelStoreOwner",
        "Landroidx/lifecycle/ViewModelStoreOwner;",
        "getViewModelStoreOwner$payments_core_release",
        "()Landroidx/lifecycle/ViewModelStoreOwner;",
        "setViewModelStoreOwner$payments_core_release",
        "(Landroidx/lifecycle/ViewModelStoreOwner;)V",
        "paymentMethodCard",
        "Lcom/stripe/android/model/PaymentMethodCreateParams$Card;",
        "getPaymentMethodCard",
        "()Lcom/stripe/android/model/PaymentMethodCreateParams$Card;",
        "billingDetails",
        "Lcom/stripe/android/model/PaymentMethod$BillingDetails;",
        "getBillingDetails",
        "()Lcom/stripe/android/model/PaymentMethod$BillingDetails;",
        "paymentMethodCreateParams",
        "Lcom/stripe/android/model/PaymentMethodCreateParams;",
        "getPaymentMethodCreateParams",
        "()Lcom/stripe/android/model/PaymentMethodCreateParams;",
        "cardParams",
        "Lcom/stripe/android/model/CardParams;",
        "getCardParams",
        "()Lcom/stripe/android/model/CardParams;",
        "frameWidth",
        "getFrameWidth",
        "()I",
        "frameWidthSupplier",
        "Lkotlin/Function0;",
        "getFrameWidthSupplier$payments_core_release",
        "()Lkotlin/jvm/functions/Function0;",
        "setFrameWidthSupplier$payments_core_release",
        "(Lkotlin/jvm/functions/Function0;)V",
        "<set-?>",
        "postalCodeEnabled",
        "getPostalCodeEnabled",
        "setPostalCodeEnabled",
        "postalCodeEnabled$delegate",
        "Lkotlin/properties/ReadWriteProperty;",
        "postalCodeRequired",
        "getPostalCodeRequired",
        "setPostalCodeRequired",
        "postalCodeRequired$delegate",
        "usZipCodeRequired",
        "getUsZipCodeRequired",
        "setUsZipCodeRequired",
        "usZipCodeRequired$delegate",
        "onBehalfOf",
        "getOnBehalfOf",
        "setOnBehalfOf",
        "(Ljava/lang/String;)V",
        "updatePostalRequired",
        "",
        "isPostalRequired",
        "frameStart",
        "getFrameStart",
        "onAttachedToWindow",
        "onDetachedFromWindow",
        "onFinishInflate",
        "setCardValidCallback",
        "callback",
        "setCardInputListener",
        "listener",
        "setCardNumber",
        "cardNumber",
        "setCardHint",
        "cardHint",
        "setExpiryDate",
        "month",
        "year",
        "setCvcCode",
        "cvcCode",
        "setPostalCode",
        "postalCode",
        "setPostalCode$payments_core_release",
        "setPreferredNetworks",
        "preferredNetworks",
        "clear",
        "setEnabled",
        "isEnabled",
        "setCardNumberTextWatcher",
        "cardNumberTextWatcher",
        "Landroid/text/TextWatcher;",
        "setExpiryDateTextWatcher",
        "expiryDateTextWatcher",
        "setCvcNumberTextWatcher",
        "cvcNumberTextWatcher",
        "setPostalCodeTextWatcher",
        "postalCodeTextWatcher",
        "onInterceptTouchEvent",
        "ev",
        "Landroid/view/MotionEvent;",
        "onSaveInstanceState",
        "Landroid/os/Parcelable;",
        "onRestoreInstanceState",
        "state",
        "getFocusField",
        "Lcom/stripe/android/view/CardInputWidget$Field;",
        "touchX",
        "updateSpaceSizes",
        "updateSpaceSizes$payments_core_release",
        "updateFieldLayout",
        "view",
        "Landroid/view/View;",
        "newWidth",
        "newMarginStart",
        "getDesiredWidthInPixels",
        "text",
        "editText",
        "initView",
        "setCvcLabel",
        "cvcLabel",
        "updateCvc",
        "handlePossibleCardBrandsChanged",
        "brands",
        "createHiddenCardText",
        "panLength",
        "createHiddenCardText$payments_core_release",
        "applyCardElementAttributes",
        "scrollStart",
        "scrollEnd",
        "startSlideAnimation",
        "animations",
        "Landroid/view/animation/Animation;",
        "onLayout",
        "changed",
        "l",
        "t",
        "r",
        "b",
        "hiddenCardText",
        "cvcPlaceHolder",
        "getCvcPlaceHolder",
        "peekCardText",
        "getPeekCardText",
        "CardFieldAnimation",
        "CardNumberSlideStartAnimation",
        "ExpiryDateSlideStartAnimation",
        "CvcSlideStartAnimation",
        "PostalCodeSlideStartAnimation",
        "CardNumberSlideEndAnimation",
        "ExpiryDateSlideEndAnimation",
        "CvcSlideEndAnimation",
        "PostalCodeSlideEndAnimation",
        "AnimationEndListener",
        "LayoutWidthCalculator",
        "DefaultLayoutWidthCalculator",
        "Field",
        "Companion",
        "payments-core_release"
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
.field static final synthetic $$delegatedProperties:[Lkotlin/reflect/KProperty;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lkotlin/reflect/KProperty<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static final $stable:I

.field private static final CVC_PLACEHOLDER_AMEX:Ljava/lang/String; = "2345"

.field private static final CVC_PLACEHOLDER_COMMON:Ljava/lang/String; = "CVC"

.field public static final Companion:Lcom/stripe/android/view/CardInputWidget$Companion;

.field private static final DEFAULT_READER_ID:I

.field private static final FULL_SIZING_CARD_TEXT:Ljava/lang/String; = "4242 4242 4242 4242 424"

.field private static final FULL_SIZING_DATE_TEXT:Ljava/lang/String; = "MM/MM"

.field private static final FULL_SIZING_POSTAL_CODE_TEXT:Ljava/lang/String; = "1234567890"

.field public static final LOGGING_TOKEN:Ljava/lang/String; = "CardInputView"

.field private static final STATE_CARD_VIEWED:Ljava/lang/String; = "state_card_viewed"

.field private static final STATE_ON_BEHALF_OF:Ljava/lang/String; = "state_on_behalf_of"

.field private static final STATE_POSTAL_CODE_ENABLED:Ljava/lang/String; = "state_postal_code_enabled"

.field private static final STATE_SUPER_STATE:Ljava/lang/String; = "state_super_state"


# instance fields
.field private final allFields:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/stripe/android/view/StripeEditText;",
            ">;"
        }
    .end annotation
.end field

.field private final synthetic cardBrandView:Lcom/stripe/android/view/CardBrandView;

.field private cardInputListener:Lcom/stripe/android/view/CardInputListener;

.field private final synthetic cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

.field private final cardNumberTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

.field private cardValidCallback:Lcom/stripe/android/view/CardValidCallback;

.field private final cardValidTextWatcher:Lcom/stripe/android/view/CardInputWidget$cardValidTextWatcher$1;

.field private final containerLayout:Landroid/widget/FrameLayout;

.field private customCvcLabel:Ljava/lang/String;

.field private final synthetic cvcEditText:Lcom/stripe/android/view/CvcEditText;

.field private final cvcNumberTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

.field private final synthetic expiryDateEditText:Lcom/stripe/android/view/ExpiryDateEditText;

.field private final expiryDateTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

.field private synthetic frameWidthSupplier:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private hiddenCardText:Ljava/lang/String;

.field private synthetic isShowingFullCard:Z

.field private isViewInitialized:Z

.field private synthetic layoutWidthCalculator:Lcom/stripe/android/view/CardInputWidget$LayoutWidthCalculator;

.field private final lifecycleDelegate:Lcom/stripe/android/view/LifecycleOwnerDelegate;

.field private onBehalfOf:Ljava/lang/String;

.field private final placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

.field private final synthetic postalCodeEditText:Lcom/stripe/android/view/PostalCodeEditText;

.field private final postalCodeEnabled$delegate:Lkotlin/properties/ReadWriteProperty;

.field private final postalCodeRequired$delegate:Lkotlin/properties/ReadWriteProperty;

.field private final postalCodeTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

.field private final synthetic requiredFields:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/stripe/android/view/StripeEditText;",
            ">;"
        }
    .end annotation
.end field

.field private shouldShowErrorIcon:Z

.field private final usZipCodeRequired$delegate:Lkotlin/properties/ReadWriteProperty;

.field private final viewBinding:Lcom/stripe/android/databinding/StripeCardInputWidgetBinding;

.field private viewModelStoreOwner:Landroidx/lifecycle/ViewModelStoreOwner;


# direct methods
.method public static synthetic $r8$lambda$-AEAcgH46Du3Y5g_fxKAbjHhe-k(Lcom/stripe/android/view/CardInputWidget;Lcom/stripe/android/model/CardBrand;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/view/CardInputWidget;->initView$lambda$38(Lcom/stripe/android/view/CardInputWidget;Lcom/stripe/android/model/CardBrand;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$05gX5VkCTN3U30_vWZeo_qdmczs(Ljava/lang/String;Landroidx/lifecycle/LifecycleOwner;Lcom/stripe/android/view/CardWidgetViewModel;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/view/CardInputWidget;->_set_onBehalfOf_$lambda$15(Ljava/lang/String;Landroidx/lifecycle/LifecycleOwner;Lcom/stripe/android/view/CardWidgetViewModel;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$3BeLezSXoKJ3mrqTMyOSopy3epM(Lcom/stripe/android/view/CardInputWidget;Landroid/view/View;Z)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/view/CardInputWidget;->initView$lambda$31(Lcom/stripe/android/view/CardInputWidget;Landroid/view/View;Z)V

    return-void
.end method

.method public static synthetic $r8$lambda$4M5heLbn32d3Q8LDYTO1Q8OHgrY(Lcom/stripe/android/view/CardInputWidget;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/view/CardInputWidget;->initView$lambda$35(Lcom/stripe/android/view/CardInputWidget;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic $r8$lambda$5TtYCz6agA4EhyQKXpq1fiWh400(Lcom/stripe/android/view/CardInputWidget;)V
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/view/CardInputWidget;->initView$lambda$43$lambda$42(Lcom/stripe/android/view/CardInputWidget;)V

    return-void
.end method

.method public static synthetic $r8$lambda$HDkSSP1KzGAP3Y9Y2HvDCSYpvyQ(Lcom/stripe/android/view/CardInputWidget;Landroid/view/View;Z)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/view/CardInputWidget;->initView$lambda$32(Lcom/stripe/android/view/CardInputWidget;Landroid/view/View;Z)V

    return-void
.end method

.method public static synthetic $r8$lambda$KwHTxJKGhykyn_hIpMQvbta1NHk(Lcom/stripe/android/view/CardInputWidget;Lcom/stripe/android/model/CardBrand;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/view/CardInputWidget;->initView$lambda$39(Lcom/stripe/android/view/CardInputWidget;Lcom/stripe/android/model/CardBrand;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$N95Xe0m068RUOuXTxg92ydbXz-w(Lcom/stripe/android/view/CardInputWidget;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/view/CardInputWidget;->initView$lambda$36(Lcom/stripe/android/view/CardInputWidget;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic $r8$lambda$Vd42wpU9y8pdbo49h0LB7zNylLA(Lcom/stripe/android/view/CardInputWidget;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/view/CardInputWidget;->initView$lambda$37(Lcom/stripe/android/view/CardInputWidget;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$bXLkkd5lw-OoOp1iVXSH5XzQjtg(Lcom/stripe/android/view/CardInputWidget;)V
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/view/CardInputWidget;->initView$lambda$41$lambda$40(Lcom/stripe/android/view/CardInputWidget;)V

    return-void
.end method

.method public static synthetic $r8$lambda$fknBwHI0PM_seZY89fvX6U6Pr3Q(Lcom/stripe/android/view/CardInputWidget;Landroidx/lifecycle/LifecycleOwner;Lcom/stripe/android/view/CardWidgetViewModel;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/view/CardInputWidget;->onAttachedToWindow$lambda$18(Lcom/stripe/android/view/CardInputWidget;Landroidx/lifecycle/LifecycleOwner;Lcom/stripe/android/view/CardWidgetViewModel;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$gmiRR8KEaftmpqpKH9a0YSY8ek0(Lcom/stripe/android/view/CardInputWidget;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/view/CardInputWidget;->initView$lambda$43(Lcom/stripe/android/view/CardInputWidget;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$gngJCiMmcq-ks665SOhhlaAdzN4(Lcom/stripe/android/view/CardInputWidget;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/view/CardInputWidget;->initView$lambda$41(Lcom/stripe/android/view/CardInputWidget;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$rosB7O25J3Qy9cFl-cuRVwBC2ws(Lcom/stripe/android/view/CardInputWidget;Landroid/view/View;Z)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/view/CardInputWidget;->initView$lambda$33(Lcom/stripe/android/view/CardInputWidget;Landroid/view/View;Z)V

    return-void
.end method

.method public static synthetic $r8$lambda$xObzv-49UpSJd6sVIYs_s9P73Wk(Lcom/stripe/android/view/CardInputWidget;)I
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/view/CardInputWidget;->_init_$lambda$16(Lcom/stripe/android/view/CardInputWidget;)I

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$yUnoVzdTecMB0JTxTTOruLAyzuE(Lcom/stripe/android/view/CardInputWidget;Landroid/view/View;Z)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/view/CardInputWidget;->initView$lambda$34(Lcom/stripe/android/view/CardInputWidget;Landroid/view/View;Z)V

    return-void
.end method

.method static constructor <clinit>()V
    .locals 6

    const/4 v0, 0x3

    new-array v0, v0, [Lkotlin/reflect/KProperty;

    .line 296
    new-instance v1, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    const-string v2, "postalCodeEnabled"

    const-string v3, "getPostalCodeEnabled()Z"

    const-class v4, Lcom/stripe/android/view/CardInputWidget;

    const/4 v5, 0x0

    invoke-direct {v1, v4, v2, v3, v5}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    check-cast v1, Lkotlin/jvm/internal/MutablePropertyReference1;

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    move-result-object v1

    aput-object v1, v0, v5

    .line 328
    new-instance v1, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    const-string v2, "postalCodeRequired"

    const-string v3, "getPostalCodeRequired()Z"

    invoke-direct {v1, v4, v2, v3, v5}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    check-cast v1, Lkotlin/jvm/internal/MutablePropertyReference1;

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 340
    new-instance v1, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    const-string v2, "usZipCodeRequired"

    const-string v3, "getUsZipCodeRequired()Z"

    invoke-direct {v1, v4, v2, v3, v5}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    check-cast v1, Lkotlin/jvm/internal/MutablePropertyReference1;

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sput-object v0, Lcom/stripe/android/view/CardInputWidget;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    new-instance v0, Lcom/stripe/android/view/CardInputWidget$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/view/CardInputWidget$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/view/CardInputWidget;->Companion:Lcom/stripe/android/view/CardInputWidget$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/view/CardInputWidget;->$stable:I

    .line 1289
    sget v0, Lcom/stripe/android/R$id;->stripe_default_reader_id:I

    sput v0, Lcom/stripe/android/view/CardInputWidget;->DEFAULT_READER_ID:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 7

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/view/CardInputWidget;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/view/CardInputWidget;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 26

    move-object/from16 v0, p0

    const-string v1, "context"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    invoke-direct/range {p0 .. p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 66
    invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    .line 67
    move-object v2, v0

    check-cast v2, Landroid/view/ViewGroup;

    .line 65
    invoke-static {v1, v2}, Lcom/stripe/android/databinding/StripeCardInputWidgetBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lcom/stripe/android/databinding/StripeCardInputWidgetBinding;

    move-result-object v1

    const-string v2, "inflate(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v0, Lcom/stripe/android/view/CardInputWidget;->viewBinding:Lcom/stripe/android/databinding/StripeCardInputWidgetBinding;

    .line 70
    iget-object v2, v1, Lcom/stripe/android/databinding/StripeCardInputWidgetBinding;->container:Landroid/widget/FrameLayout;

    const-string v3, "container"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, v0, Lcom/stripe/android/view/CardInputWidget;->containerLayout:Landroid/widget/FrameLayout;

    .line 73
    iget-object v2, v1, Lcom/stripe/android/databinding/StripeCardInputWidgetBinding;->cardBrandView:Lcom/stripe/android/view/CardBrandView;

    const-string v3, "cardBrandView"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, v0, Lcom/stripe/android/view/CardInputWidget;->cardBrandView:Lcom/stripe/android/view/CardBrandView;

    .line 75
    iget-object v2, v1, Lcom/stripe/android/databinding/StripeCardInputWidgetBinding;->cardNumberTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    const-string v3, "cardNumberTextInputLayout"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, v0, Lcom/stripe/android/view/CardInputWidget;->cardNumberTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    .line 76
    iget-object v2, v1, Lcom/stripe/android/databinding/StripeCardInputWidgetBinding;->expiryDateTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    const-string v3, "expiryDateTextInputLayout"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, v0, Lcom/stripe/android/view/CardInputWidget;->expiryDateTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    .line 77
    iget-object v2, v1, Lcom/stripe/android/databinding/StripeCardInputWidgetBinding;->cvcTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    const-string v3, "cvcTextInputLayout"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, v0, Lcom/stripe/android/view/CardInputWidget;->cvcNumberTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    .line 78
    iget-object v2, v1, Lcom/stripe/android/databinding/StripeCardInputWidgetBinding;->postalCodeTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    const-string v3, "postalCodeTextInputLayout"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, v0, Lcom/stripe/android/view/CardInputWidget;->postalCodeTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    .line 81
    iget-object v2, v1, Lcom/stripe/android/databinding/StripeCardInputWidgetBinding;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    const-string v3, "cardNumberEditText"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, v0, Lcom/stripe/android/view/CardInputWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    .line 84
    iget-object v3, v1, Lcom/stripe/android/databinding/StripeCardInputWidgetBinding;->expiryDateEditText:Lcom/stripe/android/view/ExpiryDateEditText;

    const-string v4, "expiryDateEditText"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v3, v0, Lcom/stripe/android/view/CardInputWidget;->expiryDateEditText:Lcom/stripe/android/view/ExpiryDateEditText;

    .line 87
    iget-object v4, v1, Lcom/stripe/android/databinding/StripeCardInputWidgetBinding;->cvcEditText:Lcom/stripe/android/view/CvcEditText;

    const-string v5, "cvcEditText"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v4, v0, Lcom/stripe/android/view/CardInputWidget;->cvcEditText:Lcom/stripe/android/view/CvcEditText;

    .line 90
    iget-object v1, v1, Lcom/stripe/android/databinding/StripeCardInputWidgetBinding;->postalCodeEditText:Lcom/stripe/android/view/PostalCodeEditText;

    const-string v5, "postalCodeEditText"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v0, Lcom/stripe/android/view/CardInputWidget;->postalCodeEditText:Lcom/stripe/android/view/PostalCodeEditText;

    .line 92
    new-instance v5, Lcom/stripe/android/view/LifecycleOwnerDelegate;

    invoke-direct {v5}, Lcom/stripe/android/view/LifecycleOwnerDelegate;-><init>()V

    iput-object v5, v0, Lcom/stripe/android/view/CardInputWidget;->lifecycleDelegate:Lcom/stripe/android/view/LifecycleOwnerDelegate;

    .line 96
    new-instance v5, Lcom/stripe/android/view/CardInputWidget$cardValidTextWatcher$1;

    invoke-direct {v5, v0}, Lcom/stripe/android/view/CardInputWidget$cardValidTextWatcher$1;-><init>(Lcom/stripe/android/view/CardInputWidget;)V

    iput-object v5, v0, Lcom/stripe/android/view/CardInputWidget;->cardValidTextWatcher:Lcom/stripe/android/view/CardInputWidget$cardValidTextWatcher$1;

    const/4 v5, 0x1

    .line 133
    iput-boolean v5, v0, Lcom/stripe/android/view/CardInputWidget;->isShowingFullCard:Z

    .line 138
    new-instance v6, Lcom/stripe/android/view/CardInputWidget$DefaultLayoutWidthCalculator;

    invoke-direct {v6}, Lcom/stripe/android/view/CardInputWidget$DefaultLayoutWidthCalculator;-><init>()V

    check-cast v6, Lcom/stripe/android/view/CardInputWidget$LayoutWidthCalculator;

    iput-object v6, v0, Lcom/stripe/android/view/CardInputWidget;->layoutWidthCalculator:Lcom/stripe/android/view/CardInputWidget$LayoutWidthCalculator;

    .line 140
    new-instance v7, Lcom/stripe/android/view/CardInputWidgetPlacement;

    const v24, 0xffff

    const/16 v25, 0x0

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

    invoke-direct/range {v7 .. v25}, Lcom/stripe/android/view/CardInputWidgetPlacement;-><init>(IIIIIIIIIIIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v7, v0, Lcom/stripe/android/view/CardInputWidget;->placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

    .line 296
    sget-object v6, Lkotlin/properties/Delegates;->INSTANCE:Lkotlin/properties/Delegates;

    .line 297
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    .line 1313
    new-instance v7, Lcom/stripe/android/view/CardInputWidget$special$$inlined$observable$1;

    invoke-direct {v7, v6, v0}, Lcom/stripe/android/view/CardInputWidget$special$$inlined$observable$1;-><init>(Ljava/lang/Object;Lcom/stripe/android/view/CardInputWidget;)V

    check-cast v7, Lkotlin/properties/ReadWriteProperty;

    .line 296
    iput-object v7, v0, Lcom/stripe/android/view/CardInputWidget;->postalCodeEnabled$delegate:Lkotlin/properties/ReadWriteProperty;

    .line 328
    sget-object v6, Lkotlin/properties/Delegates;->INSTANCE:Lkotlin/properties/Delegates;

    const/4 v6, 0x0

    .line 329
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    .line 1316
    new-instance v8, Lcom/stripe/android/view/CardInputWidget$special$$inlined$observable$2;

    invoke-direct {v8, v7, v0}, Lcom/stripe/android/view/CardInputWidget$special$$inlined$observable$2;-><init>(Ljava/lang/Object;Lcom/stripe/android/view/CardInputWidget;)V

    check-cast v8, Lkotlin/properties/ReadWriteProperty;

    .line 328
    iput-object v8, v0, Lcom/stripe/android/view/CardInputWidget;->postalCodeRequired$delegate:Lkotlin/properties/ReadWriteProperty;

    .line 340
    sget-object v8, Lkotlin/properties/Delegates;->INSTANCE:Lkotlin/properties/Delegates;

    .line 1319
    new-instance v8, Lcom/stripe/android/view/CardInputWidget$special$$inlined$observable$3;

    invoke-direct {v8, v7, v0}, Lcom/stripe/android/view/CardInputWidget$special$$inlined$observable$3;-><init>(Ljava/lang/Object;Lcom/stripe/android/view/CardInputWidget;)V

    check-cast v8, Lkotlin/properties/ReadWriteProperty;

    .line 340
    iput-object v8, v0, Lcom/stripe/android/view/CardInputWidget;->usZipCodeRequired$delegate:Lkotlin/properties/ReadWriteProperty;

    .line 395
    invoke-virtual {v0}, Lcom/stripe/android/view/CardInputWidget;->getId()I

    move-result v7

    const/4 v8, -0x1

    if-ne v7, v8, :cond_0

    .line 396
    sget v7, Lcom/stripe/android/view/CardInputWidget;->DEFAULT_READER_ID:I

    invoke-virtual {v0, v7}, Lcom/stripe/android/view/CardInputWidget;->setId(I)V

    .line 399
    :cond_0
    invoke-virtual {v0, v6}, Lcom/stripe/android/view/CardInputWidget;->setOrientation(I)V

    .line 400
    invoke-virtual {v0}, Lcom/stripe/android/view/CardInputWidget;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    sget v8, Lcom/stripe/android/R$dimen;->stripe_card_widget_min_width:I

    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v7

    invoke-virtual {v0, v7}, Lcom/stripe/android/view/CardInputWidget;->setMinimumWidth(I)V

    .line 402
    new-instance v7, Lcom/stripe/android/view/CardInputWidget$$ExternalSyntheticLambda0;

    invoke-direct {v7, v0}, Lcom/stripe/android/view/CardInputWidget$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/view/CardInputWidget;)V

    iput-object v7, v0, Lcom/stripe/android/view/CardInputWidget;->frameWidthSupplier:Lkotlin/jvm/functions/Function0;

    const/4 v7, 0x3

    .line 405
    new-array v7, v7, [Lcom/stripe/android/view/StripeEditText;

    aput-object v2, v7, v6

    .line 406
    aput-object v4, v7, v5

    const/4 v4, 0x2

    .line 407
    aput-object v3, v7, v4

    .line 404
    invoke-static {v7}, Lkotlin/collections/SetsKt;->mutableSetOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v3

    iput-object v3, v0, Lcom/stripe/android/view/CardInputWidget;->requiredFields:Ljava/util/Set;

    .line 409
    invoke-static {v3, v1}, Lkotlin/collections/SetsKt;->plus(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/view/CardInputWidget;->allFields:Ljava/util/Set;

    move-object/from16 v1, p2

    .line 411
    invoke-direct {v0, v1}, Lcom/stripe/android/view/CardInputWidget;->initView(Landroid/util/AttributeSet;)V

    .line 1064
    invoke-virtual {v2}, Lcom/stripe/android/view/CardNumberEditText;->getPanLength$payments_core_release()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/CardInputWidget;->createHiddenCardText$payments_core_release(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/view/CardInputWidget;->hiddenCardText:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 59
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/view/CardInputWidget;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private static final _init_$lambda$16(Lcom/stripe/android/view/CardInputWidget;)I
    .locals 0

    .line 402
    iget-object p0, p0, Lcom/stripe/android/view/CardInputWidget;->containerLayout:Landroid/widget/FrameLayout;

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getWidth()I

    move-result p0

    return p0
.end method

.method private static final _set_onBehalfOf_$lambda$15(Ljava/lang/String;Landroidx/lifecycle/LifecycleOwner;Lcom/stripe/android/view/CardWidgetViewModel;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$doWithCardWidgetViewModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "viewModel"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 364
    invoke-virtual {p2, p0}, Lcom/stripe/android/view/CardWidgetViewModel;->setOnBehalfOf(Ljava/lang/String;)V

    .line 365
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final synthetic access$getCardValidCallback$p(Lcom/stripe/android/view/CardInputWidget;)Lcom/stripe/android/view/CardValidCallback;
    .locals 0

    .line 59
    iget-object p0, p0, Lcom/stripe/android/view/CardInputWidget;->cardValidCallback:Lcom/stripe/android/view/CardValidCallback;

    return-object p0
.end method

.method public static final synthetic access$getCardValidTextWatcher$p(Lcom/stripe/android/view/CardInputWidget;)Lcom/stripe/android/view/CardInputWidget$cardValidTextWatcher$1;
    .locals 0

    .line 59
    iget-object p0, p0, Lcom/stripe/android/view/CardInputWidget;->cardValidTextWatcher:Lcom/stripe/android/view/CardInputWidget$cardValidTextWatcher$1;

    return-object p0
.end method

.method public static final synthetic access$getInvalidFields(Lcom/stripe/android/view/CardInputWidget;)Ljava/util/Set;
    .locals 0

    .line 59
    invoke-direct {p0}, Lcom/stripe/android/view/CardInputWidget;->getInvalidFields()Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getPostalCodeTextInputLayout$p(Lcom/stripe/android/view/CardInputWidget;)Lcom/google/android/material/textfield/TextInputLayout;
    .locals 0

    .line 59
    iget-object p0, p0, Lcom/stripe/android/view/CardInputWidget;->postalCodeTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    return-object p0
.end method

.method public static final synthetic access$handlePossibleCardBrandsChanged(Lcom/stripe/android/view/CardInputWidget;Ljava/util/List;)V
    .locals 0

    .line 59
    invoke-direct {p0, p1}, Lcom/stripe/android/view/CardInputWidget;->handlePossibleCardBrandsChanged(Ljava/util/List;)V

    return-void
.end method

.method public static final synthetic access$setShouldShowErrorIcon(Lcom/stripe/android/view/CardInputWidget;Z)V
    .locals 0

    .line 59
    invoke-direct {p0, p1}, Lcom/stripe/android/view/CardInputWidget;->setShouldShowErrorIcon(Z)V

    return-void
.end method

.method public static final synthetic access$updatePostalRequired(Lcom/stripe/android/view/CardInputWidget;)V
    .locals 0

    .line 59
    invoke-direct {p0}, Lcom/stripe/android/view/CardInputWidget;->updatePostalRequired()V

    return-void
.end method

.method private final applyCardElementAttributes(Landroid/util/AttributeSet;)V
    .locals 3

    .line 888
    invoke-virtual {p0}, Lcom/stripe/android/view/CardInputWidget;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "getContext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 890
    sget-object v1, Lcom/stripe/android/R$styleable;->CardElement:[I

    const-string v2, "CardElement"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    .line 1389
    invoke-virtual {v0, p1, v1, v2, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 893
    sget v0, Lcom/stripe/android/R$styleable;->CardElement_shouldShowPostalCode:I

    .line 894
    invoke-virtual {p0}, Lcom/stripe/android/view/CardInputWidget;->getPostalCodeEnabled()Z

    move-result v1

    .line 892
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/stripe/android/view/CardInputWidget;->setPostalCodeEnabled(Z)V

    .line 897
    sget v0, Lcom/stripe/android/R$styleable;->CardElement_shouldRequirePostalCode:I

    .line 898
    invoke-virtual {p0}, Lcom/stripe/android/view/CardInputWidget;->getPostalCodeRequired()Z

    move-result v1

    .line 896
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/stripe/android/view/CardInputWidget;->setPostalCodeRequired(Z)V

    .line 901
    sget v0, Lcom/stripe/android/R$styleable;->CardElement_shouldRequireUsZipCode:I

    .line 902
    invoke-virtual {p0}, Lcom/stripe/android/view/CardInputWidget;->getUsZipCodeRequired()Z

    move-result v1

    .line 900
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/stripe/android/view/CardInputWidget;->setUsZipCodeRequired(Z)V

    .line 1389
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method private final getBillingDetails()Lcom/stripe/android/model/PaymentMethod$BillingDetails;
    .locals 13

    .line 204
    invoke-direct {p0}, Lcom/stripe/android/view/CardInputWidget;->getPostalCodeValue()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_0

    .line 205
    new-instance v9, Lcom/stripe/android/model/PaymentMethod$BillingDetails;

    .line 206
    new-instance v0, Lcom/stripe/android/model/Address;

    const/16 v7, 0x2f

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v8}, Lcom/stripe/android/model/Address;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v11, 0xe

    const/4 v12, 0x0

    move-object v6, v9

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v7, v0

    .line 205
    invoke-direct/range {v6 .. v12}, Lcom/stripe/android/model/PaymentMethod$BillingDetails;-><init>(Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v6

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static synthetic getCurrentFields$payments_core_release$annotations()V
    .locals 0

    return-void
.end method

.method private final getCvc()Lcom/stripe/android/cards/Cvc$Validated;
    .locals 1

    .line 153
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->cvcEditText:Lcom/stripe/android/view/CvcEditText;

    invoke-virtual {v0}, Lcom/stripe/android/view/CvcEditText;->getCvc$payments_core_release()Lcom/stripe/android/cards/Cvc$Validated;

    move-result-object v0

    return-object v0
.end method

.method private final getCvcPlaceHolder()Ljava/lang/String;
    .locals 2

    .line 1068
    sget-object v0, Lcom/stripe/android/model/CardBrand;->AmericanExpress:Lcom/stripe/android/model/CardBrand;

    invoke-virtual {p0}, Lcom/stripe/android/view/CardInputWidget;->getBrand()Lcom/stripe/android/model/CardBrand;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 1069
    const-string v0, "2345"

    return-object v0

    .line 1071
    :cond_0
    const-string v0, "CVC"

    return-object v0
.end method

.method private final getDesiredWidthInPixels(Ljava/lang/String;Lcom/stripe/android/view/StripeEditText;)I
    .locals 2

    .line 690
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->layoutWidthCalculator:Lcom/stripe/android/view/CardInputWidget$LayoutWidthCalculator;

    invoke-virtual {p2}, Lcom/stripe/android/view/StripeEditText;->getPaint()Landroid/text/TextPaint;

    move-result-object p2

    const-string v1, "getPaint(...)"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, p1, p2}, Lcom/stripe/android/view/CardInputWidget$LayoutWidthCalculator;->calculate(Ljava/lang/String;Landroid/text/TextPaint;)I

    move-result p1

    return p1
.end method

.method private final getFocusField(II)Lcom/stripe/android/view/CardInputWidget$Field;
    .locals 3

    .line 625
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

    .line 628
    iget-boolean v1, p0, Lcom/stripe/android/view/CardInputWidget;->isShowingFullCard:Z

    .line 629
    invoke-virtual {p0}, Lcom/stripe/android/view/CardInputWidget;->getPostalCodeEnabled()Z

    move-result v2

    .line 625
    invoke-virtual {v0, p1, p2, v1, v2}, Lcom/stripe/android/view/CardInputWidgetPlacement;->getFocusField$payments_core_release(IIZZ)Lcom/stripe/android/view/CardInputWidget$Field;

    move-result-object p1

    return-object p1
.end method

.method private final getFrameStart()I
    .locals 1

    .line 384
    invoke-virtual {p0}, Lcom/stripe/android/view/CardInputWidget;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Configuration;->getLayoutDirection()I

    move-result v0

    if-nez v0, :cond_0

    .line 386
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->containerLayout:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getLeft()I

    move-result v0

    return v0

    .line 388
    :cond_0
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->containerLayout:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getRight()I

    move-result v0

    return v0
.end method

.method private final getFrameWidth()I
    .locals 1

    .line 286
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->frameWidthSupplier:Lkotlin/jvm/functions/Function0;

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    return v0
.end method

.method private final getInvalidFields()Ljava/util/Set;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/stripe/android/view/CardValidCallback$Fields;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x4

    .line 106
    new-array v0, v0, [Lcom/stripe/android/view/CardValidCallback$Fields;

    sget-object v1, Lcom/stripe/android/view/CardValidCallback$Fields;->Number:Lcom/stripe/android/view/CardValidCallback$Fields;

    .line 107
    iget-object v2, p0, Lcom/stripe/android/view/CardInputWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {v2}, Lcom/stripe/android/view/CardNumberEditText;->getValidatedCardNumber$payments_core_release()Lcom/stripe/android/cards/CardNumber$Validated;

    move-result-object v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    move-object v1, v3

    :goto_0
    const/4 v2, 0x0

    .line 106
    aput-object v1, v0, v2

    .line 109
    sget-object v1, Lcom/stripe/android/view/CardValidCallback$Fields;->Expiry:Lcom/stripe/android/view/CardValidCallback$Fields;

    .line 110
    iget-object v2, p0, Lcom/stripe/android/view/CardInputWidget;->expiryDateEditText:Lcom/stripe/android/view/ExpiryDateEditText;

    invoke-virtual {v2}, Lcom/stripe/android/view/ExpiryDateEditText;->getValidatedDate()Lcom/stripe/android/model/ExpirationDate$Validated;

    move-result-object v2

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    move-object v1, v3

    :goto_1
    const/4 v2, 0x1

    .line 109
    aput-object v1, v0, v2

    .line 112
    sget-object v1, Lcom/stripe/android/view/CardValidCallback$Fields;->Cvc:Lcom/stripe/android/view/CardValidCallback$Fields;

    .line 113
    invoke-direct {p0}, Lcom/stripe/android/view/CardInputWidget;->getCvc()Lcom/stripe/android/cards/Cvc$Validated;

    move-result-object v2

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    move-object v1, v3

    :goto_2
    const/4 v2, 0x2

    .line 112
    aput-object v1, v0, v2

    .line 115
    sget-object v1, Lcom/stripe/android/view/CardValidCallback$Fields;->Postal:Lcom/stripe/android/view/CardValidCallback$Fields;

    .line 116
    invoke-direct {p0}, Lcom/stripe/android/view/CardInputWidget;->isPostalRequired()Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/stripe/android/view/CardInputWidget;->postalCodeEditText:Lcom/stripe/android/view/PostalCodeEditText;

    invoke-virtual {v2}, Lcom/stripe/android/view/PostalCodeEditText;->getPostalCode$payments_core_release()Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    if-eqz v2, :cond_3

    invoke-static {v2}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_4

    :cond_3
    move-object v3, v1

    :cond_4
    const/4 v1, 0x3

    .line 115
    aput-object v3, v0, v1

    .line 105
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOfNotNull([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 118
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toSet(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method private final getPeekCardText()Ljava/lang/String;
    .locals 2

    .line 1077
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {v0}, Lcom/stripe/android/view/CardNumberEditText;->getPanLength$payments_core_release()I

    move-result v0

    const/16 v1, 0xe

    if-eq v0, v1, :cond_2

    const/16 v1, 0xf

    if-eq v0, v1, :cond_1

    const/16 v1, 0x13

    if-eq v0, v1, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x3

    goto :goto_0

    :cond_1
    const/4 v0, 0x5

    goto :goto_0

    :cond_2
    const/4 v0, 0x2

    .line 1083
    :goto_0
    const-string v1, "0"

    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {v1, v0}, Lkotlin/text/StringsKt;->repeat(Ljava/lang/CharSequence;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private final getPostalCodeValue()Ljava/lang/String;
    .locals 1

    .line 144
    invoke-virtual {p0}, Lcom/stripe/android/view/CardInputWidget;->getPostalCodeEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 145
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->postalCodeEditText:Lcom/stripe/android/view/PostalCodeEditText;

    invoke-virtual {v0}, Lcom/stripe/android/view/PostalCodeEditText;->getPostalCode$payments_core_release()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static synthetic getRequiredFields$payments_core_release$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getShouldShowErrorIcon$payments_core_release$annotations()V
    .locals 0

    return-void
.end method

.method private final handlePossibleCardBrandsChanged(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/model/CardBrand;",
            ">;)V"
        }
    .end annotation

    .line 847
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->cardBrandView:Lcom/stripe/android/view/CardBrandView;

    invoke-virtual {v0}, Lcom/stripe/android/view/CardBrandView;->getBrand()Lcom/stripe/android/model/CardBrand;

    move-result-object v0

    .line 848
    iget-object v1, p0, Lcom/stripe/android/view/CardInputWidget;->cardBrandView:Lcom/stripe/android/view/CardBrandView;

    invoke-virtual {v1, p1}, Lcom/stripe/android/view/CardBrandView;->setPossibleBrands(Ljava/util/List;)V

    .line 850
    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 852
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->cardBrandView:Lcom/stripe/android/view/CardBrandView;

    sget-object v1, Lcom/stripe/android/model/CardBrand;->Unknown:Lcom/stripe/android/model/CardBrand;

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/CardBrandView;->setBrand(Lcom/stripe/android/model/CardBrand;)V

    .line 855
    :cond_0
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {v0}, Lcom/stripe/android/view/CardNumberEditText;->getPanLength$payments_core_release()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/stripe/android/view/CardInputWidget;->createHiddenCardText$payments_core_release(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->hiddenCardText:Ljava/lang/String;

    .line 859
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/model/CardBrand;

    if-nez p1, :cond_1

    sget-object p1, Lcom/stripe/android/model/CardBrand;->Unknown:Lcom/stripe/android/model/CardBrand;

    .line 860
    :cond_1
    invoke-direct {p0, p1}, Lcom/stripe/android/view/CardInputWidget;->updateCvc(Lcom/stripe/android/model/CardBrand;)V

    return-void
.end method

.method private final initView(Landroid/util/AttributeSet;)V
    .locals 5

    .line 694
    invoke-direct {p0, p1}, Lcom/stripe/android/view/CardInputWidget;->applyCardElementAttributes(Landroid/util/AttributeSet;)V

    .line 697
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    check-cast v0, Landroid/view/View;

    .line 698
    new-instance v1, Lcom/stripe/android/view/CardInputWidget$initView$1;

    invoke-direct {v1}, Lcom/stripe/android/view/CardInputWidget$initView$1;-><init>()V

    check-cast v1, Landroidx/core/view/AccessibilityDelegateCompat;

    .line 696
    invoke-static {v0, v1}, Landroidx/core/view/ViewCompat;->setAccessibilityDelegate(Landroid/view/View;Landroidx/core/view/AccessibilityDelegateCompat;)V

    const/4 v0, 0x1

    .line 711
    iput-boolean v0, p0, Lcom/stripe/android/view/CardInputWidget;->isShowingFullCard:Z

    .line 713
    iget-object v1, p0, Lcom/stripe/android/view/CardInputWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {v1}, Lcom/stripe/android/view/CardNumberEditText;->getDefaultErrorColorInt()I

    move-result v1

    .line 717
    invoke-virtual {p0}, Lcom/stripe/android/view/CardInputWidget;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "getContext(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 719
    sget-object v3, Lcom/stripe/android/R$styleable;->CardInputView:[I

    const-string v4, "CardInputView"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    .line 1350
    invoke-virtual {v2, p1, v3, v4, v4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 722
    sget v2, Lcom/stripe/android/R$styleable;->CardInputView_cardTextErrorColor:I

    .line 721
    invoke-virtual {p1, v2, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    .line 725
    sget v2, Lcom/stripe/android/R$styleable;->CardInputView_cardHintText:I

    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 727
    sget v3, Lcom/stripe/android/R$styleable;->CardInputView_android_focusedByDefault:I

    .line 726
    invoke-virtual {p1, v3, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    .line 1350
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    if-eqz v2, :cond_0

    .line 733
    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {p1, v2}, Lcom/stripe/android/view/CardNumberEditText;->setHint(Ljava/lang/CharSequence;)V

    .line 736
    :cond_0
    invoke-virtual {p0}, Lcom/stripe/android/view/CardInputWidget;->getCurrentFields$payments_core_release()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    .line 1352
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/view/StripeEditText;

    .line 736
    invoke-virtual {v2, v1}, Lcom/stripe/android/view/StripeEditText;->setErrorColor(I)V

    goto :goto_0

    .line 738
    :cond_1
    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {p1}, Lcom/stripe/android/view/CardNumberEditText;->getInternalFocusChangeListeners()Ljava/util/List;

    move-result-object p1

    new-instance v1, Lcom/stripe/android/view/CardInputWidget$$ExternalSyntheticLambda9;

    invoke-direct {v1, p0}, Lcom/stripe/android/view/CardInputWidget$$ExternalSyntheticLambda9;-><init>(Lcom/stripe/android/view/CardInputWidget;)V

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 745
    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->expiryDateEditText:Lcom/stripe/android/view/ExpiryDateEditText;

    invoke-virtual {p1}, Lcom/stripe/android/view/ExpiryDateEditText;->getInternalFocusChangeListeners()Ljava/util/List;

    move-result-object p1

    new-instance v1, Lcom/stripe/android/view/CardInputWidget$$ExternalSyntheticLambda11;

    invoke-direct {v1, p0}, Lcom/stripe/android/view/CardInputWidget$$ExternalSyntheticLambda11;-><init>(Lcom/stripe/android/view/CardInputWidget;)V

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 752
    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->postalCodeEditText:Lcom/stripe/android/view/PostalCodeEditText;

    invoke-virtual {p1}, Lcom/stripe/android/view/PostalCodeEditText;->getInternalFocusChangeListeners()Ljava/util/List;

    move-result-object p1

    new-instance v1, Lcom/stripe/android/view/CardInputWidget$$ExternalSyntheticLambda12;

    invoke-direct {v1, p0}, Lcom/stripe/android/view/CardInputWidget$$ExternalSyntheticLambda12;-><init>(Lcom/stripe/android/view/CardInputWidget;)V

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 759
    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->expiryDateEditText:Lcom/stripe/android/view/ExpiryDateEditText;

    new-instance v1, Lcom/stripe/android/view/BackUpFieldDeleteListener;

    iget-object v2, p0, Lcom/stripe/android/view/CardInputWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    check-cast v2, Lcom/stripe/android/view/StripeEditText;

    invoke-direct {v1, v2}, Lcom/stripe/android/view/BackUpFieldDeleteListener;-><init>(Lcom/stripe/android/view/StripeEditText;)V

    check-cast v1, Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;

    invoke-virtual {p1, v1}, Lcom/stripe/android/view/ExpiryDateEditText;->setDeleteEmptyListener(Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;)V

    .line 760
    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->cvcEditText:Lcom/stripe/android/view/CvcEditText;

    new-instance v1, Lcom/stripe/android/view/BackUpFieldDeleteListener;

    iget-object v2, p0, Lcom/stripe/android/view/CardInputWidget;->expiryDateEditText:Lcom/stripe/android/view/ExpiryDateEditText;

    check-cast v2, Lcom/stripe/android/view/StripeEditText;

    invoke-direct {v1, v2}, Lcom/stripe/android/view/BackUpFieldDeleteListener;-><init>(Lcom/stripe/android/view/StripeEditText;)V

    check-cast v1, Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;

    invoke-virtual {p1, v1}, Lcom/stripe/android/view/CvcEditText;->setDeleteEmptyListener(Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;)V

    .line 761
    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->postalCodeEditText:Lcom/stripe/android/view/PostalCodeEditText;

    new-instance v1, Lcom/stripe/android/view/BackUpFieldDeleteListener;

    iget-object v2, p0, Lcom/stripe/android/view/CardInputWidget;->cvcEditText:Lcom/stripe/android/view/CvcEditText;

    check-cast v2, Lcom/stripe/android/view/StripeEditText;

    invoke-direct {v1, v2}, Lcom/stripe/android/view/BackUpFieldDeleteListener;-><init>(Lcom/stripe/android/view/StripeEditText;)V

    check-cast v1, Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;

    invoke-virtual {p1, v1}, Lcom/stripe/android/view/PostalCodeEditText;->setDeleteEmptyListener(Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;)V

    .line 763
    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->cvcEditText:Lcom/stripe/android/view/CvcEditText;

    invoke-virtual {p1}, Lcom/stripe/android/view/CvcEditText;->getInternalFocusChangeListeners()Ljava/util/List;

    move-result-object p1

    new-instance v1, Lcom/stripe/android/view/CardInputWidget$$ExternalSyntheticLambda13;

    invoke-direct {v1, p0}, Lcom/stripe/android/view/CardInputWidget$$ExternalSyntheticLambda13;-><init>(Lcom/stripe/android/view/CardInputWidget;)V

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 772
    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->cvcEditText:Lcom/stripe/android/view/CvcEditText;

    new-instance v1, Lcom/stripe/android/view/CardInputWidget$$ExternalSyntheticLambda14;

    invoke-direct {v1, p0}, Lcom/stripe/android/view/CardInputWidget$$ExternalSyntheticLambda14;-><init>(Lcom/stripe/android/view/CardInputWidget;)V

    invoke-virtual {p1, v1}, Lcom/stripe/android/view/CvcEditText;->setAfterTextChangedListener(Lcom/stripe/android/view/StripeEditText$AfterTextChangedListener;)V

    .line 778
    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->postalCodeEditText:Lcom/stripe/android/view/PostalCodeEditText;

    new-instance v1, Lcom/stripe/android/view/CardInputWidget$$ExternalSyntheticLambda15;

    invoke-direct {v1, p0}, Lcom/stripe/android/view/CardInputWidget$$ExternalSyntheticLambda15;-><init>(Lcom/stripe/android/view/CardInputWidget;)V

    invoke-virtual {p1, v1}, Lcom/stripe/android/view/PostalCodeEditText;->setAfterTextChangedListener(Lcom/stripe/android/view/StripeEditText$AfterTextChangedListener;)V

    .line 784
    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    new-instance v1, Lcom/stripe/android/view/CardInputWidget$$ExternalSyntheticLambda1;

    invoke-direct {v1, p0}, Lcom/stripe/android/view/CardInputWidget$$ExternalSyntheticLambda1;-><init>(Lcom/stripe/android/view/CardInputWidget;)V

    invoke-virtual {p1, v1}, Lcom/stripe/android/view/CardNumberEditText;->setCompletionCallback$payments_core_release(Lkotlin/jvm/functions/Function0;)V

    .line 789
    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    new-instance v1, Lcom/stripe/android/view/CardInputWidget$$ExternalSyntheticLambda2;

    invoke-direct {v1, p0}, Lcom/stripe/android/view/CardInputWidget$$ExternalSyntheticLambda2;-><init>(Lcom/stripe/android/view/CardInputWidget;)V

    invoke-virtual {p1, v1}, Lcom/stripe/android/view/CardNumberEditText;->setBrandChangeCallback$payments_core_release(Lkotlin/jvm/functions/Function1;)V

    .line 795
    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    new-instance v1, Lcom/stripe/android/view/CardInputWidget$$ExternalSyntheticLambda3;

    invoke-direct {v1, p0}, Lcom/stripe/android/view/CardInputWidget$$ExternalSyntheticLambda3;-><init>(Lcom/stripe/android/view/CardInputWidget;)V

    invoke-virtual {p1, v1}, Lcom/stripe/android/view/CardNumberEditText;->setImplicitCardBrandChangeCallback$payments_core_release(Lkotlin/jvm/functions/Function1;)V

    .line 803
    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    new-instance v1, Lcom/stripe/android/view/CardInputWidget$initView$14;

    invoke-direct {v1, p0}, Lcom/stripe/android/view/CardInputWidget$initView$14;-><init>(Ljava/lang/Object;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-virtual {p1, v1}, Lcom/stripe/android/view/CardNumberEditText;->setPossibleCardBrandsCallback$payments_core_release(Lkotlin/jvm/functions/Function1;)V

    .line 805
    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->expiryDateEditText:Lcom/stripe/android/view/ExpiryDateEditText;

    new-instance v1, Lcom/stripe/android/view/CardInputWidget$$ExternalSyntheticLambda4;

    invoke-direct {v1, p0}, Lcom/stripe/android/view/CardInputWidget$$ExternalSyntheticLambda4;-><init>(Lcom/stripe/android/view/CardInputWidget;)V

    invoke-virtual {p1, v1}, Lcom/stripe/android/view/ExpiryDateEditText;->setCompletionCallback$payments_core_release(Lkotlin/jvm/functions/Function0;)V

    .line 812
    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->cvcEditText:Lcom/stripe/android/view/CvcEditText;

    new-instance v1, Lcom/stripe/android/view/CardInputWidget$$ExternalSyntheticLambda10;

    invoke-direct {v1, p0}, Lcom/stripe/android/view/CardInputWidget$$ExternalSyntheticLambda10;-><init>(Lcom/stripe/android/view/CardInputWidget;)V

    invoke-virtual {p1, v1}, Lcom/stripe/android/view/CvcEditText;->setCompletionCallback$payments_core_release(Lkotlin/jvm/functions/Function0;)V

    .line 820
    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->allFields:Ljava/util/Set;

    check-cast p1, Ljava/lang/Iterable;

    .line 1354
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/view/StripeEditText;

    .line 821
    check-cast v1, Landroid/widget/TextView;

    .line 1377
    new-instance v2, Lcom/stripe/android/view/CardInputWidget$initView$lambda$45$$inlined$doAfterTextChanged$1;

    invoke-direct {v2, p0}, Lcom/stripe/android/view/CardInputWidget$initView$lambda$45$$inlined$doAfterTextChanged$1;-><init>(Lcom/stripe/android/view/CardInputWidget;)V

    .line 1378
    check-cast v2, Landroid/text/TextWatcher;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    goto :goto_1

    :cond_2
    if-eqz v0, :cond_3

    .line 827
    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {p1}, Lcom/stripe/android/view/CardNumberEditText;->requestFocus()Z

    :cond_3
    return-void
.end method

.method private static final initView$lambda$31(Lcom/stripe/android/view/CardInputWidget;Landroid/view/View;Z)V
    .locals 0

    if-eqz p2, :cond_0

    .line 740
    invoke-direct {p0}, Lcom/stripe/android/view/CardInputWidget;->scrollStart()V

    .line 741
    iget-object p0, p0, Lcom/stripe/android/view/CardInputWidget;->cardInputListener:Lcom/stripe/android/view/CardInputListener;

    if-eqz p0, :cond_0

    sget-object p1, Lcom/stripe/android/view/CardInputListener$FocusField;->CardNumber:Lcom/stripe/android/view/CardInputListener$FocusField;

    invoke-interface {p0, p1}, Lcom/stripe/android/view/CardInputListener;->onFocusChange(Lcom/stripe/android/view/CardInputListener$FocusField;)V

    :cond_0
    return-void
.end method

.method private static final initView$lambda$32(Lcom/stripe/android/view/CardInputWidget;Landroid/view/View;Z)V
    .locals 0

    if-eqz p2, :cond_0

    .line 747
    invoke-direct {p0}, Lcom/stripe/android/view/CardInputWidget;->scrollEnd()V

    .line 748
    iget-object p0, p0, Lcom/stripe/android/view/CardInputWidget;->cardInputListener:Lcom/stripe/android/view/CardInputListener;

    if-eqz p0, :cond_0

    sget-object p1, Lcom/stripe/android/view/CardInputListener$FocusField;->ExpiryDate:Lcom/stripe/android/view/CardInputListener$FocusField;

    invoke-interface {p0, p1}, Lcom/stripe/android/view/CardInputListener;->onFocusChange(Lcom/stripe/android/view/CardInputListener$FocusField;)V

    :cond_0
    return-void
.end method

.method private static final initView$lambda$33(Lcom/stripe/android/view/CardInputWidget;Landroid/view/View;Z)V
    .locals 0

    if-eqz p2, :cond_0

    .line 754
    invoke-direct {p0}, Lcom/stripe/android/view/CardInputWidget;->scrollEnd()V

    .line 755
    iget-object p0, p0, Lcom/stripe/android/view/CardInputWidget;->cardInputListener:Lcom/stripe/android/view/CardInputListener;

    if-eqz p0, :cond_0

    sget-object p1, Lcom/stripe/android/view/CardInputListener$FocusField;->PostalCode:Lcom/stripe/android/view/CardInputListener$FocusField;

    invoke-interface {p0, p1}, Lcom/stripe/android/view/CardInputListener;->onFocusChange(Lcom/stripe/android/view/CardInputListener$FocusField;)V

    :cond_0
    return-void
.end method

.method private static final initView$lambda$34(Lcom/stripe/android/view/CardInputWidget;Landroid/view/View;Z)V
    .locals 0

    .line 764
    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->cardBrandView:Lcom/stripe/android/view/CardBrandView;

    invoke-virtual {p1, p2}, Lcom/stripe/android/view/CardBrandView;->setShouldShowCvc(Z)V

    if-eqz p2, :cond_0

    .line 767
    invoke-direct {p0}, Lcom/stripe/android/view/CardInputWidget;->scrollEnd()V

    .line 768
    iget-object p0, p0, Lcom/stripe/android/view/CardInputWidget;->cardInputListener:Lcom/stripe/android/view/CardInputListener;

    if-eqz p0, :cond_0

    sget-object p1, Lcom/stripe/android/view/CardInputListener$FocusField;->Cvc:Lcom/stripe/android/view/CardInputListener$FocusField;

    invoke-interface {p0, p1}, Lcom/stripe/android/view/CardInputListener;->onFocusChange(Lcom/stripe/android/view/CardInputListener$FocusField;)V

    :cond_0
    return-void
.end method

.method private static final initView$lambda$35(Lcom/stripe/android/view/CardInputWidget;Ljava/lang/String;)V
    .locals 1

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 773
    invoke-virtual {p0}, Lcom/stripe/android/view/CardInputWidget;->getBrand()Lcom/stripe/android/model/CardBrand;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/stripe/android/model/CardBrand;->isMaxCvc(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 774
    iget-object p0, p0, Lcom/stripe/android/view/CardInputWidget;->cardInputListener:Lcom/stripe/android/view/CardInputListener;

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lcom/stripe/android/view/CardInputListener;->onCvcComplete()V

    :cond_0
    return-void
.end method

.method private static final initView$lambda$36(Lcom/stripe/android/view/CardInputWidget;Ljava/lang/String;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 779
    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->postalCodeEditText:Lcom/stripe/android/view/PostalCodeEditText;

    invoke-virtual {p1}, Lcom/stripe/android/view/PostalCodeEditText;->isEnabled()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->postalCodeEditText:Lcom/stripe/android/view/PostalCodeEditText;

    invoke-virtual {p1}, Lcom/stripe/android/view/PostalCodeEditText;->hasValidPostal$payments_core_release()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 780
    iget-object p0, p0, Lcom/stripe/android/view/CardInputWidget;->cardInputListener:Lcom/stripe/android/view/CardInputListener;

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lcom/stripe/android/view/CardInputListener;->onPostalCodeComplete()V

    :cond_0
    return-void
.end method

.method private static final initView$lambda$37(Lcom/stripe/android/view/CardInputWidget;)Lkotlin/Unit;
    .locals 0

    .line 785
    invoke-direct {p0}, Lcom/stripe/android/view/CardInputWidget;->scrollEnd()V

    .line 786
    iget-object p0, p0, Lcom/stripe/android/view/CardInputWidget;->cardInputListener:Lcom/stripe/android/view/CardInputListener;

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lcom/stripe/android/view/CardInputListener;->onCardComplete()V

    .line 787
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final initView$lambda$38(Lcom/stripe/android/view/CardInputWidget;Lcom/stripe/android/model/CardBrand;)Lkotlin/Unit;
    .locals 1

    const-string v0, "brand"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 790
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->cardBrandView:Lcom/stripe/android/view/CardBrandView;

    invoke-virtual {v0, p1}, Lcom/stripe/android/view/CardBrandView;->setBrand(Lcom/stripe/android/model/CardBrand;)V

    .line 791
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {v0}, Lcom/stripe/android/view/CardNumberEditText;->getPanLength$payments_core_release()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/stripe/android/view/CardInputWidget;->createHiddenCardText$payments_core_release(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->hiddenCardText:Ljava/lang/String;

    .line 792
    invoke-direct {p0, p1}, Lcom/stripe/android/view/CardInputWidget;->updateCvc(Lcom/stripe/android/model/CardBrand;)V

    .line 793
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final initView$lambda$39(Lcom/stripe/android/view/CardInputWidget;Lcom/stripe/android/model/CardBrand;)Lkotlin/Unit;
    .locals 1

    const-string v0, "brand"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 799
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {v0}, Lcom/stripe/android/view/CardNumberEditText;->getPanLength$payments_core_release()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/stripe/android/view/CardInputWidget;->createHiddenCardText$payments_core_release(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->hiddenCardText:Ljava/lang/String;

    .line 800
    invoke-direct {p0, p1}, Lcom/stripe/android/view/CardInputWidget;->updateCvc(Lcom/stripe/android/model/CardBrand;)V

    .line 801
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final initView$lambda$41(Lcom/stripe/android/view/CardInputWidget;)Lkotlin/Unit;
    .locals 1

    .line 806
    new-instance v0, Lcom/stripe/android/view/CardInputWidget$$ExternalSyntheticLambda7;

    invoke-direct {v0, p0}, Lcom/stripe/android/view/CardInputWidget$$ExternalSyntheticLambda7;-><init>(Lcom/stripe/android/view/CardInputWidget;)V

    invoke-virtual {p0, v0}, Lcom/stripe/android/view/CardInputWidget;->post(Ljava/lang/Runnable;)Z

    .line 809
    iget-object p0, p0, Lcom/stripe/android/view/CardInputWidget;->cardInputListener:Lcom/stripe/android/view/CardInputListener;

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lcom/stripe/android/view/CardInputListener;->onExpirationComplete()V

    .line 810
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final initView$lambda$41$lambda$40(Lcom/stripe/android/view/CardInputWidget;)V
    .locals 0

    .line 807
    iget-object p0, p0, Lcom/stripe/android/view/CardInputWidget;->cvcEditText:Lcom/stripe/android/view/CvcEditText;

    invoke-virtual {p0}, Lcom/stripe/android/view/CvcEditText;->requestFocus()Z

    return-void
.end method

.method private static final initView$lambda$43(Lcom/stripe/android/view/CardInputWidget;)Lkotlin/Unit;
    .locals 1

    .line 813
    invoke-virtual {p0}, Lcom/stripe/android/view/CardInputWidget;->getPostalCodeEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 814
    new-instance v0, Lcom/stripe/android/view/CardInputWidget$$ExternalSyntheticLambda5;

    invoke-direct {v0, p0}, Lcom/stripe/android/view/CardInputWidget$$ExternalSyntheticLambda5;-><init>(Lcom/stripe/android/view/CardInputWidget;)V

    invoke-virtual {p0, v0}, Lcom/stripe/android/view/CardInputWidget;->post(Ljava/lang/Runnable;)Z

    .line 818
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final initView$lambda$43$lambda$42(Lcom/stripe/android/view/CardInputWidget;)V
    .locals 0

    .line 815
    iget-object p0, p0, Lcom/stripe/android/view/CardInputWidget;->postalCodeEditText:Lcom/stripe/android/view/PostalCodeEditText;

    invoke-virtual {p0}, Lcom/stripe/android/view/PostalCodeEditText;->requestFocus()Z

    return-void
.end method

.method private final isPostalRequired()Z
    .locals 1

    .line 380
    invoke-virtual {p0}, Lcom/stripe/android/view/CardInputWidget;->getPostalCodeRequired()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/view/CardInputWidget;->getUsZipCodeRequired()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    invoke-virtual {p0}, Lcom/stripe/android/view/CardInputWidget;->getPostalCodeEnabled()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private static final onAttachedToWindow$lambda$18(Lcom/stripe/android/view/CardInputWidget;Landroidx/lifecycle/LifecycleOwner;Lcom/stripe/android/view/CardWidgetViewModel;)Lkotlin/Unit;
    .locals 10

    const-string v0, "$this$doWithCardWidgetViewModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewModel"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 421
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->onBehalfOf:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lcom/stripe/android/view/CardWidgetViewModel;->getOnBehalfOf()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/view/CardInputWidget;->onBehalfOf:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 422
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->onBehalfOf:Ljava/lang/String;

    invoke-virtual {p2, v0}, Lcom/stripe/android/view/CardWidgetViewModel;->setOnBehalfOf(Ljava/lang/String;)V

    .line 424
    :cond_0
    invoke-virtual {p2}, Lcom/stripe/android/view/CardWidgetViewModel;->isCbcEligible()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p2

    move-object v3, p2

    check-cast v3, Lkotlinx/coroutines/flow/Flow;

    .line 1395
    sget-object v2, Landroidx/lifecycle/Lifecycle$State;->STARTED:Landroidx/lifecycle/Lifecycle$State;

    .line 1398
    invoke-static {p1}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    move-result-object p2

    check-cast p2, Lkotlinx/coroutines/CoroutineScope;

    new-instance v0, Lcom/stripe/android/view/CardInputWidget$onAttachedToWindow$lambda$18$$inlined$launchAndCollect$default$1;

    const/4 v4, 0x0

    move-object v5, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/view/CardInputWidget$onAttachedToWindow$lambda$18$$inlined$launchAndCollect$default$1;-><init>(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;Lcom/stripe/android/view/CardInputWidget;)V

    move-object v7, v0

    check-cast v7, Lkotlin/jvm/functions/Function2;

    const/4 v8, 0x3

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v4, p2

    invoke-static/range {v4 .. v9}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 427
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private final scrollEnd()V
    .locals 11

    .line 964
    iget-boolean v0, p0, Lcom/stripe/android/view/CardInputWidget;->isShowingFullCard:Z

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lcom/stripe/android/view/CardInputWidget;->isViewInitialized:Z

    if-nez v0, :cond_0

    goto/16 :goto_1

    .line 968
    :cond_0
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/CardInputWidgetPlacement;->getDateStartMargin$payments_core_release(Z)I

    move-result v0

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, p0

    .line 970
    invoke-static/range {v2 .. v7}, Lcom/stripe/android/view/CardInputWidget;->updateSpaceSizes$payments_core_release$default(Lcom/stripe/android/view/CardInputWidget;ZIIILjava/lang/Object;)V

    .line 972
    new-instance v3, Lcom/stripe/android/view/CardInputWidget$CardNumberSlideEndAnimation;

    .line 973
    iget-object v4, v2, Lcom/stripe/android/view/CardInputWidget;->cardNumberTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    check-cast v4, Landroid/view/View;

    .line 974
    iget-object v5, v2, Lcom/stripe/android/view/CardInputWidget;->placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

    invoke-virtual {v5}, Lcom/stripe/android/view/CardInputWidgetPlacement;->getHiddenCardWidth$payments_core_release()I

    move-result v5

    .line 975
    iget-object v6, v2, Lcom/stripe/android/view/CardInputWidget;->expiryDateEditText:Lcom/stripe/android/view/ExpiryDateEditText;

    check-cast v6, Landroid/view/View;

    .line 972
    invoke-direct {v3, v4, v5, v6}, Lcom/stripe/android/view/CardInputWidget$CardNumberSlideEndAnimation;-><init>(Landroid/view/View;ILandroid/view/View;)V

    .line 978
    iget-object v4, v2, Lcom/stripe/android/view/CardInputWidget;->placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

    const/4 v5, 0x0

    invoke-virtual {v4, v5}, Lcom/stripe/android/view/CardInputWidgetPlacement;->getDateStartMargin$payments_core_release(Z)I

    move-result v4

    .line 979
    new-instance v6, Lcom/stripe/android/view/CardInputWidget$ExpiryDateSlideEndAnimation;

    .line 980
    iget-object v7, v2, Lcom/stripe/android/view/CardInputWidget;->expiryDateTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    check-cast v7, Landroid/view/View;

    .line 979
    invoke-direct {v6, v7, v0, v4}, Lcom/stripe/android/view/CardInputWidget$ExpiryDateSlideEndAnimation;-><init>(Landroid/view/View;II)V

    .line 985
    iget-object v7, v2, Lcom/stripe/android/view/CardInputWidget;->placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

    invoke-virtual {v7, v5}, Lcom/stripe/android/view/CardInputWidgetPlacement;->getCvcStartMargin$payments_core_release(Z)I

    move-result v7

    sub-int/2addr v0, v4

    add-int/2addr v0, v7

    .line 987
    new-instance v4, Lcom/stripe/android/view/CardInputWidget$CvcSlideEndAnimation;

    .line 988
    iget-object v8, v2, Lcom/stripe/android/view/CardInputWidget;->cvcNumberTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    check-cast v8, Landroid/view/View;

    .line 991
    iget-object v9, v2, Lcom/stripe/android/view/CardInputWidget;->placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

    invoke-virtual {v9}, Lcom/stripe/android/view/CardInputWidgetPlacement;->getCvcWidth$payments_core_release()I

    move-result v9

    .line 987
    invoke-direct {v4, v8, v0, v7, v9}, Lcom/stripe/android/view/CardInputWidget$CvcSlideEndAnimation;-><init>(Landroid/view/View;III)V

    .line 994
    iget-object v8, v2, Lcom/stripe/android/view/CardInputWidget;->placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

    invoke-virtual {v8, v5}, Lcom/stripe/android/view/CardInputWidgetPlacement;->getPostalCodeStartMargin$payments_core_release(Z)I

    move-result v8

    sub-int/2addr v0, v7

    add-int/2addr v0, v8

    .line 996
    invoke-virtual {p0}, Lcom/stripe/android/view/CardInputWidget;->getPostalCodeEnabled()Z

    move-result v7

    if-eqz v7, :cond_1

    .line 997
    new-instance v7, Lcom/stripe/android/view/CardInputWidget$PostalCodeSlideEndAnimation;

    .line 998
    iget-object v9, v2, Lcom/stripe/android/view/CardInputWidget;->postalCodeTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    check-cast v9, Landroid/view/View;

    .line 1001
    iget-object v10, v2, Lcom/stripe/android/view/CardInputWidget;->placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

    invoke-virtual {v10}, Lcom/stripe/android/view/CardInputWidgetPlacement;->getPostalCodeWidth$payments_core_release()I

    move-result v10

    .line 997
    invoke-direct {v7, v9, v0, v8, v10}, Lcom/stripe/android/view/CardInputWidget$PostalCodeSlideEndAnimation;-><init>(Landroid/view/View;III)V

    goto :goto_0

    :cond_1
    const/4 v7, 0x0

    :goto_0
    const/4 v0, 0x4

    .line 1009
    new-array v0, v0, [Lcom/stripe/android/view/CardInputWidget$CardFieldAnimation;

    aput-object v3, v0, v5

    .line 1010
    aput-object v6, v0, v1

    const/4 v1, 0x2

    .line 1011
    aput-object v4, v0, v1

    const/4 v1, 0x3

    .line 1012
    aput-object v7, v0, v1

    .line 1008
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOfNotNull([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 1007
    invoke-direct {p0, v0}, Lcom/stripe/android/view/CardInputWidget;->startSlideAnimation(Ljava/util/List;)V

    .line 1016
    iput-boolean v5, v2, Lcom/stripe/android/view/CardInputWidget;->isShowingFullCard:Z

    return-void

    :cond_2
    :goto_1
    move-object v2, p0

    return-void
.end method

.method private final scrollStart()V
    .locals 11

    .line 909
    iget-boolean v0, p0, Lcom/stripe/android/view/CardInputWidget;->isShowingFullCard:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lcom/stripe/android/view/CardInputWidget;->isViewInitialized:Z

    if-nez v0, :cond_0

    goto :goto_1

    .line 913
    :cond_0
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/CardInputWidgetPlacement;->getDateStartMargin$payments_core_release(Z)I

    move-result v0

    .line 914
    iget-object v2, p0, Lcom/stripe/android/view/CardInputWidget;->placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

    invoke-virtual {v2, v1}, Lcom/stripe/android/view/CardInputWidgetPlacement;->getCvcStartMargin$payments_core_release(Z)I

    move-result v2

    .line 915
    iget-object v3, p0, Lcom/stripe/android/view/CardInputWidget;->placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

    invoke-virtual {v3, v1}, Lcom/stripe/android/view/CardInputWidgetPlacement;->getPostalCodeStartMargin$payments_core_release(Z)I

    move-result v3

    const/4 v8, 0x6

    const/4 v9, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v4, p0

    .line 917
    invoke-static/range {v4 .. v9}, Lcom/stripe/android/view/CardInputWidget;->updateSpaceSizes$payments_core_release$default(Lcom/stripe/android/view/CardInputWidget;ZIIILjava/lang/Object;)V

    .line 919
    new-instance v5, Lcom/stripe/android/view/CardInputWidget$CardNumberSlideStartAnimation;

    .line 920
    iget-object v6, v4, Lcom/stripe/android/view/CardInputWidget;->cardNumberTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    check-cast v6, Landroid/view/View;

    .line 919
    invoke-direct {v5, v6}, Lcom/stripe/android/view/CardInputWidget$CardNumberSlideStartAnimation;-><init>(Landroid/view/View;)V

    .line 923
    iget-object v6, v4, Lcom/stripe/android/view/CardInputWidget;->placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

    const/4 v7, 0x1

    invoke-virtual {v6, v7}, Lcom/stripe/android/view/CardInputWidgetPlacement;->getDateStartMargin$payments_core_release(Z)I

    move-result v6

    .line 924
    new-instance v8, Lcom/stripe/android/view/CardInputWidget$ExpiryDateSlideStartAnimation;

    .line 925
    iget-object v9, v4, Lcom/stripe/android/view/CardInputWidget;->expiryDateTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    check-cast v9, Landroid/view/View;

    .line 924
    invoke-direct {v8, v9, v0, v6}, Lcom/stripe/android/view/CardInputWidget$ExpiryDateSlideStartAnimation;-><init>(Landroid/view/View;II)V

    sub-int/2addr v6, v0

    add-int/2addr v6, v2

    .line 931
    new-instance v0, Lcom/stripe/android/view/CardInputWidget$CvcSlideStartAnimation;

    .line 932
    iget-object v9, v4, Lcom/stripe/android/view/CardInputWidget;->cvcNumberTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    check-cast v9, Landroid/view/View;

    .line 935
    iget-object v10, v4, Lcom/stripe/android/view/CardInputWidget;->placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

    invoke-virtual {v10}, Lcom/stripe/android/view/CardInputWidgetPlacement;->getCvcWidth$payments_core_release()I

    move-result v10

    .line 931
    invoke-direct {v0, v9, v2, v6, v10}, Lcom/stripe/android/view/CardInputWidget$CvcSlideStartAnimation;-><init>(Landroid/view/View;III)V

    sub-int/2addr v6, v2

    add-int/2addr v6, v3

    .line 939
    invoke-virtual {p0}, Lcom/stripe/android/view/CardInputWidget;->getPostalCodeEnabled()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 940
    new-instance v2, Lcom/stripe/android/view/CardInputWidget$PostalCodeSlideStartAnimation;

    .line 941
    iget-object v9, v4, Lcom/stripe/android/view/CardInputWidget;->postalCodeTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    check-cast v9, Landroid/view/View;

    .line 944
    iget-object v10, v4, Lcom/stripe/android/view/CardInputWidget;->placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

    invoke-virtual {v10}, Lcom/stripe/android/view/CardInputWidgetPlacement;->getPostalCodeWidth$payments_core_release()I

    move-result v10

    .line 940
    invoke-direct {v2, v9, v3, v6, v10}, Lcom/stripe/android/view/CardInputWidget$PostalCodeSlideStartAnimation;-><init>(Landroid/view/View;III)V

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    const/4 v3, 0x4

    .line 952
    new-array v3, v3, [Lcom/stripe/android/view/CardInputWidget$CardFieldAnimation;

    aput-object v5, v3, v1

    .line 953
    aput-object v8, v3, v7

    const/4 v1, 0x2

    .line 954
    aput-object v0, v3, v1

    const/4 v0, 0x3

    .line 955
    aput-object v2, v3, v0

    .line 951
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->listOfNotNull([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 950
    invoke-direct {p0, v0}, Lcom/stripe/android/view/CardInputWidget;->startSlideAnimation(Ljava/util/List;)V

    .line 959
    iput-boolean v7, v4, Lcom/stripe/android/view/CardInputWidget;->isShowingFullCard:Z

    return-void

    :cond_2
    :goto_1
    move-object v4, p0

    return-void
.end method

.method private final setShouldShowErrorIcon(Z)V
    .locals 1

    .line 124
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->cardBrandView:Lcom/stripe/android/view/CardBrandView;

    invoke-virtual {v0, p1}, Lcom/stripe/android/view/CardBrandView;->setShouldShowErrorIcon(Z)V

    .line 125
    iput-boolean p1, p0, Lcom/stripe/android/view/CardInputWidget;->shouldShowErrorIcon:Z

    return-void
.end method

.method private final startSlideAnimation(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Landroid/view/animation/Animation;",
            ">;)V"
        }
    .end annotation

    .line 1020
    new-instance v0, Landroid/view/animation/AnimationSet;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/view/animation/AnimationSet;-><init>(Z)V

    .line 1021
    check-cast p1, Ljava/lang/Iterable;

    .line 1391
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/animation/Animation;

    .line 1021
    invoke-virtual {v0, v1}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    goto :goto_0

    .line 1023
    :cond_0
    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->containerLayout:Landroid/widget/FrameLayout;

    check-cast v0, Landroid/view/animation/Animation;

    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method private final updateCvc(Lcom/stripe/android/model/CardBrand;)V
    .locals 7

    .line 840
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->cvcEditText:Lcom/stripe/android/view/CvcEditText;

    .line 842
    iget-object v2, p0, Lcom/stripe/android/view/CardInputWidget;->customCvcLabel:Ljava/lang/String;

    const/16 v5, 0xc

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p1

    .line 840
    invoke-static/range {v0 .. v6}, Lcom/stripe/android/view/CvcEditText;->updateBrand$payments_core_release$default(Lcom/stripe/android/view/CvcEditText;Lcom/stripe/android/model/CardBrand;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/material/textfield/TextInputLayout;ILjava/lang/Object;)V

    return-void
.end method

.method private final updateFieldLayout(Landroid/view/View;II)V
    .locals 1

    .line 1342
    new-instance v0, Lcom/stripe/android/view/CardInputWidget$updateFieldLayout$$inlined$doOnPreDraw$1;

    invoke-direct {v0, p1, p2, p3}, Lcom/stripe/android/view/CardInputWidget$updateFieldLayout$$inlined$doOnPreDraw$1;-><init>(Landroid/view/View;II)V

    check-cast v0, Ljava/lang/Runnable;

    invoke-static {p1, v0}, Landroidx/core/view/OneShotPreDrawListener;->add(Landroid/view/View;Ljava/lang/Runnable;)Landroidx/core/view/OneShotPreDrawListener;

    return-void
.end method

.method private final updatePostalRequired()V
    .locals 2

    .line 373
    invoke-direct {p0}, Lcom/stripe/android/view/CardInputWidget;->isPostalRequired()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 374
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->requiredFields:Ljava/util/Set;

    iget-object v1, p0, Lcom/stripe/android/view/CardInputWidget;->postalCodeEditText:Lcom/stripe/android/view/PostalCodeEditText;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void

    .line 376
    :cond_0
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->requiredFields:Ljava/util/Set;

    iget-object v1, p0, Lcom/stripe/android/view/CardInputWidget;->postalCodeEditText:Lcom/stripe/android/view/PostalCodeEditText;

    invoke-interface {v0, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public static synthetic updateSpaceSizes$payments_core_release$default(Lcom/stripe/android/view/CardInputWidget;ZIIILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 635
    invoke-direct {p0}, Lcom/stripe/android/view/CardInputWidget;->getFrameWidth()I

    move-result p2

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 636
    invoke-direct {p0}, Lcom/stripe/android/view/CardInputWidget;->getFrameStart()I

    move-result p3

    .line 632
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/view/CardInputWidget;->updateSpaceSizes$payments_core_release(ZII)V

    return-void
.end method


# virtual methods
.method public clear()V
    .locals 3

    .line 527
    invoke-virtual {p0}, Lcom/stripe/android/view/CardInputWidget;->getCurrentFields$payments_core_release()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 1332
    instance-of v1, v0, Ljava/util/Collection;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 1333
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/view/StripeEditText;

    .line 527
    invoke-virtual {v1}, Lcom/stripe/android/view/StripeEditText;->hasFocus()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_2
    :goto_0
    invoke-virtual {p0}, Lcom/stripe/android/view/CardInputWidget;->hasFocus()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 528
    :goto_1
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {v0}, Lcom/stripe/android/view/CardNumberEditText;->requestFocus()Z

    .line 531
    :cond_3
    invoke-virtual {p0}, Lcom/stripe/android/view/CardInputWidget;->getCurrentFields$payments_core_release()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 1335
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/view/StripeEditText;

    .line 531
    const-string v2, ""

    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {v1, v2}, Lcom/stripe/android/view/StripeEditText;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    :cond_4
    return-void
.end method

.method public final createHiddenCardText$payments_core_release(I)Ljava/lang/String;
    .locals 6

    .line 878
    new-instance v0, Lcom/stripe/android/cards/CardNumber$Unvalidated;

    .line 879
    const-string v1, "0"

    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {v1, p1}, Lkotlin/text/StringsKt;->repeat(Ljava/lang/CharSequence;I)Ljava/lang/String;

    move-result-object v1

    .line 878
    invoke-direct {v0, v1}, Lcom/stripe/android/cards/CardNumber$Unvalidated;-><init>(Ljava/lang/String;)V

    .line 880
    invoke-virtual {v0, p1}, Lcom/stripe/android/cards/CardNumber$Unvalidated;->getFormatted(I)Ljava/lang/String;

    move-result-object p1

    .line 883
    move-object v0, p1

    check-cast v0, Ljava/lang/CharSequence;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/16 v1, 0x20

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lkotlin/text/StringsKt;->lastIndexOf$default(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    .line 882
    invoke-static {p1, v0}, Lkotlin/text/StringsKt;->take(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final getBrand()Lcom/stripe/android/model/CardBrand;
    .locals 1

    .line 161
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {v0}, Lcom/stripe/android/view/CardNumberEditText;->getCardBrand()Lcom/stripe/android/model/CardBrand;

    move-result-object v0

    return-object v0
.end method

.method public final getCardBrandView$payments_core_release()Lcom/stripe/android/view/CardBrandView;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->cardBrandView:Lcom/stripe/android/view/CardBrandView;

    return-object v0
.end method

.method public final getCardNumberEditText$payments_core_release()Lcom/stripe/android/view/CardNumberEditText;
    .locals 1

    .line 80
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    return-object v0
.end method

.method public getCardParams()Lcom/stripe/android/model/CardParams;
    .locals 20

    move-object/from16 v0, p0

    .line 230
    iget-object v1, v0, Lcom/stripe/android/view/CardInputWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {v1}, Lcom/stripe/android/view/CardNumberEditText;->getValidatedCardNumber$payments_core_release()Lcom/stripe/android/cards/CardNumber$Validated;

    move-result-object v1

    .line 231
    iget-object v2, v0, Lcom/stripe/android/view/CardInputWidget;->expiryDateEditText:Lcom/stripe/android/view/ExpiryDateEditText;

    invoke-virtual {v2}, Lcom/stripe/android/view/ExpiryDateEditText;->getValidatedDate()Lcom/stripe/android/model/ExpirationDate$Validated;

    move-result-object v2

    .line 232
    invoke-direct {v0}, Lcom/stripe/android/view/CardInputWidget;->getCvc()Lcom/stripe/android/cards/Cvc$Validated;

    move-result-object v3

    .line 234
    iget-object v4, v0, Lcom/stripe/android/view/CardInputWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-nez v1, :cond_0

    move v7, v5

    goto :goto_0

    :cond_0
    move v7, v6

    :goto_0
    invoke-virtual {v4, v7}, Lcom/stripe/android/view/CardNumberEditText;->setShouldShowError(Z)V

    .line 235
    iget-object v4, v0, Lcom/stripe/android/view/CardInputWidget;->expiryDateEditText:Lcom/stripe/android/view/ExpiryDateEditText;

    if-nez v2, :cond_1

    move v7, v5

    goto :goto_1

    :cond_1
    move v7, v6

    :goto_1
    invoke-virtual {v4, v7}, Lcom/stripe/android/view/ExpiryDateEditText;->setShouldShowError(Z)V

    .line 236
    iget-object v4, v0, Lcom/stripe/android/view/CardInputWidget;->cvcEditText:Lcom/stripe/android/view/CvcEditText;

    if-nez v3, :cond_2

    move v7, v5

    goto :goto_2

    :cond_2
    move v7, v6

    :goto_2
    invoke-virtual {v4, v7}, Lcom/stripe/android/view/CvcEditText;->setShouldShowError(Z)V

    .line 237
    iget-object v4, v0, Lcom/stripe/android/view/CardInputWidget;->postalCodeEditText:Lcom/stripe/android/view/PostalCodeEditText;

    .line 238
    invoke-virtual {v0}, Lcom/stripe/android/view/CardInputWidget;->getPostalCodeRequired()Z

    move-result v7

    if-nez v7, :cond_3

    invoke-virtual {v0}, Lcom/stripe/android/view/CardInputWidget;->getUsZipCodeRequired()Z

    move-result v7

    if-eqz v7, :cond_4

    .line 239
    :cond_3
    iget-object v7, v0, Lcom/stripe/android/view/CardInputWidget;->postalCodeEditText:Lcom/stripe/android/view/PostalCodeEditText;

    invoke-virtual {v7}, Lcom/stripe/android/view/PostalCodeEditText;->getPostalCode$payments_core_release()Ljava/lang/String;

    move-result-object v7

    check-cast v7, Ljava/lang/CharSequence;

    if-eqz v7, :cond_5

    invoke-static {v7}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_4

    goto :goto_3

    :cond_4
    move v7, v6

    goto :goto_4

    :cond_5
    :goto_3
    move v7, v5

    .line 237
    :goto_4
    invoke-virtual {v4, v7}, Lcom/stripe/android/view/PostalCodeEditText;->setShouldShowError(Z)V

    .line 242
    invoke-virtual {v0}, Lcom/stripe/android/view/CardInputWidget;->getCurrentFields$payments_core_release()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    .line 1323
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    check-cast v7, Ljava/util/Collection;

    .line 1324
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_6
    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_7

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    move-object v9, v8

    check-cast v9, Lcom/stripe/android/view/StripeEditText;

    .line 243
    invoke-virtual {v9}, Lcom/stripe/android/view/StripeEditText;->getShouldShowError()Z

    move-result v9

    if-eqz v9, :cond_6

    .line 1324
    invoke-interface {v7, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 1325
    :cond_7
    check-cast v7, Ljava/util/List;

    .line 1323
    check-cast v7, Ljava/lang/Iterable;

    .line 1326
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_8
    :goto_6
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_9

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/stripe/android/view/StripeEditText;

    .line 245
    invoke-virtual {v7}, Lcom/stripe/android/view/StripeEditText;->getErrorMessage$payments_core_release()Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_8

    .line 246
    check-cast v8, Ljava/lang/CharSequence;

    invoke-virtual {v7, v8}, Lcom/stripe/android/view/StripeEditText;->announceForAccessibility(Ljava/lang/CharSequence;)V

    goto :goto_6

    :cond_9
    const/4 v4, 0x0

    if-nez v1, :cond_a

    .line 252
    iget-object v1, v0, Lcom/stripe/android/view/CardInputWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {v1}, Lcom/stripe/android/view/CardNumberEditText;->requestFocus()Z

    goto :goto_7

    :cond_a
    if-nez v2, :cond_b

    .line 255
    iget-object v1, v0, Lcom/stripe/android/view/CardInputWidget;->expiryDateEditText:Lcom/stripe/android/view/ExpiryDateEditText;

    invoke-virtual {v1}, Lcom/stripe/android/view/ExpiryDateEditText;->requestFocus()Z

    goto :goto_7

    :cond_b
    if-nez v3, :cond_c

    .line 258
    iget-object v1, v0, Lcom/stripe/android/view/CardInputWidget;->cvcEditText:Lcom/stripe/android/view/CvcEditText;

    invoke-virtual {v1}, Lcom/stripe/android/view/CvcEditText;->requestFocus()Z

    goto :goto_7

    .line 260
    :cond_c
    iget-object v7, v0, Lcom/stripe/android/view/CardInputWidget;->postalCodeEditText:Lcom/stripe/android/view/PostalCodeEditText;

    invoke-virtual {v7}, Lcom/stripe/android/view/PostalCodeEditText;->getShouldShowError()Z

    move-result v7

    if-eqz v7, :cond_d

    .line 261
    iget-object v1, v0, Lcom/stripe/android/view/CardInputWidget;->postalCodeEditText:Lcom/stripe/android/view/PostalCodeEditText;

    invoke-virtual {v1}, Lcom/stripe/android/view/PostalCodeEditText;->requestFocus()Z

    .line 280
    :goto_7
    invoke-direct {v0, v5}, Lcom/stripe/android/view/CardInputWidget;->setShouldShowErrorIcon(Z)V

    return-object v4

    .line 264
    :cond_d
    invoke-direct {v0, v6}, Lcom/stripe/android/view/CardInputWidget;->setShouldShowErrorIcon(Z)V

    .line 266
    invoke-virtual {v0}, Lcom/stripe/android/view/CardInputWidget;->getBrand()Lcom/stripe/android/model/CardBrand;

    move-result-object v7

    .line 267
    const-string v5, "CardInputView"

    invoke-static {v5}, Lkotlin/collections/SetsKt;->setOf(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v8

    .line 268
    invoke-virtual {v1}, Lcom/stripe/android/cards/CardNumber$Validated;->getValue()Ljava/lang/String;

    move-result-object v9

    .line 269
    invoke-virtual {v2}, Lcom/stripe/android/model/ExpirationDate$Validated;->getMonth()I

    move-result v10

    .line 270
    invoke-virtual {v2}, Lcom/stripe/android/model/ExpirationDate$Validated;->getYear()I

    move-result v11

    .line 271
    invoke-virtual {v3}, Lcom/stripe/android/cards/Cvc$Validated;->getValue$payments_core_release()Ljava/lang/String;

    move-result-object v12

    .line 272
    new-instance v1, Lcom/stripe/android/model/Address$Builder;

    invoke-direct {v1}, Lcom/stripe/android/model/Address$Builder;-><init>()V

    .line 273
    invoke-direct {v0}, Lcom/stripe/android/view/CardInputWidget;->getPostalCodeValue()Ljava/lang/String;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/lang/CharSequence;

    if-eqz v3, :cond_f

    invoke-static {v3}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_e

    goto :goto_8

    :cond_e
    move-object v4, v2

    :cond_f
    :goto_8
    invoke-virtual {v1, v4}, Lcom/stripe/android/model/Address$Builder;->setPostalCode(Ljava/lang/String;)Lcom/stripe/android/model/Address$Builder;

    move-result-object v1

    .line 274
    invoke-virtual {v1}, Lcom/stripe/android/model/Address$Builder;->build()Lcom/stripe/android/model/Address;

    move-result-object v14

    .line 275
    iget-object v1, v0, Lcom/stripe/android/view/CardInputWidget;->cardBrandView:Lcom/stripe/android/view/CardBrandView;

    invoke-virtual {v1}, Lcom/stripe/android/view/CardBrandView;->cardParamsNetworks()Lcom/stripe/android/model/Networks;

    move-result-object v16

    .line 265
    new-instance v6, Lcom/stripe/android/model/CardParams;

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x540

    const/16 v19, 0x0

    invoke-direct/range {v6 .. v19}, Lcom/stripe/android/model/CardParams;-><init>(Lcom/stripe/android/model/CardBrand;Ljava/util/Set;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Address;Ljava/lang/String;Lcom/stripe/android/model/Networks;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v6
.end method

.method public final synthetic getCurrentFields$payments_core_release()Ljava/util/List;
    .locals 3

    .line 176
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->requiredFields:Ljava/util/Set;

    .line 177
    iget-object v1, p0, Lcom/stripe/android/view/CardInputWidget;->postalCodeEditText:Lcom/stripe/android/view/PostalCodeEditText;

    invoke-virtual {p0}, Lcom/stripe/android/view/CardInputWidget;->getPostalCodeEnabled()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v0, v1}, Lkotlin/collections/SetsKt;->plus(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 178
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->filterNotNull(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final getCvcEditText$payments_core_release()Lcom/stripe/android/view/CvcEditText;
    .locals 1

    .line 86
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->cvcEditText:Lcom/stripe/android/view/CvcEditText;

    return-object v0
.end method

.method public final getExpiryDateEditText$payments_core_release()Lcom/stripe/android/view/ExpiryDateEditText;
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->expiryDateEditText:Lcom/stripe/android/view/ExpiryDateEditText;

    return-object v0
.end method

.method public final getFrameWidthSupplier$payments_core_release()Lkotlin/jvm/functions/Function0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 288
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->frameWidthSupplier:Lkotlin/jvm/functions/Function0;

    return-object v0
.end method

.method public final getLayoutWidthCalculator$payments_core_release()Lcom/stripe/android/view/CardInputWidget$LayoutWidthCalculator;
    .locals 1

    .line 137
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->layoutWidthCalculator:Lcom/stripe/android/view/CardInputWidget$LayoutWidthCalculator;

    return-object v0
.end method

.method public final getOnBehalfOf()Ljava/lang/String;
    .locals 1

    .line 359
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->onBehalfOf:Ljava/lang/String;

    return-object v0
.end method

.method public getPaymentMethodCard()Lcom/stripe/android/model/PaymentMethodCreateParams$Card;
    .locals 11

    .line 190
    invoke-virtual {p0}, Lcom/stripe/android/view/CardInputWidget;->getCardParams()Lcom/stripe/android/model/CardParams;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 192
    invoke-virtual {v0}, Lcom/stripe/android/model/CardParams;->getNumber()Ljava/lang/String;

    move-result-object v2

    .line 193
    invoke-virtual {v0}, Lcom/stripe/android/model/CardParams;->getCvc()Ljava/lang/String;

    move-result-object v5

    .line 194
    invoke-virtual {v0}, Lcom/stripe/android/model/CardParams;->getExpMonth()I

    move-result v1

    .line 195
    invoke-virtual {v0}, Lcom/stripe/android/model/CardParams;->getExpYear()I

    move-result v3

    .line 196
    invoke-virtual {v0}, Lcom/stripe/android/model/CardParams;->getAttribution()Ljava/util/Set;

    move-result-object v7

    .line 197
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->cardBrandView:Lcom/stripe/android/view/CardBrandView;

    invoke-virtual {v0}, Lcom/stripe/android/view/CardBrandView;->paymentMethodCreateParamsNetworks()Lcom/stripe/android/model/PaymentMethodCreateParams$Card$Networks;

    move-result-object v8

    move v0, v1

    .line 191
    new-instance v1, Lcom/stripe/android/model/PaymentMethodCreateParams$Card;

    .line 194
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 195
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/16 v9, 0x10

    const/4 v10, 0x0

    const/4 v6, 0x0

    move-object v3, v0

    .line 191
    invoke-direct/range {v1 .. v10}, Lcom/stripe/android/model/PaymentMethodCreateParams$Card;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/model/PaymentMethodCreateParams$Card$Networks;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getPaymentMethodCreateParams()Lcom/stripe/android/model/PaymentMethodCreateParams;
    .locals 7

    .line 219
    invoke-virtual {p0}, Lcom/stripe/android/view/CardInputWidget;->getPaymentMethodCard()Lcom/stripe/android/model/PaymentMethodCreateParams$Card;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 220
    sget-object v0, Lcom/stripe/android/model/PaymentMethodCreateParams;->Companion:Lcom/stripe/android/model/PaymentMethodCreateParams$Companion;

    invoke-direct {p0}, Lcom/stripe/android/view/CardInputWidget;->getBillingDetails()Lcom/stripe/android/model/PaymentMethod$BillingDetails;

    move-result-object v2

    const/16 v5, 0xc

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Lcom/stripe/android/model/PaymentMethodCreateParams$Companion;->create$default(Lcom/stripe/android/model/PaymentMethodCreateParams$Companion;Lcom/stripe/android/model/PaymentMethodCreateParams$Card;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/util/Map;Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;ILjava/lang/Object;)Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getPlacement$payments_core_release()Lcom/stripe/android/view/CardInputWidgetPlacement;
    .locals 1

    .line 140
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

    return-object v0
.end method

.method public final getPostalCodeEditText$payments_core_release()Lcom/stripe/android/view/PostalCodeEditText;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->postalCodeEditText:Lcom/stripe/android/view/PostalCodeEditText;

    return-object v0
.end method

.method public final getPostalCodeEnabled()Z
    .locals 3

    .line 296
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->postalCodeEnabled$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/stripe/android/view/CardInputWidget;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1}, Lkotlin/properties/ReadWriteProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final getPostalCodeRequired()Z
    .locals 3

    .line 328
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->postalCodeRequired$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/stripe/android/view/CardInputWidget;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1}, Lkotlin/properties/ReadWriteProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final getRequiredFields$payments_core_release()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/stripe/android/view/StripeEditText;",
            ">;"
        }
    .end annotation

    .line 164
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->requiredFields:Ljava/util/Set;

    return-object v0
.end method

.method public final getShouldShowErrorIcon$payments_core_release()Z
    .locals 1

    .line 121
    iget-boolean v0, p0, Lcom/stripe/android/view/CardInputWidget;->shouldShowErrorIcon:Z

    return v0
.end method

.method public final getUsZipCodeRequired()Z
    .locals 3

    .line 340
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->usZipCodeRequired$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/stripe/android/view/CardInputWidget;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x2

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1}, Lkotlin/properties/ReadWriteProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final getViewModelStoreOwner$payments_core_release()Landroidx/lifecycle/ViewModelStoreOwner;
    .locals 1

    .line 181
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->viewModelStoreOwner:Landroidx/lifecycle/ViewModelStoreOwner;

    return-object v0
.end method

.method public isEnabled()Z
    .locals 3

    .line 579
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->requiredFields:Ljava/util/Set;

    check-cast v0, Ljava/lang/Iterable;

    .line 1339
    instance-of v1, v0, Ljava/util/Collection;

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    return v2

    .line 1340
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/view/StripeEditText;

    .line 579
    invoke-virtual {v1}, Lcom/stripe/android/view/StripeEditText;->isEnabled()Z

    move-result v1

    if-nez v1, :cond_1

    const/4 v0, 0x0

    return v0

    :cond_2
    return v2
.end method

.method public final isShowingFullCard$payments_core_release()Z
    .locals 1

    .line 132
    iget-boolean v0, p0, Lcom/stripe/android/view/CardInputWidget;->isShowingFullCard:Z

    return v0
.end method

.method protected onAttachedToWindow()V
    .locals 3

    .line 415
    invoke-super {p0}, Landroid/widget/LinearLayout;->onAttachedToWindow()V

    .line 416
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->lifecycleDelegate:Lcom/stripe/android/view/LifecycleOwnerDelegate;

    move-object v1, p0

    check-cast v1, Landroid/view/View;

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/LifecycleOwnerDelegate;->initLifecycle(Landroid/view/View;)V

    .line 418
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->viewModelStoreOwner:Landroidx/lifecycle/ViewModelStoreOwner;

    new-instance v2, Lcom/stripe/android/view/CardInputWidget$$ExternalSyntheticLambda8;

    invoke-direct {v2, p0}, Lcom/stripe/android/view/CardInputWidget$$ExternalSyntheticLambda8;-><init>(Lcom/stripe/android/view/CardInputWidget;)V

    invoke-static {v1, v0, v2}, Lcom/stripe/android/view/CardWidgetViewModelKt;->doWithCardWidgetViewModel(Landroid/view/View;Landroidx/lifecycle/ViewModelStoreOwner;Lkotlin/jvm/functions/Function2;)V

    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 2

    .line 431
    invoke-super {p0}, Landroid/widget/LinearLayout;->onDetachedFromWindow()V

    .line 432
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->lifecycleDelegate:Lcom/stripe/android/view/LifecycleOwnerDelegate;

    move-object v1, p0

    check-cast v1, Landroid/view/View;

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/LifecycleOwnerDelegate;->destroyLifecycle(Landroid/view/View;)V

    return-void
.end method

.method protected onFinishInflate()V
    .locals 2

    .line 436
    invoke-super {p0}, Landroid/widget/LinearLayout;->onFinishInflate()V

    .line 437
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->postalCodeEditText:Lcom/stripe/android/view/PostalCodeEditText;

    sget-object v1, Lcom/stripe/android/view/PostalCodeEditText$Config;->Global:Lcom/stripe/android/view/PostalCodeEditText$Config;

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/PostalCodeEditText;->setConfig$payments_core_release(Lcom/stripe/android/view/PostalCodeEditText$Config;)V

    return-void
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    const-string v0, "ev"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 583
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-eqz v0, :cond_0

    .line 584
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    .line 588
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-int v0, v0

    .line 589
    invoke-direct {p0}, Lcom/stripe/android/view/CardInputWidget;->getFrameStart()I

    move-result v1

    .line 587
    invoke-direct {p0, v0, v1}, Lcom/stripe/android/view/CardInputWidget;->getFocusField(II)Lcom/stripe/android/view/CardInputWidget$Field;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 591
    sget-object p1, Lcom/stripe/android/view/CardInputWidget$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Lcom/stripe/android/view/CardInputWidget$Field;->ordinal()I

    move-result v0

    aget p1, p1, v0

    const/4 v0, 0x1

    if-eq p1, v0, :cond_4

    const/4 v1, 0x2

    if-eq p1, v1, :cond_3

    const/4 v1, 0x3

    if-eq p1, v1, :cond_2

    const/4 v1, 0x4

    if-ne p1, v1, :cond_1

    .line 595
    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->postalCodeEditText:Lcom/stripe/android/view/PostalCodeEditText;

    check-cast p1, Lcom/stripe/android/view/StripeEditText;

    goto :goto_0

    .line 591
    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 594
    :cond_2
    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->cvcEditText:Lcom/stripe/android/view/CvcEditText;

    check-cast p1, Lcom/stripe/android/view/StripeEditText;

    goto :goto_0

    .line 593
    :cond_3
    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->expiryDateEditText:Lcom/stripe/android/view/ExpiryDateEditText;

    check-cast p1, Lcom/stripe/android/view/StripeEditText;

    goto :goto_0

    .line 592
    :cond_4
    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    check-cast p1, Lcom/stripe/android/view/StripeEditText;

    .line 596
    :goto_0
    invoke-virtual {p1}, Lcom/stripe/android/view/StripeEditText;->requestFocus()Z

    return v0

    .line 598
    :cond_5
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method protected onLayout(ZIIII)V
    .locals 6

    .line 1027
    invoke-super/range {p0 .. p5}, Landroid/widget/LinearLayout;->onLayout(ZIIII)V

    move-object v0, p0

    .line 1028
    iget-boolean p1, v0, Lcom/stripe/android/view/CardInputWidget;->isViewInitialized:Z

    if-nez p1, :cond_1

    invoke-virtual {p0}, Lcom/stripe/android/view/CardInputWidget;->getWidth()I

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    .line 1029
    iput-boolean p1, v0, Lcom/stripe/android/view/CardInputWidget;->isViewInitialized:Z

    .line 1030
    iget-object p1, v0, Lcom/stripe/android/view/CardInputWidget;->placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

    invoke-direct {p0}, Lcom/stripe/android/view/CardInputWidget;->getFrameWidth()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/stripe/android/view/CardInputWidgetPlacement;->setTotalLengthInPixels$payments_core_release(I)V

    .line 1032
    iget-boolean v1, v0, Lcom/stripe/android/view/CardInputWidget;->isShowingFullCard:Z

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/stripe/android/view/CardInputWidget;->updateSpaceSizes$payments_core_release$default(Lcom/stripe/android/view/CardInputWidget;ZIIILjava/lang/Object;)V

    .line 1035
    iget-object p1, v0, Lcom/stripe/android/view/CardInputWidget;->cardNumberTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    check-cast p1, Landroid/view/View;

    .line 1036
    iget-object p2, v0, Lcom/stripe/android/view/CardInputWidget;->placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

    invoke-virtual {p2}, Lcom/stripe/android/view/CardInputWidgetPlacement;->getCardWidth$payments_core_release()I

    move-result p2

    .line 1037
    iget-boolean p3, v0, Lcom/stripe/android/view/CardInputWidget;->isShowingFullCard:Z

    if-eqz p3, :cond_0

    const/4 p3, 0x0

    goto :goto_0

    .line 1040
    :cond_0
    iget-object p3, v0, Lcom/stripe/android/view/CardInputWidget;->placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

    invoke-virtual {p3}, Lcom/stripe/android/view/CardInputWidgetPlacement;->getHiddenCardWidth$payments_core_release()I

    move-result p3

    mul-int/lit8 p3, p3, -0x1

    .line 1034
    :goto_0
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/view/CardInputWidget;->updateFieldLayout(Landroid/view/View;II)V

    .line 1045
    iget-object p1, v0, Lcom/stripe/android/view/CardInputWidget;->expiryDateTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    check-cast p1, Landroid/view/View;

    .line 1046
    iget-object p2, v0, Lcom/stripe/android/view/CardInputWidget;->placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

    invoke-virtual {p2}, Lcom/stripe/android/view/CardInputWidgetPlacement;->getDateWidth$payments_core_release()I

    move-result p2

    .line 1047
    iget-object p3, v0, Lcom/stripe/android/view/CardInputWidget;->placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

    iget-boolean p4, v0, Lcom/stripe/android/view/CardInputWidget;->isShowingFullCard:Z

    invoke-virtual {p3, p4}, Lcom/stripe/android/view/CardInputWidgetPlacement;->getDateStartMargin$payments_core_release(Z)I

    move-result p3

    .line 1044
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/view/CardInputWidget;->updateFieldLayout(Landroid/view/View;II)V

    .line 1051
    iget-object p1, v0, Lcom/stripe/android/view/CardInputWidget;->cvcNumberTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    check-cast p1, Landroid/view/View;

    .line 1052
    iget-object p2, v0, Lcom/stripe/android/view/CardInputWidget;->placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

    invoke-virtual {p2}, Lcom/stripe/android/view/CardInputWidgetPlacement;->getCvcWidth$payments_core_release()I

    move-result p2

    .line 1053
    iget-object p3, v0, Lcom/stripe/android/view/CardInputWidget;->placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

    iget-boolean p4, v0, Lcom/stripe/android/view/CardInputWidget;->isShowingFullCard:Z

    invoke-virtual {p3, p4}, Lcom/stripe/android/view/CardInputWidgetPlacement;->getCvcStartMargin$payments_core_release(Z)I

    move-result p3

    .line 1050
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/view/CardInputWidget;->updateFieldLayout(Landroid/view/View;II)V

    .line 1057
    iget-object p1, v0, Lcom/stripe/android/view/CardInputWidget;->postalCodeTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    check-cast p1, Landroid/view/View;

    .line 1058
    iget-object p2, v0, Lcom/stripe/android/view/CardInputWidget;->placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

    invoke-virtual {p2}, Lcom/stripe/android/view/CardInputWidgetPlacement;->getPostalCodeWidth$payments_core_release()I

    move-result p2

    .line 1059
    iget-object p3, v0, Lcom/stripe/android/view/CardInputWidget;->placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

    iget-boolean p4, v0, Lcom/stripe/android/view/CardInputWidget;->isShowingFullCard:Z

    invoke-virtual {p3, p4}, Lcom/stripe/android/view/CardInputWidgetPlacement;->getPostalCodeStartMargin$payments_core_release(Z)I

    move-result p3

    .line 1056
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/view/CardInputWidget;->updateFieldLayout(Landroid/view/View;II)V

    :cond_1
    return-void
.end method

.method protected onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 2

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 611
    instance-of v0, p1, Landroid/os/Bundle;

    if-eqz v0, :cond_0

    .line 612
    check-cast p1, Landroid/os/Bundle;

    const-string v0, "state_postal_code_enabled"

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/stripe/android/view/CardInputWidget;->setPostalCodeEnabled(Z)V

    .line 613
    const-string v0, "state_card_viewed"

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/stripe/android/view/CardInputWidget;->isShowingFullCard:Z

    .line 614
    const-string v0, "state_on_behalf_of"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/stripe/android/view/CardInputWidget;->setOnBehalfOf(Ljava/lang/String;)V

    .line 616
    const-string v0, "state_super_state"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void

    .line 618
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void
.end method

.method protected onSaveInstanceState()Landroid/os/Parcelable;
    .locals 3

    const/4 v0, 0x4

    .line 603
    new-array v0, v0, [Lkotlin/Pair;

    const-string v1, "state_super_state"

    invoke-super {p0}, Landroid/widget/LinearLayout;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 604
    iget-boolean v1, p0, Lcom/stripe/android/view/CardInputWidget;->isShowingFullCard:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "state_card_viewed"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 605
    invoke-virtual {p0}, Lcom/stripe/android/view/CardInputWidget;->getPostalCodeEnabled()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "state_postal_code_enabled"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    .line 606
    const-string v1, "state_on_behalf_of"

    iget-object v2, p0, Lcom/stripe/android/view/CardInputWidget;->onBehalfOf:Ljava/lang/String;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    .line 602
    invoke-static {v0}, Landroidx/core/os/BundleKt;->bundleOf([Lkotlin/Pair;)Landroid/os/Bundle;

    move-result-object v0

    check-cast v0, Landroid/os/Parcelable;

    return-object v0
.end method

.method public setCardHint(Ljava/lang/String;)V
    .locals 1

    const-string v0, "cardHint"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 473
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {v0, p1}, Lcom/stripe/android/view/CardNumberEditText;->setHint(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setCardInputListener(Lcom/stripe/android/view/CardInputListener;)V
    .locals 0

    .line 459
    iput-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->cardInputListener:Lcom/stripe/android/view/CardInputListener;

    return-void
.end method

.method public setCardNumber(Ljava/lang/String;)V
    .locals 1

    .line 468
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {v0, p1}, Lcom/stripe/android/view/CardNumberEditText;->setText(Ljava/lang/CharSequence;)V

    .line 469
    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {p1}, Lcom/stripe/android/view/CardNumberEditText;->isCardNumberValid()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    iput-boolean p1, p0, Lcom/stripe/android/view/CardInputWidget;->isShowingFullCard:Z

    return-void
.end method

.method public setCardNumberTextWatcher(Landroid/text/TextWatcher;)V
    .locals 1

    .line 547
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {v0, p1}, Lcom/stripe/android/view/CardNumberEditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-void
.end method

.method public setCardValidCallback(Lcom/stripe/android/view/CardValidCallback;)V
    .locals 3

    .line 441
    iput-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->cardValidCallback:Lcom/stripe/android/view/CardValidCallback;

    .line 442
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->requiredFields:Ljava/util/Set;

    check-cast v0, Ljava/lang/Iterable;

    .line 1328
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/view/StripeEditText;

    .line 442
    iget-object v2, p0, Lcom/stripe/android/view/CardInputWidget;->cardValidTextWatcher:Lcom/stripe/android/view/CardInputWidget$cardValidTextWatcher$1;

    check-cast v2, Landroid/text/TextWatcher;

    invoke-virtual {v1, v2}, Lcom/stripe/android/view/StripeEditText;->removeTextChangedListener(Landroid/text/TextWatcher;)V

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    .line 446
    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->requiredFields:Ljava/util/Set;

    check-cast p1, Ljava/lang/Iterable;

    .line 1330
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/view/StripeEditText;

    .line 446
    iget-object v1, p0, Lcom/stripe/android/view/CardInputWidget;->cardValidTextWatcher:Lcom/stripe/android/view/CardInputWidget$cardValidTextWatcher$1;

    check-cast v1, Landroid/text/TextWatcher;

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/StripeEditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    goto :goto_1

    .line 450
    :cond_1
    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->cardValidCallback:Lcom/stripe/android/view/CardValidCallback;

    if-eqz p1, :cond_2

    invoke-direct {p0}, Lcom/stripe/android/view/CardInputWidget;->getInvalidFields()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    invoke-direct {p0}, Lcom/stripe/android/view/CardInputWidget;->getInvalidFields()Ljava/util/Set;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lcom/stripe/android/view/CardValidCallback;->onInputChanged(ZLjava/util/Set;)V

    :cond_2
    return-void
.end method

.method public setCvcCode(Ljava/lang/String;)V
    .locals 1

    .line 504
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->cvcEditText:Lcom/stripe/android/view/CvcEditText;

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {v0, p1}, Lcom/stripe/android/view/CvcEditText;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setCvcLabel(Ljava/lang/String;)V
    .locals 0

    .line 835
    iput-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->customCvcLabel:Ljava/lang/String;

    .line 836
    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->cardBrandView:Lcom/stripe/android/view/CardBrandView;

    invoke-virtual {p1}, Lcom/stripe/android/view/CardBrandView;->getBrand()Lcom/stripe/android/model/CardBrand;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/stripe/android/view/CardInputWidget;->updateCvc(Lcom/stripe/android/model/CardBrand;)V

    return-void
.end method

.method public setCvcNumberTextWatcher(Landroid/text/TextWatcher;)V
    .locals 1

    .line 561
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->cvcEditText:Lcom/stripe/android/view/CvcEditText;

    invoke-virtual {v0, p1}, Lcom/stripe/android/view/CvcEditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-void
.end method

.method public setEnabled(Z)V
    .locals 2

    .line 540
    invoke-virtual {p0}, Lcom/stripe/android/view/CardInputWidget;->getCurrentFields$payments_core_release()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 1337
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/view/StripeEditText;

    .line 540
    invoke-virtual {v1, p1}, Lcom/stripe/android/view/StripeEditText;->setEnabled(Z)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public setExpiryDate(II)V
    .locals 2

    .line 492
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->expiryDateEditText:Lcom/stripe/android/view/ExpiryDateEditText;

    .line 493
    new-instance v1, Lcom/stripe/android/model/ExpirationDate$Unvalidated;

    invoke-direct {v1, p1, p2}, Lcom/stripe/android/model/ExpirationDate$Unvalidated;-><init>(II)V

    invoke-virtual {v1}, Lcom/stripe/android/model/ExpirationDate$Unvalidated;->getDisplayString()Ljava/lang/String;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    .line 492
    invoke-virtual {v0, p1}, Lcom/stripe/android/view/ExpiryDateEditText;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setExpiryDateTextWatcher(Landroid/text/TextWatcher;)V
    .locals 1

    .line 554
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->expiryDateEditText:Lcom/stripe/android/view/ExpiryDateEditText;

    invoke-virtual {v0, p1}, Lcom/stripe/android/view/ExpiryDateEditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-void
.end method

.method public final setFrameWidthSupplier$payments_core_release(Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 288
    iput-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->frameWidthSupplier:Lkotlin/jvm/functions/Function0;

    return-void
.end method

.method public final setLayoutWidthCalculator$payments_core_release(Lcom/stripe/android/view/CardInputWidget$LayoutWidthCalculator;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 137
    iput-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->layoutWidthCalculator:Lcom/stripe/android/view/CardInputWidget$LayoutWidthCalculator;

    return-void
.end method

.method public final setOnBehalfOf(Ljava/lang/String;)V
    .locals 3

    .line 361
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->onBehalfOf:Ljava/lang/String;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 362
    invoke-virtual {p0}, Lcom/stripe/android/view/CardInputWidget;->isAttachedToWindow()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 363
    move-object v0, p0

    check-cast v0, Landroid/view/View;

    iget-object v1, p0, Lcom/stripe/android/view/CardInputWidget;->viewModelStoreOwner:Landroidx/lifecycle/ViewModelStoreOwner;

    new-instance v2, Lcom/stripe/android/view/CardInputWidget$$ExternalSyntheticLambda6;

    invoke-direct {v2, p1}, Lcom/stripe/android/view/CardInputWidget$$ExternalSyntheticLambda6;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1, v2}, Lcom/stripe/android/view/CardWidgetViewModelKt;->doWithCardWidgetViewModel(Landroid/view/View;Landroidx/lifecycle/ViewModelStoreOwner;Lkotlin/jvm/functions/Function2;)V

    .line 368
    :cond_0
    iput-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->onBehalfOf:Ljava/lang/String;

    :cond_1
    return-void
.end method

.method public final synthetic setPostalCode$payments_core_release(Ljava/lang/String;)V
    .locals 1

    .line 509
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->postalCodeEditText:Lcom/stripe/android/view/PostalCodeEditText;

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {v0, p1}, Lcom/stripe/android/view/PostalCodeEditText;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setPostalCodeEnabled(Z)V
    .locals 3

    .line 296
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->postalCodeEnabled$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/stripe/android/view/CardInputWidget;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/ReadWriteProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    return-void
.end method

.method public final setPostalCodeRequired(Z)V
    .locals 3

    .line 328
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->postalCodeRequired$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/stripe/android/view/CardInputWidget;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/ReadWriteProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    return-void
.end method

.method public setPostalCodeTextWatcher(Landroid/text/TextWatcher;)V
    .locals 1

    .line 568
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->postalCodeEditText:Lcom/stripe/android/view/PostalCodeEditText;

    invoke-virtual {v0, p1}, Lcom/stripe/android/view/PostalCodeEditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-void
.end method

.method public final setPreferredNetworks(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/model/CardBrand;",
            ">;)V"
        }
    .end annotation

    const-string v0, "preferredNetworks"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 520
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->cardBrandView:Lcom/stripe/android/view/CardBrandView;

    invoke-virtual {v0, p1}, Lcom/stripe/android/view/CardBrandView;->setMerchantPreferredNetworks(Ljava/util/List;)V

    return-void
.end method

.method public final setShowingFullCard$payments_core_release(Z)V
    .locals 0

    .line 132
    iput-boolean p1, p0, Lcom/stripe/android/view/CardInputWidget;->isShowingFullCard:Z

    return-void
.end method

.method public final setUsZipCodeRequired(Z)V
    .locals 3

    .line 340
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->usZipCodeRequired$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/stripe/android/view/CardInputWidget;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x2

    aget-object v1, v1, v2

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/ReadWriteProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    return-void
.end method

.method public final setViewModelStoreOwner$payments_core_release(Landroidx/lifecycle/ViewModelStoreOwner;)V
    .locals 0

    .line 181
    iput-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->viewModelStoreOwner:Landroidx/lifecycle/ViewModelStoreOwner;

    return-void
.end method

.method public final updateSpaceSizes$payments_core_release(ZII)V
    .locals 3

    if-nez p2, :cond_0

    return-void

    .line 643
    :cond_0
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

    .line 645
    iget-object v1, p0, Lcom/stripe/android/view/CardInputWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    check-cast v1, Lcom/stripe/android/view/StripeEditText;

    .line 643
    const-string v2, "4242 4242 4242 4242 424"

    invoke-direct {p0, v2, v1}, Lcom/stripe/android/view/CardInputWidget;->getDesiredWidthInPixels(Ljava/lang/String;Lcom/stripe/android/view/StripeEditText;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/CardInputWidgetPlacement;->setCardWidth$payments_core_release(I)V

    .line 648
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

    .line 650
    iget-object v1, p0, Lcom/stripe/android/view/CardInputWidget;->expiryDateEditText:Lcom/stripe/android/view/ExpiryDateEditText;

    check-cast v1, Lcom/stripe/android/view/StripeEditText;

    .line 648
    const-string v2, "MM/MM"

    invoke-direct {p0, v2, v1}, Lcom/stripe/android/view/CardInputWidget;->getDesiredWidthInPixels(Ljava/lang/String;Lcom/stripe/android/view/StripeEditText;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/CardInputWidgetPlacement;->setDateWidth$payments_core_release(I)V

    .line 653
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

    .line 654
    iget-object v1, p0, Lcom/stripe/android/view/CardInputWidget;->hiddenCardText:Ljava/lang/String;

    .line 655
    iget-object v2, p0, Lcom/stripe/android/view/CardInputWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    check-cast v2, Lcom/stripe/android/view/StripeEditText;

    .line 653
    invoke-direct {p0, v1, v2}, Lcom/stripe/android/view/CardInputWidget;->getDesiredWidthInPixels(Ljava/lang/String;Lcom/stripe/android/view/StripeEditText;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/CardInputWidgetPlacement;->setHiddenCardWidth$payments_core_release(I)V

    .line 658
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

    .line 659
    invoke-direct {p0}, Lcom/stripe/android/view/CardInputWidget;->getCvcPlaceHolder()Ljava/lang/String;

    move-result-object v1

    .line 660
    iget-object v2, p0, Lcom/stripe/android/view/CardInputWidget;->cvcEditText:Lcom/stripe/android/view/CvcEditText;

    check-cast v2, Lcom/stripe/android/view/StripeEditText;

    .line 658
    invoke-direct {p0, v1, v2}, Lcom/stripe/android/view/CardInputWidget;->getDesiredWidthInPixels(Ljava/lang/String;Lcom/stripe/android/view/StripeEditText;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/CardInputWidgetPlacement;->setCvcWidth$payments_core_release(I)V

    .line 663
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

    .line 665
    iget-object v1, p0, Lcom/stripe/android/view/CardInputWidget;->postalCodeEditText:Lcom/stripe/android/view/PostalCodeEditText;

    check-cast v1, Lcom/stripe/android/view/StripeEditText;

    .line 663
    const-string v2, "1234567890"

    invoke-direct {p0, v2, v1}, Lcom/stripe/android/view/CardInputWidget;->getDesiredWidthInPixels(Ljava/lang/String;Lcom/stripe/android/view/StripeEditText;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/CardInputWidgetPlacement;->setPostalCodeWidth$payments_core_release(I)V

    .line 668
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

    .line 669
    invoke-direct {p0}, Lcom/stripe/android/view/CardInputWidget;->getPeekCardText()Ljava/lang/String;

    move-result-object v1

    .line 670
    iget-object v2, p0, Lcom/stripe/android/view/CardInputWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    check-cast v2, Lcom/stripe/android/view/StripeEditText;

    .line 668
    invoke-direct {p0, v1, v2}, Lcom/stripe/android/view/CardInputWidget;->getDesiredWidthInPixels(Ljava/lang/String;Lcom/stripe/android/view/StripeEditText;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/CardInputWidgetPlacement;->setPeekCardWidth$payments_core_release(I)V

    .line 673
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

    invoke-virtual {p0}, Lcom/stripe/android/view/CardInputWidget;->getPostalCodeEnabled()Z

    move-result v1

    invoke-virtual {v0, p1, v1, p3, p2}, Lcom/stripe/android/view/CardInputWidgetPlacement;->updateSpacing$payments_core_release(ZZII)V

    return-void
.end method
