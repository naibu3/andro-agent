.class public final Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;
.super Ljava/lang/Object;
.source "FinancialConnectionsSessionManifest.kt"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$$serializer;,
        Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;,
        Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Companion;,
        Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;,
        Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;,
        Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;,
        Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00a9\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0003\u0008\u009f\u0001\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0081\u0008\u0018\u0000 \u00fa\u00012\u00020\u0001:\u000e\u00f4\u0001\u00f5\u0001\u00f6\u0001\u00f7\u0001\u00f8\u0001\u00f9\u0001\u00fa\u0001B\u0093\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\u0008\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\u000c\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\u0008\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010 \u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010!\u001a\u0004\u0018\u00010\"\u0012\n\u0008\u0002\u0010#\u001a\u0004\u0018\u00010$\u0012\n\u0008\u0002\u0010%\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010&\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010\'\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010(\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010)\u001a\u0004\u0018\u00010\u0006\u0012\u0016\u0008\u0002\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010+\u0012\n\u0008\u0002\u0010,\u001a\u0004\u0018\u00010-\u0012\u0016\u0008\u0002\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010+\u0012\n\u0008\u0002\u0010/\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u00100\u001a\u0004\u0018\u00010$\u0012\n\u0008\u0002\u00101\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u00102\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u00103\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u00104\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u00105\u001a\u0004\u0018\u000106\u0012\u0016\u0008\u0002\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010+\u0012\n\u0008\u0002\u00108\u001a\u0004\u0018\u000109\u0012\n\u0008\u0002\u0010:\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010;\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010<\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010=\u001a\u0004\u0018\u00010>\u00a2\u0006\u0004\u0008?\u0010@B\u0081\u0004\u0008\u0010\u0012\u0006\u0010A\u001a\u00020B\u0012\u0006\u0010C\u001a\u00020B\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\u0008\u001a\u00020\u0003\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\u000c\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010 \u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010!\u001a\u0004\u0018\u00010\"\u0012\u0008\u0010#\u001a\u0004\u0018\u00010$\u0012\u0008\u0010%\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010&\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\'\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010(\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010)\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010+\u0012\u0008\u0010,\u001a\u0004\u0018\u00010-\u0012\u0014\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010+\u0012\u0008\u0010/\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u00100\u001a\u0004\u0018\u00010$\u0012\u0008\u00101\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u00102\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u00103\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u00104\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u00105\u001a\u0004\u0018\u000106\u0012\u0014\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010+\u0012\u0008\u00108\u001a\u0004\u0018\u000109\u0012\u0008\u0010:\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010;\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010<\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010=\u001a\u0004\u0018\u00010>\u0012\u0008\u0010D\u001a\u0004\u0018\u00010E\u00a2\u0006\u0004\u0008?\u0010FJ\n\u0010\u00b2\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00b3\u0001\u001a\u00020\u0003H\u00c6\u0003J\u000c\u0010\u00b4\u0001\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\n\u0010\u00b5\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00b6\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00b7\u0001\u001a\u00020\u0006H\u00c6\u0003J\n\u0010\u00b8\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00b9\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00ba\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00bb\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00bc\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00bd\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00be\u0001\u001a\u00020\u0011H\u00c6\u0003J\n\u0010\u00bf\u0001\u001a\u00020\u0013H\u00c6\u0003J\u0010\u0010\u00c0\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u0015H\u00c6\u0003J\n\u0010\u00c1\u0001\u001a\u00020\u0018H\u00c6\u0003J\n\u0010\u00c2\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00c3\u0001\u001a\u00020\u0003H\u00c6\u0003J\u000c\u0010\u00c4\u0001\u001a\u0004\u0018\u00010\u001cH\u00c6\u0003J\u000c\u0010\u00c5\u0001\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0011\u0010\u00c6\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010yJ\u000c\u0010\u00c7\u0001\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000c\u0010\u00c8\u0001\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000c\u0010\u00c9\u0001\u001a\u0004\u0018\u00010\"H\u00c6\u0003J\u000c\u0010\u00ca\u0001\u001a\u0004\u0018\u00010$H\u00c6\u0003J\u000c\u0010\u00cb\u0001\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000c\u0010\u00cc\u0001\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000c\u0010\u00cd\u0001\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000c\u0010\u00ce\u0001\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000c\u0010\u00cf\u0001\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0018\u0010\u00d0\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010+H\u00c6\u0003J\u000c\u0010\u00d1\u0001\u001a\u0004\u0018\u00010-H\u00c6\u0003J\u0018\u0010\u00d2\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010+H\u00c6\u0003J\u000c\u0010\u00d3\u0001\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000c\u0010\u00d4\u0001\u001a\u0004\u0018\u00010$H\u00c6\u0003J\u0011\u0010\u00d5\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010yJ\u0011\u0010\u00d6\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010yJ\u0011\u0010\u00d7\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010yJ\u0011\u0010\u00d8\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010yJ\u000c\u0010\u00d9\u0001\u001a\u0004\u0018\u000106H\u00c6\u0003J\u0018\u0010\u00da\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010+H\u00c6\u0003J\u000c\u0010\u00db\u0001\u001a\u0004\u0018\u000109H\u00c6\u0003J\u0011\u0010\u00dc\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010yJ\u000c\u0010\u00dd\u0001\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0011\u0010\u00de\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010yJ\u000c\u0010\u00df\u0001\u001a\u0004\u0018\u00010>H\u00c6\u0003J\u00c0\u0004\u0010\u00e0\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00032\u0008\u0008\u0002\u0010\t\u001a\u00020\u00062\u0008\u0008\u0002\u0010\n\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00032\u0008\u0008\u0002\u0010\r\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00132\u000e\u0008\u0002\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u00152\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u00182\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u00032\n\u0008\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\u0008\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010 \u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\u0008\u0002\u0010#\u001a\u0004\u0018\u00010$2\n\u0008\u0002\u0010%\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010&\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\'\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010(\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010)\u001a\u0004\u0018\u00010\u00062\u0016\u0008\u0002\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010+2\n\u0008\u0002\u0010,\u001a\u0004\u0018\u00010-2\u0016\u0008\u0002\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010+2\n\u0008\u0002\u0010/\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u00100\u001a\u0004\u0018\u00010$2\n\u0008\u0002\u00101\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u00102\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u00103\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u00104\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u00105\u001a\u0004\u0018\u0001062\u0016\u0008\u0002\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010+2\n\u0008\u0002\u00108\u001a\u0004\u0018\u0001092\n\u0008\u0002\u0010:\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010;\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010<\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010=\u001a\u0004\u0018\u00010>H\u00c6\u0001\u00a2\u0006\u0003\u0010\u00e1\u0001J\u0007\u0010\u00e2\u0001\u001a\u00020BJ\u0016\u0010\u00e3\u0001\u001a\u00020\u00032\n\u0010\u00e4\u0001\u001a\u0005\u0018\u00010\u00e5\u0001H\u00d6\u0003J\n\u0010\u00e6\u0001\u001a\u00020BH\u00d6\u0001J\n\u0010\u00e7\u0001\u001a\u00020\u0006H\u00d6\u0001J\u001b\u0010\u00e8\u0001\u001a\u00030\u00e9\u00012\u0008\u0010\u00ea\u0001\u001a\u00030\u00eb\u00012\u0007\u0010\u00ec\u0001\u001a\u00020BJ-\u0010\u00ed\u0001\u001a\u00030\u00e9\u00012\u0007\u0010\u00ee\u0001\u001a\u00020\u00002\u0008\u0010\u00ef\u0001\u001a\u00030\u00f0\u00012\u0008\u0010\u00f1\u0001\u001a\u00030\u00f2\u0001H\u0001\u00a2\u0006\u0003\u0008\u00f3\u0001R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008G\u0010H\u001a\u0004\u0008I\u0010JR\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008K\u0010H\u001a\u0004\u0008L\u0010JR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008M\u0010H\u001a\u0004\u0008N\u0010OR\u001c\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008P\u0010H\u001a\u0004\u0008Q\u0010JR\u001c\u0010\u0008\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008R\u0010H\u001a\u0004\u0008S\u0010JR\u001c\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008T\u0010H\u001a\u0004\u0008U\u0010OR\u001c\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008V\u0010H\u001a\u0004\u0008W\u0010JR\u001c\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008X\u0010H\u001a\u0004\u0008Y\u0010JR\u001c\u0010\u000c\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008Z\u0010H\u001a\u0004\u0008[\u0010JR\u001c\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\\\u0010H\u001a\u0004\u0008]\u0010JR\u001c\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008^\u0010H\u001a\u0004\u0008_\u0010JR\u001c\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008`\u0010H\u001a\u0004\u0008a\u0010JR\u001c\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008b\u0010H\u001a\u0004\u0008c\u0010dR\u001c\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008e\u0010H\u001a\u0004\u0008f\u0010gR\"\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u00158\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008h\u0010H\u001a\u0004\u0008i\u0010jR\u001c\u0010\u0017\u001a\u00020\u00188\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008k\u0010H\u001a\u0004\u0008l\u0010mR\u001c\u0010\u0019\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008n\u0010H\u001a\u0004\u0008o\u0010JR\u001c\u0010\u001a\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008p\u0010H\u001a\u0004\u0008q\u0010JR\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008r\u0010H\u001a\u0004\u0008s\u0010tR\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008u\u0010H\u001a\u0004\u0008v\u0010OR \u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010z\u0012\u0004\u0008w\u0010H\u001a\u0004\u0008x\u0010yR\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008{\u0010H\u001a\u0004\u0008|\u0010OR\u001e\u0010 \u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008}\u0010H\u001a\u0004\u0008~\u0010OR \u0010!\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0000\u0012\u0004\u0008\u007f\u0010H\u001a\u0006\u0008\u0080\u0001\u0010\u0081\u0001R!\u0010#\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004\u00a2\u0006\u0011\n\u0000\u0012\u0005\u0008\u0082\u0001\u0010H\u001a\u0006\u0008\u0083\u0001\u0010\u0084\u0001R \u0010%\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0000\u0012\u0005\u0008\u0085\u0001\u0010H\u001a\u0005\u0008\u0086\u0001\u0010OR \u0010&\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0000\u0012\u0005\u0008\u0087\u0001\u0010H\u001a\u0005\u0008\u0088\u0001\u0010OR \u0010\'\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0000\u0012\u0005\u0008\u0089\u0001\u0010H\u001a\u0005\u0008\u008a\u0001\u0010OR \u0010(\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0000\u0012\u0005\u0008\u008b\u0001\u0010H\u001a\u0005\u0008\u008c\u0001\u0010OR \u0010)\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0000\u0012\u0005\u0008\u008d\u0001\u0010H\u001a\u0005\u0008\u008e\u0001\u0010OR-\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010+8\u0006X\u0087\u0004\u00a2\u0006\u0011\n\u0000\u0012\u0005\u0008\u008f\u0001\u0010H\u001a\u0006\u0008\u0090\u0001\u0010\u0091\u0001R!\u0010,\u001a\u0004\u0018\u00010-8\u0006X\u0087\u0004\u00a2\u0006\u0011\n\u0000\u0012\u0005\u0008\u0092\u0001\u0010H\u001a\u0006\u0008\u0093\u0001\u0010\u0094\u0001R-\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010+8\u0006X\u0087\u0004\u00a2\u0006\u0011\n\u0000\u0012\u0005\u0008\u0095\u0001\u0010H\u001a\u0006\u0008\u0096\u0001\u0010\u0091\u0001R \u0010/\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0000\u0012\u0005\u0008\u0097\u0001\u0010H\u001a\u0005\u0008\u0098\u0001\u0010OR!\u00100\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004\u00a2\u0006\u0011\n\u0000\u0012\u0005\u0008\u0099\u0001\u0010H\u001a\u0006\u0008\u009a\u0001\u0010\u0084\u0001R!\u00101\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0011\n\u0002\u0010z\u0012\u0005\u0008\u009b\u0001\u0010H\u001a\u0004\u00081\u0010yR!\u00102\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0011\n\u0002\u0010z\u0012\u0005\u0008\u009c\u0001\u0010H\u001a\u0004\u00082\u0010yR!\u00103\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0011\n\u0002\u0010z\u0012\u0005\u0008\u009d\u0001\u0010H\u001a\u0004\u00083\u0010yR!\u00104\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0011\n\u0002\u0010z\u0012\u0005\u0008\u009e\u0001\u0010H\u001a\u0004\u00084\u0010yR!\u00105\u001a\u0004\u0018\u0001068\u0006X\u0087\u0004\u00a2\u0006\u0011\n\u0000\u0012\u0005\u0008\u009f\u0001\u0010H\u001a\u0006\u0008\u00a0\u0001\u0010\u00a1\u0001R-\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010+8\u0006X\u0087\u0004\u00a2\u0006\u0011\n\u0000\u0012\u0005\u0008\u00a2\u0001\u0010H\u001a\u0006\u0008\u00a3\u0001\u0010\u0091\u0001R!\u00108\u001a\u0004\u0018\u0001098\u0006X\u0087\u0004\u00a2\u0006\u0011\n\u0000\u0012\u0005\u0008\u00a4\u0001\u0010H\u001a\u0006\u0008\u00a5\u0001\u0010\u00a6\u0001R\"\u0010:\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0002\u0010z\u0012\u0005\u0008\u00a7\u0001\u0010H\u001a\u0005\u0008\u00a8\u0001\u0010yR \u0010;\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0000\u0012\u0005\u0008\u00a9\u0001\u0010H\u001a\u0005\u0008\u00aa\u0001\u0010OR\"\u0010<\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0002\u0010z\u0012\u0005\u0008\u00ab\u0001\u0010H\u001a\u0005\u0008\u00ac\u0001\u0010yR!\u0010=\u001a\u0004\u0018\u00010>8\u0006X\u0087\u0004\u00a2\u0006\u0011\n\u0000\u0012\u0005\u0008\u00ad\u0001\u0010H\u001a\u0006\u0008\u00ae\u0001\u0010\u00af\u0001R\u0013\u0010\u00b0\u0001\u001a\u00020\u00038F\u00a2\u0006\u0007\u001a\u0005\u0008\u00b1\u0001\u0010J\u00a8\u0006\u00fb\u0001"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;",
        "Landroid/os/Parcelable;",
        "allowManualEntry",
        "",
        "consentRequired",
        "consentAcquiredAt",
        "",
        "customManualEntryHandling",
        "disableLinkMoreAccounts",
        "id",
        "instantVerificationDisabled",
        "institutionSearchDisabled",
        "appVerificationEnabled",
        "livemode",
        "manualEntryUsesMicrodeposits",
        "mobileHandoffEnabled",
        "nextPane",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;",
        "manualEntryMode",
        "Lcom/stripe/android/financialconnections/model/ManualEntryMode;",
        "permissions",
        "",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;",
        "product",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;",
        "singleAccount",
        "useSingleSortSearch",
        "accountDisconnectionMethod",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;",
        "accountholderCustomerEmailAddress",
        "accountholderIsLinkConsumer",
        "accountholderPhoneNumber",
        "accountholderToken",
        "activeAuthSession",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;",
        "activeInstitution",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;",
        "assignmentEventId",
        "businessName",
        "cancelUrl",
        "connectPlatformName",
        "connectedAccountName",
        "experimentAssignments",
        "",
        "displayText",
        "Lcom/stripe/android/financialconnections/model/TextUpdate;",
        "features",
        "hostedAuthUrl",
        "initialInstitution",
        "isEndUserFacing",
        "isLinkWithStripe",
        "isNetworkingUserFlow",
        "isStripeDirect",
        "linkAccountSessionCancellationBehavior",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;",
        "modalCustomization",
        "paymentMethodType",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;",
        "stepUpAuthenticationRequired",
        "successUrl",
        "skipSuccessPane",
        "theme",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;",
        "<init>",
        "(ZZLjava/lang/String;ZZLjava/lang/String;ZZZZZZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/model/ManualEntryMode;Ljava/util/List;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;ZZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/stripe/android/financialconnections/model/TextUpdate;Ljava/util/Map;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;Ljava/util/Map;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;)V",
        "seen0",
        "",
        "seen1",
        "serializationConstructorMarker",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "(IIZZLjava/lang/String;ZZLjava/lang/String;ZZZZZZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/model/ManualEntryMode;Ljava/util/List;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;ZZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/stripe/android/financialconnections/model/TextUpdate;Ljava/util/Map;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;Ljava/util/Map;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "getAllowManualEntry$annotations",
        "()V",
        "getAllowManualEntry",
        "()Z",
        "getConsentRequired$annotations",
        "getConsentRequired",
        "getConsentAcquiredAt$annotations",
        "getConsentAcquiredAt",
        "()Ljava/lang/String;",
        "getCustomManualEntryHandling$annotations",
        "getCustomManualEntryHandling",
        "getDisableLinkMoreAccounts$annotations",
        "getDisableLinkMoreAccounts",
        "getId$annotations",
        "getId",
        "getInstantVerificationDisabled$annotations",
        "getInstantVerificationDisabled",
        "getInstitutionSearchDisabled$annotations",
        "getInstitutionSearchDisabled",
        "getAppVerificationEnabled$annotations",
        "getAppVerificationEnabled",
        "getLivemode$annotations",
        "getLivemode",
        "getManualEntryUsesMicrodeposits$annotations",
        "getManualEntryUsesMicrodeposits",
        "getMobileHandoffEnabled$annotations",
        "getMobileHandoffEnabled",
        "getNextPane$annotations",
        "getNextPane",
        "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;",
        "getManualEntryMode$annotations",
        "getManualEntryMode",
        "()Lcom/stripe/android/financialconnections/model/ManualEntryMode;",
        "getPermissions$annotations",
        "getPermissions",
        "()Ljava/util/List;",
        "getProduct$annotations",
        "getProduct",
        "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;",
        "getSingleAccount$annotations",
        "getSingleAccount",
        "getUseSingleSortSearch$annotations",
        "getUseSingleSortSearch",
        "getAccountDisconnectionMethod$annotations",
        "getAccountDisconnectionMethod",
        "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;",
        "getAccountholderCustomerEmailAddress$annotations",
        "getAccountholderCustomerEmailAddress",
        "getAccountholderIsLinkConsumer$annotations",
        "getAccountholderIsLinkConsumer",
        "()Ljava/lang/Boolean;",
        "Ljava/lang/Boolean;",
        "getAccountholderPhoneNumber$annotations",
        "getAccountholderPhoneNumber",
        "getAccountholderToken$annotations",
        "getAccountholderToken",
        "getActiveAuthSession$annotations",
        "getActiveAuthSession",
        "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;",
        "getActiveInstitution$annotations",
        "getActiveInstitution",
        "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;",
        "getAssignmentEventId$annotations",
        "getAssignmentEventId",
        "getBusinessName$annotations",
        "getBusinessName",
        "getCancelUrl$annotations",
        "getCancelUrl",
        "getConnectPlatformName$annotations",
        "getConnectPlatformName",
        "getConnectedAccountName$annotations",
        "getConnectedAccountName",
        "getExperimentAssignments$annotations",
        "getExperimentAssignments",
        "()Ljava/util/Map;",
        "getDisplayText$annotations",
        "getDisplayText",
        "()Lcom/stripe/android/financialconnections/model/TextUpdate;",
        "getFeatures$annotations",
        "getFeatures",
        "getHostedAuthUrl$annotations",
        "getHostedAuthUrl",
        "getInitialInstitution$annotations",
        "getInitialInstitution",
        "isEndUserFacing$annotations",
        "isLinkWithStripe$annotations",
        "isNetworkingUserFlow$annotations",
        "isStripeDirect$annotations",
        "getLinkAccountSessionCancellationBehavior$annotations",
        "getLinkAccountSessionCancellationBehavior",
        "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;",
        "getModalCustomization$annotations",
        "getModalCustomization",
        "getPaymentMethodType$annotations",
        "getPaymentMethodType",
        "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;",
        "getStepUpAuthenticationRequired$annotations",
        "getStepUpAuthenticationRequired",
        "getSuccessUrl$annotations",
        "getSuccessUrl",
        "getSkipSuccessPane$annotations",
        "getSkipSuccessPane",
        "getTheme$annotations",
        "getTheme",
        "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;",
        "consentAcquired",
        "getConsentAcquired",
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
        "component27",
        "component28",
        "component29",
        "component30",
        "component31",
        "component32",
        "component33",
        "component34",
        "component35",
        "component36",
        "component37",
        "component38",
        "component39",
        "component40",
        "component41",
        "component42",
        "component43",
        "component44",
        "component45",
        "component46",
        "copy",
        "(ZZLjava/lang/String;ZZLjava/lang/String;ZZZZZZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/model/ManualEntryMode;Ljava/util/List;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;ZZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/stripe/android/financialconnections/model/TextUpdate;Ljava/util/Map;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;Ljava/util/Map;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;",
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
        "write$Self",
        "self",
        "output",
        "Lkotlinx/serialization/encoding/CompositeEncoder;",
        "serialDesc",
        "Lkotlinx/serialization/descriptors/SerialDescriptor;",
        "write$Self$financial_connections_release",
        "Pane",
        "Product",
        "AccountDisconnectionMethod",
        "LinkAccountSessionCancellationBehavior",
        "Theme",
        "$serializer",
        "Companion",
        "financial-connections_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlinx/serialization/Serializable;
.end annotation


# static fields
.field private static final $childSerializers:[Lkotlinx/serialization/KSerializer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lkotlinx/serialization/KSerializer<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static final $stable:I

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Companion;


# instance fields
.field private final accountDisconnectionMethod:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;

.field private final accountholderCustomerEmailAddress:Ljava/lang/String;

.field private final accountholderIsLinkConsumer:Ljava/lang/Boolean;

.field private final accountholderPhoneNumber:Ljava/lang/String;

.field private final accountholderToken:Ljava/lang/String;

.field private final activeAuthSession:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

.field private final activeInstitution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

.field private final allowManualEntry:Z

.field private final appVerificationEnabled:Z

.field private final assignmentEventId:Ljava/lang/String;

.field private final businessName:Ljava/lang/String;

.field private final cancelUrl:Ljava/lang/String;

.field private final connectPlatformName:Ljava/lang/String;

.field private final connectedAccountName:Ljava/lang/String;

.field private final consentAcquiredAt:Ljava/lang/String;

.field private final consentRequired:Z

.field private final customManualEntryHandling:Z

.field private final disableLinkMoreAccounts:Z

.field private final displayText:Lcom/stripe/android/financialconnections/model/TextUpdate;

.field private final experimentAssignments:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final features:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final hostedAuthUrl:Ljava/lang/String;

.field private final id:Ljava/lang/String;

.field private final initialInstitution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

.field private final instantVerificationDisabled:Z

.field private final institutionSearchDisabled:Z

.field private final isEndUserFacing:Ljava/lang/Boolean;

.field private final isLinkWithStripe:Ljava/lang/Boolean;

.field private final isNetworkingUserFlow:Ljava/lang/Boolean;

.field private final isStripeDirect:Ljava/lang/Boolean;

.field private final linkAccountSessionCancellationBehavior:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;

.field private final livemode:Z

.field private final manualEntryMode:Lcom/stripe/android/financialconnections/model/ManualEntryMode;

.field private final manualEntryUsesMicrodeposits:Z

.field private final mobileHandoffEnabled:Z

.field private final modalCustomization:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final nextPane:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

.field private final paymentMethodType:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;

.field private final permissions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;",
            ">;"
        }
    .end annotation
.end field

.field private final product:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;

.field private final singleAccount:Z

.field private final skipSuccessPane:Ljava/lang/Boolean;

.field private final stepUpAuthenticationRequired:Ljava/lang/Boolean;

.field private final successUrl:Ljava/lang/String;

.field private final theme:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;

.field private final useSingleSortSearch:Z


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->Companion:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Companion;

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Creator;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->CREATOR:Landroid/os/Parcelable$Creator;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->$stable:I

    const/16 v2, 0x2e

    .line 50
    new-array v2, v2, [Lkotlinx/serialization/KSerializer;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v1, v2, v3

    const/4 v3, 0x2

    aput-object v1, v2, v3

    const/4 v3, 0x3

    aput-object v1, v2, v3

    const/4 v3, 0x4

    aput-object v1, v2, v3

    const/4 v3, 0x5

    aput-object v1, v2, v3

    const/4 v3, 0x6

    aput-object v1, v2, v3

    const/4 v3, 0x7

    aput-object v1, v2, v3

    aput-object v1, v2, v0

    const/16 v0, 0x9

    aput-object v1, v2, v0

    const/16 v0, 0xa

    aput-object v1, v2, v0

    const/16 v0, 0xb

    aput-object v1, v2, v0

    const/16 v0, 0xc

    aput-object v1, v2, v0

    const/16 v0, 0xd

    aput-object v1, v2, v0

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v3, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions$Serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions$Serializer;

    check-cast v3, Lkotlinx/serialization/KSerializer;

    invoke-direct {v0, v3}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lkotlinx/serialization/KSerializer;)V

    const/16 v3, 0xe

    aput-object v0, v2, v3

    const/16 v0, 0xf

    aput-object v1, v2, v0

    const/16 v0, 0x10

    aput-object v1, v2, v0

    const/16 v0, 0x11

    aput-object v1, v2, v0

    const/16 v0, 0x12

    aput-object v1, v2, v0

    const/16 v0, 0x13

    aput-object v1, v2, v0

    const/16 v0, 0x14

    aput-object v1, v2, v0

    const/16 v0, 0x15

    aput-object v1, v2, v0

    const/16 v0, 0x16

    aput-object v1, v2, v0

    const/16 v0, 0x17

    aput-object v1, v2, v0

    const/16 v0, 0x18

    aput-object v1, v2, v0

    const/16 v0, 0x19

    aput-object v1, v2, v0

    const/16 v0, 0x1a

    aput-object v1, v2, v0

    const/16 v0, 0x1b

    aput-object v1, v2, v0

    const/16 v0, 0x1c

    aput-object v1, v2, v0

    const/16 v0, 0x1d

    aput-object v1, v2, v0

    new-instance v0, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    sget-object v3, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    check-cast v3, Lkotlinx/serialization/KSerializer;

    sget-object v4, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    check-cast v4, Lkotlinx/serialization/KSerializer;

    invoke-direct {v0, v3, v4}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V

    const/16 v3, 0x1e

    aput-object v0, v2, v3

    const/16 v0, 0x1f

    aput-object v1, v2, v0

    new-instance v0, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    sget-object v3, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    check-cast v3, Lkotlinx/serialization/KSerializer;

    sget-object v4, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    check-cast v4, Lkotlinx/serialization/KSerializer;

    invoke-direct {v0, v3, v4}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V

    const/16 v3, 0x20

    aput-object v0, v2, v3

    const/16 v0, 0x21

    aput-object v1, v2, v0

    const/16 v0, 0x22

    aput-object v1, v2, v0

    const/16 v0, 0x23

    aput-object v1, v2, v0

    const/16 v0, 0x24

    aput-object v1, v2, v0

    const/16 v0, 0x25

    aput-object v1, v2, v0

    const/16 v0, 0x26

    aput-object v1, v2, v0

    const/16 v0, 0x27

    aput-object v1, v2, v0

    new-instance v0, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    sget-object v3, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    check-cast v3, Lkotlinx/serialization/KSerializer;

    sget-object v4, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    check-cast v4, Lkotlinx/serialization/KSerializer;

    invoke-direct {v0, v3, v4}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V

    const/16 v3, 0x28

    aput-object v0, v2, v3

    const/16 v0, 0x29

    aput-object v1, v2, v0

    const/16 v0, 0x2a

    aput-object v1, v2, v0

    const/16 v0, 0x2b

    aput-object v1, v2, v0

    const/16 v0, 0x2c

    aput-object v1, v2, v0

    const/16 v0, 0x2d

    aput-object v1, v2, v0

    sput-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->$childSerializers:[Lkotlinx/serialization/KSerializer;

    return-void
.end method

.method public synthetic constructor <init>(IIZZLjava/lang/String;ZZLjava/lang/String;ZZZZZZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/model/ManualEntryMode;Ljava/util/List;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;ZZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/stripe/android/financialconnections/model/TextUpdate;Ljava/util/Map;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;Ljava/util/Map;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 3

    const v0, 0x3ffff

    and-int v1, p1, v0

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    if-eqz v1, :cond_1

    .line 50
    filled-new-array/range {p1 .. p2}, [I

    move-result-object v1

    filled-new-array {v0, v2}, [I

    move-result-object v0

    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$$serializer;

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    move-result-object v2

    invoke-static {v1, v0, v2}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwArrayMissingFieldException([I[ILkotlinx/serialization/descriptors/SerialDescriptor;)V

    :cond_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->allowManualEntry:Z

    iput-boolean p4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->consentRequired:Z

    iput-object p5, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->consentAcquiredAt:Ljava/lang/String;

    iput-boolean p6, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->customManualEntryHandling:Z

    iput-boolean p7, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->disableLinkMoreAccounts:Z

    iput-object p8, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->id:Ljava/lang/String;

    iput-boolean p9, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->instantVerificationDisabled:Z

    iput-boolean p10, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->institutionSearchDisabled:Z

    iput-boolean p11, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->appVerificationEnabled:Z

    iput-boolean p12, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->livemode:Z

    move/from16 p3, p13

    iput-boolean p3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->manualEntryUsesMicrodeposits:Z

    move/from16 p3, p14

    iput-boolean p3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->mobileHandoffEnabled:Z

    move-object/from16 p3, p15

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->nextPane:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-object/from16 p3, p16

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->manualEntryMode:Lcom/stripe/android/financialconnections/model/ManualEntryMode;

    move-object/from16 p3, p17

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->permissions:Ljava/util/List;

    move-object/from16 p3, p18

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->product:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;

    move/from16 p3, p19

    iput-boolean p3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->singleAccount:Z

    move/from16 p3, p20

    iput-boolean p3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->useSingleSortSearch:Z

    const/high16 p3, 0x40000

    and-int/2addr p3, p1

    const/4 p4, 0x0

    if-nez p3, :cond_2

    iput-object p4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountDisconnectionMethod:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;

    goto :goto_1

    :cond_2
    move-object/from16 p3, p21

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountDisconnectionMethod:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;

    :goto_1
    const/high16 p3, 0x80000

    and-int/2addr p3, p1

    if-nez p3, :cond_3

    iput-object p4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderCustomerEmailAddress:Ljava/lang/String;

    goto :goto_2

    :cond_3
    move-object/from16 p3, p22

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderCustomerEmailAddress:Ljava/lang/String;

    :goto_2
    const/high16 p3, 0x100000

    and-int/2addr p3, p1

    if-nez p3, :cond_4

    iput-object p4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderIsLinkConsumer:Ljava/lang/Boolean;

    goto :goto_3

    :cond_4
    move-object/from16 p3, p23

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderIsLinkConsumer:Ljava/lang/Boolean;

    :goto_3
    const/high16 p3, 0x200000

    and-int/2addr p3, p1

    if-nez p3, :cond_5

    iput-object p4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderPhoneNumber:Ljava/lang/String;

    goto :goto_4

    :cond_5
    move-object/from16 p3, p24

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderPhoneNumber:Ljava/lang/String;

    :goto_4
    const/high16 p3, 0x400000

    and-int/2addr p3, p1

    if-nez p3, :cond_6

    iput-object p4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderToken:Ljava/lang/String;

    goto :goto_5

    :cond_6
    move-object/from16 p3, p25

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderToken:Ljava/lang/String;

    :goto_5
    const/high16 p3, 0x800000

    and-int/2addr p3, p1

    if-nez p3, :cond_7

    iput-object p4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->activeAuthSession:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    goto :goto_6

    :cond_7
    move-object/from16 p3, p26

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->activeAuthSession:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    :goto_6
    const/high16 p3, 0x1000000

    and-int/2addr p3, p1

    if-nez p3, :cond_8

    iput-object p4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->activeInstitution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    goto :goto_7

    :cond_8
    move-object/from16 p3, p27

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->activeInstitution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    :goto_7
    const/high16 p3, 0x2000000

    and-int/2addr p3, p1

    if-nez p3, :cond_9

    iput-object p4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->assignmentEventId:Ljava/lang/String;

    goto :goto_8

    :cond_9
    move-object/from16 p3, p28

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->assignmentEventId:Ljava/lang/String;

    :goto_8
    const/high16 p3, 0x4000000

    and-int/2addr p3, p1

    if-nez p3, :cond_a

    iput-object p4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->businessName:Ljava/lang/String;

    goto :goto_9

    :cond_a
    move-object/from16 p3, p29

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->businessName:Ljava/lang/String;

    :goto_9
    const/high16 p3, 0x8000000

    and-int/2addr p3, p1

    if-nez p3, :cond_b

    iput-object p4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->cancelUrl:Ljava/lang/String;

    goto :goto_a

    :cond_b
    move-object/from16 p3, p30

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->cancelUrl:Ljava/lang/String;

    :goto_a
    const/high16 p3, 0x10000000

    and-int/2addr p3, p1

    if-nez p3, :cond_c

    iput-object p4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->connectPlatformName:Ljava/lang/String;

    goto :goto_b

    :cond_c
    move-object/from16 p3, p31

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->connectPlatformName:Ljava/lang/String;

    :goto_b
    const/high16 p3, 0x20000000

    and-int/2addr p3, p1

    if-nez p3, :cond_d

    iput-object p4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->connectedAccountName:Ljava/lang/String;

    goto :goto_c

    :cond_d
    move-object/from16 p3, p32

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->connectedAccountName:Ljava/lang/String;

    :goto_c
    const/high16 p3, 0x40000000    # 2.0f

    and-int/2addr p3, p1

    if-nez p3, :cond_e

    iput-object p4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->experimentAssignments:Ljava/util/Map;

    goto :goto_d

    :cond_e
    move-object/from16 p3, p33

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->experimentAssignments:Ljava/util/Map;

    :goto_d
    const/high16 p3, -0x80000000

    and-int/2addr p1, p3

    if-nez p1, :cond_f

    iput-object p4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->displayText:Lcom/stripe/android/financialconnections/model/TextUpdate;

    goto :goto_e

    :cond_f
    move-object/from16 p1, p34

    iput-object p1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->displayText:Lcom/stripe/android/financialconnections/model/TextUpdate;

    :goto_e
    and-int/lit8 p1, p2, 0x1

    if-nez p1, :cond_10

    iput-object p4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->features:Ljava/util/Map;

    goto :goto_f

    :cond_10
    move-object/from16 p1, p35

    iput-object p1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->features:Ljava/util/Map;

    :goto_f
    and-int/lit8 p1, p2, 0x2

    if-nez p1, :cond_11

    iput-object p4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->hostedAuthUrl:Ljava/lang/String;

    goto :goto_10

    :cond_11
    move-object/from16 p1, p36

    iput-object p1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->hostedAuthUrl:Ljava/lang/String;

    :goto_10
    and-int/lit8 p1, p2, 0x4

    if-nez p1, :cond_12

    iput-object p4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->initialInstitution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    goto :goto_11

    :cond_12
    move-object/from16 p1, p37

    iput-object p1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->initialInstitution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    :goto_11
    and-int/lit8 p1, p2, 0x8

    if-nez p1, :cond_13

    iput-object p4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isEndUserFacing:Ljava/lang/Boolean;

    goto :goto_12

    :cond_13
    move-object/from16 p1, p38

    iput-object p1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isEndUserFacing:Ljava/lang/Boolean;

    :goto_12
    and-int/lit8 p1, p2, 0x10

    if-nez p1, :cond_14

    iput-object p4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isLinkWithStripe:Ljava/lang/Boolean;

    goto :goto_13

    :cond_14
    move-object/from16 p1, p39

    iput-object p1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isLinkWithStripe:Ljava/lang/Boolean;

    :goto_13
    and-int/lit8 p1, p2, 0x20

    if-nez p1, :cond_15

    iput-object p4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isNetworkingUserFlow:Ljava/lang/Boolean;

    goto :goto_14

    :cond_15
    move-object/from16 p1, p40

    iput-object p1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isNetworkingUserFlow:Ljava/lang/Boolean;

    :goto_14
    and-int/lit8 p1, p2, 0x40

    if-nez p1, :cond_16

    iput-object p4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isStripeDirect:Ljava/lang/Boolean;

    goto :goto_15

    :cond_16
    move-object/from16 p1, p41

    iput-object p1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isStripeDirect:Ljava/lang/Boolean;

    :goto_15
    and-int/lit16 p1, p2, 0x80

    if-nez p1, :cond_17

    iput-object p4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->linkAccountSessionCancellationBehavior:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;

    goto :goto_16

    :cond_17
    move-object/from16 p1, p42

    iput-object p1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->linkAccountSessionCancellationBehavior:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;

    :goto_16
    and-int/lit16 p1, p2, 0x100

    if-nez p1, :cond_18

    iput-object p4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->modalCustomization:Ljava/util/Map;

    goto :goto_17

    :cond_18
    move-object/from16 p1, p43

    iput-object p1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->modalCustomization:Ljava/util/Map;

    :goto_17
    and-int/lit16 p1, p2, 0x200

    if-nez p1, :cond_19

    iput-object p4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->paymentMethodType:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;

    goto :goto_18

    :cond_19
    move-object/from16 p1, p44

    iput-object p1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->paymentMethodType:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;

    :goto_18
    and-int/lit16 p1, p2, 0x400

    if-nez p1, :cond_1a

    iput-object p4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->stepUpAuthenticationRequired:Ljava/lang/Boolean;

    goto :goto_19

    :cond_1a
    move-object/from16 p1, p45

    iput-object p1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->stepUpAuthenticationRequired:Ljava/lang/Boolean;

    :goto_19
    and-int/lit16 p1, p2, 0x800

    if-nez p1, :cond_1b

    iput-object p4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->successUrl:Ljava/lang/String;

    goto :goto_1a

    :cond_1b
    move-object/from16 p1, p46

    iput-object p1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->successUrl:Ljava/lang/String;

    :goto_1a
    and-int/lit16 p1, p2, 0x1000

    if-nez p1, :cond_1c

    iput-object p4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->skipSuccessPane:Ljava/lang/Boolean;

    goto :goto_1b

    :cond_1c
    move-object/from16 p1, p47

    iput-object p1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->skipSuccessPane:Ljava/lang/Boolean;

    :goto_1b
    and-int/lit16 p1, p2, 0x2000

    if-nez p1, :cond_1d

    iput-object p4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->theme:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;

    return-void

    :cond_1d
    move-object/from16 p1, p48

    iput-object p1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->theme:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;

    return-void
.end method

.method public constructor <init>(ZZLjava/lang/String;ZZLjava/lang/String;ZZZZZZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/model/ManualEntryMode;Ljava/util/List;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;ZZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/stripe/android/financialconnections/model/TextUpdate;Ljava/util/Map;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;Ljava/util/Map;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Ljava/lang/String;",
            "ZZ",
            "Ljava/lang/String;",
            "ZZZZZZ",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;",
            "Lcom/stripe/android/financialconnections/model/ManualEntryMode;",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;",
            ">;",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;",
            "ZZ",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/financialconnections/model/TextUpdate;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;",
            ")V"
        }
    .end annotation

    move-object/from16 v0, p13

    move-object/from16 v1, p14

    move-object/from16 v2, p15

    move-object/from16 v3, p16

    const-string v4, "id"

    invoke-static {p6, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "nextPane"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "manualEntryMode"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "permissions"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "product"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    iput-boolean p1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->allowManualEntry:Z

    .line 57
    iput-boolean p2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->consentRequired:Z

    .line 60
    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->consentAcquiredAt:Ljava/lang/String;

    .line 63
    iput-boolean p4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->customManualEntryHandling:Z

    .line 66
    iput-boolean p5, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->disableLinkMoreAccounts:Z

    .line 69
    iput-object p6, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->id:Ljava/lang/String;

    .line 72
    iput-boolean p7, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->instantVerificationDisabled:Z

    .line 75
    iput-boolean p8, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->institutionSearchDisabled:Z

    .line 78
    iput-boolean p9, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->appVerificationEnabled:Z

    .line 81
    iput-boolean p10, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->livemode:Z

    move/from16 p1, p11

    .line 84
    iput-boolean p1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->manualEntryUsesMicrodeposits:Z

    move/from16 p1, p12

    .line 87
    iput-boolean p1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->mobileHandoffEnabled:Z

    .line 90
    iput-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->nextPane:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    .line 93
    iput-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->manualEntryMode:Lcom/stripe/android/financialconnections/model/ManualEntryMode;

    .line 96
    iput-object v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->permissions:Ljava/util/List;

    .line 99
    iput-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->product:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;

    move/from16 p1, p17

    .line 102
    iput-boolean p1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->singleAccount:Z

    move/from16 p1, p18

    .line 105
    iput-boolean p1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->useSingleSortSearch:Z

    move-object/from16 p1, p19

    .line 108
    iput-object p1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountDisconnectionMethod:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;

    move-object/from16 p1, p20

    .line 111
    iput-object p1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderCustomerEmailAddress:Ljava/lang/String;

    move-object/from16 p1, p21

    .line 114
    iput-object p1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderIsLinkConsumer:Ljava/lang/Boolean;

    move-object/from16 p1, p22

    .line 117
    iput-object p1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderPhoneNumber:Ljava/lang/String;

    move-object/from16 p1, p23

    .line 120
    iput-object p1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderToken:Ljava/lang/String;

    move-object/from16 p1, p24

    .line 123
    iput-object p1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->activeAuthSession:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    move-object/from16 p1, p25

    .line 126
    iput-object p1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->activeInstitution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    move-object/from16 p1, p26

    .line 129
    iput-object p1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->assignmentEventId:Ljava/lang/String;

    move-object/from16 p1, p27

    .line 132
    iput-object p1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->businessName:Ljava/lang/String;

    move-object/from16 p1, p28

    .line 135
    iput-object p1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->cancelUrl:Ljava/lang/String;

    move-object/from16 p1, p29

    .line 138
    iput-object p1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->connectPlatformName:Ljava/lang/String;

    move-object/from16 p1, p30

    .line 141
    iput-object p1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->connectedAccountName:Ljava/lang/String;

    move-object/from16 p1, p31

    .line 144
    iput-object p1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->experimentAssignments:Ljava/util/Map;

    move-object/from16 p1, p32

    .line 147
    iput-object p1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->displayText:Lcom/stripe/android/financialconnections/model/TextUpdate;

    move-object/from16 p1, p33

    .line 150
    iput-object p1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->features:Ljava/util/Map;

    move-object/from16 p1, p34

    .line 153
    iput-object p1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->hostedAuthUrl:Ljava/lang/String;

    move-object/from16 p1, p35

    .line 156
    iput-object p1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->initialInstitution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    move-object/from16 p1, p36

    .line 159
    iput-object p1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isEndUserFacing:Ljava/lang/Boolean;

    move-object/from16 p1, p37

    .line 162
    iput-object p1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isLinkWithStripe:Ljava/lang/Boolean;

    move-object/from16 p1, p38

    .line 165
    iput-object p1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isNetworkingUserFlow:Ljava/lang/Boolean;

    move-object/from16 p1, p39

    .line 168
    iput-object p1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isStripeDirect:Ljava/lang/Boolean;

    move-object/from16 p1, p40

    .line 171
    iput-object p1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->linkAccountSessionCancellationBehavior:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;

    move-object/from16 p1, p41

    .line 174
    iput-object p1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->modalCustomization:Ljava/util/Map;

    move-object/from16 p1, p42

    .line 177
    iput-object p1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->paymentMethodType:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;

    move-object/from16 p1, p43

    .line 180
    iput-object p1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->stepUpAuthenticationRequired:Ljava/lang/Boolean;

    move-object/from16 p1, p44

    .line 183
    iput-object p1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->successUrl:Ljava/lang/String;

    move-object/from16 p1, p45

    .line 186
    iput-object p1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->skipSuccessPane:Ljava/lang/Boolean;

    move-object/from16 p1, p46

    .line 189
    iput-object p1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->theme:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;

    return-void
.end method

.method public synthetic constructor <init>(ZZLjava/lang/String;ZZLjava/lang/String;ZZZZZZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/model/ManualEntryMode;Ljava/util/List;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;ZZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/stripe/android/financialconnections/model/TextUpdate;Ljava/util/Map;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;Ljava/util/Map;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 50

    move/from16 v0, p48

    const/high16 v1, 0x40000

    and-int v1, p47, v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object/from16 v22, v2

    goto :goto_0

    :cond_0
    move-object/from16 v22, p19

    :goto_0
    const/high16 v1, 0x80000

    and-int v1, p47, v1

    if-eqz v1, :cond_1

    move-object/from16 v23, v2

    goto :goto_1

    :cond_1
    move-object/from16 v23, p20

    :goto_1
    const/high16 v1, 0x100000

    and-int v1, p47, v1

    if-eqz v1, :cond_2

    move-object/from16 v24, v2

    goto :goto_2

    :cond_2
    move-object/from16 v24, p21

    :goto_2
    const/high16 v1, 0x200000

    and-int v1, p47, v1

    if-eqz v1, :cond_3

    move-object/from16 v25, v2

    goto :goto_3

    :cond_3
    move-object/from16 v25, p22

    :goto_3
    const/high16 v1, 0x400000

    and-int v1, p47, v1

    if-eqz v1, :cond_4

    move-object/from16 v26, v2

    goto :goto_4

    :cond_4
    move-object/from16 v26, p23

    :goto_4
    const/high16 v1, 0x800000

    and-int v1, p47, v1

    if-eqz v1, :cond_5

    move-object/from16 v27, v2

    goto :goto_5

    :cond_5
    move-object/from16 v27, p24

    :goto_5
    const/high16 v1, 0x1000000

    and-int v1, p47, v1

    if-eqz v1, :cond_6

    move-object/from16 v28, v2

    goto :goto_6

    :cond_6
    move-object/from16 v28, p25

    :goto_6
    const/high16 v1, 0x2000000

    and-int v1, p47, v1

    if-eqz v1, :cond_7

    move-object/from16 v29, v2

    goto :goto_7

    :cond_7
    move-object/from16 v29, p26

    :goto_7
    const/high16 v1, 0x4000000

    and-int v1, p47, v1

    if-eqz v1, :cond_8

    move-object/from16 v30, v2

    goto :goto_8

    :cond_8
    move-object/from16 v30, p27

    :goto_8
    const/high16 v1, 0x8000000

    and-int v1, p47, v1

    if-eqz v1, :cond_9

    move-object/from16 v31, v2

    goto :goto_9

    :cond_9
    move-object/from16 v31, p28

    :goto_9
    const/high16 v1, 0x10000000

    and-int v1, p47, v1

    if-eqz v1, :cond_a

    move-object/from16 v32, v2

    goto :goto_a

    :cond_a
    move-object/from16 v32, p29

    :goto_a
    const/high16 v1, 0x20000000

    and-int v1, p47, v1

    if-eqz v1, :cond_b

    move-object/from16 v33, v2

    goto :goto_b

    :cond_b
    move-object/from16 v33, p30

    :goto_b
    const/high16 v1, 0x40000000    # 2.0f

    and-int v1, p47, v1

    if-eqz v1, :cond_c

    move-object/from16 v34, v2

    goto :goto_c

    :cond_c
    move-object/from16 v34, p31

    :goto_c
    const/high16 v1, -0x80000000

    and-int v1, p47, v1

    if-eqz v1, :cond_d

    move-object/from16 v35, v2

    goto :goto_d

    :cond_d
    move-object/from16 v35, p32

    :goto_d
    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_e

    move-object/from16 v36, v2

    goto :goto_e

    :cond_e
    move-object/from16 v36, p33

    :goto_e
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_f

    move-object/from16 v37, v2

    goto :goto_f

    :cond_f
    move-object/from16 v37, p34

    :goto_f
    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_10

    move-object/from16 v38, v2

    goto :goto_10

    :cond_10
    move-object/from16 v38, p35

    :goto_10
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_11

    move-object/from16 v39, v2

    goto :goto_11

    :cond_11
    move-object/from16 v39, p36

    :goto_11
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_12

    move-object/from16 v40, v2

    goto :goto_12

    :cond_12
    move-object/from16 v40, p37

    :goto_12
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_13

    move-object/from16 v41, v2

    goto :goto_13

    :cond_13
    move-object/from16 v41, p38

    :goto_13
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_14

    move-object/from16 v42, v2

    goto :goto_14

    :cond_14
    move-object/from16 v42, p39

    :goto_14
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_15

    move-object/from16 v43, v2

    goto :goto_15

    :cond_15
    move-object/from16 v43, p40

    :goto_15
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_16

    move-object/from16 v44, v2

    goto :goto_16

    :cond_16
    move-object/from16 v44, p41

    :goto_16
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_17

    move-object/from16 v45, v2

    goto :goto_17

    :cond_17
    move-object/from16 v45, p42

    :goto_17
    and-int/lit16 v1, v0, 0x400

    if-eqz v1, :cond_18

    move-object/from16 v46, v2

    goto :goto_18

    :cond_18
    move-object/from16 v46, p43

    :goto_18
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_19

    move-object/from16 v47, v2

    goto :goto_19

    :cond_19
    move-object/from16 v47, p44

    :goto_19
    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_1a

    move-object/from16 v48, v2

    goto :goto_1a

    :cond_1a
    move-object/from16 v48, p45

    :goto_1a
    and-int/lit16 v0, v0, 0x2000

    if-eqz v0, :cond_1b

    move-object/from16 v49, v2

    goto :goto_1b

    :cond_1b
    move-object/from16 v49, p46

    :goto_1b
    move-object/from16 v3, p0

    move/from16 v4, p1

    move/from16 v5, p2

    move-object/from16 v6, p3

    move/from16 v7, p4

    move/from16 v8, p5

    move-object/from16 v9, p6

    move/from16 v10, p7

    move/from16 v11, p8

    move/from16 v12, p9

    move/from16 v13, p10

    move/from16 v14, p11

    move/from16 v15, p12

    move-object/from16 v16, p13

    move-object/from16 v17, p14

    move-object/from16 v18, p15

    move-object/from16 v19, p16

    move/from16 v20, p17

    move/from16 v21, p18

    .line 52
    invoke-direct/range {v3 .. v49}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;-><init>(ZZLjava/lang/String;ZZLjava/lang/String;ZZZZZZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/model/ManualEntryMode;Ljava/util/List;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;ZZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/stripe/android/financialconnections/model/TextUpdate;Ljava/util/Map;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;Ljava/util/Map;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;)V

    return-void
.end method

.method public static final synthetic access$get$childSerializers$cp()[Lkotlinx/serialization/KSerializer;
    .locals 1

    .line 50
    sget-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->$childSerializers:[Lkotlinx/serialization/KSerializer;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;ZZLjava/lang/String;ZZLjava/lang/String;ZZZZZZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/model/ManualEntryMode;Ljava/util/List;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;ZZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/stripe/android/financialconnections/model/TextUpdate;Ljava/util/Map;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;Ljava/util/Map;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;IILjava/lang/Object;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p47

    move/from16 v2, p48

    and-int/lit8 v3, v1, 0x1

    if-eqz v3, :cond_0

    iget-boolean v3, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->allowManualEntry:Z

    goto :goto_0

    :cond_0
    move/from16 v3, p1

    :goto_0
    and-int/lit8 v4, v1, 0x2

    if-eqz v4, :cond_1

    iget-boolean v4, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->consentRequired:Z

    goto :goto_1

    :cond_1
    move/from16 v4, p2

    :goto_1
    and-int/lit8 v5, v1, 0x4

    if-eqz v5, :cond_2

    iget-object v5, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->consentAcquiredAt:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v5, p3

    :goto_2
    and-int/lit8 v6, v1, 0x8

    if-eqz v6, :cond_3

    iget-boolean v6, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->customManualEntryHandling:Z

    goto :goto_3

    :cond_3
    move/from16 v6, p4

    :goto_3
    and-int/lit8 v7, v1, 0x10

    if-eqz v7, :cond_4

    iget-boolean v7, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->disableLinkMoreAccounts:Z

    goto :goto_4

    :cond_4
    move/from16 v7, p5

    :goto_4
    and-int/lit8 v8, v1, 0x20

    if-eqz v8, :cond_5

    iget-object v8, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->id:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v8, p6

    :goto_5
    and-int/lit8 v9, v1, 0x40

    if-eqz v9, :cond_6

    iget-boolean v9, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->instantVerificationDisabled:Z

    goto :goto_6

    :cond_6
    move/from16 v9, p7

    :goto_6
    and-int/lit16 v10, v1, 0x80

    if-eqz v10, :cond_7

    iget-boolean v10, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->institutionSearchDisabled:Z

    goto :goto_7

    :cond_7
    move/from16 v10, p8

    :goto_7
    and-int/lit16 v11, v1, 0x100

    if-eqz v11, :cond_8

    iget-boolean v11, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->appVerificationEnabled:Z

    goto :goto_8

    :cond_8
    move/from16 v11, p9

    :goto_8
    and-int/lit16 v12, v1, 0x200

    if-eqz v12, :cond_9

    iget-boolean v12, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->livemode:Z

    goto :goto_9

    :cond_9
    move/from16 v12, p10

    :goto_9
    and-int/lit16 v13, v1, 0x400

    if-eqz v13, :cond_a

    iget-boolean v13, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->manualEntryUsesMicrodeposits:Z

    goto :goto_a

    :cond_a
    move/from16 v13, p11

    :goto_a
    and-int/lit16 v14, v1, 0x800

    if-eqz v14, :cond_b

    iget-boolean v14, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->mobileHandoffEnabled:Z

    goto :goto_b

    :cond_b
    move/from16 v14, p12

    :goto_b
    and-int/lit16 v15, v1, 0x1000

    if-eqz v15, :cond_c

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->nextPane:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    goto :goto_c

    :cond_c
    move-object/from16 v15, p13

    :goto_c
    move/from16 p1, v3

    and-int/lit16 v3, v1, 0x2000

    if-eqz v3, :cond_d

    iget-object v3, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->manualEntryMode:Lcom/stripe/android/financialconnections/model/ManualEntryMode;

    goto :goto_d

    :cond_d
    move-object/from16 v3, p14

    :goto_d
    move-object/from16 p2, v3

    and-int/lit16 v3, v1, 0x4000

    if-eqz v3, :cond_e

    iget-object v3, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->permissions:Ljava/util/List;

    goto :goto_e

    :cond_e
    move-object/from16 v3, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->product:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;

    goto :goto_f

    :cond_f
    move-object/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p47, v16

    move-object/from16 p3, v1

    if-eqz v16, :cond_10

    iget-boolean v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->singleAccount:Z

    goto :goto_10

    :cond_10
    move/from16 v1, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p47, v16

    move/from16 p4, v1

    if-eqz v16, :cond_11

    iget-boolean v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->useSingleSortSearch:Z

    goto :goto_11

    :cond_11
    move/from16 v1, p18

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, p47, v16

    move/from16 p5, v1

    if-eqz v16, :cond_12

    iget-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountDisconnectionMethod:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;

    goto :goto_12

    :cond_12
    move-object/from16 v1, p19

    :goto_12
    const/high16 v16, 0x80000

    and-int v16, p47, v16

    move-object/from16 p6, v1

    if-eqz v16, :cond_13

    iget-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderCustomerEmailAddress:Ljava/lang/String;

    goto :goto_13

    :cond_13
    move-object/from16 v1, p20

    :goto_13
    const/high16 v16, 0x100000

    and-int v16, p47, v16

    move-object/from16 p7, v1

    if-eqz v16, :cond_14

    iget-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderIsLinkConsumer:Ljava/lang/Boolean;

    goto :goto_14

    :cond_14
    move-object/from16 v1, p21

    :goto_14
    const/high16 v16, 0x200000

    and-int v16, p47, v16

    move-object/from16 p8, v1

    if-eqz v16, :cond_15

    iget-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderPhoneNumber:Ljava/lang/String;

    goto :goto_15

    :cond_15
    move-object/from16 v1, p22

    :goto_15
    const/high16 v16, 0x400000

    and-int v16, p47, v16

    move-object/from16 p9, v1

    if-eqz v16, :cond_16

    iget-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderToken:Ljava/lang/String;

    goto :goto_16

    :cond_16
    move-object/from16 v1, p23

    :goto_16
    const/high16 v16, 0x800000

    and-int v16, p47, v16

    move-object/from16 p10, v1

    if-eqz v16, :cond_17

    iget-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->activeAuthSession:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    goto :goto_17

    :cond_17
    move-object/from16 v1, p24

    :goto_17
    const/high16 v16, 0x1000000

    and-int v16, p47, v16

    move-object/from16 p11, v1

    if-eqz v16, :cond_18

    iget-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->activeInstitution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    goto :goto_18

    :cond_18
    move-object/from16 v1, p25

    :goto_18
    const/high16 v16, 0x2000000

    and-int v16, p47, v16

    move-object/from16 p12, v1

    if-eqz v16, :cond_19

    iget-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->assignmentEventId:Ljava/lang/String;

    goto :goto_19

    :cond_19
    move-object/from16 v1, p26

    :goto_19
    const/high16 v16, 0x4000000

    and-int v16, p47, v16

    move-object/from16 p13, v1

    if-eqz v16, :cond_1a

    iget-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->businessName:Ljava/lang/String;

    goto :goto_1a

    :cond_1a
    move-object/from16 v1, p27

    :goto_1a
    const/high16 v16, 0x8000000

    and-int v16, p47, v16

    move-object/from16 p14, v1

    if-eqz v16, :cond_1b

    iget-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->cancelUrl:Ljava/lang/String;

    goto :goto_1b

    :cond_1b
    move-object/from16 v1, p28

    :goto_1b
    const/high16 v16, 0x10000000

    and-int v16, p47, v16

    move-object/from16 p15, v1

    if-eqz v16, :cond_1c

    iget-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->connectPlatformName:Ljava/lang/String;

    goto :goto_1c

    :cond_1c
    move-object/from16 v1, p29

    :goto_1c
    const/high16 v16, 0x20000000

    and-int v16, p47, v16

    move-object/from16 p16, v1

    if-eqz v16, :cond_1d

    iget-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->connectedAccountName:Ljava/lang/String;

    goto :goto_1d

    :cond_1d
    move-object/from16 v1, p30

    :goto_1d
    const/high16 v16, 0x40000000    # 2.0f

    and-int v16, p47, v16

    move-object/from16 p17, v1

    if-eqz v16, :cond_1e

    iget-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->experimentAssignments:Ljava/util/Map;

    goto :goto_1e

    :cond_1e
    move-object/from16 v1, p31

    :goto_1e
    const/high16 v16, -0x80000000

    and-int v16, p47, v16

    move-object/from16 p18, v1

    if-eqz v16, :cond_1f

    iget-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->displayText:Lcom/stripe/android/financialconnections/model/TextUpdate;

    goto :goto_1f

    :cond_1f
    move-object/from16 v1, p32

    :goto_1f
    and-int/lit8 v16, v2, 0x1

    move-object/from16 p19, v1

    if-eqz v16, :cond_20

    iget-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->features:Ljava/util/Map;

    goto :goto_20

    :cond_20
    move-object/from16 v1, p33

    :goto_20
    and-int/lit8 v16, v2, 0x2

    move-object/from16 p20, v1

    if-eqz v16, :cond_21

    iget-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->hostedAuthUrl:Ljava/lang/String;

    goto :goto_21

    :cond_21
    move-object/from16 v1, p34

    :goto_21
    and-int/lit8 v16, v2, 0x4

    move-object/from16 p21, v1

    if-eqz v16, :cond_22

    iget-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->initialInstitution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    goto :goto_22

    :cond_22
    move-object/from16 v1, p35

    :goto_22
    and-int/lit8 v16, v2, 0x8

    move-object/from16 p22, v1

    if-eqz v16, :cond_23

    iget-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isEndUserFacing:Ljava/lang/Boolean;

    goto :goto_23

    :cond_23
    move-object/from16 v1, p36

    :goto_23
    and-int/lit8 v16, v2, 0x10

    move-object/from16 p23, v1

    if-eqz v16, :cond_24

    iget-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isLinkWithStripe:Ljava/lang/Boolean;

    goto :goto_24

    :cond_24
    move-object/from16 v1, p37

    :goto_24
    and-int/lit8 v16, v2, 0x20

    move-object/from16 p24, v1

    if-eqz v16, :cond_25

    iget-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isNetworkingUserFlow:Ljava/lang/Boolean;

    goto :goto_25

    :cond_25
    move-object/from16 v1, p38

    :goto_25
    and-int/lit8 v16, v2, 0x40

    move-object/from16 p25, v1

    if-eqz v16, :cond_26

    iget-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isStripeDirect:Ljava/lang/Boolean;

    goto :goto_26

    :cond_26
    move-object/from16 v1, p39

    :goto_26
    move-object/from16 p26, v1

    and-int/lit16 v1, v2, 0x80

    if-eqz v1, :cond_27

    iget-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->linkAccountSessionCancellationBehavior:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;

    goto :goto_27

    :cond_27
    move-object/from16 v1, p40

    :goto_27
    move-object/from16 p27, v1

    and-int/lit16 v1, v2, 0x100

    if-eqz v1, :cond_28

    iget-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->modalCustomization:Ljava/util/Map;

    goto :goto_28

    :cond_28
    move-object/from16 v1, p41

    :goto_28
    move-object/from16 p28, v1

    and-int/lit16 v1, v2, 0x200

    if-eqz v1, :cond_29

    iget-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->paymentMethodType:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;

    goto :goto_29

    :cond_29
    move-object/from16 v1, p42

    :goto_29
    move-object/from16 p29, v1

    and-int/lit16 v1, v2, 0x400

    if-eqz v1, :cond_2a

    iget-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->stepUpAuthenticationRequired:Ljava/lang/Boolean;

    goto :goto_2a

    :cond_2a
    move-object/from16 v1, p43

    :goto_2a
    move-object/from16 p30, v1

    and-int/lit16 v1, v2, 0x800

    if-eqz v1, :cond_2b

    iget-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->successUrl:Ljava/lang/String;

    goto :goto_2b

    :cond_2b
    move-object/from16 v1, p44

    :goto_2b
    move-object/from16 p31, v1

    and-int/lit16 v1, v2, 0x1000

    if-eqz v1, :cond_2c

    iget-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->skipSuccessPane:Ljava/lang/Boolean;

    goto :goto_2c

    :cond_2c
    move-object/from16 v1, p45

    :goto_2c
    and-int/lit16 v2, v2, 0x2000

    if-eqz v2, :cond_2d

    iget-object v2, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->theme:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;

    move-object/from16 p47, v2

    goto :goto_2d

    :cond_2d
    move-object/from16 p47, p46

    :goto_2d
    move-object/from16 p32, p18

    move-object/from16 p33, p19

    move-object/from16 p34, p20

    move-object/from16 p35, p21

    move-object/from16 p36, p22

    move-object/from16 p37, p23

    move-object/from16 p38, p24

    move-object/from16 p39, p25

    move-object/from16 p40, p26

    move-object/from16 p41, p27

    move-object/from16 p42, p28

    move-object/from16 p43, p29

    move-object/from16 p44, p30

    move-object/from16 p45, p31

    move-object/from16 p46, v1

    move/from16 p18, p4

    move/from16 p19, p5

    move-object/from16 p20, p6

    move-object/from16 p21, p7

    move-object/from16 p22, p8

    move-object/from16 p23, p9

    move-object/from16 p24, p10

    move-object/from16 p25, p11

    move-object/from16 p26, p12

    move-object/from16 p27, p13

    move-object/from16 p28, p14

    move-object/from16 p29, p15

    move-object/from16 p30, p16

    move-object/from16 p31, p17

    move-object/from16 p16, v3

    move-object/from16 p4, v5

    move/from16 p5, v6

    move/from16 p6, v7

    move-object/from16 p7, v8

    move/from16 p8, v9

    move/from16 p9, v10

    move/from16 p10, v11

    move/from16 p11, v12

    move/from16 p12, v13

    move/from16 p13, v14

    move-object/from16 p14, v15

    move-object/from16 p15, p2

    move-object/from16 p17, p3

    move/from16 p3, v4

    move/from16 p2, p1

    move-object/from16 p1, v0

    invoke-virtual/range {p1 .. p47}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->copy(ZZLjava/lang/String;ZZLjava/lang/String;ZZZZZZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/model/ManualEntryMode;Ljava/util/List;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;ZZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/stripe/android/financialconnections/model/TextUpdate;Ljava/util/Map;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;Ljava/util/Map;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic getAccountDisconnectionMethod$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "account_disconnection_method"
    .end annotation

    return-void
.end method

.method public static synthetic getAccountholderCustomerEmailAddress$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "accountholder_customer_email_address"
    .end annotation

    return-void
.end method

.method public static synthetic getAccountholderIsLinkConsumer$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "accountholder_is_link_consumer"
    .end annotation

    return-void
.end method

.method public static synthetic getAccountholderPhoneNumber$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "accountholder_phone_number"
    .end annotation

    return-void
.end method

.method public static synthetic getAccountholderToken$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "accountholder_token"
    .end annotation

    return-void
.end method

.method public static synthetic getActiveAuthSession$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "active_auth_session"
    .end annotation

    return-void
.end method

.method public static synthetic getActiveInstitution$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "active_institution"
    .end annotation

    return-void
.end method

.method public static synthetic getAllowManualEntry$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "allow_manual_entry"
    .end annotation

    return-void
.end method

.method public static synthetic getAppVerificationEnabled$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "app_verification_enabled"
    .end annotation

    return-void
.end method

.method public static synthetic getAssignmentEventId$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "assignment_event_id"
    .end annotation

    return-void
.end method

.method public static synthetic getBusinessName$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "business_name"
    .end annotation

    return-void
.end method

.method public static synthetic getCancelUrl$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "cancel_url"
    .end annotation

    return-void
.end method

.method public static synthetic getConnectPlatformName$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "connect_platform_name"
    .end annotation

    return-void
.end method

.method public static synthetic getConnectedAccountName$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "connected_account_name"
    .end annotation

    return-void
.end method

.method public static synthetic getConsentAcquiredAt$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "consent_acquired_at"
    .end annotation

    return-void
.end method

.method public static synthetic getConsentRequired$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "consent_required"
    .end annotation

    return-void
.end method

.method public static synthetic getCustomManualEntryHandling$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "custom_manual_entry_handling"
    .end annotation

    return-void
.end method

.method public static synthetic getDisableLinkMoreAccounts$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "disable_link_more_accounts"
    .end annotation

    return-void
.end method

.method public static synthetic getDisplayText$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "display_text"
    .end annotation

    return-void
.end method

.method public static synthetic getExperimentAssignments$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "experiment_assignments"
    .end annotation

    return-void
.end method

.method public static synthetic getFeatures$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "features"
    .end annotation

    return-void
.end method

.method public static synthetic getHostedAuthUrl$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "hosted_auth_url"
    .end annotation

    return-void
.end method

.method public static synthetic getId$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "id"
    .end annotation

    return-void
.end method

.method public static synthetic getInitialInstitution$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "initial_institution"
    .end annotation

    return-void
.end method

.method public static synthetic getInstantVerificationDisabled$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "instant_verification_disabled"
    .end annotation

    return-void
.end method

.method public static synthetic getInstitutionSearchDisabled$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "institution_search_disabled"
    .end annotation

    return-void
.end method

.method public static synthetic getLinkAccountSessionCancellationBehavior$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "link_account_session_cancellation_behavior"
    .end annotation

    return-void
.end method

.method public static synthetic getLivemode$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "livemode"
    .end annotation

    return-void
.end method

.method public static synthetic getManualEntryMode$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "manual_entry_mode"
    .end annotation

    return-void
.end method

.method public static synthetic getManualEntryUsesMicrodeposits$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "manual_entry_uses_microdeposits"
    .end annotation

    return-void
.end method

.method public static synthetic getMobileHandoffEnabled$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "mobile_handoff_enabled"
    .end annotation

    return-void
.end method

.method public static synthetic getModalCustomization$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "modal_customization"
    .end annotation

    return-void
.end method

.method public static synthetic getNextPane$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "next_pane"
    .end annotation

    return-void
.end method

.method public static synthetic getPaymentMethodType$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "payment_method_type"
    .end annotation

    return-void
.end method

.method public static synthetic getPermissions$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "permissions"
    .end annotation

    return-void
.end method

.method public static synthetic getProduct$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "product"
    .end annotation

    return-void
.end method

.method public static synthetic getSingleAccount$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "single_account"
    .end annotation

    return-void
.end method

.method public static synthetic getSkipSuccessPane$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "skip_success_pane"
    .end annotation

    return-void
.end method

.method public static synthetic getStepUpAuthenticationRequired$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "step_up_authentication_required"
    .end annotation

    return-void
.end method

.method public static synthetic getSuccessUrl$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "success_url"
    .end annotation

    return-void
.end method

.method public static synthetic getTheme$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "theme"
    .end annotation

    return-void
.end method

.method public static synthetic getUseSingleSortSearch$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "use_single_sort_search"
    .end annotation

    return-void
.end method

.method public static synthetic isEndUserFacing$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "is_end_user_facing"
    .end annotation

    return-void
.end method

.method public static synthetic isLinkWithStripe$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "is_link_with_stripe"
    .end annotation

    return-void
.end method

.method public static synthetic isNetworkingUserFlow$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "is_networking_user_flow"
    .end annotation

    return-void
.end method

.method public static synthetic isStripeDirect$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "is_stripe_direct"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$financial_connections_release(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V
    .locals 4
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 50
    sget-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->$childSerializers:[Lkotlinx/serialization/KSerializer;

    const/4 v1, 0x0

    iget-boolean v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->allowManualEntry:Z

    invoke-interface {p1, p2, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeBooleanElement(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V

    const/4 v1, 0x1

    iget-boolean v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->consentRequired:Z

    invoke-interface {p1, p2, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeBooleanElement(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    check-cast v1, Lkotlinx/serialization/SerializationStrategy;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->consentAcquiredAt:Ljava/lang/String;

    const/4 v3, 0x2

    invoke-interface {p1, p2, v3, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    const/4 v1, 0x3

    iget-boolean v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->customManualEntryHandling:Z

    invoke-interface {p1, p2, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeBooleanElement(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V

    const/4 v1, 0x4

    iget-boolean v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->disableLinkMoreAccounts:Z

    invoke-interface {p1, p2, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeBooleanElement(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V

    const/4 v1, 0x5

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeStringElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V

    const/4 v1, 0x6

    iget-boolean v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->instantVerificationDisabled:Z

    invoke-interface {p1, p2, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeBooleanElement(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V

    const/4 v1, 0x7

    iget-boolean v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->institutionSearchDisabled:Z

    invoke-interface {p1, p2, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeBooleanElement(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V

    const/16 v1, 0x8

    iget-boolean v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->appVerificationEnabled:Z

    invoke-interface {p1, p2, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeBooleanElement(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V

    const/16 v1, 0x9

    iget-boolean v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->livemode:Z

    invoke-interface {p1, p2, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeBooleanElement(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V

    const/16 v1, 0xa

    iget-boolean v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->manualEntryUsesMicrodeposits:Z

    invoke-interface {p1, p2, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeBooleanElement(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V

    const/16 v1, 0xb

    iget-boolean v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->mobileHandoffEnabled:Z

    invoke-interface {p1, p2, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeBooleanElement(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V

    sget-object v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane$Serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane$Serializer;

    check-cast v1, Lkotlinx/serialization/SerializationStrategy;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->nextPane:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    const/16 v3, 0xc

    invoke-interface {p1, p2, v3, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    sget-object v1, Lcom/stripe/android/financialconnections/model/ManualEntryMode$Serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/ManualEntryMode$Serializer;

    check-cast v1, Lkotlinx/serialization/SerializationStrategy;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->manualEntryMode:Lcom/stripe/android/financialconnections/model/ManualEntryMode;

    const/16 v3, 0xd

    invoke-interface {p1, p2, v3, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    const/16 v1, 0xe

    aget-object v2, v0, v1

    check-cast v2, Lkotlinx/serialization/SerializationStrategy;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->permissions:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    sget-object v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product$Serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product$Serializer;

    check-cast v1, Lkotlinx/serialization/SerializationStrategy;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->product:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;

    const/16 v3, 0xf

    invoke-interface {p1, p2, v3, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    const/16 v1, 0x10

    iget-boolean v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->singleAccount:Z

    invoke-interface {p1, p2, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeBooleanElement(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V

    const/16 v1, 0x11

    iget-boolean v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->useSingleSortSearch:Z

    invoke-interface {p1, p2, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeBooleanElement(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V

    const/16 v1, 0x12

    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountDisconnectionMethod:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;

    if-eqz v2, :cond_1

    :goto_0
    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod$Serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod$Serializer;

    check-cast v2, Lkotlinx/serialization/SerializationStrategy;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountDisconnectionMethod:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;

    invoke-interface {p1, p2, v1, v2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_1
    const/16 v1, 0x13

    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderCustomerEmailAddress:Ljava/lang/String;

    if-eqz v2, :cond_3

    :goto_1
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    check-cast v2, Lkotlinx/serialization/SerializationStrategy;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderCustomerEmailAddress:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_3
    const/16 v1, 0x14

    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderIsLinkConsumer:Ljava/lang/Boolean;

    if-eqz v2, :cond_5

    :goto_2
    sget-object v2, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    check-cast v2, Lkotlinx/serialization/SerializationStrategy;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderIsLinkConsumer:Ljava/lang/Boolean;

    invoke-interface {p1, p2, v1, v2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_5
    const/16 v1, 0x15

    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderPhoneNumber:Ljava/lang/String;

    if-eqz v2, :cond_7

    :goto_3
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    check-cast v2, Lkotlinx/serialization/SerializationStrategy;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderPhoneNumber:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_7
    const/16 v1, 0x16

    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderToken:Ljava/lang/String;

    if-eqz v2, :cond_9

    :goto_4
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    check-cast v2, Lkotlinx/serialization/SerializationStrategy;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderToken:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_9
    const/16 v1, 0x17

    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v2

    if-eqz v2, :cond_a

    goto :goto_5

    :cond_a
    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->activeAuthSession:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    if-eqz v2, :cond_b

    :goto_5
    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$$serializer;

    check-cast v2, Lkotlinx/serialization/SerializationStrategy;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->activeAuthSession:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    invoke-interface {p1, p2, v1, v2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_b
    const/16 v1, 0x18

    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v2

    if-eqz v2, :cond_c

    goto :goto_6

    :cond_c
    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->activeInstitution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    if-eqz v2, :cond_d

    :goto_6
    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution$$serializer;

    check-cast v2, Lkotlinx/serialization/SerializationStrategy;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->activeInstitution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    invoke-interface {p1, p2, v1, v2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_d
    const/16 v1, 0x19

    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v2

    if-eqz v2, :cond_e

    goto :goto_7

    :cond_e
    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->assignmentEventId:Ljava/lang/String;

    if-eqz v2, :cond_f

    :goto_7
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    check-cast v2, Lkotlinx/serialization/SerializationStrategy;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->assignmentEventId:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_f
    const/16 v1, 0x1a

    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v2

    if-eqz v2, :cond_10

    goto :goto_8

    :cond_10
    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->businessName:Ljava/lang/String;

    if-eqz v2, :cond_11

    :goto_8
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    check-cast v2, Lkotlinx/serialization/SerializationStrategy;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->businessName:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_11
    const/16 v1, 0x1b

    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v2

    if-eqz v2, :cond_12

    goto :goto_9

    :cond_12
    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->cancelUrl:Ljava/lang/String;

    if-eqz v2, :cond_13

    :goto_9
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    check-cast v2, Lkotlinx/serialization/SerializationStrategy;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->cancelUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_13
    const/16 v1, 0x1c

    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v2

    if-eqz v2, :cond_14

    goto :goto_a

    :cond_14
    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->connectPlatformName:Ljava/lang/String;

    if-eqz v2, :cond_15

    :goto_a
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    check-cast v2, Lkotlinx/serialization/SerializationStrategy;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->connectPlatformName:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_15
    const/16 v1, 0x1d

    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v2

    if-eqz v2, :cond_16

    goto :goto_b

    :cond_16
    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->connectedAccountName:Ljava/lang/String;

    if-eqz v2, :cond_17

    :goto_b
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    check-cast v2, Lkotlinx/serialization/SerializationStrategy;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->connectedAccountName:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_17
    const/16 v1, 0x1e

    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v2

    if-eqz v2, :cond_18

    goto :goto_c

    :cond_18
    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->experimentAssignments:Ljava/util/Map;

    if-eqz v2, :cond_19

    :goto_c
    aget-object v2, v0, v1

    check-cast v2, Lkotlinx/serialization/SerializationStrategy;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->experimentAssignments:Ljava/util/Map;

    invoke-interface {p1, p2, v1, v2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_19
    const/16 v1, 0x1f

    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v2

    if-eqz v2, :cond_1a

    goto :goto_d

    :cond_1a
    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->displayText:Lcom/stripe/android/financialconnections/model/TextUpdate;

    if-eqz v2, :cond_1b

    :goto_d
    sget-object v2, Lcom/stripe/android/financialconnections/model/TextUpdate$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/TextUpdate$$serializer;

    check-cast v2, Lkotlinx/serialization/SerializationStrategy;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->displayText:Lcom/stripe/android/financialconnections/model/TextUpdate;

    invoke-interface {p1, p2, v1, v2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_1b
    const/16 v1, 0x20

    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v2

    if-eqz v2, :cond_1c

    goto :goto_e

    :cond_1c
    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->features:Ljava/util/Map;

    if-eqz v2, :cond_1d

    :goto_e
    aget-object v2, v0, v1

    check-cast v2, Lkotlinx/serialization/SerializationStrategy;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->features:Ljava/util/Map;

    invoke-interface {p1, p2, v1, v2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_1d
    const/16 v1, 0x21

    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v2

    if-eqz v2, :cond_1e

    goto :goto_f

    :cond_1e
    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->hostedAuthUrl:Ljava/lang/String;

    if-eqz v2, :cond_1f

    :goto_f
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    check-cast v2, Lkotlinx/serialization/SerializationStrategy;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->hostedAuthUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_1f
    const/16 v1, 0x22

    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v2

    if-eqz v2, :cond_20

    goto :goto_10

    :cond_20
    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->initialInstitution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    if-eqz v2, :cond_21

    :goto_10
    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution$$serializer;

    check-cast v2, Lkotlinx/serialization/SerializationStrategy;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->initialInstitution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    invoke-interface {p1, p2, v1, v2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_21
    const/16 v1, 0x23

    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v2

    if-eqz v2, :cond_22

    goto :goto_11

    :cond_22
    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isEndUserFacing:Ljava/lang/Boolean;

    if-eqz v2, :cond_23

    :goto_11
    sget-object v2, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    check-cast v2, Lkotlinx/serialization/SerializationStrategy;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isEndUserFacing:Ljava/lang/Boolean;

    invoke-interface {p1, p2, v1, v2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_23
    const/16 v1, 0x24

    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v2

    if-eqz v2, :cond_24

    goto :goto_12

    :cond_24
    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isLinkWithStripe:Ljava/lang/Boolean;

    if-eqz v2, :cond_25

    :goto_12
    sget-object v2, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    check-cast v2, Lkotlinx/serialization/SerializationStrategy;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isLinkWithStripe:Ljava/lang/Boolean;

    invoke-interface {p1, p2, v1, v2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_25
    const/16 v1, 0x25

    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v2

    if-eqz v2, :cond_26

    goto :goto_13

    :cond_26
    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isNetworkingUserFlow:Ljava/lang/Boolean;

    if-eqz v2, :cond_27

    :goto_13
    sget-object v2, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    check-cast v2, Lkotlinx/serialization/SerializationStrategy;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isNetworkingUserFlow:Ljava/lang/Boolean;

    invoke-interface {p1, p2, v1, v2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_27
    const/16 v1, 0x26

    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v1

    if-eqz v1, :cond_28

    goto :goto_14

    :cond_28
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isStripeDirect:Ljava/lang/Boolean;

    if-eqz v1, :cond_29

    :goto_14
    sget-object v1, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    check-cast v1, Lkotlinx/serialization/SerializationStrategy;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isStripeDirect:Ljava/lang/Boolean;

    const/16 v3, 0x26

    invoke-interface {p1, p2, v3, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_29
    const/16 v1, 0x27

    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v1

    if-eqz v1, :cond_2a

    goto :goto_15

    :cond_2a
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->linkAccountSessionCancellationBehavior:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;

    if-eqz v1, :cond_2b

    :goto_15
    sget-object v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior$Serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior$Serializer;

    check-cast v1, Lkotlinx/serialization/SerializationStrategy;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->linkAccountSessionCancellationBehavior:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;

    const/16 v3, 0x27

    invoke-interface {p1, p2, v3, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_2b
    const/16 v1, 0x28

    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v2

    if-eqz v2, :cond_2c

    goto :goto_16

    :cond_2c
    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->modalCustomization:Ljava/util/Map;

    if-eqz v2, :cond_2d

    :goto_16
    aget-object v0, v0, v1

    check-cast v0, Lkotlinx/serialization/SerializationStrategy;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->modalCustomization:Ljava/util/Map;

    invoke-interface {p1, p2, v1, v0, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_2d
    const/16 v0, 0x29

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v0

    if-eqz v0, :cond_2e

    goto :goto_17

    :cond_2e
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->paymentMethodType:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;

    if-eqz v0, :cond_2f

    :goto_17
    sget-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes$Serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes$Serializer;

    check-cast v0, Lkotlinx/serialization/SerializationStrategy;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->paymentMethodType:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;

    const/16 v2, 0x29

    invoke-interface {p1, p2, v2, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_2f
    const/16 v0, 0x2a

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v0

    if-eqz v0, :cond_30

    goto :goto_18

    :cond_30
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->stepUpAuthenticationRequired:Ljava/lang/Boolean;

    if-eqz v0, :cond_31

    :goto_18
    sget-object v0, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    check-cast v0, Lkotlinx/serialization/SerializationStrategy;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->stepUpAuthenticationRequired:Ljava/lang/Boolean;

    const/16 v2, 0x2a

    invoke-interface {p1, p2, v2, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_31
    const/16 v0, 0x2b

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v0

    if-eqz v0, :cond_32

    goto :goto_19

    :cond_32
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->successUrl:Ljava/lang/String;

    if-eqz v0, :cond_33

    :goto_19
    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    check-cast v0, Lkotlinx/serialization/SerializationStrategy;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->successUrl:Ljava/lang/String;

    const/16 v2, 0x2b

    invoke-interface {p1, p2, v2, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_33
    const/16 v0, 0x2c

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v0

    if-eqz v0, :cond_34

    goto :goto_1a

    :cond_34
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->skipSuccessPane:Ljava/lang/Boolean;

    if-eqz v0, :cond_35

    :goto_1a
    sget-object v0, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    check-cast v0, Lkotlinx/serialization/SerializationStrategy;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->skipSuccessPane:Ljava/lang/Boolean;

    const/16 v2, 0x2c

    invoke-interface {p1, p2, v2, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_35
    const/16 v0, 0x2d

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v0

    if-eqz v0, :cond_36

    goto :goto_1b

    :cond_36
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->theme:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;

    if-eqz v0, :cond_37

    :goto_1b
    sget-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme$Serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme$Serializer;

    check-cast v0, Lkotlinx/serialization/SerializationStrategy;

    iget-object p0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->theme:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;

    const/16 v1, 0x2d

    invoke-interface {p1, p2, v1, v0, p0}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_37
    return-void
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->allowManualEntry:Z

    return v0
.end method

.method public final component10()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->livemode:Z

    return v0
.end method

.method public final component11()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->manualEntryUsesMicrodeposits:Z

    return v0
.end method

.method public final component12()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->mobileHandoffEnabled:Z

    return v0
.end method

.method public final component13()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->nextPane:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    return-object v0
.end method

.method public final component14()Lcom/stripe/android/financialconnections/model/ManualEntryMode;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->manualEntryMode:Lcom/stripe/android/financialconnections/model/ManualEntryMode;

    return-object v0
.end method

.method public final component15()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->permissions:Ljava/util/List;

    return-object v0
.end method

.method public final component16()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->product:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;

    return-object v0
.end method

.method public final component17()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->singleAccount:Z

    return v0
.end method

.method public final component18()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->useSingleSortSearch:Z

    return v0
.end method

.method public final component19()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountDisconnectionMethod:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;

    return-object v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->consentRequired:Z

    return v0
.end method

.method public final component20()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderCustomerEmailAddress:Ljava/lang/String;

    return-object v0
.end method

.method public final component21()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderIsLinkConsumer:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component22()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderPhoneNumber:Ljava/lang/String;

    return-object v0
.end method

.method public final component23()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderToken:Ljava/lang/String;

    return-object v0
.end method

.method public final component24()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->activeAuthSession:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    return-object v0
.end method

.method public final component25()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->activeInstitution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    return-object v0
.end method

.method public final component26()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->assignmentEventId:Ljava/lang/String;

    return-object v0
.end method

.method public final component27()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->businessName:Ljava/lang/String;

    return-object v0
.end method

.method public final component28()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->cancelUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component29()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->connectPlatformName:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->consentAcquiredAt:Ljava/lang/String;

    return-object v0
.end method

.method public final component30()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->connectedAccountName:Ljava/lang/String;

    return-object v0
.end method

.method public final component31()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->experimentAssignments:Ljava/util/Map;

    return-object v0
.end method

.method public final component32()Lcom/stripe/android/financialconnections/model/TextUpdate;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->displayText:Lcom/stripe/android/financialconnections/model/TextUpdate;

    return-object v0
.end method

.method public final component33()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->features:Ljava/util/Map;

    return-object v0
.end method

.method public final component34()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->hostedAuthUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component35()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->initialInstitution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    return-object v0
.end method

.method public final component36()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isEndUserFacing:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component37()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isLinkWithStripe:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component38()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isNetworkingUserFlow:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component39()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isStripeDirect:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->customManualEntryHandling:Z

    return v0
.end method

.method public final component40()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->linkAccountSessionCancellationBehavior:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;

    return-object v0
.end method

.method public final component41()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->modalCustomization:Ljava/util/Map;

    return-object v0
.end method

.method public final component42()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->paymentMethodType:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;

    return-object v0
.end method

.method public final component43()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->stepUpAuthenticationRequired:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component44()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->successUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component45()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->skipSuccessPane:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component46()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->theme:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;

    return-object v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->disableLinkMoreAccounts:Z

    return v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->instantVerificationDisabled:Z

    return v0
.end method

.method public final component8()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->institutionSearchDisabled:Z

    return v0
.end method

.method public final component9()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->appVerificationEnabled:Z

    return v0
.end method

.method public final copy(ZZLjava/lang/String;ZZLjava/lang/String;ZZZZZZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/model/ManualEntryMode;Ljava/util/List;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;ZZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/stripe/android/financialconnections/model/TextUpdate;Ljava/util/Map;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;Ljava/util/Map;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;
    .locals 48
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Ljava/lang/String;",
            "ZZ",
            "Ljava/lang/String;",
            "ZZZZZZ",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;",
            "Lcom/stripe/android/financialconnections/model/ManualEntryMode;",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;",
            ">;",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;",
            "ZZ",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/financialconnections/model/TextUpdate;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;",
            ")",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;"
        }
    .end annotation

    const-string v0, "id"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nextPane"

    move-object/from16 v14, p13

    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "manualEntryMode"

    move-object/from16 v15, p14

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "permissions"

    move-object/from16 v1, p15

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "product"

    move-object/from16 v2, p16

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    move/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    move/from16 v11, p10

    move/from16 v12, p11

    move/from16 v13, p12

    move-object/from16 v16, p15

    move/from16 v18, p17

    move/from16 v19, p18

    move-object/from16 v20, p19

    move-object/from16 v21, p20

    move-object/from16 v22, p21

    move-object/from16 v23, p22

    move-object/from16 v24, p23

    move-object/from16 v25, p24

    move-object/from16 v26, p25

    move-object/from16 v27, p26

    move-object/from16 v28, p27

    move-object/from16 v29, p28

    move-object/from16 v30, p29

    move-object/from16 v31, p30

    move-object/from16 v32, p31

    move-object/from16 v33, p32

    move-object/from16 v34, p33

    move-object/from16 v35, p34

    move-object/from16 v36, p35

    move-object/from16 v37, p36

    move-object/from16 v38, p37

    move-object/from16 v39, p38

    move-object/from16 v40, p39

    move-object/from16 v41, p40

    move-object/from16 v42, p41

    move-object/from16 v43, p42

    move-object/from16 v44, p43

    move-object/from16 v45, p44

    move-object/from16 v46, p45

    move-object/from16 v47, p46

    move-object/from16 v17, v2

    move/from16 v2, p1

    invoke-direct/range {v1 .. v47}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;-><init>(ZZLjava/lang/String;ZZLjava/lang/String;ZZZZZZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/model/ManualEntryMode;Ljava/util/List;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;ZZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/stripe/android/financialconnections/model/TextUpdate;Ljava/util/Map;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;Ljava/util/Map;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;)V

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
    instance-of v1, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->allowManualEntry:Z

    iget-boolean v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->allowManualEntry:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->consentRequired:Z

    iget-boolean v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->consentRequired:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->consentAcquiredAt:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->consentAcquiredAt:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->customManualEntryHandling:Z

    iget-boolean v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->customManualEntryHandling:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->disableLinkMoreAccounts:Z

    iget-boolean v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->disableLinkMoreAccounts:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->instantVerificationDisabled:Z

    iget-boolean v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->instantVerificationDisabled:Z

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->institutionSearchDisabled:Z

    iget-boolean v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->institutionSearchDisabled:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->appVerificationEnabled:Z

    iget-boolean v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->appVerificationEnabled:Z

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->livemode:Z

    iget-boolean v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->livemode:Z

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->manualEntryUsesMicrodeposits:Z

    iget-boolean v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->manualEntryUsesMicrodeposits:Z

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->mobileHandoffEnabled:Z

    iget-boolean v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->mobileHandoffEnabled:Z

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->nextPane:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->nextPane:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    if-eq v1, v3, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->manualEntryMode:Lcom/stripe/android/financialconnections/model/ManualEntryMode;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->manualEntryMode:Lcom/stripe/android/financialconnections/model/ManualEntryMode;

    if-eq v1, v3, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->permissions:Ljava/util/List;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->permissions:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->product:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->product:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;

    if-eq v1, v3, :cond_11

    return v2

    :cond_11
    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->singleAccount:Z

    iget-boolean v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->singleAccount:Z

    if-eq v1, v3, :cond_12

    return v2

    :cond_12
    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->useSingleSortSearch:Z

    iget-boolean v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->useSingleSortSearch:Z

    if-eq v1, v3, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountDisconnectionMethod:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountDisconnectionMethod:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;

    if-eq v1, v3, :cond_14

    return v2

    :cond_14
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderCustomerEmailAddress:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderCustomerEmailAddress:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    return v2

    :cond_15
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderIsLinkConsumer:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderIsLinkConsumer:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    return v2

    :cond_16
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderPhoneNumber:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderPhoneNumber:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    return v2

    :cond_17
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderToken:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderToken:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_18

    return v2

    :cond_18
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->activeAuthSession:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->activeAuthSession:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_19

    return v2

    :cond_19
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->activeInstitution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->activeInstitution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1a

    return v2

    :cond_1a
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->assignmentEventId:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->assignmentEventId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1b

    return v2

    :cond_1b
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->businessName:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->businessName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1c

    return v2

    :cond_1c
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->cancelUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->cancelUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1d

    return v2

    :cond_1d
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->connectPlatformName:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->connectPlatformName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1e

    return v2

    :cond_1e
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->connectedAccountName:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->connectedAccountName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1f

    return v2

    :cond_1f
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->experimentAssignments:Ljava/util/Map;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->experimentAssignments:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_20

    return v2

    :cond_20
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->displayText:Lcom/stripe/android/financialconnections/model/TextUpdate;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->displayText:Lcom/stripe/android/financialconnections/model/TextUpdate;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_21

    return v2

    :cond_21
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->features:Ljava/util/Map;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->features:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_22

    return v2

    :cond_22
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->hostedAuthUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->hostedAuthUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_23

    return v2

    :cond_23
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->initialInstitution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->initialInstitution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_24

    return v2

    :cond_24
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isEndUserFacing:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isEndUserFacing:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_25

    return v2

    :cond_25
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isLinkWithStripe:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isLinkWithStripe:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_26

    return v2

    :cond_26
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isNetworkingUserFlow:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isNetworkingUserFlow:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_27

    return v2

    :cond_27
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isStripeDirect:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isStripeDirect:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_28

    return v2

    :cond_28
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->linkAccountSessionCancellationBehavior:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->linkAccountSessionCancellationBehavior:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;

    if-eq v1, v3, :cond_29

    return v2

    :cond_29
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->modalCustomization:Ljava/util/Map;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->modalCustomization:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2a

    return v2

    :cond_2a
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->paymentMethodType:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->paymentMethodType:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;

    if-eq v1, v3, :cond_2b

    return v2

    :cond_2b
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->stepUpAuthenticationRequired:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->stepUpAuthenticationRequired:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2c

    return v2

    :cond_2c
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->successUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->successUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2d

    return v2

    :cond_2d
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->skipSuccessPane:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->skipSuccessPane:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2e

    return v2

    :cond_2e
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->theme:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;

    iget-object p1, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->theme:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;

    if-eq v1, p1, :cond_2f

    return v2

    :cond_2f
    return v0
.end method

.method public final getAccountDisconnectionMethod()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;
    .locals 1

    .line 108
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountDisconnectionMethod:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;

    return-object v0
.end method

.method public final getAccountholderCustomerEmailAddress()Ljava/lang/String;
    .locals 1

    .line 111
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderCustomerEmailAddress:Ljava/lang/String;

    return-object v0
.end method

.method public final getAccountholderIsLinkConsumer()Ljava/lang/Boolean;
    .locals 1

    .line 114
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderIsLinkConsumer:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getAccountholderPhoneNumber()Ljava/lang/String;
    .locals 1

    .line 117
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderPhoneNumber:Ljava/lang/String;

    return-object v0
.end method

.method public final getAccountholderToken()Ljava/lang/String;
    .locals 1

    .line 120
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderToken:Ljava/lang/String;

    return-object v0
.end method

.method public final getActiveAuthSession()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;
    .locals 1

    .line 123
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->activeAuthSession:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    return-object v0
.end method

.method public final getActiveInstitution()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;
    .locals 1

    .line 126
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->activeInstitution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    return-object v0
.end method

.method public final getAllowManualEntry()Z
    .locals 1

    .line 54
    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->allowManualEntry:Z

    return v0
.end method

.method public final getAppVerificationEnabled()Z
    .locals 1

    .line 78
    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->appVerificationEnabled:Z

    return v0
.end method

.method public final getAssignmentEventId()Ljava/lang/String;
    .locals 1

    .line 129
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->assignmentEventId:Ljava/lang/String;

    return-object v0
.end method

.method public final getBusinessName()Ljava/lang/String;
    .locals 1

    .line 132
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->businessName:Ljava/lang/String;

    return-object v0
.end method

.method public final getCancelUrl()Ljava/lang/String;
    .locals 1

    .line 135
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->cancelUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getConnectPlatformName()Ljava/lang/String;
    .locals 1

    .line 138
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->connectPlatformName:Ljava/lang/String;

    return-object v0
.end method

.method public final getConnectedAccountName()Ljava/lang/String;
    .locals 1

    .line 141
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->connectedAccountName:Ljava/lang/String;

    return-object v0
.end method

.method public final getConsentAcquired()Z
    .locals 1

    .line 194
    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->consentRequired:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->consentAcquiredAt:Ljava/lang/String;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final getConsentAcquiredAt()Ljava/lang/String;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->consentAcquiredAt:Ljava/lang/String;

    return-object v0
.end method

.method public final getConsentRequired()Z
    .locals 1

    .line 57
    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->consentRequired:Z

    return v0
.end method

.method public final getCustomManualEntryHandling()Z
    .locals 1

    .line 63
    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->customManualEntryHandling:Z

    return v0
.end method

.method public final getDisableLinkMoreAccounts()Z
    .locals 1

    .line 66
    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->disableLinkMoreAccounts:Z

    return v0
.end method

.method public final getDisplayText()Lcom/stripe/android/financialconnections/model/TextUpdate;
    .locals 1

    .line 147
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->displayText:Lcom/stripe/android/financialconnections/model/TextUpdate;

    return-object v0
.end method

.method public final getExperimentAssignments()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 144
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->experimentAssignments:Ljava/util/Map;

    return-object v0
.end method

.method public final getFeatures()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 150
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->features:Ljava/util/Map;

    return-object v0
.end method

.method public final getHostedAuthUrl()Ljava/lang/String;
    .locals 1

    .line 153
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->hostedAuthUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getInitialInstitution()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;
    .locals 1

    .line 156
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->initialInstitution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    return-object v0
.end method

.method public final getInstantVerificationDisabled()Z
    .locals 1

    .line 72
    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->instantVerificationDisabled:Z

    return v0
.end method

.method public final getInstitutionSearchDisabled()Z
    .locals 1

    .line 75
    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->institutionSearchDisabled:Z

    return v0
.end method

.method public final getLinkAccountSessionCancellationBehavior()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;
    .locals 1

    .line 171
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->linkAccountSessionCancellationBehavior:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;

    return-object v0
.end method

.method public final getLivemode()Z
    .locals 1

    .line 81
    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->livemode:Z

    return v0
.end method

.method public final getManualEntryMode()Lcom/stripe/android/financialconnections/model/ManualEntryMode;
    .locals 1

    .line 93
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->manualEntryMode:Lcom/stripe/android/financialconnections/model/ManualEntryMode;

    return-object v0
.end method

.method public final getManualEntryUsesMicrodeposits()Z
    .locals 1

    .line 84
    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->manualEntryUsesMicrodeposits:Z

    return v0
.end method

.method public final getMobileHandoffEnabled()Z
    .locals 1

    .line 87
    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->mobileHandoffEnabled:Z

    return v0
.end method

.method public final getModalCustomization()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 174
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->modalCustomization:Ljava/util/Map;

    return-object v0
.end method

.method public final getNextPane()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;
    .locals 1

    .line 90
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->nextPane:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    return-object v0
.end method

.method public final getPaymentMethodType()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;
    .locals 1

    .line 177
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->paymentMethodType:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;

    return-object v0
.end method

.method public final getPermissions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;",
            ">;"
        }
    .end annotation

    .line 96
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->permissions:Ljava/util/List;

    return-object v0
.end method

.method public final getProduct()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;
    .locals 1

    .line 99
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->product:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;

    return-object v0
.end method

.method public final getSingleAccount()Z
    .locals 1

    .line 102
    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->singleAccount:Z

    return v0
.end method

.method public final getSkipSuccessPane()Ljava/lang/Boolean;
    .locals 1

    .line 186
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->skipSuccessPane:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getStepUpAuthenticationRequired()Ljava/lang/Boolean;
    .locals 1

    .line 180
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->stepUpAuthenticationRequired:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getSuccessUrl()Ljava/lang/String;
    .locals 1

    .line 183
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->successUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getTheme()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;
    .locals 1

    .line 189
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->theme:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;

    return-object v0
.end method

.method public final getUseSingleSortSearch()Z
    .locals 1

    .line 105
    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->useSingleSortSearch:Z

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->allowManualEntry:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->consentRequired:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->consentAcquiredAt:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->customManualEntryHandling:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->disableLinkMoreAccounts:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->id:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->instantVerificationDisabled:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->institutionSearchDisabled:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->appVerificationEnabled:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->livemode:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->manualEntryUsesMicrodeposits:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->mobileHandoffEnabled:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->nextPane:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->manualEntryMode:Lcom/stripe/android/financialconnections/model/ManualEntryMode;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/ManualEntryMode;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->permissions:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->product:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->singleAccount:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->useSingleSortSearch:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountDisconnectionMethod:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderCustomerEmailAddress:Ljava/lang/String;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderIsLinkConsumer:Ljava/lang/Boolean;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderPhoneNumber:Ljava/lang/String;

    if-nez v1, :cond_4

    move v1, v2

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderToken:Ljava/lang/String;

    if-nez v1, :cond_5

    move v1, v2

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->activeAuthSession:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    if-nez v1, :cond_6

    move v1, v2

    goto :goto_6

    :cond_6
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->hashCode()I

    move-result v1

    :goto_6
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->activeInstitution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    if-nez v1, :cond_7

    move v1, v2

    goto :goto_7

    :cond_7
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->hashCode()I

    move-result v1

    :goto_7
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->assignmentEventId:Ljava/lang/String;

    if-nez v1, :cond_8

    move v1, v2

    goto :goto_8

    :cond_8
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_8
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->businessName:Ljava/lang/String;

    if-nez v1, :cond_9

    move v1, v2

    goto :goto_9

    :cond_9
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_9
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->cancelUrl:Ljava/lang/String;

    if-nez v1, :cond_a

    move v1, v2

    goto :goto_a

    :cond_a
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_a
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->connectPlatformName:Ljava/lang/String;

    if-nez v1, :cond_b

    move v1, v2

    goto :goto_b

    :cond_b
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_b
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->connectedAccountName:Ljava/lang/String;

    if-nez v1, :cond_c

    move v1, v2

    goto :goto_c

    :cond_c
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_c
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->experimentAssignments:Ljava/util/Map;

    if-nez v1, :cond_d

    move v1, v2

    goto :goto_d

    :cond_d
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_d
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->displayText:Lcom/stripe/android/financialconnections/model/TextUpdate;

    if-nez v1, :cond_e

    move v1, v2

    goto :goto_e

    :cond_e
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/TextUpdate;->hashCode()I

    move-result v1

    :goto_e
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->features:Ljava/util/Map;

    if-nez v1, :cond_f

    move v1, v2

    goto :goto_f

    :cond_f
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_f
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->hostedAuthUrl:Ljava/lang/String;

    if-nez v1, :cond_10

    move v1, v2

    goto :goto_10

    :cond_10
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_10
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->initialInstitution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    if-nez v1, :cond_11

    move v1, v2

    goto :goto_11

    :cond_11
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->hashCode()I

    move-result v1

    :goto_11
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isEndUserFacing:Ljava/lang/Boolean;

    if-nez v1, :cond_12

    move v1, v2

    goto :goto_12

    :cond_12
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_12
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isLinkWithStripe:Ljava/lang/Boolean;

    if-nez v1, :cond_13

    move v1, v2

    goto :goto_13

    :cond_13
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_13
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isNetworkingUserFlow:Ljava/lang/Boolean;

    if-nez v1, :cond_14

    move v1, v2

    goto :goto_14

    :cond_14
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_14
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isStripeDirect:Ljava/lang/Boolean;

    if-nez v1, :cond_15

    move v1, v2

    goto :goto_15

    :cond_15
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_15
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->linkAccountSessionCancellationBehavior:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;

    if-nez v1, :cond_16

    move v1, v2

    goto :goto_16

    :cond_16
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;->hashCode()I

    move-result v1

    :goto_16
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->modalCustomization:Ljava/util/Map;

    if-nez v1, :cond_17

    move v1, v2

    goto :goto_17

    :cond_17
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_17
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->paymentMethodType:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;

    if-nez v1, :cond_18

    move v1, v2

    goto :goto_18

    :cond_18
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;->hashCode()I

    move-result v1

    :goto_18
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->stepUpAuthenticationRequired:Ljava/lang/Boolean;

    if-nez v1, :cond_19

    move v1, v2

    goto :goto_19

    :cond_19
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_19
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->successUrl:Ljava/lang/String;

    if-nez v1, :cond_1a

    move v1, v2

    goto :goto_1a

    :cond_1a
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1a
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->skipSuccessPane:Ljava/lang/Boolean;

    if-nez v1, :cond_1b

    move v1, v2

    goto :goto_1b

    :cond_1b
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1b
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->theme:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;

    if-nez v1, :cond_1c

    goto :goto_1c

    :cond_1c
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;->hashCode()I

    move-result v2

    :goto_1c
    add-int/2addr v0, v2

    return v0
.end method

.method public final isEndUserFacing()Ljava/lang/Boolean;
    .locals 1

    .line 159
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isEndUserFacing:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final isLinkWithStripe()Ljava/lang/Boolean;
    .locals 1

    .line 162
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isLinkWithStripe:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final isNetworkingUserFlow()Ljava/lang/Boolean;
    .locals 1

    .line 165
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isNetworkingUserFlow:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final isStripeDirect()Ljava/lang/Boolean;
    .locals 1

    .line 168
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isStripeDirect:Ljava/lang/Boolean;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 48

    move-object/from16 v0, p0

    iget-boolean v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->allowManualEntry:Z

    iget-boolean v2, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->consentRequired:Z

    iget-object v3, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->consentAcquiredAt:Ljava/lang/String;

    iget-boolean v4, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->customManualEntryHandling:Z

    iget-boolean v5, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->disableLinkMoreAccounts:Z

    iget-object v6, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->id:Ljava/lang/String;

    iget-boolean v7, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->instantVerificationDisabled:Z

    iget-boolean v8, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->institutionSearchDisabled:Z

    iget-boolean v9, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->appVerificationEnabled:Z

    iget-boolean v10, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->livemode:Z

    iget-boolean v11, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->manualEntryUsesMicrodeposits:Z

    iget-boolean v12, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->mobileHandoffEnabled:Z

    iget-object v13, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->nextPane:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    iget-object v14, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->manualEntryMode:Lcom/stripe/android/financialconnections/model/ManualEntryMode;

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->permissions:Ljava/util/List;

    move-object/from16 v16, v15

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->product:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;

    move-object/from16 v17, v15

    iget-boolean v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->singleAccount:Z

    move/from16 v18, v15

    iget-boolean v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->useSingleSortSearch:Z

    move/from16 v19, v15

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountDisconnectionMethod:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;

    move-object/from16 v20, v15

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderCustomerEmailAddress:Ljava/lang/String;

    move-object/from16 v21, v15

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderIsLinkConsumer:Ljava/lang/Boolean;

    move-object/from16 v22, v15

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderPhoneNumber:Ljava/lang/String;

    move-object/from16 v23, v15

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderToken:Ljava/lang/String;

    move-object/from16 v24, v15

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->activeAuthSession:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    move-object/from16 v25, v15

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->activeInstitution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    move-object/from16 v26, v15

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->assignmentEventId:Ljava/lang/String;

    move-object/from16 v27, v15

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->businessName:Ljava/lang/String;

    move-object/from16 v28, v15

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->cancelUrl:Ljava/lang/String;

    move-object/from16 v29, v15

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->connectPlatformName:Ljava/lang/String;

    move-object/from16 v30, v15

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->connectedAccountName:Ljava/lang/String;

    move-object/from16 v31, v15

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->experimentAssignments:Ljava/util/Map;

    move-object/from16 v32, v15

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->displayText:Lcom/stripe/android/financialconnections/model/TextUpdate;

    move-object/from16 v33, v15

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->features:Ljava/util/Map;

    move-object/from16 v34, v15

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->hostedAuthUrl:Ljava/lang/String;

    move-object/from16 v35, v15

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->initialInstitution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    move-object/from16 v36, v15

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isEndUserFacing:Ljava/lang/Boolean;

    move-object/from16 v37, v15

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isLinkWithStripe:Ljava/lang/Boolean;

    move-object/from16 v38, v15

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isNetworkingUserFlow:Ljava/lang/Boolean;

    move-object/from16 v39, v15

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isStripeDirect:Ljava/lang/Boolean;

    move-object/from16 v40, v15

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->linkAccountSessionCancellationBehavior:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;

    move-object/from16 v41, v15

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->modalCustomization:Ljava/util/Map;

    move-object/from16 v42, v15

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->paymentMethodType:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;

    move-object/from16 v43, v15

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->stepUpAuthenticationRequired:Ljava/lang/Boolean;

    move-object/from16 v44, v15

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->successUrl:Ljava/lang/String;

    move-object/from16 v45, v15

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->skipSuccessPane:Ljava/lang/Boolean;

    move-object/from16 v46, v15

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->theme:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;

    new-instance v0, Ljava/lang/StringBuilder;

    move-object/from16 v47, v15

    const-string v15, "FinancialConnectionsSessionManifest(allowManualEntry="

    invoke-direct {v0, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", consentRequired="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", consentAcquiredAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", customManualEntryHandling="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", disableLinkMoreAccounts="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", instantVerificationDisabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", institutionSearchDisabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", appVerificationEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", livemode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", manualEntryUsesMicrodeposits="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mobileHandoffEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", nextPane="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", manualEntryMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", permissions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", product="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", singleAccount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", useSingleSortSearch="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", accountDisconnectionMethod="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", accountholderCustomerEmailAddress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", accountholderIsLinkConsumer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", accountholderPhoneNumber="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", accountholderToken="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", activeAuthSession="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v25

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", activeInstitution="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", assignmentEventId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", businessName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", cancelUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", connectPlatformName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v30

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", connectedAccountName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v31

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", experimentAssignments="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v32

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", displayText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v33

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", features="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v34

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", hostedAuthUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v35

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", initialInstitution="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v36

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", isEndUserFacing="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v37

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", isLinkWithStripe="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v38

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", isNetworkingUserFlow="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v39

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", isStripeDirect="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", linkAccountSessionCancellationBehavior="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v41

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", modalCustomization="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v42

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", paymentMethodType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v43

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", stepUpAuthenticationRequired="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v44

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", successUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v45

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", skipSuccessPane="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v46

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", theme="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v47

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
    .locals 5

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->allowManualEntry:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->consentRequired:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->consentAcquiredAt:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->customManualEntryHandling:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->disableLinkMoreAccounts:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->id:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->instantVerificationDisabled:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->institutionSearchDisabled:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->appVerificationEnabled:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->livemode:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->manualEntryUsesMicrodeposits:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->mobileHandoffEnabled:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->nextPane:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->manualEntryMode:Lcom/stripe/android/financialconnections/model/ManualEntryMode;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/ManualEntryMode;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->permissions:Ljava/util/List;

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

    check-cast v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->product:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->singleAccount:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->useSingleSortSearch:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountDisconnectionMethod:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    :goto_1
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderCustomerEmailAddress:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderIsLinkConsumer:Ljava/lang/Boolean;

    if-nez v0, :cond_2

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_2

    :cond_2
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    :goto_2
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderPhoneNumber:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderToken:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->activeAuthSession:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    if-nez v0, :cond_3

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_3

    :cond_3
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_3
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->activeInstitution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    if-nez v0, :cond_4

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_4

    :cond_4
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_4
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->assignmentEventId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->businessName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->cancelUrl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->connectPlatformName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->connectedAccountName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->experimentAssignments:Ljava/util/Map;

    if-nez v0, :cond_5

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_6

    :cond_5
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v3

    invoke-virtual {p1, v3}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {p1, v4}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {p1, v3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    goto :goto_5

    :cond_6
    :goto_6
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->displayText:Lcom/stripe/android/financialconnections/model/TextUpdate;

    if-nez v0, :cond_7

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_7

    :cond_7
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/financialconnections/model/TextUpdate;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_7
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->features:Ljava/util/Map;

    if-nez v0, :cond_8

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_9

    :cond_8
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v3

    invoke-virtual {p1, v3}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {p1, v4}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    invoke-virtual {p1, v3}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_8

    :cond_9
    :goto_9
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->hostedAuthUrl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->initialInstitution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    if-nez v0, :cond_a

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_a

    :cond_a
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_a
    iget-object p2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isEndUserFacing:Ljava/lang/Boolean;

    if-nez p2, :cond_b

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_b

    :cond_b
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    :goto_b
    iget-object p2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isLinkWithStripe:Ljava/lang/Boolean;

    if-nez p2, :cond_c

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_c

    :cond_c
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    :goto_c
    iget-object p2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isNetworkingUserFlow:Ljava/lang/Boolean;

    if-nez p2, :cond_d

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_d

    :cond_d
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    :goto_d
    iget-object p2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isStripeDirect:Ljava/lang/Boolean;

    if-nez p2, :cond_e

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_e

    :cond_e
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    :goto_e
    iget-object p2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->linkAccountSessionCancellationBehavior:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;

    if-nez p2, :cond_f

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_f

    :cond_f
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    :goto_f
    iget-object p2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->modalCustomization:Ljava/util/Map;

    if-nez p2, :cond_10

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_11

    :cond_10
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {p2}, Ljava/util/Map;->size()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_10
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_11

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {p1, v3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_10

    :cond_11
    :goto_11
    iget-object p2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->paymentMethodType:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;

    if-nez p2, :cond_12

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_12

    :cond_12
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    :goto_12
    iget-object p2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->stepUpAuthenticationRequired:Ljava/lang/Boolean;

    if-nez p2, :cond_13

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_13

    :cond_13
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    :goto_13
    iget-object p2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->successUrl:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->skipSuccessPane:Ljava/lang/Boolean;

    if-nez p2, :cond_14

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_14

    :cond_14
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    :goto_14
    iget-object p2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->theme:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;

    if-nez p2, :cond_15

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    return-void

    :cond_15
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
