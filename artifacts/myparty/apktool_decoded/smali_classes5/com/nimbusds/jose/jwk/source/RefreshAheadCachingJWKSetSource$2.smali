.class Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource$2;
.super Ljava/lang/Object;
.source "RefreshAheadCachingJWKSetSource.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;->lockedRefresh(Lcom/nimbusds/jose/util/cache/CachedObject;JLcom/nimbusds/jose/proc/SecurityContext;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;

.field final synthetic val$context:Lcom/nimbusds/jose/proc/SecurityContext;

.field final synthetic val$currentTime:J

.field final synthetic val$that:Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;


# direct methods
.method constructor <init>(Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;Lcom/nimbusds/jose/proc/SecurityContext;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 374
    iput-object p1, p0, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource$2;->this$0:Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;

    iput-object p2, p0, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource$2;->val$that:Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;

    iput-object p3, p0, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource$2;->val$context:Lcom/nimbusds/jose/proc/SecurityContext;

    iput-wide p4, p0, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource$2;->val$currentTime:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 379
    :try_start_0
    iget-object v0, p0, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource$2;->this$0:Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;

    invoke-static {v0}, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;->access$000(Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;)Lcom/nimbusds/jose/util/events/EventListener;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 380
    iget-object v0, p0, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource$2;->this$0:Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;

    invoke-static {v0}, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;->access$000(Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;)Lcom/nimbusds/jose/util/events/EventListener;

    move-result-object v0

    new-instance v2, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource$ScheduledRefreshInitiatedEvent;

    iget-object v3, p0, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource$2;->val$that:Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;

    iget-object v4, p0, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource$2;->val$context:Lcom/nimbusds/jose/proc/SecurityContext;

    invoke-direct {v2, v3, v4, v1}, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource$ScheduledRefreshInitiatedEvent;-><init>(Lcom/nimbusds/jose/jwk/source/CachingJWKSetSource;Lcom/nimbusds/jose/proc/SecurityContext;Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource$1;)V

    invoke-interface {v0, v2}, Lcom/nimbusds/jose/util/events/EventListener;->notify(Lcom/nimbusds/jose/util/events/Event;)V

    .line 383
    :cond_0
    iget-object v0, p0, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource$2;->this$0:Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;

    invoke-static {}, Lcom/nimbusds/jose/jwk/source/JWKSetCacheRefreshEvaluator;->forceRefresh()Lcom/nimbusds/jose/jwk/source/JWKSetCacheRefreshEvaluator;

    move-result-object v2

    iget-wide v3, p0, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource$2;->val$currentTime:J

    iget-object v5, p0, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource$2;->val$context:Lcom/nimbusds/jose/proc/SecurityContext;

    invoke-virtual {v0, v2, v3, v4, v5}, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;->loadJWKSetBlocking(Lcom/nimbusds/jose/jwk/source/JWKSetCacheRefreshEvaluator;JLcom/nimbusds/jose/proc/SecurityContext;)Lcom/nimbusds/jose/jwk/JWKSet;

    move-result-object v0

    .line 385
    iget-object v2, p0, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource$2;->this$0:Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;

    invoke-static {v2}, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;->access$000(Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;)Lcom/nimbusds/jose/util/events/EventListener;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 386
    iget-object v2, p0, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource$2;->this$0:Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;

    invoke-static {v2}, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;->access$000(Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;)Lcom/nimbusds/jose/util/events/EventListener;

    move-result-object v2

    new-instance v3, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource$ScheduledRefreshCompletedEvent;

    iget-object v4, p0, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource$2;->val$that:Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;

    iget-object v5, p0, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource$2;->val$context:Lcom/nimbusds/jose/proc/SecurityContext;

    invoke-direct {v3, v4, v0, v5, v1}, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource$ScheduledRefreshCompletedEvent;-><init>(Lcom/nimbusds/jose/jwk/source/CachingJWKSetSource;Lcom/nimbusds/jose/jwk/JWKSet;Lcom/nimbusds/jose/proc/SecurityContext;Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource$1;)V

    invoke-interface {v2, v3}, Lcom/nimbusds/jose/util/events/EventListener;->notify(Lcom/nimbusds/jose/util/events/Event;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    .line 392
    :catchall_0
    iget-object v0, p0, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource$2;->this$0:Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;

    const-wide/16 v1, -0x1

    invoke-static {v0, v1, v2}, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;->access$302(Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;J)J

    .line 395
    iget-object v0, p0, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource$2;->this$0:Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;

    invoke-static {v0}, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;->access$000(Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;)Lcom/nimbusds/jose/util/events/EventListener;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 396
    iget-object v0, p0, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource$2;->this$0:Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;

    invoke-static {v0}, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;->access$000(Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;)Lcom/nimbusds/jose/util/events/EventListener;

    move-result-object v0

    new-instance v1, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource$UnableToRefreshAheadOfExpirationEvent;

    iget-object v2, p0, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource$2;->val$that:Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;

    iget-object v3, p0, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource$2;->val$context:Lcom/nimbusds/jose/proc/SecurityContext;

    invoke-direct {v1, v2, v3}, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource$UnableToRefreshAheadOfExpirationEvent;-><init>(Lcom/nimbusds/jose/jwk/source/CachingJWKSetSource;Lcom/nimbusds/jose/proc/SecurityContext;)V

    invoke-interface {v0, v1}, Lcom/nimbusds/jose/util/events/EventListener;->notify(Lcom/nimbusds/jose/util/events/Event;)V

    :cond_1
    return-void
.end method
