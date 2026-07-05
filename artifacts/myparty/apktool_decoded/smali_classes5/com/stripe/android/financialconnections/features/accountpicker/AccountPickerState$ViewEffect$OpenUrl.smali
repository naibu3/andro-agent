.class public final Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$ViewEffect$OpenUrl;
.super Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$ViewEffect;
.source "AccountPickerViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$ViewEffect;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "OpenUrl"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0008\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\t\u0010\u000c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$ViewEffect$OpenUrl;",
        "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$ViewEffect;",
        "url",
        "",
        "id",
        "",
        "<init>",
        "(Ljava/lang/String;J)V",
        "getUrl",
        "()Ljava/lang/String;",
        "getId",
        "()J",
        "component1",
        "component2",
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "",
        "toString",
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


# instance fields
.field private final id:J

.field private final url:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;J)V
    .locals 1

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 451
    invoke-direct {p0, v0}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$ViewEffect;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 449
    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$ViewEffect$OpenUrl;->url:Ljava/lang/String;

    .line 450
    iput-wide p2, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$ViewEffect$OpenUrl;->id:J

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$ViewEffect$OpenUrl;Ljava/lang/String;JILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$ViewEffect$OpenUrl;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$ViewEffect$OpenUrl;->url:Ljava/lang/String;

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    iget-wide p2, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$ViewEffect$OpenUrl;->id:J

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$ViewEffect$OpenUrl;->copy(Ljava/lang/String;J)Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$ViewEffect$OpenUrl;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$ViewEffect$OpenUrl;->url:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()J
    .locals 2

    iget-wide v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$ViewEffect$OpenUrl;->id:J

    return-wide v0
.end method

.method public final copy(Ljava/lang/String;J)Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$ViewEffect$OpenUrl;
    .locals 1

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$ViewEffect$OpenUrl;

    invoke-direct {v0, p1, p2, p3}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$ViewEffect$OpenUrl;-><init>(Ljava/lang/String;J)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$ViewEffect$OpenUrl;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$ViewEffect$OpenUrl;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$ViewEffect$OpenUrl;->url:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$ViewEffect$OpenUrl;->url:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$ViewEffect$OpenUrl;->id:J

    iget-wide v5, p1, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$ViewEffect$OpenUrl;->id:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getId()J
    .locals 2

    .line 450
    iget-wide v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$ViewEffect$OpenUrl;->id:J

    return-wide v0
.end method

.method public final getUrl()Ljava/lang/String;
    .locals 1

    .line 449
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$ViewEffect$OpenUrl;->url:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$ViewEffect$OpenUrl;->url:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$ViewEffect$OpenUrl;->id:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$ViewEffect$OpenUrl;->url:Ljava/lang/String;

    iget-wide v1, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$ViewEffect$OpenUrl;->id:J

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "OpenUrl(url="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ", id="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
