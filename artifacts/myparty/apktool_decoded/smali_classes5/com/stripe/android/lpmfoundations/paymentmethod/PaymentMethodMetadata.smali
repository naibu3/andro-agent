.class public final Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;
.super Ljava/lang/Object;
.source "PaymentMethodMetadata.kt"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPaymentMethodMetadata.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodMetadata.kt\ncom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,431:1\n1557#2:432\n1628#2,3:433\n1053#2:436\n774#2:437\n865#2,2:438\n1557#2:440\n1628#2,3:441\n295#2,2:444\n1611#2,9:446\n1863#2:455\n1864#2:457\n1620#2:458\n1567#2:459\n1598#2,4:460\n1557#2:464\n1628#2,3:465\n1557#2:468\n1628#2,3:469\n295#2,2:472\n295#2,2:474\n1611#2,9:476\n1863#2:485\n1864#2:487\n1620#2:488\n774#2:489\n865#2,2:490\n774#2:492\n865#2,2:493\n827#2:495\n855#2,2:496\n774#2:498\n865#2,2:499\n295#2,2:501\n295#2,2:503\n1#3:456\n1#3:486\n*S KotlinDebug\n*F\n+ 1 PaymentMethodMetadata.kt\ncom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata\n*L\n90#1:432\n90#1:433,3\n98#1:436\n106#1:437\n106#1:438,2\n108#1:440\n108#1:441,3\n127#1:444,2\n133#1:446,9\n133#1:455\n133#1:457\n133#1:458\n157#1:459\n157#1:460,4\n163#1:464\n163#1:465,3\n167#1:468\n167#1:469,3\n179#1:472,2\n187#1:474,2\n192#1:476,9\n192#1:485\n192#1:487\n192#1:488\n194#1:489\n194#1:490,2\n198#1:492\n198#1:493,2\n204#1:495\n204#1:496,2\n207#1:498\n207#1:499,2\n237#1:501,2\n263#1:503,2\n133#1:456\n192#1:486\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0082\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008/\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001e\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0081\u0008\u0018\u0000 \u00ac\u00012\u00020\u0001:\u0002\u00ac\u0001B\u0091\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b\u0012\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u000b\u0012\u000c\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u000b\u0012\u000c\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u000b\u0012\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u0007\u0012\u0006\u0010\u001f\u001a\u00020 \u0012\u0006\u0010!\u001a\u00020\"\u0012\u0008\u0010#\u001a\u0004\u0018\u00010$\u0012\u0008\u0010%\u001a\u0004\u0018\u00010&\u0012\u0008\u0010\'\u001a\u0004\u0018\u00010(\u0012\u0008\u0010)\u001a\u0004\u0018\u00010*\u0012\u0006\u0010+\u001a\u00020,\u0012\u0006\u0010-\u001a\u00020\u000e\u0012\u0008\u0010.\u001a\u0004\u0018\u00010/\u0012\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020301\u00a2\u0006\u0004\u00084\u00105J\u0012\u0010a\u001a\u00020\u00072\n\u0010b\u001a\u00060\u000ej\u0002`cJ\u000e\u0010d\u001a\u00020\u00072\u0006\u0010e\u001a\u000202J\u000e\u0010f\u001a\u00020\u00072\u0006\u0010g\u001a\u00020\u000eJ\u000c\u0010h\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u000bJ\u000c\u0010i\u001a\u0008\u0012\u0004\u0012\u0002020\u000bJ\u0010\u0010j\u001a\u0004\u0018\u00010k2\u0006\u0010b\u001a\u00020\u000eJ\u000c\u0010l\u001a\u0008\u0012\u0004\u0012\u00020k0\u000bJ\u000e\u0010m\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u000bH\u0002J\u001e\u0010n\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020o01*\u0008\u0012\u0004\u0012\u00020\u000e0\u000bH\u0002J\u000e\u0010p\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u000bH\u0002J\u000e\u0010q\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u000bH\u0002J\u000e\u0010r\u001a\u00020\u00072\u0006\u0010b\u001a\u00020\u000eJ\u000e\u0010s\u001a\u00020\u00072\u0006\u0010b\u001a\u00020\u000eJ\u0012\u0010t\u001a\u0004\u0018\u00010u2\u0006\u0010b\u001a\u00020\u000eH\u0002J\u0012\u0010v\u001a\u0004\u0018\u00010u2\u0006\u0010b\u001a\u00020\u000eH\u0002J\u000e\u0010w\u001a\u0008\u0012\u0004\u0012\u00020x0\u000bH\u0002J\u0008\u0010y\u001a\u0004\u0018\u00010zJ\u0018\u0010{\u001a\u0004\u0018\u00010|2\u0006\u0010b\u001a\u00020\u000e2\u0006\u0010}\u001a\u00020\u0007J \u0010~\u001a\n\u0012\u0004\u0012\u00020\u007f\u0018\u00010\u000b2\u0006\u0010b\u001a\u00020\u000e2\u0008\u0010\u0080\u0001\u001a\u00030\u0081\u0001J\u001e\u0010\u0082\u0001\u001a\u00030\u0083\u00012\u0008\u0010\u0084\u0001\u001a\u00030\u0085\u00012\n\u0010b\u001a\u00060\u000ej\u0002`cJ\n\u0010\u0086\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0087\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u0088\u0001\u001a\u00020\u0007H\u00c6\u0003J\n\u0010\u0089\u0001\u001a\u00020\u0007H\u00c6\u0003J\n\u0010\u008a\u0001\u001a\u00020\u0007H\u00c6\u0003J\u0010\u0010\u008b\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000bH\u00c6\u0003J\u0010\u0010\u008c\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u000bH\u00c6\u0003J\n\u0010\u008d\u0001\u001a\u00020\u0010H\u00c6\u0003J\n\u0010\u008e\u0001\u001a\u00020\u000eH\u00c6\u0003J\u000c\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003J\u000c\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0015H\u00c6\u0003J\u0010\u0010\u0091\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u000bH\u00c6\u0003J\u0010\u0010\u0092\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u000bH\u00c6\u0003J\u0010\u0010\u0093\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u000bH\u00c6\u0003J\u000c\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u001dH\u00c6\u0003J\n\u0010\u0095\u0001\u001a\u00020\u0007H\u00c6\u0003J\n\u0010\u0096\u0001\u001a\u00020 H\u00c6\u0003J\n\u0010\u0097\u0001\u001a\u00020\"H\u00c6\u0003J\u000c\u0010\u0098\u0001\u001a\u0004\u0018\u00010$H\u00c6\u0003J\u000c\u0010\u0099\u0001\u001a\u0004\u0018\u00010&H\u00c6\u0003J\u000c\u0010\u009a\u0001\u001a\u0004\u0018\u00010(H\u00c6\u0003J\u000c\u0010\u009b\u0001\u001a\u0004\u0018\u00010*H\u00c6\u0003J\n\u0010\u009c\u0001\u001a\u00020,H\u00c6\u0003J\n\u0010\u009d\u0001\u001a\u00020\u000eH\u00c6\u0003J\u000c\u0010\u009e\u0001\u001a\u0004\u0018\u00010/H\u00c6\u0003J\u0016\u0010\u009f\u0001\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020301H\u00c6\u0003J\u00c8\u0002\u0010\u00a0\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\u00072\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b2\u000e\u0008\u0002\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u000b2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u000e2\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u000e\u0008\u0002\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u000b2\u000e\u0008\u0002\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u000b2\u000e\u0008\u0002\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u000b2\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u001f\u001a\u00020 2\u0008\u0008\u0002\u0010!\u001a\u00020\"2\n\u0008\u0002\u0010#\u001a\u0004\u0018\u00010$2\n\u0008\u0002\u0010%\u001a\u0004\u0018\u00010&2\n\u0008\u0002\u0010\'\u001a\u0004\u0018\u00010(2\n\u0008\u0002\u0010)\u001a\u0004\u0018\u00010*2\u0008\u0008\u0002\u0010+\u001a\u00020,2\u0008\u0008\u0002\u0010-\u001a\u00020\u000e2\n\u0008\u0002\u0010.\u001a\u0004\u0018\u00010/2\u0014\u0008\u0002\u00100\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020301H\u00c6\u0001J\u0007\u0010\u00a1\u0001\u001a\u00020oJ\u0016\u0010\u00a2\u0001\u001a\u00020\u00072\n\u0010\u00a3\u0001\u001a\u0005\u0018\u00010\u00a4\u0001H\u00d6\u0003J\n\u0010\u00a5\u0001\u001a\u00020oH\u00d6\u0001J\n\u0010\u00a6\u0001\u001a\u00020\u000eH\u00d6\u0001J\u001b\u0010\u00a7\u0001\u001a\u00030\u00a8\u00012\u0008\u0010\u00a9\u0001\u001a\u00030\u00aa\u00012\u0007\u0010\u00ab\u0001\u001a\u00020oR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00086\u00107R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00088\u00109R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008:\u0010;R\u0011\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008<\u0010;R\u0011\u0010\t\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008=\u0010;R\u0017\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008>\u0010?R\u0017\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008@\u0010?R\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008A\u0010BR\u0011\u0010\u0011\u001a\u00020\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008C\u0010DR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008E\u0010FR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008G\u0010HR\u0017\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008I\u0010?R\u0017\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008J\u0010?R\u0017\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008K\u0010?R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008L\u0010MR\u0011\u0010\u001e\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010;R\u0011\u0010\u001f\u001a\u00020 \u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008N\u0010OR\u0011\u0010!\u001a\u00020\"\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008P\u0010QR\u0013\u0010#\u001a\u0004\u0018\u00010$\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008R\u0010SR\u0013\u0010%\u001a\u0004\u0018\u00010&\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008T\u0010UR\u0013\u0010\'\u001a\u0004\u0018\u00010(\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008V\u0010WR\u0013\u0010)\u001a\u0004\u0018\u00010*\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008X\u0010YR\u0011\u0010+\u001a\u00020,\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008Z\u0010[R\u0011\u0010-\u001a\u00020\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\\\u0010DR\u0013\u0010.\u001a\u0004\u0018\u00010/\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008]\u0010^R\u001d\u00100\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020301\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008_\u0010`\u00a8\u0006\u00ad\u0001"
    }
    d2 = {
        "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;",
        "Landroid/os/Parcelable;",
        "stripeIntent",
        "Lcom/stripe/android/model/StripeIntent;",
        "billingDetailsCollectionConfiguration",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;",
        "allowsDelayedPaymentMethods",
        "",
        "allowsPaymentMethodsRequiringShippingAddress",
        "allowsLinkInSavedPaymentMethods",
        "availableWallets",
        "",
        "Lcom/stripe/android/lpmfoundations/paymentmethod/WalletType;",
        "paymentMethodOrder",
        "",
        "cbcEligibility",
        "Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;",
        "merchantName",
        "defaultBillingDetails",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;",
        "shippingDetails",
        "Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;",
        "sharedDataSpecs",
        "Lcom/stripe/android/ui/core/elements/SharedDataSpec;",
        "displayableCustomPaymentMethods",
        "Lcom/stripe/android/lpmfoundations/paymentmethod/DisplayableCustomPaymentMethod;",
        "externalPaymentMethodSpecs",
        "Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodSpec;",
        "customerMetadata",
        "Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;",
        "isGooglePayReady",
        "linkConfiguration",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;",
        "paymentMethodSaveConsentBehavior",
        "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;",
        "linkMode",
        "Lcom/stripe/android/model/LinkMode;",
        "linkState",
        "Lcom/stripe/android/paymentsheet/state/LinkState;",
        "paymentMethodIncentive",
        "Lcom/stripe/android/paymentsheet/model/PaymentMethodIncentive;",
        "financialConnectionsAvailability",
        "Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;",
        "cardBrandFilter",
        "Lcom/stripe/android/CardBrandFilter;",
        "elementsSessionId",
        "shopPayConfiguration",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;",
        "termsDisplay",
        "",
        "Lcom/stripe/android/model/PaymentMethod$Type;",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$TermsDisplay;",
        "<init>",
        "(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;ZZZLjava/util/List;Ljava/util/List;Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;ZLcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;Lcom/stripe/android/model/LinkMode;Lcom/stripe/android/paymentsheet/state/LinkState;Lcom/stripe/android/paymentsheet/model/PaymentMethodIncentive;Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;Lcom/stripe/android/CardBrandFilter;Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;Ljava/util/Map;)V",
        "getStripeIntent",
        "()Lcom/stripe/android/model/StripeIntent;",
        "getBillingDetailsCollectionConfiguration",
        "()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;",
        "getAllowsDelayedPaymentMethods",
        "()Z",
        "getAllowsPaymentMethodsRequiringShippingAddress",
        "getAllowsLinkInSavedPaymentMethods",
        "getAvailableWallets",
        "()Ljava/util/List;",
        "getPaymentMethodOrder",
        "getCbcEligibility",
        "()Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;",
        "getMerchantName",
        "()Ljava/lang/String;",
        "getDefaultBillingDetails",
        "()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;",
        "getShippingDetails",
        "()Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;",
        "getSharedDataSpecs",
        "getDisplayableCustomPaymentMethods",
        "getExternalPaymentMethodSpecs",
        "getCustomerMetadata",
        "()Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;",
        "getLinkConfiguration",
        "()Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;",
        "getPaymentMethodSaveConsentBehavior",
        "()Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;",
        "getLinkMode",
        "()Lcom/stripe/android/model/LinkMode;",
        "getLinkState",
        "()Lcom/stripe/android/paymentsheet/state/LinkState;",
        "getPaymentMethodIncentive",
        "()Lcom/stripe/android/paymentsheet/model/PaymentMethodIncentive;",
        "getFinancialConnectionsAvailability",
        "()Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;",
        "getCardBrandFilter",
        "()Lcom/stripe/android/CardBrandFilter;",
        "getElementsSessionId",
        "getShopPayConfiguration",
        "()Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;",
        "getTermsDisplay",
        "()Ljava/util/Map;",
        "hasIntentToSetup",
        "code",
        "Lcom/stripe/android/model/PaymentMethodCode;",
        "mandateAllowed",
        "paymentMethodType",
        "requiresMandate",
        "paymentMethodCode",
        "supportedPaymentMethodTypes",
        "supportedSavedPaymentMethodTypes",
        "supportedPaymentMethodForCode",
        "Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;",
        "sortedSupportedPaymentMethods",
        "orderedPaymentMethodTypes",
        "mapOrderToIndex",
        "",
        "externalPaymentMethodTypes",
        "customPaymentMethodIds",
        "isExternalPaymentMethod",
        "isCustomPaymentMethod",
        "getUiDefinitionFactoryForCustomPaymentMethod",
        "Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Simple;",
        "getUiDefinitionFactoryForExternalPaymentMethod",
        "supportedPaymentMethodDefinitions",
        "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodDefinition;",
        "amount",
        "Lcom/stripe/android/ui/core/Amount;",
        "formHeaderInformationForCode",
        "Lcom/stripe/android/lpmfoundations/FormHeaderInformation;",
        "customerHasSavedPaymentMethods",
        "formElementsForCode",
        "Lcom/stripe/android/uicore/elements/FormElement;",
        "uiDefinitionFactoryArgumentsFactory",
        "Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments$Factory;",
        "allowRedisplay",
        "Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;",
        "customerRequestedSave",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "component12",
        "component13",
        "component14",
        "component15",
        "component16",
        "component17",
        "component18",
        "component19",
        "component20",
        "component21",
        "component22",
        "component23",
        "component24",
        "component25",
        "component26",
        "copy",
        "describeContents",
        "equals",
        "other",
        "",
        "hashCode",
        "toString",
        "writeToParcel",
        "",
        "dest",
        "Landroid/os/Parcel;",
        "flags",
        "Companion",
        "paymentsheet_release"
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

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata$Companion;


# instance fields
.field private final allowsDelayedPaymentMethods:Z

.field private final allowsLinkInSavedPaymentMethods:Z

.field private final allowsPaymentMethodsRequiringShippingAddress:Z

.field private final availableWallets:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/lpmfoundations/paymentmethod/WalletType;",
            ">;"
        }
    .end annotation
.end field

.field private final billingDetailsCollectionConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

.field private final cardBrandFilter:Lcom/stripe/android/CardBrandFilter;

.field private final cbcEligibility:Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;

.field private final customerMetadata:Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;

.field private final defaultBillingDetails:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

.field private final displayableCustomPaymentMethods:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/lpmfoundations/paymentmethod/DisplayableCustomPaymentMethod;",
            ">;"
        }
    .end annotation
.end field

.field private final elementsSessionId:Ljava/lang/String;

.field private final externalPaymentMethodSpecs:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodSpec;",
            ">;"
        }
    .end annotation
.end field

.field private final financialConnectionsAvailability:Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;

.field private final isGooglePayReady:Z

.field private final linkConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;

.field private final linkMode:Lcom/stripe/android/model/LinkMode;

.field private final linkState:Lcom/stripe/android/paymentsheet/state/LinkState;

.field private final merchantName:Ljava/lang/String;

.field private final paymentMethodIncentive:Lcom/stripe/android/paymentsheet/model/PaymentMethodIncentive;

.field private final paymentMethodOrder:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final paymentMethodSaveConsentBehavior:Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;

.field private final sharedDataSpecs:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/ui/core/elements/SharedDataSpec;",
            ">;"
        }
    .end annotation
.end field

.field private final shippingDetails:Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

.field private final shopPayConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;

.field private final stripeIntent:Lcom/stripe/android/model/StripeIntent;

.field private final termsDisplay:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/stripe/android/model/PaymentMethod$Type;",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$TermsDisplay;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->Companion:Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata$Companion;

    new-instance v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata$Creator;

    invoke-direct {v0}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->CREATOR:Landroid/os/Parcelable$Creator;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->$stable:I

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;ZZZLjava/util/List;Ljava/util/List;Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;ZLcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;Lcom/stripe/android/model/LinkMode;Lcom/stripe/android/paymentsheet/state/LinkState;Lcom/stripe/android/paymentsheet/model/PaymentMethodIncentive;Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;Lcom/stripe/android/CardBrandFilter;Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;Ljava/util/Map;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/StripeIntent;",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;",
            "ZZZ",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/lpmfoundations/paymentmethod/WalletType;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;",
            "Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;",
            "Ljava/util/List<",
            "Lcom/stripe/android/ui/core/elements/SharedDataSpec;",
            ">;",
            "Ljava/util/List<",
            "Lcom/stripe/android/lpmfoundations/paymentmethod/DisplayableCustomPaymentMethod;",
            ">;",
            "Ljava/util/List<",
            "Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodSpec;",
            ">;",
            "Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;",
            "Z",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;",
            "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;",
            "Lcom/stripe/android/model/LinkMode;",
            "Lcom/stripe/android/paymentsheet/state/LinkState;",
            "Lcom/stripe/android/paymentsheet/model/PaymentMethodIncentive;",
            "Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;",
            "Lcom/stripe/android/CardBrandFilter;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;",
            "Ljava/util/Map<",
            "Lcom/stripe/android/model/PaymentMethod$Type;",
            "+",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$TermsDisplay;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p6

    move-object/from16 v4, p7

    move-object/from16 v5, p8

    move-object/from16 v6, p9

    move-object/from16 v7, p12

    move-object/from16 v8, p13

    move-object/from16 v9, p14

    move-object/from16 v10, p17

    move-object/from16 v11, p18

    move-object/from16 v12, p23

    move-object/from16 v13, p24

    move-object/from16 v14, p26

    const-string v15, "stripeIntent"

    invoke-static {v1, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "billingDetailsCollectionConfiguration"

    invoke-static {v2, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "availableWallets"

    invoke-static {v3, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "paymentMethodOrder"

    invoke-static {v4, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "cbcEligibility"

    invoke-static {v5, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "merchantName"

    invoke-static {v6, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "sharedDataSpecs"

    invoke-static {v7, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "displayableCustomPaymentMethods"

    invoke-static {v8, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "externalPaymentMethodSpecs"

    invoke-static {v9, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "linkConfiguration"

    invoke-static {v10, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "paymentMethodSaveConsentBehavior"

    invoke-static {v11, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "cardBrandFilter"

    invoke-static {v12, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "elementsSessionId"

    invoke-static {v13, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "termsDisplay"

    invoke-static {v14, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 47
    iput-object v1, v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->stripeIntent:Lcom/stripe/android/model/StripeIntent;

    .line 48
    iput-object v2, v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->billingDetailsCollectionConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    move/from16 v1, p3

    .line 49
    iput-boolean v1, v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->allowsDelayedPaymentMethods:Z

    move/from16 v1, p4

    .line 50
    iput-boolean v1, v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->allowsPaymentMethodsRequiringShippingAddress:Z

    move/from16 v1, p5

    .line 51
    iput-boolean v1, v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->allowsLinkInSavedPaymentMethods:Z

    .line 52
    iput-object v3, v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->availableWallets:Ljava/util/List;

    .line 53
    iput-object v4, v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->paymentMethodOrder:Ljava/util/List;

    .line 54
    iput-object v5, v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->cbcEligibility:Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;

    .line 55
    iput-object v6, v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->merchantName:Ljava/lang/String;

    move-object/from16 v1, p10

    .line 56
    iput-object v1, v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->defaultBillingDetails:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    move-object/from16 v1, p11

    .line 57
    iput-object v1, v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->shippingDetails:Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    .line 58
    iput-object v7, v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->sharedDataSpecs:Ljava/util/List;

    .line 59
    iput-object v8, v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->displayableCustomPaymentMethods:Ljava/util/List;

    .line 60
    iput-object v9, v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->externalPaymentMethodSpecs:Ljava/util/List;

    move-object/from16 v1, p15

    .line 61
    iput-object v1, v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->customerMetadata:Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;

    move/from16 v1, p16

    .line 62
    iput-boolean v1, v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->isGooglePayReady:Z

    .line 63
    iput-object v10, v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->linkConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;

    .line 64
    iput-object v11, v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->paymentMethodSaveConsentBehavior:Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;

    move-object/from16 v1, p19

    .line 65
    iput-object v1, v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->linkMode:Lcom/stripe/android/model/LinkMode;

    move-object/from16 v1, p20

    .line 66
    iput-object v1, v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->linkState:Lcom/stripe/android/paymentsheet/state/LinkState;

    move-object/from16 v1, p21

    .line 67
    iput-object v1, v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->paymentMethodIncentive:Lcom/stripe/android/paymentsheet/model/PaymentMethodIncentive;

    move-object/from16 v1, p22

    .line 68
    iput-object v1, v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->financialConnectionsAvailability:Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;

    .line 69
    iput-object v12, v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->cardBrandFilter:Lcom/stripe/android/CardBrandFilter;

    .line 70
    iput-object v13, v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->elementsSessionId:Ljava/lang/String;

    move-object/from16 v1, p25

    .line 71
    iput-object v1, v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->shopPayConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;

    .line 72
    iput-object v14, v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->termsDisplay:Ljava/util/Map;

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;ZZZLjava/util/List;Ljava/util/List;Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;ZLcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;Lcom/stripe/android/model/LinkMode;Lcom/stripe/android/paymentsheet/state/LinkState;Lcom/stripe/android/paymentsheet/model/PaymentMethodIncentive;Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;Lcom/stripe/android/CardBrandFilter;Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;Ljava/util/Map;ILjava/lang/Object;)Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p27

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->stripeIntent:Lcom/stripe/android/model/StripeIntent;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->billingDetailsCollectionConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-boolean v4, v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->allowsDelayedPaymentMethods:Z

    goto :goto_2

    :cond_2
    move/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-boolean v5, v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->allowsPaymentMethodsRequiringShippingAddress:Z

    goto :goto_3

    :cond_3
    move/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-boolean v6, v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->allowsLinkInSavedPaymentMethods:Z

    goto :goto_4

    :cond_4
    move/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->availableWallets:Ljava/util/List;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->paymentMethodOrder:Ljava/util/List;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->cbcEligibility:Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->merchantName:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->defaultBillingDetails:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->shippingDetails:Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->sharedDataSpecs:Ljava/util/List;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->displayableCustomPaymentMethods:Ljava/util/List;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->externalPaymentMethodSpecs:Ljava/util/List;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->customerMetadata:Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget-boolean v1, v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->isGooglePayReady:Z

    goto :goto_f

    :cond_f
    move/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p27, v16

    move/from16 p2, v1

    if-eqz v16, :cond_10

    iget-object v1, v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->linkConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;

    goto :goto_10

    :cond_10
    move-object/from16 v1, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p27, v16

    move-object/from16 p3, v1

    if-eqz v16, :cond_11

    iget-object v1, v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->paymentMethodSaveConsentBehavior:Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;

    goto :goto_11

    :cond_11
    move-object/from16 v1, p18

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, p27, v16

    move-object/from16 p4, v1

    if-eqz v16, :cond_12

    iget-object v1, v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->linkMode:Lcom/stripe/android/model/LinkMode;

    goto :goto_12

    :cond_12
    move-object/from16 v1, p19

    :goto_12
    const/high16 v16, 0x80000

    and-int v16, p27, v16

    move-object/from16 p5, v1

    if-eqz v16, :cond_13

    iget-object v1, v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->linkState:Lcom/stripe/android/paymentsheet/state/LinkState;

    goto :goto_13

    :cond_13
    move-object/from16 v1, p20

    :goto_13
    const/high16 v16, 0x100000

    and-int v16, p27, v16

    move-object/from16 p6, v1

    if-eqz v16, :cond_14

    iget-object v1, v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->paymentMethodIncentive:Lcom/stripe/android/paymentsheet/model/PaymentMethodIncentive;

    goto :goto_14

    :cond_14
    move-object/from16 v1, p21

    :goto_14
    const/high16 v16, 0x200000

    and-int v16, p27, v16

    move-object/from16 p7, v1

    if-eqz v16, :cond_15

    iget-object v1, v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->financialConnectionsAvailability:Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;

    goto :goto_15

    :cond_15
    move-object/from16 v1, p22

    :goto_15
    const/high16 v16, 0x400000

    and-int v16, p27, v16

    move-object/from16 p8, v1

    if-eqz v16, :cond_16

    iget-object v1, v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->cardBrandFilter:Lcom/stripe/android/CardBrandFilter;

    goto :goto_16

    :cond_16
    move-object/from16 v1, p23

    :goto_16
    const/high16 v16, 0x800000

    and-int v16, p27, v16

    move-object/from16 p9, v1

    if-eqz v16, :cond_17

    iget-object v1, v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->elementsSessionId:Ljava/lang/String;

    goto :goto_17

    :cond_17
    move-object/from16 v1, p24

    :goto_17
    const/high16 v16, 0x1000000

    and-int v16, p27, v16

    move-object/from16 p10, v1

    if-eqz v16, :cond_18

    iget-object v1, v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->shopPayConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;

    goto :goto_18

    :cond_18
    move-object/from16 v1, p25

    :goto_18
    const/high16 v16, 0x2000000

    and-int v16, p27, v16

    if-eqz v16, :cond_19

    move-object/from16 p11, v1

    iget-object v1, v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->termsDisplay:Ljava/util/Map;

    move-object/from16 p26, p11

    move-object/from16 p27, v1

    goto :goto_19

    :cond_19
    move-object/from16 p27, p26

    move-object/from16 p26, v1

    :goto_19
    move/from16 p17, p2

    move-object/from16 p18, p3

    move-object/from16 p19, p4

    move-object/from16 p20, p5

    move-object/from16 p21, p6

    move-object/from16 p22, p7

    move-object/from16 p23, p8

    move-object/from16 p24, p9

    move-object/from16 p25, p10

    move-object/from16 p16, v2

    move-object/from16 p3, v3

    move/from16 p4, v4

    move/from16 p5, v5

    move/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    move-object/from16 p2, p1

    move-object/from16 p1, v0

    invoke-virtual/range {p1 .. p27}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->copy(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;ZZZLjava/util/List;Ljava/util/List;Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;ZLcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;Lcom/stripe/android/model/LinkMode;Lcom/stripe/android/paymentsheet/state/LinkState;Lcom/stripe/android/paymentsheet/model/PaymentMethodIncentive;Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;Lcom/stripe/android/CardBrandFilter;Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;Ljava/util/Map;)Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    move-result-object v0

    return-object v0
.end method

.method private final customPaymentMethodIds()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 167
    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->displayableCustomPaymentMethods:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    .line 468
    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v1, Ljava/util/Collection;

    .line 469
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 470
    check-cast v2, Lcom/stripe/android/lpmfoundations/paymentmethod/DisplayableCustomPaymentMethod;

    .line 167
    invoke-virtual {v2}, Lcom/stripe/android/lpmfoundations/paymentmethod/DisplayableCustomPaymentMethod;->getId()Ljava/lang/String;

    move-result-object v2

    .line 470
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 471
    :cond_0
    check-cast v1, Ljava/util/List;

    return-object v1
.end method

.method private final externalPaymentMethodTypes()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 163
    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->externalPaymentMethodSpecs:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    .line 464
    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v1, Ljava/util/Collection;

    .line 465
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 466
    check-cast v2, Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodSpec;

    .line 163
    invoke-virtual {v2}, Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodSpec;->getType()Ljava/lang/String;

    move-result-object v2

    .line 466
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 467
    :cond_0
    check-cast v1, Ljava/util/List;

    return-object v1
.end method

.method private final getUiDefinitionFactoryForCustomPaymentMethod(Ljava/lang/String;)Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Simple;
    .locals 4

    .line 179
    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->displayableCustomPaymentMethods:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    .line 472
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lcom/stripe/android/lpmfoundations/paymentmethod/DisplayableCustomPaymentMethod;

    .line 180
    invoke-virtual {v3}, Lcom/stripe/android/lpmfoundations/paymentmethod/DisplayableCustomPaymentMethod;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_1
    move-object v1, v2

    .line 179
    :goto_0
    check-cast v1, Lcom/stripe/android/lpmfoundations/paymentmethod/DisplayableCustomPaymentMethod;

    if-nez v1, :cond_2

    return-object v2

    .line 183
    :cond_2
    new-instance p1, Lcom/stripe/android/lpmfoundations/paymentmethod/definitions/CustomPaymentMethodUiDefinitionFactory;

    invoke-direct {p1, v1}, Lcom/stripe/android/lpmfoundations/paymentmethod/definitions/CustomPaymentMethodUiDefinitionFactory;-><init>(Lcom/stripe/android/lpmfoundations/paymentmethod/DisplayableCustomPaymentMethod;)V

    check-cast p1, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Simple;

    return-object p1
.end method

.method private final getUiDefinitionFactoryForExternalPaymentMethod(Ljava/lang/String;)Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Simple;
    .locals 4

    .line 187
    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->externalPaymentMethodSpecs:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    .line 474
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodSpec;

    .line 187
    invoke-virtual {v3}, Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodSpec;->getType()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    check-cast v1, Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodSpec;

    if-nez v1, :cond_2

    return-object v2

    .line 188
    :cond_2
    new-instance p1, Lcom/stripe/android/lpmfoundations/paymentmethod/definitions/ExternalPaymentMethodUiDefinitionFactory;

    invoke-direct {p1, v1}, Lcom/stripe/android/lpmfoundations/paymentmethod/definitions/ExternalPaymentMethodUiDefinitionFactory;-><init>(Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodSpec;)V

    check-cast p1, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Simple;

    return-object p1
.end method

.method private final mapOrderToIndex(Ljava/util/List;)Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 157
    check-cast p1, Ljava/lang/Iterable;

    .line 459
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v0, Ljava/util/Collection;

    .line 461
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    add-int/lit8 v3, v1, 0x1

    if-gez v1, :cond_0

    .line 462
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_0
    check-cast v2, Ljava/lang/String;

    .line 158
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    .line 462
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v1, v3

    goto :goto_0

    .line 463
    :cond_1
    check-cast v0, Ljava/util/List;

    .line 459
    check-cast v0, Ljava/lang/Iterable;

    .line 159
    invoke-static {v0}, Lkotlin/collections/MapsKt;->toMap(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method private final orderedPaymentMethodTypes()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 137
    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->stripeIntent:Lcom/stripe/android/model/StripeIntent;

    invoke-interface {v0}, Lcom/stripe/android/model/StripeIntent;->getPaymentMethodTypes()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    .line 138
    invoke-direct {p0}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->externalPaymentMethodTypes()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    .line 139
    invoke-direct {p0}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->customPaymentMethodIds()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    .line 140
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v0

    .line 141
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/List;

    .line 143
    iget-object v2, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->paymentMethodOrder:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 145
    invoke-interface {v0, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 146
    move-object v4, v1

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 148
    invoke-interface {v0, v3}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    .line 152
    :cond_1
    check-cast v0, Ljava/util/Collection;

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-object v1
.end method

.method private final supportedPaymentMethodDefinitions()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodDefinition;",
            ">;"
        }
    .end annotation

    .line 192
    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->stripeIntent:Lcom/stripe/android/model/StripeIntent;

    invoke-interface {v0}, Lcom/stripe/android/model/StripeIntent;->getPaymentMethodTypes()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 476
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/Collection;

    .line 485
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 484
    check-cast v2, Ljava/lang/String;

    .line 193
    sget-object v3, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodRegistry;->INSTANCE:Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodRegistry;

    invoke-virtual {v3}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodRegistry;->getDefinitionsByCode()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodDefinition;

    if-eqz v2, :cond_0

    .line 484
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 488
    :cond_1
    check-cast v1, Ljava/util/List;

    .line 476
    check-cast v1, Ljava/lang/Iterable;

    .line 489
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/Collection;

    .line 490
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodDefinition;

    .line 195
    invoke-static {v3, p0}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodDefinitionKt;->isSupported(Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodDefinition;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 490
    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 491
    :cond_3
    check-cast v0, Ljava/util/List;

    .line 198
    sget-object v1, Lcom/stripe/android/lpmfoundations/paymentmethod/definitions/LinkCardBrandDefinition;->INSTANCE:Lcom/stripe/android/lpmfoundations/paymentmethod/definitions/LinkCardBrandDefinition;

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    .line 492
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    check-cast v2, Ljava/util/Collection;

    .line 493
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_4
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lcom/stripe/android/lpmfoundations/paymentmethod/definitions/LinkCardBrandDefinition;

    .line 199
    check-cast v4, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodDefinition;

    invoke-static {v4, p0}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodDefinitionKt;->isSupported(Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodDefinition;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 493
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 494
    :cond_5
    check-cast v2, Ljava/util/List;

    .line 202
    check-cast v0, Ljava/util/Collection;

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    .line 204
    check-cast v0, Ljava/lang/Iterable;

    .line 495
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/Collection;

    .line 496
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodDefinition;

    .line 205
    iget-object v4, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->stripeIntent:Lcom/stripe/android/model/StripeIntent;

    invoke-interface {v4}, Lcom/stripe/android/model/StripeIntent;->isLiveMode()Z

    move-result v4

    if-eqz v4, :cond_6

    .line 206
    iget-object v4, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->stripeIntent:Lcom/stripe/android/model/StripeIntent;

    invoke-interface {v4}, Lcom/stripe/android/model/StripeIntent;->getUnactivatedPaymentMethods()Ljava/util/List;

    move-result-object v4

    invoke-interface {v3}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodDefinition;->getType()Lcom/stripe/android/model/PaymentMethod$Type;

    move-result-object v3

    iget-object v3, v3, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    invoke-interface {v4, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    goto :goto_3

    .line 496
    :cond_6
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 497
    :cond_7
    check-cast v1, Ljava/util/List;

    .line 495
    check-cast v1, Ljava/lang/Iterable;

    .line 498
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/Collection;

    .line 499
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_8
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodDefinition;

    .line 208
    invoke-interface {v3}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodDefinition;->uiDefinitionFactory()Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory;

    move-result-object v4

    iget-object v5, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->sharedDataSpecs:Ljava/util/List;

    invoke-interface {v4, v3, v5}, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory;->canBeDisplayedInUi(Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodDefinition;Ljava/util/List;)Z

    move-result v3

    if-eqz v3, :cond_8

    .line 499
    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 500
    :cond_9
    check-cast v0, Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method public final allowRedisplay(Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;Ljava/lang/String;)Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;
    .locals 1

    const-string v0, "customerRequestedSave"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "code"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 281
    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->paymentMethodSaveConsentBehavior:Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;

    .line 282
    invoke-virtual {p0, p2}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->hasIntentToSetup(Ljava/lang/String;)Z

    move-result p2

    .line 281
    invoke-interface {v0, p2, p1}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;->allowRedisplay(ZLcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;)Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;

    move-result-object p1

    return-object p1
.end method

.method public final amount()Lcom/stripe/android/ui/core/Amount;
    .locals 5

    .line 213
    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->stripeIntent:Lcom/stripe/android/model/StripeIntent;

    instance-of v0, v0, Lcom/stripe/android/model/PaymentIntent;

    if-eqz v0, :cond_2

    .line 214
    new-instance v0, Lcom/stripe/android/ui/core/Amount;

    .line 215
    iget-object v1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->stripeIntent:Lcom/stripe/android/model/StripeIntent;

    check-cast v1, Lcom/stripe/android/model/PaymentIntent;

    invoke-virtual {v1}, Lcom/stripe/android/model/PaymentIntent;->getAmount()Ljava/lang/Long;

    move-result-object v1

    const-string v2, "Required value was null."

    if-eqz v1, :cond_1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v3

    .line 216
    iget-object v1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->stripeIntent:Lcom/stripe/android/model/StripeIntent;

    check-cast v1, Lcom/stripe/android/model/PaymentIntent;

    invoke-virtual {v1}, Lcom/stripe/android/model/PaymentIntent;->getCurrency()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 214
    invoke-direct {v0, v3, v4, v1}, Lcom/stripe/android/ui/core/Amount;-><init>(JLjava/lang/String;)V

    return-object v0

    .line 216
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 215
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method

.method public final component1()Lcom/stripe/android/model/StripeIntent;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->stripeIntent:Lcom/stripe/android/model/StripeIntent;

    return-object v0
.end method

.method public final component10()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->defaultBillingDetails:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    return-object v0
.end method

.method public final component11()Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->shippingDetails:Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    return-object v0
.end method

.method public final component12()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/ui/core/elements/SharedDataSpec;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->sharedDataSpecs:Ljava/util/List;

    return-object v0
.end method

.method public final component13()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/lpmfoundations/paymentmethod/DisplayableCustomPaymentMethod;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->displayableCustomPaymentMethods:Ljava/util/List;

    return-object v0
.end method

.method public final component14()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodSpec;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->externalPaymentMethodSpecs:Ljava/util/List;

    return-object v0
.end method

.method public final component15()Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->customerMetadata:Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;

    return-object v0
.end method

.method public final component16()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->isGooglePayReady:Z

    return v0
.end method

.method public final component17()Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->linkConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;

    return-object v0
.end method

.method public final component18()Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->paymentMethodSaveConsentBehavior:Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;

    return-object v0
.end method

.method public final component19()Lcom/stripe/android/model/LinkMode;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->linkMode:Lcom/stripe/android/model/LinkMode;

    return-object v0
.end method

.method public final component2()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->billingDetailsCollectionConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    return-object v0
.end method

.method public final component20()Lcom/stripe/android/paymentsheet/state/LinkState;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->linkState:Lcom/stripe/android/paymentsheet/state/LinkState;

    return-object v0
.end method

.method public final component21()Lcom/stripe/android/paymentsheet/model/PaymentMethodIncentive;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->paymentMethodIncentive:Lcom/stripe/android/paymentsheet/model/PaymentMethodIncentive;

    return-object v0
.end method

.method public final component22()Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->financialConnectionsAvailability:Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;

    return-object v0
.end method

.method public final component23()Lcom/stripe/android/CardBrandFilter;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->cardBrandFilter:Lcom/stripe/android/CardBrandFilter;

    return-object v0
.end method

.method public final component24()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->elementsSessionId:Ljava/lang/String;

    return-object v0
.end method

.method public final component25()Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->shopPayConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;

    return-object v0
.end method

.method public final component26()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lcom/stripe/android/model/PaymentMethod$Type;",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$TermsDisplay;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->termsDisplay:Ljava/util/Map;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->allowsDelayedPaymentMethods:Z

    return v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->allowsPaymentMethodsRequiringShippingAddress:Z

    return v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->allowsLinkInSavedPaymentMethods:Z

    return v0
.end method

.method public final component6()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/lpmfoundations/paymentmethod/WalletType;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->availableWallets:Ljava/util/List;

    return-object v0
.end method

.method public final component7()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->paymentMethodOrder:Ljava/util/List;

    return-object v0
.end method

.method public final component8()Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->cbcEligibility:Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->merchantName:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;ZZZLjava/util/List;Ljava/util/List;Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;ZLcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;Lcom/stripe/android/model/LinkMode;Lcom/stripe/android/paymentsheet/state/LinkState;Lcom/stripe/android/paymentsheet/model/PaymentMethodIncentive;Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;Lcom/stripe/android/CardBrandFilter;Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;Ljava/util/Map;)Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;
    .locals 28
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/StripeIntent;",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;",
            "ZZZ",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/lpmfoundations/paymentmethod/WalletType;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;",
            "Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;",
            "Ljava/util/List<",
            "Lcom/stripe/android/ui/core/elements/SharedDataSpec;",
            ">;",
            "Ljava/util/List<",
            "Lcom/stripe/android/lpmfoundations/paymentmethod/DisplayableCustomPaymentMethod;",
            ">;",
            "Ljava/util/List<",
            "Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodSpec;",
            ">;",
            "Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;",
            "Z",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;",
            "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;",
            "Lcom/stripe/android/model/LinkMode;",
            "Lcom/stripe/android/paymentsheet/state/LinkState;",
            "Lcom/stripe/android/paymentsheet/model/PaymentMethodIncentive;",
            "Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;",
            "Lcom/stripe/android/CardBrandFilter;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;",
            "Ljava/util/Map<",
            "Lcom/stripe/android/model/PaymentMethod$Type;",
            "+",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$TermsDisplay;",
            ">;)",
            "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;"
        }
    .end annotation

    const-string v0, "stripeIntent"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "billingDetailsCollectionConfiguration"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "availableWallets"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentMethodOrder"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cbcEligibility"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "merchantName"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sharedDataSpecs"

    move-object/from16 v13, p12

    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "displayableCustomPaymentMethods"

    move-object/from16 v14, p13

    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "externalPaymentMethodSpecs"

    move-object/from16 v15, p14

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkConfiguration"

    move-object/from16 v1, p17

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentMethodSaveConsentBehavior"

    move-object/from16 v4, p18

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cardBrandFilter"

    move-object/from16 v5, p23

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "elementsSessionId"

    move-object/from16 v6, p24

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "termsDisplay"

    move-object/from16 v11, p26

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    move-object/from16 v12, p11

    move-object/from16 v16, p15

    move/from16 v17, p16

    move-object/from16 v18, p17

    move-object/from16 v20, p19

    move-object/from16 v21, p20

    move-object/from16 v22, p21

    move-object/from16 v23, p22

    move-object/from16 v26, p25

    move-object/from16 v19, v4

    move-object/from16 v24, v5

    move-object/from16 v25, v6

    move-object/from16 v27, v11

    move/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v11, p10

    invoke-direct/range {v1 .. v27}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;-><init>(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;ZZZLjava/util/List;Ljava/util/List;Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;ZLcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;Lcom/stripe/android/model/LinkMode;Lcom/stripe/android/paymentsheet/state/LinkState;Lcom/stripe/android/paymentsheet/model/PaymentMethodIncentive;Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;Lcom/stripe/android/CardBrandFilter;Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;Ljava/util/Map;)V

    return-object v1
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    iget-object v1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->stripeIntent:Lcom/stripe/android/model/StripeIntent;

    iget-object v3, p1, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->stripeIntent:Lcom/stripe/android/model/StripeIntent;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->billingDetailsCollectionConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    iget-object v3, p1, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->billingDetailsCollectionConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->allowsDelayedPaymentMethods:Z

    iget-boolean v3, p1, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->allowsDelayedPaymentMethods:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->allowsPaymentMethodsRequiringShippingAddress:Z

    iget-boolean v3, p1, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->allowsPaymentMethodsRequiringShippingAddress:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->allowsLinkInSavedPaymentMethods:Z

    iget-boolean v3, p1, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->allowsLinkInSavedPaymentMethods:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->availableWallets:Ljava/util/List;

    iget-object v3, p1, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->availableWallets:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->paymentMethodOrder:Ljava/util/List;

    iget-object v3, p1, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->paymentMethodOrder:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->cbcEligibility:Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;

    iget-object v3, p1, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->cbcEligibility:Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->merchantName:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->merchantName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->defaultBillingDetails:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    iget-object v3, p1, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->defaultBillingDetails:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->shippingDetails:Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    iget-object v3, p1, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->shippingDetails:Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->sharedDataSpecs:Ljava/util/List;

    iget-object v3, p1, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->sharedDataSpecs:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->displayableCustomPaymentMethods:Ljava/util/List;

    iget-object v3, p1, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->displayableCustomPaymentMethods:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->externalPaymentMethodSpecs:Ljava/util/List;

    iget-object v3, p1, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->externalPaymentMethodSpecs:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->customerMetadata:Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;

    iget-object v3, p1, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->customerMetadata:Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-boolean v1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->isGooglePayReady:Z

    iget-boolean v3, p1, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->isGooglePayReady:Z

    if-eq v1, v3, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->linkConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;

    iget-object v3, p1, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->linkConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->paymentMethodSaveConsentBehavior:Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;

    iget-object v3, p1, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->paymentMethodSaveConsentBehavior:Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->linkMode:Lcom/stripe/android/model/LinkMode;

    iget-object v3, p1, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->linkMode:Lcom/stripe/android/model/LinkMode;

    if-eq v1, v3, :cond_14

    return v2

    :cond_14
    iget-object v1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->linkState:Lcom/stripe/android/paymentsheet/state/LinkState;

    iget-object v3, p1, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->linkState:Lcom/stripe/android/paymentsheet/state/LinkState;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    return v2

    :cond_15
    iget-object v1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->paymentMethodIncentive:Lcom/stripe/android/paymentsheet/model/PaymentMethodIncentive;

    iget-object v3, p1, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->paymentMethodIncentive:Lcom/stripe/android/paymentsheet/model/PaymentMethodIncentive;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    return v2

    :cond_16
    iget-object v1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->financialConnectionsAvailability:Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;

    iget-object v3, p1, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->financialConnectionsAvailability:Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;

    if-eq v1, v3, :cond_17

    return v2

    :cond_17
    iget-object v1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->cardBrandFilter:Lcom/stripe/android/CardBrandFilter;

    iget-object v3, p1, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->cardBrandFilter:Lcom/stripe/android/CardBrandFilter;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_18

    return v2

    :cond_18
    iget-object v1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->elementsSessionId:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->elementsSessionId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_19

    return v2

    :cond_19
    iget-object v1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->shopPayConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;

    iget-object v3, p1, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->shopPayConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1a

    return v2

    :cond_1a
    iget-object v1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->termsDisplay:Ljava/util/Map;

    iget-object p1, p1, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->termsDisplay:Ljava/util/Map;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1b

    return v2

    :cond_1b
    return v0
.end method

.method public final formElementsForCode(Ljava/lang/String;Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments$Factory;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments$Factory;",
            ")",
            "Ljava/util/List<",
            "Lcom/stripe/android/uicore/elements/FormElement;",
            ">;"
        }
    .end annotation

    const-string v0, "code"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "uiDefinitionFactoryArgumentsFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 252
    invoke-virtual {p0, p1}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->isExternalPaymentMethod(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    .line 253
    invoke-direct {p0, p1}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->getUiDefinitionFactoryForExternalPaymentMethod(Ljava/lang/String;)Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Simple;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 255
    invoke-interface {p2, p0, v1}, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments$Factory;->create(Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Z)Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;

    move-result-object p2

    .line 253
    invoke-interface {p1, p0, p2}, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Simple;->createFormElements(Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v2

    .line 257
    :cond_1
    invoke-virtual {p0, p1}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->isCustomPaymentMethod(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 258
    invoke-direct {p0, p1}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->getUiDefinitionFactoryForCustomPaymentMethod(Ljava/lang/String;)Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Simple;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 260
    invoke-interface {p2, p0, v1}, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments$Factory;->create(Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Z)Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;

    move-result-object p2

    .line 258
    invoke-interface {p1, p0, p2}, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Simple;->createFormElements(Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_2
    return-object v2

    .line 263
    :cond_3
    invoke-direct {p0}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->supportedPaymentMethodDefinitions()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 503
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodDefinition;

    .line 263
    invoke-interface {v3}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodDefinition;->getType()Lcom/stripe/android/model/PaymentMethod$Type;

    move-result-object v3

    iget-object v3, v3, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    invoke-static {v3, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    goto :goto_0

    :cond_5
    move-object v1, v2

    :goto_0
    check-cast v1, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodDefinition;

    if-nez v1, :cond_6

    return-object v2

    .line 265
    :cond_6
    invoke-interface {v1}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodDefinition;->uiDefinitionFactory()Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory;

    move-result-object p1

    .line 268
    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->sharedDataSpecs:Ljava/util/List;

    .line 271
    invoke-interface {v1, p0}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodDefinition;->requiresMandate(Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;)Z

    move-result v2

    .line 269
    invoke-interface {p2, p0, v2}, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments$Factory;->create(Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Z)Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;

    move-result-object p2

    .line 265
    invoke-interface {p1, v1, p0, v0, p2}, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory;->formElements(Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodDefinition;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Ljava/util/List;Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final formHeaderInformationForCode(Ljava/lang/String;Z)Lcom/stripe/android/lpmfoundations/FormHeaderInformation;
    .locals 4

    const-string v0, "code"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 226
    invoke-virtual {p0, p1}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->isExternalPaymentMethod(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 227
    invoke-direct {p0, p1}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->getUiDefinitionFactoryForExternalPaymentMethod(Ljava/lang/String;)Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Simple;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1, p2, v1}, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Simple;->createFormHeaderInformation(ZLcom/stripe/android/paymentsheet/model/PaymentMethodIncentive;)Lcom/stripe/android/lpmfoundations/FormHeaderInformation;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v1

    .line 231
    :cond_1
    invoke-virtual {p0, p1}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->isCustomPaymentMethod(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 232
    invoke-direct {p0, p1}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->getUiDefinitionFactoryForCustomPaymentMethod(Ljava/lang/String;)Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Simple;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-interface {p1, p2, v1}, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Simple;->createFormHeaderInformation(ZLcom/stripe/android/paymentsheet/model/PaymentMethodIncentive;)Lcom/stripe/android/lpmfoundations/FormHeaderInformation;

    move-result-object p1

    return-object p1

    :cond_2
    return-object v1

    .line 237
    :cond_3
    invoke-direct {p0}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->supportedPaymentMethodDefinitions()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 501
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodDefinition;

    .line 237
    invoke-interface {v3}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodDefinition;->getType()Lcom/stripe/android/model/PaymentMethod$Type;

    move-result-object v3

    iget-object v3, v3, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    invoke-static {v3, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    goto :goto_0

    :cond_5
    move-object v2, v1

    :goto_0
    check-cast v2, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodDefinition;

    if-nez v2, :cond_6

    return-object v1

    .line 239
    :cond_6
    invoke-interface {v2}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodDefinition;->uiDefinitionFactory()Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory;

    move-result-object p1

    .line 242
    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->sharedDataSpecs:Ljava/util/List;

    .line 239
    invoke-interface {p1, v2, p0, v0, p2}, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory;->formHeaderInformation(Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodDefinition;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Ljava/util/List;Z)Lcom/stripe/android/lpmfoundations/FormHeaderInformation;

    move-result-object p1

    return-object p1
.end method

.method public final getAllowsDelayedPaymentMethods()Z
    .locals 1

    .line 49
    iget-boolean v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->allowsDelayedPaymentMethods:Z

    return v0
.end method

.method public final getAllowsLinkInSavedPaymentMethods()Z
    .locals 1

    .line 51
    iget-boolean v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->allowsLinkInSavedPaymentMethods:Z

    return v0
.end method

.method public final getAllowsPaymentMethodsRequiringShippingAddress()Z
    .locals 1

    .line 50
    iget-boolean v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->allowsPaymentMethodsRequiringShippingAddress:Z

    return v0
.end method

.method public final getAvailableWallets()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/lpmfoundations/paymentmethod/WalletType;",
            ">;"
        }
    .end annotation

    .line 52
    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->availableWallets:Ljava/util/List;

    return-object v0
.end method

.method public final getBillingDetailsCollectionConfiguration()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->billingDetailsCollectionConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    return-object v0
.end method

.method public final getCardBrandFilter()Lcom/stripe/android/CardBrandFilter;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->cardBrandFilter:Lcom/stripe/android/CardBrandFilter;

    return-object v0
.end method

.method public final getCbcEligibility()Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->cbcEligibility:Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;

    return-object v0
.end method

.method public final getCustomerMetadata()Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->customerMetadata:Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;

    return-object v0
.end method

.method public final getDefaultBillingDetails()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->defaultBillingDetails:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    return-object v0
.end method

.method public final getDisplayableCustomPaymentMethods()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/lpmfoundations/paymentmethod/DisplayableCustomPaymentMethod;",
            ">;"
        }
    .end annotation

    .line 59
    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->displayableCustomPaymentMethods:Ljava/util/List;

    return-object v0
.end method

.method public final getElementsSessionId()Ljava/lang/String;
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->elementsSessionId:Ljava/lang/String;

    return-object v0
.end method

.method public final getExternalPaymentMethodSpecs()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodSpec;",
            ">;"
        }
    .end annotation

    .line 60
    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->externalPaymentMethodSpecs:Ljava/util/List;

    return-object v0
.end method

.method public final getFinancialConnectionsAvailability()Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->financialConnectionsAvailability:Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;

    return-object v0
.end method

.method public final getLinkConfiguration()Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->linkConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;

    return-object v0
.end method

.method public final getLinkMode()Lcom/stripe/android/model/LinkMode;
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->linkMode:Lcom/stripe/android/model/LinkMode;

    return-object v0
.end method

.method public final getLinkState()Lcom/stripe/android/paymentsheet/state/LinkState;
    .locals 1

    .line 66
    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->linkState:Lcom/stripe/android/paymentsheet/state/LinkState;

    return-object v0
.end method

.method public final getMerchantName()Ljava/lang/String;
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->merchantName:Ljava/lang/String;

    return-object v0
.end method

.method public final getPaymentMethodIncentive()Lcom/stripe/android/paymentsheet/model/PaymentMethodIncentive;
    .locals 1

    .line 67
    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->paymentMethodIncentive:Lcom/stripe/android/paymentsheet/model/PaymentMethodIncentive;

    return-object v0
.end method

.method public final getPaymentMethodOrder()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 53
    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->paymentMethodOrder:Ljava/util/List;

    return-object v0
.end method

.method public final getPaymentMethodSaveConsentBehavior()Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->paymentMethodSaveConsentBehavior:Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;

    return-object v0
.end method

.method public final getSharedDataSpecs()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/ui/core/elements/SharedDataSpec;",
            ">;"
        }
    .end annotation

    .line 58
    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->sharedDataSpecs:Ljava/util/List;

    return-object v0
.end method

.method public final getShippingDetails()Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->shippingDetails:Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    return-object v0
.end method

.method public final getShopPayConfiguration()Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->shopPayConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;

    return-object v0
.end method

.method public final getStripeIntent()Lcom/stripe/android/model/StripeIntent;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->stripeIntent:Lcom/stripe/android/model/StripeIntent;

    return-object v0
.end method

.method public final getTermsDisplay()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lcom/stripe/android/model/PaymentMethod$Type;",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$TermsDisplay;",
            ">;"
        }
    .end annotation

    .line 72
    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->termsDisplay:Ljava/util/Map;

    return-object v0
.end method

.method public final hasIntentToSetup(Ljava/lang/String;)Z
    .locals 2

    const-string v0, "code"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->stripeIntent:Lcom/stripe/android/model/StripeIntent;

    .line 76
    instance-of v1, v0, Lcom/stripe/android/model/PaymentIntent;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/stripe/android/model/PaymentIntent;

    invoke-virtual {v0, p1}, Lcom/stripe/android/model/PaymentIntent;->isSetupFutureUsageSet(Ljava/lang/String;)Z

    move-result p1

    return p1

    .line 77
    :cond_0
    instance-of p1, v0, Lcom/stripe/android/model/SetupIntent;

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    .line 75
    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->stripeIntent:Lcom/stripe/android/model/StripeIntent;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->billingDetailsCollectionConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->allowsDelayedPaymentMethods:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->allowsPaymentMethodsRequiringShippingAddress:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->allowsLinkInSavedPaymentMethods:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->availableWallets:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->paymentMethodOrder:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->cbcEligibility:Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->merchantName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->defaultBillingDetails:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->shippingDetails:Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->sharedDataSpecs:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->displayableCustomPaymentMethods:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->externalPaymentMethodSpecs:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->customerMetadata:Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->isGooglePayReady:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->linkConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->paymentMethodSaveConsentBehavior:Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->linkMode:Lcom/stripe/android/model/LinkMode;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Lcom/stripe/android/model/LinkMode;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->linkState:Lcom/stripe/android/paymentsheet/state/LinkState;

    if-nez v1, :cond_4

    move v1, v2

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/state/LinkState;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->paymentMethodIncentive:Lcom/stripe/android/paymentsheet/model/PaymentMethodIncentive;

    if-nez v1, :cond_5

    move v1, v2

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/model/PaymentMethodIncentive;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->financialConnectionsAvailability:Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;

    if-nez v1, :cond_6

    move v1, v2

    goto :goto_6

    :cond_6
    invoke-virtual {v1}, Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;->hashCode()I

    move-result v1

    :goto_6
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->cardBrandFilter:Lcom/stripe/android/CardBrandFilter;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->elementsSessionId:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->shopPayConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;

    if-nez v1, :cond_7

    goto :goto_7

    :cond_7
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->termsDisplay:Ljava/util/Map;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final isCustomPaymentMethod(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "code"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 175
    invoke-direct {p0}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->customPaymentMethodIds()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final isExternalPaymentMethod(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "code"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 171
    invoke-direct {p0}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->externalPaymentMethodTypes()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final isGooglePayReady()Z
    .locals 1

    .line 62
    iget-boolean v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->isGooglePayReady:Z

    return v0
.end method

.method public final mandateAllowed(Lcom/stripe/android/model/PaymentMethod$Type;)Z
    .locals 1

    const-string v0, "paymentMethodType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->termsDisplay:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$TermsDisplay;->NEVER:Lcom/stripe/android/paymentsheet/PaymentSheet$TermsDisplay;

    if-eq p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final requiresMandate(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "paymentMethodCode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    sget-object v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodRegistry;->INSTANCE:Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodRegistry;

    invoke-virtual {v0}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodRegistry;->getDefinitionsByCode()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodDefinition;

    if-eqz p1, :cond_0

    invoke-interface {p1, p0}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodDefinition;->requiresMandate(Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final sortedSupportedPaymentMethods()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;",
            ">;"
        }
    .end annotation

    .line 133
    invoke-virtual {p0}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->supportedPaymentMethodTypes()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 446
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/Collection;

    .line 455
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 454
    check-cast v2, Ljava/lang/String;

    .line 133
    invoke-virtual {p0, v2}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->supportedPaymentMethodForCode(Ljava/lang/String;)Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 454
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 458
    :cond_1
    check-cast v1, Ljava/util/List;

    return-object v1
.end method

.method public final supportedPaymentMethodForCode(Ljava/lang/String;)Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;
    .locals 4

    const-string v0, "code"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 122
    invoke-virtual {p0, p1}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->isExternalPaymentMethod(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 123
    invoke-direct {p0, p1}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->getUiDefinitionFactoryForExternalPaymentMethod(Ljava/lang/String;)Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Simple;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Simple;->createSupportedPaymentMethod()Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v1

    .line 124
    :cond_1
    invoke-virtual {p0, p1}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->isCustomPaymentMethod(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 125
    invoke-direct {p0, p1}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->getUiDefinitionFactoryForCustomPaymentMethod(Ljava/lang/String;)Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Simple;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-interface {p1}, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Simple;->createSupportedPaymentMethod()Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;

    move-result-object p1

    return-object p1

    :cond_2
    return-object v1

    .line 127
    :cond_3
    invoke-direct {p0}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->supportedPaymentMethodDefinitions()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 444
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodDefinition;

    .line 127
    invoke-interface {v3}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodDefinition;->getType()Lcom/stripe/android/model/PaymentMethod$Type;

    move-result-object v3

    iget-object v3, v3, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    invoke-static {v3, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    goto :goto_0

    :cond_5
    move-object v2, v1

    :goto_0
    check-cast v2, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodDefinition;

    if-nez v2, :cond_6

    return-object v1

    .line 128
    :cond_6
    invoke-interface {v2}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodDefinition;->uiDefinitionFactory()Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory;

    move-result-object p1

    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->sharedDataSpecs:Ljava/util/List;

    invoke-interface {p1, p0, v2, v0}, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory;->supportedPaymentMethod(Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodDefinition;Ljava/util/List;)Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;

    move-result-object p1

    return-object p1
.end method

.method public final supportedPaymentMethodTypes()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 90
    invoke-direct {p0}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->supportedPaymentMethodDefinitions()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 432
    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v1, Ljava/util/Collection;

    .line 433
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 434
    check-cast v2, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodDefinition;

    .line 91
    invoke-interface {v2}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodDefinition;->getType()Lcom/stripe/android/model/PaymentMethod$Type;

    move-result-object v2

    iget-object v2, v2, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    .line 434
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 435
    :cond_0
    check-cast v1, Ljava/util/List;

    .line 432
    check-cast v1, Ljava/util/Collection;

    .line 92
    invoke-direct {p0}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->externalPaymentMethodTypes()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v1, v0}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-direct {p0}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->customPaymentMethodIds()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    .line 93
    iget-object v1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->paymentMethodOrder:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    return-object v0

    .line 97
    :cond_1
    invoke-direct {p0}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->orderedPaymentMethodTypes()Ljava/util/List;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->mapOrderToIndex(Ljava/util/List;)Ljava/util/Map;

    move-result-object v1

    .line 98
    check-cast v0, Ljava/lang/Iterable;

    .line 436
    new-instance v2, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata$supportedPaymentMethodTypes$lambda$2$$inlined$sortedBy$1;

    invoke-direct {v2, v1}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata$supportedPaymentMethodTypes$lambda$2$$inlined$sortedBy$1;-><init>(Ljava/util/Map;)V

    check-cast v2, Ljava/util/Comparator;

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final supportedSavedPaymentMethodTypes()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/PaymentMethod$Type;",
            ">;"
        }
    .end annotation

    .line 106
    invoke-direct {p0}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->supportedPaymentMethodDefinitions()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 437
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/Collection;

    .line 438
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodDefinition;

    .line 107
    invoke-interface {v3}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodDefinition;->getSupportedAsSavedPaymentMethod()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 438
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 439
    :cond_1
    check-cast v1, Ljava/util/List;

    .line 437
    check-cast v1, Ljava/lang/Iterable;

    .line 440
    new-instance v0, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v0, Ljava/util/Collection;

    .line 441
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 442
    check-cast v2, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodDefinition;

    .line 109
    invoke-interface {v2}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodDefinition;->getType()Lcom/stripe/android/model/PaymentMethod$Type;

    move-result-object v2

    .line 442
    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 443
    :cond_2
    check-cast v0, Ljava/util/List;

    .line 112
    iget-boolean v1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->allowsLinkInSavedPaymentMethods:Z

    if-eqz v1, :cond_3

    .line 113
    check-cast v0, Ljava/util/Collection;

    sget-object v1, Lcom/stripe/android/model/PaymentMethod$Type;->Link:Lcom/stripe/android/model/PaymentMethod$Type;

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    :cond_3
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 28

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->stripeIntent:Lcom/stripe/android/model/StripeIntent;

    iget-object v2, v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->billingDetailsCollectionConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    iget-boolean v3, v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->allowsDelayedPaymentMethods:Z

    iget-boolean v4, v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->allowsPaymentMethodsRequiringShippingAddress:Z

    iget-boolean v5, v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->allowsLinkInSavedPaymentMethods:Z

    iget-object v6, v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->availableWallets:Ljava/util/List;

    iget-object v7, v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->paymentMethodOrder:Ljava/util/List;

    iget-object v8, v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->cbcEligibility:Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;

    iget-object v9, v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->merchantName:Ljava/lang/String;

    iget-object v10, v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->defaultBillingDetails:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    iget-object v11, v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->shippingDetails:Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    iget-object v12, v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->sharedDataSpecs:Ljava/util/List;

    iget-object v13, v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->displayableCustomPaymentMethods:Ljava/util/List;

    iget-object v14, v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->externalPaymentMethodSpecs:Ljava/util/List;

    iget-object v15, v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->customerMetadata:Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;

    move-object/from16 v16, v15

    iget-boolean v15, v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->isGooglePayReady:Z

    move/from16 v17, v15

    iget-object v15, v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->linkConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;

    move-object/from16 v18, v15

    iget-object v15, v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->paymentMethodSaveConsentBehavior:Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;

    move-object/from16 v19, v15

    iget-object v15, v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->linkMode:Lcom/stripe/android/model/LinkMode;

    move-object/from16 v20, v15

    iget-object v15, v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->linkState:Lcom/stripe/android/paymentsheet/state/LinkState;

    move-object/from16 v21, v15

    iget-object v15, v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->paymentMethodIncentive:Lcom/stripe/android/paymentsheet/model/PaymentMethodIncentive;

    move-object/from16 v22, v15

    iget-object v15, v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->financialConnectionsAvailability:Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;

    move-object/from16 v23, v15

    iget-object v15, v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->cardBrandFilter:Lcom/stripe/android/CardBrandFilter;

    move-object/from16 v24, v15

    iget-object v15, v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->elementsSessionId:Ljava/lang/String;

    move-object/from16 v25, v15

    iget-object v15, v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->shopPayConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;

    move-object/from16 v26, v15

    iget-object v15, v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->termsDisplay:Ljava/util/Map;

    new-instance v0, Ljava/lang/StringBuilder;

    move-object/from16 v27, v15

    const-string v15, "PaymentMethodMetadata(stripeIntent="

    invoke-direct {v0, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", billingDetailsCollectionConfiguration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", allowsDelayedPaymentMethods="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", allowsPaymentMethodsRequiringShippingAddress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", allowsLinkInSavedPaymentMethods="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", availableWallets="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", paymentMethodOrder="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", cbcEligibility="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", merchantName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", defaultBillingDetails="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", shippingDetails="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", sharedDataSpecs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", displayableCustomPaymentMethods="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", externalPaymentMethodSpecs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", customerMetadata="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", isGooglePayReady="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", linkConfiguration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", paymentMethodSaveConsentBehavior="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", linkMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", linkState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", paymentMethodIncentive="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", financialConnectionsAvailability="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", cardBrandFilter="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", elementsSessionId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v25

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", shopPayConfiguration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", termsDisplay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->stripeIntent:Lcom/stripe/android/model/StripeIntent;

    check-cast v0, Landroid/os/Parcelable;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->billingDetailsCollectionConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;->writeToParcel(Landroid/os/Parcel;I)V

    iget-boolean v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->allowsDelayedPaymentMethods:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->allowsPaymentMethodsRequiringShippingAddress:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->allowsLinkInSavedPaymentMethods:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->availableWallets:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/lpmfoundations/paymentmethod/WalletType;

    invoke-virtual {v1}, Lcom/stripe/android/lpmfoundations/paymentmethod/WalletType;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->paymentMethodOrder:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->cbcEligibility:Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;

    check-cast v0, Landroid/os/Parcelable;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->merchantName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->defaultBillingDetails:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_1
    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->shippingDetails:Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    if-nez v0, :cond_2

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_2

    :cond_2
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_2
    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->sharedDataSpecs:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {p1, v3}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/os/Parcelable;

    invoke-virtual {p1, v3, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    goto :goto_3

    :cond_3
    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->displayableCustomPaymentMethods:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {p1, v3}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/stripe/android/lpmfoundations/paymentmethod/DisplayableCustomPaymentMethod;

    invoke-virtual {v3, p1, p2}, Lcom/stripe/android/lpmfoundations/paymentmethod/DisplayableCustomPaymentMethod;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_4

    :cond_4
    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->externalPaymentMethodSpecs:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {p1, v3}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/os/Parcelable;

    invoke-virtual {p1, v3, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    goto :goto_5

    :cond_5
    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->customerMetadata:Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;

    if-nez v0, :cond_6

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_6

    :cond_6
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_6
    iget-boolean v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->isGooglePayReady:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->linkConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->paymentMethodSaveConsentBehavior:Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;

    check-cast v0, Landroid/os/Parcelable;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->linkMode:Lcom/stripe/android/model/LinkMode;

    if-nez v0, :cond_7

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_7

    :cond_7
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0}, Lcom/stripe/android/model/LinkMode;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    :goto_7
    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->linkState:Lcom/stripe/android/paymentsheet/state/LinkState;

    if-nez v0, :cond_8

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_8

    :cond_8
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/paymentsheet/state/LinkState;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_8
    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->paymentMethodIncentive:Lcom/stripe/android/paymentsheet/model/PaymentMethodIncentive;

    if-nez v0, :cond_9

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_9

    :cond_9
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/paymentsheet/model/PaymentMethodIncentive;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_9
    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->financialConnectionsAvailability:Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;

    if-nez v0, :cond_a

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_a

    :cond_a
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0}, Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    :goto_a
    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->cardBrandFilter:Lcom/stripe/android/CardBrandFilter;

    check-cast v0, Landroid/os/Parcelable;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->elementsSessionId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->shopPayConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;

    if-nez v0, :cond_b

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_b

    :cond_b
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_b
    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->termsDisplay:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/os/Parcelable;

    invoke-virtual {p1, v2, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/paymentsheet/PaymentSheet$TermsDisplay;

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$TermsDisplay;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    goto :goto_c

    :cond_c
    return-void
.end method
