.class public final Lcom/stripe/android/customersheet/CustomerSheetViewModel;
.super Landroidx/lifecycle/ViewModel;
.source "CustomerSheetViewModel.kt"


# annotations
.annotation runtime Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelScope;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/customersheet/CustomerSheetViewModel$Companion;,
        Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;,
        Lcom/stripe/android/customersheet/CustomerSheetViewModel$Factory;,
        Lcom/stripe/android/customersheet/CustomerSheetViewModel$SelectionConfirmationState;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCustomerSheetViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomerSheetViewModel.kt\ncom/stripe/android/customersheet/CustomerSheetViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 CustomerSheetDataResultKtx.kt\ncom/stripe/android/customersheet/data/CustomerSheetDataResultKtxKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1343:1\n1256#1:1344\n1257#1:1348\n1258#1,5:1352\n1263#1:1358\n1265#1:1361\n1256#1:1372\n1257#1:1376\n1258#1,5:1380\n1263#1:1386\n1265#1:1389\n1256#1:1390\n1257#1:1394\n1258#1,2:1398\n1261#1,2:1402\n1263#1:1405\n1265#1:1408\n1256#1:1436\n1257#1:1440\n1258#1,5:1444\n1263#1:1450\n1265#1:1453\n1256#1:1454\n1257#1:1458\n1258#1,5:1462\n1263#1:1468\n1265#1:1471\n1256#1:1472\n1257#1:1476\n1258#1,5:1480\n1263#1:1486\n1265#1:1489\n1256#1:1490\n1257#1:1494\n1258#1,5:1498\n1263#1:1504\n1265#1:1507\n1256#1:1508\n1257#1:1512\n1258#1,5:1516\n1263#1:1522\n1265#1:1525\n1256#1:1526\n1257#1:1530\n1258#1,5:1534\n1263#1:1540\n1265#1:1543\n1256#1:1560\n1257#1:1564\n1258#1,5:1568\n1263#1:1574\n1265#1:1577\n1256#1:1586\n1257#1:1590\n1258#1,5:1594\n1263#1:1600\n1265#1:1603\n230#2,3:1345\n233#2,2:1359\n230#2,5:1362\n230#2,5:1367\n230#2,3:1373\n233#2,2:1387\n230#2,3:1391\n233#2,2:1406\n230#2,3:1437\n233#2,2:1451\n230#2,3:1455\n233#2,2:1469\n230#2,3:1473\n233#2,2:1487\n230#2,3:1491\n233#2,2:1505\n230#2,3:1509\n233#2,2:1523\n230#2,3:1527\n233#2,2:1541\n230#2,3:1561\n233#2,2:1575\n230#2,3:1587\n233#2,2:1601\n230#2,5:1605\n230#2,3:1610\n233#2,2:1617\n1557#3:1349\n1628#3,2:1350\n1630#3:1357\n1557#3:1377\n1628#3,2:1378\n1630#3:1385\n1557#3:1395\n1628#3,2:1396\n230#3,2:1400\n1630#3:1404\n774#3:1433\n865#3,2:1434\n1557#3:1441\n1628#3,2:1442\n1630#3:1449\n1557#3:1459\n1628#3,2:1460\n1630#3:1467\n1557#3:1477\n1628#3,2:1478\n1630#3:1485\n1557#3:1495\n1628#3,2:1496\n1630#3:1503\n1557#3:1513\n1628#3,2:1514\n1630#3:1521\n1557#3:1531\n1628#3,2:1532\n1630#3:1539\n1557#3:1565\n1628#3,2:1566\n1630#3:1573\n1557#3:1591\n1628#3,2:1592\n1630#3:1599\n1557#3:1613\n1628#3,3:1614\n54#4,4:1409\n63#4,6:1413\n54#4,4:1419\n63#4,6:1423\n54#4,4:1429\n42#4,2:1544\n92#4,5:1546\n44#4,3:1551\n63#4,6:1554\n54#4,4:1578\n63#4,4:1582\n68#4:1604\n1#5:1619\n*S KotlinDebug\n*F\n+ 1 CustomerSheetViewModel.kt\ncom/stripe/android/customersheet/CustomerSheetViewModel\n*L\n310#1:1344\n310#1:1348\n310#1:1352,5\n310#1:1358\n310#1:1361\n448#1:1372\n448#1:1376\n448#1:1380,5\n448#1:1386\n448#1:1389\n491#1:1390\n491#1:1394\n491#1:1398,2\n491#1:1402,2\n491#1:1405\n491#1:1408\n714#1:1436\n714#1:1440\n714#1:1444,5\n714#1:1450\n714#1:1453\n881#1:1454\n881#1:1458\n881#1:1462,5\n881#1:1468\n881#1:1471\n900#1:1472\n900#1:1476\n900#1:1480,5\n900#1:1486\n900#1:1489\n911#1:1490\n911#1:1494\n911#1:1498,5\n911#1:1504\n911#1:1507\n936#1:1508\n936#1:1512\n936#1:1516,5\n936#1:1522\n936#1:1525\n944#1:1526\n944#1:1530\n944#1:1534,5\n944#1:1540\n944#1:1543\n1066#1:1560\n1066#1:1564\n1066#1:1568,5\n1066#1:1574\n1066#1:1577\n1092#1:1586\n1092#1:1590\n1092#1:1594,5\n1092#1:1600\n1092#1:1603\n310#1:1345,3\n310#1:1359,2\n397#1:1362,5\n408#1:1367,5\n448#1:1373,3\n448#1:1387,2\n491#1:1391,3\n491#1:1406,2\n714#1:1437,3\n714#1:1451,2\n881#1:1455,3\n881#1:1469,2\n900#1:1473,3\n900#1:1487,2\n911#1:1491,3\n911#1:1505,2\n936#1:1509,3\n936#1:1523,2\n944#1:1527,3\n944#1:1541,2\n1066#1:1561,3\n1066#1:1575,2\n1092#1:1587,3\n1092#1:1601,2\n1250#1:1605,5\n1256#1:1610,3\n1256#1:1617,2\n310#1:1349\n310#1:1350,2\n310#1:1357\n448#1:1377\n448#1:1378,2\n448#1:1385\n491#1:1395\n491#1:1396,2\n496#1:1400,2\n491#1:1404\n617#1:1433\n617#1:1434,2\n714#1:1441\n714#1:1442,2\n714#1:1449\n881#1:1459\n881#1:1460,2\n881#1:1467\n900#1:1477\n900#1:1478,2\n900#1:1485\n911#1:1495\n911#1:1496,2\n911#1:1503\n936#1:1513\n936#1:1514,2\n936#1:1521\n944#1:1531\n944#1:1532,2\n944#1:1539\n1066#1:1565\n1066#1:1566,2\n1066#1:1573\n1092#1:1591\n1092#1:1592,2\n1092#1:1599\n1257#1:1613\n1257#1:1614,3\n507#1:1409,4\n509#1:1413,6\n535#1:1419,4\n541#1:1423,6\n597#1:1429,4\n983#1:1544,2\n983#1:1546,5\n983#1:1551,3\n993#1:1554,6\n1079#1:1578,4\n1084#1:1582,4\n1084#1:1604\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00ee\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0016\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0001\u0018\u0000 \u00be\u00012\u00020\u0001:\u0008\u00bc\u0001\u00bd\u0001\u00be\u0001\u00bf\u0001B\u00b7\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u0012\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n\u0012\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\r0\n\u0012\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\n\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u001b\u0012\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u001d\u0012\u000c\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020!0 \u0012\u0006\u0010\"\u001a\u00020#\u0012\u0006\u0010$\u001a\u00020%\u0012\u0006\u0010&\u001a\u00020\'\u00a2\u0006\u0004\u0008(\u0010)B\u0093\u0001\u0008\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0008\u0008\u0003\u0010\u001a\u001a\u00020\u001b\u0012\u000e\u0008\u0001\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u001d\u0012\u000e\u0008\u0001\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020!0 \u0012\u0006\u0010\"\u001a\u00020#\u0012\u0006\u0010$\u001a\u00020%\u0012\u0006\u0010&\u001a\u00020\'\u00a2\u0006\u0004\u0008(\u0010*J\u000e\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020IJ\u0006\u0010J\u001a\u00020\u001eJ\u0016\u0010K\u001a\u00020L2\u000e\u0010M\u001a\n\u0018\u00010!j\u0004\u0018\u0001`NJ\u0016\u0010O\u001a\u00020G2\u0006\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020SJ\u000e\u0010T\u001a\u00020GH\u0082@\u00a2\u0006\u0002\u0010UJ\u0008\u0010V\u001a\u00020GH\u0002J\u0008\u0010W\u001a\u00020GH\u0002J\u0008\u0010X\u001a\u00020GH\u0002J\u0008\u0010Y\u001a\u00020GH\u0002J\u0008\u0010Z\u001a\u00020GH\u0002J\u0010\u0010[\u001a\u00020G2\u0006\u0010\\\u001a\u00020CH\u0002J\u0012\u0010]\u001a\u00020G2\u0008\u0010^\u001a\u0004\u0018\u00010_H\u0002J\u001c\u0010`\u001a\u0008\u0012\u0004\u0012\u00020b0a2\u0006\u0010\\\u001a\u00020bH\u0082@\u00a2\u0006\u0002\u0010cJ$\u0010d\u001a\u0008\u0012\u0004\u0012\u00020b0a2\u0006\u0010\\\u001a\u00020b2\u0006\u0010e\u001a\u00020fH\u0082@\u00a2\u0006\u0002\u0010gJ\u0010\u0010h\u001a\u00020G2\u0006\u0010\\\u001a\u00020bH\u0002J\u0010\u0010i\u001a\u00020G2\u0006\u0010\\\u001a\u00020jH\u0002J\u0018\u0010k\u001a\u0004\u0018\u00010l2\u0006\u0010\\\u001a\u00020bH\u0082@\u00a2\u0006\u0002\u0010cJ&\u0010m\u001a\u0008\u0012\u0004\u0012\u00020b0n2\u0006\u0010\\\u001a\u00020b2\u0006\u0010e\u001a\u00020fH\u0082@\u00a2\u0006\u0004\u0008o\u0010gJ\u0016\u0010p\u001a\u00020G2\u0006\u0010\\\u001a\u00020bH\u0082@\u00a2\u0006\u0002\u0010cJ\u0010\u0010q\u001a\u00020G2\u0006\u0010r\u001a\u00020bH\u0002J\u0012\u0010s\u001a\u00020G2\u0008\u0010t\u001a\u0004\u0018\u00010\u0005H\u0002J\u0008\u0010u\u001a\u00020GH\u0002J\u0010\u0010v\u001a\u00020G2\u0006\u0010w\u001a\u00020xH\u0002J\u0010\u0010y\u001a\u00020G2\u0006\u0010z\u001a\u00020\u001eH\u0002J\u0012\u0010{\u001a\u00020|2\u0008\u0010}\u001a\u0004\u0018\u00010~H\u0002J$\u0010\u007f\u001a\u00020G2\u001a\u0010\u0080\u0001\u001a\u0015\u0012\u0007\u0012\u0005\u0018\u00010\u0082\u0001\u0012\u0007\u0012\u0005\u0018\u00010\u0082\u00010\u0081\u0001H\u0002J\u001d\u0010\u0083\u0001\u001a\u00020G2\t\u0010\u0084\u0001\u001a\u0004\u0018\u00010L2\u0007\u0010\u0085\u0001\u001a\u00020\u001eH\u0002J\u0014\u0010\u0086\u0001\u001a\u00020G2\t\u0010t\u001a\u0005\u0018\u00010\u0087\u0001H\u0002J\t\u0010\u0088\u0001\u001a\u00020GH\u0002J\u0013\u0010\u0089\u0001\u001a\u00020G2\u0008\u0010\u008a\u0001\u001a\u00030\u008b\u0001H\u0002J\u0013\u0010\u008c\u0001\u001a\u00020G2\u0008\u0010\u008d\u0001\u001a\u00030\u008e\u0001H\u0002J\u0014\u0010\u008f\u0001\u001a\u00020G2\t\u0010\u0090\u0001\u001a\u0004\u0018\u00010LH\u0002J\t\u0010\u0091\u0001\u001a\u00020GH\u0002J\u001f\u0010\u0092\u0001\u001a\u00020G2\u0014\u0010\u0093\u0001\u001a\u000f\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020?0\u0081\u0001H\u0002J\u001f\u0010\u0094\u0001\u001a\u00020G2\u0014\u0010\u0093\u0001\u001a\u000f\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020=0\u0081\u0001H\u0002J\"\u0010\u0095\u0001\u001a\u0008\u0012\u0004\u0012\u00020b0n2\u0007\u0010\u0096\u0001\u001a\u00020xH\u0082@\u00a2\u0006\u0006\u0008\u0097\u0001\u0010\u0098\u0001J\u0011\u0010\u0099\u0001\u001a\u00020G2\u0006\u0010\\\u001a\u00020bH\u0002J\u0017\u0010\u009a\u0001\u001a\u00020G2\u0006\u0010\\\u001a\u00020bH\u0082@\u00a2\u0006\u0002\u0010cJ)\u0010\u009b\u0001\u001a\u00020G2\u0006\u0010}\u001a\u00020~2\u0007\u0010\u009c\u0001\u001a\u00020!2\u0006\u0010\\\u001a\u00020bH\u0082@\u00a2\u0006\u0003\u0010\u009d\u0001J\u0019\u0010\u009e\u0001\u001a\u00020G2\u0007\u0010\u009f\u0001\u001a\u00020!H\u0082@\u00a2\u0006\u0003\u0010\u00a0\u0001J\u0018\u0010\u00a1\u0001\u001a\u00020G2\u0007\u0010\u00a2\u0001\u001a\u00020bH\u0082@\u00a2\u0006\u0002\u0010cJ\u0015\u0010\u00a3\u0001\u001a\u00020G2\n\u0010\u00a4\u0001\u001a\u0005\u0018\u00010\u00a5\u0001H\u0002J\t\u0010\u00a6\u0001\u001a\u00020GH\u0002J/\u0010\u00a7\u0001\u001a\u00020G2\u0008\u0010t\u001a\u0004\u0018\u00010\u00052\t\u0010\u00a8\u0001\u001a\u0004\u0018\u00010!2\t\u0010\u00a9\u0001\u001a\u0004\u0018\u00010\u001eH\u0002\u00a2\u0006\u0003\u0010\u00aa\u0001JC\u0010\u00ab\u0001\u001a\u00020G2\u0008\u0010t\u001a\u0004\u0018\u00010\u00052\t\u0010\u00a8\u0001\u001a\u0004\u0018\u00010!2\t\u0010\u00a9\u0001\u001a\u0004\u0018\u00010\u001e2\u0007\u0010\u00ac\u0001\u001a\u00020l2\t\u0010\u00ad\u0001\u001a\u0004\u0018\u00010!H\u0002\u00a2\u0006\u0003\u0010\u00ae\u0001J\u001d\u0010\u00af\u0001\u001a\u00020G2\u0007\u0010\u00b0\u0001\u001a\u0002002\t\u0008\u0002\u0010\u00b1\u0001\u001a\u00020\u001eH\u0002J/\u0010\u00b2\u0001\u001a\u00020G\"\u000b\u0008\u0000\u0010\u00b3\u0001\u0018\u0001*\u0002002\u0016\u0010\u00b4\u0001\u001a\u0011\u0012\u0005\u0012\u0003H\u00b3\u0001\u0012\u0005\u0012\u0003H\u00b3\u00010\u0081\u0001H\u0082\u0008J\u000f\u0010\u00b5\u0001\u001a\u00020\u000bH\u0082@\u00a2\u0006\u0002\u0010UJ\u000f\u0010\u00b6\u0001\u001a\u00020\rH\u0082@\u00a2\u0006\u0002\u0010UJ\u000f\u0010\u00b7\u0001\u001a\u00020\u000fH\u0082@\u00a2\u0006\u0002\u0010UR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\r0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020!0 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\'X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010-\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u0002000/0.X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u00101\u001a\u0008\u0012\u0004\u0012\u00020002\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00083\u00104R\u0016\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001060.X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010602\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00088\u00104R\u000e\u00109\u001a\u00020:X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010;\u001a\u0008\u0012\u0004\u0012\u00020\u001e0.X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010<\u001a\u0008\u0012\u0004\u0012\u00020=0.X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010>\u001a\u0008\u0012\u0004\u0012\u00020?0.X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010@\u001a\u0008\u0012\u0004\u0012\u00020A02X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010B\u001a\u0004\u0018\u00010CX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010D\u001a\u0008\u0012\u0004\u0012\u00020C0EX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u00b8\u0001\u001a\u0005\u0018\u00010\u00b9\u0001*\u0002008BX\u0082\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00ba\u0001\u0010\u00bb\u0001\u00a8\u0006\u00c0\u0001"
    }
    d2 = {
        "Lcom/stripe/android/customersheet/CustomerSheetViewModel;",
        "Landroidx/lifecycle/ViewModel;",
        "application",
        "Landroid/app/Application;",
        "originalPaymentSelection",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
        "paymentConfigurationProvider",
        "Ljavax/inject/Provider;",
        "Lcom/stripe/android/PaymentConfiguration;",
        "paymentMethodDataSourceProvider",
        "Lcom/stripe/android/common/coroutines/Single;",
        "Lcom/stripe/android/customersheet/data/CustomerSheetPaymentMethodDataSource;",
        "intentDataSourceProvider",
        "Lcom/stripe/android/customersheet/data/CustomerSheetIntentDataSource;",
        "savedSelectionDataSourceProvider",
        "Lcom/stripe/android/customersheet/data/CustomerSheetSavedSelectionDataSource;",
        "configuration",
        "Lcom/stripe/android/customersheet/CustomerSheet$Configuration;",
        "integrationType",
        "Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "stripeRepository",
        "Lcom/stripe/android/networking/StripeRepository;",
        "eventReporter",
        "Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;",
        "workContext",
        "Lkotlin/coroutines/CoroutineContext;",
        "isLiveModeProvider",
        "Lkotlin/Function0;",
        "",
        "productUsage",
        "",
        "",
        "confirmationHandlerFactory",
        "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Factory;",
        "customerSheetLoader",
        "Lcom/stripe/android/customersheet/CustomerSheetLoader;",
        "errorReporter",
        "Lcom/stripe/android/payments/core/analytics/ErrorReporter;",
        "<init>",
        "(Landroid/app/Application;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Ljavax/inject/Provider;Lcom/stripe/android/common/coroutines/Single;Lcom/stripe/android/common/coroutines/Single;Lcom/stripe/android/common/coroutines/Single;Lcom/stripe/android/customersheet/CustomerSheet$Configuration;Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;Lcom/stripe/android/core/Logger;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function0;Ljava/util/Set;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Factory;Lcom/stripe/android/customersheet/CustomerSheetLoader;Lcom/stripe/android/payments/core/analytics/ErrorReporter;)V",
        "(Landroid/app/Application;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Ljavax/inject/Provider;Lcom/stripe/android/customersheet/CustomerSheet$Configuration;Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;Lcom/stripe/android/core/Logger;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function0;Ljava/util/Set;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Factory;Lcom/stripe/android/customersheet/CustomerSheetLoader;Lcom/stripe/android/payments/core/analytics/ErrorReporter;)V",
        "cardAccountRangeRepositoryFactory",
        "Lcom/stripe/android/cards/DefaultCardAccountRangeRepositoryFactory;",
        "backStack",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "",
        "Lcom/stripe/android/customersheet/CustomerSheetViewState;",
        "viewState",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "getViewState",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "_result",
        "Lcom/stripe/android/customersheet/InternalCustomerSheetResult;",
        "result",
        "getResult",
        "confirmationHandler",
        "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;",
        "isEditing",
        "selectionConfirmationState",
        "Lcom/stripe/android/customersheet/CustomerSheetViewModel$SelectionConfirmationState;",
        "customerState",
        "Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;",
        "selectPaymentMethodState",
        "Lcom/stripe/android/customersheet/CustomerSheetViewState$SelectPaymentMethod;",
        "previouslySelectedPaymentMethod",
        "Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;",
        "supportedPaymentMethods",
        "",
        "handleViewAction",
        "",
        "viewAction",
        "Lcom/stripe/android/customersheet/CustomerSheetViewAction;",
        "bottomSheetConfirmStateChange",
        "providePaymentMethodName",
        "Lcom/stripe/android/core/strings/ResolvableString;",
        "code",
        "Lcom/stripe/android/model/PaymentMethodCode;",
        "registerFromActivity",
        "activityResultCaller",
        "Landroidx/activity/result/ActivityResultCaller;",
        "lifecycleOwner",
        "Landroidx/lifecycle/LifecycleOwner;",
        "loadCustomerSheetState",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "transitionToInitialScreen",
        "onAddCardPressed",
        "onDismissed",
        "onBackPressed",
        "onEditPressed",
        "onAddPaymentMethodItemChanged",
        "paymentMethod",
        "onFormFieldValuesCompleted",
        "formFieldValues",
        "Lcom/stripe/android/paymentsheet/forms/FormFieldValues;",
        "removePaymentMethod",
        "Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;",
        "Lcom/stripe/android/model/PaymentMethod;",
        "(Lcom/stripe/android/model/PaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "modifyCardPaymentMethod",
        "cardUpdateParams",
        "Lcom/stripe/android/paymentsheet/CardUpdateParams;",
        "(Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/paymentsheet/CardUpdateParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "handlePaymentMethodRemovedFromEditScreen",
        "onModifyItem",
        "Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;",
        "removeExecutor",
        "",
        "updatePaymentMethodExecutor",
        "Lkotlin/Result;",
        "updatePaymentMethodExecutor-0E7RQCE",
        "removePaymentMethodFromState",
        "updatePaymentMethodInState",
        "updatedMethod",
        "onItemSelected",
        "paymentSelection",
        "onPrimaryButtonPressed",
        "createAndAttach",
        "paymentMethodCreateParams",
        "Lcom/stripe/android/model/PaymentMethodCreateParams;",
        "transitionToAddPaymentMethod",
        "isFirstPaymentMethod",
        "createDefaultUsBankArguments",
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;",
        "stripeIntent",
        "Lcom/stripe/android/model/StripeIntent;",
        "updateCustomButtonUIState",
        "callback",
        "Lkotlin/Function1;",
        "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;",
        "updateMandateText",
        "mandateText",
        "showAbove",
        "onCollectUSBankAccountResult",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;",
        "onCardNumberInputCompleted",
        "onAnalyticsEvent",
        "event",
        "Lcom/stripe/android/core/networking/AnalyticsEvent;",
        "onDisallowedCardBrandEntered",
        "brand",
        "Lcom/stripe/android/model/CardBrand;",
        "onFormError",
        "error",
        "onCancelCloseForm",
        "setCustomerState",
        "update",
        "setSelectionConfirmationState",
        "createPaymentMethod",
        "createParams",
        "createPaymentMethod-gIAlu-s",
        "(Lcom/stripe/android/model/PaymentMethodCreateParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "attachPaymentMethodToCustomer",
        "attachWithSetupIntent",
        "handleStripeIntent",
        "clientSecret",
        "(Lcom/stripe/android/model/StripeIntent;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "attachPaymentMethod",
        "id",
        "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "refreshAndUpdatePaymentMethods",
        "newPaymentMethod",
        "selectSavedPaymentMethod",
        "savedPaymentSelection",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;",
        "selectGooglePay",
        "confirmPaymentSelection",
        "type",
        "syncDefaultEnabled",
        "(Lcom/stripe/android/paymentsheet/model/PaymentSelection;Ljava/lang/String;Ljava/lang/Boolean;)V",
        "confirmPaymentSelectionError",
        "cause",
        "displayMessage",
        "(Lcom/stripe/android/paymentsheet/model/PaymentSelection;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Throwable;Ljava/lang/String;)V",
        "transition",
        "to",
        "reset",
        "updateViewState",
        "T",
        "transform",
        "awaitPaymentMethodDataSource",
        "awaitIntentDataSource",
        "awaitSavedSelectionDataSource",
        "eventReporterScreen",
        "Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$Screen;",
        "getEventReporterScreen",
        "(Lcom/stripe/android/customersheet/CustomerSheetViewState;)Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$Screen;",
        "CustomerState",
        "SelectionConfirmationState",
        "Companion",
        "Factory",
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

.field public static final Companion:Lcom/stripe/android/customersheet/CustomerSheetViewModel$Companion;

.field public static final REMOVAL_TRANSITION_DELAY:J = 0x32L


# instance fields
.field private final _result:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Lcom/stripe/android/customersheet/InternalCustomerSheetResult;",
            ">;"
        }
    .end annotation
.end field

.field private final backStack:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Ljava/util/List<",
            "Lcom/stripe/android/customersheet/CustomerSheetViewState;",
            ">;>;"
        }
    .end annotation
.end field

.field private final cardAccountRangeRepositoryFactory:Lcom/stripe/android/cards/DefaultCardAccountRangeRepositoryFactory;

.field private final configuration:Lcom/stripe/android/customersheet/CustomerSheet$Configuration;

.field private final confirmationHandler:Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;

.field private final customerSheetLoader:Lcom/stripe/android/customersheet/CustomerSheetLoader;

.field private final customerState:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;",
            ">;"
        }
    .end annotation
.end field

.field private final errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

.field private final eventReporter:Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;

.field private final integrationType:Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;

.field private final intentDataSourceProvider:Lcom/stripe/android/common/coroutines/Single;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/stripe/android/common/coroutines/Single<",
            "Lcom/stripe/android/customersheet/data/CustomerSheetIntentDataSource;",
            ">;"
        }
    .end annotation
.end field

.field private final isEditing:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final isLiveModeProvider:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final logger:Lcom/stripe/android/core/Logger;

.field private originalPaymentSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection;

.field private final paymentConfigurationProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/PaymentConfiguration;",
            ">;"
        }
    .end annotation
.end field

.field private final paymentMethodDataSourceProvider:Lcom/stripe/android/common/coroutines/Single;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/stripe/android/common/coroutines/Single<",
            "Lcom/stripe/android/customersheet/data/CustomerSheetPaymentMethodDataSource;",
            ">;"
        }
    .end annotation
.end field

.field private previouslySelectedPaymentMethod:Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;

.field private final productUsage:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final result:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/customersheet/InternalCustomerSheetResult;",
            ">;"
        }
    .end annotation
.end field

.field private final savedSelectionDataSourceProvider:Lcom/stripe/android/common/coroutines/Single;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/stripe/android/common/coroutines/Single<",
            "Lcom/stripe/android/customersheet/data/CustomerSheetSavedSelectionDataSource;",
            ">;"
        }
    .end annotation
.end field

.field private final selectPaymentMethodState:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/customersheet/CustomerSheetViewState$SelectPaymentMethod;",
            ">;"
        }
    .end annotation
.end field

.field private final selectionConfirmationState:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Lcom/stripe/android/customersheet/CustomerSheetViewModel$SelectionConfirmationState;",
            ">;"
        }
    .end annotation
.end field

.field private final stripeRepository:Lcom/stripe/android/networking/StripeRepository;

.field private supportedPaymentMethods:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;",
            ">;"
        }
    .end annotation
.end field

.field private final viewState:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/customersheet/CustomerSheetViewState;",
            ">;"
        }
    .end annotation
.end field

.field private final workContext:Lkotlin/coroutines/CoroutineContext;


# direct methods
.method public static synthetic $r8$lambda$1dk-nun7oUG36tY7IFH_ZThblj4(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lcom/stripe/android/model/CardBrand;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->onModifyItem$lambda$19(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lcom/stripe/android/model/CardBrand;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$8W8Kinam7iWwxw79DM2DyM_nCVg(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->createDefaultUsBankArguments$lambda$29(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$GFzzAEIy96TKG8J10bubkQSRvZE(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$AnalyticsEvent;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->createDefaultUsBankArguments$lambda$27(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$AnalyticsEvent;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$Hz2J8up62iFHzqK2F_UCsDAq5Do(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->createDefaultUsBankArguments$lambda$30(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$JhVxAbl4cvLLETfDjGdX8kQM_2A(Lcom/stripe/android/link/ui/inline/InlineSignupViewState;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->transitionToAddPaymentMethod$lambda$26(Lcom/stripe/android/link/ui/inline/InlineSignupViewState;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$OEbJyBZxatLbwNo0-vAO63ayko8(Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;)Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->onItemSelected$lambda$23(Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;)Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$PfYGtv7ebTd7EkxxE8ULv_ly-i8(Lcom/stripe/android/customersheet/CustomerSheetViewModel$SelectionConfirmationState;)Lcom/stripe/android/customersheet/CustomerSheetViewModel$SelectionConfirmationState;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->onPrimaryButtonPressed$lambda$25(Lcom/stripe/android/customersheet/CustomerSheetViewModel$SelectionConfirmationState;)Lcom/stripe/android/customersheet/CustomerSheetViewModel$SelectionConfirmationState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$TRY-E5HesP4COGi2-HIFwrPzj9Q(Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->createDefaultUsBankArguments$lambda$31(Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$ZFjIoShYGUeBD8TcMfp3_KgRpIk(Ljava/util/List;)Lcom/stripe/android/customersheet/CustomerSheetViewState;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->viewState$lambda$0(Ljava/util/List;)Lcom/stripe/android/customersheet/CustomerSheetViewState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$ZnGR6E0XZ9xmvpzixzDW0qark0w(Lcom/stripe/android/customersheet/CustomerSheetViewModel;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->onModifyItem$lambda$20(Lcom/stripe/android/customersheet/CustomerSheetViewModel;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$eIVuP6TVoaNYbGDDz97NIdHpJyg(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;Lcom/stripe/android/customersheet/CustomerSheetViewModel$SelectionConfirmationState;Z)Lcom/stripe/android/customersheet/CustomerSheetViewState$SelectPaymentMethod;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->selectPaymentMethodState$lambda$2(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;Lcom/stripe/android/customersheet/CustomerSheetViewModel$SelectionConfirmationState;Z)Lcom/stripe/android/customersheet/CustomerSheetViewState$SelectPaymentMethod;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$f0RhcNvYJUWebnmXTemFy5K1pnM(Ljava/lang/String;Lcom/stripe/android/customersheet/CustomerSheetViewModel$SelectionConfirmationState;)Lcom/stripe/android/customersheet/CustomerSheetViewModel$SelectionConfirmationState;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->confirmPaymentSelectionError$lambda$47(Ljava/lang/String;Lcom/stripe/android/customersheet/CustomerSheetViewModel$SelectionConfirmationState;)Lcom/stripe/android/customersheet/CustomerSheetViewModel$SelectionConfirmationState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$pOqcZoVJdKmN2GFHVYwNBv1jGyE()Lkotlin/Unit;
    .locals 1

    invoke-static {}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->createDefaultUsBankArguments$lambda$33()Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic $r8$lambda$vXcLuKgwpt9KHCZp1qoTjJ2kxDg(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lcom/stripe/android/core/strings/ResolvableString;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->createDefaultUsBankArguments$lambda$32(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lcom/stripe/android/core/strings/ResolvableString;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$xN6ttP0Oks8vEXIXiBxp9W2s5-Q(Lcom/stripe/android/link/ui/inline/InlineSignupViewState;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->onAddPaymentMethodItemChanged$lambda$10$lambda$9(Lcom/stripe/android/link/ui/inline/InlineSignupViewState;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$yyA-uVJHsNraYvC5v3278u-PkL0(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lcom/stripe/android/core/strings/ResolvableString;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->createDefaultUsBankArguments$lambda$28(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lcom/stripe/android/core/strings/ResolvableString;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->Companion:Lcom/stripe/android/customersheet/CustomerSheetViewModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->$stable:I

    return-void
.end method

.method public constructor <init>(Landroid/app/Application;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Ljavax/inject/Provider;Lcom/stripe/android/common/coroutines/Single;Lcom/stripe/android/common/coroutines/Single;Lcom/stripe/android/common/coroutines/Single;Lcom/stripe/android/customersheet/CustomerSheet$Configuration;Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;Lcom/stripe/android/core/Logger;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function0;Ljava/util/Set;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Factory;Lcom/stripe/android/customersheet/CustomerSheetLoader;Lcom/stripe/android/payments/core/analytics/ErrorReporter;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Application;",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/PaymentConfiguration;",
            ">;",
            "Lcom/stripe/android/common/coroutines/Single<",
            "Lcom/stripe/android/customersheet/data/CustomerSheetPaymentMethodDataSource;",
            ">;",
            "Lcom/stripe/android/common/coroutines/Single<",
            "Lcom/stripe/android/customersheet/data/CustomerSheetIntentDataSource;",
            ">;",
            "Lcom/stripe/android/common/coroutines/Single<",
            "Lcom/stripe/android/customersheet/data/CustomerSheetSavedSelectionDataSource;",
            ">;",
            "Lcom/stripe/android/customersheet/CustomerSheet$Configuration;",
            "Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;",
            "Lcom/stripe/android/core/Logger;",
            "Lcom/stripe/android/networking/StripeRepository;",
            "Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;",
            "Lkotlin/coroutines/CoroutineContext;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Factory;",
            "Lcom/stripe/android/customersheet/CustomerSheetLoader;",
            "Lcom/stripe/android/payments/core/analytics/ErrorReporter;",
            ")V"
        }
    .end annotation

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    move-object/from16 v4, p5

    move-object/from16 v5, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    move-object/from16 v8, p9

    move-object/from16 v9, p10

    move-object/from16 v10, p11

    move-object/from16 v11, p12

    move-object/from16 v12, p13

    move-object/from16 v13, p14

    move-object/from16 v14, p15

    move-object/from16 v15, p16

    const-string v0, "application"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentConfigurationProvider"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentMethodDataSourceProvider"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "intentDataSourceProvider"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "savedSelectionDataSourceProvider"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configuration"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "integrationType"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stripeRepository"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventReporter"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "isLiveModeProvider"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "productUsage"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "confirmationHandlerFactory"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "customerSheetLoader"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorReporter"

    move-object/from16 v1, p17

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 110
    invoke-direct/range {p0 .. p0}, Landroidx/lifecycle/ViewModel;-><init>()V

    move-object/from16 v0, p0

    move-object/from16 v14, p2

    .line 94
    iput-object v14, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->originalPaymentSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    .line 95
    iput-object v2, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->paymentConfigurationProvider:Ljavax/inject/Provider;

    .line 96
    iput-object v3, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->paymentMethodDataSourceProvider:Lcom/stripe/android/common/coroutines/Single;

    .line 97
    iput-object v4, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->intentDataSourceProvider:Lcom/stripe/android/common/coroutines/Single;

    .line 98
    iput-object v5, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->savedSelectionDataSourceProvider:Lcom/stripe/android/common/coroutines/Single;

    .line 99
    iput-object v6, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->configuration:Lcom/stripe/android/customersheet/CustomerSheet$Configuration;

    .line 100
    iput-object v7, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->integrationType:Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;

    .line 101
    iput-object v8, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->logger:Lcom/stripe/android/core/Logger;

    .line 102
    iput-object v9, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    .line 103
    iput-object v10, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->eventReporter:Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;

    .line 104
    iput-object v11, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->workContext:Lkotlin/coroutines/CoroutineContext;

    .line 105
    iput-object v12, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->isLiveModeProvider:Lkotlin/jvm/functions/Function0;

    .line 106
    iput-object v13, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->productUsage:Ljava/util/Set;

    .line 108
    iput-object v15, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->customerSheetLoader:Lcom/stripe/android/customersheet/CustomerSheetLoader;

    .line 109
    iput-object v1, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    .line 148
    new-instance v1, Lcom/stripe/android/cards/DefaultCardAccountRangeRepositoryFactory;

    .line 149
    move-object/from16 v2, p1

    check-cast v2, Landroid/content/Context;

    .line 148
    invoke-direct {v1, v2, v13}, Lcom/stripe/android/cards/DefaultCardAccountRangeRepositoryFactory;-><init>(Landroid/content/Context;Ljava/util/Set;)V

    iput-object v1, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->cardAccountRangeRepositoryFactory:Lcom/stripe/android/cards/DefaultCardAccountRangeRepositoryFactory;

    .line 155
    new-instance v1, Lcom/stripe/android/customersheet/CustomerSheetViewState$Loading;

    .line 156
    invoke-interface {v12}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    .line 155
    invoke-direct {v1, v2}, Lcom/stripe/android/customersheet/CustomerSheetViewState$Loading;-><init>(Z)V

    .line 154
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 153
    invoke-static {v1}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->backStack:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 160
    check-cast v1, Lkotlinx/coroutines/flow/StateFlow;

    new-instance v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$$ExternalSyntheticLambda9;

    invoke-direct {v2}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$$ExternalSyntheticLambda9;-><init>()V

    invoke-static {v1, v2}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->mapAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->viewState:Lkotlinx/coroutines/flow/StateFlow;

    const/4 v2, 0x0

    .line 162
    invoke-static {v2}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v3

    iput-object v3, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->_result:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 163
    check-cast v3, Lkotlinx/coroutines/flow/StateFlow;

    iput-object v3, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->result:Lkotlinx/coroutines/flow/StateFlow;

    .line 165
    move-object v3, v0

    check-cast v3, Landroidx/lifecycle/ViewModel;

    invoke-static {v3}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v4

    move-object/from16 v14, p15

    invoke-interface {v14, v4}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Factory;->create(Lkotlinx/coroutines/CoroutineScope;)Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;

    move-result-object v4

    iput-object v4, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->confirmationHandler:Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;

    const/4 v4, 0x0

    .line 167
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-static {v5}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v5

    iput-object v5, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->isEditing:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 169
    new-instance v8, Lcom/stripe/android/customersheet/CustomerSheetViewModel$SelectionConfirmationState;

    invoke-direct {v8, v4, v2}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$SelectionConfirmationState;-><init>(ZLjava/lang/String;)V

    .line 168
    invoke-static {v8}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v8

    iput-object v8, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->selectionConfirmationState:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 176
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v9

    .line 178
    iget-object v12, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->originalPaymentSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    .line 179
    new-instance v13, Lcom/stripe/android/customersheet/CustomerPermissions;

    invoke-direct {v13, v4, v4, v4}, Lcom/stripe/android/customersheet/CustomerPermissions;-><init>(ZZZ)V

    .line 175
    new-instance v4, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;

    const/4 v14, 0x0

    move-object/from16 p1, v4

    move-object/from16 p6, v6

    move-object/from16 p2, v9

    move-object/from16 p3, v12

    move-object/from16 p5, v13

    move-object/from16 p4, v14

    invoke-direct/range {p1 .. p6}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;-><init>(Ljava/util/List;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lcom/stripe/android/customersheet/CustomerPermissions;Lcom/stripe/android/customersheet/CustomerSheet$Configuration;)V

    .line 174
    invoke-static {v4}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v4

    iput-object v4, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->customerState:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 189
    check-cast v4, Lkotlinx/coroutines/flow/StateFlow;

    .line 190
    check-cast v8, Lkotlinx/coroutines/flow/StateFlow;

    .line 191
    check-cast v5, Lkotlinx/coroutines/flow/StateFlow;

    .line 188
    new-instance v9, Lcom/stripe/android/customersheet/CustomerSheetViewModel$$ExternalSyntheticLambda10;

    invoke-direct {v9, v0}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$$ExternalSyntheticLambda10;-><init>(Lcom/stripe/android/customersheet/CustomerSheetViewModel;)V

    invoke-static {v4, v8, v5, v9}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->combineAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v4

    iput-object v4, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->selectPaymentMethodState:Lkotlinx/coroutines/flow/StateFlow;

    .line 221
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    check-cast v4, Ljava/util/List;

    iput-object v4, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->supportedPaymentMethods:Ljava/util/List;

    .line 224
    invoke-virtual {v6}, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->getAppearance()Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;

    move-result-object v4

    invoke-static {v4}, Lcom/stripe/android/paymentsheet/PaymentSheetConfigurationKtxKt;->parseAppearance(Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;)V

    .line 226
    invoke-interface {v10, v6, v7}, Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;->onInit(Lcom/stripe/android/customersheet/CustomerSheet$Configuration;Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;)V

    .line 228
    invoke-interface {v1}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v1

    instance-of v1, v1, Lcom/stripe/android/customersheet/CustomerSheetViewState$Loading;

    if-eqz v1, :cond_0

    .line 229
    invoke-static {v3}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    new-instance v4, Lcom/stripe/android/customersheet/CustomerSheetViewModel$1;

    invoke-direct {v4, v0, v2}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$1;-><init>(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 p1, v1

    move-object/from16 p4, v4

    move/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p3, v7

    move-object/from16 p2, v11

    invoke-static/range {p1 .. p6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 234
    :cond_0
    invoke-static {v3}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    new-instance v4, Lcom/stripe/android/customersheet/CustomerSheetViewModel$2;

    invoke-direct {v4, v0, v2}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$2;-><init>(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object/from16 p1, v1

    move-object/from16 p4, v4

    move/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p2, v7

    move-object/from16 p3, v8

    invoke-static/range {p1 .. p6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 242
    invoke-static {v3}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    new-instance v4, Lcom/stripe/android/customersheet/CustomerSheetViewModel$3;

    invoke-direct {v4, v0, v2}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$3;-><init>(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast v4, Lkotlin/jvm/functions/Function2;

    move-object/from16 p1, v1

    move-object/from16 p4, v4

    invoke-static/range {p1 .. p6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 260
    invoke-static {v3}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    new-instance v3, Lcom/stripe/android/customersheet/CustomerSheetViewModel$4;

    invoke-direct {v3, v0, v2}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$4;-><init>(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast v3, Lkotlin/jvm/functions/Function2;

    const/4 v2, 0x3

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object/from16 p1, v1

    move/from16 p5, v2

    move-object/from16 p4, v3

    move-object/from16 p6, v4

    move-object/from16 p2, v5

    move-object/from16 p3, v6

    invoke-static/range {p1 .. p6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/app/Application;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Ljavax/inject/Provider;Lcom/stripe/android/common/coroutines/Single;Lcom/stripe/android/common/coroutines/Single;Lcom/stripe/android/common/coroutines/Single;Lcom/stripe/android/customersheet/CustomerSheet$Configuration;Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;Lcom/stripe/android/core/Logger;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function0;Ljava/util/Set;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Factory;Lcom/stripe/android/customersheet/CustomerSheetLoader;Lcom/stripe/android/payments/core/analytics/ErrorReporter;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 19

    move/from16 v0, p18

    and-int/lit16 v0, v0, 0x800

    if-eqz v0, :cond_0

    .line 104
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v0

    check-cast v0, Lkotlin/coroutines/CoroutineContext;

    move-object v13, v0

    goto :goto_0

    :cond_0
    move-object/from16 v13, p12

    :goto_0
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move-object/from16 v18, p17

    .line 92
    invoke-direct/range {v1 .. v18}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;-><init>(Landroid/app/Application;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Ljavax/inject/Provider;Lcom/stripe/android/common/coroutines/Single;Lcom/stripe/android/common/coroutines/Single;Lcom/stripe/android/common/coroutines/Single;Lcom/stripe/android/customersheet/CustomerSheet$Configuration;Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;Lcom/stripe/android/core/Logger;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function0;Ljava/util/Set;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Factory;Lcom/stripe/android/customersheet/CustomerSheetLoader;Lcom/stripe/android/payments/core/analytics/ErrorReporter;)V

    return-void
.end method

.method public constructor <init>(Landroid/app/Application;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Ljavax/inject/Provider;Lcom/stripe/android/customersheet/CustomerSheet$Configuration;Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;Lcom/stripe/android/core/Logger;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function0;Ljava/util/Set;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Factory;Lcom/stripe/android/customersheet/CustomerSheetLoader;Lcom/stripe/android/payments/core/analytics/ErrorReporter;)V
    .locals 19
    .param p9    # Lkotlin/coroutines/CoroutineContext;
        .annotation runtime Lcom/stripe/android/core/injection/IOContext;
        .end annotation
    .end param
    .param p10    # Lkotlin/jvm/functions/Function0;
        .annotation runtime Ljavax/inject/Named;
            value = "isLiveMode"
        .end annotation
    .end param
    .param p11    # Ljava/util/Set;
        .annotation runtime Ljavax/inject/Named;
            value = "productUsage"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Application;",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/PaymentConfiguration;",
            ">;",
            "Lcom/stripe/android/customersheet/CustomerSheet$Configuration;",
            "Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;",
            "Lcom/stripe/android/core/Logger;",
            "Lcom/stripe/android/networking/StripeRepository;",
            "Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;",
            "Lkotlin/coroutines/CoroutineContext;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Factory;",
            "Lcom/stripe/android/customersheet/CustomerSheetLoader;",
            "Lcom/stripe/android/payments/core/analytics/ErrorReporter;",
            ")V"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "application"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentConfigurationProvider"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configuration"

    move-object/from16 v8, p4

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "integrationType"

    move-object/from16 v9, p5

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    move-object/from16 v10, p6

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stripeRepository"

    move-object/from16 v11, p7

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventReporter"

    move-object/from16 v12, p8

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    move-object/from16 v13, p9

    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "isLiveModeProvider"

    move-object/from16 v14, p10

    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "productUsage"

    move-object/from16 v15, p11

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "confirmationHandlerFactory"

    move-object/from16 v1, p12

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "customerSheetLoader"

    move-object/from16 v3, p13

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorReporter"

    move-object/from16 v5, p14

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 132
    sget-object v0, Lcom/stripe/android/customersheet/util/CustomerSheetHacks;->INSTANCE:Lcom/stripe/android/customersheet/util/CustomerSheetHacks;

    invoke-virtual {v0}, Lcom/stripe/android/customersheet/util/CustomerSheetHacks;->getPaymentMethodDataSource()Lcom/stripe/android/common/coroutines/Single;

    move-result-object v0

    .line 133
    sget-object v6, Lcom/stripe/android/customersheet/util/CustomerSheetHacks;->INSTANCE:Lcom/stripe/android/customersheet/util/CustomerSheetHacks;

    invoke-virtual {v6}, Lcom/stripe/android/customersheet/util/CustomerSheetHacks;->getIntentDataSource()Lcom/stripe/android/common/coroutines/Single;

    move-result-object v6

    .line 134
    sget-object v7, Lcom/stripe/android/customersheet/util/CustomerSheetHacks;->INSTANCE:Lcom/stripe/android/customersheet/util/CustomerSheetHacks;

    invoke-virtual {v7}, Lcom/stripe/android/customersheet/util/CustomerSheetHacks;->getSavedSelectionDataSource()Lcom/stripe/android/common/coroutines/Single;

    move-result-object v7

    move-object/from16 v16, v1

    move-object/from16 v17, v3

    move-object/from16 v18, v5

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    move-object v5, v0

    .line 128
    invoke-direct/range {v1 .. v18}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;-><init>(Landroid/app/Application;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Ljavax/inject/Provider;Lcom/stripe/android/common/coroutines/Single;Lcom/stripe/android/common/coroutines/Single;Lcom/stripe/android/common/coroutines/Single;Lcom/stripe/android/customersheet/CustomerSheet$Configuration;Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;Lcom/stripe/android/core/Logger;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function0;Ljava/util/Set;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Factory;Lcom/stripe/android/customersheet/CustomerSheetLoader;Lcom/stripe/android/payments/core/analytics/ErrorReporter;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/app/Application;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Ljavax/inject/Provider;Lcom/stripe/android/customersheet/CustomerSheet$Configuration;Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;Lcom/stripe/android/core/Logger;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function0;Ljava/util/Set;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Factory;Lcom/stripe/android/customersheet/CustomerSheetLoader;Lcom/stripe/android/payments/core/analytics/ErrorReporter;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 16

    move/from16 v0, p15

    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_0

    .line 122
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v0

    check-cast v0, Lkotlin/coroutines/CoroutineContext;

    move-object v10, v0

    goto :goto_0

    :cond_0
    move-object/from16 v10, p9

    :goto_0
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    .line 112
    invoke-direct/range {v1 .. v15}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;-><init>(Landroid/app/Application;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Ljavax/inject/Provider;Lcom/stripe/android/customersheet/CustomerSheet$Configuration;Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;Lcom/stripe/android/core/Logger;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function0;Ljava/util/Set;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Factory;Lcom/stripe/android/customersheet/CustomerSheetLoader;Lcom/stripe/android/payments/core/analytics/ErrorReporter;)V

    return-void
.end method

.method public static final synthetic access$attachPaymentMethod(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 91
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->attachPaymentMethod(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$attachPaymentMethodToCustomer(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lcom/stripe/android/model/PaymentMethod;)V
    .locals 0

    .line 91
    invoke-direct {p0, p1}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->attachPaymentMethodToCustomer(Lcom/stripe/android/model/PaymentMethod;)V

    return-void
.end method

.method public static final synthetic access$attachWithSetupIntent(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lcom/stripe/android/model/PaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 91
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->attachWithSetupIntent(Lcom/stripe/android/model/PaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$awaitIntentDataSource(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 91
    invoke-direct {p0, p1}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->awaitIntentDataSource(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$awaitPaymentMethodDataSource(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 91
    invoke-direct {p0, p1}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->awaitPaymentMethodDataSource(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$awaitSavedSelectionDataSource(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 91
    invoke-direct {p0, p1}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->awaitSavedSelectionDataSource(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$confirmPaymentSelection(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Ljava/lang/String;Ljava/lang/Boolean;)V
    .locals 0

    .line 91
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->confirmPaymentSelection(Lcom/stripe/android/paymentsheet/model/PaymentSelection;Ljava/lang/String;Ljava/lang/Boolean;)V

    return-void
.end method

.method public static final synthetic access$confirmPaymentSelectionError(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 0

    .line 91
    invoke-direct/range {p0 .. p5}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->confirmPaymentSelectionError(Lcom/stripe/android/paymentsheet/model/PaymentSelection;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic access$createPaymentMethod-gIAlu-s(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lcom/stripe/android/model/PaymentMethodCreateParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 91
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->createPaymentMethod-gIAlu-s(Lcom/stripe/android/model/PaymentMethodCreateParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getBackStack$p(Lcom/stripe/android/customersheet/CustomerSheetViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 0

    .line 91
    iget-object p0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->backStack:Lkotlinx/coroutines/flow/MutableStateFlow;

    return-object p0
.end method

.method public static final synthetic access$getConfiguration$p(Lcom/stripe/android/customersheet/CustomerSheetViewModel;)Lcom/stripe/android/customersheet/CustomerSheet$Configuration;
    .locals 0

    .line 91
    iget-object p0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->configuration:Lcom/stripe/android/customersheet/CustomerSheet$Configuration;

    return-object p0
.end method

.method public static final synthetic access$getCustomerSheetLoader$p(Lcom/stripe/android/customersheet/CustomerSheetViewModel;)Lcom/stripe/android/customersheet/CustomerSheetLoader;
    .locals 0

    .line 91
    iget-object p0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->customerSheetLoader:Lcom/stripe/android/customersheet/CustomerSheetLoader;

    return-object p0
.end method

.method public static final synthetic access$getCustomerState$p(Lcom/stripe/android/customersheet/CustomerSheetViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 0

    .line 91
    iget-object p0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->customerState:Lkotlinx/coroutines/flow/MutableStateFlow;

    return-object p0
.end method

.method public static final synthetic access$getErrorReporter$p(Lcom/stripe/android/customersheet/CustomerSheetViewModel;)Lcom/stripe/android/payments/core/analytics/ErrorReporter;
    .locals 0

    .line 91
    iget-object p0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    return-object p0
.end method

.method public static final synthetic access$getLogger$p(Lcom/stripe/android/customersheet/CustomerSheetViewModel;)Lcom/stripe/android/core/Logger;
    .locals 0

    .line 91
    iget-object p0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->logger:Lcom/stripe/android/core/Logger;

    return-object p0
.end method

.method public static final synthetic access$getOriginalPaymentSelection$p(Lcom/stripe/android/customersheet/CustomerSheetViewModel;)Lcom/stripe/android/paymentsheet/model/PaymentSelection;
    .locals 0

    .line 91
    iget-object p0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->originalPaymentSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    return-object p0
.end method

.method public static final synthetic access$getSelectPaymentMethodState$p(Lcom/stripe/android/customersheet/CustomerSheetViewModel;)Lkotlinx/coroutines/flow/StateFlow;
    .locals 0

    .line 91
    iget-object p0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->selectPaymentMethodState:Lkotlinx/coroutines/flow/StateFlow;

    return-object p0
.end method

.method public static final synthetic access$getSelectionConfirmationState$p(Lcom/stripe/android/customersheet/CustomerSheetViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 0

    .line 91
    iget-object p0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->selectionConfirmationState:Lkotlinx/coroutines/flow/MutableStateFlow;

    return-object p0
.end method

.method public static final synthetic access$getSupportedPaymentMethods$p(Lcom/stripe/android/customersheet/CustomerSheetViewModel;)Ljava/util/List;
    .locals 0

    .line 91
    iget-object p0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->supportedPaymentMethods:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic access$getWorkContext$p(Lcom/stripe/android/customersheet/CustomerSheetViewModel;)Lkotlin/coroutines/CoroutineContext;
    .locals 0

    .line 91
    iget-object p0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->workContext:Lkotlin/coroutines/CoroutineContext;

    return-object p0
.end method

.method public static final synthetic access$get_result$p(Lcom/stripe/android/customersheet/CustomerSheetViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 0

    .line 91
    iget-object p0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->_result:Lkotlinx/coroutines/flow/MutableStateFlow;

    return-object p0
.end method

.method public static final synthetic access$handlePaymentMethodRemovedFromEditScreen(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lcom/stripe/android/model/PaymentMethod;)V
    .locals 0

    .line 91
    invoke-direct {p0, p1}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->handlePaymentMethodRemovedFromEditScreen(Lcom/stripe/android/model/PaymentMethod;)V

    return-void
.end method

.method public static final synthetic access$handleStripeIntent(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lcom/stripe/android/model/StripeIntent;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 91
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->handleStripeIntent(Lcom/stripe/android/model/StripeIntent;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$isEditing$p(Lcom/stripe/android/customersheet/CustomerSheetViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 0

    .line 91
    iget-object p0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->isEditing:Lkotlinx/coroutines/flow/MutableStateFlow;

    return-object p0
.end method

.method public static final synthetic access$loadCustomerSheetState(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 91
    invoke-direct {p0, p1}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->loadCustomerSheetState(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$modifyCardPaymentMethod(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/paymentsheet/CardUpdateParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 91
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->modifyCardPaymentMethod(Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/paymentsheet/CardUpdateParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$onBackPressed(Lcom/stripe/android/customersheet/CustomerSheetViewModel;)V
    .locals 0

    .line 91
    invoke-direct {p0}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->onBackPressed()V

    return-void
.end method

.method public static final synthetic access$onDismissed(Lcom/stripe/android/customersheet/CustomerSheetViewModel;)V
    .locals 0

    .line 91
    invoke-direct {p0}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->onDismissed()V

    return-void
.end method

.method public static final synthetic access$refreshAndUpdatePaymentMethods(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lcom/stripe/android/model/PaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 91
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->refreshAndUpdatePaymentMethods(Lcom/stripe/android/model/PaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$removeExecutor(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lcom/stripe/android/model/PaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 91
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->removeExecutor(Lcom/stripe/android/model/PaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$removePaymentMethod(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lcom/stripe/android/model/PaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 91
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->removePaymentMethod(Lcom/stripe/android/model/PaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$removePaymentMethodFromState(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lcom/stripe/android/model/PaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 91
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->removePaymentMethodFromState(Lcom/stripe/android/model/PaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$setCustomerState(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 91
    invoke-direct {p0, p1}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->setCustomerState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final synthetic access$setOriginalPaymentSelection$p(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V
    .locals 0

    .line 91
    iput-object p1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->originalPaymentSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    return-void
.end method

.method public static final synthetic access$transition(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lcom/stripe/android/customersheet/CustomerSheetViewState;Z)V
    .locals 0

    .line 91
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->transition(Lcom/stripe/android/customersheet/CustomerSheetViewState;Z)V

    return-void
.end method

.method public static final synthetic access$transitionToAddPaymentMethod(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Z)V
    .locals 0

    .line 91
    invoke-direct {p0, p1}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->transitionToAddPaymentMethod(Z)V

    return-void
.end method

.method public static final synthetic access$transitionToInitialScreen(Lcom/stripe/android/customersheet/CustomerSheetViewModel;)V
    .locals 0

    .line 91
    invoke-direct {p0}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->transitionToInitialScreen()V

    return-void
.end method

.method public static final synthetic access$updatePaymentMethodExecutor-0E7RQCE(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/paymentsheet/CardUpdateParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 91
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->updatePaymentMethodExecutor-0E7RQCE(Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/paymentsheet/CardUpdateParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final attachPaymentMethod(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 34
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachPaymentMethod$1;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachPaymentMethod$1;

    iget v3, v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachPaymentMethod$1;->label:I

    const/high16 v4, -0x80000000

    and-int/2addr v3, v4

    if-eqz v3, :cond_0

    iget v1, v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachPaymentMethod$1;->label:I

    sub-int/2addr v1, v4

    iput v1, v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachPaymentMethod$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachPaymentMethod$1;

    invoke-direct {v2, v0, v1}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachPaymentMethod$1;-><init>(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object v1, v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachPaymentMethod$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v3

    .line 1077
    iget v4, v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachPaymentMethod$1;->label:I

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-eqz v4, :cond_4

    if-eq v4, v7, :cond_3

    if-eq v4, v6, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachPaymentMethod$1;->L$2:Ljava/lang/Object;

    check-cast v3, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;

    iget-object v4, v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachPaymentMethod$1;->L$1:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v2, v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachPaymentMethod$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v4, v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachPaymentMethod$1;->L$1:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v6, v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachPaymentMethod$1;->L$0:Ljava/lang/Object;

    check-cast v6, Lcom/stripe/android/customersheet/CustomerSheetViewModel;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    iget-object v4, v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachPaymentMethod$1;->L$1:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v8, v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachPaymentMethod$1;->L$0:Ljava/lang/Object;

    check-cast v8, Lcom/stripe/android/customersheet/CustomerSheetViewModel;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v33, v4

    move-object v4, v1

    move-object/from16 v1, v33

    goto :goto_1

    :cond_4
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 1078
    iput-object v0, v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachPaymentMethod$1;->L$0:Ljava/lang/Object;

    move-object/from16 v1, p1

    iput-object v1, v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachPaymentMethod$1;->L$1:Ljava/lang/Object;

    iput v7, v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachPaymentMethod$1;->label:I

    invoke-direct {v0, v2}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->awaitPaymentMethodDataSource(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_5

    goto :goto_3

    :cond_5
    move-object v8, v0

    :goto_1
    check-cast v4, Lcom/stripe/android/customersheet/data/CustomerSheetPaymentMethodDataSource;

    iput-object v8, v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachPaymentMethod$1;->L$0:Ljava/lang/Object;

    iput-object v1, v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachPaymentMethod$1;->L$1:Ljava/lang/Object;

    iput v6, v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachPaymentMethod$1;->label:I

    invoke-interface {v4, v1, v2}, Lcom/stripe/android/customersheet/data/CustomerSheetPaymentMethodDataSource;->attachPaymentMethod(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_6

    goto :goto_3

    :cond_6
    move-object v6, v4

    move-object v4, v1

    move-object v1, v6

    move-object v6, v8

    .line 1077
    :goto_2
    check-cast v1, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;

    .line 1578
    instance-of v8, v1, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Success;

    if-eqz v8, :cond_8

    .line 1579
    move-object v8, v1

    check-cast v8, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Success;

    invoke-virtual {v8}, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Success;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/stripe/android/model/PaymentMethod;

    .line 1080
    iget-object v9, v6, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->eventReporter:Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;

    .line 1081
    sget-object v10, Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$AddPaymentMethodStyle;->CreateAttach:Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$AddPaymentMethodStyle;

    .line 1080
    invoke-interface {v9, v10}, Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;->onAttachPaymentMethodSucceeded(Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$AddPaymentMethodStyle;)V

    .line 1083
    iput-object v6, v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachPaymentMethod$1;->L$0:Ljava/lang/Object;

    iput-object v4, v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachPaymentMethod$1;->L$1:Ljava/lang/Object;

    iput-object v1, v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachPaymentMethod$1;->L$2:Ljava/lang/Object;

    iput v5, v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachPaymentMethod$1;->label:I

    invoke-direct {v6, v8, v2}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->refreshAndUpdatePaymentMethods(Lcom/stripe/android/model/PaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_7

    :goto_3
    return-object v3

    :cond_7
    move-object v3, v1

    move-object v2, v6

    :goto_4
    move-object v6, v2

    move-object v1, v3

    .line 1582
    :cond_8
    invoke-static {v1}, Lcom/stripe/android/customersheet/data/CustomerSheetDataResultKtxKt;->failureOrNull(Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;)Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Failure;

    move-result-object v1

    if-eqz v1, :cond_11

    .line 1583
    invoke-virtual {v1}, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Failure;->getDisplayMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    if-nez v2, :cond_b

    .line 1584
    invoke-virtual {v1}, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Failure;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    instance-of v5, v2, Lcom/stripe/android/core/exception/StripeException;

    if-eqz v5, :cond_9

    check-cast v2, Lcom/stripe/android/core/exception/StripeException;

    goto :goto_5

    :cond_9
    move-object v2, v3

    :goto_5
    if-eqz v2, :cond_a

    invoke-virtual {v2}, Lcom/stripe/android/core/exception/StripeException;->getStripeError()Lcom/stripe/android/core/StripeError;

    move-result-object v2

    if-eqz v2, :cond_a

    invoke-virtual {v2}, Lcom/stripe/android/core/StripeError;->getMessage()Ljava/lang/String;

    move-result-object v2

    goto :goto_6

    :cond_a
    move-object v2, v3

    .line 1585
    :cond_b
    :goto_6
    invoke-virtual {v1}, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Failure;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    .line 1085
    iget-object v5, v6, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->eventReporter:Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;

    .line 1086
    sget-object v8, Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$AddPaymentMethodStyle;->CreateAttach:Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$AddPaymentMethodStyle;

    .line 1085
    invoke-interface {v5, v8}, Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;->onAttachPaymentMethodFailed(Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$AddPaymentMethodStyle;)V

    .line 1088
    iget-object v5, v6, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->logger:Lcom/stripe/android/core/Logger;

    .line 1089
    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "Failed to attach payment method "

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v8, " to customer"

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 1088
    invoke-interface {v5, v4, v1}, Lcom/stripe/android/core/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1586
    invoke-static {v6}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->access$getBackStack$p(Lcom/stripe/android/customersheet/CustomerSheetViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v1

    .line 1588
    :cond_c
    invoke-interface {v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v4

    .line 1589
    move-object v5, v4

    check-cast v5, Ljava/util/List;

    .line 1590
    check-cast v5, Ljava/lang/Iterable;

    .line 1591
    new-instance v6, Ljava/util/ArrayList;

    const/16 v8, 0xa

    invoke-static {v5, v8}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v6, v8}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v6, Ljava/util/Collection;

    .line 1592
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_7
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_10

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .line 1593
    check-cast v8, Lcom/stripe/android/customersheet/CustomerSheetViewState;

    .line 1594
    instance-of v9, v8, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;

    if-eqz v9, :cond_f

    .line 1595
    move-object v10, v8

    check-cast v10, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;

    if-eqz v2, :cond_d

    .line 1094
    invoke-static {v2}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v8

    move-object/from16 v21, v8

    goto :goto_8

    :cond_d
    move-object/from16 v21, v3

    .line 1095
    :goto_8
    invoke-virtual {v10}, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->getFormFieldValues()Lcom/stripe/android/paymentsheet/forms/FormFieldValues;

    move-result-object v8

    if-eqz v8, :cond_e

    move/from16 v24, v7

    goto :goto_9

    :cond_e
    const/4 v8, 0x0

    move/from16 v24, v8

    :goto_9
    const v31, 0xfd9ff

    const/16 v32, 0x0

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

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    .line 1093
    invoke-static/range {v10 .. v32}, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->copy$default(Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/paymentsheet/forms/FormFieldValues;Ljava/util/List;Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;Lcom/stripe/android/paymentsheet/model/PaymentSelection;ZZZLcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;Lcom/stripe/android/core/strings/ResolvableString;ZZLcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;Lcom/stripe/android/payments/core/analytics/ErrorReporter;ILjava/lang/Object;)Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;

    move-result-object v8

    .line 1595
    check-cast v8, Lcom/stripe/android/customersheet/CustomerSheetViewState;

    .line 1593
    :cond_f
    invoke-interface {v6, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_7

    .line 1599
    :cond_10
    check-cast v6, Ljava/util/List;

    .line 1601
    invoke-interface {v1, v4, v6}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_c

    .line 1100
    :cond_11
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1
.end method

.method private final attachPaymentMethodToCustomer(Lcom/stripe/android/model/PaymentMethod;)V
    .locals 7

    .line 972
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    iget-object v2, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->workContext:Lkotlin/coroutines/CoroutineContext;

    new-instance v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachPaymentMethodToCustomer$1;

    const/4 v3, 0x0

    invoke-direct {v0, p0, p1, v3}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachPaymentMethodToCustomer$1;-><init>(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lcom/stripe/android/model/PaymentMethod;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method private final attachWithSetupIntent(Lcom/stripe/android/model/PaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/PaymentMethod;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    instance-of v2, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachWithSetupIntent$1;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachWithSetupIntent$1;

    iget v3, v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachWithSetupIntent$1;->label:I

    const/high16 v4, -0x80000000

    and-int/2addr v3, v4

    if-eqz v3, :cond_0

    iget v0, v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachWithSetupIntent$1;->label:I

    sub-int/2addr v0, v4

    iput v0, v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachWithSetupIntent$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachWithSetupIntent$1;

    invoke-direct {v2, v1, v0}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachWithSetupIntent$1;-><init>(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v7, v2

    iget-object v0, v7, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachWithSetupIntent$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    .line 981
    iget v3, v7, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachWithSetupIntent$1;->label:I

    const/4 v10, 0x5

    const/4 v11, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v12, 0x0

    if-eqz v3, :cond_6

    if-eq v3, v6, :cond_5

    if-eq v3, v5, :cond_4

    if-eq v3, v4, :cond_3

    if-eq v3, v11, :cond_2

    if-ne v3, v10, :cond_1

    iget-object v2, v7, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachWithSetupIntent$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;

    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_b

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v3, v7, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachWithSetupIntent$1;->L$2:Ljava/lang/Object;

    check-cast v3, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Companion;

    iget-object v4, v7, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachWithSetupIntent$1;->L$1:Ljava/lang/Object;

    check-cast v4, Lcom/stripe/android/model/PaymentMethod;

    iget-object v5, v7, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachWithSetupIntent$1;->L$0:Ljava/lang/Object;

    check-cast v5, Lcom/stripe/android/customersheet/CustomerSheetViewModel;

    :try_start_0
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_4

    :catchall_0
    move-exception v0

    goto/16 :goto_5

    :cond_3
    iget-object v3, v7, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachWithSetupIntent$1;->L$3:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v4, v7, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachWithSetupIntent$1;->L$2:Ljava/lang/Object;

    check-cast v4, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Companion;

    iget-object v5, v7, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachWithSetupIntent$1;->L$1:Ljava/lang/Object;

    check-cast v5, Lcom/stripe/android/model/PaymentMethod;

    iget-object v6, v7, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachWithSetupIntent$1;->L$0:Ljava/lang/Object;

    check-cast v6, Lcom/stripe/android/customersheet/CustomerSheetViewModel;

    :try_start_1
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v0, Lkotlin/Result;

    invoke-virtual {v0}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object v15, v4

    move-object v4, v5

    move-object v5, v6

    goto/16 :goto_3

    :catchall_1
    move-exception v0

    move-object v4, v5

    move-object v5, v6

    goto/16 :goto_5

    :cond_4
    iget-object v3, v7, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachWithSetupIntent$1;->L$1:Ljava/lang/Object;

    check-cast v3, Lcom/stripe/android/model/PaymentMethod;

    iget-object v5, v7, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachWithSetupIntent$1;->L$0:Ljava/lang/Object;

    check-cast v5, Lcom/stripe/android/customersheet/CustomerSheetViewModel;

    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v13, v3

    move-object v14, v5

    goto :goto_2

    :cond_5
    iget-object v3, v7, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachWithSetupIntent$1;->L$1:Ljava/lang/Object;

    check-cast v3, Lcom/stripe/android/model/PaymentMethod;

    iget-object v6, v7, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachWithSetupIntent$1;->L$0:Ljava/lang/Object;

    check-cast v6, Lcom/stripe/android/customersheet/CustomerSheetViewModel;

    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v22, v3

    move-object v3, v0

    move-object/from16 v0, v22

    goto :goto_1

    :cond_6
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 982
    iput-object v1, v7, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachWithSetupIntent$1;->L$0:Ljava/lang/Object;

    move-object/from16 v0, p1

    iput-object v0, v7, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachWithSetupIntent$1;->L$1:Ljava/lang/Object;

    iput v6, v7, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachWithSetupIntent$1;->label:I

    invoke-direct {v1, v7}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->awaitIntentDataSource(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_7

    goto/16 :goto_a

    :cond_7
    move-object v6, v1

    :goto_1
    check-cast v3, Lcom/stripe/android/customersheet/data/CustomerSheetIntentDataSource;

    iput-object v6, v7, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachWithSetupIntent$1;->L$0:Ljava/lang/Object;

    iput-object v0, v7, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachWithSetupIntent$1;->L$1:Ljava/lang/Object;

    iput v5, v7, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachWithSetupIntent$1;->label:I

    invoke-interface {v3, v7}, Lcom/stripe/android/customersheet/data/CustomerSheetIntentDataSource;->retrieveSetupIntentClientSecret(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_8

    goto/16 :goto_a

    :cond_8
    move-object v13, v0

    move-object v0, v3

    move-object v14, v6

    .line 981
    :goto_2
    check-cast v0, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;

    .line 1545
    instance-of v3, v0, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Success;

    if-eqz v3, :cond_c

    .line 1546
    :try_start_2
    sget-object v3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 1547
    sget-object v15, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;->Companion:Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Companion;

    check-cast v0, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Success;

    .line 1545
    invoke-virtual {v0}, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Success;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 984
    iget-object v3, v14, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    .line 986
    new-instance v16, Lcom/stripe/android/core/networking/ApiRequest$Options;

    .line 987
    iget-object v5, v14, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->paymentConfigurationProvider:Ljavax/inject/Provider;

    invoke-interface {v5}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/stripe/android/PaymentConfiguration;

    invoke-virtual {v5}, Lcom/stripe/android/PaymentConfiguration;->getPublishableKey()Ljava/lang/String;

    move-result-object v17

    .line 988
    iget-object v5, v14, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->paymentConfigurationProvider:Ljavax/inject/Provider;

    invoke-interface {v5}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/stripe/android/PaymentConfiguration;

    invoke-virtual {v5}, Lcom/stripe/android/PaymentConfiguration;->getStripeAccountId()Ljava/lang/String;

    move-result-object v18

    const/16 v20, 0x4

    const/16 v21, 0x0

    const/16 v19, 0x0

    .line 986
    invoke-direct/range {v16 .. v21}, Lcom/stripe/android/core/networking/ApiRequest$Options;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 984
    iput-object v14, v7, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachWithSetupIntent$1;->L$0:Ljava/lang/Object;

    iput-object v13, v7, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachWithSetupIntent$1;->L$1:Ljava/lang/Object;

    iput-object v15, v7, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachWithSetupIntent$1;->L$2:Ljava/lang/Object;

    iput-object v0, v7, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachWithSetupIntent$1;->L$3:Ljava/lang/Object;

    iput v4, v7, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachWithSetupIntent$1;->label:I

    const/4 v6, 0x0

    const/4 v8, 0x4

    const/4 v9, 0x0

    move-object v4, v0

    move-object/from16 v5, v16

    invoke-static/range {v3 .. v9}, Lcom/stripe/android/networking/StripeRepository$DefaultImpls;->retrieveSetupIntent-BWLJW6A$default(Lcom/stripe/android/networking/StripeRepository;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-ne v0, v2, :cond_9

    goto/16 :goto_a

    :cond_9
    move-object v3, v4

    move-object v4, v13

    move-object v5, v14

    .line 990
    :goto_3
    :try_start_3
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v0, Lcom/stripe/android/model/SetupIntent;

    .line 992
    check-cast v0, Lcom/stripe/android/model/StripeIntent;

    iput-object v5, v7, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachWithSetupIntent$1;->L$0:Ljava/lang/Object;

    iput-object v4, v7, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachWithSetupIntent$1;->L$1:Ljava/lang/Object;

    iput-object v15, v7, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachWithSetupIntent$1;->L$2:Ljava/lang/Object;

    iput-object v12, v7, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachWithSetupIntent$1;->L$3:Ljava/lang/Object;

    iput v11, v7, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachWithSetupIntent$1;->label:I

    invoke-direct {v5, v0, v3, v4, v7}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->handleStripeIntent(Lcom/stripe/android/model/StripeIntent;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_a

    goto/16 :goto_a

    :cond_a
    move-object v3, v15

    .line 993
    :goto_4
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 1547
    invoke-virtual {v3, v0}, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Companion;->success(Ljava/lang/Object;)Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Success;

    move-result-object v0

    .line 1546
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_6

    :catchall_2
    move-exception v0

    move-object v4, v13

    move-object v5, v14

    :goto_5
    sget-object v3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_6
    move-object v13, v4

    move-object v14, v5

    .line 1548
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v3

    if-nez v3, :cond_b

    check-cast v0, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Success;

    .line 1549
    check-cast v0, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;

    goto :goto_7

    .line 1550
    :cond_b
    sget-object v0, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;->Companion:Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Companion;

    invoke-virtual {v0, v3, v12}, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Companion;->failure(Ljava/lang/Throwable;Ljava/lang/String;)Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Failure;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;

    goto :goto_7

    .line 1551
    :cond_c
    instance-of v3, v0, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Failure;

    if-eqz v3, :cond_11

    sget-object v3, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;->Companion:Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Companion;

    .line 1552
    check-cast v0, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Failure;

    invoke-virtual {v0}, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Failure;->getCause()Ljava/lang/Throwable;

    move-result-object v4

    .line 1553
    invoke-virtual {v0}, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Failure;->getDisplayMessage()Ljava/lang/String;

    move-result-object v0

    .line 1551
    invoke-virtual {v3, v4, v0}, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Companion;->failure(Ljava/lang/Throwable;Ljava/lang/String;)Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Failure;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;

    .line 1554
    :goto_7
    invoke-static {v0}, Lcom/stripe/android/customersheet/data/CustomerSheetDataResultKtxKt;->failureOrNull(Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;)Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Failure;

    move-result-object v3

    if-eqz v3, :cond_10

    .line 1555
    invoke-virtual {v3}, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Failure;->getDisplayMessage()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_f

    .line 1556
    invoke-virtual {v3}, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Failure;->getCause()Ljava/lang/Throwable;

    move-result-object v4

    instance-of v5, v4, Lcom/stripe/android/core/exception/StripeException;

    if-eqz v5, :cond_d

    check-cast v4, Lcom/stripe/android/core/exception/StripeException;

    goto :goto_8

    :cond_d
    move-object v4, v12

    :goto_8
    if-eqz v4, :cond_e

    invoke-virtual {v4}, Lcom/stripe/android/core/exception/StripeException;->getStripeError()Lcom/stripe/android/core/StripeError;

    move-result-object v4

    if-eqz v4, :cond_e

    invoke-virtual {v4}, Lcom/stripe/android/core/StripeError;->getMessage()Ljava/lang/String;

    move-result-object v4

    goto :goto_9

    :cond_e
    move-object v4, v12

    .line 1557
    :cond_f
    :goto_9
    invoke-virtual {v3}, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Failure;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    .line 994
    iget-object v5, v14, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->eventReporter:Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;

    .line 995
    sget-object v6, Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$AddPaymentMethodStyle;->SetupIntent:Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$AddPaymentMethodStyle;

    .line 994
    invoke-interface {v5, v6}, Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;->onAttachPaymentMethodFailed(Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$AddPaymentMethodStyle;)V

    .line 998
    iget-object v5, v14, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->logger:Lcom/stripe/android/core/Logger;

    .line 999
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v8, "Failed to attach payment method to SetupIntent: "

    invoke-direct {v6, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 998
    invoke-interface {v5, v6, v3}, Lcom/stripe/android/core/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1003
    move-object v5, v14

    check-cast v5, Landroidx/lifecycle/ViewModel;

    invoke-static {v5}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v5

    invoke-interface {v5}, Lkotlinx/coroutines/CoroutineScope;->getCoroutineContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v5

    new-instance v6, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachWithSetupIntent$3$1;

    invoke-direct {v6, v14, v4, v3, v12}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachWithSetupIntent$3$1;-><init>(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Ljava/lang/String;Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)V

    check-cast v6, Lkotlin/jvm/functions/Function2;

    iput-object v0, v7, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachWithSetupIntent$1;->L$0:Ljava/lang/Object;

    iput-object v12, v7, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachWithSetupIntent$1;->L$1:Ljava/lang/Object;

    iput-object v12, v7, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachWithSetupIntent$1;->L$2:Ljava/lang/Object;

    iput-object v12, v7, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachWithSetupIntent$1;->L$3:Ljava/lang/Object;

    iput v10, v7, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachWithSetupIntent$1;->label:I

    invoke-static {v5, v6, v7}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_10

    :goto_a
    return-object v2

    .line 1014
    :cond_10
    :goto_b
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    .line 1544
    :cond_11
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method private final awaitIntentDataSource(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/customersheet/data/CustomerSheetIntentDataSource;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1272
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->intentDataSourceProvider:Lcom/stripe/android/common/coroutines/Single;

    invoke-interface {v0, p1}, Lcom/stripe/android/common/coroutines/Single;->await(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private final awaitPaymentMethodDataSource(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/customersheet/data/CustomerSheetPaymentMethodDataSource;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1268
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->paymentMethodDataSourceProvider:Lcom/stripe/android/common/coroutines/Single;

    invoke-interface {v0, p1}, Lcom/stripe/android/common/coroutines/Single;->await(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private final awaitSavedSelectionDataSource(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/customersheet/data/CustomerSheetSavedSelectionDataSource;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1276
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->savedSelectionDataSourceProvider:Lcom/stripe/android/common/coroutines/Single;

    invoke-interface {v0, p1}, Lcom/stripe/android/common/coroutines/Single;->await(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private final confirmPaymentSelection(Lcom/stripe/android/paymentsheet/model/PaymentSelection;Ljava/lang/String;Ljava/lang/Boolean;)V
    .locals 1

    if-eqz p2, :cond_0

    .line 1202
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->eventReporter:Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;

    invoke-interface {v0, p2, p3}, Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;->onConfirmPaymentMethodSucceeded(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 1207
    :cond_0
    iget-object p2, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->_result:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 1208
    new-instance p3, Lcom/stripe/android/customersheet/InternalCustomerSheetResult$Selected;

    invoke-direct {p3, p1}, Lcom/stripe/android/customersheet/InternalCustomerSheetResult$Selected;-><init>(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V

    .line 1207
    invoke-interface {p2, p3}, Lkotlinx/coroutines/flow/MutableStateFlow;->tryEmit(Ljava/lang/Object;)Z

    return-void
.end method

.method private final confirmPaymentSelectionError(Lcom/stripe/android/paymentsheet/model/PaymentSelection;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 1

    if-eqz p2, :cond_0

    .line 1222
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->eventReporter:Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;

    invoke-interface {v0, p2, p3}, Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;->onConfirmPaymentMethodFailed(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 1227
    :cond_0
    iget-object p2, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->logger:Lcom/stripe/android/core/Logger;

    .line 1228
    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "Failed to persist payment selection: "

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 1227
    invoke-interface {p2, p1, p4}, Lcom/stripe/android/core/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1231
    new-instance p1, Lcom/stripe/android/customersheet/CustomerSheetViewModel$$ExternalSyntheticLambda11;

    invoke-direct {p1, p5}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$$ExternalSyntheticLambda11;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->setSelectionConfirmationState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final confirmPaymentSelectionError$lambda$47(Ljava/lang/String;Lcom/stripe/android/customersheet/CustomerSheetViewModel$SelectionConfirmationState;)Lcom/stripe/android/customersheet/CustomerSheetViewModel$SelectionConfirmationState;
    .locals 1

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 1232
    invoke-virtual {p1, v0, p0}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$SelectionConfirmationState;->copy(ZLjava/lang/String;)Lcom/stripe/android/customersheet/CustomerSheetViewModel$SelectionConfirmationState;

    move-result-object p0

    return-object p0
.end method

.method private final createAndAttach(Lcom/stripe/android/model/PaymentMethodCreateParams;)V
    .locals 7

    .line 755
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    iget-object v2, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->workContext:Lkotlin/coroutines/CoroutineContext;

    new-instance v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$createAndAttach$1;

    const/4 v3, 0x0

    invoke-direct {v0, p0, p1, v3}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$createAndAttach$1;-><init>(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lcom/stripe/android/model/PaymentMethodCreateParams;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method private final createDefaultUsBankArguments(Lcom/stripe/android/model/StripeIntent;)Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;
    .locals 27

    move-object/from16 v0, p0

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 853
    invoke-interface/range {p1 .. p1}, Lcom/stripe/android/model/StripeIntent;->getId()Ljava/lang/String;

    move-result-object v2

    move-object v11, v2

    goto :goto_0

    :cond_0
    move-object v11, v1

    :goto_0
    if-eqz p1, :cond_1

    .line 854
    invoke-interface/range {p1 .. p1}, Lcom/stripe/android/model/StripeIntent;->getClientSecret()Ljava/lang/String;

    move-result-object v2

    move-object v12, v2

    goto :goto_1

    :cond_1
    move-object v12, v1

    .line 874
    :goto_1
    sget-object v2, Lcom/stripe/android/payments/financialconnections/GetFinancialConnectionsAvailability;->INSTANCE:Lcom/stripe/android/payments/financialconnections/GetFinancialConnectionsAvailability;

    const/4 v3, 0x2

    invoke-static {v2, v1, v1, v3, v1}, Lcom/stripe/android/payments/financialconnections/GetFinancialConnectionsAvailability;->invoke$default(Lcom/stripe/android/payments/financialconnections/GetFinancialConnectionsAvailability;Lcom/stripe/android/model/ElementsSession;Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsSdkAvailable;ILjava/lang/Object;)Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;

    move-result-object v25

    .line 845
    new-instance v3, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;

    .line 876
    new-instance v17, Lcom/stripe/android/customersheet/CustomerSheetViewModel$$ExternalSyntheticLambda12;

    invoke-direct/range {v17 .. v17}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$$ExternalSyntheticLambda12;-><init>()V

    .line 857
    new-instance v1, Lcom/stripe/android/customersheet/CustomerSheetViewModel$$ExternalSyntheticLambda13;

    invoke-direct {v1, v0}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$$ExternalSyntheticLambda13;-><init>(Lcom/stripe/android/customersheet/CustomerSheetViewModel;)V

    .line 860
    new-instance v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$$ExternalSyntheticLambda14;

    invoke-direct {v2, v0}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$$ExternalSyntheticLambda14;-><init>(Lcom/stripe/android/customersheet/CustomerSheetViewModel;)V

    .line 863
    new-instance v4, Lcom/stripe/android/customersheet/CustomerSheetViewModel$$ExternalSyntheticLambda15;

    invoke-direct {v4, v0}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$$ExternalSyntheticLambda15;-><init>(Lcom/stripe/android/customersheet/CustomerSheetViewModel;)V

    new-instance v21, Lcom/stripe/android/customersheet/CustomerSheetViewModel$$ExternalSyntheticLambda1;

    invoke-direct/range {v21 .. v21}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$$ExternalSyntheticLambda1;-><init>()V

    .line 868
    new-instance v5, Lcom/stripe/android/customersheet/CustomerSheetViewModel$$ExternalSyntheticLambda2;

    invoke-direct {v5, v0}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$$ExternalSyntheticLambda2;-><init>(Lcom/stripe/android/customersheet/CustomerSheetViewModel;)V

    new-instance v23, Lcom/stripe/android/customersheet/CustomerSheetViewModel$$ExternalSyntheticLambda3;

    invoke-direct/range {v23 .. v23}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$$ExternalSyntheticLambda3;-><init>()V

    const/16 v24, 0x0

    const/16 v26, 0x0

    move-object/from16 v20, v4

    const/4 v4, 0x0

    move-object/from16 v22, v5

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    .line 845
    const-string v13, "customer_sheet"

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v18, v1

    move-object/from16 v19, v2

    invoke-direct/range {v3 .. v26}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;-><init>(ZLcom/stripe/android/paymentsheet/model/PaymentMethodIncentive;Lcom/stripe/android/model/LinkMode;Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Factory;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ZLcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;Z)V

    return-object v3
.end method

.method private static final createDefaultUsBankArguments$lambda$27(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$AnalyticsEvent;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 872
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final createDefaultUsBankArguments$lambda$28(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lcom/stripe/android/core/strings/ResolvableString;Z)Lkotlin/Unit;
    .locals 1

    .line 858
    new-instance v0, Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnUpdateMandateText;

    invoke-direct {v0, p1, p2}, Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnUpdateMandateText;-><init>(Lcom/stripe/android/core/strings/ResolvableString;Z)V

    check-cast v0, Lcom/stripe/android/customersheet/CustomerSheetViewAction;

    invoke-virtual {p0, v0}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->handleViewAction(Lcom/stripe/android/customersheet/CustomerSheetViewAction;)V

    .line 859
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final createDefaultUsBankArguments$lambda$29(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;)Lkotlin/Unit;
    .locals 1

    .line 861
    new-instance v0, Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnBankAccountSelectionChanged;

    invoke-direct {v0, p1}, Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnBankAccountSelectionChanged;-><init>(Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;)V

    check-cast v0, Lcom/stripe/android/customersheet/CustomerSheetViewAction;

    invoke-virtual {p0, v0}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->handleViewAction(Lcom/stripe/android/customersheet/CustomerSheetViewAction;)V

    .line 862
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final createDefaultUsBankArguments$lambda$30(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 864
    new-instance v0, Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnUpdateCustomButtonUIState;

    invoke-direct {v0, p1}, Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnUpdateCustomButtonUIState;-><init>(Lkotlin/jvm/functions/Function1;)V

    check-cast v0, Lcom/stripe/android/customersheet/CustomerSheetViewAction;

    invoke-virtual {p0, v0}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->handleViewAction(Lcom/stripe/android/customersheet/CustomerSheetViewAction;)V

    .line 865
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final createDefaultUsBankArguments$lambda$31(Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 867
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final createDefaultUsBankArguments$lambda$32(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lcom/stripe/android/core/strings/ResolvableString;)Lkotlin/Unit;
    .locals 1

    .line 869
    new-instance v0, Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnFormError;

    invoke-direct {v0, p1}, Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnFormError;-><init>(Lcom/stripe/android/core/strings/ResolvableString;)V

    check-cast v0, Lcom/stripe/android/customersheet/CustomerSheetViewAction;

    invoke-virtual {p0, v0}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->handleViewAction(Lcom/stripe/android/customersheet/CustomerSheetViewAction;)V

    .line 870
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final createDefaultUsBankArguments$lambda$33()Lkotlin/Unit;
    .locals 1

    .line 871
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method private final createPaymentMethod-gIAlu-s(Lcom/stripe/android/model/PaymentMethodCreateParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/PaymentMethodCreateParams;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$createPaymentMethod$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$createPaymentMethod$1;

    iget v1, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$createPaymentMethod$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p2, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$createPaymentMethod$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$createPaymentMethod$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$createPaymentMethod$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$createPaymentMethod$1;-><init>(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$createPaymentMethod$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 959
    iget v2, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$createPaymentMethod$1;->label:I

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

    .line 962
    iget-object p2, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    .line 964
    new-instance v4, Lcom/stripe/android/core/networking/ApiRequest$Options;

    .line 965
    iget-object v2, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->paymentConfigurationProvider:Ljavax/inject/Provider;

    invoke-interface {v2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/PaymentConfiguration;

    invoke-virtual {v2}, Lcom/stripe/android/PaymentConfiguration;->getPublishableKey()Ljava/lang/String;

    move-result-object v5

    .line 966
    iget-object v2, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->paymentConfigurationProvider:Ljavax/inject/Provider;

    invoke-interface {v2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/PaymentConfiguration;

    invoke-virtual {v2}, Lcom/stripe/android/PaymentConfiguration;->getStripeAccountId()Ljava/lang/String;

    move-result-object v6

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    .line 964
    invoke-direct/range {v4 .. v9}, Lcom/stripe/android/core/networking/ApiRequest$Options;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 962
    iput v3, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$createPaymentMethod$1;->label:I

    invoke-interface {p2, p1, v4, v0}, Lcom/stripe/android/networking/StripeRepository;->createPaymentMethod-0E7RQCE(Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method

.method private final getEventReporterScreen(Lcom/stripe/android/customersheet/CustomerSheetViewState;)Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$Screen;
    .locals 1

    .line 1281
    instance-of v0, p1, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;

    if-eqz v0, :cond_0

    sget-object p1, Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$Screen;->AddPaymentMethod:Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$Screen;

    return-object p1

    .line 1282
    :cond_0
    instance-of v0, p1, Lcom/stripe/android/customersheet/CustomerSheetViewState$SelectPaymentMethod;

    if-eqz v0, :cond_1

    sget-object p1, Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$Screen;->SelectPaymentMethod:Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$Screen;

    return-object p1

    .line 1283
    :cond_1
    instance-of p1, p1, Lcom/stripe/android/customersheet/CustomerSheetViewState$UpdatePaymentMethod;

    if-eqz p1, :cond_2

    sget-object p1, Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$Screen;->EditPaymentMethod:Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$Screen;

    return-object p1

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method private final handlePaymentMethodRemovedFromEditScreen(Lcom/stripe/android/model/PaymentMethod;)V
    .locals 7

    .line 550
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    iget-object v2, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->workContext:Lkotlin/coroutines/CoroutineContext;

    new-instance v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$handlePaymentMethodRemovedFromEditScreen$1;

    const/4 v3, 0x0

    invoke-direct {v0, p0, p1, v3}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$handlePaymentMethodRemovedFromEditScreen$1;-><init>(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lcom/stripe/android/model/PaymentMethod;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method private final handleStripeIntent(Lcom/stripe/android/model/StripeIntent;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 32
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/StripeIntent;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/model/PaymentMethod;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p4

    instance-of v2, v1, Lcom/stripe/android/customersheet/CustomerSheetViewModel$handleStripeIntent$1;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$handleStripeIntent$1;

    iget v3, v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$handleStripeIntent$1;->label:I

    const/high16 v4, -0x80000000

    and-int/2addr v3, v4

    if-eqz v3, :cond_0

    iget v1, v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$handleStripeIntent$1;->label:I

    sub-int/2addr v1, v4

    iput v1, v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$handleStripeIntent$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$handleStripeIntent$1;

    invoke-direct {v2, v0, v1}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$handleStripeIntent$1;-><init>(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object v1, v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$handleStripeIntent$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v3

    .line 1016
    iget v4, v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$handleStripeIntent$1;->label:I

    const/4 v5, 0x4

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x1

    if-eqz v4, :cond_5

    if-eq v4, v8, :cond_4

    if-eq v4, v7, :cond_3

    if-eq v4, v6, :cond_2

    if-ne v4, v5, :cond_1

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_3
    iget-object v4, v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$handleStripeIntent$1;->L$1:Ljava/lang/Object;

    check-cast v4, Lcom/stripe/android/model/PaymentMethod;

    iget-object v7, v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$handleStripeIntent$1;->L$0:Ljava/lang/Object;

    check-cast v7, Lcom/stripe/android/customersheet/CustomerSheetViewModel;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    iget-object v4, v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$handleStripeIntent$1;->L$1:Ljava/lang/Object;

    check-cast v4, Lcom/stripe/android/model/PaymentMethod;

    iget-object v9, v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$handleStripeIntent$1;->L$0:Ljava/lang/Object;

    check-cast v9, Lcom/stripe/android/customersheet/CustomerSheetViewModel;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_5
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 1021
    iget-object v1, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->confirmationHandler:Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;

    .line 1023
    new-instance v9, Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption$Saved;

    const/4 v13, 0x4

    const/4 v14, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v10, p3

    invoke-direct/range {v9 .. v14}, Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption$Saved;-><init>(Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/PaymentMethodOptionsParams;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 1028
    new-instance v4, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode$SetupIntent;

    move-object/from16 v10, p2

    invoke-direct {v4, v10}, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode$SetupIntent;-><init>(Ljava/lang/String;)V

    .line 1032
    iget-object v10, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->configuration:Lcom/stripe/android/customersheet/CustomerSheet$Configuration;

    invoke-virtual {v10}, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->getAppearance()Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;

    move-result-object v14

    .line 1022
    new-instance v11, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Args;

    .line 1023
    move-object v13, v9

    check-cast v13, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;

    .line 1028
    move-object v15, v4

    check-cast v15, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;

    const/16 v16, 0x0

    move-object/from16 v12, p1

    .line 1022
    invoke-direct/range {v11 .. v16}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Args;-><init>(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;)V

    .line 1021
    iput-object v0, v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$handleStripeIntent$1;->L$0:Ljava/lang/Object;

    move-object/from16 v10, p3

    iput-object v10, v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$handleStripeIntent$1;->L$1:Ljava/lang/Object;

    iput v8, v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$handleStripeIntent$1;->label:I

    invoke-interface {v1, v11, v2}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;->start(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Args;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_6

    goto/16 :goto_4

    :cond_6
    move-object v9, v0

    move-object v4, v10

    .line 1036
    :goto_1
    iget-object v1, v9, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->confirmationHandler:Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;

    iput-object v9, v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$handleStripeIntent$1;->L$0:Ljava/lang/Object;

    iput-object v4, v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$handleStripeIntent$1;->L$1:Ljava/lang/Object;

    iput v7, v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$handleStripeIntent$1;->label:I

    invoke-interface {v1, v2}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;->awaitResult(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_7

    goto :goto_4

    :cond_7
    move-object v7, v9

    .line 1016
    :goto_2
    check-cast v1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result;

    .line 1037
    instance-of v9, v1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Succeeded;

    const/4 v10, 0x0

    if-eqz v9, :cond_9

    .line 1038
    iget-object v1, v7, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->eventReporter:Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;

    .line 1039
    sget-object v5, Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$AddPaymentMethodStyle;->SetupIntent:Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$AddPaymentMethodStyle;

    .line 1038
    invoke-interface {v1, v5}, Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;->onAttachPaymentMethodSucceeded(Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$AddPaymentMethodStyle;)V

    .line 1042
    iput-object v10, v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$handleStripeIntent$1;->L$0:Ljava/lang/Object;

    iput-object v10, v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$handleStripeIntent$1;->L$1:Ljava/lang/Object;

    iput v6, v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$handleStripeIntent$1;->label:I

    invoke-direct {v7, v4, v2}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->refreshAndUpdatePaymentMethods(Lcom/stripe/android/model/PaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_8

    goto :goto_4

    .line 1075
    :cond_8
    :goto_3
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    .line 1044
    :cond_9
    instance-of v6, v1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Failed;

    if-eqz v6, :cond_b

    .line 1045
    iget-object v6, v7, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->eventReporter:Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;

    .line 1046
    sget-object v8, Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$AddPaymentMethodStyle;->SetupIntent:Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$AddPaymentMethodStyle;

    .line 1045
    invoke-interface {v6, v8}, Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;->onAttachPaymentMethodFailed(Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$AddPaymentMethodStyle;)V

    .line 1049
    iget-object v6, v7, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->logger:Lcom/stripe/android/core/Logger;

    .line 1050
    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "Failed to attach payment method to SetupIntent: "

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 1051
    move-object v8, v1

    check-cast v8, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Failed;

    invoke-virtual {v8}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Failed;->getCause()Ljava/lang/Throwable;

    move-result-object v8

    .line 1049
    invoke-interface {v6, v4, v8}, Lcom/stripe/android/core/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1054
    move-object v4, v7

    check-cast v4, Landroidx/lifecycle/ViewModel;

    invoke-static {v4}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v4

    invoke-interface {v4}, Lkotlinx/coroutines/CoroutineScope;->getCoroutineContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v4

    new-instance v6, Lcom/stripe/android/customersheet/CustomerSheetViewModel$handleStripeIntent$2;

    invoke-direct {v6, v7, v1, v10}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$handleStripeIntent$2;-><init>(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result;Lkotlin/coroutines/Continuation;)V

    check-cast v6, Lkotlin/jvm/functions/Function2;

    iput-object v10, v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$handleStripeIntent$1;->L$0:Ljava/lang/Object;

    iput-object v10, v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$handleStripeIntent$1;->L$1:Ljava/lang/Object;

    iput v5, v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$handleStripeIntent$1;->label:I

    invoke-static {v4, v6, v2}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_a

    :goto_4
    return-object v3

    .line 1075
    :cond_a
    :goto_5
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    .line 1064
    :cond_b
    instance-of v2, v1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Canceled;

    if-nez v2, :cond_d

    if-nez v1, :cond_c

    goto :goto_6

    .line 1036
    :cond_c
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    .line 1560
    :cond_d
    :goto_6
    invoke-static {v7}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->access$getBackStack$p(Lcom/stripe/android/customersheet/CustomerSheetViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v1

    .line 1562
    :cond_e
    invoke-interface {v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v2

    .line 1563
    move-object v3, v2

    check-cast v3, Ljava/util/List;

    .line 1564
    check-cast v3, Ljava/lang/Iterable;

    .line 1565
    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v3, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v4, Ljava/util/Collection;

    .line 1566
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_11

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 1567
    check-cast v5, Lcom/stripe/android/customersheet/CustomerSheetViewState;

    .line 1568
    instance-of v6, v5, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;

    if-eqz v6, :cond_10

    .line 1569
    move-object v9, v5

    check-cast v9, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;

    .line 1070
    invoke-virtual {v9}, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->getFormFieldValues()Lcom/stripe/android/paymentsheet/forms/FormFieldValues;

    move-result-object v5

    if-eqz v5, :cond_f

    move/from16 v23, v8

    goto :goto_8

    :cond_f
    const/4 v5, 0x0

    move/from16 v23, v5

    :goto_8
    const v30, 0xfdd7f

    const/16 v31, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x1

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    .line 1067
    invoke-static/range {v9 .. v31}, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->copy$default(Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/paymentsheet/forms/FormFieldValues;Ljava/util/List;Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;Lcom/stripe/android/paymentsheet/model/PaymentSelection;ZZZLcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;Lcom/stripe/android/core/strings/ResolvableString;ZZLcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;Lcom/stripe/android/payments/core/analytics/ErrorReporter;ILjava/lang/Object;)Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;

    move-result-object v5

    .line 1569
    check-cast v5, Lcom/stripe/android/customersheet/CustomerSheetViewState;

    .line 1567
    :cond_10
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_7

    .line 1573
    :cond_11
    check-cast v4, Ljava/util/List;

    .line 1575
    invoke-interface {v1, v2, v4}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_e

    .line 1075
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1
.end method

.method private final loadCustomerSheetState(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/stripe/android/customersheet/CustomerSheetViewModel$loadCustomerSheetState$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$loadCustomerSheetState$1;

    iget v1, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$loadCustomerSheetState$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p1, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$loadCustomerSheetState$1;->label:I

    sub-int/2addr p1, v2

    iput p1, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$loadCustomerSheetState$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$loadCustomerSheetState$1;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$loadCustomerSheetState$1;-><init>(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p1, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$loadCustomerSheetState$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 337
    iget v2, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$loadCustomerSheetState$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$loadCustomerSheetState$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 338
    iget-object p1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->workContext:Lkotlin/coroutines/CoroutineContext;

    new-instance v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$loadCustomerSheetState$result$1;

    invoke-direct {v2, p0, v5}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$loadCustomerSheetState$result$1;-><init>(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast v2, Lkotlin/jvm/functions/Function2;

    iput-object p0, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$loadCustomerSheetState$1;->L$0:Ljava/lang/Object;

    iput v4, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$loadCustomerSheetState$1;->label:I

    invoke-static {p1, v2, v0}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    move-object v2, p0

    :goto_1
    check-cast p1, Lkotlin/Result;

    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    .line 344
    move-object v4, v2

    check-cast v4, Landroidx/lifecycle/ViewModel;

    invoke-static {v4}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v4

    invoke-interface {v4}, Lkotlinx/coroutines/CoroutineScope;->getCoroutineContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v4

    new-instance v6, Lcom/stripe/android/customersheet/CustomerSheetViewModel$loadCustomerSheetState$2;

    invoke-direct {v6, p1, v2, v5}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$loadCustomerSheetState$2;-><init>(Ljava/lang/Object;Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast v6, Lkotlin/jvm/functions/Function2;

    iput-object v5, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$loadCustomerSheetState$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$loadCustomerSheetState$1;->label:I

    invoke-static {v4, v6, v0}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    .line 375
    :cond_5
    :goto_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method private final modifyCardPaymentMethod(Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/paymentsheet/CardUpdateParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/PaymentMethod;",
            "Lcom/stripe/android/paymentsheet/CardUpdateParams;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/customersheet/data/CustomerSheetDataResult<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    instance-of v2, v1, Lcom/stripe/android/customersheet/CustomerSheetViewModel$modifyCardPaymentMethod$1;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$modifyCardPaymentMethod$1;

    iget v3, v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$modifyCardPaymentMethod$1;->label:I

    const/high16 v4, -0x80000000

    and-int/2addr v3, v4

    if-eqz v3, :cond_0

    iget v1, v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$modifyCardPaymentMethod$1;->label:I

    sub-int/2addr v1, v4

    iput v1, v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$modifyCardPaymentMethod$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$modifyCardPaymentMethod$1;

    invoke-direct {v2, v0, v1}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$modifyCardPaymentMethod$1;-><init>(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object v1, v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$modifyCardPaymentMethod$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v3

    .line 518
    iget v4, v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$modifyCardPaymentMethod$1;->label:I

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v4, :cond_3

    if-eq v4, v6, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$modifyCardPaymentMethod$1;->L$1:Ljava/lang/Object;

    check-cast v3, Lcom/stripe/android/paymentsheet/CardUpdateParams;

    iget-object v2, v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$modifyCardPaymentMethod$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v4, v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$modifyCardPaymentMethod$1;->L$2:Ljava/lang/Object;

    check-cast v4, Lcom/stripe/android/paymentsheet/CardUpdateParams;

    iget-object v6, v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$modifyCardPaymentMethod$1;->L$1:Ljava/lang/Object;

    check-cast v6, Lcom/stripe/android/model/PaymentMethod;

    iget-object v8, v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$modifyCardPaymentMethod$1;->L$0:Ljava/lang/Object;

    check-cast v8, Lcom/stripe/android/customersheet/CustomerSheetViewModel;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v18, v6

    move-object v6, v1

    move-object/from16 v1, v18

    goto :goto_1

    :cond_3
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 522
    iput-object v0, v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$modifyCardPaymentMethod$1;->L$0:Ljava/lang/Object;

    move-object/from16 v1, p1

    iput-object v1, v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$modifyCardPaymentMethod$1;->L$1:Ljava/lang/Object;

    move-object/from16 v4, p2

    iput-object v4, v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$modifyCardPaymentMethod$1;->L$2:Ljava/lang/Object;

    iput v6, v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$modifyCardPaymentMethod$1;->label:I

    invoke-direct {v0, v2}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->awaitPaymentMethodDataSource(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v3, :cond_4

    goto :goto_3

    :cond_4
    move-object v8, v0

    .line 518
    :goto_1
    check-cast v6, Lcom/stripe/android/customersheet/data/CustomerSheetPaymentMethodDataSource;

    .line 523
    iget-object v1, v1, Lcom/stripe/android/model/PaymentMethod;->id:Ljava/lang/String;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 524
    sget-object v9, Lcom/stripe/android/model/PaymentMethodUpdateParams;->Companion:Lcom/stripe/android/model/PaymentMethodUpdateParams$Companion;

    .line 525
    invoke-virtual {v4}, Lcom/stripe/android/paymentsheet/CardUpdateParams;->getCardBrand()Lcom/stripe/android/model/CardBrand;

    move-result-object v10

    if-eqz v10, :cond_5

    .line 526
    new-instance v11, Lcom/stripe/android/model/PaymentMethodUpdateParams$Card$Networks;

    .line 527
    invoke-virtual {v10}, Lcom/stripe/android/model/CardBrand;->getCode()Ljava/lang/String;

    move-result-object v10

    .line 526
    invoke-direct {v11, v10}, Lcom/stripe/android/model/PaymentMethodUpdateParams$Card$Networks;-><init>(Ljava/lang/String;)V

    move-object v12, v11

    goto :goto_2

    :cond_5
    move-object v12, v7

    .line 530
    :goto_2
    invoke-virtual {v4}, Lcom/stripe/android/paymentsheet/CardUpdateParams;->getBillingDetails()Lcom/stripe/android/model/PaymentMethod$BillingDetails;

    move-result-object v13

    .line 531
    invoke-virtual {v4}, Lcom/stripe/android/paymentsheet/CardUpdateParams;->getExpiryMonth()Ljava/lang/Integer;

    move-result-object v10

    .line 532
    invoke-virtual {v4}, Lcom/stripe/android/paymentsheet/CardUpdateParams;->getExpiryYear()Ljava/lang/Integer;

    move-result-object v11

    .line 533
    const-string v14, "CustomerSheet"

    invoke-static {v14}, Lkotlin/collections/SetsKt;->setOf(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v15

    const/16 v16, 0x10

    const/16 v17, 0x0

    const/4 v14, 0x0

    .line 524
    invoke-static/range {v9 .. v17}, Lcom/stripe/android/model/PaymentMethodUpdateParams$Companion;->createCard$default(Lcom/stripe/android/model/PaymentMethodUpdateParams$Companion;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/stripe/android/model/PaymentMethodUpdateParams$Card$Networks;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;Ljava/util/Set;ILjava/lang/Object;)Lcom/stripe/android/model/PaymentMethodUpdateParams;

    move-result-object v9

    .line 522
    iput-object v8, v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$modifyCardPaymentMethod$1;->L$0:Ljava/lang/Object;

    iput-object v4, v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$modifyCardPaymentMethod$1;->L$1:Ljava/lang/Object;

    iput-object v7, v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$modifyCardPaymentMethod$1;->L$2:Ljava/lang/Object;

    iput v5, v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$modifyCardPaymentMethod$1;->label:I

    invoke-interface {v6, v1, v9, v2}, Lcom/stripe/android/customersheet/data/CustomerSheetPaymentMethodDataSource;->updatePaymentMethod(Ljava/lang/String;Lcom/stripe/android/model/PaymentMethodUpdateParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_6

    :goto_3
    return-object v3

    :cond_6
    move-object v3, v4

    move-object v2, v8

    .line 518
    :goto_4
    check-cast v1, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;

    .line 1419
    instance-of v4, v1, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Success;

    if-eqz v4, :cond_7

    .line 1420
    move-object v4, v1

    check-cast v4, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Success;

    invoke-virtual {v4}, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Success;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/stripe/android/model/PaymentMethod;

    .line 536
    invoke-direct {v2, v4}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->updatePaymentMethodInState(Lcom/stripe/android/model/PaymentMethod;)V

    .line 538
    iget-object v4, v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->eventReporter:Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;

    .line 539
    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/CardUpdateParams;->getCardBrand()Lcom/stripe/android/model/CardBrand;

    move-result-object v5

    .line 538
    invoke-interface {v4, v5}, Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;->onUpdatePaymentMethodSucceeded(Lcom/stripe/android/model/CardBrand;)V

    .line 1423
    :cond_7
    invoke-static {v1}, Lcom/stripe/android/customersheet/data/CustomerSheetDataResultKtxKt;->failureOrNull(Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;)Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Failure;

    move-result-object v4

    if-eqz v4, :cond_a

    .line 1424
    invoke-virtual {v4}, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Failure;->getDisplayMessage()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_9

    .line 1425
    invoke-virtual {v4}, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Failure;->getCause()Ljava/lang/Throwable;

    move-result-object v5

    instance-of v6, v5, Lcom/stripe/android/core/exception/StripeException;

    if-eqz v6, :cond_8

    move-object v7, v5

    check-cast v7, Lcom/stripe/android/core/exception/StripeException;

    :cond_8
    if-eqz v7, :cond_9

    invoke-virtual {v7}, Lcom/stripe/android/core/exception/StripeException;->getStripeError()Lcom/stripe/android/core/StripeError;

    move-result-object v5

    if-eqz v5, :cond_9

    invoke-virtual {v5}, Lcom/stripe/android/core/StripeError;->getMessage()Ljava/lang/String;

    .line 1426
    :cond_9
    invoke-virtual {v4}, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Failure;->getCause()Ljava/lang/Throwable;

    move-result-object v4

    .line 542
    iget-object v2, v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->eventReporter:Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;

    .line 543
    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/CardUpdateParams;->getCardBrand()Lcom/stripe/android/model/CardBrand;

    move-result-object v3

    .line 542
    invoke-interface {v2, v3, v4}, Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;->onUpdatePaymentMethodFailed(Lcom/stripe/android/model/CardBrand;Ljava/lang/Throwable;)V

    :cond_a
    return-object v1
.end method

.method private final onAddCardPressed()V
    .locals 1

    const/4 v0, 0x0

    .line 393
    invoke-direct {p0, v0}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->transitionToAddPaymentMethod(Z)V

    return-void
.end method

.method private final onAddPaymentMethodItemChanged(Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;)V
    .locals 33

    move-object/from16 v0, p0

    .line 435
    iget-object v1, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->viewState:Lkotlinx/coroutines/flow/StateFlow;

    invoke-interface {v1}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    check-cast v1, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;

    goto :goto_0

    :cond_0
    move-object v1, v3

    :goto_0
    if-eqz v1, :cond_1

    .line 436
    invoke-virtual {v1}, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->getPaymentMethodCode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;->getCode()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto/16 :goto_5

    .line 441
    :cond_1
    iget-object v1, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->customerState:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;

    .line 442
    invoke-virtual {v1}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->getMetadata()Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    move-result-object v1

    if-eqz v1, :cond_9

    .line 444
    iget-object v2, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->eventReporter:Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;->getCode()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v4}, Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;->onPaymentMethodSelected(Ljava/lang/String;)V

    move-object/from16 v2, p1

    .line 446
    iput-object v2, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->previouslySelectedPaymentMethod:Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;

    .line 1372
    invoke-static {v0}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->access$getBackStack$p(Lcom/stripe/android/customersheet/CustomerSheetViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v4

    .line 1374
    :cond_2
    invoke-interface {v4}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v5

    .line 1375
    move-object v6, v5

    check-cast v6, Ljava/util/List;

    .line 1376
    check-cast v6, Ljava/lang/Iterable;

    .line 1377
    new-instance v7, Ljava/util/ArrayList;

    const/16 v8, 0xa

    invoke-static {v6, v8}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v7, Ljava/util/Collection;

    .line 1378
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_8

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .line 1379
    check-cast v8, Lcom/stripe/android/customersheet/CustomerSheetViewState;

    .line 1380
    instance-of v9, v8, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;

    if-eqz v9, :cond_7

    .line 1381
    move-object v10, v8

    check-cast v10, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;

    .line 450
    invoke-virtual {v2}, Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;->getCode()Ljava/lang/String;

    move-result-object v11

    .line 451
    sget-object v8, Lcom/stripe/android/paymentsheet/forms/FormArgumentsFactory;->INSTANCE:Lcom/stripe/android/paymentsheet/forms/FormArgumentsFactory;

    .line 452
    invoke-virtual {v2}, Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;->getCode()Ljava/lang/String;

    move-result-object v9

    .line 451
    invoke-virtual {v8, v9, v1}, Lcom/stripe/android/paymentsheet/forms/FormArgumentsFactory;->create(Ljava/lang/String;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;)Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    move-result-object v15

    .line 456
    invoke-virtual {v2}, Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;->getCode()Ljava/lang/String;

    move-result-object v8

    .line 457
    new-instance v16, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments$Factory$Default;

    .line 458
    iget-object v9, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->cardAccountRangeRepositoryFactory:Lcom/stripe/android/cards/DefaultCardAccountRangeRepositoryFactory;

    move-object/from16 v17, v9

    check-cast v17, Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;

    .line 463
    new-instance v20, Lcom/stripe/android/customersheet/CustomerSheetViewModel$$ExternalSyntheticLambda7;

    invoke-direct/range {v20 .. v20}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$$ExternalSyntheticLambda7;-><init>()V

    const/16 v27, 0x1f0

    const/16 v28, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    .line 457
    invoke-direct/range {v16 .. v28}, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments$Factory$Default;-><init>(Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Lcom/stripe/android/link/LinkConfigurationCoordinator;Lcom/stripe/android/paymentsheet/LinkInlineHandler;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/model/PaymentMethodOptionsParams;Lcom/stripe/android/model/PaymentMethodExtraParams;Lcom/stripe/android/link/ui/inline/UserInput;ZLcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Factory;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v9, v16

    check-cast v9, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments$Factory;

    .line 455
    invoke-virtual {v1, v8, v9}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->formElementsForCode(Ljava/lang/String;Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments$Factory;)Ljava/util/List;

    move-result-object v8

    if-nez v8, :cond_3

    .line 472
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v8

    :cond_3
    move-object v14, v8

    .line 474
    invoke-virtual {v2}, Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;->getCode()Ljava/lang/String;

    move-result-object v8

    sget-object v9, Lcom/stripe/android/model/PaymentMethod$Type;->USBankAccount:Lcom/stripe/android/model/PaymentMethod$Type;

    iget-object v9, v9, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    invoke-virtual {v10}, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->getBankAccountSelection()Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;

    move-result-object v8

    if-nez v8, :cond_4

    .line 476
    sget v8, Lcom/stripe/android/ui/core/R$string;->stripe_continue_button_label:I

    invoke-static {v8}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(I)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v8

    goto :goto_2

    .line 478
    :cond_4
    sget v8, Lcom/stripe/android/paymentsheet/R$string;->stripe_paymentsheet_save:I

    invoke-static {v8}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(I)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v8

    :goto_2
    move-object/from16 v23, v8

    .line 480
    invoke-virtual {v10}, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->getDraftPaymentSelection()Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    move-result-object v8

    const/4 v9, 0x1

    if-eqz v8, :cond_5

    .line 481
    iget-object v12, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->configuration:Lcom/stripe/android/customersheet/CustomerSheet$Configuration;

    invoke-virtual {v12}, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->getMerchantDisplayName()Ljava/lang/String;

    move-result-object v12

    .line 480
    invoke-virtual {v8, v12, v9}, Lcom/stripe/android/paymentsheet/model/PaymentSelection;->mandateText(Ljava/lang/String;Z)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v8

    move-object/from16 v26, v8

    goto :goto_3

    :cond_5
    move-object/from16 v26, v3

    .line 484
    :goto_3
    invoke-virtual {v10}, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->getFormFieldValues()Lcom/stripe/android/paymentsheet/forms/FormFieldValues;

    move-result-object v8

    if-eqz v8, :cond_6

    invoke-virtual {v10}, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->isProcessing()Z

    move-result v8

    if-nez v8, :cond_6

    goto :goto_4

    :cond_6
    const/4 v9, 0x0

    :goto_4
    move/from16 v24, v9

    const v31, 0xf4fe6

    const/16 v32, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    .line 449
    invoke-static/range {v10 .. v32}, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->copy$default(Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/paymentsheet/forms/FormFieldValues;Ljava/util/List;Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;Lcom/stripe/android/paymentsheet/model/PaymentSelection;ZZZLcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;Lcom/stripe/android/core/strings/ResolvableString;ZZLcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;Lcom/stripe/android/payments/core/analytics/ErrorReporter;ILjava/lang/Object;)Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;

    move-result-object v8

    .line 1381
    check-cast v8, Lcom/stripe/android/customersheet/CustomerSheetViewState;

    .line 1379
    :cond_7
    invoke-interface {v7, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    .line 1385
    :cond_8
    check-cast v7, Ljava/util/List;

    .line 1387
    invoke-interface {v4, v5, v7}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    :goto_5
    return-void

    .line 442
    :cond_9
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Required value was null."

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method private static final onAddPaymentMethodItemChanged$lambda$10$lambda$9(Lcom/stripe/android/link/ui/inline/InlineSignupViewState;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 465
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 466
    const-string v0, "`CustomerSheet` does not implement `Link` and should not receive `InlineSignUpViewState` updates"

    .line 465
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final onAnalyticsEvent(Lcom/stripe/android/core/networking/AnalyticsEvent;)V
    .locals 1

    .line 928
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->eventReporter:Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;

    invoke-interface {v0, p1}, Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;->onAnalyticsEvent(Lcom/stripe/android/core/networking/AnalyticsEvent;)V

    return-void
.end method

.method private final onBackPressed()V
    .locals 6

    .line 403
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->backStack:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 404
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->_result:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 405
    new-instance v1, Lcom/stripe/android/customersheet/InternalCustomerSheetResult$Canceled;

    iget-object v2, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->originalPaymentSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    invoke-direct {v1, v2}, Lcom/stripe/android/customersheet/InternalCustomerSheetResult$Canceled;-><init>(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V

    .line 404
    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->tryEmit(Ljava/lang/Object;)Z

    return-void

    .line 408
    :cond_0
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->backStack:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 1368
    :cond_1
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v2

    .line 1369
    move-object v3, v2

    check-cast v3, Ljava/util/List;

    .line 409
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/stripe/android/customersheet/CustomerSheetViewState;

    invoke-direct {p0, v4}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->getEventReporterScreen(Lcom/stripe/android/customersheet/CustomerSheetViewState;)Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$Screen;

    move-result-object v4

    if-eqz v4, :cond_2

    .line 410
    iget-object v5, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->eventReporter:Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;

    invoke-interface {v5, v4}, Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;->onScreenHidden(Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$Screen;)V

    .line 413
    :cond_2
    invoke-static {v3, v1}, Lkotlin/collections/CollectionsKt;->dropLast(Ljava/util/List;I)Ljava/util/List;

    move-result-object v3

    .line 1370
    invoke-interface {v0, v2, v3}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    return-void
.end method

.method private final onCancelCloseForm()V
    .locals 29

    .line 1526
    invoke-static/range {p0 .. p0}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->access$getBackStack$p(Lcom/stripe/android/customersheet/CustomerSheetViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v0

    .line 1528
    :cond_0
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v1

    .line 1529
    move-object v2, v1

    check-cast v2, Ljava/util/List;

    .line 1530
    check-cast v2, Ljava/lang/Iterable;

    .line 1531
    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v2, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v3, Ljava/util/Collection;

    .line 1532
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 1533
    check-cast v4, Lcom/stripe/android/customersheet/CustomerSheetViewState;

    .line 1534
    instance-of v5, v4, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;

    if-eqz v5, :cond_1

    .line 1535
    move-object v6, v4

    check-cast v6, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;

    const v27, 0xdffff

    const/16 v28, 0x0

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

    .line 945
    invoke-static/range {v6 .. v28}, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->copy$default(Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/paymentsheet/forms/FormFieldValues;Ljava/util/List;Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;Lcom/stripe/android/paymentsheet/model/PaymentSelection;ZZZLcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;Lcom/stripe/android/core/strings/ResolvableString;ZZLcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;Lcom/stripe/android/payments/core/analytics/ErrorReporter;ILjava/lang/Object;)Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;

    move-result-object v4

    .line 1535
    check-cast v4, Lcom/stripe/android/customersheet/CustomerSheetViewState;

    .line 1533
    :cond_1
    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1539
    :cond_2
    check-cast v3, Ljava/util/List;

    .line 1541
    invoke-interface {v0, v1, v3}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void
.end method

.method private final onCardNumberInputCompleted()V
    .locals 1

    .line 924
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->eventReporter:Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;

    invoke-interface {v0}, Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;->onCardNumberCompleted()V

    return-void
.end method

.method private final onCollectUSBankAccountResult(Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;)V
    .locals 29

    .line 1490
    invoke-static/range {p0 .. p0}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->access$getBackStack$p(Lcom/stripe/android/customersheet/CustomerSheetViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v0

    .line 1492
    :cond_0
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v1

    .line 1493
    move-object v2, v1

    check-cast v2, Ljava/util/List;

    .line 1494
    check-cast v2, Ljava/lang/Iterable;

    .line 1495
    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v2, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v3, Ljava/util/Collection;

    .line 1496
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 1497
    check-cast v4, Lcom/stripe/android/customersheet/CustomerSheetViewState;

    .line 1498
    instance-of v5, v4, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;

    if-eqz v5, :cond_2

    .line 1499
    move-object v6, v4

    check-cast v6, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;

    if-eqz p1, :cond_1

    .line 915
    sget v4, Lcom/stripe/android/paymentsheet/R$string;->stripe_paymentsheet_save:I

    invoke-static {v4}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(I)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v4

    goto :goto_1

    .line 917
    :cond_1
    sget v4, Lcom/stripe/android/ui/core/R$string;->stripe_continue_button_label:I

    invoke-static {v4}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(I)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v4

    :goto_1
    move-object/from16 v19, v4

    const v27, 0xbefff

    const/16 v28, 0x0

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

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    move-object/from16 v25, p1

    .line 912
    invoke-static/range {v6 .. v28}, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->copy$default(Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/paymentsheet/forms/FormFieldValues;Ljava/util/List;Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;Lcom/stripe/android/paymentsheet/model/PaymentSelection;ZZZLcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;Lcom/stripe/android/core/strings/ResolvableString;ZZLcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;Lcom/stripe/android/payments/core/analytics/ErrorReporter;ILjava/lang/Object;)Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;

    move-result-object v4

    .line 1499
    check-cast v4, Lcom/stripe/android/customersheet/CustomerSheetViewState;

    .line 1497
    :cond_2
    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1503
    :cond_3
    check-cast v3, Ljava/util/List;

    .line 1505
    invoke-interface {v0, v1, v3}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void
.end method

.method private final onDisallowedCardBrandEntered(Lcom/stripe/android/model/CardBrand;)V
    .locals 1

    .line 932
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->eventReporter:Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;

    invoke-interface {v0, p1}, Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;->onDisallowedCardBrandEntered(Lcom/stripe/android/model/CardBrand;)V

    return-void
.end method

.method private final onDismissed()V
    .locals 4

    .line 397
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->_result:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 1363
    :cond_0
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v1

    .line 1364
    move-object v2, v1

    check-cast v2, Lcom/stripe/android/customersheet/InternalCustomerSheetResult;

    .line 398
    new-instance v2, Lcom/stripe/android/customersheet/InternalCustomerSheetResult$Canceled;

    iget-object v3, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->originalPaymentSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    invoke-direct {v2, v3}, Lcom/stripe/android/customersheet/InternalCustomerSheetResult$Canceled;-><init>(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V

    check-cast v2, Lcom/stripe/android/customersheet/InternalCustomerSheetResult;

    .line 1365
    invoke-interface {v0, v1, v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void
.end method

.method private final onEditPressed()V
    .locals 2

    .line 419
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->customerState:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;

    invoke-virtual {v0}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->getCanEdit()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 423
    :cond_0
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->isEditing:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 426
    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->eventReporter:Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;

    invoke-interface {v1}, Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;->onEditCompleted()V

    goto :goto_0

    .line 428
    :cond_1
    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->eventReporter:Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;

    invoke-interface {v1}, Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;->onEditTapped()V

    .line 431
    :goto_0
    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->isEditing:Lkotlinx/coroutines/flow/MutableStateFlow;

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {v1, v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final onFormError(Lcom/stripe/android/core/strings/ResolvableString;)V
    .locals 29

    .line 1508
    invoke-static/range {p0 .. p0}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->access$getBackStack$p(Lcom/stripe/android/customersheet/CustomerSheetViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v0

    .line 1510
    :cond_0
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v1

    .line 1511
    move-object v2, v1

    check-cast v2, Ljava/util/List;

    .line 1512
    check-cast v2, Ljava/lang/Iterable;

    .line 1513
    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v2, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v3, Ljava/util/Collection;

    .line 1514
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 1515
    check-cast v4, Lcom/stripe/android/customersheet/CustomerSheetViewState;

    .line 1516
    instance-of v5, v4, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;

    if-eqz v5, :cond_1

    .line 1517
    move-object v6, v4

    check-cast v6, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;

    const v27, 0xffbff

    const/16 v28, 0x0

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

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    move-object/from16 v17, p1

    .line 937
    invoke-static/range {v6 .. v28}, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->copy$default(Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/paymentsheet/forms/FormFieldValues;Ljava/util/List;Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;Lcom/stripe/android/paymentsheet/model/PaymentSelection;ZZZLcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;Lcom/stripe/android/core/strings/ResolvableString;ZZLcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;Lcom/stripe/android/payments/core/analytics/ErrorReporter;ILjava/lang/Object;)Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;

    move-result-object v4

    .line 1517
    check-cast v4, Lcom/stripe/android/customersheet/CustomerSheetViewState;

    .line 1515
    :cond_1
    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1521
    :cond_2
    check-cast v3, Ljava/util/List;

    .line 1523
    invoke-interface {v0, v1, v3}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void
.end method

.method private final onFormFieldValuesCompleted(Lcom/stripe/android/paymentsheet/forms/FormFieldValues;)V
    .locals 30

    move-object/from16 v0, p0

    move-object/from16 v4, p1

    .line 490
    iget-object v1, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->customerState:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;

    invoke-virtual {v1}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->getMetadata()Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    move-result-object v1

    if-eqz v1, :cond_7

    .line 1390
    invoke-static {v0}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->access$getBackStack$p(Lcom/stripe/android/customersheet/CustomerSheetViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v2

    .line 1392
    :goto_0
    invoke-interface {v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v3

    .line 1393
    move-object v5, v3

    check-cast v5, Ljava/util/List;

    .line 1394
    check-cast v5, Ljava/lang/Iterable;

    .line 1395
    new-instance v6, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {v5, v7}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v6, Ljava/util/Collection;

    .line 1396
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v24

    :goto_1
    invoke-interface/range {v24 .. v24}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface/range {v24 .. v24}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 1397
    check-cast v5, Lcom/stripe/android/customersheet/CustomerSheetViewState;

    .line 1398
    instance-of v7, v5, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;

    if-eqz v7, :cond_4

    .line 1399
    check-cast v5, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;

    if-eqz v4, :cond_0

    .line 494
    invoke-virtual {v5}, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->isProcessing()Z

    move-result v7

    if-nez v7, :cond_0

    const/4 v7, 0x1

    goto :goto_2

    :cond_0
    const/4 v7, 0x0

    :goto_2
    move v15, v7

    if-eqz v4, :cond_3

    .line 496
    invoke-virtual {v5}, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->getSupportedPaymentMethods()Ljava/util/List;

    move-result-object v7

    check-cast v7, Ljava/lang/Iterable;

    .line 1400
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_2

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;

    .line 496
    invoke-virtual {v8}, Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;->getCode()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v5}, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->getPaymentMethodCode()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    .line 495
    invoke-static {v4, v8, v1}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt;->transformToPaymentSelection(Lcom/stripe/android/paymentsheet/forms/FormFieldValues;Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;)Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    move-result-object v7

    goto :goto_3

    .line 1401
    :cond_2
    new-instance v1, Ljava/util/NoSuchElementException;

    const-string v2, "Collection contains no element matching the predicate."

    invoke-direct {v1, v2}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    const/4 v7, 0x0

    :goto_3
    move-object v8, v7

    const v22, 0xfdfbb

    const/16 v23, 0x0

    move-object v7, v2

    const/4 v2, 0x0

    move-object v9, v3

    const/4 v3, 0x0

    move-object v10, v1

    move-object v1, v5

    const/4 v5, 0x0

    move-object v11, v6

    const/4 v6, 0x0

    move-object v12, v7

    const/4 v7, 0x0

    move-object v13, v9

    const/4 v9, 0x0

    move-object v14, v10

    const/4 v10, 0x0

    move-object/from16 v16, v11

    const/4 v11, 0x0

    move-object/from16 v17, v12

    const/4 v12, 0x0

    move-object/from16 v18, v13

    const/4 v13, 0x0

    move-object/from16 v19, v14

    const/4 v14, 0x0

    move-object/from16 v20, v16

    const/16 v16, 0x0

    move-object/from16 v21, v17

    const/16 v17, 0x0

    move-object/from16 v25, v18

    const/16 v18, 0x0

    move-object/from16 v26, v19

    const/16 v19, 0x0

    move-object/from16 v27, v20

    const/16 v20, 0x0

    move-object/from16 v28, v21

    const/16 v21, 0x0

    move-object/from16 v29, v25

    move-object/from16 v0, v27

    .line 492
    invoke-static/range {v1 .. v23}, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->copy$default(Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/paymentsheet/forms/FormFieldValues;Ljava/util/List;Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;Lcom/stripe/android/paymentsheet/model/PaymentSelection;ZZZLcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;Lcom/stripe/android/core/strings/ResolvableString;ZZLcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;Lcom/stripe/android/payments/core/analytics/ErrorReporter;ILjava/lang/Object;)Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;

    move-result-object v1

    .line 1399
    move-object v5, v1

    check-cast v5, Lcom/stripe/android/customersheet/CustomerSheetViewState;

    goto :goto_4

    :cond_4
    move-object/from16 v26, v1

    move-object/from16 v28, v2

    move-object/from16 v29, v3

    move-object v0, v6

    .line 1397
    :goto_4
    invoke-interface {v0, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v4, p1

    move-object v6, v0

    move-object/from16 v1, v26

    move-object/from16 v2, v28

    move-object/from16 v3, v29

    move-object/from16 v0, p0

    goto/16 :goto_1

    :cond_5
    move-object/from16 v26, v1

    move-object/from16 v28, v2

    move-object/from16 v29, v3

    move-object v0, v6

    .line 1404
    move-object v6, v0

    check-cast v6, Ljava/util/List;

    move-object/from16 v7, v28

    move-object/from16 v9, v29

    .line 1406
    invoke-interface {v7, v9, v6}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    goto :goto_5

    :cond_6
    move-object/from16 v0, p0

    move-object/from16 v4, p1

    move-object v2, v7

    move-object/from16 v1, v26

    goto/16 :goto_0

    :cond_7
    :goto_5
    return-void
.end method

.method private final onItemSelected(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V
    .locals 3

    .line 691
    instance-of v0, p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$GooglePay;

    if-nez v0, :cond_1

    instance-of v0, p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 696
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 702
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unsupported payment selection "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 692
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->isEditing:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    return-void

    .line 696
    :cond_2
    new-instance v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$$ExternalSyntheticLambda0;

    invoke-direct {v0, p1}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V

    invoke-direct {p0, v0}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->setCustomerState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final onItemSelected$lambda$23(Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;)Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;
    .locals 9

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v7, 0x1d

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v3, p0

    move-object v1, p1

    .line 697
    invoke-static/range {v1 .. v8}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->copy$default(Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;Ljava/util/List;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lcom/stripe/android/customersheet/CustomerPermissions;Lcom/stripe/android/customersheet/CustomerSheet$Configuration;ILjava/lang/Object;)Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;

    move-result-object p0

    return-object p0
.end method

.method private final onModifyItem(Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;)V
    .locals 21

    move-object/from16 v0, p0

    .line 557
    iget-object v1, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->customerState:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;

    .line 560
    new-instance v2, Lcom/stripe/android/customersheet/CustomerSheetViewState$UpdatePaymentMethod;

    .line 562
    iget-object v3, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->isLiveModeProvider:Lkotlin/jvm/functions/Function0;

    invoke-interface {v3}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    .line 563
    invoke-virtual {v1}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->getCanRemove()Z

    move-result v6

    .line 564
    invoke-virtual {v1}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->getCanUpdateFullPaymentMethodDetails()Z

    move-result v10

    .line 566
    iget-object v3, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->configuration:Lcom/stripe/android/customersheet/CustomerSheet$Configuration;

    invoke-virtual {v3}, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->getBillingDetailsCollectionConfiguration()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;->getAddress()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$AddressCollectionMode;

    move-result-object v9

    .line 567
    new-instance v3, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentSheetCardBrandFilter;

    invoke-virtual {v1}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->getConfiguration()Lcom/stripe/android/customersheet/CustomerSheet$Configuration;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->getCardBrandAcceptance$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;

    move-result-object v1

    invoke-direct {v3, v1}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentSheetCardBrandFilter;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;)V

    .line 568
    new-instance v1, Lcom/stripe/android/customersheet/CustomerSheetViewModel$onModifyItem$1;

    invoke-direct {v1, v0}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$onModifyItem$1;-><init>(Ljava/lang/Object;)V

    check-cast v1, Lkotlin/reflect/KFunction;

    .line 580
    new-instance v4, Lcom/stripe/android/customersheet/CustomerSheetViewModel$onModifyItem$2;

    invoke-direct {v4, v0}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$onModifyItem$2;-><init>(Ljava/lang/Object;)V

    check-cast v4, Lkotlin/reflect/KFunction;

    move-object v7, v4

    .line 561
    new-instance v4, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;

    .line 567
    move-object v8, v3

    check-cast v8, Lcom/stripe/android/CardBrandFilter;

    .line 568
    move-object v13, v1

    check-cast v13, Lkotlin/jvm/functions/Function2;

    .line 580
    move-object v14, v7

    check-cast v14, Lkotlin/jvm/functions/Function3;

    .line 559
    new-instance v1, Lcom/stripe/android/customersheet/CustomerSheetViewModel$onModifyItem$3;

    const/4 v3, 0x0

    invoke-direct {v1, v3}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$onModifyItem$3;-><init>(Lkotlin/coroutines/Continuation;)V

    move-object v15, v1

    check-cast v15, Lkotlin/jvm/functions/Function2;

    new-instance v1, Lcom/stripe/android/customersheet/CustomerSheetViewModel$$ExternalSyntheticLambda5;

    invoke-direct {v1, v0}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$$ExternalSyntheticLambda5;-><init>(Lcom/stripe/android/customersheet/CustomerSheetViewModel;)V

    new-instance v7, Lcom/stripe/android/customersheet/CustomerSheetViewModel$$ExternalSyntheticLambda6;

    invoke-direct {v7, v0}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$$ExternalSyntheticLambda6;-><init>(Lcom/stripe/android/customersheet/CustomerSheetViewModel;)V

    const/16 v19, 0x2000

    const/16 v20, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v18, 0x0

    move-object/from16 v16, v1

    move-object/from16 v17, v7

    move-object/from16 v7, p1

    .line 561
    invoke-direct/range {v4 .. v20}, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;-><init>(ZZLcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;Lcom/stripe/android/CardBrandFilter;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$AddressCollectionMode;ZZZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor$Factory;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v4, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;

    .line 591
    iget-object v1, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->isLiveModeProvider:Lkotlin/jvm/functions/Function0;

    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    .line 560
    invoke-direct {v2, v4, v1}, Lcom/stripe/android/customersheet/CustomerSheetViewState$UpdatePaymentMethod;-><init>(Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;Z)V

    check-cast v2, Lcom/stripe/android/customersheet/CustomerSheetViewState;

    const/4 v1, 0x0

    const/4 v4, 0x2

    .line 559
    invoke-static {v0, v2, v1, v4, v3}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->transition$default(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lcom/stripe/android/customersheet/CustomerSheetViewState;ZILjava/lang/Object;)V

    return-void
.end method

.method private static final onModifyItem$lambda$19(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lcom/stripe/android/model/CardBrand;)Lkotlin/Unit;
    .locals 1

    const-string v0, "brand"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 570
    iget-object p0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->eventReporter:Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;

    .line 571
    sget-object v0, Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$CardBrandChoiceEventSource;->Edit:Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$CardBrandChoiceEventSource;

    .line 570
    invoke-interface {p0, v0, p1}, Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;->onBrandChoiceSelected(Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$CardBrandChoiceEventSource;Lcom/stripe/android/model/CardBrand;)V

    .line 574
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onModifyItem$lambda$20(Lcom/stripe/android/customersheet/CustomerSheetViewModel;)Lkotlin/Unit;
    .locals 7

    .line 576
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    new-instance v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$onModifyItem$5$1;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$onModifyItem$5$1;-><init>(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 579
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private final onPrimaryButtonPressed()V
    .locals 31

    move-object/from16 v0, p0

    .line 707
    iget-object v1, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->viewState:Lkotlinx/coroutines/flow/StateFlow;

    invoke-interface {v1}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/customersheet/CustomerSheetViewState;

    .line 708
    instance-of v2, v1, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;

    if-eqz v2, :cond_8

    .line 709
    move-object v2, v1

    check-cast v2, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;

    invoke-virtual {v2}, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->getCustomPrimaryButtonUiState()Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 710
    invoke-virtual {v2}, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->getCustomPrimaryButtonUiState()Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;->getOnClick()Lkotlin/jvm/functions/Function0;

    move-result-object v1

    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    return-void

    .line 1436
    :cond_0
    invoke-static {v0}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->access$getBackStack$p(Lcom/stripe/android/customersheet/CustomerSheetViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v3

    .line 1438
    :cond_1
    invoke-interface {v3}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v1

    .line 1439
    move-object v4, v1

    check-cast v4, Ljava/util/List;

    .line 1440
    check-cast v4, Ljava/lang/Iterable;

    .line 1441
    new-instance v5, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v4, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v5, Ljava/util/Collection;

    .line 1442
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .line 1443
    check-cast v6, Lcom/stripe/android/customersheet/CustomerSheetViewState;

    .line 1444
    instance-of v7, v6, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;

    if-eqz v7, :cond_2

    .line 1445
    move-object v8, v6

    check-cast v8, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;

    const v29, 0xfdd7f

    const/16 v30, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x1

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

    .line 715
    invoke-static/range {v8 .. v30}, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->copy$default(Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/paymentsheet/forms/FormFieldValues;Ljava/util/List;Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;Lcom/stripe/android/paymentsheet/model/PaymentSelection;ZZZLcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;Lcom/stripe/android/core/strings/ResolvableString;ZZLcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;Lcom/stripe/android/payments/core/analytics/ErrorReporter;ILjava/lang/Object;)Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;

    move-result-object v6

    .line 1445
    check-cast v6, Lcom/stripe/android/customersheet/CustomerSheetViewState;

    .line 1443
    :cond_2
    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1449
    :cond_3
    check-cast v5, Ljava/util/List;

    .line 1451
    invoke-interface {v3, v1, v5}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 722
    invoke-virtual {v2}, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->getPaymentMethodCode()Ljava/lang/String;

    move-result-object v1

    sget-object v3, Lcom/stripe/android/model/PaymentMethod$Type;->USBankAccount:Lcom/stripe/android/model/PaymentMethod$Type;

    iget-object v3, v3, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 723
    invoke-virtual {v2}, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->getBankAccountSelection()Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;->getPaymentMethodCreateParams()Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object v1

    if-eqz v1, :cond_4

    goto :goto_1

    :cond_4
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 724
    const-string v2, "Invalid bankAccountSelection"

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 726
    :cond_5
    invoke-virtual {v2}, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->getFormFieldValues()Lcom/stripe/android/paymentsheet/forms/FormFieldValues;

    move-result-object v1

    if-eqz v1, :cond_7

    .line 728
    invoke-virtual {v2}, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->getPaymentMethodCode()Ljava/lang/String;

    move-result-object v2

    .line 729
    iget-object v3, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->customerState:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {v3}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;

    invoke-virtual {v3}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->getMetadata()Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    move-result-object v3

    if-eqz v3, :cond_6

    .line 727
    invoke-static {v1, v2, v3}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt;->transformToPaymentMethodCreateParams(Lcom/stripe/android/paymentsheet/forms/FormFieldValues;Ljava/lang/String;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;)Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object v1

    .line 733
    :goto_1
    invoke-direct {v0, v1}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->createAndAttach(Lcom/stripe/android/model/PaymentMethodCreateParams;)V

    return-void

    .line 729
    :cond_6
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Required value was null."

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 726
    :cond_7
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "completeFormValues cannot be null"

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 735
    :cond_8
    instance-of v2, v1, Lcom/stripe/android/customersheet/CustomerSheetViewState$SelectPaymentMethod;

    const-string v3, " is not supported"

    if-eqz v2, :cond_c

    .line 736
    new-instance v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$$ExternalSyntheticLambda4;

    invoke-direct {v2}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$$ExternalSyntheticLambda4;-><init>()V

    invoke-direct {v0, v2}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->setSelectionConfirmationState(Lkotlin/jvm/functions/Function1;)V

    .line 741
    check-cast v1, Lcom/stripe/android/customersheet/CustomerSheetViewState$SelectPaymentMethod;

    invoke-virtual {v1}, Lcom/stripe/android/customersheet/CustomerSheetViewState$SelectPaymentMethod;->getPaymentSelection()Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    move-result-object v1

    .line 742
    instance-of v2, v1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$GooglePay;

    if-eqz v2, :cond_9

    invoke-direct {v0}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->selectGooglePay()V

    return-void

    .line 743
    :cond_9
    instance-of v2, v1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;

    if-eqz v2, :cond_a

    check-cast v1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;

    invoke-direct {v0, v1}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->selectSavedPaymentMethod(Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;)V

    return-void

    :cond_a
    if-nez v1, :cond_b

    const/4 v1, 0x0

    .line 744
    invoke-direct {v0, v1}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->selectSavedPaymentMethod(Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;)V

    return-void

    :cond_b
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 745
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_c
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 748
    iget-object v2, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->viewState:Lkotlinx/coroutines/flow/StateFlow;

    invoke-interface {v2}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method private static final onPrimaryButtonPressed$lambda$25(Lcom/stripe/android/customersheet/CustomerSheetViewModel$SelectionConfirmationState;)Lcom/stripe/android/customersheet/CustomerSheetViewModel$SelectionConfirmationState;
    .locals 3

    const-string v0, "state"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x1

    .line 737
    invoke-static {p0, v2, v0, v1, v0}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$SelectionConfirmationState;->copy$default(Lcom/stripe/android/customersheet/CustomerSheetViewModel$SelectionConfirmationState;ZLjava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/customersheet/CustomerSheetViewModel$SelectionConfirmationState;

    move-result-object p0

    return-object p0
.end method

.method private final refreshAndUpdatePaymentMethods(Lcom/stripe/android/model/PaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/PaymentMethod;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1105
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v0

    invoke-interface {v0}, Lkotlinx/coroutines/CoroutineScope;->getCoroutineContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v0

    new-instance v1, Lcom/stripe/android/customersheet/CustomerSheetViewModel$refreshAndUpdatePaymentMethods$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$refreshAndUpdatePaymentMethods$2;-><init>(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lcom/stripe/android/model/PaymentMethod;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function2;

    invoke-static {v0, v1, p2}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method private final removeExecutor(Lcom/stripe/android/model/PaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/PaymentMethod;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Throwable;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$removeExecutor$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$removeExecutor$1;

    iget v1, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$removeExecutor$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p2, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$removeExecutor$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$removeExecutor$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$removeExecutor$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$removeExecutor$1;-><init>(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$removeExecutor$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 596
    iget v2, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$removeExecutor$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$removeExecutor$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/model/PaymentMethod;

    iget-object v0, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$removeExecutor$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 597
    iput-object p0, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$removeExecutor$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$removeExecutor$1;->L$1:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$removeExecutor$1;->label:I

    invoke-direct {p0, p1, v0}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->removePaymentMethod(Lcom/stripe/android/model/PaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    .line 596
    :goto_1
    check-cast p2, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;

    .line 1429
    instance-of v1, p2, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Success;

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    .line 1430
    move-object v1, p2

    check-cast v1, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Success;

    invoke-virtual {v1}, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Success;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/model/PaymentMethod;

    .line 598
    move-object v1, v0

    check-cast v1, Landroidx/lifecycle/ViewModel;

    invoke-static {v1}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v3

    new-instance v1, Lcom/stripe/android/customersheet/CustomerSheetViewModel$removeExecutor$2$1;

    invoke-direct {v1, v0, p1, v2}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$removeExecutor$2$1;-><init>(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lcom/stripe/android/model/PaymentMethod;Lkotlin/coroutines/Continuation;)V

    move-object v6, v1

    check-cast v6, Lkotlin/jvm/functions/Function2;

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 602
    :cond_4
    invoke-static {p2}, Lcom/stripe/android/customersheet/data/CustomerSheetDataResultKtxKt;->failureOrNull(Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;)Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Failure;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Failure;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    return-object p1

    :cond_5
    return-object v2
.end method

.method private final removePaymentMethod(Lcom/stripe/android/model/PaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/PaymentMethod;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/customersheet/data/CustomerSheetDataResult<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$removePaymentMethod$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$removePaymentMethod$1;

    iget v1, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$removePaymentMethod$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p2, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$removePaymentMethod$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$removePaymentMethod$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$removePaymentMethod$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$removePaymentMethod$1;-><init>(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$removePaymentMethod$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 504
    iget v2, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$removePaymentMethod$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$removePaymentMethod$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/model/PaymentMethod;

    iget-object v0, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$removePaymentMethod$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$removePaymentMethod$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/model/PaymentMethod;

    iget-object v2, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$removePaymentMethod$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 505
    iput-object p0, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$removePaymentMethod$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$removePaymentMethod$1;->L$1:Ljava/lang/Object;

    iput v4, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$removePaymentMethod$1;->label:I

    invoke-direct {p0, v0}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->awaitPaymentMethodDataSource(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_2

    :cond_4
    move-object v2, p0

    .line 504
    :goto_1
    check-cast p2, Lcom/stripe/android/customersheet/data/CustomerSheetPaymentMethodDataSource;

    .line 506
    iget-object v4, p1, Lcom/stripe/android/model/PaymentMethod;->id:Ljava/lang/String;

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 505
    iput-object v2, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$removePaymentMethod$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$removePaymentMethod$1;->L$1:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$removePaymentMethod$1;->label:I

    invoke-interface {p2, v4, v0}, Lcom/stripe/android/customersheet/data/CustomerSheetPaymentMethodDataSource;->detachPaymentMethod(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    move-object v0, v2

    .line 504
    :goto_3
    check-cast p2, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;

    .line 1409
    instance-of v1, p2, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Success;

    if-eqz v1, :cond_6

    .line 1410
    move-object v1, p2

    check-cast v1, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Success;

    invoke-virtual {v1}, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Success;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/model/PaymentMethod;

    .line 508
    iget-object v1, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->eventReporter:Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;

    invoke-interface {v1}, Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;->onRemovePaymentMethodSucceeded()V

    .line 1413
    :cond_6
    invoke-static {p2}, Lcom/stripe/android/customersheet/data/CustomerSheetDataResultKtxKt;->failureOrNull(Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;)Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Failure;

    move-result-object v1

    if-eqz v1, :cond_9

    .line 1414
    invoke-virtual {v1}, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Failure;->getDisplayMessage()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_8

    .line 1415
    invoke-virtual {v1}, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Failure;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    instance-of v3, v2, Lcom/stripe/android/core/exception/StripeException;

    if-eqz v3, :cond_7

    check-cast v2, Lcom/stripe/android/core/exception/StripeException;

    goto :goto_4

    :cond_7
    const/4 v2, 0x0

    :goto_4
    if-eqz v2, :cond_8

    invoke-virtual {v2}, Lcom/stripe/android/core/exception/StripeException;->getStripeError()Lcom/stripe/android/core/StripeError;

    move-result-object v2

    if-eqz v2, :cond_8

    invoke-virtual {v2}, Lcom/stripe/android/core/StripeError;->getMessage()Ljava/lang/String;

    .line 1416
    :cond_8
    invoke-virtual {v1}, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Failure;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    .line 510
    iget-object v2, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->eventReporter:Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;

    invoke-interface {v2}, Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;->onRemovePaymentMethodFailed()V

    .line 511
    iget-object v0, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->logger:Lcom/stripe/android/core/Logger;

    .line 512
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Failed to detach payment method: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 511
    invoke-interface {v0, p1, v1}, Lcom/stripe/android/core/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_9
    return-object p2
.end method

.method private final removePaymentMethodFromState(Lcom/stripe/android/model/PaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/PaymentMethod;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 616
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->customerState:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;

    .line 617
    invoke-virtual {v3}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->getPaymentMethods()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 1433
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/Collection;

    .line 1434
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lcom/stripe/android/model/PaymentMethod;

    .line 617
    iget-object v4, v4, Lcom/stripe/android/model/PaymentMethod;->id:Ljava/lang/String;

    iget-object v5, p1, Lcom/stripe/android/model/PaymentMethod;->id:Ljava/lang/String;

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    .line 1434
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1435
    :cond_1
    move-object v4, v1

    check-cast v4, Ljava/util/List;

    .line 619
    invoke-virtual {v3}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->getCurrentSelection()Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    move-result-object v5

    .line 620
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->originalPaymentSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    .line 622
    instance-of v1, v5, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;

    if-eqz v1, :cond_2

    .line 623
    move-object v1, v5

    check-cast v1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;->getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object v1

    iget-object v1, v1, Lcom/stripe/android/model/PaymentMethod;->id:Ljava/lang/String;

    iget-object v2, p1, Lcom/stripe/android/model/PaymentMethod;->id:Ljava/lang/String;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x1

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    move v6, v1

    .line 625
    instance-of v1, v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;

    if-eqz v1, :cond_3

    .line 626
    check-cast v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;->getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object v0

    iget-object v0, v0, Lcom/stripe/android/model/PaymentMethod;->id:Ljava/lang/String;

    iget-object p1, p1, Lcom/stripe/android/model/PaymentMethod;->id:Ljava/lang/String;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 p1, 0x0

    .line 629
    iput-object p1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->originalPaymentSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    .line 632
    :cond_3
    move-object p1, p0

    check-cast p1, Landroidx/lifecycle/ViewModel;

    invoke-static {p1}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object p1

    invoke-interface {p1}, Lkotlinx/coroutines/CoroutineScope;->getCoroutineContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object p1

    new-instance v1, Lcom/stripe/android/customersheet/CustomerSheetViewModel$removePaymentMethodFromState$2;

    const/4 v7, 0x0

    move-object v2, p0

    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$removePaymentMethodFromState$2;-><init>(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;Ljava/util/List;Lcom/stripe/android/paymentsheet/model/PaymentSelection;ZLkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function2;

    invoke-static {p1, v1, p2}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_4

    return-object p1

    :cond_4
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method private final selectGooglePay()V
    .locals 9

    .line 1174
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->customerState:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;

    invoke-virtual {v0}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->getMetadata()Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->getCustomerMetadata()Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;->isPaymentMethodSetAsDefaultEnabled()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    .line 1176
    :goto_0
    move-object v2, p0

    check-cast v2, Landroidx/lifecycle/ViewModel;

    invoke-static {v2}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v3

    iget-object v4, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->workContext:Lkotlin/coroutines/CoroutineContext;

    new-instance v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$selectGooglePay$1;

    invoke-direct {v2, p0, v0, v1}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$selectGooglePay$1;-><init>(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)V

    move-object v6, v2

    check-cast v6, Lkotlin/jvm/functions/Function2;

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method private static final selectPaymentMethodState$lambda$2(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;Lcom/stripe/android/customersheet/CustomerSheetViewModel$SelectionConfirmationState;Z)Lcom/stripe/android/customersheet/CustomerSheetViewState$SelectPaymentMethod;
    .locals 16

    move-object/from16 v0, p0

    const-string v1, "customerState"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "selectionConfirmationState"

    move-object/from16 v3, p2

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 193
    invoke-virtual {v2}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->getPaymentMethods()Ljava/util/List;

    move-result-object v4

    .line 194
    invoke-virtual {v2}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->getMetadata()Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    move-result-object v1

    .line 195
    invoke-virtual {v2}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->getCurrentSelection()Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    move-result-object v5

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz p3, :cond_0

    .line 197
    invoke-virtual {v2}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->getCanEdit()Z

    move-result v8

    if-eqz v8, :cond_0

    move v8, v6

    goto :goto_0

    :cond_0
    move v8, v7

    :goto_0
    if-nez v8, :cond_1

    .line 198
    iget-object v9, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->originalPaymentSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    invoke-static {v9, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_1

    move v10, v6

    goto :goto_1

    :cond_1
    move v10, v7

    .line 201
    :goto_1
    iget-object v6, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->configuration:Lcom/stripe/android/customersheet/CustomerSheet$Configuration;

    invoke-virtual {v6}, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->getHeaderTextForSelectionScreen()Ljava/lang/String;

    move-result-object v6

    .line 204
    iget-object v9, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->isLiveModeProvider:Lkotlin/jvm/functions/Function0;

    invoke-interface {v9}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Boolean;

    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    .line 205
    invoke-virtual {v2}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->getCanRemove()Z

    move-result v12

    .line 207
    sget-object v11, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->Companion:Lcom/stripe/android/customersheet/CustomerSheetViewModel$Companion;

    invoke-virtual {v11, v1}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$Companion;->shouldShowGooglePay(Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;)Z

    move-result v1

    .line 209
    invoke-virtual {v3}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$SelectionConfirmationState;->isConfirming()Z

    move-result v11

    .line 210
    invoke-virtual {v3}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$SelectionConfirmationState;->getError()Ljava/lang/String;

    move-result-object v13

    .line 211
    invoke-virtual {v2}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->getCbcEligibility()Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;

    move-result-object v3

    instance-of v15, v3, Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility$Eligible;

    .line 212
    invoke-virtual {v2}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->getCanEdit()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v5, :cond_2

    .line 214
    iget-object v0, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->configuration:Lcom/stripe/android/customersheet/CustomerSheet$Configuration;

    invoke-virtual {v0}, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->getMerchantDisplayName()Ljava/lang/String;

    move-result-object v0

    .line 213
    invoke-virtual {v5, v0, v7}, Lcom/stripe/android/paymentsheet/model/PaymentSelection;->mandateText(Ljava/lang/String;Z)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v0

    if-eqz v0, :cond_2

    if-eqz v10, :cond_2

    move-object v14, v0

    goto :goto_2

    :cond_2
    move-object v14, v3

    :goto_2
    move v7, v11

    move v11, v2

    .line 200
    new-instance v2, Lcom/stripe/android/customersheet/CustomerSheetViewState$SelectPaymentMethod;

    move-object v3, v6

    move v6, v9

    move v9, v1

    invoke-direct/range {v2 .. v15}, Lcom/stripe/android/customersheet/CustomerSheetViewState$SelectPaymentMethod;-><init>(Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/paymentsheet/model/PaymentSelection;ZZZZZZZLjava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;Z)V

    return-object v2
.end method

.method private final selectSavedPaymentMethod(Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;)V
    .locals 9

    .line 1147
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->customerState:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;

    invoke-virtual {v0}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->getMetadata()Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->getCustomerMetadata()Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;->isPaymentMethodSetAsDefaultEnabled()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    .line 1149
    :goto_0
    move-object v2, p0

    check-cast v2, Landroidx/lifecycle/ViewModel;

    invoke-static {v2}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v3

    new-instance v2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$selectSavedPaymentMethod$1;

    invoke-direct {v2, p0, p1, v0, v1}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$selectSavedPaymentMethod$1;-><init>(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)V

    move-object v6, v2

    check-cast v6, Lkotlin/jvm/functions/Function2;

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method private final setCustomerState(Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;",
            "Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;",
            ">;)V"
        }
    .end annotation

    .line 952
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->customerState:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final setSelectionConfirmationState(Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/customersheet/CustomerSheetViewModel$SelectionConfirmationState;",
            "Lcom/stripe/android/customersheet/CustomerSheetViewModel$SelectionConfirmationState;",
            ">;)V"
        }
    .end annotation

    .line 956
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->selectionConfirmationState:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final transition(Lcom/stripe/android/customersheet/CustomerSheetViewState;Z)V
    .locals 3

    .line 1241
    instance-of v0, p1, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;

    if-eqz v0, :cond_0

    .line 1242
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->eventReporter:Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;

    sget-object v1, Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$Screen;->AddPaymentMethod:Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$Screen;

    invoke-interface {v0, v1}, Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;->onScreenPresented(Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$Screen;)V

    goto :goto_0

    .line 1243
    :cond_0
    instance-of v0, p1, Lcom/stripe/android/customersheet/CustomerSheetViewState$SelectPaymentMethod;

    if-eqz v0, :cond_1

    .line 1244
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->eventReporter:Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;

    sget-object v1, Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$Screen;->SelectPaymentMethod:Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$Screen;

    invoke-interface {v0, v1}, Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;->onScreenPresented(Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$Screen;)V

    goto :goto_0

    .line 1245
    :cond_1
    instance-of v0, p1, Lcom/stripe/android/customersheet/CustomerSheetViewState$UpdatePaymentMethod;

    if-eqz v0, :cond_2

    .line 1246
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->eventReporter:Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;

    sget-object v1, Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$Screen;->EditPaymentMethod:Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$Screen;

    invoke-interface {v0, v1}, Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;->onScreenPresented(Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$Screen;)V

    .line 1250
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->backStack:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 1606
    :cond_3
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v1

    .line 1607
    move-object v2, v1

    check-cast v2, Ljava/util/List;

    if-eqz p2, :cond_4

    .line 1251
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    goto :goto_1

    :cond_4
    check-cast v2, Ljava/util/Collection;

    invoke-static {v2, p1}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    .line 1608
    :goto_1
    invoke-interface {v0, v1, v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    return-void
.end method

.method static synthetic transition$default(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lcom/stripe/android/customersheet/CustomerSheetViewState;ZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 1239
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->transition(Lcom/stripe/android/customersheet/CustomerSheetViewState;Z)V

    return-void
.end method

.method private final transitionToAddPaymentMethod(Z)V
    .locals 27

    move-object/from16 v0, p0

    .line 786
    iget-object v1, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->customerState:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;

    .line 787
    invoke-virtual {v1}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->getMetadata()Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    move-result-object v1

    const-string v2, "Required value was null."

    if-eqz v1, :cond_5

    .line 789
    iget-object v3, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->previouslySelectedPaymentMethod:Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;->getCode()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_1

    .line 790
    :cond_0
    invoke-virtual {v1}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->supportedPaymentMethodTypes()Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-nez v3, :cond_1

    .line 791
    sget-object v3, Lcom/stripe/android/model/PaymentMethod$Type;->Card:Lcom/stripe/android/model/PaymentMethod$Type;

    iget-object v3, v3, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    :cond_1
    move-object v5, v3

    .line 793
    sget-object v3, Lcom/stripe/android/paymentsheet/forms/FormArgumentsFactory;->INSTANCE:Lcom/stripe/android/paymentsheet/forms/FormArgumentsFactory;

    invoke-virtual {v3, v5, v1}, Lcom/stripe/android/paymentsheet/forms/FormArgumentsFactory;->create(Ljava/lang/String;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;)Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    move-result-object v9

    .line 798
    iget-object v3, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->previouslySelectedPaymentMethod:Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;

    if-nez v3, :cond_3

    .line 799
    invoke-virtual {v1, v5}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->supportedPaymentMethodForCode(Ljava/lang/String;)Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;

    move-result-object v3

    if-eqz v3, :cond_2

    goto :goto_0

    :cond_2
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 801
    :cond_3
    :goto_0
    invoke-virtual {v1}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->getStripeIntent()Lcom/stripe/android/model/StripeIntent;

    move-result-object v2

    .line 803
    invoke-virtual {v3}, Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;->getCode()Ljava/lang/String;

    move-result-object v3

    .line 804
    new-instance v10, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments$Factory$Default;

    .line 805
    iget-object v4, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->cardAccountRangeRepositoryFactory:Lcom/stripe/android/cards/DefaultCardAccountRangeRepositoryFactory;

    move-object v11, v4

    check-cast v11, Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;

    .line 810
    new-instance v14, Lcom/stripe/android/customersheet/CustomerSheetViewModel$$ExternalSyntheticLambda8;

    invoke-direct {v14}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$$ExternalSyntheticLambda8;-><init>()V

    const/16 v21, 0x1f0

    const/16 v22, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    .line 804
    invoke-direct/range {v10 .. v22}, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments$Factory$Default;-><init>(Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Lcom/stripe/android/link/LinkConfigurationCoordinator;Lcom/stripe/android/paymentsheet/LinkInlineHandler;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/model/PaymentMethodOptionsParams;Lcom/stripe/android/model/PaymentMethodExtraParams;Lcom/stripe/android/link/ui/inline/UserInput;ZLcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Factory;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v10, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments$Factory;

    .line 802
    invoke-virtual {v1, v3, v10}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->formElementsForCode(Ljava/lang/String;Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments$Factory;)Ljava/util/List;

    move-result-object v1

    if-nez v1, :cond_4

    .line 819
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    :cond_4
    move-object v8, v1

    .line 822
    new-instance v4, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;

    .line 824
    iget-object v6, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->supportedPaymentMethods:Ljava/util/List;

    .line 828
    invoke-direct {v0, v2}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->createDefaultUsBankArguments(Lcom/stripe/android/model/StripeIntent;)Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;

    move-result-object v10

    .line 831
    iget-object v1, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->isLiveModeProvider:Lkotlin/jvm/functions/Function0;

    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v13

    .line 834
    sget v1, Lcom/stripe/android/paymentsheet/R$string;->stripe_paymentsheet_save:I

    invoke-static {v1}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(I)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v17

    .line 838
    iget-object v1, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    const v25, 0x38400

    const/16 v26, 0x0

    const/4 v7, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x1

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    move/from16 v16, p1

    move-object/from16 v24, v1

    .line 822
    invoke-direct/range {v4 .. v26}, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;-><init>(Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/paymentsheet/forms/FormFieldValues;Ljava/util/List;Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;Lcom/stripe/android/paymentsheet/model/PaymentSelection;ZZZLcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;Lcom/stripe/android/core/strings/ResolvableString;ZZLcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;Lcom/stripe/android/payments/core/analytics/ErrorReporter;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v4, Lcom/stripe/android/customersheet/CustomerSheetViewState;

    move/from16 v1, p1

    .line 821
    invoke-direct {v0, v4, v1}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->transition(Lcom/stripe/android/customersheet/CustomerSheetViewState;Z)V

    return-void

    .line 787
    :cond_5
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method private static final transitionToAddPaymentMethod$lambda$26(Lcom/stripe/android/link/ui/inline/InlineSignupViewState;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 812
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 813
    const-string v0, "`CustomerSheet` does not implement `Link` and should not receive `InlineSignUpViewState` updates"

    .line 812
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final transitionToInitialScreen()V
    .locals 2

    .line 378
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->customerState:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;

    .line 380
    invoke-virtual {v0}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->getCanShowSavedPaymentMethods()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 382
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->selectPaymentMethodState:Lkotlinx/coroutines/flow/StateFlow;

    invoke-interface {v0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/customersheet/CustomerSheetViewState;

    .line 381
    invoke-direct {p0, v0, v1}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->transition(Lcom/stripe/android/customersheet/CustomerSheetViewState;Z)V

    return-void

    .line 386
    :cond_0
    invoke-direct {p0, v1}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->transitionToAddPaymentMethod(Z)V

    return-void
.end method

.method private final updateCustomButtonUIState(Lkotlin/jvm/functions/Function1;)V
    .locals 29
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;",
            "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;",
            ">;)V"
        }
    .end annotation

    .line 1454
    invoke-static/range {p0 .. p0}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->access$getBackStack$p(Lcom/stripe/android/customersheet/CustomerSheetViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v0

    .line 1456
    :cond_0
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v1

    .line 1457
    move-object v2, v1

    check-cast v2, Ljava/util/List;

    .line 1458
    check-cast v2, Ljava/lang/Iterable;

    .line 1459
    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v2, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v3, Ljava/util/Collection;

    .line 1460
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 1461
    check-cast v4, Lcom/stripe/android/customersheet/CustomerSheetViewState;

    .line 1462
    instance-of v5, v4, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;

    if-eqz v5, :cond_5

    .line 1463
    move-object v6, v4

    check-cast v6, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;

    .line 882
    invoke-virtual {v6}, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->getCustomPrimaryButtonUiState()Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;

    move-result-object v4

    move-object/from16 v5, p1

    invoke-interface {v5, v4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v21, v4

    check-cast v21, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;

    if-eqz v21, :cond_1

    .line 885
    invoke-virtual/range {v21 .. v21}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;->getEnabled()Z

    move-result v20

    const v27, 0xf9fff

    const/16 v28, 0x0

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

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    .line 884
    invoke-static/range {v6 .. v28}, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->copy$default(Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/paymentsheet/forms/FormFieldValues;Ljava/util/List;Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;Lcom/stripe/android/paymentsheet/model/PaymentSelection;ZZZLcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;Lcom/stripe/android/core/strings/ResolvableString;ZZLcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;Lcom/stripe/android/payments/core/analytics/ErrorReporter;ILjava/lang/Object;)Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;

    move-result-object v4

    goto :goto_4

    .line 889
    :cond_1
    invoke-virtual {v6}, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->getPaymentMethodCode()Ljava/lang/String;

    move-result-object v4

    sget-object v7, Lcom/stripe/android/model/PaymentMethod$Type;->USBankAccount:Lcom/stripe/android/model/PaymentMethod$Type;

    iget-object v7, v7, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    invoke-static {v4, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-nez v4, :cond_3

    invoke-virtual {v6}, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->getFormFieldValues()Lcom/stripe/android/paymentsheet/forms/FormFieldValues;

    move-result-object v4

    if-eqz v4, :cond_2

    goto :goto_1

    :cond_2
    move v4, v7

    goto :goto_2

    :cond_3
    :goto_1
    move v4, v8

    :goto_2
    if-eqz v4, :cond_4

    .line 892
    invoke-virtual {v6}, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->isProcessing()Z

    move-result v4

    if-nez v4, :cond_4

    move/from16 v20, v8

    goto :goto_3

    :cond_4
    move/from16 v20, v7

    :goto_3
    const v27, 0xf9fff

    const/16 v28, 0x0

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

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    .line 891
    invoke-static/range {v6 .. v28}, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->copy$default(Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/paymentsheet/forms/FormFieldValues;Ljava/util/List;Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;Lcom/stripe/android/paymentsheet/model/PaymentSelection;ZZZLcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;Lcom/stripe/android/core/strings/ResolvableString;ZZLcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;Lcom/stripe/android/payments/core/analytics/ErrorReporter;ILjava/lang/Object;)Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;

    move-result-object v4

    .line 1463
    :goto_4
    check-cast v4, Lcom/stripe/android/customersheet/CustomerSheetViewState;

    goto :goto_5

    :cond_5
    move-object/from16 v5, p1

    .line 1461
    :goto_5
    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_6
    move-object/from16 v5, p1

    .line 1467
    check-cast v3, Ljava/util/List;

    .line 1469
    invoke-interface {v0, v1, v3}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void
.end method

.method private final updateMandateText(Lcom/stripe/android/core/strings/ResolvableString;Z)V
    .locals 29

    .line 1472
    invoke-static/range {p0 .. p0}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->access$getBackStack$p(Lcom/stripe/android/customersheet/CustomerSheetViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v0

    .line 1474
    :cond_0
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v1

    .line 1475
    move-object v2, v1

    check-cast v2, Ljava/util/List;

    .line 1476
    check-cast v2, Ljava/lang/Iterable;

    .line 1477
    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v2, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v3, Ljava/util/Collection;

    .line 1478
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 1479
    check-cast v4, Lcom/stripe/android/customersheet/CustomerSheetViewState;

    .line 1480
    instance-of v5, v4, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;

    if-eqz v5, :cond_1

    .line 1481
    move-object v6, v4

    check-cast v6, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;

    const v27, 0xe7fff

    const/16 v28, 0x0

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

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    move-object/from16 v22, p1

    move/from16 v23, p2

    .line 901
    invoke-static/range {v6 .. v28}, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->copy$default(Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/paymentsheet/forms/FormFieldValues;Ljava/util/List;Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;Lcom/stripe/android/paymentsheet/model/PaymentSelection;ZZZLcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;Lcom/stripe/android/core/strings/ResolvableString;ZZLcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;Lcom/stripe/android/payments/core/analytics/ErrorReporter;ILjava/lang/Object;)Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;

    move-result-object v4

    .line 1481
    check-cast v4, Lcom/stripe/android/customersheet/CustomerSheetViewState;

    .line 1479
    :cond_1
    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1485
    :cond_2
    check-cast v3, Ljava/util/List;

    .line 1487
    invoke-interface {v0, v1, v3}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void
.end method

.method private final updatePaymentMethodExecutor-0E7RQCE(Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/paymentsheet/CardUpdateParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/PaymentMethod;",
            "Lcom/stripe/android/paymentsheet/CardUpdateParams;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/stripe/android/customersheet/CustomerSheetViewModel$updatePaymentMethodExecutor$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$updatePaymentMethodExecutor$1;

    iget v1, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$updatePaymentMethodExecutor$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p3, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$updatePaymentMethodExecutor$1;->label:I

    sub-int/2addr p3, v2

    iput p3, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$updatePaymentMethodExecutor$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$updatePaymentMethodExecutor$1;

    invoke-direct {v0, p0, p3}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$updatePaymentMethodExecutor$1;-><init>(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$updatePaymentMethodExecutor$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 605
    iget v2, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$updatePaymentMethodExecutor$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 609
    iput v3, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$updatePaymentMethodExecutor$1;->label:I

    invoke-direct {p0, p1, p2, v0}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->modifyCardPaymentMethod(Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/paymentsheet/CardUpdateParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    .line 605
    :cond_3
    :goto_1
    check-cast p3, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;

    .line 610
    instance-of p1, p3, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Success;

    if-eqz p1, :cond_4

    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    check-cast p3, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Success;

    invoke-virtual {p3}, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Success;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 611
    :cond_4
    instance-of p1, p3, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Failure;

    if-eqz p1, :cond_5

    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    check-cast p3, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Failure;

    invoke-virtual {p3}, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Failure;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 609
    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final updatePaymentMethodInState(Lcom/stripe/android/model/PaymentMethod;)V
    .locals 7

    .line 643
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    new-instance v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$updatePaymentMethodInState$1;

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, v2}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$updatePaymentMethodInState$1;-><init>(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lcom/stripe/android/model/PaymentMethod;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method private final synthetic updateViewState(Lkotlin/jvm/functions/Function1;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/stripe/android/customersheet/CustomerSheetViewState;",
            ">(",
            "Lkotlin/jvm/functions/Function1<",
            "-TT;+TT;>;)V"
        }
    .end annotation

    .line 1256
    invoke-static {p0}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->access$getBackStack$p(Lcom/stripe/android/customersheet/CustomerSheetViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v0

    .line 1611
    :cond_0
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v1

    .line 1612
    move-object v2, v1

    check-cast v2, Ljava/util/List;

    .line 1257
    check-cast v2, Ljava/lang/Iterable;

    .line 1613
    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v2, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v3, Ljava/util/Collection;

    .line 1614
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 1615
    check-cast v4, Lcom/stripe/android/customersheet/CustomerSheetViewState;

    const/4 v5, 0x3

    .line 1258
    const-string v6, "T"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->reifiedOperationMarker(ILjava/lang/String;)V

    instance-of v5, v4, Lcom/stripe/android/customersheet/CustomerSheetViewState;

    if-eqz v5, :cond_1

    .line 1259
    invoke-interface {p1, v4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/stripe/android/customersheet/CustomerSheetViewState;

    .line 1615
    :cond_1
    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1616
    :cond_2
    check-cast v3, Ljava/util/List;

    .line 1617
    invoke-interface {v0, v1, v3}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void
.end method

.method private static final viewState$lambda$0(Ljava/util/List;)Lcom/stripe/android/customersheet/CustomerSheetViewState;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 160
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/customersheet/CustomerSheetViewState;

    return-object p0
.end method


# virtual methods
.method public final bottomSheetConfirmStateChange()Z
    .locals 30

    move-object/from16 v0, p0

    .line 308
    iget-object v1, v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->viewState:Lkotlinx/coroutines/flow/StateFlow;

    invoke-interface {v1}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/customersheet/CustomerSheetViewState;

    .line 309
    invoke-virtual {v1}, Lcom/stripe/android/customersheet/CustomerSheetViewState;->shouldDisplayDismissConfirmationModal()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 1344
    invoke-static {v0}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->access$getBackStack$p(Lcom/stripe/android/customersheet/CustomerSheetViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v1

    .line 1346
    :cond_0
    invoke-interface {v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v2

    .line 1347
    move-object v3, v2

    check-cast v3, Ljava/util/List;

    .line 1348
    check-cast v3, Ljava/lang/Iterable;

    .line 1349
    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v3, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v4, Ljava/util/Collection;

    .line 1350
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 1351
    check-cast v5, Lcom/stripe/android/customersheet/CustomerSheetViewState;

    .line 1352
    instance-of v6, v5, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;

    if-eqz v6, :cond_1

    .line 1353
    move-object v7, v5

    check-cast v7, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;

    const v28, 0xdffff

    const/16 v29, 0x0

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

    const/16 v25, 0x1

    const/16 v26, 0x0

    const/16 v27, 0x0

    .line 311
    invoke-static/range {v7 .. v29}, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->copy$default(Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/paymentsheet/forms/FormFieldValues;Ljava/util/List;Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;Lcom/stripe/android/paymentsheet/model/PaymentSelection;ZZZLcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;Lcom/stripe/android/core/strings/ResolvableString;ZZLcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;Lcom/stripe/android/payments/core/analytics/ErrorReporter;ILjava/lang/Object;)Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;

    move-result-object v5

    .line 1353
    check-cast v5, Lcom/stripe/android/customersheet/CustomerSheetViewState;

    .line 1351
    :cond_1
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1357
    :cond_2
    check-cast v4, Ljava/util/List;

    .line 1359
    invoke-interface {v1, v2, v4}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v1, 0x0

    return v1

    :cond_3
    const/4 v1, 0x1

    return v1
.end method

.method public final getResult()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/customersheet/InternalCustomerSheetResult;",
            ">;"
        }
    .end annotation

    .line 163
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->result:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final getViewState()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/customersheet/CustomerSheetViewState;",
            ">;"
        }
    .end annotation

    .line 160
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->viewState:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final handleViewAction(Lcom/stripe/android/customersheet/CustomerSheetViewAction;)V
    .locals 1

    const-string v0, "viewAction"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 271
    instance-of v0, p1, Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnDismissed;

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->onDismissed()V

    return-void

    .line 272
    :cond_0
    instance-of v0, p1, Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnAddCardPressed;

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->onAddCardPressed()V

    return-void

    .line 273
    :cond_1
    instance-of v0, p1, Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnCardNumberInputCompleted;

    if-eqz v0, :cond_2

    invoke-direct {p0}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->onCardNumberInputCompleted()V

    return-void

    .line 274
    :cond_2
    instance-of v0, p1, Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnDisallowedCardBrandEntered;

    if-eqz v0, :cond_3

    check-cast p1, Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnDisallowedCardBrandEntered;

    invoke-virtual {p1}, Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnDisallowedCardBrandEntered;->getBrand()Lcom/stripe/android/model/CardBrand;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->onDisallowedCardBrandEntered(Lcom/stripe/android/model/CardBrand;)V

    return-void

    .line 275
    :cond_3
    instance-of v0, p1, Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnAnalyticsEvent;

    if-eqz v0, :cond_4

    check-cast p1, Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnAnalyticsEvent;

    invoke-virtual {p1}, Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnAnalyticsEvent;->getEvent()Lcom/stripe/android/core/networking/AnalyticsEvent;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->onAnalyticsEvent(Lcom/stripe/android/core/networking/AnalyticsEvent;)V

    return-void

    .line 276
    :cond_4
    instance-of v0, p1, Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnBackPressed;

    if-eqz v0, :cond_5

    invoke-direct {p0}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->onBackPressed()V

    return-void

    .line 277
    :cond_5
    instance-of v0, p1, Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnEditPressed;

    if-eqz v0, :cond_6

    invoke-direct {p0}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->onEditPressed()V

    return-void

    .line 278
    :cond_6
    instance-of v0, p1, Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnModifyItem;

    if-eqz v0, :cond_7

    check-cast p1, Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnModifyItem;

    invoke-virtual {p1}, Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnModifyItem;->getPaymentMethod()Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->onModifyItem(Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;)V

    return-void

    .line 279
    :cond_7
    instance-of v0, p1, Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnItemSelected;

    if-eqz v0, :cond_8

    check-cast p1, Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnItemSelected;

    invoke-virtual {p1}, Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnItemSelected;->getSelection()Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->onItemSelected(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V

    return-void

    .line 280
    :cond_8
    instance-of v0, p1, Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnPrimaryButtonPressed;

    if-eqz v0, :cond_9

    invoke-direct {p0}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->onPrimaryButtonPressed()V

    return-void

    .line 281
    :cond_9
    instance-of v0, p1, Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnAddPaymentMethodItemChanged;

    if-eqz v0, :cond_a

    .line 282
    check-cast p1, Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnAddPaymentMethodItemChanged;

    invoke-virtual {p1}, Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnAddPaymentMethodItemChanged;->getPaymentMethod()Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->onAddPaymentMethodItemChanged(Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;)V

    return-void

    .line 283
    :cond_a
    instance-of v0, p1, Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnFormFieldValuesCompleted;

    if-eqz v0, :cond_b

    .line 284
    check-cast p1, Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnFormFieldValuesCompleted;

    invoke-virtual {p1}, Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnFormFieldValuesCompleted;->getFormFieldValues()Lcom/stripe/android/paymentsheet/forms/FormFieldValues;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->onFormFieldValuesCompleted(Lcom/stripe/android/paymentsheet/forms/FormFieldValues;)V

    return-void

    .line 286
    :cond_b
    instance-of v0, p1, Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnUpdateCustomButtonUIState;

    if-eqz v0, :cond_c

    .line 287
    check-cast p1, Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnUpdateCustomButtonUIState;

    invoke-virtual {p1}, Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnUpdateCustomButtonUIState;->getCallback()Lkotlin/jvm/functions/Function1;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->updateCustomButtonUIState(Lkotlin/jvm/functions/Function1;)V

    return-void

    .line 289
    :cond_c
    instance-of v0, p1, Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnUpdateMandateText;

    if-eqz v0, :cond_d

    .line 290
    check-cast p1, Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnUpdateMandateText;

    invoke-virtual {p1}, Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnUpdateMandateText;->getMandateText()Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v0

    invoke-virtual {p1}, Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnUpdateMandateText;->getShowAbovePrimaryButton()Z

    move-result p1

    invoke-direct {p0, v0, p1}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->updateMandateText(Lcom/stripe/android/core/strings/ResolvableString;Z)V

    return-void

    .line 292
    :cond_d
    instance-of v0, p1, Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnBankAccountSelectionChanged;

    if-eqz v0, :cond_e

    .line 293
    check-cast p1, Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnBankAccountSelectionChanged;

    invoke-virtual {p1}, Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnBankAccountSelectionChanged;->getPaymentSelection()Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->onCollectUSBankAccountResult(Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;)V

    return-void

    .line 295
    :cond_e
    instance-of v0, p1, Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnFormError;

    if-eqz v0, :cond_f

    .line 296
    check-cast p1, Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnFormError;

    invoke-virtual {p1}, Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnFormError;->getError()Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->onFormError(Lcom/stripe/android/core/strings/ResolvableString;)V

    return-void

    .line 298
    :cond_f
    instance-of p1, p1, Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnCancelClose;

    if-eqz p1, :cond_10

    .line 299
    invoke-direct {p0}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->onCancelCloseForm()V

    return-void

    .line 270
    :cond_10
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final providePaymentMethodName(Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    .line 323
    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->customerState:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;

    invoke-virtual {v1}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->getMetadata()Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1, p1}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->supportedPaymentMethodForCode(Ljava/lang/String;)Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    if-eqz p1, :cond_1

    .line 324
    invoke-virtual {p1}, Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;->getDisplayName()Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v0

    :cond_1
    invoke-static {v0}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->orEmpty(Lcom/stripe/android/core/strings/ResolvableString;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p1

    return-object p1
.end method

.method public final registerFromActivity(Landroidx/activity/result/ActivityResultCaller;Landroidx/lifecycle/LifecycleOwner;)V
    .locals 1

    const-string v0, "activityResultCaller"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lifecycleOwner"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 331
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->confirmationHandler:Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;

    invoke-interface {v0, p1, p2}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;->register(Landroidx/activity/result/ActivityResultCaller;Landroidx/lifecycle/LifecycleOwner;)V

    return-void
.end method
