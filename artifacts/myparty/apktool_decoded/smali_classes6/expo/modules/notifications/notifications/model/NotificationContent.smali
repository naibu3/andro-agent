.class public Lexpo/modules/notifications/notifications/model/NotificationContent;
.super Ljava/lang/Object;
.source "NotificationContent.java"

# interfaces
.implements Landroid/os/Parcelable;
.implements Ljava/io/Serializable;
.implements Lexpo/modules/notifications/notifications/interfaces/INotificationContent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lexpo/modules/notifications/notifications/model/NotificationContent;",
            ">;"
        }
    .end annotation
.end field

.field private static final serialVersionUID:J = 0x584cbe313dee942L


# instance fields
.field private mAutoDismiss:Z

.field private mBadgeCount:Ljava/lang/Number;

.field private mBody:Lorg/json/JSONObject;

.field private mCategoryId:Ljava/lang/String;

.field private mColor:Ljava/lang/Number;

.field private mPriority:Lexpo/modules/notifications/notifications/enums/NotificationPriority;

.field private mShouldPlayDefaultSound:Z

.field private mShouldUseDefaultVibrationPattern:Z

.field private mSound:Landroid/net/Uri;

.field private mSticky:Z

.field private mSubtitle:Ljava/lang/String;

.field private mText:Ljava/lang/String;

.field private mTitle:Ljava/lang/String;

.field private mVibrationPattern:[J


# direct methods
.method static bridge synthetic -$$Nest$fputmAutoDismiss(Lexpo/modules/notifications/notifications/model/NotificationContent;Z)V
    .locals 0

    iput-boolean p1, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mAutoDismiss:Z

    return-void
.end method

.method static bridge synthetic -$$Nest$fputmBadgeCount(Lexpo/modules/notifications/notifications/model/NotificationContent;Ljava/lang/Number;)V
    .locals 0

    iput-object p1, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mBadgeCount:Ljava/lang/Number;

    return-void
.end method

.method static bridge synthetic -$$Nest$fputmBody(Lexpo/modules/notifications/notifications/model/NotificationContent;Lorg/json/JSONObject;)V
    .locals 0

    iput-object p1, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mBody:Lorg/json/JSONObject;

    return-void
.end method

.method static bridge synthetic -$$Nest$fputmCategoryId(Lexpo/modules/notifications/notifications/model/NotificationContent;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mCategoryId:Ljava/lang/String;

    return-void
.end method

.method static bridge synthetic -$$Nest$fputmColor(Lexpo/modules/notifications/notifications/model/NotificationContent;Ljava/lang/Number;)V
    .locals 0

    iput-object p1, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mColor:Ljava/lang/Number;

    return-void
.end method

.method static bridge synthetic -$$Nest$fputmPriority(Lexpo/modules/notifications/notifications/model/NotificationContent;Lexpo/modules/notifications/notifications/enums/NotificationPriority;)V
    .locals 0

    iput-object p1, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mPriority:Lexpo/modules/notifications/notifications/enums/NotificationPriority;

    return-void
.end method

.method static bridge synthetic -$$Nest$fputmShouldPlayDefaultSound(Lexpo/modules/notifications/notifications/model/NotificationContent;Z)V
    .locals 0

    iput-boolean p1, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mShouldPlayDefaultSound:Z

    return-void
.end method

.method static bridge synthetic -$$Nest$fputmShouldUseDefaultVibrationPattern(Lexpo/modules/notifications/notifications/model/NotificationContent;Z)V
    .locals 0

    iput-boolean p1, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mShouldUseDefaultVibrationPattern:Z

    return-void
.end method

.method static bridge synthetic -$$Nest$fputmSound(Lexpo/modules/notifications/notifications/model/NotificationContent;Landroid/net/Uri;)V
    .locals 0

    iput-object p1, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mSound:Landroid/net/Uri;

    return-void
.end method

.method static bridge synthetic -$$Nest$fputmSticky(Lexpo/modules/notifications/notifications/model/NotificationContent;Z)V
    .locals 0

    iput-boolean p1, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mSticky:Z

    return-void
.end method

.method static bridge synthetic -$$Nest$fputmSubtitle(Lexpo/modules/notifications/notifications/model/NotificationContent;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mSubtitle:Ljava/lang/String;

    return-void
.end method

.method static bridge synthetic -$$Nest$fputmText(Lexpo/modules/notifications/notifications/model/NotificationContent;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mText:Ljava/lang/String;

    return-void
.end method

.method static bridge synthetic -$$Nest$fputmTitle(Lexpo/modules/notifications/notifications/model/NotificationContent;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mTitle:Ljava/lang/String;

    return-void
.end method

.method static bridge synthetic -$$Nest$fputmVibrationPattern(Lexpo/modules/notifications/notifications/model/NotificationContent;[J)V
    .locals 0

    iput-object p1, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mVibrationPattern:[J

    return-void
.end method

.method static constructor <clinit>()V
    .locals 1

    .line 56
    new-instance v0, Lexpo/modules/notifications/notifications/model/NotificationContent$1;

    invoke-direct {v0}, Lexpo/modules/notifications/notifications/model/NotificationContent$1;-><init>()V

    sput-object v0, Lexpo/modules/notifications/notifications/model/NotificationContent;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method protected constructor <init>()V
    .locals 0

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 4

    .line 160
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 161
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mTitle:Ljava/lang/String;

    .line 162
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mText:Ljava/lang/String;

    .line 163
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mSubtitle:Ljava/lang/String;

    .line 164
    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    iput-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mBadgeCount:Ljava/lang/Number;

    .line 165
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    iput-boolean v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mShouldPlayDefaultSound:Z

    .line 166
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/net/Uri;

    iput-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mSound:Landroid/net/Uri;

    .line 167
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    iput-boolean v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mShouldUseDefaultVibrationPattern:Z

    .line 168
    invoke-virtual {p1}, Landroid/os/Parcel;->createLongArray()[J

    move-result-object v0

    iput-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mVibrationPattern:[J

    .line 170
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mBody:Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 174
    :catch_0
    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    if-eqz v0, :cond_2

    .line 176
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-static {v0}, Lexpo/modules/notifications/notifications/enums/NotificationPriority;->fromNativeValue(I)Lexpo/modules/notifications/notifications/enums/NotificationPriority;

    move-result-object v0

    iput-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mPriority:Lexpo/modules/notifications/notifications/enums/NotificationPriority;

    .line 178
    :cond_2
    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    iput-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mColor:Ljava/lang/Number;

    .line 179
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-ne v0, v2, :cond_3

    move v0, v2

    goto :goto_2

    :cond_3
    move v0, v1

    :goto_2
    iput-boolean v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mAutoDismiss:Z

    .line 180
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mCategoryId:Ljava/lang/String;

    .line 181
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result p1

    if-ne p1, v2, :cond_4

    move v1, v2

    :cond_4
    iput-boolean v1, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mSticky:Z

    return-void
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/ClassNotFoundException;
        }
    .end annotation

    .line 230
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mTitle:Ljava/lang/String;

    .line 231
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mText:Ljava/lang/String;

    .line 232
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mSubtitle:Ljava/lang/String;

    .line 233
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    iput-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mBadgeCount:Ljava/lang/Number;

    .line 234
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readByte()B

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    iput-boolean v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mShouldPlayDefaultSound:Z

    .line 235
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v0, :cond_1

    .line 237
    iput-object v3, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mSound:Landroid/net/Uri;

    goto :goto_1

    .line 239
    :cond_1
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mSound:Landroid/net/Uri;

    .line 241
    :goto_1
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readByte()B

    move-result v0

    if-ne v0, v2, :cond_2

    move v0, v2

    goto :goto_2

    :cond_2
    move v0, v1

    :goto_2
    iput-boolean v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mShouldUseDefaultVibrationPattern:Z

    .line 242
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v0

    if-gez v0, :cond_3

    .line 244
    iput-object v3, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mVibrationPattern:[J

    goto :goto_4

    .line 246
    :cond_3
    new-array v4, v0, [J

    iput-object v4, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mVibrationPattern:[J

    move v4, v1

    :goto_3
    if-ge v4, v0, :cond_4

    .line 248
    iget-object v5, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mVibrationPattern:[J

    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readLong()J

    move-result-wide v6

    aput-wide v6, v5, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    .line 251
    :cond_4
    :goto_4
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_5

    .line 253
    iput-object v3, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mBody:Lorg/json/JSONObject;

    goto :goto_5

    .line 256
    :cond_5
    :try_start_0
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    iput-object v4, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mBody:Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 261
    :catch_0
    :goto_5
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    if-eqz v0, :cond_6

    .line 263
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-static {v0}, Lexpo/modules/notifications/notifications/enums/NotificationPriority;->fromNativeValue(I)Lexpo/modules/notifications/notifications/enums/NotificationPriority;

    move-result-object v0

    iput-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mPriority:Lexpo/modules/notifications/notifications/enums/NotificationPriority;

    .line 265
    :cond_6
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    iput-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mColor:Ljava/lang/Number;

    .line 266
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readByte()B

    move-result v0

    if-ne v0, v2, :cond_7

    move v0, v2

    goto :goto_6

    :cond_7
    move v0, v1

    :goto_6
    iput-boolean v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mAutoDismiss:Z

    .line 267
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_8

    .line 269
    iput-object v3, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mCategoryId:Ljava/lang/String;

    goto :goto_7

    .line 271
    :cond_8
    new-instance v3, Ljava/lang/String;

    invoke-direct {v3, v0}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    iput-object v3, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mCategoryId:Ljava/lang/String;

    .line 273
    :goto_7
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readByte()B

    move-result p1

    if-ne p1, v2, :cond_9

    move v1, v2

    :cond_9
    iput-boolean v1, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mSticky:Z

    return-void
.end method

.method private readObjectNoData()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/ObjectStreamException;
        }
    .end annotation

    return-void
.end method

.method private writeObject(Ljava/io/ObjectOutputStream;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 206
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mTitle:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    .line 207
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mText:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    .line 208
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mSubtitle:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    .line 209
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mBadgeCount:Ljava/lang/Number;

    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    .line 210
    iget-boolean v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mShouldPlayDefaultSound:Z

    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeByte(I)V

    .line 211
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mSound:Landroid/net/Uri;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    .line 212
    iget-boolean v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mShouldUseDefaultVibrationPattern:Z

    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeByte(I)V

    .line 213
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mVibrationPattern:[J

    if-nez v0, :cond_1

    const/4 v0, -0x1

    .line 214
    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeInt(I)V

    goto :goto_2

    .line 216
    :cond_1
    array-length v0, v0

    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeInt(I)V

    .line 217
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mVibrationPattern:[J

    array-length v2, v0

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v2, :cond_2

    aget-wide v4, v0, v3

    .line 218
    invoke-virtual {p1, v4, v5}, Ljava/io/ObjectOutputStream;->writeLong(J)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 221
    :cond_2
    :goto_2
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mBody:Lorg/json/JSONObject;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    :cond_3
    move-object v0, v1

    :goto_3
    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    .line 222
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mPriority:Lexpo/modules/notifications/notifications/enums/NotificationPriority;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lexpo/modules/notifications/notifications/enums/NotificationPriority;->getNativeValue()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_4

    :cond_4
    move-object v0, v1

    :goto_4
    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    .line 223
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mColor:Ljava/lang/Number;

    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    .line 224
    iget-boolean v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mAutoDismiss:Z

    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeByte(I)V

    .line 225
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mCategoryId:Ljava/lang/String;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_5
    invoke-virtual {p1, v1}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    .line 226
    iget-boolean v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mSticky:Z

    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeByte(I)V

    return-void
.end method


# virtual methods
.method public containsImage()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getBadgeCount()Ljava/lang/Number;
    .locals 1

    .line 85
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mBadgeCount:Ljava/lang/Number;

    return-object v0
.end method

.method public getBody()Lorg/json/JSONObject;
    .locals 1

    .line 130
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mBody:Lorg/json/JSONObject;

    return-object v0
.end method

.method public getCategoryId()Ljava/lang/String;
    .locals 1

    .line 148
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mCategoryId:Ljava/lang/String;

    return-object v0
.end method

.method public getColor()Ljava/lang/Number;
    .locals 1

    .line 140
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mColor:Ljava/lang/Number;

    return-object v0
.end method

.method public getImage(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Landroid/graphics/Bitmap;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 107
    const-string p2, "expo.modules.notifications.large_notification_icon"

    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x80

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    .line 108
    iget-object v1, v0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    invoke-virtual {v1, p2}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 109
    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    invoke-virtual {v0, p2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result p2

    .line 110
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-static {p1, p2}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object p1
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    .line 113
    :goto_0
    const-string p2, "expo-notifications"

    const-string v0, "Could not have fetched large notification icon."

    invoke-static {p2, v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public getPriority()Lexpo/modules/notifications/notifications/enums/NotificationPriority;
    .locals 1

    .line 135
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mPriority:Lexpo/modules/notifications/notifications/enums/NotificationPriority;

    return-object v0
.end method

.method public getShouldPlayDefaultSound()Z
    .locals 1

    .line 90
    iget-boolean v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mShouldPlayDefaultSound:Z

    return v0
.end method

.method public getShouldUseDefaultVibrationPattern()Z
    .locals 1

    .line 95
    iget-boolean v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mShouldUseDefaultVibrationPattern:Z

    return v0
.end method

.method public getSoundName()Ljava/lang/String;
    .locals 1

    .line 100
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mSound:Landroid/net/Uri;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getSubText()Ljava/lang/String;
    .locals 1

    .line 80
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mSubtitle:Ljava/lang/String;

    return-object v0
.end method

.method public getText()Ljava/lang/String;
    .locals 1

    .line 75
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mText:Ljava/lang/String;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .line 70
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mTitle:Ljava/lang/String;

    return-object v0
.end method

.method public getVibrationPattern()[J
    .locals 1

    .line 125
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mVibrationPattern:[J

    return-object v0
.end method

.method public isAutoDismiss()Z
    .locals 1

    .line 144
    iget-boolean v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mAutoDismiss:Z

    return v0
.end method

.method public isSticky()Z
    .locals 1

    .line 152
    iget-boolean v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mSticky:Z

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 186
    iget-object p2, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mTitle:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 187
    iget-object p2, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mText:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 188
    iget-object p2, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mSubtitle:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 189
    iget-object p2, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mBadgeCount:Ljava/lang/Number;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 190
    iget-boolean p2, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mShouldPlayDefaultSound:Z

    int-to-byte p2, p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 191
    iget-object p2, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mSound:Landroid/net/Uri;

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 192
    iget-boolean p2, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mShouldUseDefaultVibrationPattern:Z

    int-to-byte p2, p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 193
    iget-object p2, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mVibrationPattern:[J

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeLongArray([J)V

    .line 194
    iget-object p2, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mBody:Lorg/json/JSONObject;

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_0
    move-object p2, v0

    :goto_0
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 195
    iget-object p2, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mPriority:Lexpo/modules/notifications/notifications/enums/NotificationPriority;

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Lexpo/modules/notifications/notifications/enums/NotificationPriority;->getNativeValue()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :cond_1
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 196
    iget-object p2, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mColor:Ljava/lang/Number;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 197
    iget-boolean p2, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mAutoDismiss:Z

    int-to-byte p2, p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 198
    iget-object p2, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mCategoryId:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 199
    iget-boolean p2, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mSticky:Z

    int-to-byte p2, p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    return-void
.end method
