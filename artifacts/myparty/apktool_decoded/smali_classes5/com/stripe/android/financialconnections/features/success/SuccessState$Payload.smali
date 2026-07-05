.class public final Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;
.super Ljava/lang/Object;
.source "SuccessViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/features/success/SuccessState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Payload"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0011\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B)\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0008H\u00c6\u0003J3\u0010\u0016\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008H\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00082\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;",
        "",
        "businessName",
        "",
        "title",
        "Lcom/stripe/android/financialconnections/ui/TextResource;",
        "content",
        "skipSuccessPane",
        "",
        "<init>",
        "(Ljava/lang/String;Lcom/stripe/android/financialconnections/ui/TextResource;Lcom/stripe/android/financialconnections/ui/TextResource;Z)V",
        "getBusinessName",
        "()Ljava/lang/String;",
        "getTitle",
        "()Lcom/stripe/android/financialconnections/ui/TextResource;",
        "getContent",
        "getSkipSuccessPane",
        "()Z",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "other",
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
.field private final businessName:Ljava/lang/String;

.field private final content:Lcom/stripe/android/financialconnections/ui/TextResource;

.field private final skipSuccessPane:Z

.field private final title:Lcom/stripe/android/financialconnections/ui/TextResource;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/ui/TextResource;Lcom/stripe/android/financialconnections/ui/TextResource;Z)V
    .locals 1

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "content"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 125
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 126
    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;->businessName:Ljava/lang/String;

    .line 127
    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;->title:Lcom/stripe/android/financialconnections/ui/TextResource;

    .line 128
    iput-object p3, p0, Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;->content:Lcom/stripe/android/financialconnections/ui/TextResource;

    .line 129
    iput-boolean p4, p0, Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;->skipSuccessPane:Z

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;Ljava/lang/String;Lcom/stripe/android/financialconnections/ui/TextResource;Lcom/stripe/android/financialconnections/ui/TextResource;ZILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;->businessName:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;->title:Lcom/stripe/android/financialconnections/ui/TextResource;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;->content:Lcom/stripe/android/financialconnections/ui/TextResource;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-boolean p4, p0, Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;->skipSuccessPane:Z

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;->copy(Ljava/lang/String;Lcom/stripe/android/financialconnections/ui/TextResource;Lcom/stripe/android/financialconnections/ui/TextResource;Z)Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;->businessName:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lcom/stripe/android/financialconnections/ui/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;->title:Lcom/stripe/android/financialconnections/ui/TextResource;

    return-object v0
.end method

.method public final component3()Lcom/stripe/android/financialconnections/ui/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;->content:Lcom/stripe/android/financialconnections/ui/TextResource;

    return-object v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;->skipSuccessPane:Z

    return v0
.end method

.method public final copy(Ljava/lang/String;Lcom/stripe/android/financialconnections/ui/TextResource;Lcom/stripe/android/financialconnections/ui/TextResource;Z)Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;
    .locals 1

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "content"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/ui/TextResource;Lcom/stripe/android/financialconnections/ui/TextResource;Z)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;->businessName:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;->businessName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;->title:Lcom/stripe/android/financialconnections/ui/TextResource;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;->title:Lcom/stripe/android/financialconnections/ui/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;->content:Lcom/stripe/android/financialconnections/ui/TextResource;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;->content:Lcom/stripe/android/financialconnections/ui/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;->skipSuccessPane:Z

    iget-boolean p1, p1, Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;->skipSuccessPane:Z

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getBusinessName()Ljava/lang/String;
    .locals 1

    .line 126
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;->businessName:Ljava/lang/String;

    return-object v0
.end method

.method public final getContent()Lcom/stripe/android/financialconnections/ui/TextResource;
    .locals 1

    .line 128
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;->content:Lcom/stripe/android/financialconnections/ui/TextResource;

    return-object v0
.end method

.method public final getSkipSuccessPane()Z
    .locals 1

    .line 129
    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;->skipSuccessPane:Z

    return v0
.end method

.method public final getTitle()Lcom/stripe/android/financialconnections/ui/TextResource;
    .locals 1

    .line 127
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;->title:Lcom/stripe/android/financialconnections/ui/TextResource;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;->businessName:Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;->title:Lcom/stripe/android/financialconnections/ui/TextResource;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;->content:Lcom/stripe/android/financialconnections/ui/TextResource;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;->skipSuccessPane:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;->businessName:Ljava/lang/String;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;->title:Lcom/stripe/android/financialconnections/ui/TextResource;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;->content:Lcom/stripe/android/financialconnections/ui/TextResource;

    iget-boolean v3, p0, Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;->skipSuccessPane:Z

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Payload(businessName="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, ", title="

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", content="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", skipSuccessPane="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
