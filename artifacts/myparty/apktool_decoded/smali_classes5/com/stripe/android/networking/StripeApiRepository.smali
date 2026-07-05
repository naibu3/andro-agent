.class public final Lcom/stripe/android/networking/StripeApiRepository;
.super Ljava/lang/Object;
.source "StripeApiRepository.kt"

# interfaces
.implements Lcom/stripe/android/networking/StripeRepository;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/networking/StripeApiRepository$Companion;,
        Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nStripeApiRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StripeApiRepository.kt\ncom/stripe/android/networking/StripeApiRepository\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ResultKtx.kt\ncom/stripe/android/utils/ResultKtxKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2298:1\n1557#2:2299\n1628#2,3:2300\n1567#2:2310\n1598#2,4:2311\n6#3,3:2303\n6#3,3:2307\n1#4:2306\n*S KotlinDebug\n*F\n+ 1 StripeApiRepository.kt\ncom/stripe/android/networking/StripeApiRepository\n*L\n142#1:2299\n142#1:2300,3\n1476#1:2310\n1476#1:2311,4\n216#1:2303,3\n413#1:2307,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00f2\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0015\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u0003\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010$\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u0008\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008\u0007\u0018\u0000 \u00cd\u00022\u00020\u0001:\u0004\u00cc\u0002\u00cd\u0002B\u00af\u0001\u0008\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c\u0012\u000e\u0008\u0002\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000e\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0010\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0012\u0012\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0014\u0012\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u0016\u0012\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u0018\u0012\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u001a\u0012\u000e\u0008\u0002\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u000e\u0012\u0008\u0008\u0002\u0010\u001d\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u001f\u0010 BS\u0008\u0017\u0012\u0006\u0010!\u001a\u00020\u0003\u0012\u000e\u0008\u0001\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u000c\u0012\u000e\u0008\u0001\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000e\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0004\u0008\u001f\u0010\"J4\u0010)\u001a\u0008\u0012\u0004\u0012\u00020+0*2\u0006\u0010,\u001a\u00020\u00062\u0006\u0010-\u001a\u00020.2\u000c\u0010/\u001a\u0008\u0012\u0004\u0012\u00020\u000600H\u0096@\u00a2\u0006\u0004\u00081\u00102J4\u00103\u001a\u0008\u0012\u0004\u0012\u0002040*2\u0006\u00105\u001a\u0002062\u0006\u0010-\u001a\u00020.2\u000c\u0010/\u001a\u0008\u0012\u0004\u0012\u00020\u000600H\u0096@\u00a2\u0006\u0004\u00087\u00108J4\u00109\u001a\u0008\u0012\u0004\u0012\u0002040*2\u0006\u00105\u001a\u0002062\u0006\u0010-\u001a\u00020.2\u000c\u0010/\u001a\u0008\u0012\u0004\u0012\u00020\u000600H\u0082@\u00a2\u0006\u0004\u0008:\u00108J4\u0010;\u001a\u0008\u0012\u0004\u0012\u0002040*2\u0006\u0010,\u001a\u00020\u00062\u0006\u0010-\u001a\u00020.2\u000c\u0010/\u001a\u0008\u0012\u0004\u0012\u00020\u000600H\u0096@\u00a2\u0006\u0004\u0008<\u00102J&\u0010=\u001a\u0008\u0012\u0004\u0012\u0002040*2\u0006\u0010,\u001a\u00020\u00062\u0006\u0010-\u001a\u00020.H\u0096@\u00a2\u0006\u0004\u0008>\u0010?J&\u0010@\u001a\u0008\u0012\u0004\u0012\u00020A0*2\u0006\u0010,\u001a\u00020\u00062\u0006\u0010-\u001a\u00020.H\u0096@\u00a2\u0006\u0004\u0008B\u0010?J.\u0010C\u001a\u0008\u0012\u0004\u0012\u0002040*2\u0006\u0010D\u001a\u00020\u00062\u0006\u0010E\u001a\u00020\u00062\u0006\u0010-\u001a\u00020.H\u0096@\u00a2\u0006\u0004\u0008F\u0010GJ4\u0010H\u001a\u0008\u0012\u0004\u0012\u00020A0*2\u0006\u0010I\u001a\u00020J2\u0006\u0010-\u001a\u00020.2\u000c\u0010/\u001a\u0008\u0012\u0004\u0012\u00020\u000600H\u0096@\u00a2\u0006\u0004\u0008K\u0010LJ4\u0010M\u001a\u0008\u0012\u0004\u0012\u00020A0*2\u0006\u0010I\u001a\u00020J2\u0006\u0010-\u001a\u00020.2\u000c\u0010/\u001a\u0008\u0012\u0004\u0012\u00020\u000600H\u0082@\u00a2\u0006\u0004\u0008N\u0010LJ4\u0010O\u001a\u0008\u0012\u0004\u0012\u00020A0*2\u0006\u0010,\u001a\u00020\u00062\u0006\u0010-\u001a\u00020.2\u000c\u0010/\u001a\u0008\u0012\u0004\u0012\u00020\u000600H\u0096@\u00a2\u0006\u0004\u0008P\u00102J.\u0010Q\u001a\u0008\u0012\u0004\u0012\u00020A0*2\u0006\u0010R\u001a\u00020\u00062\u0006\u0010E\u001a\u00020\u00062\u0006\u0010-\u001a\u00020.H\u0096@\u00a2\u0006\u0004\u0008S\u0010GJ&\u0010T\u001a\u0008\u0012\u0004\u0012\u00020U0*2\u0006\u0010V\u001a\u00020W2\u0006\u0010-\u001a\u00020.H\u0096@\u00a2\u0006\u0004\u0008X\u0010YJ.\u0010Z\u001a\u0008\u0012\u0004\u0012\u00020U0*2\u0006\u0010E\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u00062\u0006\u0010-\u001a\u00020.H\u0096@\u00a2\u0006\u0004\u0008[\u0010GJ&\u0010\\\u001a\u0008\u0012\u0004\u0012\u00020]0*2\u0006\u0010^\u001a\u00020_2\u0006\u0010-\u001a\u00020.H\u0096@\u00a2\u0006\u0004\u0008`\u0010aJ.\u0010b\u001a\u0008\u0012\u0004\u0012\u00020]0*2\u0006\u0010c\u001a\u00020\u00062\u0006\u0010d\u001a\u00020e2\u0006\u0010-\u001a\u00020.H\u0096@\u00a2\u0006\u0004\u0008f\u0010gJ0\u0010h\u001a\u0008\u0012\u0004\u0012\u00020i0*2\u0006\u0010j\u001a\u00020\u00062\u0008\u0010c\u001a\u0004\u0018\u00010\u00062\u0006\u0010-\u001a\u00020.H\u0096@\u00a2\u0006\u0004\u0008k\u0010GJ&\u0010l\u001a\u0008\u0012\u0004\u0012\u00020m0*2\u0006\u0010n\u001a\u00020o2\u0006\u0010-\u001a\u00020.H\u0096@\u00a2\u0006\u0004\u0008p\u0010qJL\u0010r\u001a\u0008\u0012\u0004\u0012\u00020U0*2\u0006\u0010j\u001a\u00020\u00062\u0006\u0010s\u001a\u00020\u00062\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000e2\u0006\u0010E\u001a\u00020\u00062\u0006\u0010t\u001a\u00020\u00062\u0006\u0010u\u001a\u00020.H\u0096@\u00a2\u0006\u0004\u0008v\u0010wJD\u0010x\u001a\u0008\u0012\u0004\u0012\u00020U0*2\u0006\u0010j\u001a\u00020\u00062\u0006\u0010s\u001a\u00020\u00062\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000e2\u0006\u0010E\u001a\u00020\u00062\u0006\u0010u\u001a\u00020.H\u0096@\u00a2\u0006\u0004\u0008y\u0010zJ<\u0010{\u001a\u0008\u0012\u0004\u0012\u00020]0*2\u0006\u0010j\u001a\u00020\u00062\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000e2\u0006\u0010c\u001a\u00020\u00062\u0006\u0010u\u001a\u00020.H\u0096@\u00a2\u0006\u0004\u0008|\u0010}J5\u0010~\u001a\u0008\u0012\u0004\u0012\u00020]0*2\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000e2\u0006\u0010c\u001a\u00020\u00062\u0006\u0010u\u001a\u00020.H\u0096@\u00a2\u0006\u0005\u0008\u007f\u0010\u0080\u0001J>\u0010~\u001a\u0008\u0012\u0004\u0012\u00020]0*2\u0007\u0010\u0081\u0001\u001a\u00020\u00062\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000e2\u0006\u0010c\u001a\u00020\u00062\u0006\u0010u\u001a\u00020.H\u0096@\u00a2\u0006\u0005\u0008\u0082\u0001\u0010}J?\u0010\u0083\u0001\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020]000*2\u0008\u0010\u0084\u0001\u001a\u00030\u0085\u00012\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000e2\u0006\u0010u\u001a\u00020.H\u0096@\u00a2\u0006\u0006\u0008\u0086\u0001\u0010\u0087\u0001JN\u0010\u0088\u0001\u001a\u0008\u0012\u0004\u0012\u00020i0*2\u0006\u0010j\u001a\u00020\u00062\u0006\u0010s\u001a\u00020\u00062\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000e2\u0006\u0010E\u001a\u00020\u00062\u0006\u0010t\u001a\u00020\u00062\u0006\u0010u\u001a\u00020.H\u0096@\u00a2\u0006\u0005\u0008\u0089\u0001\u0010wJI\u0010\u008a\u0001\u001a\u0008\u0012\u0004\u0012\u00020i0*2\u0006\u0010j\u001a\u00020\u00062\u0006\u0010s\u001a\u00020\u00062\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000e2\u0008\u0010\u008b\u0001\u001a\u00030\u008c\u00012\u0006\u0010u\u001a\u00020.H\u0096@\u00a2\u0006\u0006\u0008\u008d\u0001\u0010\u008e\u0001J7\u0010\u008f\u0001\u001a\u0008\u0012\u0004\u0012\u00020i0*2\u0006\u0010j\u001a\u00020\u00062\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000e2\u0006\u0010u\u001a\u00020.H\u0096@\u00a2\u0006\u0006\u0008\u0090\u0001\u0010\u0091\u0001J<\u0010\u0092\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00060*2\u0007\u0010\u0093\u0001\u001a\u00020\u00062\u0007\u0010\u0094\u0001\u001a\u00020\u00062\u0007\u0010\u0095\u0001\u001a\u00020\u00062\u0006\u0010u\u001a\u00020.H\u0096@\u00a2\u0006\u0006\u0008\u0096\u0001\u0010\u0097\u0001J?\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0099\u00012\u0007\u0010\u0093\u0001\u001a\u00020\u00062\u0007\u0010\u009a\u0001\u001a\u00020\u00062\u0007\u0010\u0094\u0001\u001a\u00020\u00062\u0007\u0010\u0095\u0001\u001a\u00020\u00062\u0006\u0010u\u001a\u00020.H\u0096@\u00a2\u0006\u0003\u0010\u009b\u0001J\"\u0010\u009c\u0001\u001a\t\u0012\u0005\u0012\u00030\u009d\u00010*2\u0006\u0010-\u001a\u00020.H\u0096@\u00a2\u0006\u0006\u0008\u009e\u0001\u0010\u009f\u0001J,\u0010\u00a0\u0001\u001a\t\u0012\u0005\u0012\u00030\u00a1\u00010*2\u0008\u0010\u00a2\u0001\u001a\u00030\u00a3\u00012\u0006\u0010-\u001a\u00020.H\u0096@\u00a2\u0006\u0006\u0008\u00a4\u0001\u0010\u00a5\u0001J,\u0010\u00a6\u0001\u001a\t\u0012\u0005\u0012\u00030\u00a7\u00010*2\u0008\u0010\u00a8\u0001\u001a\u00030\u00a9\u00012\u0006\u0010u\u001a\u00020.H\u0097@\u00a2\u0006\u0006\u0008\u00aa\u0001\u0010\u00ab\u0001J)\u0010\u00ac\u0001\u001a\t\u0012\u0005\u0012\u00030\u00a7\u00010*2\u0006\u0010E\u001a\u00020\u00062\u0006\u0010u\u001a\u00020.H\u0096@\u00a2\u0006\u0005\u0008\u00ad\u0001\u0010?J,\u0010\u00ae\u0001\u001a\t\u0012\u0005\u0012\u00030\u00af\u00010*2\u0008\u0010\u00b0\u0001\u001a\u00030\u00b1\u00012\u0006\u0010u\u001a\u00020.H\u0096@\u00a2\u0006\u0006\u0008\u00b2\u0001\u0010\u00b3\u0001J0\u0010\u00b4\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020\u00060\u00b5\u00010*2\u0007\u0010\u00b6\u0001\u001a\u00020\u00062\u0006\u0010u\u001a\u00020.H\u0096@\u00a2\u0006\u0005\u0008\u00b7\u0001\u0010?J\"\u0010\u00b8\u0001\u001a\t\u0012\u0005\u0012\u00030\u00b9\u00010*2\u0006\u0010u\u001a\u00020.H\u0096@\u00a2\u0006\u0006\u0008\u00ba\u0001\u0010\u009f\u0001J)\u0010\u00bb\u0001\u001a\t\u0012\u0005\u0012\u00030\u00b9\u00010*2\u0006\u0010c\u001a\u00020\u00062\u0006\u0010u\u001a\u00020.H\u0096@\u00a2\u0006\u0005\u0008\u00bc\u0001\u0010?J?\u0010\u00bd\u0001\u001a\t\u0012\u0005\u0012\u00030\u00b9\u00010*2\u0007\u0010\u00be\u0001\u001a\u00020\u00062\u0007\u0010\u00bf\u0001\u001a\u00020\u00062\t\u0010\u00c0\u0001\u001a\u0004\u0018\u00010\u00062\u0006\u0010u\u001a\u00020.H\u0096@\u00a2\u0006\u0006\u0008\u00c1\u0001\u0010\u0097\u0001JI\u0010\u00c2\u0001\u001a\u0008\u0012\u0004\u0012\u00020]0*2\u0007\u0010\u00c3\u0001\u001a\u00020\u00062\u0007\u0010\u00c4\u0001\u001a\u00020\u00062\u0014\u0010\u00c5\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0012\u0002\u0008\u0003\u0018\u00010\u00c6\u00012\u0006\u0010u\u001a\u00020.H\u0096@\u00a2\u0006\u0006\u0008\u00c7\u0001\u0010\u00c8\u0001J5\u0010\u00c9\u0001\u001a\t\u0012\u0005\u0012\u00030\u00ca\u00010*2\u0007\u0010\u00c3\u0001\u001a\u00020\u00062\t\u0010\u00cb\u0001\u001a\u0004\u0018\u00010\u00062\u0006\u0010u\u001a\u00020.H\u0096@\u00a2\u0006\u0005\u0008\u00cc\u0001\u0010GJ,\u0010\u00cd\u0001\u001a\t\u0012\u0005\u0012\u00030\u00ce\u00010*2\u0008\u0010\u00cf\u0001\u001a\u00030\u00d0\u00012\u0006\u0010u\u001a\u00020.H\u0096@\u00a2\u0006\u0006\u0008\u00d1\u0001\u0010\u00d2\u0001J4\u0010\u00d3\u0001\u001a\t\u0012\u0005\u0012\u00030\u00ce\u00010*2\u0006\u0010D\u001a\u00020\u00062\u0008\u0010\u00cf\u0001\u001a\u00030\u00d4\u00012\u0006\u0010u\u001a\u00020.H\u0096@\u00a2\u0006\u0006\u0008\u00d5\u0001\u0010\u00d6\u0001J4\u0010\u00d7\u0001\u001a\t\u0012\u0005\u0012\u00030\u00ce\u00010*2\u0006\u0010R\u001a\u00020\u00062\u0008\u0010\u00cf\u0001\u001a\u00030\u00d4\u00012\u0006\u0010u\u001a\u00020.H\u0096@\u00a2\u0006\u0006\u0008\u00d8\u0001\u0010\u00d6\u0001J\u0017\u0010\u00d9\u0001\u001a\u00020\u00062\u0006\u0010D\u001a\u00020\u0006H\u0001\u00a2\u0006\u0003\u0008\u00da\u0001J\u0017\u0010\u00db\u0001\u001a\u00020\u00062\u0006\u0010R\u001a\u00020\u0006H\u0001\u00a2\u0006\u0003\u0008\u00dc\u0001JH\u0010\u00dd\u0001\u001a\u0008\u0012\u0004\u0012\u0002040*2\u0006\u0010,\u001a\u00020\u00062\u0006\u0010D\u001a\u00020\u00062\u0007\u0010\u00de\u0001\u001a\u00020\u00062\u0006\u0010u\u001a\u00020.2\u000c\u0010/\u001a\u0008\u0012\u0004\u0012\u00020\u000600H\u0096@\u00a2\u0006\u0006\u0008\u00df\u0001\u0010\u00e0\u0001JH\u0010\u00e1\u0001\u001a\u0008\u0012\u0004\u0012\u00020A0*2\u0006\u0010,\u001a\u00020\u00062\u0006\u0010R\u001a\u00020\u00062\u0007\u0010\u00de\u0001\u001a\u00020\u00062\u0006\u0010u\u001a\u00020.2\u000c\u0010/\u001a\u0008\u0012\u0004\u0012\u00020\u000600H\u0096@\u00a2\u0006\u0006\u0008\u00e2\u0001\u0010\u00e0\u0001J=\u0010\u00e3\u0001\u001a\u0008\u0012\u0004\u0012\u0002040*2\u0006\u0010,\u001a\u00020\u00062\u0008\u0010\u00e4\u0001\u001a\u00030\u00e5\u00012\u0008\u0010\u00e6\u0001\u001a\u00030\u00e5\u00012\u0006\u0010u\u001a\u00020.H\u0096@\u00a2\u0006\u0006\u0008\u00e7\u0001\u0010\u00e8\u0001J1\u0010\u00e3\u0001\u001a\u0008\u0012\u0004\u0012\u0002040*2\u0006\u0010,\u001a\u00020\u00062\u0007\u0010\u00e9\u0001\u001a\u00020\u00062\u0006\u0010u\u001a\u00020.H\u0096@\u00a2\u0006\u0005\u0008\u00ea\u0001\u0010GJ=\u0010\u00eb\u0001\u001a\u0008\u0012\u0004\u0012\u00020A0*2\u0006\u0010,\u001a\u00020\u00062\u0008\u0010\u00e4\u0001\u001a\u00030\u00e5\u00012\u0008\u0010\u00e6\u0001\u001a\u00030\u00e5\u00012\u0006\u0010u\u001a\u00020.H\u0096@\u00a2\u0006\u0006\u0008\u00ec\u0001\u0010\u00e8\u0001J1\u0010\u00eb\u0001\u001a\u0008\u0012\u0004\u0012\u00020A0*2\u0006\u0010,\u001a\u00020\u00062\u0007\u0010\u00e9\u0001\u001a\u00020\u00062\u0006\u0010u\u001a\u00020.H\u0096@\u00a2\u0006\u0005\u0008\u00ed\u0001\u0010GJ_\u0010\u00ee\u0001\u001a\t\u0012\u0005\u0012\u00030\u00ef\u00010*2\r\u0010\u00f0\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u0006002\u0008\u0010\u00f1\u0001\u001a\u00030\u00e5\u00012\u0007\u0010\u00f2\u0001\u001a\u00020\u00062\u0007\u0010\u00f3\u0001\u001a\u00020\u00062\u0007\u0010\u00f4\u0001\u001a\u00020\u00062\u0007\u0010\u00f5\u0001\u001a\u00020\u00062\u0006\u0010u\u001a\u00020.H\u0096@\u00a2\u0006\u0006\u0008\u00f6\u0001\u0010\u00f7\u0001J\u0017\u0010\u00f8\u0001\u001a\u00020\u00062\u0006\u0010c\u001a\u00020\u0006H\u0001\u00a2\u0006\u0003\u0008\u00f9\u0001J\u0017\u0010\u00fa\u0001\u001a\u00020\u00062\u0006\u0010c\u001a\u00020\u0006H\u0001\u00a2\u0006\u0003\u0008\u00fb\u0001J,\u0010\u00fc\u0001\u001a\t\u0012\u0005\u0012\u00030\u00fd\u00010*2\u0008\u0010\u00cf\u0001\u001a\u00030\u00fe\u00012\u0006\u0010-\u001a\u00020.H\u0096@\u00a2\u0006\u0006\u0008\u00ff\u0001\u0010\u0080\u0002J*\u0010\u0081\u0002\u001a\t\u0012\u0005\u0012\u00030\u00a1\u00010*2\u0007\u0010\u0082\u0002\u001a\u00020\u00062\u0006\u0010u\u001a\u00020.H\u0096@\u00a2\u0006\u0005\u0008\u0083\u0002\u0010?J:\u0010\u0084\u0002\u001a\t\u0012\u0005\u0012\u00030\u0085\u00020*2\u0006\u0010u\u001a\u00020.2\u0016\u0010\u00cf\u0001\u001a\u0011\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00c6\u0001H\u0096@\u00a2\u0006\u0006\u0008\u0086\u0002\u0010\u0087\u0002J9\u0010\u0088\u0002\u001a\t\u0012\u0005\u0012\u00030\u0089\u00020*2\u0006\u0010,\u001a\u00020\u00062\r\u0010\u008a\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000e2\u0006\u0010u\u001a\u00020.H\u0096@\u00a2\u0006\u0006\u0008\u008b\u0002\u0010\u0091\u0001J)\u0010\u008c\u0002\u001a\t\u0012\u0005\u0012\u00030\u008d\u00020*2\u0006\u0010,\u001a\u00020\u00062\u0006\u0010u\u001a\u00020.H\u0096@\u00a2\u0006\u0005\u0008\u008e\u0002\u0010?J2\u0010\u008f\u0002\u001a\t\u0012\u0005\u0012\u00030\u0090\u00020*2\u0006\u0010,\u001a\u00020\u00062\u0007\u0010\u0091\u0002\u001a\u00020\u00062\u0006\u0010u\u001a\u00020.H\u0096@\u00a2\u0006\u0005\u0008\u0092\u0002\u0010GJ4\u0010\u0093\u0002\u001a\t\u0012\u0005\u0012\u00030\u0089\u00020*2\u0006\u0010,\u001a\u00020\u00062\u0008\u0010\u0094\u0002\u001a\u00030\u0095\u00022\u0006\u0010u\u001a\u00020.H\u0096@\u00a2\u0006\u0006\u0008\u0096\u0002\u0010\u0097\u0002J8\u0010\u00fc\u0001\u001a\t\u0012\u0005\u0012\u00030\u00fd\u00010*2\u0008\u0010\u00cf\u0001\u001a\u00030\u00fe\u00012\u0006\u0010-\u001a\u00020.2\n\u0010\u0098\u0002\u001a\u0005\u0018\u00010\u0099\u0002H\u0082@\u00a2\u0006\u0006\u0008\u009a\u0002\u0010\u009b\u0002J\u001a\u0010\u009c\u0002\u001a\u00030\u0090\u00022\u000e\u0010\u009d\u0002\u001a\t\u0012\u0004\u0012\u00020\u00060\u00b5\u0001H\u0002Jy\u0010\u009e\u0002\u001a\t\u0012\u0005\u0012\u0003H\u009f\u00020*\"\n\u0008\u0000\u0010\u009f\u0002*\u00030\u00a0\u00022\u0008\u0010\u00a1\u0002\u001a\u00030\u00a2\u00022\u000f\u0010\u00a3\u0002\u001a\n\u0012\u0005\u0012\u0003H\u009f\u00020\u00a4\u000226\u0008\u0002\u0010\u00a5\u0002\u001a/\u0012#\u0012!\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020\u00060\u00b5\u00010*\u00a2\u0006\u000f\u0008\u00a7\u0002\u0012\n\u0008\u00a8\u0002\u0012\u0005\u0008\u0008(\u00a9\u0002\u0012\u0005\u0012\u00030\u0090\u00020\u00a6\u0002H\u0082@\u00a2\u0006\u0006\u0008\u00aa\u0002\u0010\u00ab\u0002JZ\u0010\u00ac\u0002\u001a\t\u0012\u0004\u0012\u00020\u00060\u00b5\u00012\u0008\u0010\u00a1\u0002\u001a\u00030\u00a2\u000224\u0010\u00a5\u0002\u001a/\u0012#\u0012!\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020\u00060\u00b5\u00010*\u00a2\u0006\u000f\u0008\u00a7\u0002\u0012\n\u0008\u00a8\u0002\u0012\u0005\u0008\u0008(\u00a9\u0002\u0012\u0005\u0012\u00030\u0090\u00020\u00a6\u0002H\u0081@\u00a2\u0006\u0006\u0008\u00ad\u0002\u0010\u00ae\u0002J>\u0010\u00af\u0002\u001a\t\u0012\u0004\u0012\u00020\u00060\u00b5\u00012\u0008\u0010\u00b0\u0002\u001a\u00030\u00b1\u00022\u0018\u0010\u00a5\u0002\u001a\u0013\u0012\u0007\u0012\u0005\u0018\u00010\u00b2\u0002\u0012\u0005\u0012\u00030\u0090\u00020\u00a6\u0002H\u0081@\u00a2\u0006\u0006\u0008\u00b3\u0002\u0010\u00b4\u0002J\n\u0010\u00b5\u0002\u001a\u00030\u00b6\u0002H\u0002J\u0014\u0010\u00b7\u0002\u001a\u00030\u0090\u00022\u0008\u0010\u00b8\u0002\u001a\u00030\u00b6\u0002H\u0002J\n\u0010\u00b9\u0002\u001a\u00030\u0090\u0002H\u0002J\u0014\u0010\u00ba\u0002\u001a\u00030\u0090\u00022\u0008\u0010\u00bb\u0002\u001a\u00030\u0099\u0002H\u0002J\u001a\u0010\u00ba\u0002\u001a\u00030\u0090\u00022\u0008\u0010\u00cf\u0001\u001a\u00030\u00bc\u0002H\u0001\u00a2\u0006\u0003\u0008\u00bd\u0002J-\u0010\u00be\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0005\u0012\u00030\u00bf\u00020\u00c6\u00012\u0006\u0010,\u001a\u00020\u00062\u000c\u0010/\u001a\u0008\u0012\u0004\u0012\u00020\u000600H\u0002J\'\u0010\u00c0\u0002\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00c1\u00022\u000f\u0008\u0002\u0010\u00c2\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000eH\u0002J\u0018\u0010\u00c3\u0002\u001a\u00020\u00062\r\u0010\u00c2\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000eH\u0016JD\u0010\u00c4\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0005\u0012\u00030\u00bf\u00020\u00c6\u00012\u0015\u0010\u00cf\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0005\u0012\u00030\u00bf\u00020\u00c6\u00012\u0008\u0010^\u001a\u0004\u0018\u00010_2\n\u0008\u0002\u0010V\u001a\u0004\u0018\u00010WH\u0002J%\u0010\u00c5\u0002\u001a\u0008\u0012\u0004\u0012\u0002060**\u0002062\u0006\u0010-\u001a\u00020.H\u0082@\u00a2\u0006\u0006\u0008\u00c6\u0002\u0010\u00c7\u0002J%\u0010\u00c5\u0002\u001a\u0008\u0012\u0004\u0012\u00020J0**\u00020J2\u0006\u0010-\u001a\u00020.H\u0082@\u00a2\u0006\u0006\u0008\u00c6\u0002\u0010\u00c8\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010%\u001a\u0004\u0018\u00010&8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\'\u0010(R*\u0010\u00c9\u0002\u001a\u0004\u0018\u00010\u0006*\u000f\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020\u00060\u00b5\u00010*8BX\u0082\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00ca\u0002\u0010\u00cb\u0002\u00a8\u0006\u00ce\u0002"
    }
    d2 = {
        "Lcom/stripe/android/networking/StripeApiRepository;",
        "Lcom/stripe/android/networking/StripeRepository;",
        "context",
        "Landroid/content/Context;",
        "publishableKeyProvider",
        "Lkotlin/Function0;",
        "",
        "appInfo",
        "Lcom/stripe/android/core/AppInfo;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "workContext",
        "Lkotlin/coroutines/CoroutineContext;",
        "productUsageTokens",
        "",
        "stripeNetworkClient",
        "Lcom/stripe/android/core/networking/StripeNetworkClient;",
        "analyticsRequestExecutor",
        "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;",
        "fraudDetectionDataRepository",
        "Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;",
        "cardAccountRangeRepositoryFactory",
        "Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;",
        "paymentAnalyticsRequestFactory",
        "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;",
        "fraudDetectionDataParamsUtils",
        "Lcom/stripe/android/core/frauddetection/FraudDetectionDataParamsUtils;",
        "betas",
        "Lcom/stripe/android/StripeApiBeta;",
        "apiVersion",
        "sdkVersion",
        "<init>",
        "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/core/AppInfo;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/core/frauddetection/FraudDetectionDataParamsUtils;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;)V",
        "appContext",
        "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/core/Logger;)V",
        "apiRequestFactory",
        "Lcom/stripe/android/core/networking/ApiRequest$Factory;",
        "fraudDetectionData",
        "Lcom/stripe/android/core/frauddetection/FraudDetectionData;",
        "getFraudDetectionData",
        "()Lcom/stripe/android/core/frauddetection/FraudDetectionData;",
        "retrieveStripeIntent",
        "Lkotlin/Result;",
        "Lcom/stripe/android/model/StripeIntent;",
        "clientSecret",
        "options",
        "Lcom/stripe/android/core/networking/ApiRequest$Options;",
        "expandFields",
        "",
        "retrieveStripeIntent-BWLJW6A",
        "(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "confirmPaymentIntent",
        "Lcom/stripe/android/model/PaymentIntent;",
        "confirmPaymentIntentParams",
        "Lcom/stripe/android/model/ConfirmPaymentIntentParams;",
        "confirmPaymentIntent-BWLJW6A",
        "(Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "confirmPaymentIntentInternal",
        "confirmPaymentIntentInternal-BWLJW6A",
        "retrievePaymentIntent",
        "retrievePaymentIntent-BWLJW6A",
        "refreshPaymentIntent",
        "refreshPaymentIntent-0E7RQCE",
        "(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "refreshSetupIntent",
        "Lcom/stripe/android/model/SetupIntent;",
        "refreshSetupIntent-0E7RQCE",
        "cancelPaymentIntentSource",
        "paymentIntentId",
        "sourceId",
        "cancelPaymentIntentSource-BWLJW6A",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "confirmSetupIntent",
        "confirmSetupIntentParams",
        "Lcom/stripe/android/model/ConfirmSetupIntentParams;",
        "confirmSetupIntent-BWLJW6A",
        "(Lcom/stripe/android/model/ConfirmSetupIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "confirmSetupIntentInternal",
        "confirmSetupIntentInternal-BWLJW6A",
        "retrieveSetupIntent",
        "retrieveSetupIntent-BWLJW6A",
        "cancelSetupIntentSource",
        "setupIntentId",
        "cancelSetupIntentSource-BWLJW6A",
        "createSource",
        "Lcom/stripe/android/model/Source;",
        "sourceParams",
        "Lcom/stripe/android/model/SourceParams;",
        "createSource-0E7RQCE",
        "(Lcom/stripe/android/model/SourceParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "retrieveSource",
        "retrieveSource-BWLJW6A",
        "createPaymentMethod",
        "Lcom/stripe/android/model/PaymentMethod;",
        "paymentMethodCreateParams",
        "Lcom/stripe/android/model/PaymentMethodCreateParams;",
        "createPaymentMethod-0E7RQCE",
        "(Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "updatePaymentMethod",
        "paymentMethodId",
        "paymentMethodUpdateParams",
        "Lcom/stripe/android/model/PaymentMethodUpdateParams;",
        "updatePaymentMethod-BWLJW6A",
        "(Ljava/lang/String;Lcom/stripe/android/model/PaymentMethodUpdateParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "setDefaultPaymentMethod",
        "Lcom/stripe/android/model/Customer;",
        "customerId",
        "setDefaultPaymentMethod-BWLJW6A",
        "createToken",
        "Lcom/stripe/android/model/Token;",
        "tokenParams",
        "Lcom/stripe/android/model/TokenParams;",
        "createToken-0E7RQCE",
        "(Lcom/stripe/android/model/TokenParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "addCustomerSource",
        "publishableKey",
        "sourceType",
        "requestOptions",
        "addCustomerSource-bMdYcbs",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "deleteCustomerSource",
        "deleteCustomerSource-hUnOzRk",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "attachPaymentMethod",
        "attachPaymentMethod-yxL6bBk",
        "(Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "detachPaymentMethod",
        "detachPaymentMethod-BWLJW6A",
        "(Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "customerSessionClientSecret",
        "detachPaymentMethod-yxL6bBk",
        "getPaymentMethods",
        "listPaymentMethodsParams",
        "Lcom/stripe/android/model/ListPaymentMethodsParams;",
        "getPaymentMethods-BWLJW6A",
        "(Lcom/stripe/android/model/ListPaymentMethodsParams;Ljava/util/Set;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "setDefaultCustomerSource",
        "setDefaultCustomerSource-bMdYcbs",
        "setCustomerShippingInfo",
        "shippingInformation",
        "Lcom/stripe/android/model/ShippingInformation;",
        "setCustomerShippingInfo-hUnOzRk",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/model/ShippingInformation;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "retrieveCustomer",
        "retrieveCustomer-BWLJW6A",
        "(Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "retrieveIssuingCardPin",
        "cardId",
        "verificationId",
        "userOneTimeCode",
        "retrieveIssuingCardPin-yxL6bBk",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "updateIssuingCardPin",
        "",
        "newPin",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "getFpxBankStatus",
        "Lcom/stripe/android/model/BankStatuses;",
        "getFpxBankStatus-gIAlu-s",
        "(Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "getCardMetadata",
        "Lcom/stripe/android/model/CardMetadata;",
        "bin",
        "Lcom/stripe/android/cards/Bin;",
        "getCardMetadata-0E7RQCE",
        "(Lcom/stripe/android/cards/Bin;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "start3ds2Auth",
        "Lcom/stripe/android/model/Stripe3ds2AuthResult;",
        "authParams",
        "Lcom/stripe/android/model/Stripe3ds2AuthParams;",
        "start3ds2Auth-0E7RQCE",
        "(Lcom/stripe/android/model/Stripe3ds2AuthParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "complete3ds2Auth",
        "complete3ds2Auth-0E7RQCE",
        "createFile",
        "Lcom/stripe/android/core/model/StripeFile;",
        "fileParams",
        "Lcom/stripe/android/core/model/StripeFileParams;",
        "createFile-0E7RQCE",
        "(Lcom/stripe/android/core/model/StripeFileParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "retrieveObject",
        "Lcom/stripe/android/core/networking/StripeResponse;",
        "url",
        "retrieveObject-0E7RQCE",
        "createRadarSession",
        "Lcom/stripe/android/model/RadarSessionWithHCaptcha;",
        "createRadarSession-gIAlu-s",
        "createSavedPaymentMethodRadarSession",
        "createSavedPaymentMethodRadarSession-0E7RQCE",
        "attachHCaptchaToRadarSession",
        "radarSessionToken",
        "hcaptchaToken",
        "hcaptchaEKey",
        "attachHCaptchaToRadarSession-yxL6bBk",
        "sharePaymentDetails",
        "consumerSessionClientSecret",
        "id",
        "extraParams",
        "",
        "sharePaymentDetails-yxL6bBk",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "logOut",
        "Lcom/stripe/android/model/ConsumerSession;",
        "consumerAccountPublishableKey",
        "logOut-BWLJW6A",
        "createFinancialConnectionsSessionForDeferredPayments",
        "Lcom/stripe/android/model/FinancialConnectionsSession;",
        "params",
        "Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;",
        "createFinancialConnectionsSessionForDeferredPayments-0E7RQCE",
        "(Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "createPaymentIntentFinancialConnectionsSession",
        "Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams;",
        "createPaymentIntentFinancialConnectionsSession-BWLJW6A",
        "(Ljava/lang/String;Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "createSetupIntentFinancialConnectionsSession",
        "createSetupIntentFinancialConnectionsSession-BWLJW6A",
        "getPaymentIntentFinancialConnectionsSessionUrl",
        "getPaymentIntentFinancialConnectionsSessionUrl$payments_core_release",
        "getSetupIntentFinancialConnectionsSessionUrl",
        "getSetupIntentFinancialConnectionsSessionUrl$payments_core_release",
        "attachFinancialConnectionsSessionToPaymentIntent",
        "financialConnectionsSessionId",
        "attachFinancialConnectionsSessionToPaymentIntent-hUnOzRk",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "attachFinancialConnectionsSessionToSetupIntent",
        "attachFinancialConnectionsSessionToSetupIntent-hUnOzRk",
        "verifyPaymentIntentWithMicrodeposits",
        "firstAmount",
        "",
        "secondAmount",
        "verifyPaymentIntentWithMicrodeposits-yxL6bBk",
        "(Ljava/lang/String;IILcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "descriptorCode",
        "verifyPaymentIntentWithMicrodeposits-BWLJW6A",
        "verifySetupIntentWithMicrodeposits",
        "verifySetupIntentWithMicrodeposits-yxL6bBk",
        "verifySetupIntentWithMicrodeposits-BWLJW6A",
        "retrievePaymentMethodMessage",
        "Lcom/stripe/android/model/PaymentMethodMessage;",
        "paymentMethods",
        "amount",
        "currency",
        "country",
        "locale",
        "logoColor",
        "retrievePaymentMethodMessage-eH_QyT8",
        "(Ljava/util/List;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "getDetachPaymentMethodUrl",
        "getDetachPaymentMethodUrl$payments_core_release",
        "getElementsDetachPaymentMethodUrl",
        "getElementsDetachPaymentMethodUrl$payments_core_release",
        "retrieveElementsSession",
        "Lcom/stripe/android/model/ElementsSession;",
        "Lcom/stripe/android/model/ElementsSessionParams;",
        "retrieveElementsSession-0E7RQCE",
        "(Lcom/stripe/android/model/ElementsSessionParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "retrieveCardMetadata",
        "cardNumber",
        "retrieveCardMetadata-0E7RQCE",
        "retrieveCardElementConfig",
        "Lcom/stripe/android/model/MobileCardElementConfig;",
        "retrieveCardElementConfig-0E7RQCE",
        "(Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "listPaymentDetails",
        "Lcom/stripe/android/model/ConsumerPaymentDetails;",
        "paymentMethodTypes",
        "listPaymentDetails-BWLJW6A",
        "listShippingAddresses",
        "Lcom/stripe/android/model/ConsumerShippingAddresses;",
        "listShippingAddresses-0E7RQCE",
        "deletePaymentDetails",
        "",
        "paymentDetailsId",
        "deletePaymentDetails-BWLJW6A",
        "updatePaymentDetails",
        "paymentDetailsUpdateParams",
        "Lcom/stripe/android/model/ConsumerPaymentDetailsUpdateParams;",
        "updatePaymentDetails-BWLJW6A",
        "(Ljava/lang/String;Lcom/stripe/android/model/ConsumerPaymentDetailsUpdateParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "analyticsEvent",
        "Lcom/stripe/android/networking/PaymentAnalyticsEvent;",
        "retrieveElementsSession-BWLJW6A",
        "(Lcom/stripe/android/model/ElementsSessionParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "handleApiError",
        "response",
        "fetchStripeModelResult",
        "ModelType",
        "Lcom/stripe/android/core/model/StripeModel;",
        "apiRequest",
        "Lcom/stripe/android/core/networking/ApiRequest;",
        "jsonParser",
        "Lcom/stripe/android/core/model/parsers/ModelJsonParser;",
        "onResponse",
        "Lkotlin/Function1;",
        "Lkotlin/ParameterName;",
        "name",
        "result",
        "fetchStripeModelResult-BWLJW6A",
        "(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "makeApiRequest",
        "makeApiRequest$payments_core_release",
        "(Lcom/stripe/android/core/networking/ApiRequest;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "makeFileUploadRequest",
        "fileUploadRequest",
        "Lcom/stripe/android/core/networking/FileUploadRequest;",
        "Lcom/stripe/android/core/networking/RequestId;",
        "makeFileUploadRequest$payments_core_release",
        "(Lcom/stripe/android/core/networking/FileUploadRequest;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "disableDnsCache",
        "Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData;",
        "resetDnsCache",
        "dnsCacheData",
        "fireFraudDetectionDataRequest",
        "fireAnalyticsRequest",
        "event",
        "Lcom/stripe/android/core/networking/AnalyticsRequest;",
        "fireAnalyticsRequest$payments_core_release",
        "createClientSecretParam",
        "",
        "buildPaymentUserAgentPair",
        "Lkotlin/Pair;",
        "attribution",
        "buildPaymentUserAgent",
        "maybeAddPaymentUserAgent",
        "maybeForDashboard",
        "maybeForDashboard-0E7RQCE",
        "(Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "(Lcom/stripe/android/model/ConfirmSetupIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "errorMessage",
        "getErrorMessage",
        "(Ljava/lang/Object;)Ljava/lang/String;",
        "DnsCacheData",
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
.field public static final $stable:I

.field public static final Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

.field private static final DNS_CACHE_TTL_PROPERTY_NAME:Ljava/lang/String; = "networkaddress.cache.ttl"

.field private static final PAYMENT_USER_AGENT:Ljava/lang/String; = "payment_user_agent"


# instance fields
.field private final analyticsRequestExecutor:Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

.field private final apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

.field private final appInfo:Lcom/stripe/android/core/AppInfo;

.field private final cardAccountRangeRepositoryFactory:Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;

.field private final context:Landroid/content/Context;

.field private final fraudDetectionDataParamsUtils:Lcom/stripe/android/core/frauddetection/FraudDetectionDataParamsUtils;

.field private final fraudDetectionDataRepository:Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;

.field private final logger:Lcom/stripe/android/core/Logger;

.field private final paymentAnalyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

.field private final productUsageTokens:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final publishableKeyProvider:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final stripeNetworkClient:Lcom/stripe/android/core/networking/StripeNetworkClient;

.field private final workContext:Lkotlin/coroutines/CoroutineContext;


# direct methods
.method public static synthetic $r8$lambda$086QnPfFtpaiuZbRO20c0QWj-J0(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/Result;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/networking/StripeApiRepository;->retrievePaymentIntent_BWLJW6A$lambda$8(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/Result;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$0iOx-DEAWdhvxYcVfWxYZ_bgGlA(Lcom/stripe/android/networking/StripeApiRepository;Ljava/util/Set;Lkotlin/Result;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/networking/StripeApiRepository;->getPaymentMethods_BWLJW6A$lambda$35(Lcom/stripe/android/networking/StripeApiRepository;Ljava/util/Set;Lkotlin/Result;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$1COP9026FFvibBr7QMIFut6GGAU(Lcom/stripe/android/networking/StripeApiRepository;Ljava/util/Set;Lkotlin/Result;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/networking/StripeApiRepository;->retrieveCustomer_BWLJW6A$lambda$39(Lcom/stripe/android/networking/StripeApiRepository;Ljava/util/Set;Lkotlin/Result;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$1RMqwseF6EiGITJEJUeHGiISK9s(Lcom/stripe/android/networking/StripeApiRepository;Ljava/util/Set;Lkotlin/Result;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/networking/StripeApiRepository;->deleteCustomerSource_hUnOzRk$lambda$31(Lcom/stripe/android/networking/StripeApiRepository;Ljava/util/Set;Lkotlin/Result;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$3ZNXnHfIRMyIBvu_17jsSnA-Sbo(Lcom/stripe/android/networking/StripeApiRepository;Lcom/stripe/android/core/networking/RequestId;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/networking/StripeApiRepository;->createFile_0E7RQCE$lambda$48$lambda$47(Lcom/stripe/android/networking/StripeApiRepository;Lcom/stripe/android/core/networking/RequestId;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$4LNUvo7YisnpXE31GWy6Z85-ohY(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/Result;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/networking/StripeApiRepository;->refreshPaymentIntent_0E7RQCE$lambda$11(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/Result;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$9bna--rE5a6laWaUh37b-84l1WM(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/Result;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/networking/StripeApiRepository;->retrieveSetupIntent_BWLJW6A$lambda$23(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/Result;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$CoVUowZw6CadmuOzmm3FeiL-TEc(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/Result;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/networking/StripeApiRepository;->start3ds2Auth_0E7RQCE$lambda$46(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/Result;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$Cr9W6RvRFFfmmUGwYBdyFr-x4LY(Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/Result;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/networking/StripeApiRepository;->confirmPaymentIntentInternal_BWLJW6A$lambda$5(Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/Result;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$DOlUFznU-DZhp8M8L0OEg7qOSZI(Lkotlin/Result;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/networking/StripeApiRepository;->deletePaymentDetails_BWLJW6A$lambda$84$lambda$83(Lkotlin/Result;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$G6Iy7xh1MNMv1eVwz_uNOwOtSq0(Lkotlin/Result;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModelResult_BWLJW6A$lambda$101(Lkotlin/Result;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$GTtQl1gTf23IlH3Hq_zuHyXX1-8(Lcom/stripe/android/networking/StripeApiRepository;Lcom/stripe/android/model/PaymentMethodUpdateParams;Lkotlin/Result;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/networking/StripeApiRepository;->updatePaymentMethod_BWLJW6A$lambda$28(Lcom/stripe/android/networking/StripeApiRepository;Lcom/stripe/android/model/PaymentMethodUpdateParams;Lkotlin/Result;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$Hp77UQPgygJm4Q9rWC0ZCSaDizg(Lcom/stripe/android/networking/StripeApiRepository;Ljava/util/Set;Lkotlin/Result;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/networking/StripeApiRepository;->attachPaymentMethod_yxL6bBk$lambda$32(Lcom/stripe/android/networking/StripeApiRepository;Ljava/util/Set;Lkotlin/Result;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$Ny4X8-JlEAJjKSfwkPnPswFHrp8(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/Result;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/networking/StripeApiRepository;->refreshSetupIntent_0E7RQCE$lambda$14(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/Result;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$Ova7zBK1QIAZab1aHw3W1MGClZQ(Lcom/stripe/android/networking/StripeApiRepository;Ljava/util/Set;Ljava/lang/String;Lkotlin/Result;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/stripe/android/networking/StripeApiRepository;->addCustomerSource_bMdYcbs$lambda$30(Lcom/stripe/android/networking/StripeApiRepository;Ljava/util/Set;Ljava/lang/String;Lkotlin/Result;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$P409ni2g0VrTIkIlqRRE4fkFvuU(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/Result;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/networking/StripeApiRepository;->retrieveIssuingCardPin_yxL6bBk$lambda$40(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/Result;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$QjVsL0tAPnF4dAa5CUzP4Vk3m50(Lkotlin/Result;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/networking/StripeApiRepository;->attachFinancialConnectionsSessionToPaymentIntent_hUnOzRk$lambda$69(Lkotlin/Result;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$XDa6ccu4Sn9O1k0pjwPodbbG6j0(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/Result;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/networking/StripeApiRepository;->retrieveSource_BWLJW6A$lambda$26(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/Result;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$XQLnXL2gmmZROHgujmHhxNgrBko(Lkotlin/Result;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/networking/StripeApiRepository;->retrievePaymentMethodMessage_eH_QyT8$lambda$82(Lkotlin/Result;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$YF_9q4l-VPNSdXlfbPSKZHWFIms(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/Result;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/networking/StripeApiRepository;->updateIssuingCardPin$lambda$43$lambda$42(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/Result;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$Z9N2Hxyh0JEIkc5Z-FhjnY2gngA(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/Result;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/networking/StripeApiRepository;->retrieveObject_0E7RQCE$lambda$51$lambda$50(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/Result;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$aNnP6AkFvgyuOuHmWUcolP4LZzA(Lkotlin/Result;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/networking/StripeApiRepository;->createPaymentIntentFinancialConnectionsSession_BWLJW6A$lambda$67(Lkotlin/Result;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$fs7SIcGNZ3PiG9YclCNLyOWNUgc(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/Result;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/networking/StripeApiRepository;->createRadarSession_gIAlu_s$lambda$56$lambda$55(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/Result;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$jkKgZGA4iHt3MTIPup5VA5w18E8(Lkotlin/Result;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/networking/StripeApiRepository;->createFinancialConnectionsSessionForDeferredPayments_0E7RQCE$lambda$66(Lkotlin/Result;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$jpeBDMyhXFwwwEDXBPIMrJiSfds(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/Result;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/networking/StripeApiRepository;->cancelPaymentIntentSource_BWLJW6A$lambda$15(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/Result;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$k2YhFlw-PEWcBZzxIIN4AyDDRQY(Lcom/stripe/android/networking/StripeApiRepository;Lcom/stripe/android/model/TokenParams;Lkotlin/Result;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/networking/StripeApiRepository;->createToken_0E7RQCE$lambda$29(Lcom/stripe/android/networking/StripeApiRepository;Lcom/stripe/android/model/TokenParams;Lkotlin/Result;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$mGrtCDIIHezppjnA0XbOojNU8AE(Lcom/stripe/android/networking/StripeApiRepository;Ljava/util/Set;Lkotlin/Result;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/networking/StripeApiRepository;->detachPaymentMethod_BWLJW6A$lambda$33(Lcom/stripe/android/networking/StripeApiRepository;Ljava/util/Set;Lkotlin/Result;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$n8-AglQ9BQO-OZDXQwQ3vaHNS4o(Lkotlin/Result;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/networking/StripeApiRepository;->createSetupIntentFinancialConnectionsSession_BWLJW6A$lambda$68(Lkotlin/Result;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$nEmnmBzTfF3ncupAatzFQJ-sfhE(Lcom/stripe/android/networking/StripeApiRepository;Ljava/util/Set;Lkotlin/Result;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/networking/StripeApiRepository;->setCustomerShippingInfo_hUnOzRk$lambda$38(Lcom/stripe/android/networking/StripeApiRepository;Ljava/util/Set;Lkotlin/Result;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$nu83v3A9yDFJIqaIoFeCgvDFqGQ(Lkotlin/Result;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/networking/StripeApiRepository;->verifyPaymentIntentWithMicrodeposits_BWLJW6A$lambda$76(Lkotlin/Result;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$ovCklfqXTVymn9EY9lkAaKyGMk0(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/Result;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/networking/StripeApiRepository;->createSavedPaymentMethodRadarSession_0E7RQCE$lambda$62$lambda$61(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/Result;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$pMtK8_alPvYo9qSe9TW7XWIm8oA(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/Result;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/networking/StripeApiRepository;->getFpxBankStatus_gIAlu_s$lambda$44(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/Result;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$qLIPPKnYg4EkgayOMpoZn67uIWs(Lkotlin/Result;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/networking/StripeApiRepository;->attachFinancialConnectionsSessionToSetupIntent_hUnOzRk$lambda$70(Lkotlin/Result;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$sAe0tM5VV85Jr2w5fLrht_hS7pU(Lcom/stripe/android/networking/StripeApiRepository;Ljava/util/Set;Ljava/lang/String;Lkotlin/Result;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/stripe/android/networking/StripeApiRepository;->setDefaultCustomerSource_bMdYcbs$lambda$37(Lcom/stripe/android/networking/StripeApiRepository;Ljava/util/Set;Ljava/lang/String;Lkotlin/Result;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$tsZQf9XTSD42F34E94w_Fgrc6EI(Lcom/stripe/android/networking/StripeApiRepository;Lcom/stripe/android/model/ConfirmSetupIntentParams;Lkotlin/Result;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/networking/StripeApiRepository;->confirmSetupIntentInternal_BWLJW6A$lambda$20(Lcom/stripe/android/networking/StripeApiRepository;Lcom/stripe/android/model/ConfirmSetupIntentParams;Lkotlin/Result;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$usUTH-UVZikcDCiyoeio4ulwd4w(Lkotlin/Result;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/networking/StripeApiRepository;->verifyPaymentIntentWithMicrodeposits_yxL6bBk$lambda$73(Lkotlin/Result;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$vq41y-k0xhWixsTi1xug4OqFMaQ(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/Result;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/networking/StripeApiRepository;->cancelSetupIntentSource_BWLJW6A$lambda$24(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/Result;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$wT1-zoN8lAyEsl6pD_9LQzBRa5c(Lcom/stripe/android/networking/StripeApiRepository;Lcom/stripe/android/model/SourceParams;Lkotlin/Result;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/networking/StripeApiRepository;->createSource_0E7RQCE$lambda$25(Lcom/stripe/android/networking/StripeApiRepository;Lcom/stripe/android/model/SourceParams;Lkotlin/Result;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$wUNXtbFejm_SG1XXkMMXnw3KlDk(Lcom/stripe/android/networking/StripeApiRepository;Lcom/stripe/android/model/PaymentMethodCreateParams;Lkotlin/Result;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/networking/StripeApiRepository;->createPaymentMethod_0E7RQCE$lambda$27(Lcom/stripe/android/networking/StripeApiRepository;Lcom/stripe/android/model/PaymentMethodCreateParams;Lkotlin/Result;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$yQJtAqkmP901_bxt9d6tDwqfpGo(Lcom/stripe/android/networking/PaymentAnalyticsEvent;Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/Result;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/networking/StripeApiRepository;->retrieveElementsSession_BWLJW6A$lambda$100(Lcom/stripe/android/networking/PaymentAnalyticsEvent;Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/Result;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$ybJWPztLVqWveRtMLqNgUCxdweI(Lcom/stripe/android/networking/StripeApiRepository;Ljava/util/Set;Lkotlin/Result;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/networking/StripeApiRepository;->detachPaymentMethod_yxL6bBk$lambda$34(Lcom/stripe/android/networking/StripeApiRepository;Ljava/util/Set;Lkotlin/Result;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/networking/StripeApiRepository$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/networking/StripeApiRepository$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/networking/StripeApiRepository;->$stable:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "context"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "publishableKeyProvider"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v17, 0x7ffc

    const/16 v18, 0x0

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

    move-object/from16 v1, p0

    invoke-direct/range {v1 .. v18}, Lcom/stripe/android/networking/StripeApiRepository;-><init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/core/AppInfo;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/core/frauddetection/FraudDetectionDataParamsUtils;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/core/AppInfo;)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/core/AppInfo;",
            ")V"
        }
    .end annotation

    const-string v0, "context"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "publishableKeyProvider"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v17, 0x7ff8

    const/16 v18, 0x0

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

    move-object/from16 v1, p0

    move-object/from16 v4, p3

    invoke-direct/range {v1 .. v18}, Lcom/stripe/android/networking/StripeApiRepository;-><init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/core/AppInfo;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/core/frauddetection/FraudDetectionDataParamsUtils;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/core/AppInfo;Lcom/stripe/android/core/Logger;)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/core/AppInfo;",
            "Lcom/stripe/android/core/Logger;",
            ")V"
        }
    .end annotation

    const-string v0, "context"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "publishableKeyProvider"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v17, 0x7ff0

    const/16 v18, 0x0

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

    move-object/from16 v1, p0

    move-object/from16 v4, p3

    invoke-direct/range {v1 .. v18}, Lcom/stripe/android/networking/StripeApiRepository;-><init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/core/AppInfo;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/core/frauddetection/FraudDetectionDataParamsUtils;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/core/AppInfo;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/core/AppInfo;",
            "Lcom/stripe/android/core/Logger;",
            "Lkotlin/coroutines/CoroutineContext;",
            ")V"
        }
    .end annotation

    const-string v0, "context"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "publishableKeyProvider"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v17, 0x7fe0

    const/16 v18, 0x0

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

    move-object/from16 v1, p0

    move-object/from16 v4, p3

    invoke-direct/range {v1 .. v18}, Lcom/stripe/android/networking/StripeApiRepository;-><init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/core/AppInfo;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/core/frauddetection/FraudDetectionDataParamsUtils;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/core/AppInfo;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/core/AppInfo;",
            "Lcom/stripe/android/core/Logger;",
            "Lkotlin/coroutines/CoroutineContext;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "context"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "publishableKeyProvider"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "productUsageTokens"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v17, 0x7fc0

    const/16 v18, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v1, p0

    move-object/from16 v4, p3

    invoke-direct/range {v1 .. v18}, Lcom/stripe/android/networking/StripeApiRepository;-><init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/core/AppInfo;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/core/frauddetection/FraudDetectionDataParamsUtils;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/core/AppInfo;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;Lcom/stripe/android/core/networking/StripeNetworkClient;)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/core/AppInfo;",
            "Lcom/stripe/android/core/Logger;",
            "Lkotlin/coroutines/CoroutineContext;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/core/networking/StripeNetworkClient;",
            ")V"
        }
    .end annotation

    const-string v0, "context"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "publishableKeyProvider"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "productUsageTokens"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stripeNetworkClient"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v17, 0x7f80

    const/16 v18, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v1, p0

    move-object/from16 v4, p3

    invoke-direct/range {v1 .. v18}, Lcom/stripe/android/networking/StripeApiRepository;-><init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/core/AppInfo;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/core/frauddetection/FraudDetectionDataParamsUtils;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/core/AppInfo;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/core/AppInfo;",
            "Lcom/stripe/android/core/Logger;",
            "Lkotlin/coroutines/CoroutineContext;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/core/networking/StripeNetworkClient;",
            "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;",
            ")V"
        }
    .end annotation

    const-string v0, "context"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "publishableKeyProvider"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "productUsageTokens"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stripeNetworkClient"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsRequestExecutor"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v17, 0x7f00

    const/16 v18, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v1, p0

    move-object/from16 v4, p3

    invoke-direct/range {v1 .. v18}, Lcom/stripe/android/networking/StripeApiRepository;-><init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/core/AppInfo;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/core/frauddetection/FraudDetectionDataParamsUtils;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/core/AppInfo;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/core/AppInfo;",
            "Lcom/stripe/android/core/Logger;",
            "Lkotlin/coroutines/CoroutineContext;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/core/networking/StripeNetworkClient;",
            "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;",
            "Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;",
            ")V"
        }
    .end annotation

    const-string v0, "context"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "publishableKeyProvider"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "productUsageTokens"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stripeNetworkClient"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsRequestExecutor"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fraudDetectionDataRepository"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v17, 0x7e00

    const/16 v18, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v1, p0

    move-object/from16 v4, p3

    invoke-direct/range {v1 .. v18}, Lcom/stripe/android/networking/StripeApiRepository;-><init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/core/AppInfo;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/core/frauddetection/FraudDetectionDataParamsUtils;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/core/AppInfo;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/core/AppInfo;",
            "Lcom/stripe/android/core/Logger;",
            "Lkotlin/coroutines/CoroutineContext;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/core/networking/StripeNetworkClient;",
            "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;",
            "Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;",
            "Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;",
            ")V"
        }
    .end annotation

    const-string v0, "context"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "publishableKeyProvider"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "productUsageTokens"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stripeNetworkClient"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsRequestExecutor"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fraudDetectionDataRepository"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cardAccountRangeRepositoryFactory"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v17, 0x7c00

    const/16 v18, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v1, p0

    move-object/from16 v4, p3

    invoke-direct/range {v1 .. v18}, Lcom/stripe/android/networking/StripeApiRepository;-><init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/core/AppInfo;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/core/frauddetection/FraudDetectionDataParamsUtils;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/core/AppInfo;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/core/AppInfo;",
            "Lcom/stripe/android/core/Logger;",
            "Lkotlin/coroutines/CoroutineContext;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/core/networking/StripeNetworkClient;",
            "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;",
            "Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;",
            "Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;",
            "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;",
            ")V"
        }
    .end annotation

    const-string v0, "context"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "publishableKeyProvider"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "productUsageTokens"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stripeNetworkClient"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsRequestExecutor"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fraudDetectionDataRepository"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cardAccountRangeRepositoryFactory"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentAnalyticsRequestFactory"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v17, 0x7800

    const/16 v18, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v1, p0

    move-object/from16 v4, p3

    invoke-direct/range {v1 .. v18}, Lcom/stripe/android/networking/StripeApiRepository;-><init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/core/AppInfo;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/core/frauddetection/FraudDetectionDataParamsUtils;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/core/AppInfo;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/core/frauddetection/FraudDetectionDataParamsUtils;)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/core/AppInfo;",
            "Lcom/stripe/android/core/Logger;",
            "Lkotlin/coroutines/CoroutineContext;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/core/networking/StripeNetworkClient;",
            "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;",
            "Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;",
            "Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;",
            "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;",
            "Lcom/stripe/android/core/frauddetection/FraudDetectionDataParamsUtils;",
            ")V"
        }
    .end annotation

    const-string v0, "context"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "publishableKeyProvider"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "productUsageTokens"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stripeNetworkClient"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsRequestExecutor"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fraudDetectionDataRepository"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cardAccountRangeRepositoryFactory"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentAnalyticsRequestFactory"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fraudDetectionDataParamsUtils"

    move-object/from16 v13, p12

    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v17, 0x7000

    const/16 v18, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v1, p0

    move-object/from16 v4, p3

    invoke-direct/range {v1 .. v18}, Lcom/stripe/android/networking/StripeApiRepository;-><init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/core/AppInfo;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/core/frauddetection/FraudDetectionDataParamsUtils;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/core/AppInfo;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/core/frauddetection/FraudDetectionDataParamsUtils;Ljava/util/Set;)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/core/AppInfo;",
            "Lcom/stripe/android/core/Logger;",
            "Lkotlin/coroutines/CoroutineContext;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/core/networking/StripeNetworkClient;",
            "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;",
            "Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;",
            "Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;",
            "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;",
            "Lcom/stripe/android/core/frauddetection/FraudDetectionDataParamsUtils;",
            "Ljava/util/Set<",
            "+",
            "Lcom/stripe/android/StripeApiBeta;",
            ">;)V"
        }
    .end annotation

    const-string v0, "context"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "publishableKeyProvider"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "productUsageTokens"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stripeNetworkClient"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsRequestExecutor"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fraudDetectionDataRepository"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cardAccountRangeRepositoryFactory"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentAnalyticsRequestFactory"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fraudDetectionDataParamsUtils"

    move-object/from16 v13, p12

    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "betas"

    move-object/from16 v14, p13

    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v17, 0x6000

    const/16 v18, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v1, p0

    move-object/from16 v4, p3

    invoke-direct/range {v1 .. v18}, Lcom/stripe/android/networking/StripeApiRepository;-><init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/core/AppInfo;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/core/frauddetection/FraudDetectionDataParamsUtils;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/core/AppInfo;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/core/frauddetection/FraudDetectionDataParamsUtils;Ljava/util/Set;Ljava/lang/String;)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/core/AppInfo;",
            "Lcom/stripe/android/core/Logger;",
            "Lkotlin/coroutines/CoroutineContext;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/core/networking/StripeNetworkClient;",
            "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;",
            "Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;",
            "Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;",
            "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;",
            "Lcom/stripe/android/core/frauddetection/FraudDetectionDataParamsUtils;",
            "Ljava/util/Set<",
            "+",
            "Lcom/stripe/android/StripeApiBeta;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "context"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "publishableKeyProvider"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "productUsageTokens"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stripeNetworkClient"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsRequestExecutor"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fraudDetectionDataRepository"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cardAccountRangeRepositoryFactory"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentAnalyticsRequestFactory"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fraudDetectionDataParamsUtils"

    move-object/from16 v13, p12

    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "betas"

    move-object/from16 v14, p13

    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "apiVersion"

    move-object/from16 v15, p14

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v17, 0x4000

    const/16 v18, 0x0

    const/16 v16, 0x0

    move-object/from16 v1, p0

    move-object/from16 v4, p3

    invoke-direct/range {v1 .. v18}, Lcom/stripe/android/networking/StripeApiRepository;-><init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/core/AppInfo;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/core/frauddetection/FraudDetectionDataParamsUtils;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/core/AppInfo;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/core/frauddetection/FraudDetectionDataParamsUtils;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/core/AppInfo;",
            "Lcom/stripe/android/core/Logger;",
            "Lkotlin/coroutines/CoroutineContext;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/core/networking/StripeNetworkClient;",
            "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;",
            "Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;",
            "Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;",
            "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;",
            "Lcom/stripe/android/core/frauddetection/FraudDetectionDataParamsUtils;",
            "Ljava/util/Set<",
            "+",
            "Lcom/stripe/android/StripeApiBeta;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    move-object/from16 v12, p12

    move-object/from16 v13, p14

    move-object/from16 v14, p15

    const-string v15, "context"

    invoke-static {v1, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "publishableKeyProvider"

    invoke-static {v2, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "logger"

    invoke-static {v4, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "workContext"

    invoke-static {v5, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "productUsageTokens"

    invoke-static {v6, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "stripeNetworkClient"

    invoke-static {v7, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "analyticsRequestExecutor"

    invoke-static {v8, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "fraudDetectionDataRepository"

    invoke-static {v9, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "cardAccountRangeRepositoryFactory"

    invoke-static {v10, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "paymentAnalyticsRequestFactory"

    invoke-static {v11, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "fraudDetectionDataParamsUtils"

    invoke-static {v12, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "betas"

    move-object/from16 v12, p13

    invoke-static {v12, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "apiVersion"

    invoke-static {v13, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "sdkVersion"

    invoke-static {v14, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 121
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 122
    iput-object v1, v0, Lcom/stripe/android/networking/StripeApiRepository;->context:Landroid/content/Context;

    .line 123
    iput-object v2, v0, Lcom/stripe/android/networking/StripeApiRepository;->publishableKeyProvider:Lkotlin/jvm/functions/Function0;

    .line 124
    iput-object v3, v0, Lcom/stripe/android/networking/StripeApiRepository;->appInfo:Lcom/stripe/android/core/AppInfo;

    .line 125
    iput-object v4, v0, Lcom/stripe/android/networking/StripeApiRepository;->logger:Lcom/stripe/android/core/Logger;

    .line 126
    iput-object v5, v0, Lcom/stripe/android/networking/StripeApiRepository;->workContext:Lkotlin/coroutines/CoroutineContext;

    .line 127
    iput-object v6, v0, Lcom/stripe/android/networking/StripeApiRepository;->productUsageTokens:Ljava/util/Set;

    .line 128
    iput-object v7, v0, Lcom/stripe/android/networking/StripeApiRepository;->stripeNetworkClient:Lcom/stripe/android/core/networking/StripeNetworkClient;

    .line 132
    iput-object v8, v0, Lcom/stripe/android/networking/StripeApiRepository;->analyticsRequestExecutor:Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

    .line 134
    iput-object v9, v0, Lcom/stripe/android/networking/StripeApiRepository;->fraudDetectionDataRepository:Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;

    .line 136
    iput-object v10, v0, Lcom/stripe/android/networking/StripeApiRepository;->cardAccountRangeRepositoryFactory:Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;

    .line 138
    iput-object v11, v0, Lcom/stripe/android/networking/StripeApiRepository;->paymentAnalyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    move-object/from16 v12, p12

    .line 140
    iput-object v12, v0, Lcom/stripe/android/networking/StripeApiRepository;->fraudDetectionDataParamsUtils:Lcom/stripe/android/core/frauddetection/FraudDetectionDataParamsUtils;

    .line 165
    new-instance v1, Lcom/stripe/android/core/networking/ApiRequest$Factory;

    invoke-direct {v1, v3, v13, v14}, Lcom/stripe/android/core/networking/ApiRequest$Factory;-><init>(Lcom/stripe/android/core/AppInfo;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v1, v0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 175
    invoke-direct {v0}, Lcom/stripe/android/networking/StripeApiRepository;->fireFraudDetectionDataRequest()V

    .line 177
    invoke-static {v5}, Lkotlinx/coroutines/CoroutineScopeKt;->CoroutineScope(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    new-instance v2, Lcom/stripe/android/networking/StripeApiRepository$2;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v3}, Lcom/stripe/android/networking/StripeApiRepository$2;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/coroutines/Continuation;)V

    check-cast v2, Lkotlin/jvm/functions/Function2;

    const/4 v3, 0x3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object/from16 p1, v1

    move-object/from16 p4, v2

    move/from16 p5, v3

    move-object/from16 p6, v4

    move-object/from16 p2, v5

    move-object/from16 p3, v6

    invoke-static/range {p1 .. p6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/core/AppInfo;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/core/frauddetection/FraudDetectionDataParamsUtils;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 16

    move-object/from16 v1, p1

    move/from16 v0, p16

    and-int/lit8 v2, v0, 0x4

    if-eqz v2, :cond_0

    .line 124
    sget-object v2, Lcom/stripe/android/Stripe;->Companion:Lcom/stripe/android/Stripe$Companion;

    invoke-virtual {v2}, Lcom/stripe/android/Stripe$Companion;->getAppInfo()Lcom/stripe/android/core/AppInfo;

    move-result-object v2

    move-object v3, v2

    goto :goto_0

    :cond_0
    move-object/from16 v3, p3

    :goto_0
    and-int/lit8 v2, v0, 0x8

    if-eqz v2, :cond_1

    .line 125
    sget-object v2, Lcom/stripe/android/core/Logger;->Companion:Lcom/stripe/android/core/Logger$Companion;

    invoke-virtual {v2}, Lcom/stripe/android/core/Logger$Companion;->noop()Lcom/stripe/android/core/Logger;

    move-result-object v2

    move-object v4, v2

    goto :goto_1

    :cond_1
    move-object/from16 v4, p4

    :goto_1
    and-int/lit8 v2, v0, 0x10

    if-eqz v2, :cond_2

    .line 126
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v2

    check-cast v2, Lkotlin/coroutines/CoroutineContext;

    move-object v5, v2

    goto :goto_2

    :cond_2
    move-object/from16 v5, p5

    :goto_2
    and-int/lit8 v2, v0, 0x20

    if-eqz v2, :cond_3

    .line 127
    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object v2

    goto :goto_3

    :cond_3
    move-object/from16 v2, p6

    :goto_3
    and-int/lit8 v6, v0, 0x40

    move-object v9, v4

    if-eqz v6, :cond_4

    .line 128
    new-instance v4, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient;

    const/16 v10, 0xe

    const/4 v11, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v4 .. v11}, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient;-><init>(Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/networking/ConnectionFactory;Lcom/stripe/android/core/networking/RetryDelaySupplier;ILcom/stripe/android/core/Logger;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v4, Lcom/stripe/android/core/networking/StripeNetworkClient;

    move-object v7, v4

    goto :goto_4

    :cond_4
    move-object/from16 v7, p7

    :goto_4
    and-int/lit16 v4, v0, 0x80

    if-eqz v4, :cond_5

    .line 133
    new-instance v4, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor;

    invoke-direct {v4, v9, v5}, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor;-><init>(Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;)V

    check-cast v4, Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

    move-object v8, v4

    goto :goto_5

    :cond_5
    move-object/from16 v8, p8

    :goto_5
    and-int/lit16 v4, v0, 0x100

    if-eqz v4, :cond_6

    .line 135
    invoke-static {v1, v5}, Lcom/stripe/android/PaymentsFraudDetectionDataRepositoryFactoryKt;->DefaultFraudDetectionDataRepository(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;)Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository;

    move-result-object v4

    check-cast v4, Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;

    goto :goto_6

    :cond_6
    move-object/from16 v4, p9

    :goto_6
    and-int/lit16 v6, v0, 0x200

    if-eqz v6, :cond_7

    .line 137
    new-instance v6, Lcom/stripe/android/cards/DefaultCardAccountRangeRepositoryFactory;

    invoke-direct {v6, v1, v2, v8}, Lcom/stripe/android/cards/DefaultCardAccountRangeRepositoryFactory;-><init>(Landroid/content/Context;Ljava/util/Set;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;)V

    check-cast v6, Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;

    move-object v10, v6

    goto :goto_7

    :cond_7
    move-object/from16 v10, p10

    :goto_7
    and-int/lit16 v6, v0, 0x400

    if-eqz v6, :cond_8

    .line 139
    new-instance v6, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    move-object/from16 v11, p2

    invoke-direct {v6, v1, v11, v2}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;-><init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Ljava/util/Set;)V

    goto :goto_8

    :cond_8
    move-object/from16 v11, p2

    move-object/from16 v6, p11

    :goto_8
    and-int/lit16 v12, v0, 0x800

    if-eqz v12, :cond_9

    .line 140
    new-instance v12, Lcom/stripe/android/core/frauddetection/FraudDetectionDataParamsUtils;

    invoke-direct {v12}, Lcom/stripe/android/core/frauddetection/FraudDetectionDataParamsUtils;-><init>()V

    goto :goto_9

    :cond_9
    move-object/from16 v12, p12

    :goto_9
    and-int/lit16 v13, v0, 0x1000

    if-eqz v13, :cond_a

    .line 141
    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object v13

    goto :goto_a

    :cond_a
    move-object/from16 v13, p13

    :goto_a
    and-int/lit16 v14, v0, 0x2000

    if-eqz v14, :cond_c

    .line 142
    move-object v14, v13

    check-cast v14, Ljava/lang/Iterable;

    .line 2299
    new-instance v15, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v14, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v15, v1}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v15, Ljava/util/Collection;

    .line 2300
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_b

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    .line 2301
    check-cast v14, Lcom/stripe/android/StripeApiBeta;

    .line 142
    invoke-virtual {v14}, Lcom/stripe/android/StripeApiBeta;->getCode()Ljava/lang/String;

    move-result-object v14

    .line 2301
    invoke-interface {v15, v14}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_b

    .line 2302
    :cond_b
    check-cast v15, Ljava/util/List;

    .line 2299
    check-cast v15, Ljava/lang/Iterable;

    .line 142
    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->toSet(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v1

    new-instance v14, Lcom/stripe/android/core/ApiVersion;

    invoke-direct {v14, v1}, Lcom/stripe/android/core/ApiVersion;-><init>(Ljava/util/Set;)V

    invoke-virtual {v14}, Lcom/stripe/android/core/ApiVersion;->getCode()Ljava/lang/String;

    move-result-object v1

    move-object v14, v1

    goto :goto_c

    :cond_c
    move-object/from16 v14, p14

    :goto_c
    and-int/lit16 v0, v0, 0x4000

    if-eqz v0, :cond_d

    .line 143
    const-string v0, "AndroidBindings/21.22.2"

    move-object v1, v6

    move-object v6, v2

    move-object v2, v11

    move-object v11, v1

    move-object v1, v9

    move-object v9, v4

    move-object v4, v1

    move-object v15, v0

    move-object/from16 v1, p1

    move-object/from16 v0, p0

    goto :goto_d

    :cond_d
    move-object v0, v6

    move-object v6, v2

    move-object v2, v11

    move-object v11, v0

    move-object v0, v9

    move-object v9, v4

    move-object v4, v0

    move-object/from16 v15, p15

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 121
    :goto_d
    invoke-direct/range {v0 .. v15}, Lcom/stripe/android/networking/StripeApiRepository;-><init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/core/AppInfo;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/core/frauddetection/FraudDetectionDataParamsUtils;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/core/Logger;)V
    .locals 19
    .param p2    # Lkotlin/jvm/functions/Function0;
        .annotation runtime Ljavax/inject/Named;
            value = "publishableKey"
        .end annotation
    .end param
    .param p3    # Lkotlin/coroutines/CoroutineContext;
        .annotation runtime Lcom/stripe/android/core/injection/IOContext;
        .end annotation
    .end param
    .param p4    # Ljava/util/Set;
        .annotation runtime Ljavax/inject/Named;
            value = "productUsage"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/coroutines/CoroutineContext;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;",
            "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;",
            "Lcom/stripe/android/core/Logger;",
            ")V"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "appContext"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "publishableKeyProvider"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    move-object/from16 v6, p3

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "productUsageTokens"

    move-object/from16 v7, p4

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentAnalyticsRequestFactory"

    move-object/from16 v12, p5

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsRequestExecutor"

    move-object/from16 v9, p6

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    move-object/from16 v5, p7

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v17, 0x7b44

    const/16 v18, 0x0

    const/4 v4, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v1, p0

    .line 155
    invoke-direct/range {v1 .. v18}, Lcom/stripe/android/networking/StripeApiRepository;-><init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/core/AppInfo;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/core/frauddetection/FraudDetectionDataParamsUtils;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public static final synthetic access$confirmPaymentIntentInternal-BWLJW6A(Lcom/stripe/android/networking/StripeApiRepository;Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 120
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/networking/StripeApiRepository;->confirmPaymentIntentInternal-BWLJW6A(Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$confirmSetupIntentInternal-BWLJW6A(Lcom/stripe/android/networking/StripeApiRepository;Lcom/stripe/android/model/ConfirmSetupIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 120
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/networking/StripeApiRepository;->confirmSetupIntentInternal-BWLJW6A(Lcom/stripe/android/model/ConfirmSetupIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$fetchStripeModelResult-BWLJW6A(Lcom/stripe/android/networking/StripeApiRepository;Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 120
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModelResult-BWLJW6A(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getContext$p(Lcom/stripe/android/networking/StripeApiRepository;)Landroid/content/Context;
    .locals 0

    .line 120
    iget-object p0, p0, Lcom/stripe/android/networking/StripeApiRepository;->context:Landroid/content/Context;

    return-object p0
.end method

.method public static final synthetic access$maybeForDashboard-0E7RQCE(Lcom/stripe/android/networking/StripeApiRepository;Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 120
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/networking/StripeApiRepository;->maybeForDashboard-0E7RQCE(Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$maybeForDashboard-0E7RQCE(Lcom/stripe/android/networking/StripeApiRepository;Lcom/stripe/android/model/ConfirmSetupIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 120
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/networking/StripeApiRepository;->maybeForDashboard-0E7RQCE(Lcom/stripe/android/model/ConfirmSetupIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$retrieveElementsSession-BWLJW6A(Lcom/stripe/android/networking/StripeApiRepository;Lcom/stripe/android/model/ElementsSessionParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 120
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/networking/StripeApiRepository;->retrieveElementsSession-BWLJW6A(Lcom/stripe/android/model/ElementsSessionParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final addCustomerSource_bMdYcbs$lambda$30(Lcom/stripe/android/networking/StripeApiRepository;Ljava/util/Set;Ljava/lang/String;Lkotlin/Result;)Lkotlin/Unit;
    .locals 0

    .line 702
    iget-object p3, p0, Lcom/stripe/android/networking/StripeApiRepository;->paymentAnalyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    invoke-virtual {p3, p1, p2}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;->createAddSource$payments_core_release(Ljava/util/Set;Ljava/lang/String;)Lcom/stripe/android/core/networking/AnalyticsRequest;

    move-result-object p1

    .line 701
    invoke-virtual {p0, p1}, Lcom/stripe/android/networking/StripeApiRepository;->fireAnalyticsRequest$payments_core_release(Lcom/stripe/android/core/networking/AnalyticsRequest;)V

    .line 707
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final attachFinancialConnectionsSessionToPaymentIntent_hUnOzRk$lambda$69(Lkotlin/Result;)Lkotlin/Unit;
    .locals 0

    .line 1313
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final attachFinancialConnectionsSessionToSetupIntent_hUnOzRk$lambda$70(Lkotlin/Result;)Lkotlin/Unit;
    .locals 0

    .line 1339
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final attachPaymentMethod_yxL6bBk$lambda$32(Lcom/stripe/android/networking/StripeApiRepository;Ljava/util/Set;Lkotlin/Result;)Lkotlin/Unit;
    .locals 0

    .line 755
    iget-object p2, p0, Lcom/stripe/android/networking/StripeApiRepository;->paymentAnalyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    invoke-virtual {p2, p1}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;->createAttachPaymentMethod$payments_core_release(Ljava/util/Set;)Lcom/stripe/android/core/networking/AnalyticsRequest;

    move-result-object p1

    .line 754
    invoke-virtual {p0, p1}, Lcom/stripe/android/networking/StripeApiRepository;->fireAnalyticsRequest$payments_core_release(Lcom/stripe/android/core/networking/AnalyticsRequest;)V

    .line 757
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private final buildPaymentUserAgentPair(Ljava/util/Set;)Lkotlin/Pair;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1860
    const-string v0, "payment_user_agent"

    invoke-virtual {p0, p1}, Lcom/stripe/android/networking/StripeApiRepository;->buildPaymentUserAgent(Ljava/util/Set;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    return-object p1
.end method

.method static synthetic buildPaymentUserAgentPair$default(Lcom/stripe/android/networking/StripeApiRepository;Ljava/util/Set;ILjava/lang/Object;)Lkotlin/Pair;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 1859
    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object p1

    :cond_0
    invoke-direct {p0, p1}, Lcom/stripe/android/networking/StripeApiRepository;->buildPaymentUserAgentPair(Ljava/util/Set;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method private static final cancelPaymentIntentSource_BWLJW6A$lambda$15(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/Result;)Lkotlin/Unit;
    .locals 0

    .line 395
    sget-object p1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->PaymentIntentCancelSource:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    invoke-direct {p0, p1}, Lcom/stripe/android/networking/StripeApiRepository;->fireAnalyticsRequest(Lcom/stripe/android/networking/PaymentAnalyticsEvent;)V

    .line 396
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final cancelSetupIntentSource_BWLJW6A$lambda$24(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/Result;)Lkotlin/Unit;
    .locals 0

    .line 516
    sget-object p1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->SetupIntentCancelSource:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    invoke-direct {p0, p1}, Lcom/stripe/android/networking/StripeApiRepository;->fireAnalyticsRequest(Lcom/stripe/android/networking/PaymentAnalyticsEvent;)V

    .line 517
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private final confirmPaymentIntentInternal-BWLJW6A(Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/ConfirmPaymentIntentParams;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/PaymentIntent;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lcom/stripe/android/networking/StripeApiRepository$confirmPaymentIntentInternal$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/stripe/android/networking/StripeApiRepository$confirmPaymentIntentInternal$1;

    iget v1, v0, Lcom/stripe/android/networking/StripeApiRepository$confirmPaymentIntentInternal$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p4, v0, Lcom/stripe/android/networking/StripeApiRepository$confirmPaymentIntentInternal$1;->label:I

    sub-int/2addr p4, v2

    iput p4, v0, Lcom/stripe/android/networking/StripeApiRepository$confirmPaymentIntentInternal$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/networking/StripeApiRepository$confirmPaymentIntentInternal$1;

    invoke-direct {v0, p0, p4}, Lcom/stripe/android/networking/StripeApiRepository$confirmPaymentIntentInternal$1;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object p4, v0

    iget-object v0, p4, Lcom/stripe/android/networking/StripeApiRepository$confirmPaymentIntentInternal$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 225
    iget v2, p4, Lcom/stripe/android/networking/StripeApiRepository$confirmPaymentIntentInternal$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v0, Lkotlin/Result;

    invoke-virtual {v0}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 230
    iget-object v0, p0, Lcom/stripe/android/networking/StripeApiRepository;->fraudDetectionDataParamsUtils:Lcom/stripe/android/core/frauddetection/FraudDetectionDataParamsUtils;

    .line 233
    invoke-virtual {p1}, Lcom/stripe/android/model/ConfirmPaymentIntentParams;->toParamMap()Ljava/util/Map;

    move-result-object v2

    .line 235
    invoke-virtual {p2}, Lcom/stripe/android/core/networking/ApiRequest$Options;->getApiKeyIsUserKey()Z

    move-result v4

    if-eqz v4, :cond_3

    const-string v4, "client_secret"

    invoke-static {v2, v4}, Lkotlin/collections/MapsKt;->minus(Ljava/util/Map;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v2

    .line 236
    :cond_3
    invoke-virtual {p1}, Lcom/stripe/android/model/ConfirmPaymentIntentParams;->getPaymentMethodCreateParams()Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object v4

    .line 237
    invoke-virtual {p1}, Lcom/stripe/android/model/ConfirmPaymentIntentParams;->getSourceParams()Lcom/stripe/android/model/SourceParams;

    move-result-object v5

    .line 232
    invoke-direct {p0, v2, v4, v5}, Lcom/stripe/android/networking/StripeApiRepository;->maybeAddPaymentUserAgent(Ljava/util/Map;Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/model/SourceParams;)Ljava/util/Map;

    move-result-object v2

    .line 238
    sget-object v4, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    invoke-static {v4, p3}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->access$createExpandParam(Lcom/stripe/android/networking/StripeApiRepository$Companion;Ljava/util/List;)Ljava/util/Map;

    move-result-object p3

    invoke-static {v2, p3}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p3

    .line 239
    invoke-direct {p0}, Lcom/stripe/android/networking/StripeApiRepository;->getFraudDetectionData()Lcom/stripe/android/core/frauddetection/FraudDetectionData;

    move-result-object v2

    .line 230
    invoke-virtual {v0, p3, v2}, Lcom/stripe/android/core/frauddetection/FraudDetectionDataParamsUtils;->addFraudDetectionData(Ljava/util/Map;Lcom/stripe/android/core/frauddetection/FraudDetectionData;)Ljava/util/Map;

    move-result-object v7

    .line 242
    :try_start_0
    sget-object p3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object p3, p0

    check-cast p3, Lcom/stripe/android/networking/StripeApiRepository;

    .line 243
    new-instance p3, Lcom/stripe/android/model/PaymentIntent$ClientSecret;

    invoke-virtual {p1}, Lcom/stripe/android/model/ConfirmPaymentIntentParams;->getClientSecret()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p3, v0}, Lcom/stripe/android/model/PaymentIntent$ClientSecret;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3}, Lcom/stripe/android/model/PaymentIntent$ClientSecret;->getPaymentIntentId$payments_core_release()Ljava/lang/String;

    move-result-object p3

    .line 242
    invoke-static {p3}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p3, v0

    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p3}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p3

    invoke-static {p3}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    .line 244
    :goto_1
    invoke-static {p3}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_5

    check-cast p3, Ljava/lang/String;

    .line 248
    invoke-direct {p0}, Lcom/stripe/android/networking/StripeApiRepository;->fireFraudDetectionDataRequest()V

    .line 251
    iget-object v4, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 252
    sget-object v0, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    invoke-virtual {v0, p3}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getConfirmPaymentIntentUrl$payments_core_release(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const/16 v9, 0x8

    const/4 v10, 0x0

    const/4 v8, 0x0

    move-object v6, p2

    .line 251
    invoke-static/range {v4 .. v10}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p2

    .line 256
    new-instance p3, Lcom/stripe/android/model/parsers/PaymentIntentJsonParser;

    invoke-direct {p3}, Lcom/stripe/android/model/parsers/PaymentIntentJsonParser;-><init>()V

    check-cast p3, Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    .line 250
    new-instance v0, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda32;

    invoke-direct {v0, p1, p0}, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda32;-><init>(Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/networking/StripeApiRepository;)V

    iput v3, p4, Lcom/stripe/android/networking/StripeApiRepository$confirmPaymentIntentInternal$1;->label:I

    invoke-direct {p0, p2, p3, v0, p4}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModelResult-BWLJW6A(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    return-object p1

    .line 245
    :cond_5
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private static final confirmPaymentIntentInternal_BWLJW6A$lambda$5(Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/Result;)Lkotlin/Unit;
    .locals 1

    .line 259
    invoke-virtual {p0}, Lcom/stripe/android/model/ConfirmPaymentIntentParams;->getPaymentMethodCreateParams()Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/stripe/android/model/PaymentMethodCreateParams;->getTypeCode()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    .line 260
    :cond_0
    invoke-virtual {p0}, Lcom/stripe/android/model/ConfirmPaymentIntentParams;->getSourceParams()Lcom/stripe/android/model/SourceParams;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lcom/stripe/android/model/SourceParams;->getType()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 263
    :cond_2
    :goto_0
    iget-object p0, p1, Lcom/stripe/android/networking/StripeApiRepository;->paymentAnalyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    .line 265
    invoke-virtual {p2}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/stripe/android/networking/StripeApiRepository;->getErrorMessage(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    .line 263
    invoke-virtual {p0, v0, p2}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;->createPaymentIntentConfirmation$payments_core_release(Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/core/networking/AnalyticsRequest;

    move-result-object p0

    .line 262
    invoke-virtual {p1, p0}, Lcom/stripe/android/networking/StripeApiRepository;->fireAnalyticsRequest$payments_core_release(Lcom/stripe/android/core/networking/AnalyticsRequest;)V

    .line 268
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private final confirmSetupIntentInternal-BWLJW6A(Lcom/stripe/android/model/ConfirmSetupIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/ConfirmSetupIntentParams;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/SetupIntent;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p4

    instance-of v2, v0, Lcom/stripe/android/networking/StripeApiRepository$confirmSetupIntentInternal$1;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lcom/stripe/android/networking/StripeApiRepository$confirmSetupIntentInternal$1;

    iget v3, v2, Lcom/stripe/android/networking/StripeApiRepository$confirmSetupIntentInternal$1;->label:I

    const/high16 v4, -0x80000000

    and-int/2addr v3, v4

    if-eqz v3, :cond_0

    iget v0, v2, Lcom/stripe/android/networking/StripeApiRepository$confirmSetupIntentInternal$1;->label:I

    sub-int/2addr v0, v4

    iput v0, v2, Lcom/stripe/android/networking/StripeApiRepository$confirmSetupIntentInternal$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/stripe/android/networking/StripeApiRepository$confirmSetupIntentInternal$1;

    invoke-direct {v2, v1, v0}, Lcom/stripe/android/networking/StripeApiRepository$confirmSetupIntentInternal$1;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v7, v2

    iget-object v0, v7, Lcom/stripe/android/networking/StripeApiRepository$confirmSetupIntentInternal$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v8

    .line 421
    iget v2, v7, Lcom/stripe/android/networking/StripeApiRepository$confirmSetupIntentInternal$1;->label:I

    const/4 v9, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v9, :cond_1

    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v0, Lkotlin/Result;

    invoke-virtual {v0}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 426
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, v1

    check-cast v0, Lcom/stripe/android/networking/StripeApiRepository;

    .line 427
    new-instance v0, Lcom/stripe/android/model/SetupIntent$ClientSecret;

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/model/ConfirmSetupIntentParams;->getClientSecret()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/stripe/android/model/SetupIntent$ClientSecret;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/stripe/android/model/SetupIntent$ClientSecret;->getSetupIntentId$payments_core_release()Ljava/lang/String;

    move-result-object v0

    .line 426
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 428
    :goto_1
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-nez v2, :cond_5

    check-cast v0, Ljava/lang/String;

    .line 432
    invoke-direct {v1}, Lcom/stripe/android/networking/StripeApiRepository;->fireFraudDetectionDataRequest()V

    .line 435
    iget-object v10, v1, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 436
    sget-object v11, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    invoke-virtual {v11, v0}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getConfirmSetupIntentUrl$payments_core_release(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 438
    iget-object v12, v1, Lcom/stripe/android/networking/StripeApiRepository;->fraudDetectionDataParamsUtils:Lcom/stripe/android/core/frauddetection/FraudDetectionDataParamsUtils;

    .line 441
    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/model/ConfirmSetupIntentParams;->toParamMap()Ljava/util/Map;

    move-result-object v2

    .line 443
    invoke-virtual/range {p2 .. p2}, Lcom/stripe/android/core/networking/ApiRequest$Options;->getApiKeyIsUserKey()Z

    move-result v3

    if-eqz v3, :cond_3

    const-string v3, "client_secret"

    invoke-static {v2, v3}, Lkotlin/collections/MapsKt;->minus(Ljava/util/Map;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v2

    .line 444
    :cond_3
    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/model/ConfirmSetupIntentParams;->getPaymentMethodCreateParams$payments_core_release()Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object v3

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    .line 440
    invoke-static/range {v1 .. v6}, Lcom/stripe/android/networking/StripeApiRepository;->maybeAddPaymentUserAgent$default(Lcom/stripe/android/networking/StripeApiRepository;Ljava/util/Map;Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/model/SourceParams;ILjava/lang/Object;)Ljava/util/Map;

    move-result-object v2

    move-object/from16 v3, p3

    .line 445
    invoke-static {v11, v3}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->access$createExpandParam(Lcom/stripe/android/networking/StripeApiRepository$Companion;Ljava/util/List;)Ljava/util/Map;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v2

    .line 446
    invoke-direct {v1}, Lcom/stripe/android/networking/StripeApiRepository;->getFraudDetectionData()Lcom/stripe/android/core/frauddetection/FraudDetectionData;

    move-result-object v3

    .line 438
    invoke-virtual {v12, v2, v3}, Lcom/stripe/android/core/frauddetection/FraudDetectionDataParamsUtils;->addFraudDetectionData(Ljava/util/Map;Lcom/stripe/android/core/frauddetection/FraudDetectionData;)Ljava/util/Map;

    move-result-object v13

    const/16 v15, 0x8

    const/16 v16, 0x0

    const/4 v14, 0x0

    move-object/from16 v12, p2

    move-object v11, v0

    .line 435
    invoke-static/range {v10 .. v16}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object v0

    .line 449
    new-instance v2, Lcom/stripe/android/model/parsers/SetupIntentJsonParser;

    invoke-direct {v2}, Lcom/stripe/android/model/parsers/SetupIntentJsonParser;-><init>()V

    check-cast v2, Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    .line 434
    new-instance v3, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda33;

    move-object/from16 v4, p1

    invoke-direct {v3, v1, v4}, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda33;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lcom/stripe/android/model/ConfirmSetupIntentParams;)V

    iput v9, v7, Lcom/stripe/android/networking/StripeApiRepository$confirmSetupIntentInternal$1;->label:I

    invoke-direct {v1, v0, v2, v3, v7}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModelResult-BWLJW6A(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_4

    return-object v8

    :cond_4
    return-object v0

    .line 429
    :cond_5
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v2}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method private static final confirmSetupIntentInternal_BWLJW6A$lambda$20(Lcom/stripe/android/networking/StripeApiRepository;Lcom/stripe/android/model/ConfirmSetupIntentParams;Lkotlin/Result;)Lkotlin/Unit;
    .locals 1

    .line 452
    iget-object v0, p0, Lcom/stripe/android/networking/StripeApiRepository;->paymentAnalyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    .line 453
    invoke-virtual {p1}, Lcom/stripe/android/model/ConfirmSetupIntentParams;->getPaymentMethodCreateParams$payments_core_release()Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/stripe/android/model/PaymentMethodCreateParams;->getTypeCode()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 454
    :goto_0
    invoke-virtual {p2}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p2

    invoke-direct {p0, p2}, Lcom/stripe/android/networking/StripeApiRepository;->getErrorMessage(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    .line 452
    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;->createSetupIntentConfirmation$payments_core_release(Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/core/networking/AnalyticsRequest;

    move-result-object p1

    .line 451
    invoke-virtual {p0, p1}, Lcom/stripe/android/networking/StripeApiRepository;->fireAnalyticsRequest$payments_core_release(Lcom/stripe/android/core/networking/AnalyticsRequest;)V

    .line 457
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private final createClientSecretParam(Ljava/lang/String;Ljava/util/List;)Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1855
    const-string v0, "client_secret"

    invoke-static {v0, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    .line 1856
    sget-object v0, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    invoke-static {v0, p2}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->access$createExpandParam(Lcom/stripe/android/networking/StripeApiRepository$Companion;Ljava/util/List;)Ljava/util/Map;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method private static final createFile_0E7RQCE$lambda$48$lambda$47(Lcom/stripe/android/networking/StripeApiRepository;Lcom/stripe/android/core/networking/RequestId;)Lkotlin/Unit;
    .locals 0

    .line 1053
    sget-object p1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->FileCreate:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    invoke-direct {p0, p1}, Lcom/stripe/android/networking/StripeApiRepository;->fireAnalyticsRequest(Lcom/stripe/android/networking/PaymentAnalyticsEvent;)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final createFinancialConnectionsSessionForDeferredPayments_0E7RQCE$lambda$66(Lkotlin/Result;)Lkotlin/Unit;
    .locals 0

    .line 1235
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final createPaymentIntentFinancialConnectionsSession_BWLJW6A$lambda$67(Lkotlin/Result;)Lkotlin/Unit;
    .locals 0

    .line 1252
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final createPaymentMethod_0E7RQCE$lambda$27(Lcom/stripe/android/networking/StripeApiRepository;Lcom/stripe/android/model/PaymentMethodCreateParams;Lkotlin/Result;)Lkotlin/Unit;
    .locals 1

    .line 599
    iget-object p2, p0, Lcom/stripe/android/networking/StripeApiRepository;->paymentAnalyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    .line 600
    invoke-virtual {p1}, Lcom/stripe/android/model/PaymentMethodCreateParams;->getCode$payments_core_release()Ljava/lang/String;

    move-result-object v0

    .line 601
    invoke-virtual {p1}, Lcom/stripe/android/model/PaymentMethodCreateParams;->getAttribution()Ljava/util/Set;

    move-result-object p1

    .line 599
    invoke-virtual {p2, v0, p1}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;->createPaymentMethodCreation$payments_core_release(Ljava/lang/String;Ljava/util/Set;)Lcom/stripe/android/core/networking/AnalyticsRequest;

    move-result-object p1

    .line 598
    invoke-virtual {p0, p1}, Lcom/stripe/android/networking/StripeApiRepository;->fireAnalyticsRequest$payments_core_release(Lcom/stripe/android/core/networking/AnalyticsRequest;)V

    .line 604
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final createRadarSession_gIAlu_s$lambda$56$lambda$55(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/Result;)Lkotlin/Unit;
    .locals 9

    .line 1107
    iget-object v0, p0, Lcom/stripe/android/networking/StripeApiRepository;->paymentAnalyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    sget-object v1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->RadarSessionCreate:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v7, 0x3e

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v0 .. v8}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;->createRequest$payments_core_release$default(Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/model/Token$Type;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/core/networking/AnalyticsRequest;

    move-result-object p1

    .line 1106
    invoke-virtual {p0, p1}, Lcom/stripe/android/networking/StripeApiRepository;->fireAnalyticsRequest$payments_core_release(Lcom/stripe/android/core/networking/AnalyticsRequest;)V

    .line 1109
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final createSavedPaymentMethodRadarSession_0E7RQCE$lambda$62$lambda$61(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/Result;)Lkotlin/Unit;
    .locals 9

    .line 1147
    iget-object v0, p0, Lcom/stripe/android/networking/StripeApiRepository;->paymentAnalyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    sget-object v1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->RadarSessionCreate:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v7, 0x3e

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v0 .. v8}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;->createRequest$payments_core_release$default(Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/model/Token$Type;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/core/networking/AnalyticsRequest;

    move-result-object p1

    .line 1146
    invoke-virtual {p0, p1}, Lcom/stripe/android/networking/StripeApiRepository;->fireAnalyticsRequest$payments_core_release(Lcom/stripe/android/core/networking/AnalyticsRequest;)V

    .line 1149
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final createSetupIntentFinancialConnectionsSession_BWLJW6A$lambda$68(Lkotlin/Result;)Lkotlin/Unit;
    .locals 0

    .line 1269
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final createSource_0E7RQCE$lambda$25(Lcom/stripe/android/networking/StripeApiRepository;Lcom/stripe/android/model/SourceParams;Lkotlin/Result;)Lkotlin/Unit;
    .locals 1

    .line 545
    iget-object p2, p0, Lcom/stripe/android/networking/StripeApiRepository;->paymentAnalyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    .line 546
    invoke-virtual {p1}, Lcom/stripe/android/model/SourceParams;->getType()Ljava/lang/String;

    move-result-object v0

    .line 547
    invoke-virtual {p1}, Lcom/stripe/android/model/SourceParams;->getAttribution$payments_core_release()Ljava/util/Set;

    move-result-object p1

    .line 545
    invoke-virtual {p2, v0, p1}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;->createSourceCreation$payments_core_release(Ljava/lang/String;Ljava/util/Set;)Lcom/stripe/android/core/networking/AnalyticsRequest;

    move-result-object p1

    .line 544
    invoke-virtual {p0, p1}, Lcom/stripe/android/networking/StripeApiRepository;->fireAnalyticsRequest$payments_core_release(Lcom/stripe/android/core/networking/AnalyticsRequest;)V

    .line 550
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final createToken_0E7RQCE$lambda$29(Lcom/stripe/android/networking/StripeApiRepository;Lcom/stripe/android/model/TokenParams;Lkotlin/Result;)Lkotlin/Unit;
    .locals 1

    .line 674
    iget-object p2, p0, Lcom/stripe/android/networking/StripeApiRepository;->paymentAnalyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    .line 675
    invoke-virtual {p1}, Lcom/stripe/android/model/TokenParams;->getAttribution()Ljava/util/Set;

    move-result-object v0

    .line 676
    invoke-virtual {p1}, Lcom/stripe/android/model/TokenParams;->getTokenType()Lcom/stripe/android/model/Token$Type;

    move-result-object p1

    .line 674
    invoke-virtual {p2, v0, p1}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;->createTokenCreation$payments_core_release(Ljava/util/Set;Lcom/stripe/android/model/Token$Type;)Lcom/stripe/android/core/networking/AnalyticsRequest;

    move-result-object p1

    .line 673
    invoke-virtual {p0, p1}, Lcom/stripe/android/networking/StripeApiRepository;->fireAnalyticsRequest$payments_core_release(Lcom/stripe/android/core/networking/AnalyticsRequest;)V

    .line 679
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final deleteCustomerSource_hUnOzRk$lambda$31(Lcom/stripe/android/networking/StripeApiRepository;Ljava/util/Set;Lkotlin/Result;)Lkotlin/Unit;
    .locals 0

    .line 728
    iget-object p2, p0, Lcom/stripe/android/networking/StripeApiRepository;->paymentAnalyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    invoke-virtual {p2, p1}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;->createDeleteSource$payments_core_release(Ljava/util/Set;)Lcom/stripe/android/core/networking/AnalyticsRequest;

    move-result-object p1

    .line 727
    invoke-virtual {p0, p1}, Lcom/stripe/android/networking/StripeApiRepository;->fireAnalyticsRequest$payments_core_release(Lcom/stripe/android/core/networking/AnalyticsRequest;)V

    .line 732
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final deletePaymentDetails_BWLJW6A$lambda$84$lambda$83(Lkotlin/Result;)Lkotlin/Unit;
    .locals 0

    .line 1614
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final detachPaymentMethod_BWLJW6A$lambda$33(Lcom/stripe/android/networking/StripeApiRepository;Ljava/util/Set;Lkotlin/Result;)Lkotlin/Unit;
    .locals 0

    .line 783
    iget-object p2, p0, Lcom/stripe/android/networking/StripeApiRepository;->paymentAnalyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    invoke-virtual {p2, p1}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;->createDetachPaymentMethod$payments_core_release(Ljava/util/Set;)Lcom/stripe/android/core/networking/AnalyticsRequest;

    move-result-object p1

    .line 782
    invoke-virtual {p0, p1}, Lcom/stripe/android/networking/StripeApiRepository;->fireAnalyticsRequest$payments_core_release(Lcom/stripe/android/core/networking/AnalyticsRequest;)V

    .line 785
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final detachPaymentMethod_yxL6bBk$lambda$34(Lcom/stripe/android/networking/StripeApiRepository;Ljava/util/Set;Lkotlin/Result;)Lkotlin/Unit;
    .locals 0

    .line 813
    iget-object p2, p0, Lcom/stripe/android/networking/StripeApiRepository;->paymentAnalyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    invoke-virtual {p2, p1}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;->createDetachPaymentMethod$payments_core_release(Ljava/util/Set;)Lcom/stripe/android/core/networking/AnalyticsRequest;

    move-result-object p1

    .line 812
    invoke-virtual {p0, p1}, Lcom/stripe/android/networking/StripeApiRepository;->fireAnalyticsRequest$payments_core_release(Lcom/stripe/android/core/networking/AnalyticsRequest;)V

    .line 815
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private final disableDnsCache()Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData;
    .locals 3

    .line 1811
    const-string v0, "networkaddress.cache.ttl"

    :try_start_0
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v1, p0

    check-cast v1, Lcom/stripe/android/networking/StripeApiRepository;

    .line 1812
    invoke-static {v0}, Ljava/security/Security;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1814
    const-string v2, "0"

    invoke-static {v0, v2}, Ljava/security/Security;->setProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 1815
    new-instance v0, Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData$Success;

    invoke-direct {v0, v1}, Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData$Success;-><init>(Ljava/lang/String;)V

    .line 1811
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 1817
    :goto_0
    sget-object v1, Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData$Failure;->INSTANCE:Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData$Failure;

    .line 1816
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move-object v0, v1

    :cond_0
    check-cast v0, Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData;

    return-object v0
.end method

.method private final fetchStripeModelResult-BWLJW6A(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ModelType::",
            "Lcom/stripe/android/core/model/StripeModel;",
            ">(",
            "Lcom/stripe/android/core/networking/ApiRequest;",
            "Lcom/stripe/android/core/model/parsers/ModelJsonParser<",
            "+TModelType;>;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/core/networking/StripeResponse<",
            "Ljava/lang/String;",
            ">;>;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "+TModelType;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const-string v0, "Unable to parse response with "

    instance-of v1, p4, Lcom/stripe/android/networking/StripeApiRepository$fetchStripeModelResult$1;

    if-eqz v1, :cond_0

    move-object v1, p4

    check-cast v1, Lcom/stripe/android/networking/StripeApiRepository$fetchStripeModelResult$1;

    iget v2, v1, Lcom/stripe/android/networking/StripeApiRepository$fetchStripeModelResult$1;->label:I

    const/high16 v3, -0x80000000

    and-int/2addr v2, v3

    if-eqz v2, :cond_0

    iget p4, v1, Lcom/stripe/android/networking/StripeApiRepository$fetchStripeModelResult$1;->label:I

    sub-int/2addr p4, v3

    iput p4, v1, Lcom/stripe/android/networking/StripeApiRepository$fetchStripeModelResult$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/stripe/android/networking/StripeApiRepository$fetchStripeModelResult$1;

    invoke-direct {v1, p0, p4}, Lcom/stripe/android/networking/StripeApiRepository$fetchStripeModelResult$1;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p4, v1, Lcom/stripe/android/networking/StripeApiRepository$fetchStripeModelResult$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    .line 1729
    iget v3, v1, Lcom/stripe/android/networking/StripeApiRepository$fetchStripeModelResult$1;->label:I

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v4, :cond_1

    iget-object p1, v1, Lcom/stripe/android/networking/StripeApiRepository$fetchStripeModelResult$1;->L$0:Ljava/lang/Object;

    move-object p2, p1

    check-cast p2, Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    :try_start_0
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 1734
    :try_start_1
    sget-object p4, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object p4, p0

    check-cast p4, Lcom/stripe/android/networking/StripeApiRepository;

    .line 1735
    iput-object p2, v1, Lcom/stripe/android/networking/StripeApiRepository$fetchStripeModelResult$1;->L$0:Ljava/lang/Object;

    iput v4, v1, Lcom/stripe/android/networking/StripeApiRepository$fetchStripeModelResult$1;->label:I

    invoke-virtual {p0, p1, p3, v1}, Lcom/stripe/android/networking/StripeApiRepository;->makeApiRequest$payments_core_release(Lcom/stripe/android/core/networking/ApiRequest;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v2, :cond_3

    return-object v2

    :cond_3
    :goto_1
    check-cast p4, Lcom/stripe/android/core/networking/StripeResponse;

    invoke-static {p4}, Lcom/stripe/android/core/networking/ResponseJsonKt;->responseJson(Lcom/stripe/android/core/networking/StripeResponse;)Lorg/json/JSONObject;

    move-result-object p1

    .line 1736
    invoke-interface {p2, p1}, Lcom/stripe/android/core/model/parsers/ModelJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/core/model/StripeModel;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 1734
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    move-object p1, v0

    .line 1736
    new-instance v0, Lcom/stripe/android/core/exception/APIException;

    .line 1737
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p2

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/16 v6, 0x17

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    .line 1736
    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/core/exception/APIException;-><init>(Lcom/stripe/android/core/StripeError;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    .line 1734
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method static synthetic fetchStripeModelResult-BWLJW6A$default(Lcom/stripe/android/networking/StripeApiRepository;Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_0

    .line 1732
    new-instance p3, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda34;

    invoke-direct {p3}, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda34;-><init>()V

    .line 1729
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModelResult-BWLJW6A(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final fetchStripeModelResult_BWLJW6A$lambda$101(Lkotlin/Result;)Lkotlin/Unit;
    .locals 0

    .line 1732
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private final fireAnalyticsRequest(Lcom/stripe/android/networking/PaymentAnalyticsEvent;)V
    .locals 9

    .line 1840
    iget-object v0, p0, Lcom/stripe/android/networking/StripeApiRepository;->paymentAnalyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    const/16 v7, 0x3e

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p1

    invoke-static/range {v0 .. v8}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;->createRequest$payments_core_release$default(Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/model/Token$Type;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/core/networking/AnalyticsRequest;

    move-result-object p1

    .line 1839
    invoke-virtual {p0, p1}, Lcom/stripe/android/networking/StripeApiRepository;->fireAnalyticsRequest$payments_core_release(Lcom/stripe/android/core/networking/AnalyticsRequest;)V

    return-void
.end method

.method private final fireFraudDetectionDataRequest()V
    .locals 1

    .line 1833
    iget-object v0, p0, Lcom/stripe/android/networking/StripeApiRepository;->fraudDetectionDataRepository:Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;

    invoke-interface {v0}, Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;->refresh()V

    return-void
.end method

.method private final getErrorMessage(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    .line 1938
    invoke-static {p1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    check-cast v0, Lcom/stripe/android/core/networking/StripeResponse;

    .line 1939
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 1942
    invoke-static {p1}, Lcom/stripe/android/core/exception/ExceptionUtilsKt;->getSafeAnalyticsMessage(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    if-eqz v0, :cond_2

    .line 1943
    invoke-virtual {v0}, Lcom/stripe/android/core/networking/StripeResponse;->isError()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 1944
    :try_start_0
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 1945
    invoke-direct {p0, v0}, Lcom/stripe/android/networking/StripeApiRepository;->handleApiError(Lcom/stripe/android/core/networking/StripeResponse;)V

    .line 1946
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 1944
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 1947
    :goto_1
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-static {p1}, Lcom/stripe/android/core/exception/ExceptionUtilsKt;->getSafeAnalyticsMessage(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    :cond_2
    return-object v1
.end method

.method private static final getFpxBankStatus_gIAlu_s$lambda$44(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/Result;)Lkotlin/Unit;
    .locals 0

    .line 987
    sget-object p1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->FpxBankStatusesRetrieve:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    invoke-direct {p0, p1}, Lcom/stripe/android/networking/StripeApiRepository;->fireAnalyticsRequest(Lcom/stripe/android/networking/PaymentAnalyticsEvent;)V

    .line 988
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private final getFraudDetectionData()Lcom/stripe/android/core/frauddetection/FraudDetectionData;
    .locals 1

    .line 172
    iget-object v0, p0, Lcom/stripe/android/networking/StripeApiRepository;->fraudDetectionDataRepository:Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;

    invoke-interface {v0}, Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;->getCached()Lcom/stripe/android/core/frauddetection/FraudDetectionData;

    move-result-object v0

    return-object v0
.end method

.method private static final getPaymentMethods_BWLJW6A$lambda$35(Lcom/stripe/android/networking/StripeApiRepository;Ljava/util/Set;Lkotlin/Result;)Lkotlin/Unit;
    .locals 9

    .line 837
    iget-object v0, p0, Lcom/stripe/android/networking/StripeApiRepository;->paymentAnalyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    .line 838
    sget-object v1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->CustomerRetrievePaymentMethods:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v7, 0x3c

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v2, p1

    .line 837
    invoke-static/range {v0 .. v8}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;->createRequest$payments_core_release$default(Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/model/Token$Type;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/core/networking/AnalyticsRequest;

    move-result-object p1

    .line 836
    invoke-virtual {p0, p1}, Lcom/stripe/android/networking/StripeApiRepository;->fireAnalyticsRequest$payments_core_release(Lcom/stripe/android/core/networking/AnalyticsRequest;)V

    .line 842
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private final handleApiError(Lcom/stripe/android/core/networking/StripeResponse;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/core/networking/StripeResponse<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/exception/CardException;,
            Lcom/stripe/android/core/exception/APIException;
        }
    .end annotation

    .line 1696
    invoke-virtual {p1}, Lcom/stripe/android/core/networking/StripeResponse;->getRequestId()Lcom/stripe/android/core/networking/RequestId;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/stripe/android/core/networking/RequestId;->getValue()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    move-object v3, v0

    .line 1697
    invoke-virtual {p1}, Lcom/stripe/android/core/networking/StripeResponse;->getCode()I

    move-result v4

    .line 1699
    new-instance v0, Lcom/stripe/android/core/model/parsers/StripeErrorJsonParser;

    invoke-direct {v0}, Lcom/stripe/android/core/model/parsers/StripeErrorJsonParser;-><init>()V

    .line 1700
    invoke-static {p1}, Lcom/stripe/android/core/networking/ResponseJsonKt;->responseJson(Lcom/stripe/android/core/networking/StripeResponse;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/stripe/android/core/model/parsers/StripeErrorJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/core/StripeError;

    move-result-object p1

    .line 1701
    iget-object v0, p0, Lcom/stripe/android/networking/StripeApiRepository;->context:Landroid/content/Context;

    invoke-static {p1, v0}, Lcom/stripe/android/networking/StripeErrorMappingKt;->withLocalizedMessage(Lcom/stripe/android/core/StripeError;Landroid/content/Context;)Lcom/stripe/android/core/StripeError;

    move-result-object v2

    const/16 p1, 0x1ad

    if-eq v4, p1, :cond_1

    packed-switch v4, :pswitch_data_0

    .line 1724
    new-instance v1, Lcom/stripe/android/core/exception/APIException;

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v8}, Lcom/stripe/android/core/exception/APIException;-><init>(Lcom/stripe/android/core/StripeError;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v1

    .line 1718
    :pswitch_0
    new-instance p1, Lcom/stripe/android/core/exception/PermissionException;

    invoke-direct {p1, v2, v3}, Lcom/stripe/android/core/exception/PermissionException;-><init>(Lcom/stripe/android/core/StripeError;Ljava/lang/String;)V

    throw p1

    .line 1715
    :pswitch_1
    new-instance p1, Lcom/stripe/android/exception/CardException;

    invoke-direct {p1, v2, v3}, Lcom/stripe/android/exception/CardException;-><init>(Lcom/stripe/android/core/StripeError;Ljava/lang/String;)V

    throw p1

    .line 1712
    :pswitch_2
    new-instance p1, Lcom/stripe/android/core/exception/AuthenticationException;

    invoke-direct {p1, v2, v3}, Lcom/stripe/android/core/exception/AuthenticationException;-><init>(Lcom/stripe/android/core/StripeError;Ljava/lang/String;)V

    throw p1

    .line 1705
    :pswitch_3
    new-instance v1, Lcom/stripe/android/core/exception/InvalidRequestException;

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v8}, Lcom/stripe/android/core/exception/InvalidRequestException;-><init>(Lcom/stripe/android/core/StripeError;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v1

    .line 1721
    :cond_1
    new-instance v1, Lcom/stripe/android/core/exception/RateLimitException;

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/core/exception/RateLimitException;-><init>(Lcom/stripe/android/core/StripeError;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v1

    :pswitch_data_0
    .packed-switch 0x190
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_3
    .end packed-switch
.end method

.method private final maybeAddPaymentUserAgent(Ljava/util/Map;Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/model/SourceParams;)Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/stripe/android/model/PaymentMethodCreateParams;",
            "Lcom/stripe/android/model/SourceParams;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1878
    const-string v0, "payment_method_data"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Ljava/util/Map;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    check-cast v1, Ljava/util/Map;

    goto :goto_0

    :cond_0
    move-object v1, v3

    :goto_0
    if-eqz v1, :cond_4

    if-eqz p2, :cond_1

    .line 1881
    invoke-virtual {p2}, Lcom/stripe/android/model/PaymentMethodCreateParams;->getAttribution()Ljava/util/Set;

    move-result-object p2

    if-nez p2, :cond_2

    :cond_1
    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object p2

    :cond_2
    invoke-direct {p0, p2}, Lcom/stripe/android/networking/StripeApiRepository;->buildPaymentUserAgentPair(Ljava/util/Set;)Lkotlin/Pair;

    move-result-object p2

    .line 1880
    invoke-static {v1, p2}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p2

    invoke-static {v0, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p2

    .line 1879
    invoke-static {p1, p2}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p2

    if-nez p2, :cond_3

    goto :goto_1

    :cond_3
    return-object p2

    .line 1884
    :cond_4
    :goto_1
    const-string p2, "source_data"

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/util/Map;

    if-eqz v1, :cond_5

    move-object v3, v0

    check-cast v3, Ljava/util/Map;

    :cond_5
    if-eqz v3, :cond_8

    if-eqz p3, :cond_6

    .line 1887
    invoke-virtual {p3}, Lcom/stripe/android/model/SourceParams;->getAttribution$payments_core_release()Ljava/util/Set;

    move-result-object p3

    if-nez p3, :cond_7

    :cond_6
    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object p3

    :cond_7
    invoke-direct {p0, p3}, Lcom/stripe/android/networking/StripeApiRepository;->buildPaymentUserAgentPair(Ljava/util/Set;)Lkotlin/Pair;

    move-result-object p3

    .line 1886
    invoke-static {v3, p3}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p3

    invoke-static {p2, p3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p2

    .line 1885
    invoke-static {p1, p2}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    :cond_8
    return-object p1
.end method

.method static synthetic maybeAddPaymentUserAgent$default(Lcom/stripe/android/networking/StripeApiRepository;Ljava/util/Map;Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/model/SourceParams;ILjava/lang/Object;)Ljava/util/Map;
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 1873
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/networking/StripeApiRepository;->maybeAddPaymentUserAgent(Ljava/util/Map;Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/model/SourceParams;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method private final maybeForDashboard-0E7RQCE(Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/ConfirmPaymentIntentParams;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/ConfirmPaymentIntentParams;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/stripe/android/networking/StripeApiRepository$maybeForDashboard$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/networking/StripeApiRepository$maybeForDashboard$1;

    iget v1, v0, Lcom/stripe/android/networking/StripeApiRepository$maybeForDashboard$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p3, v0, Lcom/stripe/android/networking/StripeApiRepository$maybeForDashboard$1;->label:I

    sub-int/2addr p3, v2

    iput p3, v0, Lcom/stripe/android/networking/StripeApiRepository$maybeForDashboard$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/networking/StripeApiRepository$maybeForDashboard$1;

    invoke-direct {v0, p0, p3}, Lcom/stripe/android/networking/StripeApiRepository$maybeForDashboard$1;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lcom/stripe/android/networking/StripeApiRepository$maybeForDashboard$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 1892
    iget v2, v0, Lcom/stripe/android/networking/StripeApiRepository$maybeForDashboard$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/stripe/android/networking/StripeApiRepository$maybeForDashboard$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/model/ConfirmPaymentIntentParams;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p3, Lkotlin/Result;

    invoke-virtual {p3}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p2

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 1895
    invoke-virtual {p2}, Lcom/stripe/android/core/networking/ApiRequest$Options;->getApiKeyIsUserKey()Z

    move-result p3

    if-eqz p3, :cond_6

    invoke-virtual {p1}, Lcom/stripe/android/model/ConfirmPaymentIntentParams;->getPaymentMethodCreateParams()Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object p3

    if-nez p3, :cond_3

    goto :goto_3

    .line 1901
    :cond_3
    invoke-virtual {p1}, Lcom/stripe/android/model/ConfirmPaymentIntentParams;->getPaymentMethodCreateParams()Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object p3

    .line 1900
    iput-object p1, v0, Lcom/stripe/android/networking/StripeApiRepository$maybeForDashboard$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/networking/StripeApiRepository$maybeForDashboard$1;->label:I

    invoke-virtual {p0, p3, p2, v0}, Lcom/stripe/android/networking/StripeApiRepository;->createPaymentMethod-0E7RQCE(Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    return-object v1

    .line 1905
    :cond_4
    :goto_1
    invoke-static {p2}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_5

    :try_start_0
    sget-object p3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    check-cast p2, Lcom/stripe/android/model/PaymentMethod;

    .line 1906
    sget-object p3, Lcom/stripe/android/model/ConfirmPaymentIntentParams;->Companion:Lcom/stripe/android/model/ConfirmPaymentIntentParams$Companion;

    .line 1907
    invoke-virtual {p1}, Lcom/stripe/android/model/ConfirmPaymentIntentParams;->getClientSecret()Ljava/lang/String;

    move-result-object v0

    .line 1908
    iget-object p2, p2, Lcom/stripe/android/model/PaymentMethod;->id:Ljava/lang/String;

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1909
    invoke-virtual {p1}, Lcom/stripe/android/model/ConfirmPaymentIntentParams;->getPaymentMethodOptions()Lcom/stripe/android/model/PaymentMethodOptionsParams;

    move-result-object p1

    .line 1906
    invoke-virtual {p3, v0, p2, p1}, Lcom/stripe/android/model/ConfirmPaymentIntentParams$Companion;->createForDashboard$payments_core_release(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethodOptionsParams;)Lcom/stripe/android/model/ConfirmPaymentIntentParams;

    move-result-object p1

    .line 1905
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p1

    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_2
    return-object p1

    :cond_5
    invoke-static {p2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 1896
    :cond_6
    :goto_3
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private final maybeForDashboard-0E7RQCE(Lcom/stripe/android/model/ConfirmSetupIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/ConfirmSetupIntentParams;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/ConfirmSetupIntentParams;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/stripe/android/networking/StripeApiRepository$maybeForDashboard$3;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/networking/StripeApiRepository$maybeForDashboard$3;

    iget v1, v0, Lcom/stripe/android/networking/StripeApiRepository$maybeForDashboard$3;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p3, v0, Lcom/stripe/android/networking/StripeApiRepository$maybeForDashboard$3;->label:I

    sub-int/2addr p3, v2

    iput p3, v0, Lcom/stripe/android/networking/StripeApiRepository$maybeForDashboard$3;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/networking/StripeApiRepository$maybeForDashboard$3;

    invoke-direct {v0, p0, p3}, Lcom/stripe/android/networking/StripeApiRepository$maybeForDashboard$3;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lcom/stripe/android/networking/StripeApiRepository$maybeForDashboard$3;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 1914
    iget v2, v0, Lcom/stripe/android/networking/StripeApiRepository$maybeForDashboard$3;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/stripe/android/networking/StripeApiRepository$maybeForDashboard$3;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/model/ConfirmSetupIntentParams;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p3, Lkotlin/Result;

    invoke-virtual {p3}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p2

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 1917
    invoke-virtual {p2}, Lcom/stripe/android/core/networking/ApiRequest$Options;->getApiKeyIsUserKey()Z

    move-result p3

    if-eqz p3, :cond_6

    invoke-virtual {p1}, Lcom/stripe/android/model/ConfirmSetupIntentParams;->getPaymentMethodCreateParams$payments_core_release()Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object p3

    if-nez p3, :cond_3

    goto :goto_3

    .line 1923
    :cond_3
    invoke-virtual {p1}, Lcom/stripe/android/model/ConfirmSetupIntentParams;->getPaymentMethodCreateParams$payments_core_release()Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object p3

    .line 1922
    iput-object p1, v0, Lcom/stripe/android/networking/StripeApiRepository$maybeForDashboard$3;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/networking/StripeApiRepository$maybeForDashboard$3;->label:I

    invoke-virtual {p0, p3, p2, v0}, Lcom/stripe/android/networking/StripeApiRepository;->createPaymentMethod-0E7RQCE(Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    return-object v1

    .line 1927
    :cond_4
    :goto_1
    invoke-static {p2}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_5

    :try_start_0
    sget-object p3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    check-cast p2, Lcom/stripe/android/model/PaymentMethod;

    .line 1928
    sget-object p3, Lcom/stripe/android/model/ConfirmSetupIntentParams;->Companion:Lcom/stripe/android/model/ConfirmSetupIntentParams$Companion;

    .line 1929
    invoke-virtual {p1}, Lcom/stripe/android/model/ConfirmSetupIntentParams;->getClientSecret()Ljava/lang/String;

    move-result-object v0

    .line 1930
    iget-object p2, p2, Lcom/stripe/android/model/PaymentMethod;->id:Ljava/lang/String;

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1931
    invoke-virtual {p1}, Lcom/stripe/android/model/ConfirmSetupIntentParams;->getPaymentMethodOptions()Lcom/stripe/android/model/PaymentMethodOptionsParams;

    move-result-object p1

    .line 1928
    invoke-virtual {p3, v0, p2, p1}, Lcom/stripe/android/model/ConfirmSetupIntentParams$Companion;->createForDashboard$payments_core_release(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethodOptionsParams;)Lcom/stripe/android/model/ConfirmSetupIntentParams;

    move-result-object p1

    .line 1927
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p1

    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_2
    return-object p1

    :cond_5
    invoke-static {p2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 1918
    :cond_6
    :goto_3
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private static final refreshPaymentIntent_0E7RQCE$lambda$11(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/Result;)Lkotlin/Unit;
    .locals 9

    .line 339
    iget-object v0, p0, Lcom/stripe/android/networking/StripeApiRepository;->paymentAnalyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    sget-object v1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->PaymentIntentRefresh:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v7, 0x3e

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v0 .. v8}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;->createRequest$payments_core_release$default(Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/model/Token$Type;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/core/networking/AnalyticsRequest;

    move-result-object p1

    .line 338
    invoke-virtual {p0, p1}, Lcom/stripe/android/networking/StripeApiRepository;->fireAnalyticsRequest$payments_core_release(Lcom/stripe/android/core/networking/AnalyticsRequest;)V

    .line 341
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final refreshSetupIntent_0E7RQCE$lambda$14(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/Result;)Lkotlin/Unit;
    .locals 9

    .line 372
    iget-object v0, p0, Lcom/stripe/android/networking/StripeApiRepository;->paymentAnalyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    sget-object v1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->SetupIntentRefresh:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v7, 0x3e

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v0 .. v8}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;->createRequest$payments_core_release$default(Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/model/Token$Type;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/core/networking/AnalyticsRequest;

    move-result-object p1

    .line 371
    invoke-virtual {p0, p1}, Lcom/stripe/android/networking/StripeApiRepository;->fireAnalyticsRequest$payments_core_release(Lcom/stripe/android/core/networking/AnalyticsRequest;)V

    .line 374
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private final resetDnsCache(Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData;)V
    .locals 1

    .line 1822
    instance-of v0, p1, Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData$Success;

    if-eqz v0, :cond_1

    .line 1827
    check-cast p1, Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData$Success;

    invoke-virtual {p1}, Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData$Success;->getOriginalDnsCacheTtl()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    const-string p1, "-1"

    .line 1825
    :cond_0
    const-string v0, "networkaddress.cache.ttl"

    invoke-static {v0, p1}, Ljava/security/Security;->setProperty(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method private static final retrieveCustomer_BWLJW6A$lambda$39(Lcom/stripe/android/networking/StripeApiRepository;Ljava/util/Set;Lkotlin/Result;)Lkotlin/Unit;
    .locals 9

    .line 920
    iget-object v0, p0, Lcom/stripe/android/networking/StripeApiRepository;->paymentAnalyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    .line 921
    sget-object v1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->CustomerRetrieve:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v7, 0x3c

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v2, p1

    .line 920
    invoke-static/range {v0 .. v8}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;->createRequest$payments_core_release$default(Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/model/Token$Type;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/core/networking/AnalyticsRequest;

    move-result-object p1

    .line 919
    invoke-virtual {p0, p1}, Lcom/stripe/android/networking/StripeApiRepository;->fireAnalyticsRequest$payments_core_release(Lcom/stripe/android/core/networking/AnalyticsRequest;)V

    .line 925
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private final retrieveElementsSession-BWLJW6A(Lcom/stripe/android/model/ElementsSessionParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/ElementsSessionParams;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lcom/stripe/android/networking/PaymentAnalyticsEvent;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/ElementsSession;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p4

    instance-of v2, v1, Lcom/stripe/android/networking/StripeApiRepository$retrieveElementsSession$2;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lcom/stripe/android/networking/StripeApiRepository$retrieveElementsSession$2;

    iget v3, v2, Lcom/stripe/android/networking/StripeApiRepository$retrieveElementsSession$2;->label:I

    const/high16 v4, -0x80000000

    and-int/2addr v3, v4

    if-eqz v3, :cond_0

    iget v1, v2, Lcom/stripe/android/networking/StripeApiRepository$retrieveElementsSession$2;->label:I

    sub-int/2addr v1, v4

    iput v1, v2, Lcom/stripe/android/networking/StripeApiRepository$retrieveElementsSession$2;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/stripe/android/networking/StripeApiRepository$retrieveElementsSession$2;

    invoke-direct {v2, v0, v1}, Lcom/stripe/android/networking/StripeApiRepository$retrieveElementsSession$2;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v7, v2

    iget-object v1, v7, Lcom/stripe/android/networking/StripeApiRepository$retrieveElementsSession$2;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v8

    .line 1641
    iget v2, v7, Lcom/stripe/android/networking/StripeApiRepository$retrieveElementsSession$2;->label:I

    const/4 v9, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v9, :cond_1

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v1, Lkotlin/Result;

    invoke-virtual {v1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v1

    return-object v1

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 1647
    invoke-virtual/range {p2 .. p2}, Lcom/stripe/android/core/networking/ApiRequest$Options;->getApiKeyIsUserKey()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 1648
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Invalid API key"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Throwable;

    invoke-static {v1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    return-object v1

    .line 1651
    :cond_3
    invoke-direct {v0}, Lcom/stripe/android/networking/StripeApiRepository;->fireFraudDetectionDataRequest()V

    .line 1653
    new-instance v1, Lcom/stripe/android/model/parsers/ElementsSessionJsonParser;

    .line 1655
    invoke-virtual/range {p2 .. p2}, Lcom/stripe/android/core/networking/ApiRequest$Options;->getApiKeyIsLiveMode()Z

    move-result v3

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object/from16 v2, p1

    .line 1653
    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/model/parsers/ElementsSessionJsonParser;-><init>(Lcom/stripe/android/model/ElementsSessionParams;ZLkotlin/jvm/functions/Function0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 1658
    invoke-static {}, Lkotlin/collections/MapsKt;->createMapBuilder()Ljava/util/Map;

    move-result-object v3

    .line 1659
    const-string v4, "type"

    invoke-interface {v2}, Lcom/stripe/android/model/ElementsSessionParams;->getType()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v3, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1660
    const-string v4, "mobile_app_id"

    invoke-interface {v2}, Lcom/stripe/android/model/ElementsSessionParams;->getAppId()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v3, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1661
    invoke-interface {v2}, Lcom/stripe/android/model/ElementsSessionParams;->getClientSecret()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_4

    const-string v5, "client_secret"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1662
    :cond_4
    invoke-interface {v2}, Lcom/stripe/android/model/ElementsSessionParams;->getLocale()Ljava/lang/String;

    move-result-object v4

    const-string v5, "locale"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1663
    invoke-interface {v2}, Lcom/stripe/android/model/ElementsSessionParams;->getCustomerSessionClientSecret()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_5

    const-string v5, "customer_session_client_secret"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1664
    :cond_5
    invoke-interface {v2}, Lcom/stripe/android/model/ElementsSessionParams;->getLegacyCustomerEphemeralKey()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_6

    const-string v5, "legacy_customer_ephemeral_key"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1665
    :cond_6
    invoke-interface {v2}, Lcom/stripe/android/model/ElementsSessionParams;->getExternalPaymentMethods()Ljava/util/List;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    const/4 v6, 0x0

    if-nez v5, :cond_7

    goto :goto_1

    :cond_7
    move-object v4, v6

    :goto_1
    if-eqz v4, :cond_8

    const-string v5, "external_payment_methods"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1666
    :cond_8
    invoke-interface {v2}, Lcom/stripe/android/model/ElementsSessionParams;->getCustomPaymentMethods()Ljava/util/List;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_9

    goto :goto_2

    :cond_9
    move-object v4, v6

    :goto_2
    if-eqz v4, :cond_a

    const-string v5, "custom_payment_methods"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1667
    :cond_a
    invoke-interface {v2}, Lcom/stripe/android/model/ElementsSessionParams;->getMobileSessionId()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_c

    move-object v5, v4

    check-cast v5, Ljava/lang/CharSequence;

    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    move-result v5

    if-lez v5, :cond_b

    goto :goto_3

    :cond_b
    move-object v4, v6

    :goto_3
    if-eqz v4, :cond_c

    const-string v5, "mobile_session_id"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1668
    :cond_c
    invoke-interface {v2}, Lcom/stripe/android/model/ElementsSessionParams;->getSavedPaymentMethodSelectionId()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_d

    const-string v5, "client_default_payment_method"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1669
    :cond_d
    invoke-interface {v2}, Lcom/stripe/android/model/ElementsSessionParams;->getSellerDetails()Lcom/stripe/android/model/ElementsSessionParams$SellerDetails;

    move-result-object v4

    if-eqz v4, :cond_e

    invoke-virtual {v4}, Lcom/stripe/android/model/ElementsSessionParams$SellerDetails;->toQueryParams()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 1670
    :cond_e
    instance-of v4, v2, Lcom/stripe/android/model/ElementsSessionParams$DeferredIntentType;

    if-eqz v4, :cond_f

    move-object v6, v2

    check-cast v6, Lcom/stripe/android/model/ElementsSessionParams$DeferredIntentType;

    :cond_f
    if-eqz v6, :cond_10

    .line 1671
    invoke-virtual {v6}, Lcom/stripe/android/model/ElementsSessionParams$DeferredIntentType;->getDeferredIntentParams()Lcom/stripe/android/model/DeferredIntentParams;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/model/DeferredIntentParams;->toQueryParams()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 1658
    :cond_10
    invoke-static {v3}, Lkotlin/collections/MapsKt;->build(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v3

    .line 1676
    iget-object v10, v0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 1677
    sget-object v4, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    const-string v5, "elements/sessions"

    invoke-static {v4, v5}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->access$getApiUrl(Lcom/stripe/android/networking/StripeApiRepository$Companion;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 1679
    invoke-interface {v2}, Lcom/stripe/android/model/ElementsSessionParams;->getExpandFields()Ljava/util/List;

    move-result-object v2

    invoke-static {v4, v2}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->access$createExpandParam(Lcom/stripe/android/networking/StripeApiRepository$Companion;Ljava/util/List;)Ljava/util/Map;

    move-result-object v2

    invoke-static {v3, v2}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v13

    const/16 v15, 0x8

    const/16 v16, 0x0

    const/4 v14, 0x0

    move-object/from16 v12, p2

    .line 1676
    invoke-static/range {v10 .. v16}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createGet$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object v2

    .line 1681
    check-cast v1, Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    .line 1675
    new-instance v3, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda37;

    move-object/from16 v4, p3

    invoke-direct {v3, v4, v0}, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda37;-><init>(Lcom/stripe/android/networking/PaymentAnalyticsEvent;Lcom/stripe/android/networking/StripeApiRepository;)V

    iput v9, v7, Lcom/stripe/android/networking/StripeApiRepository$retrieveElementsSession$2;->label:I

    invoke-direct {v0, v2, v1, v3, v7}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModelResult-BWLJW6A(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v8, :cond_11

    return-object v8

    :cond_11
    return-object v1
.end method

.method private static final retrieveElementsSession_BWLJW6A$lambda$100(Lcom/stripe/android/networking/PaymentAnalyticsEvent;Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/Result;)Lkotlin/Unit;
    .locals 9

    if-eqz p0, :cond_0

    .line 1684
    iget-object v0, p1, Lcom/stripe/android/networking/StripeApiRepository;->paymentAnalyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    const/16 v7, 0x3e

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    invoke-static/range {v0 .. v8}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;->createRequest$payments_core_release$default(Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/model/Token$Type;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/core/networking/AnalyticsRequest;

    move-result-object p0

    invoke-virtual {p1, p0}, Lcom/stripe/android/networking/StripeApiRepository;->fireAnalyticsRequest$payments_core_release(Lcom/stripe/android/core/networking/AnalyticsRequest;)V

    .line 1686
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final retrieveIssuingCardPin_yxL6bBk$lambda$40(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/Result;)Lkotlin/Unit;
    .locals 0

    .line 946
    sget-object p1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->IssuingRetrievePin:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    invoke-direct {p0, p1}, Lcom/stripe/android/networking/StripeApiRepository;->fireAnalyticsRequest(Lcom/stripe/android/networking/PaymentAnalyticsEvent;)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final retrieveObject_0E7RQCE$lambda$51$lambda$50(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/Result;)Lkotlin/Unit;
    .locals 0

    .line 1073
    sget-object p1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->StripeUrlRetrieve:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    invoke-direct {p0, p1}, Lcom/stripe/android/networking/StripeApiRepository;->fireAnalyticsRequest(Lcom/stripe/android/networking/PaymentAnalyticsEvent;)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final retrievePaymentIntent_BWLJW6A$lambda$8(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/Result;)Lkotlin/Unit;
    .locals 9

    .line 306
    iget-object v0, p0, Lcom/stripe/android/networking/StripeApiRepository;->paymentAnalyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    sget-object v1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->PaymentIntentRetrieve:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v7, 0x3e

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v0 .. v8}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;->createRequest$payments_core_release$default(Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/model/Token$Type;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/core/networking/AnalyticsRequest;

    move-result-object p1

    .line 305
    invoke-virtual {p0, p1}, Lcom/stripe/android/networking/StripeApiRepository;->fireAnalyticsRequest$payments_core_release(Lcom/stripe/android/core/networking/AnalyticsRequest;)V

    .line 308
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final retrievePaymentMethodMessage_eH_QyT8$lambda$82(Lkotlin/Result;)Lkotlin/Unit;
    .locals 0

    .line 1483
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final retrieveSetupIntent_BWLJW6A$lambda$23(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/Result;)Lkotlin/Unit;
    .locals 9

    .line 495
    iget-object v0, p0, Lcom/stripe/android/networking/StripeApiRepository;->paymentAnalyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    sget-object v1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->SetupIntentRetrieve:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v7, 0x3e

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v0 .. v8}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;->createRequest$payments_core_release$default(Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/model/Token$Type;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/core/networking/AnalyticsRequest;

    move-result-object p1

    .line 494
    invoke-virtual {p0, p1}, Lcom/stripe/android/networking/StripeApiRepository;->fireAnalyticsRequest$payments_core_release(Lcom/stripe/android/core/networking/AnalyticsRequest;)V

    .line 497
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final retrieveSource_BWLJW6A$lambda$26(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/Result;)Lkotlin/Unit;
    .locals 9

    .line 574
    iget-object v0, p0, Lcom/stripe/android/networking/StripeApiRepository;->paymentAnalyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    sget-object v1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->SourceRetrieve:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v7, 0x3e

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v0 .. v8}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;->createRequest$payments_core_release$default(Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/model/Token$Type;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/core/networking/AnalyticsRequest;

    move-result-object p1

    .line 573
    invoke-virtual {p0, p1}, Lcom/stripe/android/networking/StripeApiRepository;->fireAnalyticsRequest$payments_core_release(Lcom/stripe/android/core/networking/AnalyticsRequest;)V

    .line 576
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final setCustomerShippingInfo_hUnOzRk$lambda$38(Lcom/stripe/android/networking/StripeApiRepository;Ljava/util/Set;Lkotlin/Result;)Lkotlin/Unit;
    .locals 9

    .line 896
    iget-object v0, p0, Lcom/stripe/android/networking/StripeApiRepository;->paymentAnalyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    .line 897
    sget-object v1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->CustomerSetShippingInfo:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v7, 0x3c

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v2, p1

    .line 896
    invoke-static/range {v0 .. v8}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;->createRequest$payments_core_release$default(Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/model/Token$Type;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/core/networking/AnalyticsRequest;

    move-result-object p1

    .line 895
    invoke-virtual {p0, p1}, Lcom/stripe/android/networking/StripeApiRepository;->fireAnalyticsRequest$payments_core_release(Lcom/stripe/android/core/networking/AnalyticsRequest;)V

    .line 901
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final setDefaultCustomerSource_bMdYcbs$lambda$37(Lcom/stripe/android/networking/StripeApiRepository;Ljava/util/Set;Ljava/lang/String;Lkotlin/Result;)Lkotlin/Unit;
    .locals 9

    .line 868
    iget-object v0, p0, Lcom/stripe/android/networking/StripeApiRepository;->paymentAnalyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    .line 869
    sget-object v1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->CustomerSetDefaultSource:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v7, 0x38

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v2, p1

    move-object v3, p2

    .line 868
    invoke-static/range {v0 .. v8}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;->createRequest$payments_core_release$default(Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/model/Token$Type;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/core/networking/AnalyticsRequest;

    move-result-object p1

    .line 867
    invoke-virtual {p0, p1}, Lcom/stripe/android/networking/StripeApiRepository;->fireAnalyticsRequest$payments_core_release(Lcom/stripe/android/core/networking/AnalyticsRequest;)V

    .line 874
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final start3ds2Auth_0E7RQCE$lambda$46(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/Result;)Lkotlin/Unit;
    .locals 9

    .line 1024
    iget-object v0, p0, Lcom/stripe/android/networking/StripeApiRepository;->paymentAnalyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    sget-object v1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Auth3ds2Start:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v7, 0x3e

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v0 .. v8}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;->createRequest$payments_core_release$default(Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/model/Token$Type;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/core/networking/AnalyticsRequest;

    move-result-object p1

    .line 1023
    invoke-virtual {p0, p1}, Lcom/stripe/android/networking/StripeApiRepository;->fireAnalyticsRequest$payments_core_release(Lcom/stripe/android/core/networking/AnalyticsRequest;)V

    .line 1026
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final updateIssuingCardPin$lambda$43$lambda$42(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/Result;)Lkotlin/Unit;
    .locals 0

    .line 970
    sget-object p1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->IssuingUpdatePin:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    invoke-direct {p0, p1}, Lcom/stripe/android/networking/StripeApiRepository;->fireAnalyticsRequest(Lcom/stripe/android/networking/PaymentAnalyticsEvent;)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final updatePaymentMethod_BWLJW6A$lambda$28(Lcom/stripe/android/networking/StripeApiRepository;Lcom/stripe/android/model/PaymentMethodUpdateParams;Lkotlin/Result;)Lkotlin/Unit;
    .locals 1

    .line 623
    iget-object p2, p0, Lcom/stripe/android/networking/StripeApiRepository;->paymentAnalyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    .line 624
    invoke-virtual {p1}, Lcom/stripe/android/model/PaymentMethodUpdateParams;->getType$payments_core_release()Lcom/stripe/android/model/PaymentMethod$Type;

    move-result-object v0

    iget-object v0, v0, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    .line 625
    invoke-virtual {p1}, Lcom/stripe/android/model/PaymentMethodUpdateParams;->getProductUsageTokens$payments_core_release()Ljava/util/Set;

    move-result-object p1

    .line 623
    invoke-virtual {p2, v0, p1}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;->createPaymentMethodUpdate$payments_core_release(Ljava/lang/String;Ljava/util/Set;)Lcom/stripe/android/core/networking/AnalyticsRequest;

    move-result-object p1

    .line 622
    invoke-virtual {p0, p1}, Lcom/stripe/android/networking/StripeApiRepository;->fireAnalyticsRequest$payments_core_release(Lcom/stripe/android/core/networking/AnalyticsRequest;)V

    .line 628
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final verifyPaymentIntentWithMicrodeposits_BWLJW6A$lambda$76(Lkotlin/Result;)Lkotlin/Unit;
    .locals 0

    .line 1398
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final verifyPaymentIntentWithMicrodeposits_yxL6bBk$lambda$73(Lkotlin/Result;)Lkotlin/Unit;
    .locals 0

    .line 1369
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public addCustomerSource-bMdYcbs(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/Source;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 p2, p7

    instance-of v0, p2, Lcom/stripe/android/networking/StripeApiRepository$addCustomerSource$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/networking/StripeApiRepository$addCustomerSource$1;

    iget v1, v0, Lcom/stripe/android/networking/StripeApiRepository$addCustomerSource$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p2, v0, Lcom/stripe/android/networking/StripeApiRepository$addCustomerSource$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcom/stripe/android/networking/StripeApiRepository$addCustomerSource$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/networking/StripeApiRepository$addCustomerSource$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/networking/StripeApiRepository$addCustomerSource$1;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/stripe/android/networking/StripeApiRepository$addCustomerSource$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 685
    iget v2, v0, Lcom/stripe/android/networking/StripeApiRepository$addCustomerSource$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p2, Lkotlin/Result;

    invoke-virtual {p2}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 694
    iget-object v4, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 695
    sget-object p2, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    invoke-virtual {p2, p1}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getAddCustomerSourceUrl$payments_core_release(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 697
    const-string p1, "source"

    invoke-static {p1, p4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v7

    const/16 v9, 0x8

    const/4 v10, 0x0

    const/4 v8, 0x0

    move-object/from16 v6, p6

    .line 694
    invoke-static/range {v4 .. v10}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    .line 699
    new-instance p2, Lcom/stripe/android/model/parsers/SourceJsonParser;

    invoke-direct {p2}, Lcom/stripe/android/model/parsers/SourceJsonParser;-><init>()V

    check-cast p2, Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    .line 693
    new-instance v2, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda21;

    move-object/from16 v4, p5

    invoke-direct {v2, p0, p3, v4}, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda21;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Ljava/util/Set;Ljava/lang/String;)V

    iput v3, v0, Lcom/stripe/android/networking/StripeApiRepository$addCustomerSource$1;->label:I

    invoke-direct {p0, p1, p2, v2, v0}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModelResult-BWLJW6A(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method

.method public attachFinancialConnectionsSessionToPaymentIntent-hUnOzRk(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/PaymentIntent;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p6

    instance-of v1, v0, Lcom/stripe/android/networking/StripeApiRepository$attachFinancialConnectionsSessionToPaymentIntent$1;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lcom/stripe/android/networking/StripeApiRepository$attachFinancialConnectionsSessionToPaymentIntent$1;

    iget v2, v1, Lcom/stripe/android/networking/StripeApiRepository$attachFinancialConnectionsSessionToPaymentIntent$1;->label:I

    const/high16 v3, -0x80000000

    and-int/2addr v2, v3

    if-eqz v2, :cond_0

    iget v0, v1, Lcom/stripe/android/networking/StripeApiRepository$attachFinancialConnectionsSessionToPaymentIntent$1;->label:I

    sub-int/2addr v0, v3

    iput v0, v1, Lcom/stripe/android/networking/StripeApiRepository$attachFinancialConnectionsSessionToPaymentIntent$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/stripe/android/networking/StripeApiRepository$attachFinancialConnectionsSessionToPaymentIntent$1;

    invoke-direct {v1, p0, v0}, Lcom/stripe/android/networking/StripeApiRepository$attachFinancialConnectionsSessionToPaymentIntent$1;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object v0, v1, Lcom/stripe/android/networking/StripeApiRepository$attachFinancialConnectionsSessionToPaymentIntent$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    .line 1293
    iget v3, v1, Lcom/stripe/android/networking/StripeApiRepository$attachFinancialConnectionsSessionToPaymentIntent$1;->label:I

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v4, :cond_1

    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v0, Lkotlin/Result;

    invoke-virtual {v0}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 1301
    iget-object v5, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 1302
    sget-object v0, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    invoke-virtual {v0, p2, p3}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getAttachFinancialConnectionsSessionToPaymentIntentUrl$payments_core_release(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 1307
    const-string p2, "client_secret"

    invoke-static {p2, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    move-object/from16 p2, p5

    .line 1308
    invoke-static {v0, p2}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->access$createExpandParam(Lcom/stripe/android/networking/StripeApiRepository$Companion;Ljava/util/List;)Ljava/util/Map;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v8

    const/16 v10, 0x8

    const/4 v11, 0x0

    const/4 v9, 0x0

    move-object/from16 v7, p4

    .line 1301
    invoke-static/range {v5 .. v11}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    .line 1310
    new-instance p2, Lcom/stripe/android/model/parsers/PaymentIntentJsonParser;

    invoke-direct {p2}, Lcom/stripe/android/model/parsers/PaymentIntentJsonParser;-><init>()V

    check-cast p2, Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    new-instance p3, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda26;

    invoke-direct {p3}, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda26;-><init>()V

    .line 1300
    iput v4, v1, Lcom/stripe/android/networking/StripeApiRepository$attachFinancialConnectionsSessionToPaymentIntent$1;->label:I

    invoke-direct {p0, p1, p2, p3, v1}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModelResult-BWLJW6A(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_3

    return-object v2

    :cond_3
    return-object p1
.end method

.method public attachFinancialConnectionsSessionToSetupIntent-hUnOzRk(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/SetupIntent;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p6

    instance-of v1, v0, Lcom/stripe/android/networking/StripeApiRepository$attachFinancialConnectionsSessionToSetupIntent$1;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lcom/stripe/android/networking/StripeApiRepository$attachFinancialConnectionsSessionToSetupIntent$1;

    iget v2, v1, Lcom/stripe/android/networking/StripeApiRepository$attachFinancialConnectionsSessionToSetupIntent$1;->label:I

    const/high16 v3, -0x80000000

    and-int/2addr v2, v3

    if-eqz v2, :cond_0

    iget v0, v1, Lcom/stripe/android/networking/StripeApiRepository$attachFinancialConnectionsSessionToSetupIntent$1;->label:I

    sub-int/2addr v0, v3

    iput v0, v1, Lcom/stripe/android/networking/StripeApiRepository$attachFinancialConnectionsSessionToSetupIntent$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/stripe/android/networking/StripeApiRepository$attachFinancialConnectionsSessionToSetupIntent$1;

    invoke-direct {v1, p0, v0}, Lcom/stripe/android/networking/StripeApiRepository$attachFinancialConnectionsSessionToSetupIntent$1;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object v0, v1, Lcom/stripe/android/networking/StripeApiRepository$attachFinancialConnectionsSessionToSetupIntent$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    .line 1319
    iget v3, v1, Lcom/stripe/android/networking/StripeApiRepository$attachFinancialConnectionsSessionToSetupIntent$1;->label:I

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v4, :cond_1

    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v0, Lkotlin/Result;

    invoke-virtual {v0}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 1327
    iget-object v5, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 1328
    sget-object v0, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    invoke-virtual {v0, p2, p3}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getAttachFinancialConnectionsSessionToSetupIntentUrl$payments_core_release(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 1333
    const-string p2, "client_secret"

    invoke-static {p2, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    move-object/from16 p2, p5

    .line 1334
    invoke-static {v0, p2}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->access$createExpandParam(Lcom/stripe/android/networking/StripeApiRepository$Companion;Ljava/util/List;)Ljava/util/Map;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v8

    const/16 v10, 0x8

    const/4 v11, 0x0

    const/4 v9, 0x0

    move-object/from16 v7, p4

    .line 1327
    invoke-static/range {v5 .. v11}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    .line 1336
    new-instance p2, Lcom/stripe/android/model/parsers/SetupIntentJsonParser;

    invoke-direct {p2}, Lcom/stripe/android/model/parsers/SetupIntentJsonParser;-><init>()V

    check-cast p2, Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    new-instance p3, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda5;

    invoke-direct {p3}, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda5;-><init>()V

    .line 1326
    iput v4, v1, Lcom/stripe/android/networking/StripeApiRepository$attachFinancialConnectionsSessionToSetupIntent$1;->label:I

    invoke-direct {p0, p1, p2, p3, v1}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModelResult-BWLJW6A(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_3

    return-object v2

    :cond_3
    return-object p1
.end method

.method public attachHCaptchaToRadarSession-yxL6bBk(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/RadarSessionWithHCaptcha;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p3

    move-object/from16 v1, p5

    instance-of v2, v1, Lcom/stripe/android/networking/StripeApiRepository$attachHCaptchaToRadarSession$1;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lcom/stripe/android/networking/StripeApiRepository$attachHCaptchaToRadarSession$1;

    iget v3, v2, Lcom/stripe/android/networking/StripeApiRepository$attachHCaptchaToRadarSession$1;->label:I

    const/high16 v4, -0x80000000

    and-int/2addr v3, v4

    if-eqz v3, :cond_0

    iget v1, v2, Lcom/stripe/android/networking/StripeApiRepository$attachHCaptchaToRadarSession$1;->label:I

    sub-int/2addr v1, v4

    iput v1, v2, Lcom/stripe/android/networking/StripeApiRepository$attachHCaptchaToRadarSession$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/stripe/android/networking/StripeApiRepository$attachHCaptchaToRadarSession$1;

    invoke-direct {v2, p0, v1}, Lcom/stripe/android/networking/StripeApiRepository$attachHCaptchaToRadarSession$1;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v7, v2

    iget-object v1, v7, Lcom/stripe/android/networking/StripeApiRepository$attachHCaptchaToRadarSession$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    .line 1155
    iget v3, v7, Lcom/stripe/android/networking/StripeApiRepository$attachHCaptchaToRadarSession$1;->label:I

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v4, :cond_1

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v1, Lkotlin/Result;

    invoke-virtual {v1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 1162
    iget-object v8, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 1163
    sget-object v1, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    const-string v3, "radar/session/%s/attach_hcaptcha_token"

    filled-new-array/range {p1 .. p1}, [Ljava/lang/Object;

    move-result-object v5

    invoke-static {v1, v3, v5}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->access$getApiUrl(Lcom/stripe/android/networking/StripeApiRepository$Companion;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    .line 1166
    const-string v1, "passive_captcha_token"

    move-object/from16 v3, p2

    invoke-static {v1, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    .line 1165
    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v1

    if-eqz v0, :cond_3

    .line 1170
    const-string v3, "passive_captcha_ekey"

    invoke-static {v3, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    .line 1169
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    if-nez v0, :cond_4

    .line 1172
    :cond_3
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v0

    .line 1167
    :cond_4
    invoke-static {v1, v0}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v11

    const/16 v13, 0x8

    const/4 v14, 0x0

    const/4 v12, 0x0

    move-object/from16 v10, p4

    .line 1162
    invoke-static/range {v8 .. v14}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object v0

    .line 1175
    new-instance v1, Lcom/stripe/android/model/parsers/RadarSessionWithHCaptchaJsonParser;

    invoke-direct {v1}, Lcom/stripe/android/model/parsers/RadarSessionWithHCaptchaJsonParser;-><init>()V

    move-object v5, v1

    check-cast v5, Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    .line 1161
    iput v4, v7, Lcom/stripe/android/networking/StripeApiRepository$attachHCaptchaToRadarSession$1;->label:I

    const/4 v6, 0x0

    const/4 v8, 0x4

    const/4 v9, 0x0

    move-object v3, p0

    move-object v4, v0

    invoke-static/range {v3 .. v9}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModelResult-BWLJW6A$default(Lcom/stripe/android/networking/StripeApiRepository;Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_5

    return-object v2

    :cond_5
    return-object v0
.end method

.method public attachPaymentMethod-yxL6bBk(Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p5

    instance-of v1, v0, Lcom/stripe/android/networking/StripeApiRepository$attachPaymentMethod$1;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lcom/stripe/android/networking/StripeApiRepository$attachPaymentMethod$1;

    iget v2, v1, Lcom/stripe/android/networking/StripeApiRepository$attachPaymentMethod$1;->label:I

    const/high16 v3, -0x80000000

    and-int/2addr v2, v3

    if-eqz v2, :cond_0

    iget v0, v1, Lcom/stripe/android/networking/StripeApiRepository$attachPaymentMethod$1;->label:I

    sub-int/2addr v0, v3

    iput v0, v1, Lcom/stripe/android/networking/StripeApiRepository$attachPaymentMethod$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/stripe/android/networking/StripeApiRepository$attachPaymentMethod$1;

    invoke-direct {v1, p0, v0}, Lcom/stripe/android/networking/StripeApiRepository$attachPaymentMethod$1;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object v0, v1, Lcom/stripe/android/networking/StripeApiRepository$attachPaymentMethod$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    .line 738
    iget v3, v1, Lcom/stripe/android/networking/StripeApiRepository$attachPaymentMethod$1;->label:I

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v4, :cond_1

    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v0, Lkotlin/Result;

    invoke-virtual {v0}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 744
    invoke-direct {p0}, Lcom/stripe/android/networking/StripeApiRepository;->fireFraudDetectionDataRequest()V

    .line 747
    iget-object v5, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 748
    sget-object v0, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    invoke-virtual {v0, p3}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getAttachPaymentMethodUrl$payments_core_release(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 750
    const-string p3, "customer"

    invoke-static {p3, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v8

    const/16 v10, 0x8

    const/4 v11, 0x0

    const/4 v9, 0x0

    move-object/from16 v7, p4

    .line 747
    invoke-static/range {v5 .. v11}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    .line 752
    new-instance p3, Lcom/stripe/android/model/parsers/PaymentMethodJsonParser;

    invoke-direct {p3}, Lcom/stripe/android/model/parsers/PaymentMethodJsonParser;-><init>()V

    check-cast p3, Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    .line 746
    new-instance v0, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda23;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda23;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Ljava/util/Set;)V

    iput v4, v1, Lcom/stripe/android/networking/StripeApiRepository$attachPaymentMethod$1;->label:I

    invoke-direct {p0, p1, p3, v0, v1}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModelResult-BWLJW6A(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_3

    return-object v2

    :cond_3
    return-object p1
.end method

.method public buildPaymentUserAgent(Ljava/util/Set;)Ljava/lang/String;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string v0, "attribution"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1863
    const-string v0, "stripe-android/21.22.2"

    invoke-static {v0}, Lkotlin/collections/SetsKt;->setOf(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    .line 1864
    iget-object v1, p0, Lcom/stripe/android/networking/StripeApiRepository;->productUsageTokens:Ljava/util/Set;

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v0, v1}, Lkotlin/collections/SetsKt;->plus(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    .line 1865
    check-cast p1, Ljava/lang/Iterable;

    invoke-static {v0, p1}, Lkotlin/collections/SetsKt;->plus(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    .line 1866
    const-string p1, ";"

    move-object v1, p1

    check-cast v1, Ljava/lang/CharSequence;

    const/16 v7, 0x3e

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v0 .. v8}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public cancelPaymentIntentSource-BWLJW6A(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/PaymentIntent;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lcom/stripe/android/networking/StripeApiRepository$cancelPaymentIntentSource$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/stripe/android/networking/StripeApiRepository$cancelPaymentIntentSource$1;

    iget v1, v0, Lcom/stripe/android/networking/StripeApiRepository$cancelPaymentIntentSource$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p4, v0, Lcom/stripe/android/networking/StripeApiRepository$cancelPaymentIntentSource$1;->label:I

    sub-int/2addr p4, v2

    iput p4, v0, Lcom/stripe/android/networking/StripeApiRepository$cancelPaymentIntentSource$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/networking/StripeApiRepository$cancelPaymentIntentSource$1;

    invoke-direct {v0, p0, p4}, Lcom/stripe/android/networking/StripeApiRepository$cancelPaymentIntentSource$1;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p4, v0, Lcom/stripe/android/networking/StripeApiRepository$cancelPaymentIntentSource$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 380
    iget v2, v0, Lcom/stripe/android/networking/StripeApiRepository$cancelPaymentIntentSource$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p4, Lkotlin/Result;

    invoke-virtual {p4}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 385
    invoke-direct {p0}, Lcom/stripe/android/networking/StripeApiRepository;->fireFraudDetectionDataRequest()V

    .line 388
    iget-object v4, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 389
    sget-object p4, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    invoke-virtual {p4, p1}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getCancelPaymentIntentSourceUrl$payments_core_release(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 391
    const-string p1, "source"

    invoke-static {p1, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v7

    const/16 v9, 0x8

    const/4 v10, 0x0

    const/4 v8, 0x0

    move-object v6, p3

    .line 388
    invoke-static/range {v4 .. v10}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    .line 393
    new-instance p2, Lcom/stripe/android/model/parsers/PaymentIntentJsonParser;

    invoke-direct {p2}, Lcom/stripe/android/model/parsers/PaymentIntentJsonParser;-><init>()V

    check-cast p2, Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    .line 387
    new-instance p3, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda31;

    invoke-direct {p3, p0}, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda31;-><init>(Lcom/stripe/android/networking/StripeApiRepository;)V

    iput v3, v0, Lcom/stripe/android/networking/StripeApiRepository$cancelPaymentIntentSource$1;->label:I

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModelResult-BWLJW6A(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method

.method public cancelSetupIntentSource-BWLJW6A(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/SetupIntent;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lcom/stripe/android/networking/StripeApiRepository$cancelSetupIntentSource$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/stripe/android/networking/StripeApiRepository$cancelSetupIntentSource$1;

    iget v1, v0, Lcom/stripe/android/networking/StripeApiRepository$cancelSetupIntentSource$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p4, v0, Lcom/stripe/android/networking/StripeApiRepository$cancelSetupIntentSource$1;->label:I

    sub-int/2addr p4, v2

    iput p4, v0, Lcom/stripe/android/networking/StripeApiRepository$cancelSetupIntentSource$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/networking/StripeApiRepository$cancelSetupIntentSource$1;

    invoke-direct {v0, p0, p4}, Lcom/stripe/android/networking/StripeApiRepository$cancelSetupIntentSource$1;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p4, v0, Lcom/stripe/android/networking/StripeApiRepository$cancelSetupIntentSource$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 503
    iget v2, v0, Lcom/stripe/android/networking/StripeApiRepository$cancelSetupIntentSource$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p4, Lkotlin/Result;

    invoke-virtual {p4}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 509
    iget-object v4, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 510
    sget-object p4, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    invoke-virtual {p4, p1}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getCancelSetupIntentSourceUrl$payments_core_release(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 512
    const-string p1, "source"

    invoke-static {p1, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v7

    const/16 v9, 0x8

    const/4 v10, 0x0

    const/4 v8, 0x0

    move-object v6, p3

    .line 509
    invoke-static/range {v4 .. v10}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    .line 514
    new-instance p2, Lcom/stripe/android/model/parsers/SetupIntentJsonParser;

    invoke-direct {p2}, Lcom/stripe/android/model/parsers/SetupIntentJsonParser;-><init>()V

    check-cast p2, Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    .line 508
    new-instance p3, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda22;

    invoke-direct {p3, p0}, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda22;-><init>(Lcom/stripe/android/networking/StripeApiRepository;)V

    iput v3, v0, Lcom/stripe/android/networking/StripeApiRepository$cancelSetupIntentSource$1;->label:I

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModelResult-BWLJW6A(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method

.method public complete3ds2Auth-0E7RQCE(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/Stripe3ds2AuthResult;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p3

    instance-of v1, v0, Lcom/stripe/android/networking/StripeApiRepository$complete3ds2Auth$1;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lcom/stripe/android/networking/StripeApiRepository$complete3ds2Auth$1;

    iget v2, v1, Lcom/stripe/android/networking/StripeApiRepository$complete3ds2Auth$1;->label:I

    const/high16 v3, -0x80000000

    and-int/2addr v2, v3

    if-eqz v2, :cond_0

    iget v0, v1, Lcom/stripe/android/networking/StripeApiRepository$complete3ds2Auth$1;->label:I

    sub-int/2addr v0, v3

    iput v0, v1, Lcom/stripe/android/networking/StripeApiRepository$complete3ds2Auth$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/stripe/android/networking/StripeApiRepository$complete3ds2Auth$1;

    invoke-direct {v1, p0, v0}, Lcom/stripe/android/networking/StripeApiRepository$complete3ds2Auth$1;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v6, v1

    iget-object v0, v6, Lcom/stripe/android/networking/StripeApiRepository$complete3ds2Auth$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 1029
    iget v2, v6, Lcom/stripe/android/networking/StripeApiRepository$complete3ds2Auth$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v0, Lkotlin/Result;

    invoke-virtual {v0}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 1034
    iget-object v7, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 1035
    sget-object v0, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    const-string v2, "3ds2/challenge_complete"

    invoke-static {v0, v2}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->access$getApiUrl(Lcom/stripe/android/networking/StripeApiRepository$Companion;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 1037
    const-string v0, "source"

    invoke-static {v0, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v10

    const/16 v12, 0x8

    const/4 v13, 0x0

    const/4 v11, 0x0

    move-object/from16 v9, p2

    .line 1034
    invoke-static/range {v7 .. v13}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object v0

    .line 1039
    new-instance v2, Lcom/stripe/android/model/parsers/Stripe3ds2AuthResultJsonParser;

    invoke-direct {v2}, Lcom/stripe/android/model/parsers/Stripe3ds2AuthResultJsonParser;-><init>()V

    move-object v4, v2

    check-cast v4, Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    .line 1033
    iput v3, v6, Lcom/stripe/android/networking/StripeApiRepository$complete3ds2Auth$1;->label:I

    const/4 v5, 0x0

    const/4 v7, 0x4

    const/4 v8, 0x0

    move-object v2, p0

    move-object v3, v0

    invoke-static/range {v2 .. v8}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModelResult-BWLJW6A$default(Lcom/stripe/android/networking/StripeApiRepository;Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    return-object v0
.end method

.method public confirmPaymentIntent-BWLJW6A(Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/ConfirmPaymentIntentParams;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/PaymentIntent;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lcom/stripe/android/networking/StripeApiRepository$confirmPaymentIntent$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/stripe/android/networking/StripeApiRepository$confirmPaymentIntent$1;

    iget v1, v0, Lcom/stripe/android/networking/StripeApiRepository$confirmPaymentIntent$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p4, v0, Lcom/stripe/android/networking/StripeApiRepository$confirmPaymentIntent$1;->label:I

    sub-int/2addr p4, v2

    iput p4, v0, Lcom/stripe/android/networking/StripeApiRepository$confirmPaymentIntent$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/networking/StripeApiRepository$confirmPaymentIntent$1;

    invoke-direct {v0, p0, p4}, Lcom/stripe/android/networking/StripeApiRepository$confirmPaymentIntent$1;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p4, v0, Lcom/stripe/android/networking/StripeApiRepository$confirmPaymentIntent$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 211
    iget v2, v0, Lcom/stripe/android/networking/StripeApiRepository$confirmPaymentIntent$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p4, Lkotlin/Result;

    invoke-virtual {p4}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lcom/stripe/android/networking/StripeApiRepository$confirmPaymentIntent$1;->L$2:Ljava/lang/Object;

    move-object p3, p1

    check-cast p3, Ljava/util/List;

    iget-object p1, v0, Lcom/stripe/android/networking/StripeApiRepository$confirmPaymentIntent$1;->L$1:Ljava/lang/Object;

    move-object p2, p1

    check-cast p2, Lcom/stripe/android/core/networking/ApiRequest$Options;

    iget-object p1, v0, Lcom/stripe/android/networking/StripeApiRepository$confirmPaymentIntent$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/networking/StripeApiRepository;

    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p4, Lkotlin/Result;

    invoke-virtual {p4}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p4

    goto :goto_1

    :cond_3
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 216
    iput-object p0, v0, Lcom/stripe/android/networking/StripeApiRepository$confirmPaymentIntent$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lcom/stripe/android/networking/StripeApiRepository$confirmPaymentIntent$1;->L$1:Ljava/lang/Object;

    iput-object p3, v0, Lcom/stripe/android/networking/StripeApiRepository$confirmPaymentIntent$1;->L$2:Ljava/lang/Object;

    iput v4, v0, Lcom/stripe/android/networking/StripeApiRepository$confirmPaymentIntent$1;->label:I

    invoke-direct {p0, p1, p2, v0}, Lcom/stripe/android/networking/StripeApiRepository;->maybeForDashboard-0E7RQCE(Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_4

    goto :goto_2

    :cond_4
    move-object p1, p0

    .line 2303
    :goto_1
    invoke-static {p4}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-nez v2, :cond_6

    .line 2304
    check-cast p4, Lcom/stripe/android/model/ConfirmPaymentIntentParams;

    const/4 v2, 0x0

    .line 217
    iput-object v2, v0, Lcom/stripe/android/networking/StripeApiRepository$confirmPaymentIntent$1;->L$0:Ljava/lang/Object;

    iput-object v2, v0, Lcom/stripe/android/networking/StripeApiRepository$confirmPaymentIntent$1;->L$1:Ljava/lang/Object;

    iput-object v2, v0, Lcom/stripe/android/networking/StripeApiRepository$confirmPaymentIntent$1;->L$2:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/networking/StripeApiRepository$confirmPaymentIntent$1;->label:I

    invoke-direct {p1, p4, p2, p3, v0}, Lcom/stripe/android/networking/StripeApiRepository;->confirmPaymentIntentInternal-BWLJW6A(Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    return-object p1

    .line 2305
    :cond_6
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v2}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public confirmSetupIntent-BWLJW6A(Lcom/stripe/android/model/ConfirmSetupIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/ConfirmSetupIntentParams;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/SetupIntent;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lcom/stripe/android/networking/StripeApiRepository$confirmSetupIntent$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/stripe/android/networking/StripeApiRepository$confirmSetupIntent$1;

    iget v1, v0, Lcom/stripe/android/networking/StripeApiRepository$confirmSetupIntent$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p4, v0, Lcom/stripe/android/networking/StripeApiRepository$confirmSetupIntent$1;->label:I

    sub-int/2addr p4, v2

    iput p4, v0, Lcom/stripe/android/networking/StripeApiRepository$confirmSetupIntent$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/networking/StripeApiRepository$confirmSetupIntent$1;

    invoke-direct {v0, p0, p4}, Lcom/stripe/android/networking/StripeApiRepository$confirmSetupIntent$1;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p4, v0, Lcom/stripe/android/networking/StripeApiRepository$confirmSetupIntent$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 408
    iget v2, v0, Lcom/stripe/android/networking/StripeApiRepository$confirmSetupIntent$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p4, Lkotlin/Result;

    invoke-virtual {p4}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lcom/stripe/android/networking/StripeApiRepository$confirmSetupIntent$1;->L$2:Ljava/lang/Object;

    move-object p3, p1

    check-cast p3, Ljava/util/List;

    iget-object p1, v0, Lcom/stripe/android/networking/StripeApiRepository$confirmSetupIntent$1;->L$1:Ljava/lang/Object;

    move-object p2, p1

    check-cast p2, Lcom/stripe/android/core/networking/ApiRequest$Options;

    iget-object p1, v0, Lcom/stripe/android/networking/StripeApiRepository$confirmSetupIntent$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/networking/StripeApiRepository;

    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p4, Lkotlin/Result;

    invoke-virtual {p4}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p4

    goto :goto_1

    :cond_3
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 413
    iput-object p0, v0, Lcom/stripe/android/networking/StripeApiRepository$confirmSetupIntent$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lcom/stripe/android/networking/StripeApiRepository$confirmSetupIntent$1;->L$1:Ljava/lang/Object;

    iput-object p3, v0, Lcom/stripe/android/networking/StripeApiRepository$confirmSetupIntent$1;->L$2:Ljava/lang/Object;

    iput v4, v0, Lcom/stripe/android/networking/StripeApiRepository$confirmSetupIntent$1;->label:I

    invoke-direct {p0, p1, p2, v0}, Lcom/stripe/android/networking/StripeApiRepository;->maybeForDashboard-0E7RQCE(Lcom/stripe/android/model/ConfirmSetupIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_4

    goto :goto_2

    :cond_4
    move-object p1, p0

    .line 2307
    :goto_1
    invoke-static {p4}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-nez v2, :cond_6

    .line 2308
    check-cast p4, Lcom/stripe/android/model/ConfirmSetupIntentParams;

    const/4 v2, 0x0

    .line 414
    iput-object v2, v0, Lcom/stripe/android/networking/StripeApiRepository$confirmSetupIntent$1;->L$0:Ljava/lang/Object;

    iput-object v2, v0, Lcom/stripe/android/networking/StripeApiRepository$confirmSetupIntent$1;->L$1:Ljava/lang/Object;

    iput-object v2, v0, Lcom/stripe/android/networking/StripeApiRepository$confirmSetupIntent$1;->L$2:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/networking/StripeApiRepository$confirmSetupIntent$1;->label:I

    invoke-direct {p1, p4, p2, p3, v0}, Lcom/stripe/android/networking/StripeApiRepository;->confirmSetupIntentInternal-BWLJW6A(Lcom/stripe/android/model/ConfirmSetupIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    return-object p1

    .line 2309
    :cond_6
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v2}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public createFile-0E7RQCE(Lcom/stripe/android/core/model/StripeFileParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/core/model/StripeFileParams;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/core/model/StripeFile;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/stripe/android/networking/StripeApiRepository$createFile$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/networking/StripeApiRepository$createFile$1;

    iget v1, v0, Lcom/stripe/android/networking/StripeApiRepository$createFile$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p3, v0, Lcom/stripe/android/networking/StripeApiRepository$createFile$1;->label:I

    sub-int/2addr p3, v2

    iput p3, v0, Lcom/stripe/android/networking/StripeApiRepository$createFile$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/networking/StripeApiRepository$createFile$1;

    invoke-direct {v0, p0, p3}, Lcom/stripe/android/networking/StripeApiRepository$createFile$1;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lcom/stripe/android/networking/StripeApiRepository$createFile$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 1046
    iget v2, v0, Lcom/stripe/android/networking/StripeApiRepository$createFile$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 1050
    :try_start_1
    sget-object p3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object p3, p0

    check-cast p3, Lcom/stripe/android/networking/StripeApiRepository;

    .line 1052
    new-instance v4, Lcom/stripe/android/core/networking/FileUploadRequest;

    iget-object v7, p0, Lcom/stripe/android/networking/StripeApiRepository;->appInfo:Lcom/stripe/android/core/AppInfo;

    const/16 v9, 0x8

    const/4 v10, 0x0

    const/4 v8, 0x0

    move-object v5, p1

    move-object v6, p2

    invoke-direct/range {v4 .. v10}, Lcom/stripe/android/core/networking/FileUploadRequest;-><init>(Lcom/stripe/android/core/model/StripeFileParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lcom/stripe/android/core/AppInfo;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 1051
    new-instance p1, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda1;

    invoke-direct {p1, p0}, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda1;-><init>(Lcom/stripe/android/networking/StripeApiRepository;)V

    iput v3, v0, Lcom/stripe/android/networking/StripeApiRepository$createFile$1;->label:I

    invoke-virtual {p0, v4, p1, v0}, Lcom/stripe/android/networking/StripeApiRepository;->makeFileUploadRequest$payments_core_release(Lcom/stripe/android/core/networking/FileUploadRequest;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    .line 1046
    :cond_3
    :goto_1
    check-cast p3, Lcom/stripe/android/core/networking/StripeResponse;

    .line 1050
    invoke-static {p3}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    move-object p1, v0

    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 1057
    :goto_2
    invoke-static {p1}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    :try_start_2
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    check-cast p1, Lcom/stripe/android/core/networking/StripeResponse;

    .line 1058
    new-instance p2, Lcom/stripe/android/core/model/parsers/StripeFileJsonParser;

    invoke-direct {p2}, Lcom/stripe/android/core/model/parsers/StripeFileJsonParser;-><init>()V

    invoke-static {p1}, Lcom/stripe/android/core/networking/ResponseJsonKt;->responseJson(Lcom/stripe/android/core/networking/StripeResponse;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/stripe/android/core/model/parsers/StripeFileJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/core/model/StripeFile;

    move-result-object p1

    .line 1057
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    move-object p1, v0

    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    :cond_4
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_3
    return-object p1
.end method

.method public createFinancialConnectionsSessionForDeferredPayments-0E7RQCE(Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/FinancialConnectionsSession;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/stripe/android/networking/StripeApiRepository$createFinancialConnectionsSessionForDeferredPayments$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/networking/StripeApiRepository$createFinancialConnectionsSessionForDeferredPayments$1;

    iget v1, v0, Lcom/stripe/android/networking/StripeApiRepository$createFinancialConnectionsSessionForDeferredPayments$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p3, v0, Lcom/stripe/android/networking/StripeApiRepository$createFinancialConnectionsSessionForDeferredPayments$1;->label:I

    sub-int/2addr p3, v2

    iput p3, v0, Lcom/stripe/android/networking/StripeApiRepository$createFinancialConnectionsSessionForDeferredPayments$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/networking/StripeApiRepository$createFinancialConnectionsSessionForDeferredPayments$1;

    invoke-direct {v0, p0, p3}, Lcom/stripe/android/networking/StripeApiRepository$createFinancialConnectionsSessionForDeferredPayments$1;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lcom/stripe/android/networking/StripeApiRepository$createFinancialConnectionsSessionForDeferredPayments$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 1222
    iget v2, v0, Lcom/stripe/android/networking/StripeApiRepository$createFinancialConnectionsSessionForDeferredPayments$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p3, Lkotlin/Result;

    invoke-virtual {p3}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 1227
    iget-object v4, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 1228
    sget-object p3, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    invoke-virtual {p3}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getDeferredFinancialConnectionsSessionUrl$payments_core_release()Ljava/lang/String;

    move-result-object v5

    .line 1230
    invoke-virtual {p1}, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->toMap()Ljava/util/Map;

    move-result-object v7

    const/16 v9, 0x8

    const/4 v10, 0x0

    const/4 v8, 0x0

    move-object v6, p2

    .line 1227
    invoke-static/range {v4 .. v10}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    .line 1232
    new-instance p2, Lcom/stripe/android/model/parsers/FinancialConnectionsSessionJsonParser;

    invoke-direct {p2}, Lcom/stripe/android/model/parsers/FinancialConnectionsSessionJsonParser;-><init>()V

    check-cast p2, Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    new-instance p3, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda38;

    invoke-direct {p3}, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda38;-><init>()V

    .line 1226
    iput v3, v0, Lcom/stripe/android/networking/StripeApiRepository$createFinancialConnectionsSessionForDeferredPayments$1;->label:I

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModelResult-BWLJW6A(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method

.method public createPaymentIntentFinancialConnectionsSession-BWLJW6A(Ljava/lang/String;Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/FinancialConnectionsSession;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lcom/stripe/android/networking/StripeApiRepository$createPaymentIntentFinancialConnectionsSession$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/stripe/android/networking/StripeApiRepository$createPaymentIntentFinancialConnectionsSession$1;

    iget v1, v0, Lcom/stripe/android/networking/StripeApiRepository$createPaymentIntentFinancialConnectionsSession$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p4, v0, Lcom/stripe/android/networking/StripeApiRepository$createPaymentIntentFinancialConnectionsSession$1;->label:I

    sub-int/2addr p4, v2

    iput p4, v0, Lcom/stripe/android/networking/StripeApiRepository$createPaymentIntentFinancialConnectionsSession$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/networking/StripeApiRepository$createPaymentIntentFinancialConnectionsSession$1;

    invoke-direct {v0, p0, p4}, Lcom/stripe/android/networking/StripeApiRepository$createPaymentIntentFinancialConnectionsSession$1;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p4, v0, Lcom/stripe/android/networking/StripeApiRepository$createPaymentIntentFinancialConnectionsSession$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 1238
    iget v2, v0, Lcom/stripe/android/networking/StripeApiRepository$createPaymentIntentFinancialConnectionsSession$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p4, Lkotlin/Result;

    invoke-virtual {p4}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 1244
    iget-object v4, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 1245
    invoke-virtual {p0, p1}, Lcom/stripe/android/networking/StripeApiRepository;->getPaymentIntentFinancialConnectionsSessionUrl$payments_core_release(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 1247
    invoke-interface {p2}, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams;->toMap()Ljava/util/Map;

    move-result-object v7

    const/16 v9, 0x8

    const/4 v10, 0x0

    const/4 v8, 0x0

    move-object v6, p3

    .line 1244
    invoke-static/range {v4 .. v10}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    .line 1249
    new-instance p2, Lcom/stripe/android/model/parsers/FinancialConnectionsSessionJsonParser;

    invoke-direct {p2}, Lcom/stripe/android/model/parsers/FinancialConnectionsSessionJsonParser;-><init>()V

    check-cast p2, Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    new-instance p3, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda13;

    invoke-direct {p3}, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda13;-><init>()V

    .line 1243
    iput v3, v0, Lcom/stripe/android/networking/StripeApiRepository$createPaymentIntentFinancialConnectionsSession$1;->label:I

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModelResult-BWLJW6A(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method

.method public createPaymentMethod-0E7RQCE(Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/PaymentMethodCreateParams;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/stripe/android/networking/StripeApiRepository$createPaymentMethod$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/networking/StripeApiRepository$createPaymentMethod$1;

    iget v1, v0, Lcom/stripe/android/networking/StripeApiRepository$createPaymentMethod$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p3, v0, Lcom/stripe/android/networking/StripeApiRepository$createPaymentMethod$1;->label:I

    sub-int/2addr p3, v2

    iput p3, v0, Lcom/stripe/android/networking/StripeApiRepository$createPaymentMethod$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/networking/StripeApiRepository$createPaymentMethod$1;

    invoke-direct {v0, p0, p3}, Lcom/stripe/android/networking/StripeApiRepository$createPaymentMethod$1;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lcom/stripe/android/networking/StripeApiRepository$createPaymentMethod$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 582
    iget v2, v0, Lcom/stripe/android/networking/StripeApiRepository$createPaymentMethod$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p3, Lkotlin/Result;

    invoke-virtual {p3}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 586
    invoke-direct {p0}, Lcom/stripe/android/networking/StripeApiRepository;->fireFraudDetectionDataRequest()V

    .line 589
    iget-object v4, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 590
    sget-object p3, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    invoke-virtual {p3}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getPaymentMethodsUrl$payments_core_release()Ljava/lang/String;

    move-result-object v5

    .line 592
    invoke-virtual {p1}, Lcom/stripe/android/model/PaymentMethodCreateParams;->toParamMap()Ljava/util/Map;

    move-result-object p3

    .line 593
    invoke-virtual {p1}, Lcom/stripe/android/model/PaymentMethodCreateParams;->getAttribution()Ljava/util/Set;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/stripe/android/networking/StripeApiRepository;->buildPaymentUserAgentPair(Ljava/util/Set;)Lkotlin/Pair;

    move-result-object v2

    invoke-static {p3, v2}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p3

    .line 594
    invoke-direct {p0}, Lcom/stripe/android/networking/StripeApiRepository;->getFraudDetectionData()Lcom/stripe/android/core/frauddetection/FraudDetectionData;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lcom/stripe/android/core/frauddetection/FraudDetectionData;->getParams()Ljava/util/Map;

    move-result-object v2

    goto :goto_1

    :cond_3
    const/4 v2, 0x0

    :goto_1
    if-nez v2, :cond_4

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v2

    :cond_4
    invoke-static {p3, v2}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v7

    const/16 v9, 0x8

    const/4 v10, 0x0

    const/4 v8, 0x0

    move-object v6, p2

    .line 589
    invoke-static/range {v4 .. v10}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p2

    .line 596
    new-instance p3, Lcom/stripe/android/model/parsers/PaymentMethodJsonParser;

    invoke-direct {p3}, Lcom/stripe/android/model/parsers/PaymentMethodJsonParser;-><init>()V

    check-cast p3, Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    .line 588
    new-instance v2, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda8;

    invoke-direct {v2, p0, p1}, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda8;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lcom/stripe/android/model/PaymentMethodCreateParams;)V

    iput v3, v0, Lcom/stripe/android/networking/StripeApiRepository$createPaymentMethod$1;->label:I

    invoke-direct {p0, p2, p3, v2, v0}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModelResult-BWLJW6A(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    return-object p1
.end method

.method public createRadarSession-gIAlu-s(Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/RadarSessionWithHCaptcha;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/networking/StripeApiRepository$createRadarSession$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/networking/StripeApiRepository$createRadarSession$1;

    iget v1, v0, Lcom/stripe/android/networking/StripeApiRepository$createRadarSession$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p2, v0, Lcom/stripe/android/networking/StripeApiRepository$createRadarSession$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcom/stripe/android/networking/StripeApiRepository$createRadarSession$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/networking/StripeApiRepository$createRadarSession$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/networking/StripeApiRepository$createRadarSession$1;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object p2, v0

    iget-object v0, p2, Lcom/stripe/android/networking/StripeApiRepository$createRadarSession$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 1082
    iget v2, p2, Lcom/stripe/android/networking/StripeApiRepository$createRadarSession$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v0, Lkotlin/Result;

    invoke-virtual {v0}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_5

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto/16 :goto_6

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, p2, Lcom/stripe/android/networking/StripeApiRepository$createRadarSession$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/core/networking/ApiRequest$Options;

    iget-object v2, p2, Lcom/stripe/android/networking/StripeApiRepository$createRadarSession$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/networking/StripeApiRepository;

    :try_start_1
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    goto :goto_2

    :cond_3
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 1085
    :try_start_2
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, p0

    check-cast v0, Lcom/stripe/android/networking/StripeApiRepository;

    .line 1086
    sget-object v0, Lcom/stripe/android/Stripe;->Companion:Lcom/stripe/android/Stripe$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/Stripe$Companion;->getAdvancedFraudSignalsEnabled()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 1090
    iget-object v0, p0, Lcom/stripe/android/networking/StripeApiRepository;->fraudDetectionDataRepository:Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;

    iput-object p0, p2, Lcom/stripe/android/networking/StripeApiRepository$createRadarSession$1;->L$0:Ljava/lang/Object;

    iput-object p1, p2, Lcom/stripe/android/networking/StripeApiRepository$createRadarSession$1;->L$1:Ljava/lang/Object;

    iput v4, p2, Lcom/stripe/android/networking/StripeApiRepository$createRadarSession$1;->label:I

    invoke-interface {v0, p2}, Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;->getLatest(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-ne v0, v1, :cond_4

    goto :goto_4

    :cond_4
    move-object v2, p0

    :goto_1
    if-eqz v0, :cond_5

    :try_start_3
    check-cast v0, Lcom/stripe/android/core/frauddetection/FraudDetectionData;

    .line 1085
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_3

    .line 1091
    :cond_5
    const-string v0, "Could not obtain fraud data required to create a Radar Session."

    .line 1090
    new-instance v5, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v5, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 1087
    :cond_6
    :try_start_4
    const-string v0, "Stripe.advancedFraudSignalsEnabled must be set to \'true\' to create a Radar Session."

    .line 1086
    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception v0

    move-object v2, p0

    .line 1085
    :goto_2
    sget-object v5, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_3
    move-object v7, p1

    .line 1095
    invoke-static {v0}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    :try_start_5
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    check-cast v0, Lcom/stripe/android/core/frauddetection/FraudDetectionData;

    .line 1096
    invoke-virtual {v0}, Lcom/stripe/android/core/frauddetection/FraudDetectionData;->getParams()Ljava/util/Map;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {v2, v0, v4, v0}, Lcom/stripe/android/networking/StripeApiRepository;->buildPaymentUserAgentPair$default(Lcom/stripe/android/networking/StripeApiRepository;Ljava/util/Set;ILjava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    invoke-static {p1, v4}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v8

    .line 1099
    iget-object v5, v2, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 1100
    sget-object p1, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    const-string v4, "radar/session"

    invoke-static {p1, v4}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->access$getApiUrl(Lcom/stripe/android/networking/StripeApiRepository$Companion;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const/16 v10, 0x8

    const/4 v11, 0x0

    const/4 v9, 0x0

    .line 1099
    invoke-static/range {v5 .. v11}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    .line 1104
    new-instance v4, Lcom/stripe/android/model/parsers/RadarSessionWithHCaptchaJsonParser;

    invoke-direct {v4}, Lcom/stripe/android/model/parsers/RadarSessionWithHCaptchaJsonParser;-><init>()V

    check-cast v4, Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    .line 1098
    new-instance v5, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda18;

    invoke-direct {v5, v2}, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda18;-><init>(Lcom/stripe/android/networking/StripeApiRepository;)V

    iput-object v0, p2, Lcom/stripe/android/networking/StripeApiRepository$createRadarSession$1;->L$0:Ljava/lang/Object;

    iput-object v0, p2, Lcom/stripe/android/networking/StripeApiRepository$createRadarSession$1;->L$1:Ljava/lang/Object;

    iput v3, p2, Lcom/stripe/android/networking/StripeApiRepository$createRadarSession$1;->label:I

    invoke-direct {v2, p1, v4, v5, p2}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModelResult-BWLJW6A(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    :goto_4
    return-object v1

    .line 1109
    :cond_7
    :goto_5
    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    .line 1095
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_7

    :goto_6
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_7

    :cond_8
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 1110
    :goto_7
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p2

    if-nez p2, :cond_9

    goto :goto_8

    .line 1111
    :cond_9
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    sget-object p1, Lcom/stripe/android/core/exception/StripeException;->Companion:Lcom/stripe/android/core/exception/StripeException$Companion;

    invoke-virtual {p1, p2}, Lcom/stripe/android/core/exception/StripeException$Companion;->create(Ljava/lang/Throwable;)Lcom/stripe/android/core/exception/StripeException;

    move-result-object p1

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    .line 1110
    :goto_8
    check-cast p1, Lkotlin/Result;

    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public createSavedPaymentMethodRadarSession-0E7RQCE(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/RadarSessionWithHCaptcha;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/stripe/android/networking/StripeApiRepository$createSavedPaymentMethodRadarSession$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/networking/StripeApiRepository$createSavedPaymentMethodRadarSession$1;

    iget v1, v0, Lcom/stripe/android/networking/StripeApiRepository$createSavedPaymentMethodRadarSession$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p3, v0, Lcom/stripe/android/networking/StripeApiRepository$createSavedPaymentMethodRadarSession$1;->label:I

    sub-int/2addr p3, v2

    iput p3, v0, Lcom/stripe/android/networking/StripeApiRepository$createSavedPaymentMethodRadarSession$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/networking/StripeApiRepository$createSavedPaymentMethodRadarSession$1;

    invoke-direct {v0, p0, p3}, Lcom/stripe/android/networking/StripeApiRepository$createSavedPaymentMethodRadarSession$1;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object p3, v0

    iget-object v0, p3, Lcom/stripe/android/networking/StripeApiRepository$createSavedPaymentMethodRadarSession$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 1119
    iget v2, p3, Lcom/stripe/android/networking/StripeApiRepository$createSavedPaymentMethodRadarSession$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v0, Lkotlin/Result;

    invoke-virtual {v0}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_5

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto/16 :goto_6

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, p3, Lcom/stripe/android/networking/StripeApiRepository$createSavedPaymentMethodRadarSession$1;->L$2:Ljava/lang/Object;

    move-object p2, p1

    check-cast p2, Lcom/stripe/android/core/networking/ApiRequest$Options;

    iget-object p1, p3, Lcom/stripe/android/networking/StripeApiRepository$createSavedPaymentMethodRadarSession$1;->L$1:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object v2, p3, Lcom/stripe/android/networking/StripeApiRepository$createSavedPaymentMethodRadarSession$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/networking/StripeApiRepository;

    :try_start_1
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    goto :goto_2

    :cond_3
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 1123
    :try_start_2
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, p0

    check-cast v0, Lcom/stripe/android/networking/StripeApiRepository;

    .line 1124
    sget-object v0, Lcom/stripe/android/Stripe;->Companion:Lcom/stripe/android/Stripe$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/Stripe$Companion;->getAdvancedFraudSignalsEnabled()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 1128
    iget-object v0, p0, Lcom/stripe/android/networking/StripeApiRepository;->fraudDetectionDataRepository:Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;

    iput-object p0, p3, Lcom/stripe/android/networking/StripeApiRepository$createSavedPaymentMethodRadarSession$1;->L$0:Ljava/lang/Object;

    iput-object p1, p3, Lcom/stripe/android/networking/StripeApiRepository$createSavedPaymentMethodRadarSession$1;->L$1:Ljava/lang/Object;

    iput-object p2, p3, Lcom/stripe/android/networking/StripeApiRepository$createSavedPaymentMethodRadarSession$1;->L$2:Ljava/lang/Object;

    iput v4, p3, Lcom/stripe/android/networking/StripeApiRepository$createSavedPaymentMethodRadarSession$1;->label:I

    invoke-interface {v0, p3}, Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;->getLatest(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-ne v0, v1, :cond_4

    goto/16 :goto_4

    :cond_4
    move-object v2, p0

    :goto_1
    if-eqz v0, :cond_5

    :try_start_3
    check-cast v0, Lcom/stripe/android/core/frauddetection/FraudDetectionData;

    .line 1123
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_3

    .line 1129
    :cond_5
    const-string v0, "Could not obtain fraud data required to create a Radar Session."

    .line 1128
    new-instance v5, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v5, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 1125
    :cond_6
    :try_start_4
    const-string v0, "Stripe.advancedFraudSignalsEnabled must be set to \'true\' to create a Radar Session."

    .line 1124
    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception v0

    move-object v2, p0

    .line 1123
    :goto_2
    sget-object v5, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_3
    move-object v7, p2

    .line 1133
    invoke-static {v0}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_8

    :try_start_5
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    check-cast v0, Lcom/stripe/android/core/frauddetection/FraudDetectionData;

    .line 1134
    invoke-virtual {v0}, Lcom/stripe/android/core/frauddetection/FraudDetectionData;->getParams()Ljava/util/Map;

    move-result-object p2

    const/4 v0, 0x0

    invoke-static {v2, v0, v4, v0}, Lcom/stripe/android/networking/StripeApiRepository;->buildPaymentUserAgentPair$default(Lcom/stripe/android/networking/StripeApiRepository;Ljava/util/Set;ILjava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    invoke-static {p2, v4}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p2

    .line 1135
    const-string v4, "payment_method"

    invoke-static {v4, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    .line 1134
    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    invoke-static {p2, p1}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v8

    .line 1139
    iget-object v5, v2, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 1140
    sget-object p1, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    const-string p2, "radar/saved_payment_method_session"

    invoke-static {p1, p2}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->access$getApiUrl(Lcom/stripe/android/networking/StripeApiRepository$Companion;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const/16 v10, 0x8

    const/4 v11, 0x0

    const/4 v9, 0x0

    .line 1139
    invoke-static/range {v5 .. v11}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    .line 1144
    new-instance p2, Lcom/stripe/android/model/parsers/RadarSessionWithHCaptchaJsonParser;

    invoke-direct {p2}, Lcom/stripe/android/model/parsers/RadarSessionWithHCaptchaJsonParser;-><init>()V

    check-cast p2, Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    .line 1138
    new-instance v4, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda27;

    invoke-direct {v4, v2}, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda27;-><init>(Lcom/stripe/android/networking/StripeApiRepository;)V

    iput-object v0, p3, Lcom/stripe/android/networking/StripeApiRepository$createSavedPaymentMethodRadarSession$1;->L$0:Ljava/lang/Object;

    iput-object v0, p3, Lcom/stripe/android/networking/StripeApiRepository$createSavedPaymentMethodRadarSession$1;->L$1:Ljava/lang/Object;

    iput-object v0, p3, Lcom/stripe/android/networking/StripeApiRepository$createSavedPaymentMethodRadarSession$1;->L$2:Ljava/lang/Object;

    iput v3, p3, Lcom/stripe/android/networking/StripeApiRepository$createSavedPaymentMethodRadarSession$1;->label:I

    invoke-direct {v2, p1, p2, v4, p3}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModelResult-BWLJW6A(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    :goto_4
    return-object v1

    .line 1149
    :cond_7
    :goto_5
    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    .line 1133
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_7

    :goto_6
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_7

    :cond_8
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 1150
    :goto_7
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p2

    if-nez p2, :cond_9

    goto :goto_8

    .line 1151
    :cond_9
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    sget-object p1, Lcom/stripe/android/core/exception/StripeException;->Companion:Lcom/stripe/android/core/exception/StripeException$Companion;

    invoke-virtual {p1, p2}, Lcom/stripe/android/core/exception/StripeException$Companion;->create(Ljava/lang/Throwable;)Lcom/stripe/android/core/exception/StripeException;

    move-result-object p1

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    .line 1150
    :goto_8
    check-cast p1, Lkotlin/Result;

    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public createSetupIntentFinancialConnectionsSession-BWLJW6A(Ljava/lang/String;Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/FinancialConnectionsSession;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lcom/stripe/android/networking/StripeApiRepository$createSetupIntentFinancialConnectionsSession$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/stripe/android/networking/StripeApiRepository$createSetupIntentFinancialConnectionsSession$1;

    iget v1, v0, Lcom/stripe/android/networking/StripeApiRepository$createSetupIntentFinancialConnectionsSession$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p4, v0, Lcom/stripe/android/networking/StripeApiRepository$createSetupIntentFinancialConnectionsSession$1;->label:I

    sub-int/2addr p4, v2

    iput p4, v0, Lcom/stripe/android/networking/StripeApiRepository$createSetupIntentFinancialConnectionsSession$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/networking/StripeApiRepository$createSetupIntentFinancialConnectionsSession$1;

    invoke-direct {v0, p0, p4}, Lcom/stripe/android/networking/StripeApiRepository$createSetupIntentFinancialConnectionsSession$1;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p4, v0, Lcom/stripe/android/networking/StripeApiRepository$createSetupIntentFinancialConnectionsSession$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 1255
    iget v2, v0, Lcom/stripe/android/networking/StripeApiRepository$createSetupIntentFinancialConnectionsSession$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p4, Lkotlin/Result;

    invoke-virtual {p4}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 1261
    iget-object v4, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 1262
    invoke-virtual {p0, p1}, Lcom/stripe/android/networking/StripeApiRepository;->getSetupIntentFinancialConnectionsSessionUrl$payments_core_release(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 1264
    invoke-interface {p2}, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams;->toMap()Ljava/util/Map;

    move-result-object v7

    const/16 v9, 0x8

    const/4 v10, 0x0

    const/4 v8, 0x0

    move-object v6, p3

    .line 1261
    invoke-static/range {v4 .. v10}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    .line 1266
    new-instance p2, Lcom/stripe/android/model/parsers/FinancialConnectionsSessionJsonParser;

    invoke-direct {p2}, Lcom/stripe/android/model/parsers/FinancialConnectionsSessionJsonParser;-><init>()V

    check-cast p2, Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    new-instance p3, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda24;

    invoke-direct {p3}, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda24;-><init>()V

    .line 1260
    iput v3, v0, Lcom/stripe/android/networking/StripeApiRepository$createSetupIntentFinancialConnectionsSession$1;->label:I

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModelResult-BWLJW6A(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method

.method public createSource-0E7RQCE(Lcom/stripe/android/model/SourceParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/SourceParams;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/Source;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/stripe/android/networking/StripeApiRepository$createSource$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/networking/StripeApiRepository$createSource$1;

    iget v1, v0, Lcom/stripe/android/networking/StripeApiRepository$createSource$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p3, v0, Lcom/stripe/android/networking/StripeApiRepository$createSource$1;->label:I

    sub-int/2addr p3, v2

    iput p3, v0, Lcom/stripe/android/networking/StripeApiRepository$createSource$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/networking/StripeApiRepository$createSource$1;

    invoke-direct {v0, p0, p3}, Lcom/stripe/android/networking/StripeApiRepository$createSource$1;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lcom/stripe/android/networking/StripeApiRepository$createSource$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 528
    iget v2, v0, Lcom/stripe/android/networking/StripeApiRepository$createSource$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p3, Lkotlin/Result;

    invoke-virtual {p3}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 532
    invoke-direct {p0}, Lcom/stripe/android/networking/StripeApiRepository;->fireFraudDetectionDataRequest()V

    .line 535
    iget-object v4, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 536
    sget-object p3, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    invoke-virtual {p3}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getSourcesUrl$payments_core_release()Ljava/lang/String;

    move-result-object v5

    .line 538
    invoke-virtual {p1}, Lcom/stripe/android/model/SourceParams;->toParamMap()Ljava/util/Map;

    move-result-object p3

    .line 539
    invoke-virtual {p1}, Lcom/stripe/android/model/SourceParams;->getAttribution$payments_core_release()Ljava/util/Set;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/stripe/android/networking/StripeApiRepository;->buildPaymentUserAgentPair(Ljava/util/Set;)Lkotlin/Pair;

    move-result-object v2

    invoke-static {p3, v2}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p3

    .line 540
    invoke-direct {p0}, Lcom/stripe/android/networking/StripeApiRepository;->getFraudDetectionData()Lcom/stripe/android/core/frauddetection/FraudDetectionData;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lcom/stripe/android/core/frauddetection/FraudDetectionData;->getParams()Ljava/util/Map;

    move-result-object v2

    goto :goto_1

    :cond_3
    const/4 v2, 0x0

    :goto_1
    if-nez v2, :cond_4

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v2

    :cond_4
    invoke-static {p3, v2}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v7

    const/16 v9, 0x8

    const/4 v10, 0x0

    const/4 v8, 0x0

    move-object v6, p2

    .line 535
    invoke-static/range {v4 .. v10}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p2

    .line 542
    new-instance p3, Lcom/stripe/android/model/parsers/SourceJsonParser;

    invoke-direct {p3}, Lcom/stripe/android/model/parsers/SourceJsonParser;-><init>()V

    check-cast p3, Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    .line 534
    new-instance v2, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda29;

    invoke-direct {v2, p0, p1}, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda29;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lcom/stripe/android/model/SourceParams;)V

    iput v3, v0, Lcom/stripe/android/networking/StripeApiRepository$createSource$1;->label:I

    invoke-direct {p0, p2, p3, v2, v0}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModelResult-BWLJW6A(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    return-object p1
.end method

.method public createToken-0E7RQCE(Lcom/stripe/android/model/TokenParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/TokenParams;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/Token;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/stripe/android/networking/StripeApiRepository$createToken$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/networking/StripeApiRepository$createToken$1;

    iget v1, v0, Lcom/stripe/android/networking/StripeApiRepository$createToken$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p3, v0, Lcom/stripe/android/networking/StripeApiRepository$createToken$1;->label:I

    sub-int/2addr p3, v2

    iput p3, v0, Lcom/stripe/android/networking/StripeApiRepository$createToken$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/networking/StripeApiRepository$createToken$1;

    invoke-direct {v0, p0, p3}, Lcom/stripe/android/networking/StripeApiRepository$createToken$1;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lcom/stripe/android/networking/StripeApiRepository$createToken$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 657
    iget v2, v0, Lcom/stripe/android/networking/StripeApiRepository$createToken$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p3, Lkotlin/Result;

    invoke-virtual {p3}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 661
    invoke-direct {p0}, Lcom/stripe/android/networking/StripeApiRepository;->fireFraudDetectionDataRequest()V

    .line 664
    iget-object v4, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 665
    sget-object p3, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    invoke-virtual {p3}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getTokensUrl$payments_core_release()Ljava/lang/String;

    move-result-object v5

    .line 667
    invoke-virtual {p1}, Lcom/stripe/android/model/TokenParams;->toParamMap()Ljava/util/Map;

    move-result-object p3

    .line 668
    invoke-virtual {p1}, Lcom/stripe/android/model/TokenParams;->getAttribution()Ljava/util/Set;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/stripe/android/networking/StripeApiRepository;->buildPaymentUserAgentPair(Ljava/util/Set;)Lkotlin/Pair;

    move-result-object v2

    invoke-static {p3, v2}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p3

    .line 669
    invoke-direct {p0}, Lcom/stripe/android/networking/StripeApiRepository;->getFraudDetectionData()Lcom/stripe/android/core/frauddetection/FraudDetectionData;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lcom/stripe/android/core/frauddetection/FraudDetectionData;->getParams()Ljava/util/Map;

    move-result-object v2

    goto :goto_1

    :cond_3
    const/4 v2, 0x0

    :goto_1
    if-nez v2, :cond_4

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v2

    :cond_4
    invoke-static {p3, v2}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v7

    const/16 v9, 0x8

    const/4 v10, 0x0

    const/4 v8, 0x0

    move-object v6, p2

    .line 664
    invoke-static/range {v4 .. v10}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p2

    .line 671
    new-instance p3, Lcom/stripe/android/model/parsers/TokenJsonParser;

    invoke-direct {p3}, Lcom/stripe/android/model/parsers/TokenJsonParser;-><init>()V

    check-cast p3, Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    .line 663
    new-instance v2, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda35;

    invoke-direct {v2, p0, p1}, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda35;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lcom/stripe/android/model/TokenParams;)V

    iput v3, v0, Lcom/stripe/android/networking/StripeApiRepository$createToken$1;->label:I

    invoke-direct {p0, p2, p3, v2, v0}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModelResult-BWLJW6A(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    return-object p1
.end method

.method public deleteCustomerSource-hUnOzRk(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/Source;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of p2, p6, Lcom/stripe/android/networking/StripeApiRepository$deleteCustomerSource$1;

    if-eqz p2, :cond_0

    move-object p2, p6

    check-cast p2, Lcom/stripe/android/networking/StripeApiRepository$deleteCustomerSource$1;

    iget v0, p2, Lcom/stripe/android/networking/StripeApiRepository$deleteCustomerSource$1;->label:I

    const/high16 v1, -0x80000000

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    iget p6, p2, Lcom/stripe/android/networking/StripeApiRepository$deleteCustomerSource$1;->label:I

    sub-int/2addr p6, v1

    iput p6, p2, Lcom/stripe/android/networking/StripeApiRepository$deleteCustomerSource$1;->label:I

    goto :goto_0

    :cond_0
    new-instance p2, Lcom/stripe/android/networking/StripeApiRepository$deleteCustomerSource$1;

    invoke-direct {p2, p0, p6}, Lcom/stripe/android/networking/StripeApiRepository$deleteCustomerSource$1;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p6, p2, Lcom/stripe/android/networking/StripeApiRepository$deleteCustomerSource$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 713
    iget v1, p2, Lcom/stripe/android/networking/StripeApiRepository$deleteCustomerSource$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    invoke-static {p6}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p6, Lkotlin/Result;

    invoke-virtual {p6}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p6}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 721
    iget-object v3, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 722
    sget-object p6, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    invoke-virtual {p6, p1, p4}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getDeleteCustomerSourceUrl$payments_core_release(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v5, p5

    .line 721
    invoke-static/range {v3 .. v8}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createDelete$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    .line 725
    new-instance p4, Lcom/stripe/android/model/parsers/SourceJsonParser;

    invoke-direct {p4}, Lcom/stripe/android/model/parsers/SourceJsonParser;-><init>()V

    check-cast p4, Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    .line 720
    new-instance p5, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda16;

    invoke-direct {p5, p0, p3}, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda16;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Ljava/util/Set;)V

    iput v2, p2, Lcom/stripe/android/networking/StripeApiRepository$deleteCustomerSource$1;->label:I

    invoke-direct {p0, p1, p4, p5, p2}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModelResult-BWLJW6A(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    return-object p1
.end method

.method public deletePaymentDetails-BWLJW6A(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lkotlin/Unit;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lcom/stripe/android/networking/StripeApiRepository$deletePaymentDetails$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/stripe/android/networking/StripeApiRepository$deletePaymentDetails$1;

    iget v1, v0, Lcom/stripe/android/networking/StripeApiRepository$deletePaymentDetails$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p4, v0, Lcom/stripe/android/networking/StripeApiRepository$deletePaymentDetails$1;->label:I

    sub-int/2addr p4, v2

    iput p4, v0, Lcom/stripe/android/networking/StripeApiRepository$deletePaymentDetails$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/networking/StripeApiRepository$deletePaymentDetails$1;

    invoke-direct {v0, p0, p4}, Lcom/stripe/android/networking/StripeApiRepository$deletePaymentDetails$1;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p4, v0, Lcom/stripe/android/networking/StripeApiRepository$deletePaymentDetails$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 1597
    iget v2, v0, Lcom/stripe/android/networking/StripeApiRepository$deletePaymentDetails$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 1602
    :try_start_1
    sget-object p4, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object p4, p0

    check-cast p4, Lcom/stripe/android/networking/StripeApiRepository;

    .line 1604
    iget-object p4, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 1605
    sget-object v2, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    invoke-virtual {v2, p2}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getConsumerPaymentDetailsUrl$payments_core_release(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const/4 v2, 0x2

    .line 1608
    new-array v2, v2, [Lkotlin/Pair;

    const-string v4, "request_surface"

    const-string v5, "android_payment_element"

    invoke-static {v4, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v2, v5

    .line 1609
    const-string v4, "credentials"

    .line 1610
    const-string v5, "consumer_session_client_secret"

    invoke-static {v5, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    .line 1609
    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    invoke-static {v4, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    aput-object p1, v2, v3

    .line 1607
    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    .line 1604
    invoke-virtual {p4, p2, p3, p1}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createDelete(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    new-instance p2, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda17;

    invoke-direct {p2}, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda17;-><init>()V

    .line 1603
    iput v3, v0, Lcom/stripe/android/networking/StripeApiRepository$deletePaymentDetails$1;->label:I

    invoke-virtual {p0, p1, p2, v0}, Lcom/stripe/android/networking/StripeApiRepository;->makeApiRequest$payments_core_release(Lcom/stripe/android/core/networking/ApiRequest;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    .line 1616
    :cond_3
    :goto_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 1602
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-object p1

    :catchall_0
    move-exception p1

    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public detachPaymentMethod-BWLJW6A(Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;,
            Lcom/stripe/android/core/exception/APIException;,
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/exception/CardException;
        }
    .end annotation

    instance-of v0, p4, Lcom/stripe/android/networking/StripeApiRepository$detachPaymentMethod$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/stripe/android/networking/StripeApiRepository$detachPaymentMethod$1;

    iget v1, v0, Lcom/stripe/android/networking/StripeApiRepository$detachPaymentMethod$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p4, v0, Lcom/stripe/android/networking/StripeApiRepository$detachPaymentMethod$1;->label:I

    sub-int/2addr p4, v2

    iput p4, v0, Lcom/stripe/android/networking/StripeApiRepository$detachPaymentMethod$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/networking/StripeApiRepository$detachPaymentMethod$1;

    invoke-direct {v0, p0, p4}, Lcom/stripe/android/networking/StripeApiRepository$detachPaymentMethod$1;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p4, v0, Lcom/stripe/android/networking/StripeApiRepository$detachPaymentMethod$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 763
    iget v2, v0, Lcom/stripe/android/networking/StripeApiRepository$detachPaymentMethod$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p4, Lkotlin/Result;

    invoke-virtual {p4}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 776
    iget-object v4, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 777
    invoke-virtual {p0, p2}, Lcom/stripe/android/networking/StripeApiRepository;->getDetachPaymentMethodUrl$payments_core_release(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const/16 v9, 0xc

    const/4 v10, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v6, p3

    .line 776
    invoke-static/range {v4 .. v10}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p2

    .line 780
    new-instance p3, Lcom/stripe/android/model/parsers/PaymentMethodJsonParser;

    invoke-direct {p3}, Lcom/stripe/android/model/parsers/PaymentMethodJsonParser;-><init>()V

    check-cast p3, Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    .line 775
    new-instance p4, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda11;

    invoke-direct {p4, p0, p1}, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda11;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Ljava/util/Set;)V

    iput v3, v0, Lcom/stripe/android/networking/StripeApiRepository$detachPaymentMethod$1;->label:I

    invoke-direct {p0, p2, p3, p4, v0}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModelResult-BWLJW6A(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method

.method public detachPaymentMethod-yxL6bBk(Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;,
            Lcom/stripe/android/core/exception/APIException;,
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/exception/CardException;
        }
    .end annotation

    move-object/from16 v0, p5

    instance-of v1, v0, Lcom/stripe/android/networking/StripeApiRepository$detachPaymentMethod$3;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lcom/stripe/android/networking/StripeApiRepository$detachPaymentMethod$3;

    iget v2, v1, Lcom/stripe/android/networking/StripeApiRepository$detachPaymentMethod$3;->label:I

    const/high16 v3, -0x80000000

    and-int/2addr v2, v3

    if-eqz v2, :cond_0

    iget v0, v1, Lcom/stripe/android/networking/StripeApiRepository$detachPaymentMethod$3;->label:I

    sub-int/2addr v0, v3

    iput v0, v1, Lcom/stripe/android/networking/StripeApiRepository$detachPaymentMethod$3;->label:I

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/stripe/android/networking/StripeApiRepository$detachPaymentMethod$3;

    invoke-direct {v1, p0, v0}, Lcom/stripe/android/networking/StripeApiRepository$detachPaymentMethod$3;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object v0, v1, Lcom/stripe/android/networking/StripeApiRepository$detachPaymentMethod$3;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    .line 791
    iget v3, v1, Lcom/stripe/android/networking/StripeApiRepository$detachPaymentMethod$3;->label:I

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v4, :cond_1

    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v0, Lkotlin/Result;

    invoke-virtual {v0}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 805
    iget-object v5, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 806
    invoke-virtual {p0, p3}, Lcom/stripe/android/networking/StripeApiRepository;->getElementsDetachPaymentMethodUrl$payments_core_release(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 808
    const-string p3, "customer_session_client_secret"

    invoke-static {p3, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v8

    const/16 v10, 0x8

    const/4 v11, 0x0

    const/4 v9, 0x0

    move-object/from16 v7, p4

    .line 805
    invoke-static/range {v5 .. v11}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    .line 810
    new-instance p3, Lcom/stripe/android/model/parsers/PaymentMethodJsonParser;

    invoke-direct {p3}, Lcom/stripe/android/model/parsers/PaymentMethodJsonParser;-><init>()V

    check-cast p3, Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    .line 804
    new-instance v0, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda6;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda6;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Ljava/util/Set;)V

    iput v4, v1, Lcom/stripe/android/networking/StripeApiRepository$detachPaymentMethod$3;->label:I

    invoke-direct {p0, p1, p3, v0, v1}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModelResult-BWLJW6A(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_3

    return-object v2

    :cond_3
    return-object p1
.end method

.method public final fireAnalyticsRequest$payments_core_release(Lcom/stripe/android/core/networking/AnalyticsRequest;)V
    .locals 1

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1848
    iget-object v0, p0, Lcom/stripe/android/networking/StripeApiRepository;->analyticsRequestExecutor:Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

    invoke-interface {v0, p1}, Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;->executeAsync(Lcom/stripe/android/core/networking/AnalyticsRequest;)V

    return-void
.end method

.method public getCardMetadata-0E7RQCE(Lcom/stripe/android/cards/Bin;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/cards/Bin;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/CardMetadata;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    instance-of v2, v1, Lcom/stripe/android/networking/StripeApiRepository$getCardMetadata$1;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lcom/stripe/android/networking/StripeApiRepository$getCardMetadata$1;

    iget v3, v2, Lcom/stripe/android/networking/StripeApiRepository$getCardMetadata$1;->label:I

    const/high16 v4, -0x80000000

    and-int/2addr v3, v4

    if-eqz v3, :cond_0

    iget v1, v2, Lcom/stripe/android/networking/StripeApiRepository$getCardMetadata$1;->label:I

    sub-int/2addr v1, v4

    iput v1, v2, Lcom/stripe/android/networking/StripeApiRepository$getCardMetadata$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/stripe/android/networking/StripeApiRepository$getCardMetadata$1;

    invoke-direct {v2, v0, v1}, Lcom/stripe/android/networking/StripeApiRepository$getCardMetadata$1;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v4, v2

    iget-object v1, v4, Lcom/stripe/android/networking/StripeApiRepository$getCardMetadata$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v7

    .line 991
    iget v2, v4, Lcom/stripe/android/networking/StripeApiRepository$getCardMetadata$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v2, v4, Lcom/stripe/android/networking/StripeApiRepository$getCardMetadata$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/networking/StripeApiRepository;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v1, Lkotlin/Result;

    invoke-virtual {v1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v1

    move-object v0, v2

    goto :goto_1

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 996
    iget-object v8, v0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 997
    sget-object v1, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    const-string v2, "card-metadata"

    invoke-static {v1, v2}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->access$getEdgeUrl(Lcom/stripe/android/networking/StripeApiRepository$Companion;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const/4 v14, 0x5

    const/4 v15, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v10, p2

    .line 998
    invoke-static/range {v10 .. v15}, Lcom/stripe/android/core/networking/ApiRequest$Options;->copy$default(Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest$Options;

    move-result-object v1

    const/4 v2, 0x2

    .line 999
    new-array v2, v2, [Lkotlin/Pair;

    const-string v5, "key"

    invoke-virtual/range {p2 .. p2}, Lcom/stripe/android/core/networking/ApiRequest$Options;->getApiKey()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v2, v6

    const-string v5, "bin_prefix"

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/cards/Bin;->getValue()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    aput-object v5, v2, v3

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v11

    const/16 v13, 0x8

    const/4 v14, 0x0

    const/4 v12, 0x0

    move-object v10, v1

    .line 996
    invoke-static/range {v8 .. v14}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createGet$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object v1

    .line 1001
    new-instance v2, Lcom/stripe/android/model/parsers/CardMetadataJsonParser;

    move-object/from16 v5, p1

    invoke-direct {v2, v5}, Lcom/stripe/android/model/parsers/CardMetadataJsonParser;-><init>(Lcom/stripe/android/cards/Bin;)V

    check-cast v2, Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    .line 995
    iput-object v0, v4, Lcom/stripe/android/networking/StripeApiRepository$getCardMetadata$1;->L$0:Ljava/lang/Object;

    iput v3, v4, Lcom/stripe/android/networking/StripeApiRepository$getCardMetadata$1;->label:I

    const/4 v3, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    invoke-static/range {v0 .. v6}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModelResult-BWLJW6A$default(Lcom/stripe/android/networking/StripeApiRepository;Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v7, :cond_3

    return-object v7

    :cond_3
    move-object/from16 v0, p0

    .line 1002
    :goto_1
    invoke-static {v1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_4

    .line 1003
    sget-object v2, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->CardMetadataLoadFailure:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    invoke-direct {v0, v2}, Lcom/stripe/android/networking/StripeApiRepository;->fireAnalyticsRequest(Lcom/stripe/android/networking/PaymentAnalyticsEvent;)V

    :cond_4
    return-object v1
.end method

.method public final getDetachPaymentMethodUrl$payments_core_release(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "paymentMethodId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1491
    sget-object v0, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    const-string v1, "payment_methods/%s/detach"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, v1, p1}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->access$getApiUrl(Lcom/stripe/android/networking/StripeApiRepository$Companion;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final getElementsDetachPaymentMethodUrl$payments_core_release(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "paymentMethodId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1499
    sget-object v0, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    const-string v1, "elements/payment_methods/%s/detach"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, v1, p1}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->access$getApiUrl(Lcom/stripe/android/networking/StripeApiRepository$Companion;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getFpxBankStatus-gIAlu-s(Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/BankStatuses;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/networking/StripeApiRepository$getFpxBankStatus$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/networking/StripeApiRepository$getFpxBankStatus$1;

    iget v1, v0, Lcom/stripe/android/networking/StripeApiRepository$getFpxBankStatus$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p2, v0, Lcom/stripe/android/networking/StripeApiRepository$getFpxBankStatus$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcom/stripe/android/networking/StripeApiRepository$getFpxBankStatus$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/networking/StripeApiRepository$getFpxBankStatus$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/networking/StripeApiRepository$getFpxBankStatus$1;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/stripe/android/networking/StripeApiRepository$getFpxBankStatus$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 975
    iget v2, v0, Lcom/stripe/android/networking/StripeApiRepository$getFpxBankStatus$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p2, Lkotlin/Result;

    invoke-virtual {p2}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 979
    iget-object v4, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 980
    sget-object p2, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    const-string v2, "fpx/bank_statuses"

    invoke-static {p2, v2}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->access$getApiUrl(Lcom/stripe/android/networking/StripeApiRepository$Companion;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const/4 v10, 0x5

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v6, p1

    .line 982
    invoke-static/range {v6 .. v11}, Lcom/stripe/android/core/networking/ApiRequest$Options;->copy$default(Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest$Options;

    move-result-object v6

    .line 983
    const-string p1, "account_holder_type"

    const-string p2, "individual"

    invoke-static {p1, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v7

    const/16 v9, 0x8

    const/4 v10, 0x0

    const/4 v8, 0x0

    .line 979
    invoke-static/range {v4 .. v10}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createGet$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    .line 985
    new-instance p2, Lcom/stripe/android/model/parsers/FpxBankStatusesJsonParser;

    invoke-direct {p2}, Lcom/stripe/android/model/parsers/FpxBankStatusesJsonParser;-><init>()V

    check-cast p2, Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    .line 978
    new-instance v2, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda9;

    invoke-direct {v2, p0}, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda9;-><init>(Lcom/stripe/android/networking/StripeApiRepository;)V

    iput v3, v0, Lcom/stripe/android/networking/StripeApiRepository$getFpxBankStatus$1;->label:I

    invoke-direct {p0, p1, p2, v2, v0}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModelResult-BWLJW6A(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method

.method public final synthetic getPaymentIntentFinancialConnectionsSessionUrl$payments_core_release(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "paymentIntentId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1278
    sget-object v0, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    const-string v1, "payment_intents/%s/link_account_sessions"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, v1, p1}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->access$getApiUrl(Lcom/stripe/android/networking/StripeApiRepository$Companion;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getPaymentMethods-BWLJW6A(Lcom/stripe/android/model/ListPaymentMethodsParams;Ljava/util/Set;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/ListPaymentMethodsParams;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "+",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lcom/stripe/android/networking/StripeApiRepository$getPaymentMethods$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/stripe/android/networking/StripeApiRepository$getPaymentMethods$1;

    iget v1, v0, Lcom/stripe/android/networking/StripeApiRepository$getPaymentMethods$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p4, v0, Lcom/stripe/android/networking/StripeApiRepository$getPaymentMethods$1;->label:I

    sub-int/2addr p4, v2

    iput p4, v0, Lcom/stripe/android/networking/StripeApiRepository$getPaymentMethods$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/networking/StripeApiRepository$getPaymentMethods$1;

    invoke-direct {v0, p0, p4}, Lcom/stripe/android/networking/StripeApiRepository$getPaymentMethods$1;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p4, v0, Lcom/stripe/android/networking/StripeApiRepository$getPaymentMethods$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 823
    iget v2, v0, Lcom/stripe/android/networking/StripeApiRepository$getPaymentMethods$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p4, Lkotlin/Result;

    invoke-virtual {p4}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 829
    iget-object v4, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 830
    sget-object p4, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    invoke-virtual {p4}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getPaymentMethodsUrl$payments_core_release()Ljava/lang/String;

    move-result-object v5

    .line 832
    invoke-virtual {p1}, Lcom/stripe/android/model/ListPaymentMethodsParams;->toParamMap()Ljava/util/Map;

    move-result-object v7

    const/16 v9, 0x8

    const/4 v10, 0x0

    const/4 v8, 0x0

    move-object v6, p3

    .line 829
    invoke-static/range {v4 .. v10}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createGet$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    .line 834
    new-instance p3, Lcom/stripe/android/model/parsers/PaymentMethodsListJsonParser;

    invoke-direct {p3}, Lcom/stripe/android/model/parsers/PaymentMethodsListJsonParser;-><init>()V

    check-cast p3, Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    .line 828
    new-instance p4, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda19;

    invoke-direct {p4, p0, p2}, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda19;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Ljava/util/Set;)V

    iput v3, v0, Lcom/stripe/android/networking/StripeApiRepository$getPaymentMethods$1;->label:I

    invoke-direct {p0, p1, p3, p4, v0}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModelResult-BWLJW6A(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    .line 843
    :cond_3
    :goto_1
    invoke-static {p1}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    check-cast p1, Lcom/stripe/android/model/PaymentMethodsList;

    .line 844
    invoke-virtual {p1}, Lcom/stripe/android/model/PaymentMethodsList;->getPaymentMethods()Ljava/util/List;

    move-result-object p1

    .line 843
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic getSetupIntentFinancialConnectionsSessionUrl$payments_core_release(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "setupIntentId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1287
    sget-object v0, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    const-string v1, "setup_intents/%s/link_account_sessions"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, v1, p1}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->access$getApiUrl(Lcom/stripe/android/networking/StripeApiRepository$Companion;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public listPaymentDetails-BWLJW6A(Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/ConsumerPaymentDetails;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p4

    instance-of v1, v0, Lcom/stripe/android/networking/StripeApiRepository$listPaymentDetails$1;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lcom/stripe/android/networking/StripeApiRepository$listPaymentDetails$1;

    iget v2, v1, Lcom/stripe/android/networking/StripeApiRepository$listPaymentDetails$1;->label:I

    const/high16 v3, -0x80000000

    and-int/2addr v2, v3

    if-eqz v2, :cond_0

    iget v0, v1, Lcom/stripe/android/networking/StripeApiRepository$listPaymentDetails$1;->label:I

    sub-int/2addr v0, v3

    iput v0, v1, Lcom/stripe/android/networking/StripeApiRepository$listPaymentDetails$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/stripe/android/networking/StripeApiRepository$listPaymentDetails$1;

    invoke-direct {v1, p0, v0}, Lcom/stripe/android/networking/StripeApiRepository$listPaymentDetails$1;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v6, v1

    iget-object v0, v6, Lcom/stripe/android/networking/StripeApiRepository$listPaymentDetails$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 1557
    iget v2, v6, Lcom/stripe/android/networking/StripeApiRepository$listPaymentDetails$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v0, Lkotlin/Result;

    invoke-virtual {v0}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 1563
    iget-object v7, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 1564
    sget-object v0, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getListConsumerPaymentDetailsUrl$payments_core_release()Ljava/lang/String;

    move-result-object v8

    const/4 v0, 0x3

    .line 1567
    new-array v0, v0, [Lkotlin/Pair;

    const-string v2, "request_surface"

    const-string v4, "android_payment_element"

    invoke-static {v2, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v4, 0x0

    aput-object v2, v0, v4

    .line 1569
    const-string v2, "consumer_session_client_secret"

    invoke-static {v2, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    .line 1568
    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    const-string v4, "credentials"

    invoke-static {v4, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v0, v3

    .line 1571
    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v2

    const-string v4, "types"

    invoke-static {v4, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v4, 0x2

    aput-object v2, v0, v4

    .line 1566
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v10

    const/16 v12, 0x8

    const/4 v13, 0x0

    const/4 v11, 0x0

    move-object/from16 v9, p3

    .line 1563
    invoke-static/range {v7 .. v13}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object v0

    .line 1574
    sget-object v2, Lcom/stripe/android/model/parsers/ConsumerPaymentDetailsJsonParser;->INSTANCE:Lcom/stripe/android/model/parsers/ConsumerPaymentDetailsJsonParser;

    move-object v4, v2

    check-cast v4, Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    .line 1562
    iput v3, v6, Lcom/stripe/android/networking/StripeApiRepository$listPaymentDetails$1;->label:I

    const/4 v5, 0x0

    const/4 v7, 0x4

    const/4 v8, 0x0

    move-object v2, p0

    move-object v3, v0

    invoke-static/range {v2 .. v8}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModelResult-BWLJW6A$default(Lcom/stripe/android/networking/StripeApiRepository;Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    return-object v0
.end method

.method public listShippingAddresses-0E7RQCE(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/ConsumerShippingAddresses;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p3

    instance-of v1, v0, Lcom/stripe/android/networking/StripeApiRepository$listShippingAddresses$1;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lcom/stripe/android/networking/StripeApiRepository$listShippingAddresses$1;

    iget v2, v1, Lcom/stripe/android/networking/StripeApiRepository$listShippingAddresses$1;->label:I

    const/high16 v3, -0x80000000

    and-int/2addr v2, v3

    if-eqz v2, :cond_0

    iget v0, v1, Lcom/stripe/android/networking/StripeApiRepository$listShippingAddresses$1;->label:I

    sub-int/2addr v0, v3

    iput v0, v1, Lcom/stripe/android/networking/StripeApiRepository$listShippingAddresses$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/stripe/android/networking/StripeApiRepository$listShippingAddresses$1;

    invoke-direct {v1, p0, v0}, Lcom/stripe/android/networking/StripeApiRepository$listShippingAddresses$1;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v6, v1

    iget-object v0, v6, Lcom/stripe/android/networking/StripeApiRepository$listShippingAddresses$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 1578
    iget v2, v6, Lcom/stripe/android/networking/StripeApiRepository$listShippingAddresses$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v0, Lkotlin/Result;

    invoke-virtual {v0}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 1583
    iget-object v7, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 1584
    sget-object v0, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getListShippingAddresses$payments_core_release()Ljava/lang/String;

    move-result-object v8

    const/4 v0, 0x2

    .line 1587
    new-array v0, v0, [Lkotlin/Pair;

    const-string v2, "request_surface"

    const-string v4, "android_payment_element"

    invoke-static {v2, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v4, 0x0

    aput-object v2, v0, v4

    .line 1589
    const-string v2, "consumer_session_client_secret"

    invoke-static {v2, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    .line 1588
    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    const-string v4, "credentials"

    invoke-static {v4, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v0, v3

    .line 1586
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v10

    const/16 v12, 0x8

    const/4 v13, 0x0

    const/4 v11, 0x0

    move-object/from16 v9, p2

    .line 1583
    invoke-static/range {v7 .. v13}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object v0

    .line 1593
    sget-object v2, Lcom/stripe/android/model/parsers/ConsumerShippingAddressesParser;->INSTANCE:Lcom/stripe/android/model/parsers/ConsumerShippingAddressesParser;

    move-object v4, v2

    check-cast v4, Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    .line 1582
    iput v3, v6, Lcom/stripe/android/networking/StripeApiRepository$listShippingAddresses$1;->label:I

    const/4 v5, 0x0

    const/4 v7, 0x4

    const/4 v8, 0x0

    move-object v2, p0

    move-object v3, v0

    invoke-static/range {v2 .. v8}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModelResult-BWLJW6A$default(Lcom/stripe/android/networking/StripeApiRepository;Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    return-object v0
.end method

.method public logOut-BWLJW6A(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/ConsumerSession;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p4

    instance-of v1, v0, Lcom/stripe/android/networking/StripeApiRepository$logOut$1;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lcom/stripe/android/networking/StripeApiRepository$logOut$1;

    iget v2, v1, Lcom/stripe/android/networking/StripeApiRepository$logOut$1;->label:I

    const/high16 v3, -0x80000000

    and-int/2addr v2, v3

    if-eqz v2, :cond_0

    iget v0, v1, Lcom/stripe/android/networking/StripeApiRepository$logOut$1;->label:I

    sub-int/2addr v0, v3

    iput v0, v1, Lcom/stripe/android/networking/StripeApiRepository$logOut$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/stripe/android/networking/StripeApiRepository$logOut$1;

    invoke-direct {v1, p0, v0}, Lcom/stripe/android/networking/StripeApiRepository$logOut$1;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v6, v1

    iget-object v0, v6, Lcom/stripe/android/networking/StripeApiRepository$logOut$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 1202
    iget v2, v6, Lcom/stripe/android/networking/StripeApiRepository$logOut$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v0, Lkotlin/Result;

    invoke-virtual {v0}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 1208
    iget-object v7, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 1209
    sget-object v0, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getLogoutConsumerUrl$payments_core_release()Ljava/lang/String;

    move-result-object v8

    const/4 v0, 0x2

    .line 1212
    new-array v0, v0, [Lkotlin/Pair;

    const-string v2, "request_surface"

    const-string v4, "android_payment_element"

    invoke-static {v2, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v4, 0x0

    aput-object v2, v0, v4

    .line 1214
    const-string v2, "consumer_session_client_secret"

    invoke-static {v2, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    .line 1213
    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    const-string v4, "credentials"

    invoke-static {v4, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v0, v3

    .line 1211
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v10

    const/16 v12, 0x8

    const/4 v13, 0x0

    const/4 v11, 0x0

    move-object/from16 v9, p3

    .line 1208
    invoke-static/range {v7 .. v13}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object v0

    .line 1218
    new-instance v2, Lcom/stripe/android/model/parsers/ConsumerSessionJsonParser;

    invoke-direct {v2}, Lcom/stripe/android/model/parsers/ConsumerSessionJsonParser;-><init>()V

    move-object v4, v2

    check-cast v4, Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    .line 1207
    iput v3, v6, Lcom/stripe/android/networking/StripeApiRepository$logOut$1;->label:I

    const/4 v5, 0x0

    const/4 v7, 0x4

    const/4 v8, 0x0

    move-object v2, p0

    move-object v3, v0

    invoke-static/range {v2 .. v8}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModelResult-BWLJW6A$default(Lcom/stripe/android/networking/StripeApiRepository;Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    return-object v0
.end method

.method public final makeApiRequest$payments_core_release(Lcom/stripe/android/core/networking/ApiRequest;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/core/networking/ApiRequest;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/core/networking/StripeResponse<",
            "Ljava/lang/String;",
            ">;>;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/core/networking/StripeResponse<",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;,
            Lcom/stripe/android/exception/CardException;,
            Lcom/stripe/android/core/exception/APIException;
        }
    .end annotation

    instance-of v0, p3, Lcom/stripe/android/networking/StripeApiRepository$makeApiRequest$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/networking/StripeApiRepository$makeApiRequest$1;

    iget v1, v0, Lcom/stripe/android/networking/StripeApiRepository$makeApiRequest$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p3, v0, Lcom/stripe/android/networking/StripeApiRepository$makeApiRequest$1;->label:I

    sub-int/2addr p3, v2

    iput p3, v0, Lcom/stripe/android/networking/StripeApiRepository$makeApiRequest$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/networking/StripeApiRepository$makeApiRequest$1;

    invoke-direct {v0, p0, p3}, Lcom/stripe/android/networking/StripeApiRepository$makeApiRequest$1;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lcom/stripe/android/networking/StripeApiRepository$makeApiRequest$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 1742
    iget v2, v0, Lcom/stripe/android/networking/StripeApiRepository$makeApiRequest$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/stripe/android/networking/StripeApiRepository$makeApiRequest$1;->L$3:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData;

    iget-object p2, v0, Lcom/stripe/android/networking/StripeApiRepository$makeApiRequest$1;->L$2:Ljava/lang/Object;

    check-cast p2, Lkotlin/jvm/functions/Function1;

    iget-object v1, v0, Lcom/stripe/android/networking/StripeApiRepository$makeApiRequest$1;->L$1:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/core/networking/ApiRequest;

    iget-object v0, v0, Lcom/stripe/android/networking/StripeApiRepository$makeApiRequest$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/networking/StripeApiRepository;

    :try_start_0
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v5, p3

    move-object p3, p1

    move-object p1, v1

    move-object v1, v0

    move-object v0, v5

    goto :goto_1

    :catchall_0
    move-exception p3

    move-object v5, p3

    move-object p3, p1

    move-object p1, v1

    move-object v1, v0

    move-object v0, v5

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 1754
    invoke-direct {p0}, Lcom/stripe/android/networking/StripeApiRepository;->disableDnsCache()Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData;

    move-result-object p3

    .line 1756
    :try_start_1
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v2, p0

    check-cast v2, Lcom/stripe/android/networking/StripeApiRepository;

    .line 1757
    iget-object v2, p0, Lcom/stripe/android/networking/StripeApiRepository;->stripeNetworkClient:Lcom/stripe/android/core/networking/StripeNetworkClient;

    move-object v4, p1

    check-cast v4, Lcom/stripe/android/core/networking/StripeRequest;

    iput-object p0, v0, Lcom/stripe/android/networking/StripeApiRepository$makeApiRequest$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/networking/StripeApiRepository$makeApiRequest$1;->L$1:Ljava/lang/Object;

    iput-object p2, v0, Lcom/stripe/android/networking/StripeApiRepository$makeApiRequest$1;->L$2:Ljava/lang/Object;

    iput-object p3, v0, Lcom/stripe/android/networking/StripeApiRepository$makeApiRequest$1;->L$3:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/networking/StripeApiRepository$makeApiRequest$1;->label:I

    invoke-interface {v2, v4, v0}, Lcom/stripe/android/core/networking/StripeNetworkClient;->executeRequest(Lcom/stripe/android/core/networking/StripeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v1, p0

    :goto_1
    :try_start_2
    check-cast v0, Lcom/stripe/android/core/networking/StripeResponse;

    .line 1756
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    goto :goto_2

    :catchall_2
    move-exception v0

    move-object v1, p0

    :goto_2
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 1759
    :goto_3
    invoke-static {v0}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object v2

    invoke-interface {p2, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1760
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p2

    if-nez p2, :cond_5

    check-cast v0, Lcom/stripe/android/core/networking/StripeResponse;

    .line 1767
    invoke-virtual {v0}, Lcom/stripe/android/core/networking/StripeResponse;->isError()Z

    move-result p1

    if-eqz p1, :cond_4

    .line 1768
    invoke-direct {v1, v0}, Lcom/stripe/android/networking/StripeApiRepository;->handleApiError(Lcom/stripe/android/core/networking/StripeResponse;)V

    .line 1771
    :cond_4
    invoke-direct {v1, p3}, Lcom/stripe/android/networking/StripeApiRepository;->resetDnsCache(Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData;)V

    return-object v0

    .line 1762
    :cond_5
    instance-of p3, p2, Ljava/io/IOException;

    if-eqz p3, :cond_6

    sget-object p3, Lcom/stripe/android/core/exception/APIConnectionException;->Companion:Lcom/stripe/android/core/exception/APIConnectionException$Companion;

    check-cast p2, Ljava/io/IOException;

    invoke-virtual {p1}, Lcom/stripe/android/core/networking/ApiRequest;->getBaseUrl()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p2, p1}, Lcom/stripe/android/core/exception/APIConnectionException$Companion;->create(Ljava/io/IOException;Ljava/lang/String;)Lcom/stripe/android/core/exception/APIConnectionException;

    move-result-object p1

    move-object p2, p1

    check-cast p2, Ljava/lang/Throwable;

    .line 1763
    :cond_6
    throw p2
.end method

.method public final makeFileUploadRequest$payments_core_release(Lcom/stripe/android/core/networking/FileUploadRequest;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/core/networking/FileUploadRequest;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/core/networking/RequestId;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/core/networking/StripeResponse<",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;,
            Lcom/stripe/android/exception/CardException;,
            Lcom/stripe/android/core/exception/APIException;
        }
    .end annotation

    instance-of v0, p3, Lcom/stripe/android/networking/StripeApiRepository$makeFileUploadRequest$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/networking/StripeApiRepository$makeFileUploadRequest$1;

    iget v1, v0, Lcom/stripe/android/networking/StripeApiRepository$makeFileUploadRequest$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p3, v0, Lcom/stripe/android/networking/StripeApiRepository$makeFileUploadRequest$1;->label:I

    sub-int/2addr p3, v2

    iput p3, v0, Lcom/stripe/android/networking/StripeApiRepository$makeFileUploadRequest$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/networking/StripeApiRepository$makeFileUploadRequest$1;

    invoke-direct {v0, p0, p3}, Lcom/stripe/android/networking/StripeApiRepository$makeFileUploadRequest$1;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lcom/stripe/android/networking/StripeApiRepository$makeFileUploadRequest$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 1776
    iget v2, v0, Lcom/stripe/android/networking/StripeApiRepository$makeFileUploadRequest$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/stripe/android/networking/StripeApiRepository$makeFileUploadRequest$1;->L$3:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData;

    iget-object p2, v0, Lcom/stripe/android/networking/StripeApiRepository$makeFileUploadRequest$1;->L$2:Ljava/lang/Object;

    check-cast p2, Lkotlin/jvm/functions/Function1;

    iget-object v1, v0, Lcom/stripe/android/networking/StripeApiRepository$makeFileUploadRequest$1;->L$1:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/core/networking/FileUploadRequest;

    iget-object v0, v0, Lcom/stripe/android/networking/StripeApiRepository$makeFileUploadRequest$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/networking/StripeApiRepository;

    :try_start_0
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v5, p3

    move-object p3, p1

    move-object p1, v1

    move-object v1, v0

    move-object v0, v5

    goto :goto_1

    :catchall_0
    move-exception p3

    move-object v5, p3

    move-object p3, p1

    move-object p1, v1

    move-object v1, v0

    move-object v0, v5

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 1788
    invoke-direct {p0}, Lcom/stripe/android/networking/StripeApiRepository;->disableDnsCache()Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData;

    move-result-object p3

    .line 1790
    :try_start_1
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v2, p0

    check-cast v2, Lcom/stripe/android/networking/StripeApiRepository;

    .line 1791
    iget-object v2, p0, Lcom/stripe/android/networking/StripeApiRepository;->stripeNetworkClient:Lcom/stripe/android/core/networking/StripeNetworkClient;

    move-object v4, p1

    check-cast v4, Lcom/stripe/android/core/networking/StripeRequest;

    iput-object p0, v0, Lcom/stripe/android/networking/StripeApiRepository$makeFileUploadRequest$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/networking/StripeApiRepository$makeFileUploadRequest$1;->L$1:Ljava/lang/Object;

    iput-object p2, v0, Lcom/stripe/android/networking/StripeApiRepository$makeFileUploadRequest$1;->L$2:Ljava/lang/Object;

    iput-object p3, v0, Lcom/stripe/android/networking/StripeApiRepository$makeFileUploadRequest$1;->L$3:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/networking/StripeApiRepository$makeFileUploadRequest$1;->label:I

    invoke-interface {v2, v4, v0}, Lcom/stripe/android/core/networking/StripeNetworkClient;->executeRequest(Lcom/stripe/android/core/networking/StripeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v1, p0

    :goto_1
    :try_start_2
    check-cast v0, Lcom/stripe/android/core/networking/StripeResponse;

    .line 1790
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    goto :goto_2

    :catchall_2
    move-exception v0

    move-object v1, p0

    :goto_2
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 1793
    :goto_3
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_4

    move-object v2, v3

    goto :goto_4

    :cond_4
    move-object v2, v0

    :goto_4
    check-cast v2, Lcom/stripe/android/core/networking/StripeResponse;

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Lcom/stripe/android/core/networking/StripeResponse;->getRequestId()Lcom/stripe/android/core/networking/RequestId;

    move-result-object v3

    :cond_5
    invoke-interface {p2, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1794
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p2

    if-nez p2, :cond_7

    check-cast v0, Lcom/stripe/android/core/networking/StripeResponse;

    .line 1801
    invoke-virtual {v0}, Lcom/stripe/android/core/networking/StripeResponse;->isError()Z

    move-result p1

    if-eqz p1, :cond_6

    .line 1802
    invoke-direct {v1, v0}, Lcom/stripe/android/networking/StripeApiRepository;->handleApiError(Lcom/stripe/android/core/networking/StripeResponse;)V

    .line 1805
    :cond_6
    invoke-direct {v1, p3}, Lcom/stripe/android/networking/StripeApiRepository;->resetDnsCache(Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData;)V

    return-object v0

    .line 1796
    :cond_7
    instance-of p3, p2, Ljava/io/IOException;

    if-eqz p3, :cond_8

    sget-object p3, Lcom/stripe/android/core/exception/APIConnectionException;->Companion:Lcom/stripe/android/core/exception/APIConnectionException$Companion;

    check-cast p2, Ljava/io/IOException;

    invoke-virtual {p1}, Lcom/stripe/android/core/networking/FileUploadRequest;->getUrl()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p2, p1}, Lcom/stripe/android/core/exception/APIConnectionException$Companion;->create(Ljava/io/IOException;Ljava/lang/String;)Lcom/stripe/android/core/exception/APIConnectionException;

    move-result-object p1

    move-object p2, p1

    check-cast p2, Ljava/lang/Throwable;

    .line 1797
    :cond_8
    throw p2
.end method

.method public refreshPaymentIntent-0E7RQCE(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/PaymentIntent;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/stripe/android/networking/StripeApiRepository$refreshPaymentIntent$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/networking/StripeApiRepository$refreshPaymentIntent$1;

    iget v1, v0, Lcom/stripe/android/networking/StripeApiRepository$refreshPaymentIntent$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p3, v0, Lcom/stripe/android/networking/StripeApiRepository$refreshPaymentIntent$1;->label:I

    sub-int/2addr p3, v2

    iput p3, v0, Lcom/stripe/android/networking/StripeApiRepository$refreshPaymentIntent$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/networking/StripeApiRepository$refreshPaymentIntent$1;

    invoke-direct {v0, p0, p3}, Lcom/stripe/android/networking/StripeApiRepository$refreshPaymentIntent$1;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object p3, v0

    iget-object v0, p3, Lcom/stripe/android/networking/StripeApiRepository$refreshPaymentIntent$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 318
    iget v2, p3, Lcom/stripe/android/networking/StripeApiRepository$refreshPaymentIntent$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v0, Lkotlin/Result;

    invoke-virtual {v0}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 322
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, p0

    check-cast v0, Lcom/stripe/android/networking/StripeApiRepository;

    .line 323
    new-instance v0, Lcom/stripe/android/model/PaymentIntent$ClientSecret;

    invoke-direct {v0, p1}, Lcom/stripe/android/model/PaymentIntent$ClientSecret;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/stripe/android/model/PaymentIntent$ClientSecret;->getPaymentIntentId$payments_core_release()Ljava/lang/String;

    move-result-object v0

    .line 322
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 324
    :goto_1
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-nez v2, :cond_4

    check-cast v0, Ljava/lang/String;

    .line 328
    invoke-direct {p0}, Lcom/stripe/android/networking/StripeApiRepository;->fireFraudDetectionDataRequest()V

    .line 331
    iget-object v4, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 332
    sget-object v2, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    invoke-virtual {v2, v0}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getRefreshPaymentIntentUrl$payments_core_release(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 334
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/stripe/android/networking/StripeApiRepository;->createClientSecretParam(Ljava/lang/String;Ljava/util/List;)Ljava/util/Map;

    move-result-object v7

    const/16 v9, 0x8

    const/4 v10, 0x0

    const/4 v8, 0x0

    move-object v6, p2

    .line 331
    invoke-static/range {v4 .. v10}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    .line 336
    new-instance p2, Lcom/stripe/android/model/parsers/PaymentIntentJsonParser;

    invoke-direct {p2}, Lcom/stripe/android/model/parsers/PaymentIntentJsonParser;-><init>()V

    check-cast p2, Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    .line 330
    new-instance v0, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda14;

    invoke-direct {v0, p0}, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda14;-><init>(Lcom/stripe/android/networking/StripeApiRepository;)V

    iput v3, p3, Lcom/stripe/android/networking/StripeApiRepository$refreshPaymentIntent$1;->label:I

    invoke-direct {p0, p1, p2, v0, p3}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModelResult-BWLJW6A(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1

    .line 325
    :cond_4
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v2}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public refreshSetupIntent-0E7RQCE(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/SetupIntent;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/stripe/android/networking/StripeApiRepository$refreshSetupIntent$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/networking/StripeApiRepository$refreshSetupIntent$1;

    iget v1, v0, Lcom/stripe/android/networking/StripeApiRepository$refreshSetupIntent$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p3, v0, Lcom/stripe/android/networking/StripeApiRepository$refreshSetupIntent$1;->label:I

    sub-int/2addr p3, v2

    iput p3, v0, Lcom/stripe/android/networking/StripeApiRepository$refreshSetupIntent$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/networking/StripeApiRepository$refreshSetupIntent$1;

    invoke-direct {v0, p0, p3}, Lcom/stripe/android/networking/StripeApiRepository$refreshSetupIntent$1;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object p3, v0

    iget-object v0, p3, Lcom/stripe/android/networking/StripeApiRepository$refreshSetupIntent$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 351
    iget v2, p3, Lcom/stripe/android/networking/StripeApiRepository$refreshSetupIntent$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v0, Lkotlin/Result;

    invoke-virtual {v0}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 355
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, p0

    check-cast v0, Lcom/stripe/android/networking/StripeApiRepository;

    .line 356
    new-instance v0, Lcom/stripe/android/model/SetupIntent$ClientSecret;

    invoke-direct {v0, p1}, Lcom/stripe/android/model/SetupIntent$ClientSecret;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/stripe/android/model/SetupIntent$ClientSecret;->getSetupIntentId$payments_core_release()Ljava/lang/String;

    move-result-object v0

    .line 355
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 357
    :goto_1
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-nez v2, :cond_4

    check-cast v0, Ljava/lang/String;

    .line 361
    invoke-direct {p0}, Lcom/stripe/android/networking/StripeApiRepository;->fireFraudDetectionDataRequest()V

    .line 364
    iget-object v4, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 365
    sget-object v2, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    invoke-virtual {v2, v0}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getRefreshSetupIntentUrl$payments_core_release(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 367
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/stripe/android/networking/StripeApiRepository;->createClientSecretParam(Ljava/lang/String;Ljava/util/List;)Ljava/util/Map;

    move-result-object v7

    const/16 v9, 0x8

    const/4 v10, 0x0

    const/4 v8, 0x0

    move-object v6, p2

    .line 364
    invoke-static/range {v4 .. v10}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    .line 369
    new-instance p2, Lcom/stripe/android/model/parsers/SetupIntentJsonParser;

    invoke-direct {p2}, Lcom/stripe/android/model/parsers/SetupIntentJsonParser;-><init>()V

    check-cast p2, Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    .line 363
    new-instance v0, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda10;

    invoke-direct {v0, p0}, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda10;-><init>(Lcom/stripe/android/networking/StripeApiRepository;)V

    iput v3, p3, Lcom/stripe/android/networking/StripeApiRepository$refreshSetupIntent$1;->label:I

    invoke-direct {p0, p1, p2, v0, p3}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModelResult-BWLJW6A(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1

    .line 358
    :cond_4
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v2}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public retrieveCardElementConfig-0E7RQCE(Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/MobileCardElementConfig;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p3

    instance-of v1, v0, Lcom/stripe/android/networking/StripeApiRepository$retrieveCardElementConfig$1;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lcom/stripe/android/networking/StripeApiRepository$retrieveCardElementConfig$1;

    iget v2, v1, Lcom/stripe/android/networking/StripeApiRepository$retrieveCardElementConfig$1;->label:I

    const/high16 v3, -0x80000000

    and-int/2addr v2, v3

    if-eqz v2, :cond_0

    iget v0, v1, Lcom/stripe/android/networking/StripeApiRepository$retrieveCardElementConfig$1;->label:I

    sub-int/2addr v0, v3

    iput v0, v1, Lcom/stripe/android/networking/StripeApiRepository$retrieveCardElementConfig$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/stripe/android/networking/StripeApiRepository$retrieveCardElementConfig$1;

    invoke-direct {v1, p0, v0}, Lcom/stripe/android/networking/StripeApiRepository$retrieveCardElementConfig$1;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v6, v1

    iget-object v0, v6, Lcom/stripe/android/networking/StripeApiRepository$retrieveCardElementConfig$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 1543
    iget v2, v6, Lcom/stripe/android/networking/StripeApiRepository$retrieveCardElementConfig$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v0, Lkotlin/Result;

    invoke-virtual {v0}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 1548
    iget-object v7, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 1549
    sget-object v0, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getMobileCardElementConfigUrl$payments_core_release()Ljava/lang/String;

    move-result-object v8

    const/16 v12, 0x8

    const/4 v13, 0x0

    const/4 v11, 0x0

    move-object v9, p1

    move-object/from16 v10, p2

    .line 1548
    invoke-static/range {v7 .. v13}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createGet$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object v0

    .line 1553
    new-instance v2, Lcom/stripe/android/model/parsers/MobileCardElementConfigParser;

    invoke-direct {v2}, Lcom/stripe/android/model/parsers/MobileCardElementConfigParser;-><init>()V

    move-object v4, v2

    check-cast v4, Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    .line 1547
    iput v3, v6, Lcom/stripe/android/networking/StripeApiRepository$retrieveCardElementConfig$1;->label:I

    const/4 v5, 0x0

    const/4 v7, 0x4

    const/4 v8, 0x0

    move-object v2, p0

    move-object v3, v0

    invoke-static/range {v2 .. v8}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModelResult-BWLJW6A$default(Lcom/stripe/android/networking/StripeApiRepository;Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    return-object v0
.end method

.method public retrieveCardMetadata-0E7RQCE(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/CardMetadata;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of p2, p3, Lcom/stripe/android/networking/StripeApiRepository$retrieveCardMetadata$1;

    if-eqz p2, :cond_0

    move-object p2, p3

    check-cast p2, Lcom/stripe/android/networking/StripeApiRepository$retrieveCardMetadata$1;

    iget v0, p2, Lcom/stripe/android/networking/StripeApiRepository$retrieveCardMetadata$1;->label:I

    const/high16 v1, -0x80000000

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    iget p3, p2, Lcom/stripe/android/networking/StripeApiRepository$retrieveCardMetadata$1;->label:I

    sub-int/2addr p3, v1

    iput p3, p2, Lcom/stripe/android/networking/StripeApiRepository$retrieveCardMetadata$1;->label:I

    goto :goto_0

    :cond_0
    new-instance p2, Lcom/stripe/android/networking/StripeApiRepository$retrieveCardMetadata$1;

    invoke-direct {p2, p0, p3}, Lcom/stripe/android/networking/StripeApiRepository$retrieveCardMetadata$1;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, p2, Lcom/stripe/android/networking/StripeApiRepository$retrieveCardMetadata$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 1513
    iget v1, p2, Lcom/stripe/android/networking/StripeApiRepository$retrieveCardMetadata$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    iget-object p1, p2, Lcom/stripe/android/networking/StripeApiRepository$retrieveCardMetadata$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/cards/Bin;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 1517
    new-instance p3, Lcom/stripe/android/cards/CardNumber$Unvalidated;

    invoke-direct {p3, p1}, Lcom/stripe/android/cards/CardNumber$Unvalidated;-><init>(Ljava/lang/String;)V

    .line 1519
    invoke-virtual {p3}, Lcom/stripe/android/cards/CardNumber$Unvalidated;->getBin()Lcom/stripe/android/cards/Bin;

    move-result-object p1

    if-nez p1, :cond_3

    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 1520
    new-instance v0, Lcom/stripe/android/core/exception/InvalidRequestException;

    const/16 v6, 0x17

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-string v4, "cardNumber cannot be less than 6 characters"

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/core/exception/InvalidRequestException;-><init>(Lcom/stripe/android/core/StripeError;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v0, Ljava/lang/Throwable;

    .line 1519
    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 1526
    :cond_3
    iget-object v1, p0, Lcom/stripe/android/networking/StripeApiRepository;->cardAccountRangeRepositoryFactory:Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;

    .line 1527
    move-object v3, p0

    check-cast v3, Lcom/stripe/android/networking/StripeRepository;

    .line 1528
    iget-object v4, p0, Lcom/stripe/android/networking/StripeApiRepository;->publishableKeyProvider:Lkotlin/jvm/functions/Function0;

    invoke-interface {v4}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 1526
    invoke-interface {v1, v3, v4}, Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;->createWithStripeRepository(Lcom/stripe/android/networking/StripeRepository;Ljava/lang/String;)Lcom/stripe/android/cards/CardAccountRangeRepository;

    move-result-object v1

    .line 1531
    iput-object p1, p2, Lcom/stripe/android/networking/StripeApiRepository$retrieveCardMetadata$1;->L$0:Ljava/lang/Object;

    iput v2, p2, Lcom/stripe/android/networking/StripeApiRepository$retrieveCardMetadata$1;->label:I

    invoke-interface {v1, p3, p2}, Lcom/stripe/android/cards/CardAccountRangeRepository;->getAccountRanges(Lcom/stripe/android/cards/CardNumber$Unvalidated;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v0, :cond_4

    return-object v0

    :cond_4
    :goto_1
    check-cast p3, Ljava/util/List;

    if-nez p3, :cond_5

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p3

    .line 1535
    :cond_5
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 1536
    new-instance p2, Lcom/stripe/android/model/CardMetadata;

    invoke-direct {p2, p1, p3}, Lcom/stripe/android/model/CardMetadata;-><init>(Lcom/stripe/android/cards/Bin;Ljava/util/List;)V

    .line 1535
    invoke-static {p2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public retrieveCustomer-BWLJW6A(Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/Customer;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lcom/stripe/android/networking/StripeApiRepository$retrieveCustomer$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/stripe/android/networking/StripeApiRepository$retrieveCustomer$1;

    iget v1, v0, Lcom/stripe/android/networking/StripeApiRepository$retrieveCustomer$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p4, v0, Lcom/stripe/android/networking/StripeApiRepository$retrieveCustomer$1;->label:I

    sub-int/2addr p4, v2

    iput p4, v0, Lcom/stripe/android/networking/StripeApiRepository$retrieveCustomer$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/networking/StripeApiRepository$retrieveCustomer$1;

    invoke-direct {v0, p0, p4}, Lcom/stripe/android/networking/StripeApiRepository$retrieveCustomer$1;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p4, v0, Lcom/stripe/android/networking/StripeApiRepository$retrieveCustomer$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 907
    iget v2, v0, Lcom/stripe/android/networking/StripeApiRepository$retrieveCustomer$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p4, Lkotlin/Result;

    invoke-virtual {p4}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 913
    iget-object v4, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 914
    sget-object p4, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    invoke-virtual {p4, p1}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getRetrieveCustomerUrl$payments_core_release(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const/16 v9, 0xc

    const/4 v10, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v6, p3

    .line 913
    invoke-static/range {v4 .. v10}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createGet$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    .line 917
    new-instance p3, Lcom/stripe/android/model/parsers/CustomerJsonParser;

    invoke-direct {p3}, Lcom/stripe/android/model/parsers/CustomerJsonParser;-><init>()V

    check-cast p3, Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    .line 912
    new-instance p4, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda4;

    invoke-direct {p4, p0, p2}, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda4;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Ljava/util/Set;)V

    iput v3, v0, Lcom/stripe/android/networking/StripeApiRepository$retrieveCustomer$1;->label:I

    invoke-direct {p0, p1, p3, p4, v0}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModelResult-BWLJW6A(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method

.method public retrieveElementsSession-0E7RQCE(Lcom/stripe/android/model/ElementsSessionParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/ElementsSessionParams;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/ElementsSession;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/stripe/android/networking/StripeApiRepository$retrieveElementsSession$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/networking/StripeApiRepository$retrieveElementsSession$1;

    iget v1, v0, Lcom/stripe/android/networking/StripeApiRepository$retrieveElementsSession$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p3, v0, Lcom/stripe/android/networking/StripeApiRepository$retrieveElementsSession$1;->label:I

    sub-int/2addr p3, v2

    iput p3, v0, Lcom/stripe/android/networking/StripeApiRepository$retrieveElementsSession$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/networking/StripeApiRepository$retrieveElementsSession$1;

    invoke-direct {v0, p0, p3}, Lcom/stripe/android/networking/StripeApiRepository$retrieveElementsSession$1;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lcom/stripe/android/networking/StripeApiRepository$retrieveElementsSession$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 1502
    iget v2, v0, Lcom/stripe/android/networking/StripeApiRepository$retrieveElementsSession$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p3, Lkotlin/Result;

    invoke-virtual {p3}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 1506
    iput v3, v0, Lcom/stripe/android/networking/StripeApiRepository$retrieveElementsSession$1;->label:I

    const/4 p3, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/stripe/android/networking/StripeApiRepository;->retrieveElementsSession-BWLJW6A(Lcom/stripe/android/model/ElementsSessionParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method

.method public retrieveIssuingCardPin-yxL6bBk(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p5

    instance-of v1, v0, Lcom/stripe/android/networking/StripeApiRepository$retrieveIssuingCardPin$1;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lcom/stripe/android/networking/StripeApiRepository$retrieveIssuingCardPin$1;

    iget v2, v1, Lcom/stripe/android/networking/StripeApiRepository$retrieveIssuingCardPin$1;->label:I

    const/high16 v3, -0x80000000

    and-int/2addr v2, v3

    if-eqz v2, :cond_0

    iget v0, v1, Lcom/stripe/android/networking/StripeApiRepository$retrieveIssuingCardPin$1;->label:I

    sub-int/2addr v0, v3

    iput v0, v1, Lcom/stripe/android/networking/StripeApiRepository$retrieveIssuingCardPin$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/stripe/android/networking/StripeApiRepository$retrieveIssuingCardPin$1;

    invoke-direct {v1, p0, v0}, Lcom/stripe/android/networking/StripeApiRepository$retrieveIssuingCardPin$1;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object v0, v1, Lcom/stripe/android/networking/StripeApiRepository$retrieveIssuingCardPin$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    .line 931
    iget v3, v1, Lcom/stripe/android/networking/StripeApiRepository$retrieveIssuingCardPin$1;->label:I

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v4, :cond_1

    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v0, Lkotlin/Result;

    invoke-virtual {v0}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 938
    iget-object v5, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 939
    sget-object v0, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    invoke-virtual {v0, p1}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getIssuingCardPinUrl$payments_core_release(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 942
    const-string p1, "verification"

    invoke-static {v0, p2, p3}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->access$createVerificationParam(Lcom/stripe/android/networking/StripeApiRepository$Companion;Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    .line 941
    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v8

    const/16 v10, 0x8

    const/4 v11, 0x0

    const/4 v9, 0x0

    move-object/from16 v7, p4

    .line 938
    invoke-static/range {v5 .. v11}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createGet$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    .line 945
    new-instance p2, Lcom/stripe/android/model/parsers/IssuingCardPinJsonParser;

    invoke-direct {p2}, Lcom/stripe/android/model/parsers/IssuingCardPinJsonParser;-><init>()V

    check-cast p2, Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    .line 937
    new-instance p3, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda30;

    invoke-direct {p3, p0}, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda30;-><init>(Lcom/stripe/android/networking/StripeApiRepository;)V

    iput v4, v1, Lcom/stripe/android/networking/StripeApiRepository$retrieveIssuingCardPin$1;->label:I

    invoke-direct {p0, p1, p2, p3, v1}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModelResult-BWLJW6A(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_3

    return-object v2

    .line 947
    :cond_3
    :goto_1
    invoke-static {p1}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    check-cast p1, Lcom/stripe/android/model/IssuingCardPin;

    invoke-virtual {p1}, Lcom/stripe/android/model/IssuingCardPin;->getPin()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public retrieveObject-0E7RQCE(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/core/networking/StripeResponse<",
            "Ljava/lang/String;",
            ">;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/stripe/android/networking/StripeApiRepository$retrieveObject$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/networking/StripeApiRepository$retrieveObject$1;

    iget v1, v0, Lcom/stripe/android/networking/StripeApiRepository$retrieveObject$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p3, v0, Lcom/stripe/android/networking/StripeApiRepository$retrieveObject$1;->label:I

    sub-int/2addr p3, v2

    iput p3, v0, Lcom/stripe/android/networking/StripeApiRepository$retrieveObject$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/networking/StripeApiRepository$retrieveObject$1;

    invoke-direct {v0, p0, p3}, Lcom/stripe/android/networking/StripeApiRepository$retrieveObject$1;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lcom/stripe/android/networking/StripeApiRepository$retrieveObject$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 1062
    iget v2, v0, Lcom/stripe/android/networking/StripeApiRepository$retrieveObject$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 1066
    sget-object p3, Lcom/stripe/android/utils/StripeUrlUtils;->INSTANCE:Lcom/stripe/android/utils/StripeUrlUtils;

    invoke-virtual {p3, p1}, Lcom/stripe/android/utils/StripeUrlUtils;->isStripeUrl$payments_core_release(Ljava/lang/String;)Z

    move-result p3

    if-nez p3, :cond_3

    .line 1067
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "Unrecognized domain: "

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    check-cast p2, Ljava/lang/Throwable;

    invoke-static {p2}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 1070
    :cond_3
    :try_start_1
    sget-object p3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object p3, p0

    check-cast p3, Lcom/stripe/android/networking/StripeApiRepository;

    .line 1072
    iget-object v4, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    const/16 v9, 0xc

    const/4 v10, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v5, p1

    move-object v6, p2

    invoke-static/range {v4 .. v10}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createGet$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    .line 1071
    new-instance p2, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda40;

    invoke-direct {p2, p0}, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda40;-><init>(Lcom/stripe/android/networking/StripeApiRepository;)V

    iput v3, v0, Lcom/stripe/android/networking/StripeApiRepository$retrieveObject$1;->label:I

    invoke-virtual {p0, p1, p2, v0}, Lcom/stripe/android/networking/StripeApiRepository;->makeApiRequest$payments_core_release(Lcom/stripe/android/core/networking/ApiRequest;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_4

    return-object v1

    .line 1062
    :cond_4
    :goto_1
    check-cast p3, Lcom/stripe/android/core/networking/StripeResponse;

    .line 1070
    invoke-static {p3}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-object p1

    :goto_2
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public retrievePaymentIntent-BWLJW6A(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/PaymentIntent;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lcom/stripe/android/networking/StripeApiRepository$retrievePaymentIntent$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/stripe/android/networking/StripeApiRepository$retrievePaymentIntent$1;

    iget v1, v0, Lcom/stripe/android/networking/StripeApiRepository$retrievePaymentIntent$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p4, v0, Lcom/stripe/android/networking/StripeApiRepository$retrievePaymentIntent$1;->label:I

    sub-int/2addr p4, v2

    iput p4, v0, Lcom/stripe/android/networking/StripeApiRepository$retrievePaymentIntent$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/networking/StripeApiRepository$retrievePaymentIntent$1;

    invoke-direct {v0, p0, p4}, Lcom/stripe/android/networking/StripeApiRepository$retrievePaymentIntent$1;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object p4, v0

    iget-object v0, p4, Lcom/stripe/android/networking/StripeApiRepository$retrievePaymentIntent$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 278
    iget v2, p4, Lcom/stripe/android/networking/StripeApiRepository$retrievePaymentIntent$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v0, Lkotlin/Result;

    invoke-virtual {v0}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 283
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, p0

    check-cast v0, Lcom/stripe/android/networking/StripeApiRepository;

    .line 284
    new-instance v0, Lcom/stripe/android/model/PaymentIntent$ClientSecret;

    invoke-direct {v0, p1}, Lcom/stripe/android/model/PaymentIntent$ClientSecret;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/stripe/android/model/PaymentIntent$ClientSecret;->getPaymentIntentId$payments_core_release()Ljava/lang/String;

    move-result-object v0

    .line 283
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 285
    :goto_1
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-nez v2, :cond_5

    check-cast v0, Ljava/lang/String;

    .line 289
    invoke-virtual {p2}, Lcom/stripe/android/core/networking/ApiRequest$Options;->getApiKeyIsUserKey()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 290
    sget-object p1, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    invoke-static {p1, p3}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->access$createExpandParam(Lcom/stripe/android/networking/StripeApiRepository$Companion;Ljava/util/List;)Ljava/util/Map;

    move-result-object p1

    goto :goto_2

    .line 292
    :cond_3
    invoke-direct {p0, p1, p3}, Lcom/stripe/android/networking/StripeApiRepository;->createClientSecretParam(Ljava/lang/String;Ljava/util/List;)Ljava/util/Map;

    move-result-object p1

    :goto_2
    move-object v7, p1

    .line 295
    invoke-direct {p0}, Lcom/stripe/android/networking/StripeApiRepository;->fireFraudDetectionDataRequest()V

    .line 298
    iget-object v4, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 299
    sget-object p1, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    invoke-virtual {p1, v0}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getRetrievePaymentIntentUrl$payments_core_release(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const/16 v9, 0x8

    const/4 v10, 0x0

    const/4 v8, 0x0

    move-object v6, p2

    .line 298
    invoke-static/range {v4 .. v10}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createGet$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    .line 303
    new-instance p2, Lcom/stripe/android/model/parsers/PaymentIntentJsonParser;

    invoke-direct {p2}, Lcom/stripe/android/model/parsers/PaymentIntentJsonParser;-><init>()V

    check-cast p2, Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    .line 297
    new-instance p3, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda25;

    invoke-direct {p3, p0}, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda25;-><init>(Lcom/stripe/android/networking/StripeApiRepository;)V

    iput v3, p4, Lcom/stripe/android/networking/StripeApiRepository$retrievePaymentIntent$1;->label:I

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModelResult-BWLJW6A(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    return-object p1

    .line 286
    :cond_5
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v2}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public retrievePaymentMethodMessage-eH_QyT8(Ljava/util/List;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/PaymentMethodMessage;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p8

    instance-of v1, v0, Lcom/stripe/android/networking/StripeApiRepository$retrievePaymentMethodMessage$1;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lcom/stripe/android/networking/StripeApiRepository$retrievePaymentMethodMessage$1;

    iget v2, v1, Lcom/stripe/android/networking/StripeApiRepository$retrievePaymentMethodMessage$1;->label:I

    const/high16 v3, -0x80000000

    and-int/2addr v2, v3

    if-eqz v2, :cond_0

    iget v0, v1, Lcom/stripe/android/networking/StripeApiRepository$retrievePaymentMethodMessage$1;->label:I

    sub-int/2addr v0, v3

    iput v0, v1, Lcom/stripe/android/networking/StripeApiRepository$retrievePaymentMethodMessage$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/stripe/android/networking/StripeApiRepository$retrievePaymentMethodMessage$1;

    invoke-direct {v1, p0, v0}, Lcom/stripe/android/networking/StripeApiRepository$retrievePaymentMethodMessage$1;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object v0, v1, Lcom/stripe/android/networking/StripeApiRepository$retrievePaymentMethodMessage$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    .line 1456
    iget v3, v1, Lcom/stripe/android/networking/StripeApiRepository$retrievePaymentMethodMessage$1;->label:I

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v4, :cond_1

    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v0, Lkotlin/Result;

    invoke-virtual {v0}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 1466
    iget-object v5, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    const/4 v0, 0x6

    .line 1470
    new-array v0, v0, [Lkotlin/Pair;

    const-string v3, "amount"

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {v3, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p2

    const/4 v3, 0x0

    aput-object p2, v0, v3

    .line 1471
    const-string p2, "client"

    const-string v6, "android"

    invoke-static {p2, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p2

    aput-object p2, v0, v4

    .line 1472
    const-string p2, "country"

    move-object/from16 v6, p4

    invoke-static {p2, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p2

    const/4 v6, 0x2

    aput-object p2, v0, v6

    .line 1473
    const-string p2, "currency"

    invoke-static {p2, p3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p2

    const/4 v6, 0x3

    aput-object p2, v0, v6

    .line 1474
    const-string p2, "locale"

    move-object/from16 v6, p5

    invoke-static {p2, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p2

    const/4 v6, 0x4

    aput-object p2, v0, v6

    .line 1475
    const-string p2, "logo_color"

    move-object/from16 v6, p6

    invoke-static {p2, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p2

    const/4 v6, 0x5

    aput-object p2, v0, v6

    .line 1469
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p2

    .line 1476
    check-cast p1, Ljava/lang/Iterable;

    .line 2310
    new-instance v0, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {p1, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v0, v6}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v0, Ljava/util/Collection;

    .line 2312
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    add-int/lit8 v7, v3, 0x1

    if-gez v3, :cond_3

    .line 2313
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_3
    check-cast v6, Ljava/lang/String;

    .line 1477
    new-instance v8, Lkotlin/Pair;

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "payment_methods["

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v9, "]"

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v8, v3, v6}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2313
    invoke-interface {v0, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v3, v7

    goto :goto_1

    .line 2314
    :cond_4
    check-cast v0, Ljava/util/List;

    .line 2310
    check-cast v0, Ljava/lang/Iterable;

    .line 1469
    invoke-static {p2, v0}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v8

    const/16 v10, 0x8

    const/4 v11, 0x0

    .line 1466
    const-string v6, "https://ppm.stripe.com/content"

    const/4 v9, 0x0

    move-object/from16 v7, p7

    invoke-static/range {v5 .. v11}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createGet$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    .line 1480
    new-instance p2, Lcom/stripe/android/model/parsers/PaymentMethodMessageJsonParser;

    invoke-direct {p2}, Lcom/stripe/android/model/parsers/PaymentMethodMessageJsonParser;-><init>()V

    check-cast p2, Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    new-instance v0, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda3;

    invoke-direct {v0}, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda3;-><init>()V

    .line 1465
    iput v4, v1, Lcom/stripe/android/networking/StripeApiRepository$retrievePaymentMethodMessage$1;->label:I

    invoke-direct {p0, p1, p2, v0, v1}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModelResult-BWLJW6A(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_5

    return-object v2

    :cond_5
    return-object p1
.end method

.method public retrieveSetupIntent-BWLJW6A(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/SetupIntent;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lcom/stripe/android/networking/StripeApiRepository$retrieveSetupIntent$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/stripe/android/networking/StripeApiRepository$retrieveSetupIntent$1;

    iget v1, v0, Lcom/stripe/android/networking/StripeApiRepository$retrieveSetupIntent$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p4, v0, Lcom/stripe/android/networking/StripeApiRepository$retrieveSetupIntent$1;->label:I

    sub-int/2addr p4, v2

    iput p4, v0, Lcom/stripe/android/networking/StripeApiRepository$retrieveSetupIntent$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/networking/StripeApiRepository$retrieveSetupIntent$1;

    invoke-direct {v0, p0, p4}, Lcom/stripe/android/networking/StripeApiRepository$retrieveSetupIntent$1;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object p4, v0

    iget-object v0, p4, Lcom/stripe/android/networking/StripeApiRepository$retrieveSetupIntent$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 467
    iget v2, p4, Lcom/stripe/android/networking/StripeApiRepository$retrieveSetupIntent$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v0, Lkotlin/Result;

    invoke-virtual {v0}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 472
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, p0

    check-cast v0, Lcom/stripe/android/networking/StripeApiRepository;

    .line 473
    new-instance v0, Lcom/stripe/android/model/SetupIntent$ClientSecret;

    invoke-direct {v0, p1}, Lcom/stripe/android/model/SetupIntent$ClientSecret;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/stripe/android/model/SetupIntent$ClientSecret;->getSetupIntentId$payments_core_release()Ljava/lang/String;

    move-result-object v0

    .line 472
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 474
    :goto_1
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-nez v2, :cond_5

    check-cast v0, Ljava/lang/String;

    .line 478
    invoke-virtual {p2}, Lcom/stripe/android/core/networking/ApiRequest$Options;->getApiKeyIsUserKey()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 479
    sget-object p1, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    invoke-static {p1, p3}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->access$createExpandParam(Lcom/stripe/android/networking/StripeApiRepository$Companion;Ljava/util/List;)Ljava/util/Map;

    move-result-object p1

    goto :goto_2

    .line 481
    :cond_3
    invoke-direct {p0, p1, p3}, Lcom/stripe/android/networking/StripeApiRepository;->createClientSecretParam(Ljava/lang/String;Ljava/util/List;)Ljava/util/Map;

    move-result-object p1

    :goto_2
    move-object v7, p1

    .line 484
    invoke-direct {p0}, Lcom/stripe/android/networking/StripeApiRepository;->fireFraudDetectionDataRequest()V

    .line 487
    iget-object v4, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 488
    sget-object p1, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    invoke-virtual {p1, v0}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getRetrieveSetupIntentUrl$payments_core_release(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const/16 v9, 0x8

    const/4 v10, 0x0

    const/4 v8, 0x0

    move-object v6, p2

    .line 487
    invoke-static/range {v4 .. v10}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createGet$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    .line 492
    new-instance p2, Lcom/stripe/android/model/parsers/SetupIntentJsonParser;

    invoke-direct {p2}, Lcom/stripe/android/model/parsers/SetupIntentJsonParser;-><init>()V

    check-cast p2, Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    .line 486
    new-instance p3, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda15;

    invoke-direct {p3, p0}, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda15;-><init>(Lcom/stripe/android/networking/StripeApiRepository;)V

    iput v3, p4, Lcom/stripe/android/networking/StripeApiRepository$retrieveSetupIntent$1;->label:I

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModelResult-BWLJW6A(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    return-object p1

    .line 475
    :cond_5
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v2}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public retrieveSource-BWLJW6A(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/Source;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lcom/stripe/android/networking/StripeApiRepository$retrieveSource$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/stripe/android/networking/StripeApiRepository$retrieveSource$1;

    iget v1, v0, Lcom/stripe/android/networking/StripeApiRepository$retrieveSource$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p4, v0, Lcom/stripe/android/networking/StripeApiRepository$retrieveSource$1;->label:I

    sub-int/2addr p4, v2

    iput p4, v0, Lcom/stripe/android/networking/StripeApiRepository$retrieveSource$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/networking/StripeApiRepository$retrieveSource$1;

    invoke-direct {v0, p0, p4}, Lcom/stripe/android/networking/StripeApiRepository$retrieveSource$1;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p4, v0, Lcom/stripe/android/networking/StripeApiRepository$retrieveSource$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 560
    iget v2, v0, Lcom/stripe/android/networking/StripeApiRepository$retrieveSource$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p4, Lkotlin/Result;

    invoke-virtual {p4}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 566
    iget-object v4, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 567
    sget-object p4, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    invoke-virtual {p4, p1}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getRetrieveSourceApiUrl$payments_core_release(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 569
    sget-object p1, Lcom/stripe/android/model/SourceParams;->Companion:Lcom/stripe/android/model/SourceParams$Companion;

    invoke-virtual {p1, p2}, Lcom/stripe/android/model/SourceParams$Companion;->createRetrieveSourceParams(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v7

    const/16 v9, 0x8

    const/4 v10, 0x0

    const/4 v8, 0x0

    move-object v6, p3

    .line 566
    invoke-static/range {v4 .. v10}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createGet$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    .line 571
    new-instance p2, Lcom/stripe/android/model/parsers/SourceJsonParser;

    invoke-direct {p2}, Lcom/stripe/android/model/parsers/SourceJsonParser;-><init>()V

    check-cast p2, Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    .line 565
    new-instance p3, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda0;

    invoke-direct {p3, p0}, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/networking/StripeApiRepository;)V

    iput v3, v0, Lcom/stripe/android/networking/StripeApiRepository$retrieveSource$1;->label:I

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModelResult-BWLJW6A(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method

.method public retrieveStripeIntent-BWLJW6A(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "+",
            "Lcom/stripe/android/model/StripeIntent;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lcom/stripe/android/networking/StripeApiRepository$retrieveStripeIntent$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/stripe/android/networking/StripeApiRepository$retrieveStripeIntent$1;

    iget v1, v0, Lcom/stripe/android/networking/StripeApiRepository$retrieveStripeIntent$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p4, v0, Lcom/stripe/android/networking/StripeApiRepository$retrieveStripeIntent$1;->label:I

    sub-int/2addr p4, v2

    iput p4, v0, Lcom/stripe/android/networking/StripeApiRepository$retrieveStripeIntent$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/networking/StripeApiRepository$retrieveStripeIntent$1;

    invoke-direct {v0, p0, p4}, Lcom/stripe/android/networking/StripeApiRepository$retrieveStripeIntent$1;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p4, v0, Lcom/stripe/android/networking/StripeApiRepository$retrieveStripeIntent$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 184
    iget v2, v0, Lcom/stripe/android/networking/StripeApiRepository$retrieveStripeIntent$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p4, Lkotlin/Result;

    invoke-virtual {p4}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p4, Lkotlin/Result;

    invoke-virtual {p4}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_3
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 190
    sget-object p4, Lcom/stripe/android/model/PaymentIntent$ClientSecret;->Companion:Lcom/stripe/android/model/PaymentIntent$ClientSecret$Companion;

    invoke-virtual {p4, p1}, Lcom/stripe/android/model/PaymentIntent$ClientSecret$Companion;->isMatch(Ljava/lang/String;)Z

    move-result p4

    if-eqz p4, :cond_5

    .line 191
    iput v4, v0, Lcom/stripe/android/networking/StripeApiRepository$retrieveStripeIntent$1;->label:I

    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/stripe/android/networking/StripeApiRepository;->retrievePaymentIntent-BWLJW6A(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_1

    :cond_4
    return-object p1

    .line 193
    :cond_5
    sget-object p4, Lcom/stripe/android/model/SetupIntent$ClientSecret;->Companion:Lcom/stripe/android/model/SetupIntent$ClientSecret$Companion;

    invoke-virtual {p4, p1}, Lcom/stripe/android/model/SetupIntent$ClientSecret$Companion;->isMatch(Ljava/lang/String;)Z

    move-result p4

    if-eqz p4, :cond_7

    .line 194
    iput v3, v0, Lcom/stripe/android/networking/StripeApiRepository$retrieveStripeIntent$1;->label:I

    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/stripe/android/networking/StripeApiRepository;->retrieveSetupIntent-BWLJW6A(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    :goto_1
    return-object v1

    :cond_6
    return-object p1

    .line 197
    :cond_7
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Invalid client secret."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public setCustomerShippingInfo-hUnOzRk(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/model/ShippingInformation;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/model/ShippingInformation;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/Customer;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 p2, p6

    instance-of v0, p2, Lcom/stripe/android/networking/StripeApiRepository$setCustomerShippingInfo$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/networking/StripeApiRepository$setCustomerShippingInfo$1;

    iget v1, v0, Lcom/stripe/android/networking/StripeApiRepository$setCustomerShippingInfo$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p2, v0, Lcom/stripe/android/networking/StripeApiRepository$setCustomerShippingInfo$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcom/stripe/android/networking/StripeApiRepository$setCustomerShippingInfo$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/networking/StripeApiRepository$setCustomerShippingInfo$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/networking/StripeApiRepository$setCustomerShippingInfo$1;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/stripe/android/networking/StripeApiRepository$setCustomerShippingInfo$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 880
    iget v2, v0, Lcom/stripe/android/networking/StripeApiRepository$setCustomerShippingInfo$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p2, Lkotlin/Result;

    invoke-virtual {p2}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 888
    iget-object v4, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 889
    sget-object p2, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    invoke-virtual {p2, p1}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getRetrieveCustomerUrl$payments_core_release(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 891
    const-string p1, "shipping"

    invoke-virtual {p4}, Lcom/stripe/android/model/ShippingInformation;->toParamMap()Ljava/util/Map;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v7

    const/16 v9, 0x8

    const/4 v10, 0x0

    const/4 v8, 0x0

    move-object/from16 v6, p5

    .line 888
    invoke-static/range {v4 .. v10}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    .line 893
    new-instance p2, Lcom/stripe/android/model/parsers/CustomerJsonParser;

    invoke-direct {p2}, Lcom/stripe/android/model/parsers/CustomerJsonParser;-><init>()V

    check-cast p2, Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    .line 887
    new-instance v2, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda39;

    invoke-direct {v2, p0, p3}, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda39;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Ljava/util/Set;)V

    iput v3, v0, Lcom/stripe/android/networking/StripeApiRepository$setCustomerShippingInfo$1;->label:I

    invoke-direct {p0, p1, p2, v2, v0}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModelResult-BWLJW6A(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method

.method public setDefaultCustomerSource-bMdYcbs(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/Customer;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 p2, p7

    instance-of v0, p2, Lcom/stripe/android/networking/StripeApiRepository$setDefaultCustomerSource$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/networking/StripeApiRepository$setDefaultCustomerSource$1;

    iget v1, v0, Lcom/stripe/android/networking/StripeApiRepository$setDefaultCustomerSource$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p2, v0, Lcom/stripe/android/networking/StripeApiRepository$setDefaultCustomerSource$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcom/stripe/android/networking/StripeApiRepository$setDefaultCustomerSource$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/networking/StripeApiRepository$setDefaultCustomerSource$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/networking/StripeApiRepository$setDefaultCustomerSource$1;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/stripe/android/networking/StripeApiRepository$setDefaultCustomerSource$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 851
    iget v2, v0, Lcom/stripe/android/networking/StripeApiRepository$setDefaultCustomerSource$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p2, Lkotlin/Result;

    invoke-virtual {p2}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 860
    iget-object v4, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 861
    sget-object p2, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    invoke-virtual {p2, p1}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getRetrieveCustomerUrl$payments_core_release(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 863
    const-string p1, "default_source"

    invoke-static {p1, p4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v7

    const/16 v9, 0x8

    const/4 v10, 0x0

    const/4 v8, 0x0

    move-object/from16 v6, p6

    .line 860
    invoke-static/range {v4 .. v10}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    .line 865
    new-instance p2, Lcom/stripe/android/model/parsers/CustomerJsonParser;

    invoke-direct {p2}, Lcom/stripe/android/model/parsers/CustomerJsonParser;-><init>()V

    check-cast p2, Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    .line 859
    new-instance v2, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda2;

    move-object/from16 v4, p5

    invoke-direct {v2, p0, p3, v4}, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda2;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Ljava/util/Set;Ljava/lang/String;)V

    iput v3, v0, Lcom/stripe/android/networking/StripeApiRepository$setDefaultCustomerSource$1;->label:I

    invoke-direct {p0, p1, p2, v2, v0}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModelResult-BWLJW6A(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method

.method public setDefaultPaymentMethod-BWLJW6A(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/Customer;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p4

    instance-of v1, v0, Lcom/stripe/android/networking/StripeApiRepository$setDefaultPaymentMethod$1;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lcom/stripe/android/networking/StripeApiRepository$setDefaultPaymentMethod$1;

    iget v2, v1, Lcom/stripe/android/networking/StripeApiRepository$setDefaultPaymentMethod$1;->label:I

    const/high16 v3, -0x80000000

    and-int/2addr v2, v3

    if-eqz v2, :cond_0

    iget v0, v1, Lcom/stripe/android/networking/StripeApiRepository$setDefaultPaymentMethod$1;->label:I

    sub-int/2addr v0, v3

    iput v0, v1, Lcom/stripe/android/networking/StripeApiRepository$setDefaultPaymentMethod$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/stripe/android/networking/StripeApiRepository$setDefaultPaymentMethod$1;

    invoke-direct {v1, p0, v0}, Lcom/stripe/android/networking/StripeApiRepository$setDefaultPaymentMethod$1;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v6, v1

    iget-object v0, v6, Lcom/stripe/android/networking/StripeApiRepository$setDefaultPaymentMethod$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 631
    iget v2, v6, Lcom/stripe/android/networking/StripeApiRepository$setDefaultPaymentMethod$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v0, Lkotlin/Result;

    invoke-virtual {v0}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 637
    iget-object v7, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 638
    sget-object v0, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    invoke-virtual {v0, p1}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getSetDefaultPaymentMethodUrl$payments_core_release(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    if-nez p2, :cond_3

    .line 640
    const-string v0, ""

    goto :goto_1

    :cond_3
    move-object/from16 v0, p2

    :goto_1
    const-string v2, "payment_method"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v10

    const/16 v12, 0x8

    const/4 v13, 0x0

    const/4 v11, 0x0

    move-object/from16 v9, p3

    .line 637
    invoke-static/range {v7 .. v13}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object v0

    .line 642
    new-instance v2, Lcom/stripe/android/model/parsers/CustomerJsonParser;

    invoke-direct {v2}, Lcom/stripe/android/model/parsers/CustomerJsonParser;-><init>()V

    move-object v4, v2

    check-cast v4, Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    .line 636
    iput v3, v6, Lcom/stripe/android/networking/StripeApiRepository$setDefaultPaymentMethod$1;->label:I

    const/4 v5, 0x0

    const/4 v7, 0x4

    const/4 v8, 0x0

    move-object v2, p0

    move-object v3, v0

    invoke-static/range {v2 .. v8}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModelResult-BWLJW6A$default(Lcom/stripe/android/networking/StripeApiRepository;Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_4

    return-object v1

    :cond_4
    return-object v0
.end method

.method public sharePaymentDetails-yxL6bBk(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "*>;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p5

    instance-of v1, v0, Lcom/stripe/android/networking/StripeApiRepository$sharePaymentDetails$1;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lcom/stripe/android/networking/StripeApiRepository$sharePaymentDetails$1;

    iget v2, v1, Lcom/stripe/android/networking/StripeApiRepository$sharePaymentDetails$1;->label:I

    const/high16 v3, -0x80000000

    and-int/2addr v2, v3

    if-eqz v2, :cond_0

    iget v0, v1, Lcom/stripe/android/networking/StripeApiRepository$sharePaymentDetails$1;->label:I

    sub-int/2addr v0, v3

    iput v0, v1, Lcom/stripe/android/networking/StripeApiRepository$sharePaymentDetails$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/stripe/android/networking/StripeApiRepository$sharePaymentDetails$1;

    invoke-direct {v1, p0, v0}, Lcom/stripe/android/networking/StripeApiRepository$sharePaymentDetails$1;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v6, v1

    iget-object v0, v6, Lcom/stripe/android/networking/StripeApiRepository$sharePaymentDetails$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 1179
    iget v2, v6, Lcom/stripe/android/networking/StripeApiRepository$sharePaymentDetails$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v0, Lkotlin/Result;

    invoke-virtual {v0}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v0

    goto/16 :goto_2

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 1186
    iget-object v7, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 1187
    sget-object v0, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getSharePaymentDetailsUrl$payments_core_release()Ljava/lang/String;

    move-result-object v8

    const/4 v0, 0x4

    .line 1190
    new-array v0, v0, [Lkotlin/Pair;

    const-string v2, "request_surface"

    const-string v4, "android_payment_element"

    invoke-static {v2, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v4, 0x0

    aput-object v2, v0, v4

    .line 1192
    const-string v2, "consumer_session_client_secret"

    invoke-static {v2, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    .line 1191
    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    const-string v4, "credentials"

    invoke-static {v4, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v0, v3

    .line 1194
    const-string v2, "id"

    move-object/from16 v4, p2

    invoke-static {v2, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v4, 0x2

    aput-object v2, v0, v4

    const/4 v2, 0x3

    const/4 v4, 0x0

    .line 1195
    invoke-static {p0, v4, v3, v4}, Lcom/stripe/android/networking/StripeApiRepository;->buildPaymentUserAgentPair$default(Lcom/stripe/android/networking/StripeApiRepository;Ljava/util/Set;ILjava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v0, v2

    .line 1189
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    if-nez p3, :cond_3

    .line 1196
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v2

    goto :goto_1

    :cond_3
    move-object/from16 v2, p3

    :goto_1
    invoke-static {v0, v2}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v10

    const/16 v12, 0x8

    const/4 v13, 0x0

    const/4 v11, 0x0

    move-object/from16 v9, p4

    .line 1186
    invoke-static/range {v7 .. v13}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object v0

    .line 1198
    sget-object v2, Lcom/stripe/android/model/parsers/ConsumerPaymentDetailsShareJsonParser;->INSTANCE:Lcom/stripe/android/model/parsers/ConsumerPaymentDetailsShareJsonParser;

    move-object v4, v2

    check-cast v4, Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    .line 1185
    iput v3, v6, Lcom/stripe/android/networking/StripeApiRepository$sharePaymentDetails$1;->label:I

    const/4 v5, 0x0

    const/4 v7, 0x4

    const/4 v8, 0x0

    move-object v2, p0

    move-object v3, v0

    invoke-static/range {v2 .. v8}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModelResult-BWLJW6A$default(Lcom/stripe/android/networking/StripeApiRepository;Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_4

    return-object v1

    .line 1199
    :cond_4
    :goto_2
    invoke-static {v0}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    check-cast v0, Lcom/stripe/android/model/ConsumerPaymentDetailsShare;

    invoke-virtual {v0}, Lcom/stripe/android/model/ConsumerPaymentDetailsShare;->getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_5
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public start3ds2Auth-0E7RQCE(Lcom/stripe/android/model/Stripe3ds2AuthParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/Stripe3ds2AuthParams;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/Stripe3ds2AuthResult;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/stripe/android/networking/StripeApiRepository$start3ds2Auth$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/networking/StripeApiRepository$start3ds2Auth$1;

    iget v1, v0, Lcom/stripe/android/networking/StripeApiRepository$start3ds2Auth$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p3, v0, Lcom/stripe/android/networking/StripeApiRepository$start3ds2Auth$1;->label:I

    sub-int/2addr p3, v2

    iput p3, v0, Lcom/stripe/android/networking/StripeApiRepository$start3ds2Auth$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/networking/StripeApiRepository$start3ds2Auth$1;

    invoke-direct {v0, p0, p3}, Lcom/stripe/android/networking/StripeApiRepository$start3ds2Auth$1;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lcom/stripe/android/networking/StripeApiRepository$start3ds2Auth$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 1010
    iget v2, v0, Lcom/stripe/android/networking/StripeApiRepository$start3ds2Auth$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p3, Lkotlin/Result;

    invoke-virtual {p3}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 1016
    iget-object v4, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 1017
    sget-object p3, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    const-string v2, "3ds2/authenticate"

    invoke-static {p3, v2}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->access$getApiUrl(Lcom/stripe/android/networking/StripeApiRepository$Companion;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 1019
    invoke-virtual {p1}, Lcom/stripe/android/model/Stripe3ds2AuthParams;->toParamMap()Ljava/util/Map;

    move-result-object v7

    const/16 v9, 0x8

    const/4 v10, 0x0

    const/4 v8, 0x0

    move-object v6, p2

    .line 1016
    invoke-static/range {v4 .. v10}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    .line 1021
    new-instance p2, Lcom/stripe/android/model/parsers/Stripe3ds2AuthResultJsonParser;

    invoke-direct {p2}, Lcom/stripe/android/model/parsers/Stripe3ds2AuthResultJsonParser;-><init>()V

    check-cast p2, Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    .line 1015
    new-instance p3, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda7;

    invoke-direct {p3, p0}, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda7;-><init>(Lcom/stripe/android/networking/StripeApiRepository;)V

    iput v3, v0, Lcom/stripe/android/networking/StripeApiRepository$start3ds2Auth$1;->label:I

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModelResult-BWLJW6A(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method

.method public updateIssuingCardPin(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Throwable;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p6

    instance-of v1, v0, Lcom/stripe/android/networking/StripeApiRepository$updateIssuingCardPin$1;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lcom/stripe/android/networking/StripeApiRepository$updateIssuingCardPin$1;

    iget v2, v1, Lcom/stripe/android/networking/StripeApiRepository$updateIssuingCardPin$1;->label:I

    const/high16 v3, -0x80000000

    and-int/2addr v2, v3

    if-eqz v2, :cond_0

    iget v0, v1, Lcom/stripe/android/networking/StripeApiRepository$updateIssuingCardPin$1;->label:I

    sub-int/2addr v0, v3

    iput v0, v1, Lcom/stripe/android/networking/StripeApiRepository$updateIssuingCardPin$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/stripe/android/networking/StripeApiRepository$updateIssuingCardPin$1;

    invoke-direct {v1, p0, v0}, Lcom/stripe/android/networking/StripeApiRepository$updateIssuingCardPin$1;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object v0, v1, Lcom/stripe/android/networking/StripeApiRepository$updateIssuingCardPin$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    .line 953
    iget v3, v1, Lcom/stripe/android/networking/StripeApiRepository$updateIssuingCardPin$1;->label:I

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v4, :cond_1

    :try_start_0
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 960
    :try_start_1
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, p0

    check-cast v0, Lcom/stripe/android/networking/StripeApiRepository;

    .line 962
    iget-object v5, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 963
    sget-object v0, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    invoke-virtual {v0, p1}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getIssuingCardPinUrl$payments_core_release(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const/4 p1, 0x2

    .line 966
    new-array p1, p1, [Lkotlin/Pair;

    const-string v3, "verification"

    move-object/from16 v7, p4

    invoke-static {v0, p3, v7}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->access$createVerificationParam(Lcom/stripe/android/networking/StripeApiRepository$Companion;Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p3

    invoke-static {v3, p3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p3

    const/4 v0, 0x0

    aput-object p3, p1, v0

    .line 967
    const-string p3, "pin"

    invoke-static {p3, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p2

    aput-object p2, p1, v4

    .line 965
    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v8

    const/16 v10, 0x8

    const/4 v11, 0x0

    const/4 v9, 0x0

    move-object/from16 v7, p5

    .line 962
    invoke-static/range {v5 .. v11}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    .line 961
    new-instance p2, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda36;

    invoke-direct {p2, p0}, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda36;-><init>(Lcom/stripe/android/networking/StripeApiRepository;)V

    iput v4, v1, Lcom/stripe/android/networking/StripeApiRepository$updateIssuingCardPin$1;->label:I

    invoke-virtual {p0, p1, p2, v1}, Lcom/stripe/android/networking/StripeApiRepository;->makeApiRequest$payments_core_release(Lcom/stripe/android/core/networking/ApiRequest;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_3

    return-object v2

    .line 953
    :cond_3
    :goto_1
    check-cast v0, Lcom/stripe/android/core/networking/StripeResponse;

    .line 960
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    move-object p1, v0

    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 972
    :goto_2
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    return-object p1
.end method

.method public updatePaymentDetails-BWLJW6A(Ljava/lang/String;Lcom/stripe/android/model/ConsumerPaymentDetailsUpdateParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/model/ConsumerPaymentDetailsUpdateParams;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/ConsumerPaymentDetails;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p4

    instance-of v1, v0, Lcom/stripe/android/networking/StripeApiRepository$updatePaymentDetails$1;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lcom/stripe/android/networking/StripeApiRepository$updatePaymentDetails$1;

    iget v2, v1, Lcom/stripe/android/networking/StripeApiRepository$updatePaymentDetails$1;->label:I

    const/high16 v3, -0x80000000

    and-int/2addr v2, v3

    if-eqz v2, :cond_0

    iget v0, v1, Lcom/stripe/android/networking/StripeApiRepository$updatePaymentDetails$1;->label:I

    sub-int/2addr v0, v3

    iput v0, v1, Lcom/stripe/android/networking/StripeApiRepository$updatePaymentDetails$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/stripe/android/networking/StripeApiRepository$updatePaymentDetails$1;

    invoke-direct {v1, p0, v0}, Lcom/stripe/android/networking/StripeApiRepository$updatePaymentDetails$1;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v6, v1

    iget-object v0, v6, Lcom/stripe/android/networking/StripeApiRepository$updatePaymentDetails$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 1619
    iget v2, v6, Lcom/stripe/android/networking/StripeApiRepository$updatePaymentDetails$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v0, Lkotlin/Result;

    invoke-virtual {v0}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 1625
    iget-object v7, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 1626
    sget-object v0, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    invoke-virtual/range {p2 .. p2}, Lcom/stripe/android/model/ConsumerPaymentDetailsUpdateParams;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getConsumerPaymentDetailsUrl$payments_core_release(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const/4 v0, 0x2

    .line 1629
    new-array v0, v0, [Lkotlin/Pair;

    const-string v2, "request_surface"

    const-string v4, "android_payment_element"

    invoke-static {v2, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v4, 0x0

    aput-object v2, v0, v4

    .line 1631
    const-string v2, "consumer_session_client_secret"

    invoke-static {v2, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    .line 1630
    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    const-string v4, "credentials"

    invoke-static {v4, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v0, v3

    .line 1628
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    .line 1634
    invoke-virtual/range {p2 .. p2}, Lcom/stripe/android/model/ConsumerPaymentDetailsUpdateParams;->toParamMap()Ljava/util/Map;

    move-result-object v2

    .line 1633
    invoke-static {v0, v2}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v10

    const/16 v12, 0x8

    const/4 v13, 0x0

    const/4 v11, 0x0

    move-object/from16 v9, p3

    .line 1625
    invoke-static/range {v7 .. v13}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object v0

    .line 1637
    sget-object v2, Lcom/stripe/android/model/parsers/ConsumerPaymentDetailsJsonParser;->INSTANCE:Lcom/stripe/android/model/parsers/ConsumerPaymentDetailsJsonParser;

    move-object v4, v2

    check-cast v4, Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    .line 1624
    iput v3, v6, Lcom/stripe/android/networking/StripeApiRepository$updatePaymentDetails$1;->label:I

    const/4 v5, 0x0

    const/4 v7, 0x4

    const/4 v8, 0x0

    move-object v2, p0

    move-object v3, v0

    invoke-static/range {v2 .. v8}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModelResult-BWLJW6A$default(Lcom/stripe/android/networking/StripeApiRepository;Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    return-object v0
.end method

.method public updatePaymentMethod-BWLJW6A(Ljava/lang/String;Lcom/stripe/android/model/PaymentMethodUpdateParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/model/PaymentMethodUpdateParams;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lcom/stripe/android/networking/StripeApiRepository$updatePaymentMethod$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/stripe/android/networking/StripeApiRepository$updatePaymentMethod$1;

    iget v1, v0, Lcom/stripe/android/networking/StripeApiRepository$updatePaymentMethod$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p4, v0, Lcom/stripe/android/networking/StripeApiRepository$updatePaymentMethod$1;->label:I

    sub-int/2addr p4, v2

    iput p4, v0, Lcom/stripe/android/networking/StripeApiRepository$updatePaymentMethod$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/networking/StripeApiRepository$updatePaymentMethod$1;

    invoke-direct {v0, p0, p4}, Lcom/stripe/android/networking/StripeApiRepository$updatePaymentMethod$1;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p4, v0, Lcom/stripe/android/networking/StripeApiRepository$updatePaymentMethod$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 607
    iget v2, v0, Lcom/stripe/android/networking/StripeApiRepository$updatePaymentMethod$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p4, Lkotlin/Result;

    invoke-virtual {p4}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 612
    invoke-direct {p0}, Lcom/stripe/android/networking/StripeApiRepository;->fireFraudDetectionDataRequest()V

    .line 615
    iget-object v4, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 616
    sget-object p4, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    invoke-virtual {p4, p1}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getPaymentMethodUrl$payments_core_release(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 618
    invoke-virtual {p2}, Lcom/stripe/android/model/PaymentMethodUpdateParams;->toParamMap()Ljava/util/Map;

    move-result-object v7

    const/16 v9, 0x8

    const/4 v10, 0x0

    const/4 v8, 0x0

    move-object v6, p3

    .line 615
    invoke-static/range {v4 .. v10}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    .line 620
    new-instance p3, Lcom/stripe/android/model/parsers/PaymentMethodJsonParser;

    invoke-direct {p3}, Lcom/stripe/android/model/parsers/PaymentMethodJsonParser;-><init>()V

    check-cast p3, Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    .line 614
    new-instance p4, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda20;

    invoke-direct {p4, p0, p2}, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda20;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lcom/stripe/android/model/PaymentMethodUpdateParams;)V

    iput v3, v0, Lcom/stripe/android/networking/StripeApiRepository$updatePaymentMethod$1;->label:I

    invoke-direct {p0, p1, p3, p4, v0}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModelResult-BWLJW6A(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method

.method public verifyPaymentIntentWithMicrodeposits-BWLJW6A(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/PaymentIntent;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lcom/stripe/android/networking/StripeApiRepository$verifyPaymentIntentWithMicrodeposits$3;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/stripe/android/networking/StripeApiRepository$verifyPaymentIntentWithMicrodeposits$3;

    iget v1, v0, Lcom/stripe/android/networking/StripeApiRepository$verifyPaymentIntentWithMicrodeposits$3;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p4, v0, Lcom/stripe/android/networking/StripeApiRepository$verifyPaymentIntentWithMicrodeposits$3;->label:I

    sub-int/2addr p4, v2

    iput p4, v0, Lcom/stripe/android/networking/StripeApiRepository$verifyPaymentIntentWithMicrodeposits$3;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/networking/StripeApiRepository$verifyPaymentIntentWithMicrodeposits$3;

    invoke-direct {v0, p0, p4}, Lcom/stripe/android/networking/StripeApiRepository$verifyPaymentIntentWithMicrodeposits$3;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object p4, v0

    iget-object v0, p4, Lcom/stripe/android/networking/StripeApiRepository$verifyPaymentIntentWithMicrodeposits$3;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 1375
    iget v2, p4, Lcom/stripe/android/networking/StripeApiRepository$verifyPaymentIntentWithMicrodeposits$3;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v0, Lkotlin/Result;

    invoke-virtual {v0}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 1380
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, p0

    check-cast v0, Lcom/stripe/android/networking/StripeApiRepository;

    .line 1381
    new-instance v0, Lcom/stripe/android/model/PaymentIntent$ClientSecret;

    invoke-direct {v0, p1}, Lcom/stripe/android/model/PaymentIntent$ClientSecret;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/stripe/android/model/PaymentIntent$ClientSecret;->getPaymentIntentId$payments_core_release()Ljava/lang/String;

    move-result-object v0

    .line 1380
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 1382
    :goto_1
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-nez v2, :cond_4

    check-cast v0, Ljava/lang/String;

    .line 1387
    iget-object v4, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 1388
    sget-object v2, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    invoke-virtual {v2, v0}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getVerifyMicrodepositsOnPaymentIntentUrl$payments_core_release(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const/4 v0, 0x2

    .line 1391
    new-array v0, v0, [Lkotlin/Pair;

    const-string v2, "client_secret"

    invoke-static {v2, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v0, v2

    .line 1392
    const-string p1, "descriptor_code"

    invoke-static {p1, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    aput-object p1, v0, v3

    .line 1390
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v7

    const/16 v9, 0x8

    const/4 v10, 0x0

    const/4 v8, 0x0

    move-object v6, p3

    .line 1387
    invoke-static/range {v4 .. v10}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    .line 1395
    new-instance p2, Lcom/stripe/android/model/parsers/PaymentIntentJsonParser;

    invoke-direct {p2}, Lcom/stripe/android/model/parsers/PaymentIntentJsonParser;-><init>()V

    check-cast p2, Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    new-instance p3, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda28;

    invoke-direct {p3}, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda28;-><init>()V

    .line 1386
    iput v3, p4, Lcom/stripe/android/networking/StripeApiRepository$verifyPaymentIntentWithMicrodeposits$3;->label:I

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModelResult-BWLJW6A(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1

    .line 1383
    :cond_4
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v2}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public verifyPaymentIntentWithMicrodeposits-yxL6bBk(Ljava/lang/String;IILcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "II",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/PaymentIntent;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p5

    instance-of v1, v0, Lcom/stripe/android/networking/StripeApiRepository$verifyPaymentIntentWithMicrodeposits$1;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lcom/stripe/android/networking/StripeApiRepository$verifyPaymentIntentWithMicrodeposits$1;

    iget v2, v1, Lcom/stripe/android/networking/StripeApiRepository$verifyPaymentIntentWithMicrodeposits$1;->label:I

    const/high16 v3, -0x80000000

    and-int/2addr v2, v3

    if-eqz v2, :cond_0

    iget v0, v1, Lcom/stripe/android/networking/StripeApiRepository$verifyPaymentIntentWithMicrodeposits$1;->label:I

    sub-int/2addr v0, v3

    iput v0, v1, Lcom/stripe/android/networking/StripeApiRepository$verifyPaymentIntentWithMicrodeposits$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/stripe/android/networking/StripeApiRepository$verifyPaymentIntentWithMicrodeposits$1;

    invoke-direct {v1, p0, v0}, Lcom/stripe/android/networking/StripeApiRepository$verifyPaymentIntentWithMicrodeposits$1;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object v0, v1, Lcom/stripe/android/networking/StripeApiRepository$verifyPaymentIntentWithMicrodeposits$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    .line 1345
    iget v3, v1, Lcom/stripe/android/networking/StripeApiRepository$verifyPaymentIntentWithMicrodeposits$1;->label:I

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v4, :cond_1

    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v0, Lkotlin/Result;

    invoke-virtual {v0}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 1351
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, p0

    check-cast v0, Lcom/stripe/android/networking/StripeApiRepository;

    .line 1352
    new-instance v0, Lcom/stripe/android/model/PaymentIntent$ClientSecret;

    invoke-direct {v0, p1}, Lcom/stripe/android/model/PaymentIntent$ClientSecret;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/stripe/android/model/PaymentIntent$ClientSecret;->getPaymentIntentId$payments_core_release()Ljava/lang/String;

    move-result-object v0

    .line 1351
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    sget-object v3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 1353
    :goto_1
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v3

    if-nez v3, :cond_4

    check-cast v0, Ljava/lang/String;

    .line 1358
    iget-object v5, p0, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 1359
    sget-object v3, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    invoke-virtual {v3, v0}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getVerifyMicrodepositsOnPaymentIntentUrl$payments_core_release(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const/4 v0, 0x2

    .line 1362
    new-array v3, v0, [Lkotlin/Pair;

    const-string v7, "client_secret"

    invoke-static {v7, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 v7, 0x0

    aput-object p1, v3, v7

    .line 1363
    new-array p1, v0, [Ljava/lang/Integer;

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, p1, v7

    invoke-static {p3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, p1, v4

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    const-string p2, "amounts"

    invoke-static {p2, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    aput-object p1, v3, v4

    .line 1361
    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v8

    const/16 v10, 0x8

    const/4 v11, 0x0

    const/4 v9, 0x0

    move-object/from16 v7, p4

    .line 1358
    invoke-static/range {v5 .. v11}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    .line 1366
    new-instance p2, Lcom/stripe/android/model/parsers/PaymentIntentJsonParser;

    invoke-direct {p2}, Lcom/stripe/android/model/parsers/PaymentIntentJsonParser;-><init>()V

    check-cast p2, Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    new-instance v0, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda12;

    invoke-direct {v0}, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda12;-><init>()V

    .line 1357
    iput v4, v1, Lcom/stripe/android/networking/StripeApiRepository$verifyPaymentIntentWithMicrodeposits$1;->label:I

    invoke-direct {p0, p1, p2, v0, v1}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModelResult-BWLJW6A(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_3

    return-object v2

    :cond_3
    return-object p1

    .line 1354
    :cond_4
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v3}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public verifySetupIntentWithMicrodeposits-BWLJW6A(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/SetupIntent;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v0, p4

    instance-of v3, v0, Lcom/stripe/android/networking/StripeApiRepository$verifySetupIntentWithMicrodeposits$2;

    if-eqz v3, :cond_0

    move-object v3, v0

    check-cast v3, Lcom/stripe/android/networking/StripeApiRepository$verifySetupIntentWithMicrodeposits$2;

    iget v4, v3, Lcom/stripe/android/networking/StripeApiRepository$verifySetupIntentWithMicrodeposits$2;->label:I

    const/high16 v5, -0x80000000

    and-int/2addr v4, v5

    if-eqz v4, :cond_0

    iget v0, v3, Lcom/stripe/android/networking/StripeApiRepository$verifySetupIntentWithMicrodeposits$2;->label:I

    sub-int/2addr v0, v5

    iput v0, v3, Lcom/stripe/android/networking/StripeApiRepository$verifySetupIntentWithMicrodeposits$2;->label:I

    goto :goto_0

    :cond_0
    new-instance v3, Lcom/stripe/android/networking/StripeApiRepository$verifySetupIntentWithMicrodeposits$2;

    invoke-direct {v3, v1, v0}, Lcom/stripe/android/networking/StripeApiRepository$verifySetupIntentWithMicrodeposits$2;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v5, v3

    iget-object v0, v5, Lcom/stripe/android/networking/StripeApiRepository$verifySetupIntentWithMicrodeposits$2;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v8

    .line 1432
    iget v3, v5, Lcom/stripe/android/networking/StripeApiRepository$verifySetupIntentWithMicrodeposits$2;->label:I

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v4, :cond_1

    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v0, Lkotlin/Result;

    invoke-virtual {v0}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 1437
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, v1

    check-cast v0, Lcom/stripe/android/networking/StripeApiRepository;

    .line 1438
    new-instance v0, Lcom/stripe/android/model/SetupIntent$ClientSecret;

    invoke-direct {v0, v2}, Lcom/stripe/android/model/SetupIntent$ClientSecret;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/stripe/android/model/SetupIntent$ClientSecret;->getSetupIntentId$payments_core_release()Ljava/lang/String;

    move-result-object v0

    .line 1437
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    sget-object v3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 1439
    :goto_1
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v3

    if-nez v3, :cond_4

    check-cast v0, Ljava/lang/String;

    .line 1444
    iget-object v9, v1, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 1445
    sget-object v3, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    invoke-virtual {v3, v0}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getVerifyMicrodepositsOnSetupIntentUrl$payments_core_release(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const/4 v0, 0x2

    .line 1448
    new-array v0, v0, [Lkotlin/Pair;

    const-string v3, "client_secret"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v0, v3

    .line 1449
    const-string v2, "descriptor_code"

    move-object/from16 v3, p2

    invoke-static {v2, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v0, v4

    .line 1447
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v12

    const/16 v14, 0x8

    const/4 v15, 0x0

    const/4 v13, 0x0

    move-object/from16 v11, p3

    .line 1444
    invoke-static/range {v9 .. v15}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object v2

    .line 1452
    new-instance v0, Lcom/stripe/android/model/parsers/SetupIntentJsonParser;

    invoke-direct {v0}, Lcom/stripe/android/model/parsers/SetupIntentJsonParser;-><init>()V

    move-object v3, v0

    check-cast v3, Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    .line 1443
    iput v4, v5, Lcom/stripe/android/networking/StripeApiRepository$verifySetupIntentWithMicrodeposits$2;->label:I

    const/4 v4, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    invoke-static/range {v1 .. v7}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModelResult-BWLJW6A$default(Lcom/stripe/android/networking/StripeApiRepository;Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_3

    return-object v8

    :cond_3
    return-object v0

    .line 1440
    :cond_4
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v3}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public verifySetupIntentWithMicrodeposits-yxL6bBk(Ljava/lang/String;IILcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "II",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/SetupIntent;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v0, p5

    instance-of v3, v0, Lcom/stripe/android/networking/StripeApiRepository$verifySetupIntentWithMicrodeposits$1;

    if-eqz v3, :cond_0

    move-object v3, v0

    check-cast v3, Lcom/stripe/android/networking/StripeApiRepository$verifySetupIntentWithMicrodeposits$1;

    iget v4, v3, Lcom/stripe/android/networking/StripeApiRepository$verifySetupIntentWithMicrodeposits$1;->label:I

    const/high16 v5, -0x80000000

    and-int/2addr v4, v5

    if-eqz v4, :cond_0

    iget v0, v3, Lcom/stripe/android/networking/StripeApiRepository$verifySetupIntentWithMicrodeposits$1;->label:I

    sub-int/2addr v0, v5

    iput v0, v3, Lcom/stripe/android/networking/StripeApiRepository$verifySetupIntentWithMicrodeposits$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v3, Lcom/stripe/android/networking/StripeApiRepository$verifySetupIntentWithMicrodeposits$1;

    invoke-direct {v3, v1, v0}, Lcom/stripe/android/networking/StripeApiRepository$verifySetupIntentWithMicrodeposits$1;-><init>(Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v5, v3

    iget-object v0, v5, Lcom/stripe/android/networking/StripeApiRepository$verifySetupIntentWithMicrodeposits$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v8

    .line 1404
    iget v3, v5, Lcom/stripe/android/networking/StripeApiRepository$verifySetupIntentWithMicrodeposits$1;->label:I

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v4, :cond_1

    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v0, Lkotlin/Result;

    invoke-virtual {v0}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 1410
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, v1

    check-cast v0, Lcom/stripe/android/networking/StripeApiRepository;

    .line 1411
    new-instance v0, Lcom/stripe/android/model/SetupIntent$ClientSecret;

    invoke-direct {v0, v2}, Lcom/stripe/android/model/SetupIntent$ClientSecret;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/stripe/android/model/SetupIntent$ClientSecret;->getSetupIntentId$payments_core_release()Ljava/lang/String;

    move-result-object v0

    .line 1410
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    sget-object v3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 1412
    :goto_1
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v3

    if-nez v3, :cond_4

    check-cast v0, Ljava/lang/String;

    .line 1417
    iget-object v9, v1, Lcom/stripe/android/networking/StripeApiRepository;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 1418
    sget-object v3, Lcom/stripe/android/networking/StripeApiRepository;->Companion:Lcom/stripe/android/networking/StripeApiRepository$Companion;

    invoke-virtual {v3, v0}, Lcom/stripe/android/networking/StripeApiRepository$Companion;->getVerifyMicrodepositsOnSetupIntentUrl$payments_core_release(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const/4 v0, 0x2

    .line 1421
    new-array v3, v0, [Lkotlin/Pair;

    const-string v6, "client_secret"

    invoke-static {v6, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v6, 0x0

    aput-object v2, v3, v6

    .line 1422
    new-array v0, v0, [Ljava/lang/Integer;

    invoke-static/range {p2 .. p2}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v6

    invoke-static/range {p3 .. p3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v4

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    const-string v2, "amounts"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    aput-object v0, v3, v4

    .line 1420
    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v12

    const/16 v14, 0x8

    const/4 v15, 0x0

    const/4 v13, 0x0

    move-object/from16 v11, p4

    .line 1417
    invoke-static/range {v9 .. v15}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object v2

    .line 1425
    new-instance v0, Lcom/stripe/android/model/parsers/SetupIntentJsonParser;

    invoke-direct {v0}, Lcom/stripe/android/model/parsers/SetupIntentJsonParser;-><init>()V

    move-object v3, v0

    check-cast v3, Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    .line 1416
    iput v4, v5, Lcom/stripe/android/networking/StripeApiRepository$verifySetupIntentWithMicrodeposits$1;->label:I

    const/4 v4, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    invoke-static/range {v1 .. v7}, Lcom/stripe/android/networking/StripeApiRepository;->fetchStripeModelResult-BWLJW6A$default(Lcom/stripe/android/networking/StripeApiRepository;Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_3

    return-object v8

    :cond_3
    return-object v0

    .line 1413
    :cond_4
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v3}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
