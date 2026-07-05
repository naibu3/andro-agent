.class public Lexpo/modules/notifications/notifications/model/NotificationRequest;
.super Ljava/lang/Object;
.source "NotificationRequest.java"

# interfaces
.implements Landroid/os/Parcelable;
.implements Ljava/io/Serializable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lexpo/modules/notifications/notifications/model/NotificationRequest;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private mContent:Lexpo/modules/notifications/notifications/interfaces/INotificationContent;

.field private mIdentifier:Ljava/lang/String;

.field private mTrigger:Lexpo/modules/notifications/notifications/interfaces/NotificationTrigger;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 44
    new-instance v0, Lexpo/modules/notifications/notifications/model/NotificationRequest$1;

    invoke-direct {v0}, Lexpo/modules/notifications/notifications/model/NotificationRequest$1;-><init>()V

    sput-object v0, Lexpo/modules/notifications/notifications/model/NotificationRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationRequest;->mIdentifier:Ljava/lang/String;

    .line 40
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lexpo/modules/notifications/notifications/interfaces/INotificationContent;

    iput-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationRequest;->mContent:Lexpo/modules/notifications/notifications/interfaces/INotificationContent;

    .line 41
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lexpo/modules/notifications/notifications/interfaces/NotificationTrigger;

    iput-object p1, p0, Lexpo/modules/notifications/notifications/model/NotificationRequest;->mTrigger:Lexpo/modules/notifications/notifications/interfaces/NotificationTrigger;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lexpo/modules/notifications/notifications/interfaces/INotificationContent;Lexpo/modules/notifications/notifications/interfaces/NotificationTrigger;)V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lexpo/modules/notifications/notifications/model/NotificationRequest;->mIdentifier:Ljava/lang/String;

    .line 22
    iput-object p2, p0, Lexpo/modules/notifications/notifications/model/NotificationRequest;->mContent:Lexpo/modules/notifications/notifications/interfaces/INotificationContent;

    .line 23
    iput-object p3, p0, Lexpo/modules/notifications/notifications/model/NotificationRequest;->mTrigger:Lexpo/modules/notifications/notifications/interfaces/NotificationTrigger;

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getContent()Lexpo/modules/notifications/notifications/interfaces/INotificationContent;
    .locals 1

    .line 27
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationRequest;->mContent:Lexpo/modules/notifications/notifications/interfaces/INotificationContent;

    return-object v0
.end method

.method public getIdentifier()Ljava/lang/String;
    .locals 1

    .line 31
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationRequest;->mIdentifier:Ljava/lang/String;

    return-object v0
.end method

.method public getTrigger()Lexpo/modules/notifications/notifications/interfaces/NotificationTrigger;
    .locals 1

    .line 35
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationRequest;->mTrigger:Lexpo/modules/notifications/notifications/interfaces/NotificationTrigger;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 63
    iget-object p2, p0, Lexpo/modules/notifications/notifications/model/NotificationRequest;->mIdentifier:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 64
    iget-object p2, p0, Lexpo/modules/notifications/notifications/model/NotificationRequest;->mContent:Lexpo/modules/notifications/notifications/interfaces/INotificationContent;

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 65
    iget-object p2, p0, Lexpo/modules/notifications/notifications/model/NotificationRequest;->mTrigger:Lexpo/modules/notifications/notifications/interfaces/NotificationTrigger;

    invoke-virtual {p1, p2, v0}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method
