.class public final Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$Legal;
.super Ljava/lang/Object;
.source "NoticeSheetViewModel.kt"

# interfaces
.implements Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Legal"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\t\u0010\u0008\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\u000c\u001a\u00020\r2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u000bH\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$Legal;",
        "Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;",
        "legalDetails",
        "Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;",
        "<init>",
        "(Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;)V",
        "getLegalDetails",
        "()Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;",
        "component1",
        "copy",
        "describeContents",
        "",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "toString",
        "",
        "writeToParcel",
        "",
        "dest",
        "Landroid/os/Parcel;",
        "flags",
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


# static fields
.field public static final $stable:I

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$Legal;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final legalDetails:Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$Legal$Creator;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$Legal$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$Legal;->CREATOR:Landroid/os/Parcelable$Creator;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$Legal;->$stable:I

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;)V
    .locals 1

    const-string v0, "legalDetails"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 130
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 131
    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$Legal;->legalDetails:Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$Legal;Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$Legal;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$Legal;->legalDetails:Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$Legal;->copy(Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;)Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$Legal;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$Legal;->legalDetails:Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;)Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$Legal;
    .locals 1

    const-string v0, "legalDetails"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$Legal;

    invoke-direct {v0, p1}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$Legal;-><init>(Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;)V

    return-object v0
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$Legal;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$Legal;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$Legal;->legalDetails:Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;

    iget-object p1, p1, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$Legal;->legalDetails:Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getLegalDetails()Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;
    .locals 1

    .line 131
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$Legal;->legalDetails:Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$Legal;->legalDetails:Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$Legal;->legalDetails:Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Legal(legalDetails="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$Legal;->legalDetails:Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method
