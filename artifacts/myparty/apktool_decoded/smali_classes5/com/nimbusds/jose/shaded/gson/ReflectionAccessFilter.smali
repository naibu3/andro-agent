.class public interface abstract Lcom/nimbusds/jose/shaded/gson/ReflectionAccessFilter;
.super Ljava/lang/Object;
.source "ReflectionAccessFilter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nimbusds/jose/shaded/gson/ReflectionAccessFilter$FilterResult;
    }
.end annotation


# static fields
.field public static final BLOCK_ALL_ANDROID:Lcom/nimbusds/jose/shaded/gson/ReflectionAccessFilter;

.field public static final BLOCK_ALL_JAVA:Lcom/nimbusds/jose/shaded/gson/ReflectionAccessFilter;

.field public static final BLOCK_ALL_PLATFORM:Lcom/nimbusds/jose/shaded/gson/ReflectionAccessFilter;

.field public static final BLOCK_INACCESSIBLE_JAVA:Lcom/nimbusds/jose/shaded/gson/ReflectionAccessFilter;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 112
    new-instance v0, Lcom/nimbusds/jose/shaded/gson/ReflectionAccessFilter$1;

    invoke-direct {v0}, Lcom/nimbusds/jose/shaded/gson/ReflectionAccessFilter$1;-><init>()V

    sput-object v0, Lcom/nimbusds/jose/shaded/gson/ReflectionAccessFilter;->BLOCK_INACCESSIBLE_JAVA:Lcom/nimbusds/jose/shaded/gson/ReflectionAccessFilter;

    .line 143
    new-instance v0, Lcom/nimbusds/jose/shaded/gson/ReflectionAccessFilter$2;

    invoke-direct {v0}, Lcom/nimbusds/jose/shaded/gson/ReflectionAccessFilter$2;-><init>()V

    sput-object v0, Lcom/nimbusds/jose/shaded/gson/ReflectionAccessFilter;->BLOCK_ALL_JAVA:Lcom/nimbusds/jose/shaded/gson/ReflectionAccessFilter;

    .line 174
    new-instance v0, Lcom/nimbusds/jose/shaded/gson/ReflectionAccessFilter$3;

    invoke-direct {v0}, Lcom/nimbusds/jose/shaded/gson/ReflectionAccessFilter$3;-><init>()V

    sput-object v0, Lcom/nimbusds/jose/shaded/gson/ReflectionAccessFilter;->BLOCK_ALL_ANDROID:Lcom/nimbusds/jose/shaded/gson/ReflectionAccessFilter;

    .line 206
    new-instance v0, Lcom/nimbusds/jose/shaded/gson/ReflectionAccessFilter$4;

    invoke-direct {v0}, Lcom/nimbusds/jose/shaded/gson/ReflectionAccessFilter$4;-><init>()V

    sput-object v0, Lcom/nimbusds/jose/shaded/gson/ReflectionAccessFilter;->BLOCK_ALL_PLATFORM:Lcom/nimbusds/jose/shaded/gson/ReflectionAccessFilter;

    return-void
.end method


# virtual methods
.method public abstract check(Ljava/lang/Class;)Lcom/nimbusds/jose/shaded/gson/ReflectionAccessFilter$FilterResult;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lcom/nimbusds/jose/shaded/gson/ReflectionAccessFilter$FilterResult;"
        }
    .end annotation
.end method
