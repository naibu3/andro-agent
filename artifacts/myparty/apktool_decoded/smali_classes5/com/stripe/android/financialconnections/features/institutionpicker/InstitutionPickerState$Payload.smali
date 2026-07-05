.class public final Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;
.super Ljava/lang/Object;
.source "InstitutionPickerViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Payload"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u000f\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0013\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00052\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;",
        "",
        "featuredInstitutions",
        "Lcom/stripe/android/financialconnections/model/InstitutionResponse;",
        "searchDisabled",
        "",
        "featuredInstitutionsDuration",
        "",
        "<init>",
        "(Lcom/stripe/android/financialconnections/model/InstitutionResponse;ZJ)V",
        "getFeaturedInstitutions",
        "()Lcom/stripe/android/financialconnections/model/InstitutionResponse;",
        "getSearchDisabled",
        "()Z",
        "getFeaturedInstitutionsDuration",
        "()J",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
        "",
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
.field public static final $stable:I = 0x8


# instance fields
.field private final featuredInstitutions:Lcom/stripe/android/financialconnections/model/InstitutionResponse;

.field private final featuredInstitutionsDuration:J

.field private final searchDisabled:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/model/InstitutionResponse;ZJ)V
    .locals 1

    const-string v0, "featuredInstitutions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 312
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 313
    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;->featuredInstitutions:Lcom/stripe/android/financialconnections/model/InstitutionResponse;

    .line 314
    iput-boolean p2, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;->searchDisabled:Z

    .line 315
    iput-wide p3, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;->featuredInstitutionsDuration:J

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;Lcom/stripe/android/financialconnections/model/InstitutionResponse;ZJILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;->featuredInstitutions:Lcom/stripe/android/financialconnections/model/InstitutionResponse;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-boolean p2, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;->searchDisabled:Z

    :cond_1
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_2

    iget-wide p3, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;->featuredInstitutionsDuration:J

    :cond_2
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;->copy(Lcom/stripe/android/financialconnections/model/InstitutionResponse;ZJ)Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/financialconnections/model/InstitutionResponse;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;->featuredInstitutions:Lcom/stripe/android/financialconnections/model/InstitutionResponse;

    return-object v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;->searchDisabled:Z

    return v0
.end method

.method public final component3()J
    .locals 2

    iget-wide v0, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;->featuredInstitutionsDuration:J

    return-wide v0
.end method

.method public final copy(Lcom/stripe/android/financialconnections/model/InstitutionResponse;ZJ)Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;
    .locals 1

    const-string v0, "featuredInstitutions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;-><init>(Lcom/stripe/android/financialconnections/model/InstitutionResponse;ZJ)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;->featuredInstitutions:Lcom/stripe/android/financialconnections/model/InstitutionResponse;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;->featuredInstitutions:Lcom/stripe/android/financialconnections/model/InstitutionResponse;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;->searchDisabled:Z

    iget-boolean v3, p1, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;->searchDisabled:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;->featuredInstitutionsDuration:J

    iget-wide v5, p1, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;->featuredInstitutionsDuration:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getFeaturedInstitutions()Lcom/stripe/android/financialconnections/model/InstitutionResponse;
    .locals 1

    .line 313
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;->featuredInstitutions:Lcom/stripe/android/financialconnections/model/InstitutionResponse;

    return-object v0
.end method

.method public final getFeaturedInstitutionsDuration()J
    .locals 2

    .line 315
    iget-wide v0, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;->featuredInstitutionsDuration:J

    return-wide v0
.end method

.method public final getSearchDisabled()Z
    .locals 1

    .line 314
    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;->searchDisabled:Z

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;->featuredInstitutions:Lcom/stripe/android/financialconnections/model/InstitutionResponse;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/InstitutionResponse;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;->searchDisabled:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;->featuredInstitutionsDuration:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;->featuredInstitutions:Lcom/stripe/android/financialconnections/model/InstitutionResponse;

    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;->searchDisabled:Z

    iget-wide v2, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;->featuredInstitutionsDuration:J

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Payload(featuredInstitutions="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, ", searchDisabled="

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", featuredInstitutionsDuration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
