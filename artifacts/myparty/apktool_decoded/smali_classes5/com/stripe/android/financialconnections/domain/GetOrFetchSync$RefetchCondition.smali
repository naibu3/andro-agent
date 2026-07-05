.class public interface abstract Lcom/stripe/android/financialconnections/domain/GetOrFetchSync$RefetchCondition;
.super Ljava/lang/Object;
.source "GetOrFetchSync.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "RefetchCondition"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/domain/GetOrFetchSync$RefetchCondition$Always;,
        Lcom/stripe/android/financialconnections/domain/GetOrFetchSync$RefetchCondition$IfMissingActiveAuthSession;,
        Lcom/stripe/android/financialconnections/domain/GetOrFetchSync$RefetchCondition$None;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008v\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\u0008J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u0082\u0001\u0003\t\n\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/domain/GetOrFetchSync$RefetchCondition;",
        "",
        "shouldReFetch",
        "",
        "response",
        "Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;",
        "None",
        "Always",
        "IfMissingActiveAuthSession",
        "Lcom/stripe/android/financialconnections/domain/GetOrFetchSync$RefetchCondition$Always;",
        "Lcom/stripe/android/financialconnections/domain/GetOrFetchSync$RefetchCondition$IfMissingActiveAuthSession;",
        "Lcom/stripe/android/financialconnections/domain/GetOrFetchSync$RefetchCondition$None;",
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


# virtual methods
.method public abstract shouldReFetch(Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;)Z
.end method
