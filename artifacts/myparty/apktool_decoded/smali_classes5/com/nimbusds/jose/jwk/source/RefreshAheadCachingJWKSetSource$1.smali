.class Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource$1;
.super Ljava/lang/Object;
.source "RefreshAheadCachingJWKSetSource.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;->scheduleRefreshAheadOfExpiration(Lcom/nimbusds/jose/util/cache/CachedObject;JLcom/nimbusds/jose/proc/SecurityContext;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;

.field final synthetic val$cache:Lcom/nimbusds/jose/util/cache/CachedObject;

.field final synthetic val$context:Lcom/nimbusds/jose/proc/SecurityContext;

.field final synthetic val$that:Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;


# direct methods
.method constructor <init>(Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;Lcom/nimbusds/jose/util/cache/CachedObject;Lcom/nimbusds/jose/proc/SecurityContext;Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 300
    iput-object p1, p0, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource$1;->this$0:Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;

    iput-object p2, p0, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource$1;->val$cache:Lcom/nimbusds/jose/util/cache/CachedObject;

    iput-object p3, p0, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource$1;->val$context:Lcom/nimbusds/jose/proc/SecurityContext;

    iput-object p4, p0, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource$1;->val$that:Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 306
    :try_start_0
    iget-object v0, p0, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource$1;->this$0:Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;

    iget-object v1, p0, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource$1;->val$cache:Lcom/nimbusds/jose/util/cache/CachedObject;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iget-object v5, p0, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource$1;->val$context:Lcom/nimbusds/jose/proc/SecurityContext;

    const/4 v2, 0x1

    invoke-virtual/range {v0 .. v5}, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;->refreshAheadOfExpiration(Lcom/nimbusds/jose/util/cache/CachedObject;ZJLcom/nimbusds/jose/proc/SecurityContext;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 308
    iget-object v1, p0, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource$1;->this$0:Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;

    invoke-static {v1}, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;->access$000(Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;)Lcom/nimbusds/jose/util/events/EventListener;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 309
    iget-object v1, p0, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource$1;->this$0:Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;

    invoke-static {v1}, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;->access$000(Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;)Lcom/nimbusds/jose/util/events/EventListener;

    move-result-object v1

    new-instance v2, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource$ScheduledRefreshFailed;

    iget-object v3, p0, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource$1;->val$that:Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource;

    iget-object v4, p0, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource$1;->val$context:Lcom/nimbusds/jose/proc/SecurityContext;

    invoke-direct {v2, v3, v0, v4}, Lcom/nimbusds/jose/jwk/source/RefreshAheadCachingJWKSetSource$ScheduledRefreshFailed;-><init>(Lcom/nimbusds/jose/jwk/source/CachingJWKSetSource;Ljava/lang/Exception;Lcom/nimbusds/jose/proc/SecurityContext;)V

    invoke-interface {v1, v2}, Lcom/nimbusds/jose/util/events/EventListener;->notify(Lcom/nimbusds/jose/util/events/Event;)V

    :cond_0
    return-void
.end method
