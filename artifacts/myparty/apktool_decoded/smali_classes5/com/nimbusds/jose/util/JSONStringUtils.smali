.class public Lcom/nimbusds/jose/util/JSONStringUtils;
.super Ljava/lang/Object;
.source "JSONStringUtils.java"


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static toJSONString(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 41
    new-instance v0, Lcom/nimbusds/jose/shaded/gson/Gson;

    invoke-direct {v0}, Lcom/nimbusds/jose/shaded/gson/Gson;-><init>()V

    invoke-virtual {v0, p0}, Lcom/nimbusds/jose/shaded/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
