.class public final Lcom/nimbusds/jose/shaded/gson/internal/sql/SqlTypesSupport;
.super Ljava/lang/Object;
.source "SqlTypesSupport.java"


# static fields
.field public static final DATE_DATE_TYPE:Lcom/nimbusds/jose/shaded/gson/internal/bind/DefaultDateTypeAdapter$DateType;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/nimbusds/jose/shaded/gson/internal/bind/DefaultDateTypeAdapter$DateType<",
            "+",
            "Ljava/util/Date;",
            ">;"
        }
    .end annotation
.end field

.field public static final DATE_FACTORY:Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;

.field public static final SUPPORTS_SQL_TYPES:Z

.field public static final TIMESTAMP_DATE_TYPE:Lcom/nimbusds/jose/shaded/gson/internal/bind/DefaultDateTypeAdapter$DateType;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/nimbusds/jose/shaded/gson/internal/bind/DefaultDateTypeAdapter$DateType<",
            "+",
            "Ljava/util/Date;",
            ">;"
        }
    .end annotation
.end field

.field public static final TIMESTAMP_FACTORY:Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;

.field public static final TIME_FACTORY:Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 48
    :try_start_0
    const-string v0, "java.sql.Date"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    .line 53
    :goto_0
    sput-boolean v0, Lcom/nimbusds/jose/shaded/gson/internal/sql/SqlTypesSupport;->SUPPORTS_SQL_TYPES:Z

    if-eqz v0, :cond_0

    .line 56
    new-instance v0, Lcom/nimbusds/jose/shaded/gson/internal/sql/SqlTypesSupport$1;

    const-class v1, Ljava/sql/Date;

    invoke-direct {v0, v1}, Lcom/nimbusds/jose/shaded/gson/internal/sql/SqlTypesSupport$1;-><init>(Ljava/lang/Class;)V

    sput-object v0, Lcom/nimbusds/jose/shaded/gson/internal/sql/SqlTypesSupport;->DATE_DATE_TYPE:Lcom/nimbusds/jose/shaded/gson/internal/bind/DefaultDateTypeAdapter$DateType;

    .line 63
    new-instance v0, Lcom/nimbusds/jose/shaded/gson/internal/sql/SqlTypesSupport$2;

    const-class v1, Ljava/sql/Timestamp;

    invoke-direct {v0, v1}, Lcom/nimbusds/jose/shaded/gson/internal/sql/SqlTypesSupport$2;-><init>(Ljava/lang/Class;)V

    sput-object v0, Lcom/nimbusds/jose/shaded/gson/internal/sql/SqlTypesSupport;->TIMESTAMP_DATE_TYPE:Lcom/nimbusds/jose/shaded/gson/internal/bind/DefaultDateTypeAdapter$DateType;

    .line 71
    sget-object v0, Lcom/nimbusds/jose/shaded/gson/internal/sql/SqlDateTypeAdapter;->FACTORY:Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;

    sput-object v0, Lcom/nimbusds/jose/shaded/gson/internal/sql/SqlTypesSupport;->DATE_FACTORY:Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;

    .line 72
    sget-object v0, Lcom/nimbusds/jose/shaded/gson/internal/sql/SqlTimeTypeAdapter;->FACTORY:Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;

    sput-object v0, Lcom/nimbusds/jose/shaded/gson/internal/sql/SqlTypesSupport;->TIME_FACTORY:Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;

    .line 73
    sget-object v0, Lcom/nimbusds/jose/shaded/gson/internal/sql/SqlTimestampTypeAdapter;->FACTORY:Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;

    sput-object v0, Lcom/nimbusds/jose/shaded/gson/internal/sql/SqlTypesSupport;->TIMESTAMP_FACTORY:Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    .line 75
    sput-object v0, Lcom/nimbusds/jose/shaded/gson/internal/sql/SqlTypesSupport;->DATE_DATE_TYPE:Lcom/nimbusds/jose/shaded/gson/internal/bind/DefaultDateTypeAdapter$DateType;

    .line 76
    sput-object v0, Lcom/nimbusds/jose/shaded/gson/internal/sql/SqlTypesSupport;->TIMESTAMP_DATE_TYPE:Lcom/nimbusds/jose/shaded/gson/internal/bind/DefaultDateTypeAdapter$DateType;

    .line 78
    sput-object v0, Lcom/nimbusds/jose/shaded/gson/internal/sql/SqlTypesSupport;->DATE_FACTORY:Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;

    .line 79
    sput-object v0, Lcom/nimbusds/jose/shaded/gson/internal/sql/SqlTypesSupport;->TIME_FACTORY:Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;

    .line 80
    sput-object v0, Lcom/nimbusds/jose/shaded/gson/internal/sql/SqlTypesSupport;->TIMESTAMP_FACTORY:Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;

    :goto_1
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 84
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
