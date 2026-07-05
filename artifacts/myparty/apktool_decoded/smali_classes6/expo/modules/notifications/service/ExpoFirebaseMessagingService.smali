.class public Lexpo/modules/notifications/service/ExpoFirebaseMessagingService;
.super Lcom/google/firebase/messaging/FirebaseMessagingService;
.source "ExpoFirebaseMessagingService.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0016\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0008\u0010\u0011\u001a\u00020\u000bH\u0016R\u001b\u0010\u0004\u001a\u00020\u00058TX\u0094\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0012"
    }
    d2 = {
        "Lexpo/modules/notifications/service/ExpoFirebaseMessagingService;",
        "Lcom/google/firebase/messaging/FirebaseMessagingService;",
        "<init>",
        "()V",
        "firebaseMessagingDelegate",
        "Lexpo/modules/notifications/service/interfaces/FirebaseMessagingDelegate;",
        "getFirebaseMessagingDelegate",
        "()Lexpo/modules/notifications/service/interfaces/FirebaseMessagingDelegate;",
        "firebaseMessagingDelegate$delegate",
        "Lkotlin/Lazy;",
        "onMessageReceived",
        "",
        "remoteMessage",
        "Lcom/google/firebase/messaging/RemoteMessage;",
        "onNewToken",
        "token",
        "",
        "onDeletedMessages",
        "expo-notifications_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final firebaseMessagingDelegate$delegate:Lkotlin/Lazy;


# direct methods
.method public static synthetic $r8$lambda$SyaFC80gG7xnDVGn8BQiQZwnatE(Lexpo/modules/notifications/service/ExpoFirebaseMessagingService;)Lexpo/modules/notifications/service/delegates/FirebaseMessagingDelegate;
    .locals 0

    invoke-static {p0}, Lexpo/modules/notifications/service/ExpoFirebaseMessagingService;->firebaseMessagingDelegate_delegate$lambda$0(Lexpo/modules/notifications/service/ExpoFirebaseMessagingService;)Lexpo/modules/notifications/service/delegates/FirebaseMessagingDelegate;

    move-result-object p0

    return-object p0
.end method

.method public constructor <init>()V
    .locals 1

    .line 7
    invoke-direct {p0}, Lcom/google/firebase/messaging/FirebaseMessagingService;-><init>()V

    .line 8
    new-instance v0, Lexpo/modules/notifications/service/ExpoFirebaseMessagingService$$ExternalSyntheticLambda0;

    invoke-direct {v0, p0}, Lexpo/modules/notifications/service/ExpoFirebaseMessagingService$$ExternalSyntheticLambda0;-><init>(Lexpo/modules/notifications/service/ExpoFirebaseMessagingService;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lexpo/modules/notifications/service/ExpoFirebaseMessagingService;->firebaseMessagingDelegate$delegate:Lkotlin/Lazy;

    return-void
.end method

.method private static final firebaseMessagingDelegate_delegate$lambda$0(Lexpo/modules/notifications/service/ExpoFirebaseMessagingService;)Lexpo/modules/notifications/service/delegates/FirebaseMessagingDelegate;
    .locals 1

    .line 9
    new-instance v0, Lexpo/modules/notifications/service/delegates/FirebaseMessagingDelegate;

    check-cast p0, Landroid/content/Context;

    invoke-direct {v0, p0}, Lexpo/modules/notifications/service/delegates/FirebaseMessagingDelegate;-><init>(Landroid/content/Context;)V

    return-object v0
.end method


# virtual methods
.method protected getFirebaseMessagingDelegate()Lexpo/modules/notifications/service/interfaces/FirebaseMessagingDelegate;
    .locals 1

    .line 8
    iget-object v0, p0, Lexpo/modules/notifications/service/ExpoFirebaseMessagingService;->firebaseMessagingDelegate$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lexpo/modules/notifications/service/interfaces/FirebaseMessagingDelegate;

    return-object v0
.end method

.method public onDeletedMessages()V
    .locals 1

    .line 14
    invoke-virtual {p0}, Lexpo/modules/notifications/service/ExpoFirebaseMessagingService;->getFirebaseMessagingDelegate()Lexpo/modules/notifications/service/interfaces/FirebaseMessagingDelegate;

    move-result-object v0

    invoke-interface {v0}, Lexpo/modules/notifications/service/interfaces/FirebaseMessagingDelegate;->onDeletedMessages()V

    return-void
.end method

.method public onMessageReceived(Lcom/google/firebase/messaging/RemoteMessage;)V
    .locals 1

    const-string v0, "remoteMessage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-virtual {p0}, Lexpo/modules/notifications/service/ExpoFirebaseMessagingService;->getFirebaseMessagingDelegate()Lexpo/modules/notifications/service/interfaces/FirebaseMessagingDelegate;

    move-result-object v0

    invoke-interface {v0, p1}, Lexpo/modules/notifications/service/interfaces/FirebaseMessagingDelegate;->onMessageReceived(Lcom/google/firebase/messaging/RemoteMessage;)V

    return-void
.end method

.method public onNewToken(Ljava/lang/String;)V
    .locals 1

    const-string v0, "token"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-virtual {p0}, Lexpo/modules/notifications/service/ExpoFirebaseMessagingService;->getFirebaseMessagingDelegate()Lexpo/modules/notifications/service/interfaces/FirebaseMessagingDelegate;

    move-result-object v0

    invoke-interface {v0, p1}, Lexpo/modules/notifications/service/interfaces/FirebaseMessagingDelegate;->onNewToken(Ljava/lang/String;)V

    return-void
.end method
