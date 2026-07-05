.class public final Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$Payload;
.super Ljava/lang/Object;
.source "SharedPartnerAuthState.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Payload"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0012\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0002\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$Payload;",
        "",
        "isStripeDirect",
        "",
        "institution",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;",
        "authSession",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;",
        "<init>",
        "(ZLcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;)V",
        "()Z",
        "getInstitution",
        "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;",
        "getAuthSession",
        "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;",
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
.field private final authSession:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

.field private final institution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

.field private final isStripeDirect:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(ZLcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;)V
    .locals 1

    const-string v0, "institution"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "authSession"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-boolean p1, p0, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$Payload;->isStripeDirect:Z

    .line 30
    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$Payload;->institution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    .line 31
    iput-object p3, p0, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$Payload;->authSession:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$Payload;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$Payload;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-boolean p1, p0, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$Payload;->isStripeDirect:Z

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$Payload;->institution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$Payload;->authSession:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$Payload;->copy(ZLcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;)Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$Payload;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$Payload;->isStripeDirect:Z

    return v0
.end method

.method public final component2()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$Payload;->institution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    return-object v0
.end method

.method public final component3()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$Payload;->authSession:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    return-object v0
.end method

.method public final copy(ZLcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;)Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$Payload;
    .locals 1

    const-string v0, "institution"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "authSession"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$Payload;

    invoke-direct {v0, p1, p2, p3}, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$Payload;-><init>(ZLcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$Payload;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$Payload;

    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$Payload;->isStripeDirect:Z

    iget-boolean v3, p1, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$Payload;->isStripeDirect:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$Payload;->institution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$Payload;->institution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$Payload;->authSession:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    iget-object p1, p1, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$Payload;->authSession:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getAuthSession()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$Payload;->authSession:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    return-object v0
.end method

.method public final getInstitution()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$Payload;->institution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$Payload;->isStripeDirect:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$Payload;->institution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$Payload;->authSession:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final isStripeDirect()Z
    .locals 1

    .line 29
    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$Payload;->isStripeDirect:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$Payload;->isStripeDirect:Z

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$Payload;->institution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$Payload;->authSession:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Payload(isStripeDirect="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ", institution="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", authSession="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
