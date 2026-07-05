.class public final Lcom/qonversion/android/sdk/internal/QProductCenterManager;
.super Ljava/lang/Object;
.source "QProductCenterManager.kt"

# interfaces
.implements Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$PurchasesListener;
.implements Lcom/qonversion/android/sdk/internal/provider/UserStateProvider;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nQProductCenterManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QProductCenterManager.kt\ncom/qonversion/android/sdk/internal/QProductCenterManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 5 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 6 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,1124:1\n1#2:1125\n1#2:1142\n1855#3,2:1126\n1855#3,2:1128\n1855#3,2:1130\n1603#3,9:1132\n1855#3:1141\n1856#3:1143\n1612#3:1144\n1855#3,2:1163\n1855#3,2:1165\n1855#3:1167\n1194#3,2:1168\n1222#3,4:1170\n1856#3:1174\n1855#3,2:1175\n1855#3,2:1177\n1855#3,2:1179\n1855#3,2:1184\n1855#3,2:1186\n988#4:1145\n1017#4,3:1146\n1020#4,3:1156\n372#5,7:1149\n125#6:1159\n152#6,3:1160\n553#6,3:1181\n*S KotlinDebug\n*F\n+ 1 QProductCenterManager.kt\ncom/qonversion/android/sdk/internal/QProductCenterManager\n*L\n544#1:1142\n286#1:1126,2\n449#1:1128,2\n455#1:1130,2\n544#1:1132,9\n544#1:1141\n544#1:1143\n544#1:1144\n621#1:1163,2\n832#1:1165,2\n867#1:1167\n870#1:1168,2\n870#1:1170,4\n867#1:1174\n907#1:1175,2\n922#1:1177,2\n946#1:1179,2\n1003#1:1184,2\n1121#1:1186,2\n573#1:1145\n573#1:1146,3\n573#1:1156,3\n573#1:1149,7\n574#1:1159\n574#1:1160,3\n978#1:1181,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00ce\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010\u001e\n\u0002\u0008\u0012\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0000\u0018\u00002\u00020\u00012\u00020\u0002B_\u0008\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u00a2\u0006\u0002\u0010\u0019J\u001a\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020\u001b2\u0008\u0010J\u001a\u0004\u0018\u000103H\u0002J\"\u0010K\u001a\u00020H2\u0006\u0010L\u001a\u00020@2\u0008\u0010M\u001a\u0004\u0018\u00010D2\u0006\u0010N\u001a\u000200H\u0002J\u001e\u0010O\u001a\u00020H2\u000c\u0010P\u001a\u0008\u0012\u0004\u0012\u00020Q0?2\u0006\u0010R\u001a\u000200H\u0002J\u000e\u0010S\u001a\u00020H2\u0006\u0010J\u001a\u00020\'J\u001c\u0010T\u001a\u00020H2\u000c\u0010U\u001a\u0008\u0012\u0004\u0012\u00020\u001b0?2\u0006\u0010J\u001a\u00020VJ\u001a\u0010W\u001a\u00020X2\u0008\u0010Y\u001a\u0004\u0018\u00010X2\u0006\u0010Z\u001a\u00020XH\u0002J\u0018\u0010[\u001a\u00020H2\u0006\u0010J\u001a\u00020\\2\u0006\u0010]\u001a\u00020^H\u0002J\"\u0010_\u001a\u0004\u0018\u00010X2\u0006\u0010`\u001a\u00020\u001b2\u0006\u0010a\u001a\u00020)2\u0006\u0010b\u001a\u00020cH\u0002J\u0014\u0010d\u001a\u00020H2\n\u0008\u0002\u0010e\u001a\u0004\u0018\u000100H\u0002J\u0010\u0010f\u001a\u00020H2\u0006\u0010J\u001a\u00020gH\u0002J\u0014\u0010h\u001a\u00020H2\n\u0008\u0002\u0010i\u001a\u0004\u0018\u000100H\u0002J\u0010\u0010j\u001a\u00020H2\u0006\u0010k\u001a\u000200H\u0002J\u001c\u0010l\u001a\u00020H2\u0012\u0010m\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020o0nH\u0002J\u001a\u0010p\u001a\u00020H2\u0008\u0010J\u001a\u0004\u0018\u00010D2\u0006\u0010k\u001a\u000200H\u0002J\u0010\u0010q\u001a\u00020H2\u0006\u0010k\u001a\u000200H\u0002J\u0018\u0010r\u001a\u00020H2\u0006\u0010I\u001a\u00020\u001b2\u0006\u0010k\u001a\u000200H\u0002J\u0010\u0010s\u001a\u00020H2\u0006\u0010I\u001a\u00020\u001bH\u0002J\u001e\u0010t\u001a\u00020H2\u000c\u0010u\u001a\u0008\u0012\u0004\u0012\u00020B0?2\u0006\u0010k\u001a\u000200H\u0002J\u0012\u0010v\u001a\u00020\\2\u0008\u0010J\u001a\u0004\u0018\u00010\\H\u0002J\n\u0010w\u001a\u0004\u0018\u00010xH\u0002J(\u0010y\u001a\u0004\u0018\u00010c2\u0008\u0010z\u001a\u0004\u0018\u00010\u001b2\u0012\u0010{\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020c0nH\u0002J\u000e\u0010|\u001a\u00020H2\u0006\u0010J\u001a\u000203J\u001e\u0010}\u001a\u00020\\2\u000c\u0010~\u001a\u0008\u0012\u0004\u0012\u00020@0?2\u0006\u0010\u007f\u001a\u00020\\H\u0002J@\u0010\u0080\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020X0n2\u0006\u0010L\u001a\u00020@2\u0006\u0010b\u001a\u00020c2\u0019\u0010\u0081\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u001b\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001b0?0nH\u0002JN\u0010\u0082\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020X0n2\r\u0010\u0083\u0001\u001a\u0008\u0012\u0004\u0012\u00020Q0?2\r\u0010{\u001a\t\u0012\u0004\u0012\u00020c0\u0084\u00012\u0019\u0010\u0081\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u001b\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001b0?0nH\u0002J\t\u0010\u0085\u0001\u001a\u00020HH\u0002J\t\u0010\u0086\u0001\u001a\u00020HH\u0002J\t\u0010\u0087\u0001\u001a\u00020HH\u0002J\u0016\u0010\u0088\u0001\u001a\u00020H2\u000b\u0008\u0002\u0010\u0089\u0001\u001a\u0004\u0018\u000100H\u0002J\u0018\u0010\u008a\u0001\u001a\u00020H2\r\u0010\u008b\u0001\u001a\u0008\u0012\u0004\u0012\u00020@0?H\u0002J\u001b\u0010\u008c\u0001\u001a\u00020H2\u0006\u0010I\u001a\u00020\u001b2\n\u0008\u0002\u0010J\u001a\u0004\u0018\u000103J\u001b\u0010\u008d\u0001\u001a\u00020H2\u0006\u0010]\u001a\u00020^2\n\u0008\u0002\u0010J\u001a\u0004\u0018\u00010\\J\u000f\u0010\u008e\u0001\u001a\u00020H2\u0006\u0010J\u001a\u00020BJ\t\u0010\u008f\u0001\u001a\u00020HH\u0002J\u0007\u0010\u0090\u0001\u001a\u00020HJ$\u0010\u0091\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020X0n2\r\u0010\u0092\u0001\u001a\u0008\u0012\u0004\u0012\u00020X0?H\u0002J\u000f\u0010\u0093\u0001\u001a\u00020H2\u0006\u0010J\u001a\u00020gJ\u0007\u0010\u0094\u0001\u001a\u00020HJ\u0018\u0010\u0095\u0001\u001a\u00020H2\r\u0010\u008b\u0001\u001a\u0008\u0012\u0004\u0012\u00020@0?H\u0016J!\u0010\u0096\u0001\u001a\u00020H2\u0007\u0010k\u001a\u00030\u0097\u00012\r\u0010\u008b\u0001\u001a\u0008\u0012\u0004\u0012\u00020@0?H\u0016J]\u0010\u0098\u0001\u001a\u00020H22\u0010\u0099\u0001\u001a-\u0012\"\u0012 \u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020X0n\u00a2\u0006\u000f\u0008\u009b\u0001\u0012\n\u0008\u009c\u0001\u0012\u0005\u0008\u0008(\u009d\u0001\u0012\u0004\u0012\u00020H0\u009a\u00012\u0014\u0010\u009e\u0001\u001a\u000f\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020H0\u009a\u00012\u0008\u0010k\u001a\u0004\u0018\u000100H\u0002J\u0011\u0010\u009f\u0001\u001a\u00020H2\u0006\u0010I\u001a\u00020\u001bH\u0002J\u0012\u0010\u00a0\u0001\u001a\u00020H2\u0007\u0010\u00a1\u0001\u001a\u000205H\u0002J\t\u0010\u00a2\u0001\u001a\u00020HH\u0002J$\u0010\u00a3\u0001\u001a\u00020H2\u0007\u0010\u0003\u001a\u00030\u00a4\u00012\u0008\u0010\u00a5\u0001\u001a\u00030\u00a6\u00012\u0006\u0010J\u001a\u00020DH\u0002J\"\u0010\u00a7\u0001\u001a\u00020H2\u0007\u0010\u0003\u001a\u00030\u00a4\u00012\u0008\u0010\u00a5\u0001\u001a\u00030\u00a8\u00012\u0006\u0010J\u001a\u00020DJ\u0013\u0010\u00a9\u0001\u001a\u00020H2\u0008\u0010z\u001a\u0004\u0018\u00010\u001bH\u0002J\u001b\u0010\u00aa\u0001\u001a\u00020H2\u0006\u0010]\u001a\u00020^2\n\u0008\u0002\u0010J\u001a\u0004\u0018\u00010\'J>\u0010\u00ab\u0001\u001a\u00020H2\u0015\u0010\u0099\u0001\u001a\u0010\u0012\u0005\u0012\u00030\u00ac\u0001\u0012\u0004\u0012\u00020H0\u009a\u00012\u0014\u0010\u009e\u0001\u001a\u000f\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020H0\u009a\u00012\u0006\u0010]\u001a\u00020^H\u0002J\u0011\u0010\u00ad\u0001\u001a\u00020H2\u0008\u0010\u00ae\u0001\u001a\u00030\u00af\u0001J\u0011\u0010\u00b0\u0001\u001a\u00020+2\u0006\u0010k\u001a\u000200H\u0002J&\u0010\u00b1\u0001\u001a\u00020H2\u0006\u0010L\u001a\u00020@2\u0008\u0010\u00b2\u0001\u001a\u00030\u00b3\u00012\t\u0010\u00b4\u0001\u001a\u0004\u0018\u00010cH\u0002J\u0007\u0010\u00b5\u0001\u001a\u00020HJ$\u0010\u00b6\u0001\u001a\u00020H2\u0007\u0010\u0003\u001a\u00030\u00a4\u00012\u0008\u0010\u00a5\u0001\u001a\u00030\u00a8\u00012\u0006\u0010J\u001a\u00020DH\u0002J\u0013\u0010\u00b7\u0001\u001a\u00020H2\u0008\u0010\u00b8\u0001\u001a\u00030\u00ac\u0001H\u0002J\u001f\u0010\u00b9\u0001\u001a\u00020H2\t\u0010\u00ba\u0001\u001a\u0004\u0018\u0001092\t\u0010\u00bb\u0001\u001a\u0004\u0018\u00010\u001bH\u0002R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001d8F@FX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001f\u0010 \"\u0004\u0008!\u0010\"R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010%\u001a\u0008\u0012\u0004\u0012\u00020\'0&X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010*\u001a\u00020+8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008*\u0010,R\u000e\u0010-\u001a\u00020+X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010.\u001a\u00020+8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008.\u0010,R\u0010\u0010/\u001a\u0004\u0018\u000100X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u00101\u001a\u0014\u0012\u0004\u0012\u00020\u001b\u0012\n\u0012\u0008\u0012\u0004\u0012\u0002030&02X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u00104\u001a\u0004\u0018\u000105X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u00106\u001a\u0004\u0018\u00010\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u00107\u001a\u0004\u0018\u00010\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\'\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u000209028BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008<\u0010=\u001a\u0004\u0008:\u0010;R\u0014\u0010>\u001a\u0008\u0012\u0004\u0012\u00020@0?X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010A\u001a\u0008\u0012\u0004\u0012\u00020B0&X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020D02X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010E\u001a\u0008\u0012\u0004\u0012\u00020\'0&X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020+X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u00bc\u0001"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/QProductCenterManager;",
        "Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$PurchasesListener;",
        "Lcom/qonversion/android/sdk/internal/provider/UserStateProvider;",
        "context",
        "Landroid/app/Application;",
        "repository",
        "Lcom/qonversion/android/sdk/internal/repository/QRepository;",
        "logger",
        "Lcom/qonversion/android/sdk/internal/logger/Logger;",
        "purchasesCache",
        "Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;",
        "handledPurchasesCache",
        "Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache;",
        "launchResultCache",
        "Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;",
        "userInfoService",
        "Lcom/qonversion/android/sdk/internal/services/QUserInfoService;",
        "identityManager",
        "Lcom/qonversion/android/sdk/internal/QIdentityManager;",
        "internalConfig",
        "Lcom/qonversion/android/sdk/internal/InternalConfig;",
        "appStateProvider",
        "Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;",
        "remoteConfigManager",
        "Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;",
        "(Landroid/app/Application;Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/internal/logger/Logger;Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache;Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;Lcom/qonversion/android/sdk/internal/services/QUserInfoService;Lcom/qonversion/android/sdk/internal/QIdentityManager;Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;)V",
        "advertisingID",
        "",
        "<set-?>",
        "Lcom/qonversion/android/sdk/internal/billing/BillingService;",
        "billingService",
        "getBillingService",
        "()Lcom/qonversion/android/sdk/internal/billing/BillingService;",
        "setBillingService",
        "(Lcom/qonversion/android/sdk/internal/billing/BillingService;)V",
        "converter",
        "Lcom/qonversion/android/sdk/internal/converter/PurchaseConverter;",
        "entitlementCallbacks",
        "",
        "Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;",
        "installDate",
        "",
        "isLaunchingFinished",
        "",
        "()Z",
        "isRestoreInProgress",
        "isUserStable",
        "launchError",
        "Lcom/qonversion/android/sdk/dto/QonversionError;",
        "pendingIdentityCallbacks",
        "",
        "Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;",
        "pendingInitRequestData",
        "Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;",
        "pendingPartnersIdentityId",
        "processingPartnersIdentityId",
        "processingPurchaseOptions",
        "Lcom/qonversion/android/sdk/dto/QPurchaseOptions;",
        "getProcessingPurchaseOptions",
        "()Ljava/util/Map;",
        "processingPurchaseOptions$delegate",
        "Lkotlin/Lazy;",
        "processingPurchases",
        "",
        "Lcom/android/billingclient/api/Purchase;",
        "productsCallbacks",
        "Lcom/qonversion/android/sdk/listeners/QonversionProductsCallback;",
        "purchasingCallbacks",
        "Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;",
        "restoreCallbacks",
        "unhandledLogoutAvailable",
        "addIdentityCallback",
        "",
        "identityId",
        "callback",
        "calculatePurchasePermissionsLocally",
        "purchase",
        "purchaseCallback",
        "purchaseError",
        "calculateRestorePermissionsLocally",
        "purchaseHistoryRecords",
        "Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;",
        "restoreError",
        "checkEntitlements",
        "checkTrialIntroEligibilityForProductIds",
        "productIds",
        "Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;",
        "choosePermissionToSave",
        "Lcom/qonversion/android/sdk/internal/dto/QPermission;",
        "existingPermission",
        "localCreatedPermission",
        "continueLaunchWithPurchasesInfo",
        "Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;",
        "requestTrigger",
        "Lcom/qonversion/android/sdk/internal/api/RequestTrigger;",
        "createPermission",
        "id",
        "purchaseTime",
        "purchasedProduct",
        "Lcom/qonversion/android/sdk/dto/products/QProduct;",
        "executeEntitlementsBlock",
        "actualError",
        "executeOfferingCallback",
        "Lcom/qonversion/android/sdk/listeners/QonversionOfferingsCallback;",
        "executeProductsBlocks",
        "loadStoreProductsError",
        "executeRestoreBlocksOnError",
        "error",
        "executeRestoreBlocksOnSuccess",
        "entitlements",
        "",
        "Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;",
        "failLocallyGrantingPurchasePermissionsWithError",
        "failLocallyGrantingRestorePermissionsWithError",
        "fireIdentityError",
        "fireIdentitySuccess",
        "fireProductsFailure",
        "callbacks",
        "getLaunchCallback",
        "getOfferings",
        "Lcom/qonversion/android/sdk/dto/offerings/QOfferings;",
        "getProductForPurchase",
        "productId",
        "products",
        "getUserInfo",
        "getWrappedPurchasesCallback",
        "trackingPurchases",
        "outerCallback",
        "grantPermissionsAfterFailedPurchaseTracking",
        "productPermissions",
        "grantPermissionsAfterFailedRestore",
        "historyRecords",
        "",
        "handleCachedPurchases",
        "handleLogout",
        "handlePendingPurchases",
        "handlePendingRequests",
        "lastError",
        "handlePurchases",
        "purchases",
        "identify",
        "launch",
        "loadProducts",
        "loadStoreProductsIfPossible",
        "logout",
        "mergeManuallyCreatedPermissions",
        "newPermissions",
        "offerings",
        "onAppForeground",
        "onPurchasesCompleted",
        "onPurchasesFailed",
        "Lcom/qonversion/android/sdk/internal/billing/BillingError;",
        "preparePermissionsResult",
        "onSuccess",
        "Lkotlin/Function1;",
        "Lkotlin/ParameterName;",
        "name",
        "permissions",
        "onError",
        "processIdentity",
        "processInit",
        "initRequestData",
        "processPendingInitIfAvailable",
        "processPurchase",
        "Landroid/app/Activity;",
        "purchaseModel",
        "Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;",
        "purchaseProduct",
        "Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;",
        "removePurchaseOptions",
        "restore",
        "retryLaunch",
        "Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;",
        "setEntitlementsUpdateListener",
        "entitlementsUpdateListener",
        "Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;",
        "shouldCalculatePermissionsLocally",
        "storeFailedPurchaseIfNecessary",
        "purchaseInfo",
        "Lcom/qonversion/android/sdk/internal/purchase/Purchase;",
        "product",
        "syncPurchases",
        "tryToPurchase",
        "updateLaunchResult",
        "launchResult",
        "updatePurchaseOptions",
        "options",
        "storeProductId",
        "sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private advertisingID:Ljava/lang/String;

.field private final appStateProvider:Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;

.field public volatile billingService:Lcom/qonversion/android/sdk/internal/billing/BillingService;

.field private final context:Landroid/app/Application;

.field private converter:Lcom/qonversion/android/sdk/internal/converter/PurchaseConverter;

.field private entitlementCallbacks:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;",
            ">;"
        }
    .end annotation
.end field

.field private final handledPurchasesCache:Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache;

.field private final identityManager:Lcom/qonversion/android/sdk/internal/QIdentityManager;

.field private installDate:J

.field private final internalConfig:Lcom/qonversion/android/sdk/internal/InternalConfig;

.field private isRestoreInProgress:Z

.field private launchError:Lcom/qonversion/android/sdk/dto/QonversionError;

.field private final launchResultCache:Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;

.field private final logger:Lcom/qonversion/android/sdk/internal/logger/Logger;

.field private pendingIdentityCallbacks:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;",
            ">;>;"
        }
    .end annotation
.end field

.field private pendingInitRequestData:Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;

.field private pendingPartnersIdentityId:Ljava/lang/String;

.field private processingPartnersIdentityId:Ljava/lang/String;

.field private final processingPurchaseOptions$delegate:Lkotlin/Lazy;

.field private processingPurchases:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lcom/android/billingclient/api/Purchase;",
            ">;"
        }
    .end annotation
.end field

.field private productsCallbacks:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/listeners/QonversionProductsCallback;",
            ">;"
        }
    .end annotation
.end field

.field private final purchasesCache:Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;

.field private purchasingCallbacks:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;",
            ">;"
        }
    .end annotation
.end field

.field private final remoteConfigManager:Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;

.field private final repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;

.field private restoreCallbacks:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;",
            ">;"
        }
    .end annotation
.end field

.field private unhandledLogoutAvailable:Z

.field private final userInfoService:Lcom/qonversion/android/sdk/internal/services/QUserInfoService;


# direct methods
.method public constructor <init>(Landroid/app/Application;Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/internal/logger/Logger;Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache;Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;Lcom/qonversion/android/sdk/internal/services/QUserInfoService;Lcom/qonversion/android/sdk/internal/QIdentityManager;Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "repository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "purchasesCache"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "handledPurchasesCache"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "launchResultCache"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userInfoService"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "identityManager"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "internalConfig"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appStateProvider"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "remoteConfigManager"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->context:Landroid/app/Application;

    .line 57
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;

    .line 58
    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->logger:Lcom/qonversion/android/sdk/internal/logger/Logger;

    .line 59
    iput-object p4, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->purchasesCache:Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;

    .line 60
    iput-object p5, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->handledPurchasesCache:Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache;

    .line 61
    iput-object p6, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->launchResultCache:Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;

    .line 62
    iput-object p7, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->userInfoService:Lcom/qonversion/android/sdk/internal/services/QUserInfoService;

    .line 63
    iput-object p8, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->identityManager:Lcom/qonversion/android/sdk/internal/QIdentityManager;

    .line 64
    iput-object p9, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->internalConfig:Lcom/qonversion/android/sdk/internal/InternalConfig;

    .line 65
    iput-object p10, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->appStateProvider:Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;

    .line 66
    iput-object p11, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->remoteConfigManager:Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;

    .line 82
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    check-cast p2, Ljava/util/List;

    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->productsCallbacks:Ljava/util/List;

    .line 83
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    check-cast p2, Ljava/util/List;

    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->entitlementCallbacks:Ljava/util/List;

    .line 84
    new-instance p2, Ljava/util/LinkedHashMap;

    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast p2, Ljava/util/Map;

    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->purchasingCallbacks:Ljava/util/Map;

    .line 85
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    check-cast p2, Ljava/util/List;

    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->restoreCallbacks:Ljava/util/List;

    .line 89
    new-instance p2, Ljava/util/LinkedHashMap;

    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast p2, Ljava/util/Map;

    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->pendingIdentityCallbacks:Ljava/util/Map;

    .line 96
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->processingPurchases:Ljava/util/List;

    .line 98
    new-instance p2, Lcom/qonversion/android/sdk/internal/converter/GooglePurchaseConverter;

    invoke-direct {p2}, Lcom/qonversion/android/sdk/internal/converter/GooglePurchaseConverter;-><init>()V

    check-cast p2, Lcom/qonversion/android/sdk/internal/converter/PurchaseConverter;

    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->converter:Lcom/qonversion/android/sdk/internal/converter/PurchaseConverter;

    .line 100
    new-instance p2, Lcom/qonversion/android/sdk/internal/QProductCenterManager$processingPurchaseOptions$2;

    invoke-direct {p2, p0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager$processingPurchaseOptions$2;-><init>(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)V

    check-cast p2, Lkotlin/jvm/functions/Function0;

    invoke-static {p2}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p2

    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->processingPurchaseOptions$delegate:Lkotlin/Lazy;

    .line 110
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p3, 0x21

    if-lt p2, p3, :cond_0

    .line 111
    invoke-virtual {p1}, Landroid/app/Application;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p2

    .line 112
    invoke-virtual {p1}, Landroid/app/Application;->getPackageName()Ljava/lang/String;

    move-result-object p1

    const-wide/16 p3, 0x80

    .line 113
    invoke-static {p3, p4}, Landroid/content/pm/PackageManager$PackageInfoFlags;->of(J)Landroid/content/pm/PackageManager$PackageInfoFlags;

    move-result-object p3

    .line 111
    invoke-virtual {p2, p1, p3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;Landroid/content/pm/PackageManager$PackageInfoFlags;)Landroid/content/pm/PackageInfo;

    move-result-object p1

    goto :goto_0

    .line 117
    :cond_0
    invoke-virtual {p1}, Landroid/app/Application;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p2

    invoke-virtual {p1}, Landroid/app/Application;->getPackageName()Ljava/lang/String;

    move-result-object p1

    const/16 p3, 0x80

    invoke-virtual {p2, p1, p3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p1

    .line 119
    :goto_0
    iget-wide p1, p1, Landroid/content/pm/PackageInfo;->firstInstallTime:J

    invoke-static {p1, p2}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->milliSecondsToSeconds(J)J

    move-result-wide p1

    iput-wide p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->installDate:J

    return-void
.end method

.method public static final synthetic access$calculatePurchasePermissionsLocally(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/android/billingclient/api/Purchase;Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;Lcom/qonversion/android/sdk/dto/QonversionError;)V
    .locals 0

    .line 54
    invoke-direct {p0, p1, p2, p3}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->calculatePurchasePermissionsLocally(Lcom/android/billingclient/api/Purchase;Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;Lcom/qonversion/android/sdk/dto/QonversionError;)V

    return-void
.end method

.method public static final synthetic access$calculateRestorePermissionsLocally(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ljava/util/List;Lcom/qonversion/android/sdk/dto/QonversionError;)V
    .locals 0

    .line 54
    invoke-direct {p0, p1, p2}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->calculateRestorePermissionsLocally(Ljava/util/List;Lcom/qonversion/android/sdk/dto/QonversionError;)V

    return-void
.end method

.method public static final synthetic access$continueLaunchWithPurchasesInfo(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;)V
    .locals 0

    .line 54
    invoke-direct {p0, p1, p2}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->continueLaunchWithPurchasesInfo(Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;)V

    return-void
.end method

.method public static final synthetic access$continueLaunchWithPurchasesInfo$processInitDefault(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;)V
    .locals 0

    .line 54
    invoke-static {p0, p1, p2}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->continueLaunchWithPurchasesInfo$processInitDefault(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;)V

    return-void
.end method

.method public static final synthetic access$createPermission(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ljava/lang/String;JLcom/qonversion/android/sdk/dto/products/QProduct;)Lcom/qonversion/android/sdk/internal/dto/QPermission;
    .locals 0

    .line 54
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->createPermission(Ljava/lang/String;JLcom/qonversion/android/sdk/dto/products/QProduct;)Lcom/qonversion/android/sdk/internal/dto/QPermission;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$executeEntitlementsBlock(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/dto/QonversionError;)V
    .locals 0

    .line 54
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->executeEntitlementsBlock(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    return-void
.end method

.method public static final synthetic access$executeOfferingCallback(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/listeners/QonversionOfferingsCallback;)V
    .locals 0

    .line 54
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->executeOfferingCallback(Lcom/qonversion/android/sdk/listeners/QonversionOfferingsCallback;)V

    return-void
.end method

.method public static final synthetic access$executeProductsBlocks(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/dto/QonversionError;)V
    .locals 0

    .line 54
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->executeProductsBlocks(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    return-void
.end method

.method public static final synthetic access$executeRestoreBlocksOnError(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/dto/QonversionError;)V
    .locals 0

    .line 54
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->executeRestoreBlocksOnError(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    return-void
.end method

.method public static final synthetic access$executeRestoreBlocksOnSuccess(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ljava/util/Map;)V
    .locals 0

    .line 54
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->executeRestoreBlocksOnSuccess(Ljava/util/Map;)V

    return-void
.end method

.method public static final synthetic access$fireIdentityError(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QonversionError;)V
    .locals 0

    .line 54
    invoke-direct {p0, p1, p2}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->fireIdentityError(Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QonversionError;)V

    return-void
.end method

.method public static final synthetic access$fireIdentitySuccess(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ljava/lang/String;)V
    .locals 0

    .line 54
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->fireIdentitySuccess(Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic access$getAdvertisingID$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)Ljava/lang/String;
    .locals 0

    .line 54
    iget-object p0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->advertisingID:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$getConverter$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)Lcom/qonversion/android/sdk/internal/converter/PurchaseConverter;
    .locals 0

    .line 54
    iget-object p0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->converter:Lcom/qonversion/android/sdk/internal/converter/PurchaseConverter;

    return-object p0
.end method

.method public static final synthetic access$getHandledPurchasesCache$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache;
    .locals 0

    .line 54
    iget-object p0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->handledPurchasesCache:Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache;

    return-object p0
.end method

.method public static final synthetic access$getInstallDate$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)J
    .locals 2

    .line 54
    iget-wide v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->installDate:J

    return-wide v0
.end method

.method public static final synthetic access$getInternalConfig$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)Lcom/qonversion/android/sdk/internal/InternalConfig;
    .locals 0

    .line 54
    iget-object p0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->internalConfig:Lcom/qonversion/android/sdk/internal/InternalConfig;

    return-object p0
.end method

.method public static final synthetic access$getLaunchResultCache$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;
    .locals 0

    .line 54
    iget-object p0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->launchResultCache:Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;

    return-object p0
.end method

.method public static final synthetic access$getProcessingPurchaseOptions(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)Ljava/util/Map;
    .locals 0

    .line 54
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->getProcessingPurchaseOptions()Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getProcessingPurchases$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)Ljava/util/List;
    .locals 0

    .line 54
    iget-object p0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->processingPurchases:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic access$getPurchasesCache$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;
    .locals 0

    .line 54
    iget-object p0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->purchasesCache:Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;

    return-object p0
.end method

.method public static final synthetic access$getRemoteConfigManager$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;
    .locals 0

    .line 54
    iget-object p0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->remoteConfigManager:Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;

    return-object p0
.end method

.method public static final synthetic access$getRepository$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)Lcom/qonversion/android/sdk/internal/repository/QRepository;
    .locals 0

    .line 54
    iget-object p0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;

    return-object p0
.end method

.method public static final synthetic access$getWrappedPurchasesCallback(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ljava/util/List;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;)Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;
    .locals 0

    .line 54
    invoke-direct {p0, p1, p2}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->getWrappedPurchasesCallback(Ljava/util/List;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;)Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$handleCachedPurchases(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)V
    .locals 0

    .line 54
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->handleCachedPurchases()V

    return-void
.end method

.method public static final synthetic access$handlePendingRequests(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/dto/QonversionError;)V
    .locals 0

    .line 54
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->handlePendingRequests(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    return-void
.end method

.method public static final synthetic access$handlePurchases(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ljava/util/List;)V
    .locals 0

    .line 54
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->handlePurchases(Ljava/util/List;)V

    return-void
.end method

.method public static final synthetic access$loadStoreProductsIfPossible(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)V
    .locals 0

    .line 54
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->loadStoreProductsIfPossible()V

    return-void
.end method

.method public static final synthetic access$processIdentity(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ljava/lang/String;)V
    .locals 0

    .line 54
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->processIdentity(Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic access$processInit(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;)V
    .locals 0

    .line 54
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->processInit(Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;)V

    return-void
.end method

.method public static final synthetic access$purchaseProduct$tryToPurchase(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Landroid/app/Activity;Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;)V
    .locals 0

    .line 54
    invoke-static {p0, p1, p2, p3}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->purchaseProduct$tryToPurchase(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Landroid/app/Activity;Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;)V

    return-void
.end method

.method public static final synthetic access$removePurchaseOptions(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ljava/lang/String;)V
    .locals 0

    .line 54
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->removePurchaseOptions(Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic access$setAdvertisingID$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ljava/lang/String;)V
    .locals 0

    .line 54
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->advertisingID:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic access$setLaunchError$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/dto/QonversionError;)V
    .locals 0

    .line 54
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->launchError:Lcom/qonversion/android/sdk/dto/QonversionError;

    return-void
.end method

.method public static final synthetic access$setPendingPartnersIdentityId$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ljava/lang/String;)V
    .locals 0

    .line 54
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->pendingPartnersIdentityId:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic access$setProcessingPartnersIdentityId$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ljava/lang/String;)V
    .locals 0

    .line 54
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->processingPartnersIdentityId:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic access$setProcessingPurchases$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ljava/util/List;)V
    .locals 0

    .line 54
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->processingPurchases:Ljava/util/List;

    return-void
.end method

.method public static final synthetic access$setUnhandledLogoutAvailable$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Z)V
    .locals 0

    .line 54
    iput-boolean p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->unhandledLogoutAvailable:Z

    return-void
.end method

.method public static final synthetic access$shouldCalculatePermissionsLocally(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/dto/QonversionError;)Z
    .locals 0

    .line 54
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->shouldCalculatePermissionsLocally(Lcom/qonversion/android/sdk/dto/QonversionError;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$storeFailedPurchaseIfNecessary(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/android/billingclient/api/Purchase;Lcom/qonversion/android/sdk/internal/purchase/Purchase;Lcom/qonversion/android/sdk/dto/products/QProduct;)V
    .locals 0

    .line 54
    invoke-direct {p0, p1, p2, p3}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->storeFailedPurchaseIfNecessary(Lcom/android/billingclient/api/Purchase;Lcom/qonversion/android/sdk/internal/purchase/Purchase;Lcom/qonversion/android/sdk/dto/products/QProduct;)V

    return-void
.end method

.method public static final synthetic access$storeFailedPurchaseIfNecessary$storePurchase(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/internal/purchase/Purchase;)V
    .locals 0

    .line 54
    invoke-static {p0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->storeFailedPurchaseIfNecessary$storePurchase(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/internal/purchase/Purchase;)V

    return-void
.end method

.method public static final synthetic access$updateLaunchResult(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;)V
    .locals 0

    .line 54
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->updateLaunchResult(Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;)V

    return-void
.end method

.method private final addIdentityCallback(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;)V
    .locals 1

    if-nez p2, :cond_0

    return-void

    .line 1098
    :cond_0
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->pendingIdentityCallbacks:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-nez v0, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/List;

    .line 1099
    :cond_1
    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1100
    iget-object p2, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->pendingIdentityCallbacks:Ljava/util/Map;

    invoke-interface {p2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private final calculatePurchasePermissionsLocally(Lcom/android/billingclient/api/Purchase;Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;Lcom/qonversion/android/sdk/dto/QonversionError;)V
    .locals 6

    .line 496
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->launchResultCache:Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->getActualProducts()Ljava/util/Map;

    move-result-object v0

    if-nez v0, :cond_1

    move-object p1, p0

    check-cast p1, Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 499
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->launchError:Lcom/qonversion/android/sdk/dto/QonversionError;

    if-nez p1, :cond_0

    new-instance p1, Lcom/qonversion/android/sdk/dto/QonversionError;

    sget-object v1, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->LaunchError:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, Lcom/qonversion/android/sdk/dto/QonversionError;-><init>(Lcom/qonversion/android/sdk/dto/QonversionErrorCode;Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 497
    :cond_0
    invoke-direct {p0, p2, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->failLocallyGrantingPurchasePermissionsWithError(Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;Lcom/qonversion/android/sdk/dto/QonversionError;)V

    return-void

    .line 504
    :cond_1
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->launchResultCache:Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;

    invoke-virtual {v1}, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->getProductPermissions()Ljava/util/Map;

    move-result-object v1

    if-nez v1, :cond_2

    move-object p1, p0

    check-cast p1, Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 505
    invoke-direct {p0, p2, p3}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->failLocallyGrantingPurchasePermissionsWithError(Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;Lcom/qonversion/android/sdk/dto/QonversionError;)V

    return-void

    .line 509
    :cond_2
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/qonversion/android/sdk/dto/products/QProduct;

    .line 510
    invoke-virtual {v3}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getStoreID()Ljava/lang/String;

    move-result-object v3

    invoke-static {p1}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->getProductId(Lcom/android/billingclient/api/Purchase;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_0

    :cond_4
    const/4 v2, 0x0

    .line 509
    :goto_0
    check-cast v2, Lcom/qonversion/android/sdk/dto/products/QProduct;

    if-nez v2, :cond_5

    .line 511
    move-object p1, p0

    check-cast p1, Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 512
    invoke-direct {p0, p2, p3}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->failLocallyGrantingPurchasePermissionsWithError(Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;Lcom/qonversion/android/sdk/dto/QonversionError;)V

    return-void

    .line 516
    :cond_5
    invoke-direct {p0, p1, v2, v1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->grantPermissionsAfterFailedPurchaseTracking(Lcom/android/billingclient/api/Purchase;Lcom/qonversion/android/sdk/dto/products/QProduct;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p3

    if-eqz p2, :cond_6

    .line 521
    invoke-static {p3}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->toEntitlementsMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p3

    invoke-interface {p2, p3, p1}, Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;->onSuccess(Ljava/util/Map;Lcom/android/billingclient/api/Purchase;)V

    :cond_6
    return-void
.end method

.method private final calculateRestorePermissionsLocally(Ljava/util/List;Lcom/qonversion/android/sdk/dto/QonversionError;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;",
            ">;",
            "Lcom/qonversion/android/sdk/dto/QonversionError;",
            ")V"
        }
    .end annotation

    .line 477
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->launchResultCache:Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->getActualProducts()Ljava/util/Map;

    move-result-object v0

    if-nez v0, :cond_1

    move-object p1, p0

    check-cast p1, Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 472
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->launchError:Lcom/qonversion/android/sdk/dto/QonversionError;

    if-nez p1, :cond_0

    new-instance p1, Lcom/qonversion/android/sdk/dto/QonversionError;

    sget-object v1, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->LaunchError:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, Lcom/qonversion/android/sdk/dto/QonversionError;-><init>(Lcom/qonversion/android/sdk/dto/QonversionErrorCode;Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 471
    :cond_0
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->failLocallyGrantingRestorePermissionsWithError(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    return-void

    .line 477
    :cond_1
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->launchResultCache:Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;

    invoke-virtual {v1}, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->getProductPermissions()Ljava/util/Map;

    move-result-object v1

    if-nez v1, :cond_2

    move-object p1, p0

    check-cast p1, Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 478
    invoke-direct {p0, p2}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->failLocallyGrantingRestorePermissionsWithError(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    return-void

    .line 484
    :cond_2
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p2

    .line 482
    invoke-direct {p0, p1, p2, v1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->grantPermissionsAfterFailedRestore(Ljava/util/List;Ljava/util/Collection;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    .line 488
    invoke-static {p1}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->toEntitlementsMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->executeRestoreBlocksOnSuccess(Ljava/util/Map;)V

    return-void
.end method

.method private final choosePermissionToSave(Lcom/qonversion/android/sdk/internal/dto/QPermission;Lcom/qonversion/android/sdk/internal/dto/QPermission;)Lcom/qonversion/android/sdk/internal/dto/QPermission;
    .locals 5

    if-nez p1, :cond_0

    return-object p2

    .line 639
    :cond_0
    invoke-virtual {p2}, Lcom/qonversion/android/sdk/internal/dto/QPermission;->getExpirationDate()Ljava/util/Date;

    move-result-object v0

    const-wide v1, 0x7fffffffffffffffL

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    goto :goto_0

    :cond_1
    move-wide v3, v1

    .line 641
    :goto_0
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/dto/QPermission;->getExpirationDate()Ljava/util/Date;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    :cond_2
    cmp-long v0, v3, v1

    if-lez v0, :cond_3

    const/4 v0, 0x1

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    .line 646
    :goto_1
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/dto/QPermission;->isActive()Z

    move-result v1

    if-eqz v1, :cond_4

    if-eqz v0, :cond_5

    :cond_4
    move-object p1, p2

    :cond_5
    return-object p1
.end method

.method private final continueLaunchWithPurchasesInfo(Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;)V
    .locals 3

    .line 679
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->getBillingService()Lcom/qonversion/android/sdk/internal/billing/BillingService;

    move-result-object v0

    new-instance v1, Lcom/qonversion/android/sdk/internal/QProductCenterManager$continueLaunchWithPurchasesInfo$1;

    invoke-direct {v1, p0, p1, p2}, Lcom/qonversion/android/sdk/internal/QProductCenterManager$continueLaunchWithPurchasesInfo$1;-><init>(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    new-instance v2, Lcom/qonversion/android/sdk/internal/QProductCenterManager$continueLaunchWithPurchasesInfo$2;

    invoke-direct {v2, p0, p1, p2}, Lcom/qonversion/android/sdk/internal/QProductCenterManager$continueLaunchWithPurchasesInfo$2;-><init>(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;)V

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, v1, v2}, Lcom/qonversion/android/sdk/internal/billing/BillingService;->queryPurchases(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final continueLaunchWithPurchasesInfo$processInitDefault(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;)V
    .locals 8

    .line 675
    new-instance v7, Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;

    iget-wide v1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->installDate:J

    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->advertisingID:Ljava/lang/String;

    const/4 v4, 0x0

    move-object v0, v7

    move-object v5, p1

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;-><init>(JLjava/lang/String;Ljava/util/List;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;)V

    .line 676
    invoke-direct {p0, v7}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->processInit(Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;)V

    return-void
.end method

.method private final createPermission(Ljava/lang/String;JLcom/qonversion/android/sdk/dto/products/QProduct;)Lcom/qonversion/android/sdk/internal/dto/QPermission;
    .locals 26

    move-wide/from16 v0, p2

    .line 585
    invoke-virtual/range {p4 .. p4}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getType()Lcom/qonversion/android/sdk/dto/products/QProductType;

    move-result-object v2

    sget-object v3, Lcom/qonversion/android/sdk/dto/products/QProductType;->InApp:Lcom/qonversion/android/sdk/dto/products/QProductType;

    const/4 v4, 0x0

    if-ne v2, v3, :cond_0

    move-object/from16 v2, p0

    move-object v3, v4

    goto :goto_0

    :cond_0
    move-object/from16 v2, p0

    .line 589
    iget-object v3, v2, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->internalConfig:Lcom/qonversion/android/sdk/internal/InternalConfig;

    invoke-virtual {v3}, Lcom/qonversion/android/sdk/internal/InternalConfig;->getCacheConfig()Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;

    move-result-object v3

    invoke-virtual {v3}, Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;->getEntitlementsCacheLifetime()Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    move-result-object v3

    invoke-virtual {v3}, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;->getDays()I

    move-result v3

    .line 590
    sget-object v5, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;->Year:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    invoke-virtual {v5}, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;->getDays()I

    move-result v5

    invoke-static {v3, v5}, Ljava/lang/Math;->min(II)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    :goto_0
    if-eqz v3, :cond_1

    .line 594
    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    new-instance v5, Ljava/util/Date;

    invoke-static {v3}, Lcom/qonversion/android/sdk/internal/UtilsKt;->getDaysToMs(I)J

    move-result-wide v6

    add-long/2addr v6, v0

    invoke-direct {v5, v6, v7}, Ljava/util/Date;-><init>(J)V

    move-object v13, v5

    goto :goto_1

    :cond_1
    move-object v13, v4

    :goto_1
    if-eqz v13, :cond_3

    .line 595
    new-instance v3, Ljava/util/Date;

    invoke-direct {v3}, Ljava/util/Date;-><init>()V

    invoke-virtual {v3, v13}, Ljava/util/Date;->compareTo(Ljava/util/Date;)I

    move-result v3

    if-gez v3, :cond_2

    goto :goto_2

    :cond_2
    return-object v4

    .line 596
    :cond_3
    :goto_2
    new-instance v3, Lcom/qonversion/android/sdk/internal/dto/QPermission;

    move-object v8, v3

    .line 598
    invoke-virtual/range {p4 .. p4}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getQonversionID()Ljava/lang/String;

    move-result-object v10

    .line 599
    sget-object v11, Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;->Unknown:Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;

    .line 600
    new-instance v4, Ljava/util/Date;

    move-object v12, v4

    invoke-direct {v4, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 602
    sget-object v14, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;->PlayStore:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;

    .line 609
    sget-object v21, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;->Purchase:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;

    const/16 v24, 0x4000

    const/16 v25, 0x0

    const/4 v15, 0x1

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    move-object/from16 v9, p1

    .line 596
    invoke-direct/range {v8 .. v25}, Lcom/qonversion/android/sdk/internal/dto/QPermission;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;Ljava/util/Date;Ljava/util/Date;Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;IILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;Ljava/util/Date;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3
.end method

.method private final declared-synchronized executeEntitlementsBlock(Lcom/qonversion/android/sdk/dto/QonversionError;)V
    .locals 3

    monitor-enter p0

    .line 876
    :try_start_0
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->entitlementCallbacks:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    .line 877
    monitor-exit p0

    return-void

    .line 880
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->entitlementCallbacks:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    .line 881
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->entitlementCallbacks:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 883
    new-instance v1, Lcom/qonversion/android/sdk/internal/QProductCenterManager$executeEntitlementsBlock$1;

    invoke-direct {v1, v0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager$executeEntitlementsBlock$1;-><init>(Ljava/util/List;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    new-instance v2, Lcom/qonversion/android/sdk/internal/QProductCenterManager$executeEntitlementsBlock$2;

    invoke-direct {v2, v0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager$executeEntitlementsBlock$2;-><init>(Ljava/util/List;)V

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, v1, v2, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->preparePermissionsResult(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/qonversion/android/sdk/dto/QonversionError;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 899
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method static synthetic executeEntitlementsBlock$default(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/dto/QonversionError;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 875
    :cond_0
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->executeEntitlementsBlock(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    return-void
.end method

.method private final executeOfferingCallback(Lcom/qonversion/android/sdk/listeners/QonversionOfferingsCallback;)V
    .locals 7

    .line 283
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->getOfferings()Lcom/qonversion/android/sdk/dto/offerings/QOfferings;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 286
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/offerings/QOfferings;->getAvailableOfferings()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    .line 1126
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/qonversion/android/sdk/dto/offerings/QOffering;

    .line 287
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->getBillingService()Lcom/qonversion/android/sdk/internal/billing/BillingService;

    move-result-object v3

    invoke-virtual {v2}, Lcom/qonversion/android/sdk/dto/offerings/QOffering;->getProducts()Ljava/util/List;

    move-result-object v2

    invoke-interface {v3, v2}, Lcom/qonversion/android/sdk/internal/billing/BillingService;->enrichStoreData(Ljava/util/List;)V

    goto :goto_0

    .line 289
    :cond_0
    invoke-interface {p1, v0}, Lcom/qonversion/android/sdk/listeners/QonversionOfferingsCallback;->onSuccess(Lcom/qonversion/android/sdk/dto/offerings/QOfferings;)V

    goto :goto_1

    .line 291
    :cond_1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->launchError:Lcom/qonversion/android/sdk/dto/QonversionError;

    if-nez v0, :cond_2

    new-instance v0, Lcom/qonversion/android/sdk/dto/QonversionError;

    sget-object v2, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->OfferingsNotFound:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/qonversion/android/sdk/dto/QonversionError;-><init>(Lcom/qonversion/android/sdk/dto/QonversionErrorCode;Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 292
    :cond_2
    invoke-interface {p1, v0}, Lcom/qonversion/android/sdk/listeners/QonversionOfferingsCallback;->onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    :goto_1
    return-void
.end method

.method private final declared-synchronized executeProductsBlocks(Lcom/qonversion/android/sdk/dto/QonversionError;)V
    .locals 7

    monitor-enter p0

    .line 847
    :try_start_0
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->productsCallbacks:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    .line 848
    monitor-exit p0

    return-void

    .line 851
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->productsCallbacks:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    .line 852
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->productsCallbacks:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    if-eqz p1, :cond_1

    .line 855
    invoke-direct {p0, v0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->fireProductsFailure(Ljava/util/List;Lcom/qonversion/android/sdk/dto/QonversionError;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 856
    monitor-exit p0

    return-void

    .line 859
    :cond_1
    :try_start_2
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->launchResultCache:Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;

    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->getActualProducts()Ljava/util/Map;

    move-result-object p1

    if-nez p1, :cond_3

    move-object p1, p0

    check-cast p1, Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 860
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->launchError:Lcom/qonversion/android/sdk/dto/QonversionError;

    if-nez p1, :cond_2

    new-instance p1, Lcom/qonversion/android/sdk/dto/QonversionError;

    sget-object v2, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->LaunchError:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p1

    invoke-direct/range {v1 .. v6}, Lcom/qonversion/android/sdk/dto/QonversionError;-><init>(Lcom/qonversion/android/sdk/dto/QonversionErrorCode;Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 861
    :cond_2
    invoke-direct {p0, v0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->fireProductsFailure(Ljava/util/List;Lcom/qonversion/android/sdk/dto/QonversionError;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 862
    monitor-exit p0

    return-void

    .line 865
    :cond_3
    :try_start_3
    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    .line 866
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->getBillingService()Lcom/qonversion/android/sdk/internal/billing/BillingService;

    move-result-object v1

    invoke-interface {v1, p1}, Lcom/qonversion/android/sdk/internal/billing/BillingService;->enrichStoreData(Ljava/util/List;)V

    .line 867
    check-cast v0, Ljava/lang/Iterable;

    .line 1167
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_4
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qonversion/android/sdk/listeners/QonversionProductsCallback;

    if-eqz v1, :cond_4

    .line 870
    move-object v2, p1

    check-cast v2, Ljava/lang/Iterable;

    const/16 v3, 0xa

    .line 1168
    invoke-static {v2, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result v3

    const/16 v4, 0x10

    invoke-static {v3, v4}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v3

    .line 1169
    new-instance v4, Ljava/util/LinkedHashMap;

    invoke-direct {v4, v3}, Ljava/util/LinkedHashMap;-><init>(I)V

    check-cast v4, Ljava/util/Map;

    .line 1170
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 1171
    move-object v5, v3

    check-cast v5, Lcom/qonversion/android/sdk/dto/products/QProduct;

    .line 870
    invoke-virtual {v5}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getQonversionID()Ljava/lang/String;

    move-result-object v5

    .line 1171
    invoke-interface {v4, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 870
    :cond_5
    invoke-interface {v1, v4}, Lcom/qonversion/android/sdk/listeners/QonversionProductsCallback;->onSuccess(Ljava/util/Map;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    .line 872
    :cond_6
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw p1
.end method

.method static synthetic executeProductsBlocks$default(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/dto/QonversionError;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 846
    :cond_0
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->executeProductsBlocks(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    return-void
.end method

.method private final executeRestoreBlocksOnError(Lcom/qonversion/android/sdk/dto/QonversionError;)V
    .locals 2

    .line 917
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->restoreCallbacks:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    .line 918
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->restoreCallbacks:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    const/4 v1, 0x0

    .line 920
    iput-boolean v1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->isRestoreInProgress:Z

    .line 922
    check-cast v0, Ljava/lang/Iterable;

    .line 1177
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;

    if-eqz v1, :cond_0

    .line 925
    invoke-interface {v1, p1}, Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;->onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    goto :goto_0

    .line 928
    :cond_1
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->handlePendingRequests(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    return-void
.end method

.method private final executeRestoreBlocksOnSuccess(Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;",
            ">;)V"
        }
    .end annotation

    .line 902
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->restoreCallbacks:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    .line 903
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->restoreCallbacks:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    const/4 v1, 0x0

    .line 905
    iput-boolean v1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->isRestoreInProgress:Z

    .line 907
    check-cast v0, Ljava/lang/Iterable;

    .line 1175
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;

    if-eqz v1, :cond_0

    .line 910
    invoke-interface {v1, p1}, Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;->onSuccess(Ljava/util/Map;)V

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    const/4 v0, 0x0

    .line 913
    invoke-static {p0, v0, p1, v0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->handlePendingRequests$default(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/dto/QonversionError;ILjava/lang/Object;)V

    return-void
.end method

.method private final failLocallyGrantingPurchasePermissionsWithError(Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;Lcom/qonversion/android/sdk/dto/QonversionError;)V
    .locals 1

    .line 528
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->launchResultCache:Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->clearPermissionsCache()V

    if-eqz p1, :cond_0

    .line 529
    invoke-interface {p1, p2}, Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;->onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    :cond_0
    return-void
.end method

.method private final failLocallyGrantingRestorePermissionsWithError(Lcom/qonversion/android/sdk/dto/QonversionError;)V
    .locals 1

    .line 535
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->launchResultCache:Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->clearPermissionsCache()V

    .line 536
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->executeRestoreBlocksOnError(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    return-void
.end method

.method private final fireIdentityError(Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QonversionError;)V
    .locals 3

    .line 1119
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->pendingIdentityCallbacks:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-nez v0, :cond_0

    return-void

    .line 1120
    :cond_0
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->pendingIdentityCallbacks:Ljava/util/Map;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    check-cast v2, Ljava/util/List;

    invoke-interface {v1, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1121
    check-cast v0, Ljava/lang/Iterable;

    .line 1186
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;

    .line 1121
    invoke-interface {v0, p2}, Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;->onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method private final fireIdentitySuccess(Ljava/lang/String;)V
    .locals 3

    .line 1104
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->pendingIdentityCallbacks:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-nez v0, :cond_0

    return-void

    .line 1105
    :cond_0
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->pendingIdentityCallbacks:Ljava/util/Map;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    check-cast v2, Ljava/util/List;

    invoke-interface {v1, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1107
    new-instance p1, Lcom/qonversion/android/sdk/internal/QProductCenterManager$fireIdentitySuccess$1;

    invoke-direct {p1, v0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager$fireIdentitySuccess$1;-><init>(Ljava/util/List;)V

    check-cast p1, Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;

    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->getUserInfo(Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;)V

    return-void
.end method

.method private final fireProductsFailure(Ljava/util/List;Lcom/qonversion/android/sdk/dto/QonversionError;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/qonversion/android/sdk/listeners/QonversionProductsCallback;",
            ">;",
            "Lcom/qonversion/android/sdk/dto/QonversionError;",
            ")V"
        }
    .end annotation

    .line 946
    check-cast p1, Ljava/lang/Iterable;

    .line 1179
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qonversion/android/sdk/listeners/QonversionProductsCallback;

    if-eqz v0, :cond_0

    .line 949
    invoke-interface {v0, p2}, Lcom/qonversion/android/sdk/listeners/QonversionProductsCallback;->onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method private final getLaunchCallback(Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;)Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;
    .locals 1

    .line 728
    new-instance v0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$getLaunchCallback$1;

    invoke-direct {v0, p0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager$getLaunchCallback$1;-><init>(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;)V

    check-cast v0, Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;

    return-object v0
.end method

.method private final getOfferings()Lcom/qonversion/android/sdk/dto/offerings/QOfferings;
    .locals 1

    .line 297
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->launchResultCache:Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->getActualOfferings()Lcom/qonversion/android/sdk/dto/offerings/QOfferings;

    move-result-object v0

    return-object v0
.end method

.method private final getProcessingPurchaseOptions()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/qonversion/android/sdk/dto/QPurchaseOptions;",
            ">;"
        }
    .end annotation

    .line 100
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->processingPurchaseOptions$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    return-object v0
.end method

.method private final getProductForPurchase(Ljava/lang/String;Ljava/util/Map;)Lcom/qonversion/android/sdk/dto/products/QProduct;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/qonversion/android/sdk/dto/products/QProduct;",
            ">;)",
            "Lcom/qonversion/android/sdk/dto/products/QProduct;"
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 396
    :cond_0
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/qonversion/android/sdk/dto/products/QProduct;

    return-object p1
.end method

.method private final getWrappedPurchasesCallback(Ljava/util/List;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;)Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/android/billingclient/api/Purchase;",
            ">;",
            "Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;",
            ")",
            "Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;"
        }
    .end annotation

    .line 712
    new-instance v0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$getWrappedPurchasesCallback$1;

    invoke-direct {v0, p0, p1, p2}, Lcom/qonversion/android/sdk/internal/QProductCenterManager$getWrappedPurchasesCallback$1;-><init>(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ljava/util/List;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;)V

    check-cast v0, Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;

    return-object v0
.end method

.method private final grantPermissionsAfterFailedPurchaseTracking(Lcom/android/billingclient/api/Purchase;Lcom/qonversion/android/sdk/dto/products/QProduct;Ljava/util/Map;)Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/billingclient/api/Purchase;",
            "Lcom/qonversion/android/sdk/dto/products/QProduct;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/qonversion/android/sdk/internal/dto/QPermission;",
            ">;"
        }
    .end annotation

    .line 544
    invoke-virtual {p2}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getQonversionID()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/List;

    if-eqz p3, :cond_2

    check-cast p3, Ljava/lang/Iterable;

    .line 1132
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/Collection;

    .line 1141
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_0
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 1140
    check-cast v1, Ljava/lang/String;

    .line 545
    invoke-virtual {p1}, Lcom/android/billingclient/api/Purchase;->getPurchaseTime()J

    move-result-wide v2

    invoke-direct {p0, v1, v2, v3, p2}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->createPermission(Ljava/lang/String;JLcom/qonversion/android/sdk/dto/products/QProduct;)Lcom/qonversion/android/sdk/internal/dto/QPermission;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 1140
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1144
    :cond_1
    check-cast v0, Ljava/util/List;

    goto :goto_1

    .line 546
    :cond_2
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    .line 548
    :goto_1
    invoke-direct {p0, v0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->mergeManuallyCreatedPermissions(Ljava/util/List;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method private final grantPermissionsAfterFailedRestore(Ljava/util/List;Ljava/util/Collection;Ljava/util/Map;)Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;",
            ">;",
            "Ljava/util/Collection<",
            "Lcom/qonversion/android/sdk/dto/products/QProduct;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/qonversion/android/sdk/internal/dto/QPermission;",
            ">;"
        }
    .end annotation

    .line 556
    check-cast p1, Ljava/lang/Iterable;

    .line 557
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->asSequence(Ljava/lang/Iterable;)Lkotlin/sequences/Sequence;

    move-result-object p1

    .line 558
    new-instance v0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$grantPermissionsAfterFailedRestore$newPermissions$1;

    invoke-direct {v0, p2, p3, p0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager$grantPermissionsAfterFailedRestore$newPermissions$1;-><init>(Ljava/util/Collection;Ljava/util/Map;Lcom/qonversion/android/sdk/internal/QProductCenterManager;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lkotlin/sequences/SequencesKt;->flatMapIterable(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;

    move-result-object p1

    .line 572
    invoke-static {p1}, Lkotlin/sequences/SequencesKt;->filterNotNull(Lkotlin/sequences/Sequence;)Lkotlin/sequences/Sequence;

    move-result-object p1

    .line 1145
    new-instance p2, Ljava/util/LinkedHashMap;

    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast p2, Ljava/util/Map;

    .line 1146
    invoke-interface {p1}, Lkotlin/sequences/Sequence;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    .line 1147
    move-object v0, p3

    check-cast v0, Lcom/qonversion/android/sdk/internal/dto/QPermission;

    .line 573
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/dto/QPermission;->getPermissionID()Ljava/lang/String;

    move-result-object v0

    .line 1149
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    .line 1148
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/List;

    .line 1152
    invoke-interface {p2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1148
    :cond_0
    check-cast v1, Ljava/util/List;

    .line 1156
    invoke-interface {v1, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1159
    :cond_1
    new-instance p1, Ljava/util/ArrayList;

    invoke-interface {p2}, Ljava/util/Map;->size()I

    move-result p3

    invoke-direct {p1, p3}, Ljava/util/ArrayList;-><init>(I)V

    check-cast p1, Ljava/util/Collection;

    .line 1160
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/Map$Entry;

    .line 574
    invoke-interface {p3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/List;

    invoke-static {p3}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/qonversion/android/sdk/internal/dto/QPermission;

    .line 1161
    invoke-interface {p1, p3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 1162
    :cond_2
    check-cast p1, Ljava/util/List;

    .line 1159
    check-cast p1, Ljava/lang/Iterable;

    .line 575
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    .line 577
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->mergeManuallyCreatedPermissions(Ljava/util/List;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method private final handleCachedPurchases()V
    .locals 8

    .line 831
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->purchasesCache:Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;->loadPurchases()Ljava/util/Set;

    move-result-object v0

    .line 832
    check-cast v0, Ljava/lang/Iterable;

    .line 1165
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lcom/qonversion/android/sdk/internal/purchase/Purchase;

    .line 833
    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;

    iget-wide v3, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->installDate:J

    new-instance v1, Lcom/qonversion/android/sdk/internal/QProductCenterManager$handleCachedPurchases$1$1;

    invoke-direct {v1, p0, v5}, Lcom/qonversion/android/sdk/internal/QProductCenterManager$handleCachedPurchases$1$1;-><init>(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/internal/purchase/Purchase;)V

    move-object v7, v1

    check-cast v7, Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;

    const/4 v6, 0x0

    invoke-interface/range {v2 .. v7}, Lcom/qonversion/android/sdk/internal/repository/QRepository;->purchase(JLcom/qonversion/android/sdk/internal/purchase/Purchase;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private final handleLogout()V
    .locals 3

    const/4 v0, 0x0

    .line 787
    iput-boolean v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->unhandledLogoutAvailable:Z

    .line 788
    sget-object v0, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->Logout:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p0, v0, v1, v2, v1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->launch$default(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;ILjava/lang/Object;)V

    return-void
.end method

.method private final handlePendingPurchases()V
    .locals 3

    .line 993
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->isLaunchingFinished()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 995
    :cond_0
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->getBillingService()Lcom/qonversion/android/sdk/internal/billing/BillingService;

    move-result-object v0

    sget-object v1, Lcom/qonversion/android/sdk/internal/QProductCenterManager$handlePendingPurchases$1;->INSTANCE:Lcom/qonversion/android/sdk/internal/QProductCenterManager$handlePendingPurchases$1;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    new-instance v2, Lcom/qonversion/android/sdk/internal/QProductCenterManager$handlePendingPurchases$2;

    invoke-direct {v2, p0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager$handlePendingPurchases$2;-><init>(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)V

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, v1, v2}, Lcom/qonversion/android/sdk/internal/billing/BillingService;->queryPurchases(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private final handlePendingRequests(Lcom/qonversion/android/sdk/dto/QonversionError;)V
    .locals 2

    .line 815
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->isLaunchingFinished()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-boolean v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->isRestoreInProgress:Z

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->processingPartnersIdentityId:Ljava/lang/String;

    if-eqz v0, :cond_0

    goto :goto_1

    .line 819
    :cond_0
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->pendingPartnersIdentityId:Ljava/lang/String;

    .line 820
    move-object v1, v0

    check-cast v1, Ljava/lang/CharSequence;

    if-eqz v1, :cond_2

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x2

    const/4 v1, 0x0

    .line 821
    invoke-static {p0, v0, v1, p1, v1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->identify$default(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;ILjava/lang/Object;)V

    goto :goto_1

    .line 822
    :cond_2
    :goto_0
    iget-boolean v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->unhandledLogoutAvailable:Z

    if-eqz v0, :cond_3

    .line 823
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->handleLogout()V

    goto :goto_1

    .line 825
    :cond_3
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->executeEntitlementsBlock(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    .line 826
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->remoteConfigManager:Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;

    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->handlePendingRequests()V

    :cond_4
    :goto_1
    return-void
.end method

.method static synthetic handlePendingRequests$default(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/dto/QonversionError;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 814
    :cond_0
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->handlePendingRequests(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    return-void
.end method

.method private final handlePurchases(Ljava/util/List;)V
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/android/billingclient/api/Purchase;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v6, p0

    move-object/from16 v0, p1

    .line 1001
    invoke-virtual/range {p0 .. p0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->getBillingService()Lcom/qonversion/android/sdk/internal/billing/BillingService;

    move-result-object v1

    invoke-interface {v1, v0}, Lcom/qonversion/android/sdk/internal/billing/BillingService;->consumePurchases(Ljava/util/List;)V

    .line 1003
    check-cast v0, Ljava/lang/Iterable;

    .line 1184
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_0
    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/android/billingclient/api/Purchase;

    .line 1004
    iget-object v0, v6, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->purchasingCallbacks:Ljava/util/Map;

    invoke-static {v4}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->getProductId(Lcom/android/billingclient/api/Purchase;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;

    .line 1005
    iget-object v0, v6, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->purchasingCallbacks:Ljava/util/Map;

    invoke-static {v4}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->getProductId(Lcom/android/billingclient/api/Purchase;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0}, Lkotlin/jvm/internal/TypeIntrinsics;->asMutableMap(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1007
    invoke-virtual {v4}, Lcom/android/billingclient/api/Purchase;->getPurchaseState()I

    move-result v0

    if-eqz v0, :cond_6

    const/4 v1, 0x2

    if-eq v0, v1, :cond_5

    .line 1018
    iget-object v0, v6, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->handledPurchasesCache:Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache;

    invoke-virtual {v0, v4}, Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache;->shouldHandlePurchase(Lcom/android/billingclient/api/Purchase;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1020
    iget-object v0, v6, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->launchResultCache:Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->getActualProducts()Ljava/util/Map;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    if-eqz v0, :cond_3

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Lcom/qonversion/android/sdk/dto/products/QProduct;

    .line 1021
    invoke-virtual {v5}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getStoreID()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->getProductId(Lcom/android/billingclient/api/Purchase;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v5, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_1

    :cond_2
    move-object v2, v1

    .line 1020
    :goto_1
    check-cast v2, Lcom/qonversion/android/sdk/dto/products/QProduct;

    goto :goto_2

    :cond_3
    move-object v2, v1

    .line 1023
    :goto_2
    invoke-direct/range {p0 .. p0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->getProcessingPurchaseOptions()Ljava/util/Map;

    move-result-object v0

    invoke-static {v4}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->getProductId(Lcom/android/billingclient/api/Purchase;)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qonversion/android/sdk/dto/QPurchaseOptions;

    .line 1024
    iget-object v5, v6, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->converter:Lcom/qonversion/android/sdk/internal/converter/PurchaseConverter;

    invoke-interface {v5, v4, v0}, Lcom/qonversion/android/sdk/internal/converter/PurchaseConverter;->convertPurchase(Lcom/android/billingclient/api/Purchase;Lcom/qonversion/android/sdk/dto/QPurchaseOptions;)Lcom/qonversion/android/sdk/internal/purchase/Purchase;

    move-result-object v11

    .line 1025
    iget-object v8, v6, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;

    .line 1026
    iget-wide v9, v6, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->installDate:J

    if-eqz v2, :cond_4

    .line 1028
    invoke-virtual {v2}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getQonversionID()Ljava/lang/String;

    move-result-object v1

    :cond_4
    move-object v12, v1

    .line 1029
    new-instance v13, Lcom/qonversion/android/sdk/internal/QProductCenterManager$handlePurchases$1$1;

    move-object v0, v13

    move-object/from16 v1, p0

    move-object v5, v11

    invoke-direct/range {v0 .. v5}, Lcom/qonversion/android/sdk/internal/QProductCenterManager$handlePurchases$1$1;-><init>(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/dto/products/QProduct;Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;Lcom/android/billingclient/api/Purchase;Lcom/qonversion/android/sdk/internal/purchase/Purchase;)V

    check-cast v13, Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;

    .line 1025
    invoke-interface/range {v8 .. v13}, Lcom/qonversion/android/sdk/internal/repository/QRepository;->purchase(JLcom/qonversion/android/sdk/internal/purchase/Purchase;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;)V

    goto/16 :goto_0

    :cond_5
    if-eqz v3, :cond_0

    .line 1009
    new-instance v0, Lcom/qonversion/android/sdk/dto/QonversionError;

    sget-object v15, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->PurchasePending:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    const/16 v18, 0x6

    const/16 v19, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object v14, v0

    invoke-direct/range {v14 .. v19}, Lcom/qonversion/android/sdk/dto/QonversionError;-><init>(Lcom/qonversion/android/sdk/dto/QonversionErrorCode;Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v3, v0}, Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;->onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    goto/16 :goto_0

    :cond_6
    if-eqz v3, :cond_0

    .line 1013
    new-instance v0, Lcom/qonversion/android/sdk/dto/QonversionError;

    sget-object v9, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->PurchaseUnspecified:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    const/4 v12, 0x6

    const/4 v13, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v8, v0

    invoke-direct/range {v8 .. v13}, Lcom/qonversion/android/sdk/dto/QonversionError;-><init>(Lcom/qonversion/android/sdk/dto/QonversionErrorCode;Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v3, v0}, Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;->onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    goto/16 :goto_0

    :cond_7
    return-void
.end method

.method public static synthetic identify$default(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 174
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->identify(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;)V

    return-void
.end method

.method private final isLaunchingFinished()Z
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->launchError:Lcom/qonversion/android/sdk/dto/QonversionError;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->launchResultCache:Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->getSessionLaunchResult()Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public static synthetic launch$default(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 130
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->launch(Lcom/qonversion/android/sdk/internal/api/RequestTrigger;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;)V

    return-void
.end method

.method private final loadStoreProductsIfPossible()V
    .locals 7

    .line 796
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->launchResultCache:Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->getActualProducts()Ljava/util/Map;

    move-result-object v0

    if-nez v0, :cond_1

    move-object v0, p0

    check-cast v0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 797
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->launchError:Lcom/qonversion/android/sdk/dto/QonversionError;

    if-nez v0, :cond_0

    new-instance v0, Lcom/qonversion/android/sdk/dto/QonversionError;

    sget-object v2, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->LaunchError:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/qonversion/android/sdk/dto/QonversionError;-><init>(Lcom/qonversion/android/sdk/dto/QonversionErrorCode;Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 798
    :cond_0
    invoke-direct {p0, v0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->executeProductsBlocks(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    return-void

    .line 802
    :cond_1
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->getBillingService()Lcom/qonversion/android/sdk/internal/billing/BillingService;

    move-result-object v1

    .line 803
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    .line 802
    new-instance v2, Lcom/qonversion/android/sdk/internal/QProductCenterManager$loadStoreProductsIfPossible$1;

    invoke-direct {v2, p0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager$loadStoreProductsIfPossible$1;-><init>(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)V

    check-cast v2, Lkotlin/jvm/functions/Function1;

    new-instance v3, Lcom/qonversion/android/sdk/internal/QProductCenterManager$loadStoreProductsIfPossible$2;

    invoke-direct {v3, p0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager$loadStoreProductsIfPossible$2;-><init>(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)V

    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-interface {v1, v0, v2, v3}, Lcom/qonversion/android/sdk/internal/billing/BillingService;->enrichStoreDataAsync(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private final mergeManuallyCreatedPermissions(Ljava/util/List;)Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/internal/dto/QPermission;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/qonversion/android/sdk/internal/dto/QPermission;",
            ">;"
        }
    .end annotation

    .line 618
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->launchResultCache:Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->getActualPermissions()Ljava/util/Map;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v0

    .line 619
    :cond_0
    invoke-static {v0}, Lkotlin/collections/MapsKt;->toMutableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    .line 621
    check-cast p1, Ljava/lang/Iterable;

    .line 1163
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qonversion/android/sdk/internal/dto/QPermission;

    .line 622
    invoke-virtual {v1}, Lcom/qonversion/android/sdk/internal/dto/QPermission;->getPermissionID()Ljava/lang/String;

    move-result-object v2

    .line 623
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/qonversion/android/sdk/internal/dto/QPermission;

    invoke-direct {p0, v3, v1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->choosePermissionToSave(Lcom/qonversion/android/sdk/internal/dto/QPermission;Lcom/qonversion/android/sdk/internal/dto/QPermission;)Lcom/qonversion/android/sdk/internal/dto/QPermission;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 626
    :cond_1
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->launchResultCache:Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;

    invoke-virtual {p1, v0}, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->updatePermissions(Ljava/util/Map;)V

    return-object v0
.end method

.method private final preparePermissionsResult(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/qonversion/android/sdk/dto/QonversionError;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/qonversion/android/sdk/internal/dto/QPermission;",
            ">;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/qonversion/android/sdk/dto/QonversionError;",
            "Lkotlin/Unit;",
            ">;",
            "Lcom/qonversion/android/sdk/dto/QonversionError;",
            ")V"
        }
    .end annotation

    .line 975
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->launchResultCache:Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->getActualPermissions()Ljava/util/Map;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v0

    .line 977
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    .line 1181
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    goto :goto_1

    .line 1182
    :cond_1
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    .line 979
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/qonversion/android/sdk/internal/dto/QPermission;

    invoke-virtual {v6}, Lcom/qonversion/android/sdk/internal/dto/QPermission;->getExpirationDate()Ljava/util/Date;

    move-result-object v6

    if-eqz v6, :cond_3

    invoke-virtual {v6}, Ljava/util/Date;->getTime()J

    move-result-wide v6

    goto :goto_0

    :cond_3
    const-wide v6, 0x7fffffffffffffffL

    .line 980
    :goto_0
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/qonversion/android/sdk/internal/dto/QPermission;

    invoke-virtual {v5}, Lcom/qonversion/android/sdk/internal/dto/QPermission;->isActive()Z

    move-result v5

    if-eqz v5, :cond_2

    cmp-long v5, v6, v1

    if-gez v5, :cond_2

    const/4 v4, 0x0

    :cond_4
    :goto_1
    if-eqz p3, :cond_5

    .line 983
    invoke-static {p3}, Lcom/qonversion/android/sdk/internal/UtilsKt;->getShouldFireFallback(Lcom/qonversion/android/sdk/dto/QonversionError;)Z

    move-result v1

    if-eqz v1, :cond_6

    :cond_5
    if-eqz v4, :cond_6

    .line 984
    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_6
    if-eqz p3, :cond_7

    .line 986
    invoke-interface {p2, p3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 988
    :cond_7
    invoke-static {p0, p1, p2}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->preparePermissionsResult$actualizePermissions(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    :goto_2
    return-void
.end method

.method private static final preparePermissionsResult$actualizePermissions(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/QProductCenterManager;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/qonversion/android/sdk/internal/dto/QPermission;",
            ">;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/qonversion/android/sdk/dto/QonversionError;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 959
    new-instance v0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$preparePermissionsResult$actualizePermissions$1;

    invoke-direct {v0, p1, p0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager$preparePermissionsResult$actualizePermissions$1;-><init>(Lkotlin/jvm/functions/Function1;Lcom/qonversion/android/sdk/internal/QProductCenterManager;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    new-instance v1, Lcom/qonversion/android/sdk/internal/QProductCenterManager$preparePermissionsResult$actualizePermissions$2;

    invoke-direct {v1, p0, p2, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager$preparePermissionsResult$actualizePermissions$2;-><init>(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 971
    sget-object p1, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->ActualizePermissions:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    .line 959
    invoke-direct {p0, v0, v1, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->retryLaunch(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;)V

    return-void
.end method

.method private final processIdentity(Ljava/lang/String;)V
    .locals 3

    .line 222
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->userInfoService:Lcom/qonversion/android/sdk/internal/services/QUserInfoService;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/services/QUserInfoService;->obtainUserID()Ljava/lang/String;

    move-result-object v0

    .line 224
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->identityManager:Lcom/qonversion/android/sdk/internal/QIdentityManager;

    new-instance v2, Lcom/qonversion/android/sdk/internal/QProductCenterManager$processIdentity$1;

    invoke-direct {v2, p0, v0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager$processIdentity$1;-><init>(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ljava/lang/String;Ljava/lang/String;)V

    check-cast v2, Lcom/qonversion/android/sdk/internal/IdentityManagerCallback;

    invoke-virtual {v1, p1, v2}, Lcom/qonversion/android/sdk/internal/QIdentityManager;->identify(Ljava/lang/String;Lcom/qonversion/android/sdk/internal/IdentityManagerCallback;)V

    return-void
.end method

.method private final processInit(Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;)V
    .locals 1

    .line 661
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->appStateProvider:Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;

    invoke-interface {v0}, Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;->getAppState()Lcom/qonversion/android/sdk/internal/AppState;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/AppState;->isBackground()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 662
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->pendingInitRequestData:Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;

    return-void

    .line 666
    :cond_0
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;

    invoke-interface {v0, p1}, Lcom/qonversion/android/sdk/internal/repository/QRepository;->init(Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;)V

    return-void
.end method

.method private final processPendingInitIfAvailable()V
    .locals 1

    .line 654
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->pendingInitRequestData:Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;

    if-eqz v0, :cond_0

    .line 655
    invoke-direct {p0, v0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->processInit(Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;)V

    const/4 v0, 0x0

    .line 656
    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->pendingInitRequestData:Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;

    :cond_0
    return-void
.end method

.method private final processPurchase(Landroid/app/Activity;Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;)V
    .locals 7

    .line 357
    invoke-virtual {p2}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;->getProduct()Lcom/qonversion/android/sdk/dto/products/QProduct;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getStoreID()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    .line 352
    new-instance p1, Lcom/qonversion/android/sdk/dto/QonversionError;

    sget-object v2, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->ProductNotFound:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p1

    invoke-direct/range {v1 .. v6}, Lcom/qonversion/android/sdk/dto/QonversionError;-><init>(Lcom/qonversion/android/sdk/dto/QonversionErrorCode;Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p3, p1}, Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;->onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    return-void

    .line 356
    :cond_0
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->purchasingCallbacks:Ljava/util/Map;

    invoke-virtual {p2}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;->getProduct()Lcom/qonversion/android/sdk/dto/products/QProduct;

    move-result-object v1

    invoke-virtual {v1}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getStoreID()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;

    if-eqz v0, :cond_1

    .line 358
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->logger:Lcom/qonversion/android/sdk/internal/logger/Logger;

    .line 360
    invoke-virtual {p2}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;->getProduct()Lcom/qonversion/android/sdk/dto/products/QProduct;

    move-result-object p2

    invoke-virtual {p2}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getQonversionID()Ljava/lang/String;

    move-result-object p2

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "purchaseProduct() -> Purchase of the product "

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    const-string p3, " is already in progress. This call will be ignored"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 358
    invoke-interface {p1, p2}, Lcom/qonversion/android/sdk/internal/logger/Logger;->release(Ljava/lang/String;)V

    return-void

    .line 365
    :cond_1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->purchasingCallbacks:Ljava/util/Map;

    invoke-virtual {p2}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;->getProduct()Lcom/qonversion/android/sdk/dto/products/QProduct;

    move-result-object v1

    invoke-virtual {v1}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getStoreID()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 367
    invoke-virtual {p2}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;->getOptions()Lcom/qonversion/android/sdk/dto/QPurchaseOptions;

    move-result-object p3

    invoke-virtual {p2}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;->getProduct()Lcom/qonversion/android/sdk/dto/products/QProduct;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getStoreID()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p3, v0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->updatePurchaseOptions(Lcom/qonversion/android/sdk/dto/QPurchaseOptions;Ljava/lang/String;)V

    .line 369
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->getBillingService()Lcom/qonversion/android/sdk/internal/billing/BillingService;

    move-result-object p3

    invoke-interface {p3, p1, p2}, Lcom/qonversion/android/sdk/internal/billing/BillingService;->purchase(Landroid/app/Activity;Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;)V

    return-void
.end method

.method private static final purchaseProduct$tryToPurchase(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Landroid/app/Activity;Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;)V
    .locals 0

    .line 313
    invoke-direct {p0, p1, p2, p3}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->tryToPurchase(Landroid/app/Activity;Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;)V

    return-void
.end method

.method private final removePurchaseOptions(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 385
    invoke-direct {p0, v0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->updatePurchaseOptions(Lcom/qonversion/android/sdk/dto/QPurchaseOptions;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic restore$default(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 405
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->restore(Lcom/qonversion/android/sdk/internal/api/RequestTrigger;Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V

    return-void
.end method

.method private final retryLaunch(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/qonversion/android/sdk/dto/QonversionError;",
            "Lkotlin/Unit;",
            ">;",
            "Lcom/qonversion/android/sdk/internal/api/RequestTrigger;",
            ")V"
        }
    .end annotation

    .line 936
    new-instance v0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$retryLaunch$1;

    invoke-direct {v0, p1, p2}, Lcom/qonversion/android/sdk/internal/QProductCenterManager$retryLaunch$1;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    check-cast v0, Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;

    invoke-virtual {p0, p3, v0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->launch(Lcom/qonversion/android/sdk/internal/api/RequestTrigger;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;)V

    return-void
.end method

.method private final shouldCalculatePermissionsLocally(Lcom/qonversion/android/sdk/dto/QonversionError;)Z
    .locals 3

    .line 1087
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->internalConfig:Lcom/qonversion/android/sdk/internal/InternalConfig;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/InternalConfig;->isAnalyticsMode()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1088
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/dto/QonversionError;->getCode()Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    move-result-object v0

    sget-object v1, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->NetworkConnectionFailed:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    const/4 v2, 0x1

    if-eq v0, v1, :cond_1

    .line 1089
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/dto/QonversionError;->getHttpCode$sdk_release()Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {p1}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->isInternalServerError(I)Z

    move-result p1

    if-ne p1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :cond_1
    :goto_0
    return v2
.end method

.method private final storeFailedPurchaseIfNecessary(Lcom/android/billingclient/api/Purchase;Lcom/qonversion/android/sdk/internal/purchase/Purchase;Lcom/qonversion/android/sdk/dto/products/QProduct;)V
    .locals 2

    if-eqz p3, :cond_0

    .line 1072
    invoke-virtual {p3}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getStoreDetails()Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;

    move-result-object p3

    if-eqz p3, :cond_0

    invoke-virtual {p3}, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->isInApp()Z

    move-result p3

    const/4 v0, 0x1

    if-ne p3, v0, :cond_0

    .line 1073
    invoke-static {p0, p2}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->storeFailedPurchaseIfNecessary$storePurchase(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/internal/purchase/Purchase;)V

    return-void

    .line 1077
    :cond_0
    invoke-static {p1}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->getProductId(Lcom/android/billingclient/api/Purchase;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 1078
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->getBillingService()Lcom/qonversion/android/sdk/internal/billing/BillingService;

    move-result-object p3

    new-instance v0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$storeFailedPurchaseIfNecessary$1$1;

    invoke-direct {v0, p0, p2}, Lcom/qonversion/android/sdk/internal/QProductCenterManager$storeFailedPurchaseIfNecessary$1$1;-><init>(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/internal/purchase/Purchase;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    new-instance v1, Lcom/qonversion/android/sdk/internal/QProductCenterManager$storeFailedPurchaseIfNecessary$1$2;

    invoke-direct {v1, p0, p2}, Lcom/qonversion/android/sdk/internal/QProductCenterManager$storeFailedPurchaseIfNecessary$1$2;-><init>(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/internal/purchase/Purchase;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-interface {p3, p1, v0, v1}, Lcom/qonversion/android/sdk/internal/billing/BillingService;->getStoreProductType(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 1077
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_2

    .line 1083
    invoke-static {p0, p2}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->storeFailedPurchaseIfNecessary$storePurchase(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/internal/purchase/Purchase;)V

    :cond_2
    return-void
.end method

.method private static final storeFailedPurchaseIfNecessary$storePurchase(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/internal/purchase/Purchase;)V
    .locals 0

    .line 1069
    iget-object p0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->purchasesCache:Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;

    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;->savePurchase(Lcom/qonversion/android/sdk/internal/purchase/Purchase;)V

    return-void
.end method

.method private final tryToPurchase(Landroid/app/Activity;Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;)V
    .locals 6

    .line 337
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->launchResultCache:Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->getActualProducts()Ljava/util/Map;

    move-result-object v0

    if-nez v0, :cond_1

    move-object p1, p0

    check-cast p1, Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 333
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->launchError:Lcom/qonversion/android/sdk/dto/QonversionError;

    if-nez p1, :cond_0

    new-instance p1, Lcom/qonversion/android/sdk/dto/QonversionError;

    sget-object v1, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->LaunchError:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, Lcom/qonversion/android/sdk/dto/QonversionError;-><init>(Lcom/qonversion/android/sdk/dto/QonversionErrorCode;Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_0
    invoke-interface {p3, p1}, Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;->onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    return-void

    .line 337
    :cond_1
    invoke-virtual {p2}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;->getProductId()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1, v0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->getProductForPurchase(Ljava/lang/String;Ljava/util/Map;)Lcom/qonversion/android/sdk/dto/products/QProduct;

    move-result-object v1

    if-nez v1, :cond_2

    move-object p1, p0

    check-cast p1, Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 338
    new-instance p1, Lcom/qonversion/android/sdk/dto/QonversionError;

    sget-object v1, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->ProductNotFound:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, Lcom/qonversion/android/sdk/dto/QonversionError;-><init>(Lcom/qonversion/android/sdk/dto/QonversionErrorCode;Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p3, p1}, Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;->onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    return-void

    .line 341
    :cond_2
    invoke-virtual {p2}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;->getOptions()Lcom/qonversion/android/sdk/dto/QPurchaseOptions;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lcom/qonversion/android/sdk/dto/QPurchaseOptions;->getOldProduct$sdk_release()Lcom/qonversion/android/sdk/dto/products/QProduct;

    move-result-object v2

    if-nez v2, :cond_4

    :cond_3
    invoke-virtual {p2}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;->getOldProductId()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v2, v0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->getProductForPurchase(Ljava/lang/String;Ljava/util/Map;)Lcom/qonversion/android/sdk/dto/products/QProduct;

    move-result-object v2

    .line 342
    :cond_4
    invoke-virtual {p2, v1, v2}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;->enrich(Lcom/qonversion/android/sdk/dto/products/QProduct;Lcom/qonversion/android/sdk/dto/products/QProduct;)Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;

    move-result-object p2

    .line 343
    invoke-direct {p0, p1, p2, p3}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->processPurchase(Landroid/app/Activity;Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;)V

    return-void
.end method

.method private final updateLaunchResult(Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;)V
    .locals 1

    .line 792
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->launchResultCache:Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;

    invoke-virtual {v0, p1}, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->save(Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;)V

    return-void
.end method

.method private final updatePurchaseOptions(Lcom/qonversion/android/sdk/dto/QPurchaseOptions;Ljava/lang/String;)V
    .locals 1

    if-eqz p2, :cond_1

    if-eqz p1, :cond_0

    .line 375
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->getProcessingPurchaseOptions()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 376
    :cond_0
    move-object p1, p0

    check-cast p1, Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 377
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->getProcessingPurchaseOptions()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1, p2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/qonversion/android/sdk/dto/QPurchaseOptions;

    .line 380
    :goto_0
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->purchasesCache:Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;

    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->getProcessingPurchaseOptions()Ljava/util/Map;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;->saveProcessingPurchasesOptions(Ljava/util/Map;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final checkEntitlements(Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V
    .locals 1

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 400
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->entitlementCallbacks:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x0

    const/4 v0, 0x1

    .line 402
    invoke-static {p0, p1, v0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->handlePendingRequests$default(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/dto/QonversionError;ILjava/lang/Object;)V

    return-void
.end method

.method public final checkTrialIntroEligibilityForProductIds(Ljava/util/List;Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;",
            ")V"
        }
    .end annotation

    const-string v0, "productIds"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 263
    new-instance v0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$checkTrialIntroEligibilityForProductIds$1;

    invoke-direct {v0, p2, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager$checkTrialIntroEligibilityForProductIds$1;-><init>(Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;Ljava/util/List;)V

    check-cast v0, Lcom/qonversion/android/sdk/listeners/QonversionProductsCallback;

    invoke-virtual {p0, v0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->loadProducts(Lcom/qonversion/android/sdk/listeners/QonversionProductsCallback;)V

    return-void
.end method

.method public final declared-synchronized getBillingService()Lcom/qonversion/android/sdk/internal/billing/BillingService;
    .locals 1

    monitor-enter p0

    .line 107
    :try_start_0
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->billingService:Lcom/qonversion/android/sdk/internal/billing/BillingService;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-object v0

    :cond_0
    :try_start_1
    const-string v0, "billingService"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    const/4 v0, 0x0

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public final getUserInfo(Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;)V
    .locals 3

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 778
    new-instance v0, Lcom/qonversion/android/sdk/dto/QUser;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->internalConfig:Lcom/qonversion/android/sdk/internal/InternalConfig;

    invoke-virtual {v1}, Lcom/qonversion/android/sdk/internal/InternalConfig;->getUid()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->identityManager:Lcom/qonversion/android/sdk/internal/QIdentityManager;

    invoke-virtual {v2}, Lcom/qonversion/android/sdk/internal/QIdentityManager;->getCurrentPartnersIdentityId()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/qonversion/android/sdk/dto/QUser;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 779
    invoke-interface {p1, v0}, Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;->onSuccess(Lcom/qonversion/android/sdk/dto/QUser;)V

    return-void
.end method

.method public final identify(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;)V
    .locals 7

    const-string v0, "identityId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 175
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->identityManager:Lcom/qonversion/android/sdk/internal/QIdentityManager;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/QIdentityManager;->getCurrentPartnersIdentityId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz p2, :cond_0

    .line 176
    invoke-virtual {p0, p2}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->getUserInfo(Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;)V

    :cond_0
    return-void

    .line 180
    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->addIdentityCallback(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;)V

    .line 181
    iget-object p2, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->processingPartnersIdentityId:Ljava/lang/String;

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    return-void

    :cond_2
    const/4 p2, 0x0

    .line 185
    iput-boolean p2, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->unhandledLogoutAvailable:Z

    .line 187
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->pendingPartnersIdentityId:Ljava/lang/String;

    .line 188
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->isLaunchingFinished()Z

    move-result p2

    if-eqz p2, :cond_5

    iget-boolean p2, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->isRestoreInProgress:Z

    if-eqz p2, :cond_3

    goto :goto_0

    .line 192
    :cond_3
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->processingPartnersIdentityId:Ljava/lang/String;

    .line 194
    iget-object p2, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->launchError:Lcom/qonversion/android/sdk/dto/QonversionError;

    if-eqz p2, :cond_4

    .line 195
    new-instance p2, Lcom/qonversion/android/sdk/internal/QProductCenterManager$identify$launchCallback$1;

    invoke-direct {p2, p0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager$identify$launchCallback$1;-><init>(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ljava/lang/String;)V

    .line 208
    new-instance p1, Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;

    .line 209
    iget-wide v1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->installDate:J

    .line 210
    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->advertisingID:Ljava/lang/String;

    .line 212
    move-object v5, p2

    check-cast v5, Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;

    .line 213
    sget-object v6, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->Identify:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    const/4 v4, 0x0

    move-object v0, p1

    .line 208
    invoke-direct/range {v0 .. v6}, Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;-><init>(JLjava/lang/String;Ljava/util/List;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;)V

    .line 215
    iget-object p2, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;

    invoke-interface {p2, p1}, Lcom/qonversion/android/sdk/internal/repository/QRepository;->init(Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;)V

    goto :goto_0

    .line 217
    :cond_4
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->processIdentity(Ljava/lang/String;)V

    :cond_5
    :goto_0
    return-void
.end method

.method public isUserStable()Z
    .locals 1

    .line 70
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->isLaunchingFinished()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 71
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->processingPartnersIdentityId:Ljava/lang/String;

    if-nez v0, :cond_1

    .line 72
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->pendingPartnersIdentityId:Ljava/lang/String;

    check-cast v0, Ljava/lang/CharSequence;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_1

    .line 73
    :cond_0
    iget-boolean v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->unhandledLogoutAvailable:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final launch(Lcom/qonversion/android/sdk/internal/api/RequestTrigger;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;)V
    .locals 3

    const-string v0, "requestTrigger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 131
    invoke-direct {p0, p2}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->getLaunchCallback(Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;)Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;

    move-result-object p2

    const/4 v0, 0x0

    .line 132
    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->launchError:Lcom/qonversion/android/sdk/dto/QonversionError;

    .line 133
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->launchResultCache:Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->resetSessionCache()V

    .line 135
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->internalConfig:Lcom/qonversion/android/sdk/internal/InternalConfig;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/InternalConfig;->getPrimaryConfig()Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;->isKidsMode()Z

    move-result v0

    if-nez v0, :cond_0

    .line 136
    new-instance v0, Lcom/qonversion/android/sdk/internal/AdvertisingProvider;

    invoke-direct {v0}, Lcom/qonversion/android/sdk/internal/AdvertisingProvider;-><init>()V

    .line 137
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->context:Landroid/app/Application;

    check-cast v1, Landroid/content/Context;

    new-instance v2, Lcom/qonversion/android/sdk/internal/QProductCenterManager$launch$1;

    invoke-direct {v2, p0, p2, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager$launch$1;-><init>(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;)V

    check-cast v2, Lcom/qonversion/android/sdk/internal/AdvertisingProvider$Callback;

    invoke-virtual {v0, v1, v2}, Lcom/qonversion/android/sdk/internal/AdvertisingProvider;->init(Landroid/content/Context;Lcom/qonversion/android/sdk/internal/AdvertisingProvider$Callback;)V

    goto :goto_0

    .line 148
    :cond_0
    invoke-direct {p0, p2, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->continueLaunchWithPurchasesInfo(Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;)V

    :goto_0
    return-void
.end method

.method public final loadProducts(Lcom/qonversion/android/sdk/listeners/QonversionProductsCallback;)V
    .locals 2

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 153
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->productsCallbacks:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 154
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->isLaunchingFinished()Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    .line 158
    :cond_0
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->launchResultCache:Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;

    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->getSessionLaunchResult()Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    .line 159
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->loadStoreProductsIfPossible()V

    .line 158
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_0

    :cond_1
    move-object p1, v0

    :goto_0
    if-nez p1, :cond_2

    .line 160
    sget-object p1, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->Products:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->launch$default(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;ILjava/lang/Object;)V

    :cond_2
    return-void
.end method

.method public final logout()V
    .locals 2

    const/4 v0, 0x0

    .line 763
    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->pendingPartnersIdentityId:Ljava/lang/String;

    .line 764
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->identityManager:Lcom/qonversion/android/sdk/internal/QIdentityManager;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/QIdentityManager;->logoutIfNeeded()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 767
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->remoteConfigManager:Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->onUserUpdate()V

    .line 768
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->launchResultCache:Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->clearPermissionsCache()V

    const/4 v0, 0x1

    .line 770
    iput-boolean v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->unhandledLogoutAvailable:Z

    .line 772
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->userInfoService:Lcom/qonversion/android/sdk/internal/services/QUserInfoService;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/services/QUserInfoService;->obtainUserID()Ljava/lang/String;

    move-result-object v0

    .line 773
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->internalConfig:Lcom/qonversion/android/sdk/internal/InternalConfig;

    invoke-virtual {v1, v0}, Lcom/qonversion/android/sdk/internal/InternalConfig;->setUid(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final offerings(Lcom/qonversion/android/sdk/listeners/QonversionOfferingsCallback;)V
    .locals 1

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 166
    new-instance v0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$offerings$1;

    invoke-direct {v0, p0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager$offerings$1;-><init>(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/listeners/QonversionOfferingsCallback;)V

    check-cast v0, Lcom/qonversion/android/sdk/listeners/QonversionProductsCallback;

    invoke-virtual {p0, v0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->loadProducts(Lcom/qonversion/android/sdk/listeners/QonversionProductsCallback;)V

    return-void
.end method

.method public final onAppForeground()V
    .locals 0

    .line 125
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->handlePendingPurchases()V

    .line 127
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->processPendingInitIfAvailable()V

    return-void
.end method

.method public onPurchasesCompleted(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/android/billingclient/api/Purchase;",
            ">;)V"
        }
    .end annotation

    const-string v0, "purchases"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 444
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->handlePurchases(Ljava/util/List;)V

    return-void
.end method

.method public onPurchasesFailed(Lcom/qonversion/android/sdk/internal/billing/BillingError;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/billing/BillingError;",
            "Ljava/util/List<",
            "+",
            "Lcom/android/billingclient/api/Purchase;",
            ">;)V"
        }
    .end annotation

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "purchases"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 448
    move-object v0, p2

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 449
    check-cast p2, Ljava/lang/Iterable;

    .line 1128
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/billingclient/api/Purchase;

    .line 450
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->purchasingCallbacks:Ljava/util/Map;

    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->getProductId(Lcom/android/billingclient/api/Purchase;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;

    .line 451
    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->purchasingCallbacks:Ljava/util/Map;

    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->getProductId(Lcom/android/billingclient/api/Purchase;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2}, Lkotlin/jvm/internal/TypeIntrinsics;->asMutableMap(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v1, :cond_0

    .line 452
    invoke-static {p1}, Lcom/qonversion/android/sdk/internal/ErrorsKt;->toQonversionError(Lcom/qonversion/android/sdk/internal/billing/BillingError;)Lcom/qonversion/android/sdk/dto/QonversionError;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;->onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    goto :goto_0

    .line 455
    :cond_1
    iget-object p2, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->purchasingCallbacks:Ljava/util/Map;

    invoke-interface {p2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    .line 1130
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_2
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;

    if-eqz v0, :cond_2

    .line 458
    invoke-static {p1}, Lcom/qonversion/android/sdk/internal/ErrorsKt;->toQonversionError(Lcom/qonversion/android/sdk/internal/billing/BillingError;)Lcom/qonversion/android/sdk/dto/QonversionError;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;->onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    goto :goto_1

    .line 460
    :cond_3
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->purchasingCallbacks:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->clear()V

    :cond_4
    return-void
.end method

.method public final purchaseProduct(Landroid/app/Activity;Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "purchaseModel"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 305
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->internalConfig:Lcom/qonversion/android/sdk/internal/InternalConfig;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/InternalConfig;->isAnalyticsMode()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 306
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->logger:Lcom/qonversion/android/sdk/internal/logger/Logger;

    .line 307
    const-string v1, "Making purchases via Qonversion in the Analytics mode can lead to an inconsistent state in the store. Consider switching to the Subscription management mode."

    .line 306
    invoke-interface {v0, v1}, Lcom/qonversion/android/sdk/internal/logger/Logger;->warn(Ljava/lang/String;)V

    .line 316
    :cond_0
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->launchError:Lcom/qonversion/android/sdk/dto/QonversionError;

    if-eqz v0, :cond_1

    .line 317
    new-instance v0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$purchaseProduct$1;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/qonversion/android/sdk/internal/QProductCenterManager$purchaseProduct$1;-><init>(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Landroid/app/Activity;Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    new-instance v1, Lcom/qonversion/android/sdk/internal/QProductCenterManager$purchaseProduct$2;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/qonversion/android/sdk/internal/QProductCenterManager$purchaseProduct$2;-><init>(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Landroid/app/Activity;Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 320
    sget-object p1, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->Purchase:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    .line 317
    invoke-direct {p0, v0, v1, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->retryLaunch(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;)V

    goto :goto_0

    .line 323
    :cond_1
    invoke-static {p0, p1, p2, p3}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->purchaseProduct$tryToPurchase(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Landroid/app/Activity;Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;)V

    :goto_0
    return-void
.end method

.method public final restore(Lcom/qonversion/android/sdk/internal/api/RequestTrigger;Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V
    .locals 2

    const-string v0, "requestTrigger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    .line 406
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->restoreCallbacks:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 408
    :cond_0
    iget-boolean p2, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->isRestoreInProgress:Z

    if-eqz p2, :cond_1

    return-void

    :cond_1
    const/4 p2, 0x1

    .line 411
    iput-boolean p2, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->isRestoreInProgress:Z

    .line 413
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->getBillingService()Lcom/qonversion/android/sdk/internal/billing/BillingService;

    move-result-object p2

    new-instance v0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$restore$2;

    invoke-direct {v0, p0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager$restore$2;-><init>(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    new-instance v1, Lcom/qonversion/android/sdk/internal/QProductCenterManager$restore$3;

    invoke-direct {v1, p0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager$restore$3;-><init>(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-interface {p2, v0, v1}, Lcom/qonversion/android/sdk/internal/billing/BillingService;->queryPurchasesHistory(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final declared-synchronized setBillingService(Lcom/qonversion/android/sdk/internal/billing/BillingService;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 106
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->billingService:Lcom/qonversion/android/sdk/internal/billing/BillingService;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final setEntitlementsUpdateListener(Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;)V
    .locals 1

    const-string v0, "entitlementsUpdateListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 783
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->internalConfig:Lcom/qonversion/android/sdk/internal/InternalConfig;

    invoke-virtual {v0, p1}, Lcom/qonversion/android/sdk/internal/InternalConfig;->setEntitlementsUpdateListener(Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;)V

    return-void
.end method

.method public final syncPurchases()V
    .locals 3

    .line 440
    sget-object v0, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->SyncPurchases:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p0, v0, v1, v2, v1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->restore$default(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;ILjava/lang/Object;)V

    return-void
.end method
